package jadx.core.dex.visitors;

import jadx.core.Consts;
import jadx.core.dex.info.FieldInfo;
import jadx.core.dex.info.MethodInfo;
import jadx.core.dex.instructions.ArithNode;
import jadx.core.dex.instructions.ArithOp;
import jadx.core.dex.instructions.ConstStringNode;
import jadx.core.dex.instructions.IfNode;
import jadx.core.dex.instructions.IndexInsnNode;
import jadx.core.dex.instructions.InsnType;
import jadx.core.dex.instructions.InvokeNode;
import jadx.core.dex.instructions.args.ArgType;
import jadx.core.dex.instructions.args.FieldArg;
import jadx.core.dex.instructions.args.InsnArg;
import jadx.core.dex.instructions.args.InsnWrapArg;
import jadx.core.dex.instructions.args.LiteralArg;
import jadx.core.dex.instructions.mods.ConstructorInsn;
import jadx.core.dex.instructions.mods.TernaryInsn;
import jadx.core.dex.nodes.BlockNode;
import jadx.core.dex.nodes.InsnNode;
import jadx.core.dex.nodes.MethodNode;
import jadx.core.dex.regions.conditions.IfCondition;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.p117d.C1799c;
import org.p117d.InterfaceC1790b;

/* JADX INFO: loaded from: classes.dex */
public class SimplifyVisitor extends AbstractVisitor {
    private static final InterfaceC1790b LOG = C1799c.m4223a(SimplifyVisitor.class);

    private static InsnNode convertFieldArith(MethodNode methodNode, InsnNode insnNode) {
        InsnArg arg;
        InsnArg arg2 = insnNode.getArg(0);
        if (!arg2.isInsnWrap()) {
            return null;
        }
        InsnNode wrapInsn = ((InsnWrapArg) arg2).getWrapInsn();
        InsnType type = wrapInsn.getType();
        if ((type != InsnType.ARITH && type != InsnType.STR_CONCAT) || !wrapInsn.getArg(0).isInsnWrap()) {
            return null;
        }
        InsnNode wrapInsn2 = ((InsnWrapArg) wrapInsn.getArg(0)).getWrapInsn();
        InsnType type2 = wrapInsn2.getType();
        if (type2 != InsnType.IGET && type2 != InsnType.SGET) {
            return null;
        }
        FieldInfo fieldInfo = (FieldInfo) ((IndexInsnNode) insnNode).getIndex();
        if (!fieldInfo.equals((FieldInfo) ((IndexInsnNode) wrapInsn2).getIndex())) {
            return null;
        }
        try {
            if (type2 == InsnType.IGET) {
                arg = wrapInsn2.getArg(0);
                if (!arg.equals(insnNode.getArg(1))) {
                    return null;
                }
            } else {
                arg = null;
            }
            FieldArg fieldArg = new FieldArg(fieldInfo, arg);
            if (arg != null) {
                fieldArg.setType(wrapInsn2.getArg(0).getType());
            }
            if (type == InsnType.ARITH) {
                ArithNode arithNode = (ArithNode) wrapInsn;
                return new ArithNode(arithNode.getOp(), fieldArg, arithNode.getArg(1));
            }
            int argsCount = wrapInsn.getArgsCount();
            InsnNode insnNode2 = new InsnNode(InsnType.STR_CONCAT, argsCount - 1);
            for (int i = 1; i < argsCount; i++) {
                insnNode2.addArg(wrapInsn.getArg(i));
            }
            return new ArithNode(ArithOp.ADD, fieldArg, InsnArg.wrapArg(insnNode2));
        } catch (Exception e) {
            LOG.mo4196a("Can't convert field arith insn: {}, mth: {}", insnNode, methodNode, e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00e9 A[Catch: Throwable -> 0x0108, TryCatch #0 {Throwable -> 0x0108, blocks: (B:8:0x0032, B:10:0x003c, B:14:0x004e, B:16:0x0064, B:19:0x0075, B:21:0x0084, B:23:0x0098, B:24:0x00a1, B:26:0x00a7, B:42:0x00ff, B:37:0x00e9, B:39:0x00f4, B:27:0x00b9, B:29:0x00bf, B:32:0x00d1, B:34:0x00d7), top: B:49:0x0032 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static InsnNode convertInvoke(MethodNode methodNode, InsnNode insnNode) {
        int i;
        InsnWrapArg insnWrapArg;
        int i2;
        MethodInfo callMth = ((InvokeNode) insnNode).getCallMth();
        if (callMth.getDeclClass().getFullName().equals(Consts.CLASS_STRING_BUILDER) && callMth.getShortId().equals(Consts.MTH_TOSTRING_SIGNATURE) && insnNode.getArg(0).isInsnWrap()) {
            try {
                List listFlattenInsnChain = flattenInsnChain(insnNode);
                int i3 = (listFlattenInsnChain.size() <= 1 || ((InsnNode) listFlattenInsnChain.get(0)).getType() != InsnType.CONSTRUCTOR) ? (listFlattenInsnChain.size() <= 2 || ((InsnNode) listFlattenInsnChain.get(1)).getType() != InsnType.CONSTRUCTOR) ? (listFlattenInsnChain.size() <= 3 || ((InsnNode) listFlattenInsnChain.get(2)).getType() != InsnType.CONSTRUCTOR) ? -1 : 2 : 1 : 0;
                if (i3 != -1 && ((ConstructorInsn) listFlattenInsnChain.get(i3)).getClassType().getFullName().equals(Consts.CLASS_STRING_BUILDER)) {
                    int size = listFlattenInsnChain.size();
                    InsnNode insnNode2 = new InsnNode(InsnType.STR_CONCAT, size - 1);
                    if (i3 <= 0) {
                        i = 1;
                    } else if (i3 == 2) {
                        InsnNode insnNode3 = (InsnNode) listFlattenInsnChain.get(1);
                        if (insnNode3.getType() == InsnType.INVOKE && ((InvokeNode) insnNode3).getCallMth().getName().compareTo("valueOf") == 0) {
                            insnWrapArg = (InsnWrapArg) insnNode3.getArg(0);
                            i2 = 3;
                        } else {
                            InsnNode insnNode4 = (InsnNode) listFlattenInsnChain.get(0);
                            if (!(insnNode4 instanceof ConstStringNode)) {
                                return null;
                            }
                            insnWrapArg = new InsnWrapArg((ConstStringNode) insnNode4);
                            i2 = 2;
                        }
                        insnNode2.addArg(insnWrapArg);
                        i = i2;
                    }
                    while (i < size) {
                        insnNode2.addArg(((InsnNode) listFlattenInsnChain.get(i)).getArg(1));
                        i++;
                    }
                    insnNode2.setResult(insnNode.getResult());
                    return insnNode2;
                }
            } catch (Throwable th) {
                LOG.mo4196a("Can't convert string concatenation: {} insn: {}", methodNode, insnNode, th);
            }
        }
        return null;
    }

    private static List flattenInsnChain(InsnNode insnNode) {
        ArrayList arrayList = new ArrayList();
        InsnArg arg = insnNode.getArg(0);
        while (arg.isInsnWrap()) {
            InsnNode wrapInsn = ((InsnWrapArg) arg).getWrapInsn();
            arrayList.add(wrapInsn);
            if (wrapInsn.getArgsCount() == 0) {
                break;
            }
            arg = wrapInsn.getArg(0);
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    private static InsnNode processCast(MethodNode methodNode, InsnNode insnNode) {
        InsnArg arg = insnNode.getArg(0);
        ArgType type = arg.getType();
        if (arg.isInsnWrap()) {
            InsnNode wrapInsn = ((InsnWrapArg) arg).getWrapInsn();
            if (wrapInsn.getType() == InsnType.INVOKE) {
                type = ((InvokeNode) wrapInsn).getCallMth().getReturnType();
            }
        }
        if (ArgType.isCastNeeded(methodNode.dex(), type, (ArgType) ((IndexInsnNode) insnNode).getIndex())) {
            return null;
        }
        InsnNode insnNode2 = new InsnNode(InsnType.MOVE, 1);
        insnNode2.setOffset(insnNode.getOffset());
        insnNode2.setResult(insnNode.getResult());
        insnNode2.addArg(arg);
        return insnNode2;
    }

    private static InsnNode simplifyArith(InsnNode insnNode) {
        InsnArg arg;
        ArithNode arithNode = (ArithNode) insnNode;
        if (arithNode.getArgsCount() != 2) {
            return null;
        }
        InsnArg arg2 = arithNode.getArg(1);
        if (arg2.isInsnWrap()) {
            InsnNode wrapInsn = ((InsnWrapArg) arg2).getWrapInsn();
            arg = wrapInsn.getType() == InsnType.CONST ? wrapInsn.getArg(0) : null;
        } else {
            arg = arg2.isLiteral() ? arg2 : null;
        }
        if (arg == null) {
            return null;
        }
        long literal = ((LiteralArg) arg).getLiteral();
        if (arithNode.getOp() != ArithOp.ADD || literal >= 0) {
            return null;
        }
        return new ArithNode(ArithOp.SUB, arithNode.getResult(), insnNode.getArg(0), InsnArg.lit(-literal, arg.getType()));
    }

    private static void simplifyIf(IfNode ifNode) {
        InsnArg arg = ifNode.getArg(0);
        if (arg.isInsnWrap()) {
            InsnNode wrapInsn = ((InsnWrapArg) arg).getWrapInsn();
            if (wrapInsn.getType() == InsnType.CMP_L || wrapInsn.getType() == InsnType.CMP_G) {
                if (ifNode.getArg(1).isLiteral() && ((LiteralArg) ifNode.getArg(1)).getLiteral() == 0) {
                    ifNode.changeCondition(ifNode.getOp(), wrapInsn.getArg(0), wrapInsn.getArg(1));
                } else {
                    LOG.mo4203c("TODO: cmp {}", ifNode);
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static InsnNode simplifyInsn(MethodNode methodNode, InsnNode insnNode) {
        InsnNode insnNodeSimplifyInsn;
        for (InsnArg insnArg : insnNode.getArguments()) {
            if (insnArg.isInsnWrap() && (insnNodeSimplifyInsn = simplifyInsn(methodNode, ((InsnWrapArg) insnArg).getWrapInsn())) != null) {
                insnArg.wrapInstruction(insnNodeSimplifyInsn);
            }
        }
        switch (insnNode.getType()) {
            case ARITH:
                return simplifyArith(insnNode);
            case IF:
                simplifyIf((IfNode) insnNode);
                return null;
            case TERNARY:
                simplifyTernary((TernaryInsn) insnNode);
                return null;
            case INVOKE:
                return convertInvoke(methodNode, insnNode);
            case IPUT:
            case SPUT:
                return convertFieldArith(methodNode, insnNode);
            case CHECK_CAST:
                return processCast(methodNode, insnNode);
            case MOVE:
                InsnArg arg = insnNode.getArg(0);
                if (arg.isLiteral()) {
                    InsnNode insnNode2 = new InsnNode(InsnType.CONST, 1);
                    insnNode2.setResult(insnNode.getResult());
                    insnNode2.addArg(arg);
                    insnNode2.copyAttributesFrom(insnNode);
                    return insnNode2;
                }
                return null;
            default:
                return null;
        }
    }

    private static void simplifyTernary(TernaryInsn ternaryInsn) {
        IfCondition condition = ternaryInsn.getCondition();
        if (condition.isCompare()) {
            simplifyIf(condition.getCompare().getInsn());
        } else {
            ternaryInsn.simplifyCondition();
        }
    }

    @Override // jadx.core.dex.visitors.AbstractVisitor, jadx.core.dex.visitors.IDexTreeVisitor
    public void visit(MethodNode methodNode) {
        if (methodNode.isNoCode()) {
            return;
        }
        Iterator it = methodNode.getBasicBlocks().iterator();
        while (it.hasNext()) {
            List instructions = ((BlockNode) it.next()).getInstructions();
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < instructions.size()) {
                    InsnNode insnNodeSimplifyInsn = simplifyInsn(methodNode, (InsnNode) instructions.get(i2));
                    if (insnNodeSimplifyInsn != null) {
                        instructions.set(i2, insnNodeSimplifyInsn);
                    }
                    i = i2 + 1;
                }
            }
        }
    }
}
