package jadx.core.dex.visitors.regions;

import jadx.core.dex.attributes.AFlag;
import jadx.core.dex.attributes.AType;
import jadx.core.dex.attributes.nodes.EdgeInsnAttr;
import jadx.core.dex.attributes.nodes.LoopInfo;
import jadx.core.dex.attributes.nodes.LoopLabelAttr;
import jadx.core.dex.instructions.IfNode;
import jadx.core.dex.instructions.InsnType;
import jadx.core.dex.instructions.SwitchNode;
import jadx.core.dex.instructions.args.InsnArg;
import jadx.core.dex.nodes.BlockNode;
import jadx.core.dex.nodes.Edge;
import jadx.core.dex.nodes.IBlock;
import jadx.core.dex.nodes.IContainer;
import jadx.core.dex.nodes.IRegion;
import jadx.core.dex.nodes.InsnNode;
import jadx.core.dex.nodes.MethodNode;
import jadx.core.dex.regions.Region;
import jadx.core.dex.regions.SwitchRegion;
import jadx.core.dex.regions.SynchronizedRegion;
import jadx.core.dex.regions.conditions.IfInfo;
import jadx.core.dex.regions.conditions.IfRegion;
import jadx.core.dex.regions.loops.LoopRegion;
import jadx.core.dex.trycatch.ExcHandlerAttr;
import jadx.core.dex.trycatch.ExceptionHandler;
import jadx.core.dex.trycatch.SplitterBlockAttr;
import jadx.core.dex.trycatch.TryCatchBlock;
import jadx.core.utils.BlockUtils;
import jadx.core.utils.ErrorsCounter;
import jadx.core.utils.InstructionRemover;
import jadx.core.utils.RegionUtils;
import jadx.core.utils.exceptions.JadxOverflowException;
import jadx.core.utils.exceptions.JadxRuntimeException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class RegionMaker {
    private static final int REGIONS_LIMIT = 1000000;
    private final MethodNode mth;
    private BitSet processedBlocks;
    private int regionsCount;

    public RegionMaker(MethodNode methodNode) {
        this.mth = methodNode;
    }

    private void addBreakLabel(Edge edge, BlockNode blockNode, InsnNode insnNode) {
        LoopInfo loopInfo;
        BlockNode nextBlock = BlockUtils.getNextBlock(edge.getTarget());
        if (nextBlock != null && this.mth.getAllLoopsForBlock(nextBlock).isEmpty()) {
            List allLoopsForBlock = this.mth.getAllLoopsForBlock(edge.getSource());
            if (allLoopsForBlock.size() >= 2) {
                Iterator it = allLoopsForBlock.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        loopInfo = null;
                        break;
                    } else {
                        loopInfo = (LoopInfo) it.next();
                        if (loopInfo.getParentLoop() == null) {
                            break;
                        }
                    }
                }
                if (loopInfo == null || loopInfo.getEnd() == blockNode || loopInfo.getExitNodes().contains(blockNode)) {
                    return;
                }
                LoopLabelAttr loopLabelAttr = new LoopLabelAttr(loopInfo);
                insnNode.addAttr(loopLabelAttr);
                loopInfo.getStart().addAttr(loopLabelAttr);
            }
        }
    }

    private void addEdgeInsn(IfInfo ifInfo, Region region, EdgeInsnAttr edgeInsnAttr) {
        boolean z;
        BlockNode start = edgeInsnAttr.getStart();
        if (start.contains(AFlag.SKIP)) {
            return;
        }
        Iterator it = ifInfo.getMergedBlocks().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            } else if (((BlockNode) it.next()).getSuccessors().contains(start)) {
                z = true;
                break;
            }
        }
        if (z) {
            region.add(start);
        }
    }

    private boolean canInsertBreak(BlockNode blockNode) {
        if (blockNode.contains(AFlag.RETURN) || BlockUtils.checkLastInsnType(blockNode, InsnType.BREAK)) {
            return false;
        }
        List listBuildSimplePath = BlockUtils.buildSimplePath(blockNode);
        if (!listBuildSimplePath.isEmpty()) {
            BlockNode blockNode2 = (BlockNode) listBuildSimplePath.get(listBuildSimplePath.size() - 1);
            if (blockNode2.contains(AFlag.RETURN) || blockNode2.getSuccessors().isEmpty()) {
                return false;
            }
        }
        Iterator it = BlockUtils.getAllPathsBlocks(this.mth.getEnterBlock(), blockNode).iterator();
        while (it.hasNext()) {
            if (BlockUtils.checkLastInsnType((BlockNode) it.next(), InsnType.SWITCH)) {
                return false;
            }
        }
        return true;
    }

    private static boolean canInsertContinue(BlockNode blockNode, List list, BlockNode blockNode2, Set set) {
        boolean z;
        if (!blockNode.contains(AFlag.SYNTHETIC) || BlockUtils.checkLastInsnType(blockNode, InsnType.CONTINUE)) {
            return false;
        }
        List predecessors = blockNode.getPredecessors();
        if (predecessors.isEmpty()) {
            return false;
        }
        BlockNode blockNode3 = (BlockNode) predecessors.get(0);
        if (blockNode3.contains(AFlag.SKIP) || blockNode2.isDominator(blockNode3) || set.contains(blockNode3) || isDominatedOnBlocks(blockNode3, list)) {
            return false;
        }
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            if (BlockUtils.isPathExists(blockNode3, (BlockNode) it.next())) {
                z = true;
                break;
            }
        }
        return z;
    }

    private boolean inExceptionHandlerBlocks(BlockNode blockNode) {
        if (this.mth.getExceptionHandlersCount() == 0) {
            return false;
        }
        Iterator it = this.mth.getExceptionHandlers().iterator();
        while (it.hasNext()) {
            if (((ExceptionHandler) it.next()).getBlocks().contains(blockNode)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean insertBreak(RegionStack regionStack, BlockNode blockNode, Edge edge) {
        boolean z;
        BlockNode source;
        BlockNode blockNode2;
        boolean z2;
        BlockNode blockNode3;
        BlockNode blockNodeSelectOther;
        BlockNode target = edge.getTarget();
        if (blockNode == target) {
            source = edge.getSource();
            if (source.contains(AType.CATCH_BLOCK) && source.getSuccessors().size() == 2 && (blockNodeSelectOther = BlockUtils.selectOther(blockNode, source.getSuccessors())) != null && BlockUtils.skipSyntheticSuccessor(blockNodeSelectOther).contains(AType.EXC_HANDLER)) {
                z = true;
            } else {
                z = false;
                source = null;
            }
        }
        if (z) {
            blockNode2 = source;
            z2 = z;
            blockNode3 = target;
        } else {
            while (target != null) {
                if (source == null || !BlockUtils.isPathExists(blockNode, target)) {
                    List cleanSuccessors = target.getCleanSuccessors();
                    BlockNode blockNode4 = target;
                    target = cleanSuccessors.size() == 1 ? (BlockNode) cleanSuccessors.get(0) : null;
                    source = blockNode4;
                } else {
                    if (!canInsertBreak(source)) {
                        return false;
                    }
                    blockNode2 = source;
                    blockNode3 = target;
                    z2 = true;
                }
            }
            blockNode2 = source;
            z2 = z;
            blockNode3 = target;
        }
        if (!z2) {
            return false;
        }
        InsnNode insnNode = new InsnNode(InsnType.BREAK, 0);
        EdgeInsnAttr.addEdgeInsn(blockNode2, (BlockNode) blockNode2.getSuccessors().get(0), insnNode);
        regionStack.addExit(blockNode3);
        addBreakLabel(edge, blockNode3, insnNode);
        return true;
    }

    private static void insertContinue(LoopInfo loopInfo) {
        BlockNode end = loopInfo.getEnd();
        List<BlockNode> predecessors = end.getPredecessors();
        if (predecessors.size() <= 1) {
            return;
        }
        Set exitNodes = loopInfo.getExitNodes();
        for (BlockNode blockNode : predecessors) {
            if (canInsertContinue(blockNode, predecessors, end, exitNodes)) {
                blockNode.getInstructions().add(new InsnNode(InsnType.CONTINUE, 0));
            }
        }
    }

    private static void insertContinueInSwitch(BlockNode blockNode, BlockNode blockNode2, BlockNode blockNode3) {
        int id = blockNode3.getId();
        for (BlockNode blockNode4 : blockNode.getCleanSuccessors()) {
            if (blockNode4.getDomFrontier().get(id) && blockNode4 != blockNode2) {
                List listCollectBlocksDominatedBy = BlockUtils.collectBlocksDominatedBy(blockNode4, blockNode4);
                Iterator it = blockNode3.getPredecessors().iterator();
                while (true) {
                    if (it.hasNext()) {
                        BlockNode blockNode5 = (BlockNode) it.next();
                        if (listCollectBlocksDominatedBy.contains(blockNode5)) {
                            if (blockNode5.isSynthetic()) {
                                blockNode5.getInstructions().add(new InsnNode(InsnType.CONTINUE, 0));
                            }
                        }
                    }
                }
            }
        }
    }

    private boolean isBadCasesOrder(Map map, Map map2) {
        BlockNode blockNode = null;
        Iterator it = map.keySet().iterator();
        while (true) {
            BlockNode blockNode2 = blockNode;
            if (!it.hasNext()) {
                return blockNode2 != null;
            }
            BlockNode blockNode3 = (BlockNode) it.next();
            if (blockNode2 != null && !blockNode3.equals(blockNode2)) {
                return true;
            }
            blockNode = (BlockNode) map2.get(blockNode3);
        }
    }

    private static boolean isDominatedOnBlocks(BlockNode blockNode, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((BlockNode) it.next()).isDominator(blockNode)) {
                return false;
            }
        }
        return true;
    }

    static boolean isEqualPaths(BlockNode blockNode, BlockNode blockNode2) {
        if (blockNode == blockNode2) {
            return true;
        }
        if (blockNode == null || blockNode2 == null) {
            return false;
        }
        return isEqualReturnBlocks(blockNode, blockNode2) || isSyntheticPath(blockNode, blockNode2);
    }

    public static boolean isEqualReturnBlocks(BlockNode blockNode, BlockNode blockNode2) {
        if (!blockNode.isReturnBlock() || !blockNode2.isReturnBlock()) {
            return false;
        }
        List instructions = blockNode.getInstructions();
        List instructions2 = blockNode2.getInstructions();
        if (instructions.size() != 1 || instructions2.size() != 1) {
            return false;
        }
        InsnNode insnNode = (InsnNode) instructions.get(0);
        InsnNode insnNode2 = (InsnNode) instructions2.get(0);
        if (insnNode.getArgsCount() != insnNode2.getArgsCount()) {
            return false;
        }
        return insnNode.getArgsCount() == 0 || insnNode.getArg(0).equals(insnNode2.getArg(0));
    }

    private static boolean isSyntheticPath(BlockNode blockNode, BlockNode blockNode2) {
        BlockNode blockNodeSkipSyntheticSuccessor = BlockUtils.skipSyntheticSuccessor(blockNode);
        BlockNode blockNodeSkipSyntheticSuccessor2 = BlockUtils.skipSyntheticSuccessor(blockNode2);
        return !(blockNodeSkipSyntheticSuccessor == blockNode && blockNodeSkipSyntheticSuccessor2 == blockNode2) && isEqualPaths(blockNodeSkipSyntheticSuccessor, blockNodeSkipSyntheticSuccessor2);
    }

    private BlockNode makeEndlessLoop(IRegion iRegion, RegionStack regionStack, LoopInfo loopInfo, BlockNode blockNode) {
        BlockNode nextBlock;
        BlockNode blockNode2 = null;
        LoopRegion loopRegion = new LoopRegion(iRegion, loopInfo, null, false);
        iRegion.getSubBlocks().add(loopRegion);
        blockNode.remove(AType.LOOP);
        regionStack.push(loopRegion);
        BlockNode blockNode3 = null;
        for (Edge edge : loopInfo.getExitEdges()) {
            BlockNode target = edge.getTarget();
            if (!insertBreak(regionStack, target, edge) || (nextBlock = BlockUtils.getNextBlock(target)) == null) {
                nextBlock = blockNode3;
            } else {
                regionStack.addExit(nextBlock);
            }
            blockNode3 = nextBlock;
        }
        Region regionMakeRegion = makeRegion(blockNode, regionStack);
        BlockNode end = loopInfo.getEnd();
        if (!RegionUtils.isRegionContainsBlock(regionMakeRegion, end) && !end.contains(AType.EXC_HANDLER) && !inExceptionHandlerBlocks(end)) {
            regionMakeRegion.getSubBlocks().add(end);
        }
        loopRegion.setBody(regionMakeRegion);
        if (blockNode3 == null) {
            BlockNode nextBlock2 = BlockUtils.getNextBlock(end);
            if (!RegionUtils.isRegionContainsBlock(regionMakeRegion, nextBlock2)) {
                blockNode2 = nextBlock2;
            }
        } else {
            blockNode2 = blockNode3;
        }
        regionStack.pop();
        blockNode.addAttr(AType.LOOP, loopInfo);
        return blockNode2;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0006 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private LoopRegion makeLoopRegion(IRegion iRegion, LoopInfo loopInfo, List list) {
        boolean zCheckPreCondition;
        boolean z;
        boolean z2;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BlockNode blockNode = (BlockNode) it.next();
            if (!blockNode.contains(AType.EXC_HANDLER) && blockNode.getInstructions().size() == 1 && ((InsnNode) blockNode.getInstructions().get(0)).getType() == InsnType.IF) {
                List all = blockNode.getAll(AType.LOOP);
                if (all.isEmpty() || all.get(0) == loopInfo) {
                    LoopRegion loopRegion = new LoopRegion(iRegion, loopInfo, blockNode, blockNode == loopInfo.getEnd());
                    if (blockNode == loopInfo.getStart() || blockNode == loopInfo.getEnd() || BlockUtils.isEmptySimplePath(loopInfo.getStart(), blockNode)) {
                        zCheckPreCondition = true;
                    } else if (blockNode.getPredecessors().contains(loopInfo.getStart())) {
                        loopRegion.setPreCondition(loopInfo.getStart());
                        zCheckPreCondition = loopRegion.checkPreCondition();
                    } else {
                        zCheckPreCondition = false;
                    }
                    if (!zCheckPreCondition || this.mth.getAllLoopsForBlock(blockNode).size() < 2) {
                        z = zCheckPreCondition;
                        if (!z) {
                            return loopRegion;
                        }
                    } else {
                        Iterator it2 = blockNode.getCleanSuccessors().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z2 = true;
                                break;
                            }
                            List allLoopsForBlock = this.mth.getAllLoopsForBlock((BlockNode) it2.next());
                            allLoopsForBlock.remove(loopInfo);
                            if (!allLoopsForBlock.isEmpty()) {
                                z2 = false;
                                break;
                            }
                        }
                        if (z2) {
                            z = false;
                        }
                        if (!z) {
                        }
                    }
                }
            }
        }
        return null;
    }

    private void processExcHandler(ExceptionHandler exceptionHandler, Set set) {
        BlockNode block;
        BlockNode handlerBlock = exceptionHandler.getHandlerBlock();
        if (handlerBlock == null) {
            return;
        }
        RegionStack regionStack = new RegionStack(this.mth);
        if (exceptionHandler.isFinally()) {
            SplitterBlockAttr splitterBlockAttr = (SplitterBlockAttr) handlerBlock.get(AType.SPLITTER_BLOCK);
            if (splitterBlockAttr == null) {
                return;
            } else {
                block = splitterBlockAttr.getBlock();
            }
        } else {
            regionStack.addExits(set);
            block = handlerBlock;
        }
        List<BlockNode> listBitSetToBlocks = BlockUtils.bitSetToBlocks(this.mth, block.getDomFrontier());
        boolean z = this.mth.getLoopForBlock(handlerBlock) != null;
        for (BlockNode blockNode : listBitSetToBlocks) {
            if (!z || BlockUtils.isPathExists(handlerBlock, blockNode)) {
                if (RegionUtils.isRegionContainsBlock(this.mth.getRegion(), blockNode)) {
                    regionStack.addExit(blockNode);
                }
            }
        }
        exceptionHandler.setHandlerRegion(makeRegion(handlerBlock, regionStack));
        ExcHandlerAttr excHandlerAttr = (ExcHandlerAttr) handlerBlock.get(AType.EXC_HANDLER);
        if (excHandlerAttr != null) {
            exceptionHandler.getHandlerRegion().addAttr(excHandlerAttr);
        }
    }

    private BlockNode processIf(IRegion iRegion, BlockNode blockNode, IfNode ifNode, RegionStack regionStack) {
        if (blockNode.contains(AFlag.SKIP)) {
            return ifNode.getThenBlock();
        }
        IfInfo ifInfoMakeIfInfo = IfMakerHelper.makeIfInfo(blockNode);
        IfInfo ifInfoMergeNestedIfNodes = IfMakerHelper.mergeNestedIfNodes(ifInfoMakeIfInfo);
        if (ifInfoMergeNestedIfNodes == null) {
            ifInfoMergeNestedIfNodes = IfInfo.invert(ifInfoMakeIfInfo);
        }
        IfInfo ifInfoRestructureIf = IfMakerHelper.restructureIf(this.mth, blockNode, ifInfoMergeNestedIfNodes);
        if (ifInfoRestructureIf == null) {
            if (ifInfoMergeNestedIfNodes.getMergedBlocks().size() <= 1) {
                return null;
            }
            IfInfo ifInfoRestructureIf2 = IfMakerHelper.restructureIf(this.mth, blockNode, IfMakerHelper.makeIfInfo(blockNode));
            if (ifInfoRestructureIf2 == null) {
                return null;
            }
            ifInfoRestructureIf = ifInfoRestructureIf2;
        }
        IfMakerHelper.confirmMerge(ifInfoRestructureIf);
        IfRegion ifRegion = new IfRegion(iRegion, blockNode);
        ifRegion.setCondition(ifInfoRestructureIf.getCondition());
        iRegion.getSubBlocks().add(ifRegion);
        BlockNode outBlock = ifInfoRestructureIf.getOutBlock();
        regionStack.push(ifRegion);
        regionStack.addExit(outBlock);
        ifRegion.setThenRegion(makeRegion(ifInfoRestructureIf.getThenBlock(), regionStack));
        BlockNode elseBlock = ifInfoRestructureIf.getElseBlock();
        if (elseBlock == null || regionStack.containsExit(elseBlock)) {
            ifRegion.setElseRegion(null);
        } else {
            ifRegion.setElseRegion(makeRegion(elseBlock, regionStack));
        }
        if (ifRegion.getElseRegion() == null && outBlock != null) {
            List<EdgeInsnAttr> all = outBlock.getAll(AType.EDGE_INSN);
            if (!all.isEmpty()) {
                Region region = new Region(ifRegion);
                for (EdgeInsnAttr edgeInsnAttr : all) {
                    if (edgeInsnAttr.getEnd().equals(outBlock)) {
                        addEdgeInsn(ifInfoRestructureIf, region, edgeInsnAttr);
                    }
                }
                ifRegion.setElseRegion(region);
            }
        }
        regionStack.pop();
        return outBlock;
    }

    private BlockNode processLoop(IRegion iRegion, LoopInfo loopInfo, RegionStack regionStack) {
        BlockNode thenBlock;
        BlockNode elseBlock;
        BlockNode start = loopInfo.getStart();
        Set exitNodes = loopInfo.getExitNodes();
        ArrayList arrayList = new ArrayList(exitNodes.size());
        BlockNode nextBlock = BlockUtils.getNextBlock(start);
        if (nextBlock != null && exitNodes.remove(nextBlock)) {
            arrayList.add(nextBlock);
        }
        if (exitNodes.remove(start)) {
            arrayList.add(start);
        }
        if (exitNodes.remove(loopInfo.getEnd())) {
            arrayList.add(loopInfo.getEnd());
        }
        arrayList.addAll(exitNodes);
        LoopRegion loopRegionMakeLoopRegion = makeLoopRegion(iRegion, loopInfo, arrayList);
        if (loopRegionMakeLoopRegion == null) {
            BlockNode blockNodeMakeEndlessLoop = makeEndlessLoop(iRegion, regionStack, loopInfo, start);
            insertContinue(loopInfo);
            return blockNodeMakeEndlessLoop;
        }
        iRegion.getSubBlocks().add(loopRegionMakeLoopRegion);
        IRegion iRegionPeekRegion = regionStack.peekRegion();
        regionStack.push(loopRegionMakeLoopRegion);
        IfInfo ifInfoSearchNestedIf = IfMakerHelper.searchNestedIf(IfMakerHelper.makeIfInfo(loopRegionMakeLoopRegion.getHeader()));
        IfMakerHelper.confirmMerge(ifInfoSearchNestedIf);
        IfInfo ifInfoInvert = !loopInfo.getLoopBlocks().contains(ifInfoSearchNestedIf.getThenBlock()) ? IfInfo.invert(ifInfoSearchNestedIf) : ifInfoSearchNestedIf;
        loopRegionMakeLoopRegion.setCondition(ifInfoInvert.getCondition());
        arrayList.removeAll(ifInfoInvert.getMergedBlocks());
        if (!arrayList.isEmpty() && (elseBlock = ifInfoInvert.getElseBlock()) != null) {
            for (Edge edge : loopInfo.getExitEdges()) {
                if (arrayList.contains(edge.getSource())) {
                    insertBreak(regionStack, elseBlock, edge);
                }
            }
        }
        if (loopRegionMakeLoopRegion.isConditionAtEnd()) {
            thenBlock = ifInfoInvert.getThenBlock();
            if (thenBlock == start) {
                thenBlock = ifInfoInvert.getElseBlock();
            }
            start.remove(AType.LOOP);
            loopInfo.getEnd().add(AFlag.SKIP);
            regionStack.addExit(loopInfo.getEnd());
            loopRegionMakeLoopRegion.setBody(makeRegion(start, regionStack));
            start.addAttr(AType.LOOP, loopInfo);
            loopInfo.getEnd().remove(AFlag.SKIP);
        } else {
            BlockNode elseBlock2 = ifInfoInvert.getElseBlock();
            BlockNode blockNode = (iRegionPeekRegion == null || !elseBlock2.contains(AFlag.LOOP_START) || elseBlock2.getAll(AType.LOOP).contains(loopInfo) || !RegionUtils.isRegionContainsBlock(iRegionPeekRegion, elseBlock2)) ? elseBlock2 : null;
            regionStack.addExit(blockNode);
            Region regionMakeRegion = makeRegion(ifInfoInvert.getThenBlock(), regionStack);
            BlockNode ifBlock = ifInfoInvert.getIfBlock();
            if (start != ifBlock) {
                Set<BlockNode> allPathsBlocks = BlockUtils.getAllPathsBlocks(start, ifBlock);
                allPathsBlocks.remove(ifBlock);
                for (BlockNode blockNode2 : allPathsBlocks) {
                    if (blockNode2.getInstructions().isEmpty() && !blockNode2.contains(AFlag.SKIP) && !RegionUtils.isRegionContainsBlock(regionMakeRegion, blockNode2)) {
                        regionMakeRegion.add(blockNode2);
                    }
                }
            }
            loopRegionMakeLoopRegion.setBody(regionMakeRegion);
            thenBlock = blockNode;
        }
        regionStack.pop();
        insertContinue(loopInfo);
        return thenBlock;
    }

    private BlockNode processMonitorEnter(IRegion iRegion, BlockNode blockNode, InsnNode insnNode, RegionStack regionStack) {
        BlockNode blockNodeTraverseMonitorExitsCross;
        SynchronizedRegion synchronizedRegion = new SynchronizedRegion(iRegion, insnNode);
        synchronizedRegion.getSubBlocks().add(blockNode);
        iRegion.getSubBlocks().add(synchronizedRegion);
        HashSet<BlockNode> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        traverseMonitorExits(synchronizedRegion, insnNode.getArg(0), blockNode, hashSet, hashSet2);
        for (InsnNode insnNode2 : synchronizedRegion.getExitInsns()) {
            BlockNode blockByInsn = BlockUtils.getBlockByInsn(this.mth, insnNode2);
            if (blockByInsn != null) {
                blockByInsn.add(AFlag.SKIP);
            }
            insnNode2.add(AFlag.SKIP);
            InstructionRemover.unbindInsn(this.mth, insnNode2);
        }
        BlockNode nextBlock = BlockUtils.getNextBlock(blockNode);
        if (nextBlock == null) {
            ErrorsCounter.methodError(this.mth, "Unexpected end of synchronized block");
            return null;
        }
        if (hashSet.size() == 1) {
            blockNodeTraverseMonitorExitsCross = BlockUtils.getNextBlock((BlockNode) hashSet.iterator().next());
        } else if (hashSet.size() > 1) {
            hashSet2.clear();
            blockNodeTraverseMonitorExitsCross = traverseMonitorExitsCross(nextBlock, hashSet, hashSet2);
        } else {
            blockNodeTraverseMonitorExitsCross = null;
        }
        regionStack.push(synchronizedRegion);
        if (blockNodeTraverseMonitorExitsCross != null) {
            regionStack.addExit(blockNodeTraverseMonitorExitsCross);
        } else {
            for (BlockNode blockNode2 : hashSet) {
                List listBuildSimplePath = BlockUtils.buildSimplePath(blockNode2);
                if (listBuildSimplePath.isEmpty() || !((BlockNode) listBuildSimplePath.get(listBuildSimplePath.size() - 1)).getSuccessors().isEmpty()) {
                    regionStack.addExit(blockNode2);
                }
            }
        }
        synchronizedRegion.getSubBlocks().add(makeRegion(nextBlock, regionStack));
        regionStack.pop();
        return blockNodeTraverseMonitorExitsCross;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0303  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private BlockNode processSwitch(IRegion iRegion, BlockNode blockNode, SwitchNode switchNode, RegionStack regionStack) {
        Map map;
        BlockNode blockNode2;
        BlockNode end;
        boolean z;
        BitSet bitSet;
        SwitchRegion switchRegion = new SwitchRegion(iRegion, blockNode);
        iRegion.getSubBlocks().add(switchRegion);
        int length = switchNode.getTargets().length;
        LinkedHashMap linkedHashMap = new LinkedHashMap(length);
        for (int i = 0; i < length; i++) {
            Object obj = switchNode.getKeys()[i];
            int i2 = switchNode.getTargets()[i];
            List arrayList = (List) linkedHashMap.get(Integer.valueOf(i2));
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                linkedHashMap.put(Integer.valueOf(i2), arrayList);
            }
            arrayList.add(obj);
        }
        Map linkedHashMap2 = new LinkedHashMap(length);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            BlockNode blockByOffset = BlockUtils.getBlockByOffset(((Integer) entry.getKey()).intValue(), blockNode.getSuccessors());
            if (blockByOffset == null) {
                throw new JadxRuntimeException("Switch block not found by offset: " + entry.getKey());
            }
            linkedHashMap2.put(blockByOffset, entry.getValue());
        }
        BlockNode blockByOffset2 = BlockUtils.getBlockByOffset(switchNode.getDefaultCaseOffset(), blockNode.getSuccessors());
        if (blockByOffset2 != null) {
            linkedHashMap2.remove(blockByOffset2);
        }
        LoopInfo loopForBlock = this.mth.getLoopForBlock(blockNode);
        Map linkedHashMap3 = new LinkedHashMap();
        List basicBlocks = this.mth.getBasicBlocks();
        BitSet bitSet2 = new BitSet(basicBlocks.size());
        bitSet2.or(blockNode.getDomFrontier());
        for (BlockNode blockNode3 : blockNode.getCleanSuccessors()) {
            BitSet domFrontier = blockNode3.getDomFrontier();
            if (domFrontier.cardinality() <= 1 || domFrontier.cardinality() > 2) {
                bitSet = domFrontier;
            } else {
                BlockNode blockNode4 = (BlockNode) basicBlocks.get(domFrontier.nextSetBit(0));
                BlockNode blockNode5 = (BlockNode) basicBlocks.get(domFrontier.nextSetBit(blockNode4.getId() + 1));
                if (blockNode5.getDomFrontier().get(blockNode4.getId())) {
                    linkedHashMap3.put(blockNode3, blockNode5);
                    bitSet = new BitSet(domFrontier.size());
                    bitSet.set(blockNode4.getId());
                } else if (blockNode4.getDomFrontier().get(blockNode5.getId())) {
                    linkedHashMap3.put(blockNode3, blockNode4);
                    bitSet = new BitSet(domFrontier.size());
                    bitSet.set(blockNode5.getId());
                }
            }
            bitSet2.or(bitSet);
        }
        bitSet2.clear(blockNode.getId());
        if (loopForBlock != null) {
            bitSet2.clear(loopForBlock.getStart().getId());
        }
        regionStack.push(switchRegion);
        regionStack.addExits(BlockUtils.bitSetToBlocks(this.mth, bitSet2));
        if (linkedHashMap3.isEmpty() || !isBadCasesOrder(linkedHashMap2, linkedHashMap3)) {
            map = linkedHashMap2;
        } else {
            Map mapReOrderSwitchCases = reOrderSwitchCases(linkedHashMap2, linkedHashMap3);
            if (isBadCasesOrder(mapReOrderSwitchCases, linkedHashMap3)) {
                this.mth.add(AFlag.INCONSISTENT_CODE);
            }
            map = mapReOrderSwitchCases;
        }
        if (bitSet2.cardinality() > 1) {
            BlockUtils.cleanBitSet(this.mth, bitSet2);
        }
        if (bitSet2.cardinality() > 1) {
            for (int iNextSetBit = bitSet2.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSet2.nextSetBit(iNextSetBit + 1)) {
                BlockNode blockNode6 = (BlockNode) basicBlocks.get(iNextSetBit);
                bitSet2.andNot(blockNode6.getDomFrontier());
                if (blockNode6.contains(AFlag.LOOP_START)) {
                    bitSet2.clear(blockNode6.getId());
                } else {
                    Iterator it = blockNode6.getCleanSuccessors().iterator();
                    while (it.hasNext()) {
                        bitSet2.clear(((BlockNode) it.next()).getId());
                    }
                }
            }
        }
        if (loopForBlock != null && bitSet2.cardinality() > 1) {
            bitSet2.clear(loopForBlock.getEnd().getId());
        }
        if (bitSet2.cardinality() == 0) {
            Iterator it2 = blockNode.getSuccessors().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                BlockNode blockNode7 = (BlockNode) it2.next();
                Iterator it3 = blockNode.getSuccessors().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        z = true;
                        break;
                    }
                    if (!BlockUtils.isPathExists((BlockNode) it3.next(), blockNode7)) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    bitSet2.set(blockNode7.getId());
                    break;
                }
            }
        }
        if (bitSet2.cardinality() == 1) {
            BlockNode blockNode8 = (BlockNode) basicBlocks.get(bitSet2.nextSetBit(0));
            regionStack.addExit(blockNode8);
            blockNode2 = blockNode8;
        } else {
            if (loopForBlock == null) {
                bitSet2.cardinality();
            }
            blockNode2 = null;
        }
        if (loopForBlock != null && blockNode2 != (end = loopForBlock.getEnd()) && blockNode2 != null) {
            insertContinueInSwitch(blockNode, blockNode2, end);
        }
        if (!regionStack.containsExit(blockByOffset2)) {
            switchRegion.setDefaultCase(makeRegion(blockByOffset2, regionStack));
        }
        for (Map.Entry entry2 : map.entrySet()) {
            BlockNode blockNode9 = (BlockNode) entry2.getKey();
            if (regionStack.containsExit(blockNode9)) {
                switchRegion.addCase((List) entry2.getValue(), new Region(regionStack.peekRegion()));
            } else {
                BlockNode blockNode10 = (BlockNode) linkedHashMap3.get(blockNode9);
                regionStack.addExit(blockNode10);
                Region regionMakeRegion = makeRegion(blockNode9, regionStack);
                regionStack.removeExit(blockNode10);
                if (blockNode10 != null) {
                    blockNode10.add(AFlag.FALL_THROUGH);
                    regionMakeRegion.add(AFlag.FALL_THROUGH);
                }
                switchRegion.addCase((List) entry2.getValue(), regionMakeRegion);
            }
        }
        regionStack.pop();
        return blockNode2;
    }

    private Map reOrderSwitchCases(Map map, final Map map2) {
        ArrayList<BlockNode> arrayList = new ArrayList(map.size());
        arrayList.addAll(map.keySet());
        Collections.sort(arrayList, new Comparator() { // from class: jadx.core.dex.visitors.regions.RegionMaker.1
            @Override // java.util.Comparator
            public int compare(BlockNode blockNode, BlockNode blockNode2) {
                BlockNode blockNode3 = (BlockNode) map2.get(blockNode);
                if (blockNode3 != null) {
                    if (blockNode2.equals(blockNode3)) {
                        return -1;
                    }
                } else if (blockNode.equals(map2.get(blockNode2))) {
                    return 1;
                }
                return 0;
            }
        });
        LinkedHashMap linkedHashMap = new LinkedHashMap(map.size());
        for (BlockNode blockNode : arrayList) {
            linkedHashMap.put(blockNode, map.get(blockNode));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private BlockNode traverse(IRegion iRegion, BlockNode blockNode, RegionStack regionStack) {
        boolean z;
        BlockNode blockNodeProcessLoop;
        BlockNode nextBlock;
        boolean z2 = true;
        List<LoopInfo> all = blockNode.getAll(AType.LOOP);
        int size = all.size();
        if (size == 0 || !blockNode.contains(AFlag.LOOP_START)) {
            z = false;
            blockNodeProcessLoop = null;
        } else if (size == 1) {
            blockNodeProcessLoop = processLoop(iRegion, (LoopInfo) all.get(0), regionStack);
            z = true;
        } else {
            for (LoopInfo loopInfo : all) {
                if (loopInfo.getStart() == blockNode) {
                    blockNodeProcessLoop = processLoop(iRegion, loopInfo, regionStack);
                    z = true;
                    break;
                }
            }
            z = false;
            blockNodeProcessLoop = null;
        }
        if (!z && blockNode.getInstructions().size() == 1) {
            InsnNode insnNode = (InsnNode) blockNode.getInstructions().get(0);
            switch (insnNode.getType()) {
                case IF:
                    nextBlock = processIf(iRegion, blockNode, (IfNode) insnNode, regionStack);
                    break;
                case SWITCH:
                    nextBlock = processSwitch(iRegion, blockNode, (SwitchNode) insnNode, regionStack);
                    break;
                case MONITOR_ENTER:
                    nextBlock = processMonitorEnter(iRegion, blockNode, insnNode, regionStack);
                    break;
            }
        } else {
            z2 = z;
            nextBlock = blockNodeProcessLoop;
        }
        if (!z2) {
            iRegion.getSubBlocks().add(blockNode);
            nextBlock = BlockUtils.getNextBlock(blockNode);
        }
        if (nextBlock == null || regionStack.containsExit(blockNode) || regionStack.containsExit(nextBlock)) {
            return null;
        }
        return nextBlock;
    }

    private static void traverseMonitorExits(SynchronizedRegion synchronizedRegion, InsnArg insnArg, BlockNode blockNode, Set set, Set set2) {
        set2.add(blockNode);
        for (InsnNode insnNode : blockNode.getInstructions()) {
            if (insnNode.getType() == InsnType.MONITOR_EXIT && insnNode.getArg(0).equals(insnArg)) {
                set.add(blockNode);
                synchronizedRegion.getExitInsns().add(insnNode);
                return;
            }
        }
        for (BlockNode blockNode2 : blockNode.getSuccessors()) {
            if (!set2.contains(blockNode2)) {
                traverseMonitorExits(synchronizedRegion, insnArg, blockNode2, set, set2);
            }
        }
    }

    private static BlockNode traverseMonitorExitsCross(BlockNode blockNode, Set set, Set set2) {
        boolean z;
        BlockNode blockNodeTraverseMonitorExitsCross;
        set2.add(blockNode);
        for (BlockNode blockNode2 : blockNode.getCleanSuccessors()) {
            Iterator it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
                if (!BlockUtils.isPathExists((BlockNode) it.next(), blockNode2)) {
                    z = false;
                    break;
                }
            }
            if (z) {
                return blockNode2;
            }
            if (!set2.contains(blockNode2) && (blockNodeTraverseMonitorExitsCross = traverseMonitorExitsCross(blockNode2, set, set2)) != null) {
                return blockNodeTraverseMonitorExitsCross;
            }
        }
        return null;
    }

    public Region makeRegion(BlockNode blockNode, RegionStack regionStack) {
        this.regionsCount++;
        if (this.regionsCount > REGIONS_LIMIT) {
            throw new JadxOverflowException("Regions count limit reached");
        }
        Region region = new Region(regionStack.peekRegion());
        while (blockNode != null) {
            blockNode = traverse(region, blockNode, regionStack);
        }
        return region;
    }

    protected IRegion processHandlersOutBlocks(MethodNode methodNode, Set set) {
        HashSet hashSet = new HashSet();
        RegionUtils.getAllRegionBlocks(methodNode.getRegion(), hashSet);
        HashSet<IBlock> hashSet2 = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((TryCatchBlock) it.next()).getHandlers().iterator();
            while (it2.hasNext()) {
                IContainer handlerRegion = ((ExceptionHandler) it2.next()).getHandlerRegion();
                if (handlerRegion != null) {
                    IBlock lastBlock = RegionUtils.getLastBlock(handlerRegion);
                    if (lastBlock instanceof BlockNode) {
                        hashSet2.addAll(((BlockNode) lastBlock).getSuccessors());
                    }
                    RegionUtils.getAllRegionBlocks(handlerRegion, hashSet);
                }
            }
        }
        hashSet2.removeAll(hashSet);
        if (hashSet2.isEmpty()) {
            return null;
        }
        Region region = new Region(methodNode.getRegion());
        for (IBlock iBlock : hashSet2) {
            if (iBlock instanceof BlockNode) {
                region.add(makeRegion((BlockNode) iBlock, new RegionStack(methodNode)));
            }
        }
        return region;
    }

    public IRegion processTryCatchBlocks(MethodNode methodNode) {
        BlockNode blockNode;
        BlockNode pathCross;
        HashSet<TryCatchBlock> hashSet = new HashSet();
        Iterator it = methodNode.getExceptionHandlers().iterator();
        while (it.hasNext()) {
            hashSet.add(((ExceptionHandler) it.next()).getTryBlock());
        }
        for (TryCatchBlock tryCatchBlock : hashSet) {
            ArrayList<BlockNode> arrayList = new ArrayList(tryCatchBlock.getHandlersCount());
            HashSet<BlockNode> hashSet2 = new HashSet();
            Iterator it2 = tryCatchBlock.getHandlers().iterator();
            while (it2.hasNext()) {
                BlockNode handlerBlock = ((ExceptionHandler) it2.next()).getHandlerBlock();
                if (handlerBlock != null) {
                    arrayList.add(handlerBlock);
                    hashSet2.addAll(handlerBlock.getPredecessors());
                }
            }
            HashSet hashSet3 = new HashSet();
            for (BlockNode blockNode2 : hashSet2) {
                for (BlockNode blockNode3 : arrayList) {
                    List successors = blockNode2.getSuccessors();
                    if (!successors.isEmpty() && (pathCross = BlockUtils.getPathCross(methodNode, (blockNode = (BlockNode) successors.get(0)), blockNode3)) != null && pathCross != blockNode && pathCross != blockNode3) {
                        hashSet3.add(pathCross);
                    }
                }
            }
            Iterator it3 = tryCatchBlock.getHandlers().iterator();
            while (it3.hasNext()) {
                processExcHandler((ExceptionHandler) it3.next(), hashSet3);
            }
        }
        return processHandlersOutBlocks(methodNode, hashSet);
    }
}
