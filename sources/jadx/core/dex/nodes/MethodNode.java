package jadx.core.dex.nodes;

import com.p046a.p047a.C0487d;
import com.p046a.p047a.C0489f;
import com.p046a.p047a.C0490g;
import com.p046a.p047a.C0491h;
import jadx.core.deobf.Deobfuscator;
import jadx.core.dex.attributes.AFlag;
import jadx.core.dex.attributes.AType;
import jadx.core.dex.attributes.nodes.JumpInfo;
import jadx.core.dex.attributes.nodes.LineAttrNode;
import jadx.core.dex.attributes.nodes.LoopInfo;
import jadx.core.dex.info.AccessInfo;
import jadx.core.dex.info.ClassInfo;
import jadx.core.dex.info.MethodInfo;
import jadx.core.dex.instructions.GotoNode;
import jadx.core.dex.instructions.IfNode;
import jadx.core.dex.instructions.InsnDecoder;
import jadx.core.dex.instructions.SwitchNode;
import jadx.core.dex.instructions.args.ArgType;
import jadx.core.dex.instructions.args.InsnArg;
import jadx.core.dex.instructions.args.RegisterArg;
import jadx.core.dex.instructions.args.SSAVar;
import jadx.core.dex.instructions.args.TypeImmutableArg;
import jadx.core.dex.nodes.parser.SignatureParser;
import jadx.core.dex.regions.Region;
import jadx.core.dex.trycatch.ExcHandlerAttr;
import jadx.core.dex.trycatch.ExceptionHandler;
import jadx.core.dex.trycatch.TryCatchBlock;
import jadx.core.utils.Utils;
import jadx.core.utils.exceptions.DecodeException;
import jadx.core.utils.exceptions.JadxRuntimeException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.p117d.C1799c;
import org.p117d.InterfaceC1790b;

/* JADX INFO: loaded from: classes.dex */
public class MethodNode extends LineAttrNode implements ILoadable {
    private static final InterfaceC1790b LOG = C1799c.m4223a(MethodNode.class);
    private final AccessInfo accFlags;
    private List argsList;
    private List blocks;
    private int codeSize;
    private int debugInfoOffset;
    private BlockNode enterBlock;
    private List exitBlocks;
    private Map genericMap;
    private InsnNode[] instructions;
    private final C0487d methodData;
    private boolean methodIsVirtual;
    private final MethodInfo mthInfo;
    private boolean noCode;
    private final ClassNode parentClass;
    private Region region;
    private int regsCount;
    private ArgType retType;
    private RegisterArg thisArg;
    private List sVars = Collections.emptyList();
    private List exceptionHandlers = Collections.emptyList();
    private List loops = Collections.emptyList();

    public MethodNode(ClassNode classNode, C0487d c0487d, boolean z) {
        this.mthInfo = MethodInfo.fromDex(classNode.dex(), c0487d.m582a());
        this.parentClass = classNode;
        this.accFlags = new AccessInfo(c0487d.m583b(), AccessInfo.AFType.METHOD);
        this.noCode = c0487d.m584c() == 0;
        this.methodData = this.noCode ? null : c0487d;
        this.methodIsVirtual = z;
    }

    private static void addJump(InsnNode[] insnNodeArr, int i, int i2) {
        insnNodeArr[i2].addAttr(AType.JUMP, new JumpInfo(i, i2));
    }

    private void initArguments(List list) {
        int regCount;
        if (!this.noCode) {
            int regCount2 = this.regsCount;
            Iterator it = list.iterator();
            while (true) {
                regCount = regCount2;
                if (!it.hasNext()) {
                    break;
                } else {
                    regCount2 = regCount - ((ArgType) it.next()).getRegCount();
                }
            }
        } else {
            regCount = 1;
        }
        if (this.accFlags.isStatic()) {
            this.thisArg = null;
        } else {
            TypeImmutableArg typeImmutableArgTypeImmutableReg = InsnArg.typeImmutableReg(regCount - 1, this.parentClass.getClassInfo().getType());
            typeImmutableArgTypeImmutableReg.markAsThis();
            this.thisArg = typeImmutableArgTypeImmutableReg;
        }
        if (list.isEmpty()) {
            this.argsList = Collections.emptyList();
            return;
        }
        this.argsList = new ArrayList(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ArgType argType = (ArgType) it2.next();
            this.argsList.add(InsnArg.typeImmutableReg(regCount, argType));
            regCount += argType.getRegCount();
        }
    }

    private void initJumps() {
        InsnNode[] insnNodeArr = this.instructions;
        for (int i = 0; i < insnNodeArr.length; i++) {
            InsnNode insnNode = insnNodeArr[i];
            if (insnNode != null) {
                switch (insnNode.getType()) {
                    case SWITCH:
                        int[] targets = ((SwitchNode) insnNode).getTargets();
                        for (int i2 : targets) {
                            addJump(insnNodeArr, i, i2);
                        }
                        int nextInsnOffset = InsnDecoder.getNextInsnOffset(insnNodeArr, i);
                        if (nextInsnOffset != -1) {
                            addJump(insnNodeArr, i, nextInsnOffset);
                        }
                        break;
                    case IF:
                        int nextInsnOffset2 = InsnDecoder.getNextInsnOffset(insnNodeArr, i);
                        if (nextInsnOffset2 != -1) {
                            addJump(insnNodeArr, i, nextInsnOffset2);
                        }
                        addJump(insnNodeArr, i, ((IfNode) insnNode).getTarget());
                        break;
                    case GOTO:
                        addJump(insnNodeArr, i, ((GotoNode) insnNode).getTarget());
                        break;
                }
            }
        }
    }

    private void initMethodTypes() {
        if (parseSignature()) {
            return;
        }
        this.retType = this.mthInfo.getReturnType();
        initArguments(this.mthInfo.getArgumentsTypes());
    }

    private void initTryCatches(C0489f c0489f) {
        InsnNode[] insnNodeArr = this.instructions;
        C0490g[] c0490gArrM601g = c0489f.m601g();
        C0491h[] c0491hArrM600f = c0489f.m600f();
        if (c0490gArrM601g.length == 0 && c0491hArrM600f.length == 0) {
            return;
        }
        int i = 0;
        HashSet hashSet = new HashSet();
        ArrayList<TryCatchBlock> arrayList = new ArrayList(c0490gArrM601g.length);
        for (C0490g c0490g : c0490gArrM601g) {
            TryCatchBlock tryCatchBlock = new TryCatchBlock();
            arrayList.add(tryCatchBlock);
            for (int i2 = 0; i2 < c0490g.m603b().length; i2++) {
                int i3 = c0490g.m603b()[i2];
                tryCatchBlock.addHandler(this, i3, ClassInfo.fromDex(this.parentClass.dex(), c0490g.m602a()[i2]));
                hashSet.add(Integer.valueOf(i3));
                i++;
            }
            int iM604c = c0490g.m604c();
            if (iM604c >= 0) {
                tryCatchBlock.addHandler(this, iM604c, null);
                hashSet.add(Integer.valueOf(iM604c));
                i++;
            }
        }
        if (i > 0 && i != hashSet.size()) {
            for (TryCatchBlock tryCatchBlock2 : arrayList) {
                for (TryCatchBlock tryCatchBlock3 : arrayList) {
                    if (tryCatchBlock2 != tryCatchBlock3 && tryCatchBlock3.containsAllHandlers(tryCatchBlock2)) {
                        for (ExceptionHandler exceptionHandler : tryCatchBlock2.getHandlers()) {
                            tryCatchBlock3.removeHandler(this, exceptionHandler);
                            exceptionHandler.setTryBlock(tryCatchBlock2);
                        }
                    }
                }
            }
        }
        hashSet.clear();
        for (TryCatchBlock tryCatchBlock4 : arrayList) {
            for (ExceptionHandler exceptionHandler2 : tryCatchBlock4.getHandlers()) {
                insnNodeArr[exceptionHandler2.getHandleOffset()].addAttr(new ExcHandlerAttr(tryCatchBlock4, exceptionHandler2));
            }
        }
        for (C0491h c0491h : c0491hArrM600f) {
            TryCatchBlock tryCatchBlock5 = (TryCatchBlock) arrayList.get(c0491h.m607c());
            int iM605a = c0491h.m605a();
            int iM606b = (c0491h.m606b() + iM605a) - 1;
            InsnNode insnNode = insnNodeArr[iM605a];
            insnNode.add(AFlag.TRY_ENTER);
            while (iM605a <= iM606b && iM605a >= 0) {
                insnNode = insnNodeArr[iM605a];
                tryCatchBlock5.addInsn(insnNode);
                iM605a = InsnDecoder.getNextInsnOffset(insnNodeArr, iM605a);
            }
            if (insnNodeArr[iM606b] != null) {
                insnNodeArr[iM606b].add(AFlag.TRY_LEAVE);
            } else {
                insnNode.add(AFlag.TRY_LEAVE);
            }
        }
    }

    private boolean parseSignature() {
        SignatureParser signatureParserFromNode = SignatureParser.fromNode(this);
        if (signatureParserFromNode == null) {
            return false;
        }
        try {
            this.genericMap = signatureParserFromNode.consumeGenericMap();
            List listConsumeMethodArgs = signatureParserFromNode.consumeMethodArgs();
            this.retType = signatureParserFromNode.consumeType();
            List argumentsTypes = this.mthInfo.getArgumentsTypes();
            if (listConsumeMethodArgs.size() != argumentsTypes.size()) {
                if (listConsumeMethodArgs.isEmpty()) {
                    return false;
                }
                if (!this.mthInfo.isConstructor()) {
                    LOG.mo4201b("Wrong signature parse result: {} -> {}, not generic version: {}", signatureParserFromNode, listConsumeMethodArgs, argumentsTypes);
                    return false;
                }
                if (getParentClass().getAccessFlags().isEnum()) {
                    listConsumeMethodArgs.add(0, argumentsTypes.get(0));
                    listConsumeMethodArgs.add(1, argumentsTypes.get(1));
                } else {
                    listConsumeMethodArgs.add(0, argumentsTypes.get(0));
                }
                if (listConsumeMethodArgs.size() != argumentsTypes.size()) {
                    return false;
                }
            }
            initArguments(listConsumeMethodArgs);
            return true;
        } catch (JadxRuntimeException e) {
            LOG.mo4204c("Method signature parse error: {}", this, e);
            return false;
        }
    }

    public ExceptionHandler addExceptionHandler(ExceptionHandler exceptionHandler) {
        if (this.exceptionHandlers.isEmpty()) {
            this.exceptionHandlers = new ArrayList(2);
        } else {
            for (ExceptionHandler exceptionHandler2 : this.exceptionHandlers) {
                if (exceptionHandler2 == exceptionHandler || exceptionHandler2.getHandleOffset() == exceptionHandler.getHandleOffset()) {
                    return exceptionHandler2;
                }
            }
        }
        this.exceptionHandlers.add(exceptionHandler);
        return exceptionHandler;
    }

    public void addExitBlock(BlockNode blockNode) {
        this.exitBlocks.add(blockNode);
    }

    public void checkInstructions() {
        ArrayList arrayList = new ArrayList();
        for (InsnNode insnNode : this.instructions) {
            if (insnNode != null) {
                arrayList.clear();
                RegisterArg result = insnNode.getResult();
                if (result != null) {
                    arrayList.add(result);
                }
                insnNode.getRegisterArgs(arrayList);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (((RegisterArg) arrayList.get(i)).getRegNum() >= this.regsCount) {
                        throw new JadxRuntimeException("Incorrect register number in instruction: " + insnNode + ", expected to be less than " + this.regsCount);
                    }
                }
            }
        }
    }

    public DexNode dex() {
        return this.parentClass.dex();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.mthInfo.equals(((MethodNode) obj).mthInfo);
    }

    public void finishBasicBlocks() {
        ((ArrayList) this.blocks).trimToSize();
        ((ArrayList) this.exitBlocks).trimToSize();
        this.blocks = Collections.unmodifiableList(this.blocks);
        this.exitBlocks = Collections.unmodifiableList(this.exitBlocks);
        Iterator it = this.blocks.iterator();
        while (it.hasNext()) {
            ((BlockNode) it.next()).lock();
        }
    }

    public AccessInfo getAccessFlags() {
        return this.accFlags;
    }

    public String getAlias() {
        return this.mthInfo.getAlias();
    }

    public List getAllLoopsForBlock(BlockNode blockNode) {
        if (this.loops.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(this.loops.size());
        for (LoopInfo loopInfo : this.loops) {
            if (loopInfo.getLoopBlocks().contains(blockNode)) {
                arrayList.add(loopInfo);
            }
        }
        return arrayList;
    }

    public List getArguments(boolean z) {
        if (!z || this.thisArg == null) {
            return this.argsList;
        }
        ArrayList arrayList = new ArrayList(this.argsList.size() + 1);
        arrayList.add(this.thisArg);
        arrayList.addAll(this.argsList);
        return arrayList;
    }

    public List getBasicBlocks() {
        return this.blocks;
    }

    public int getCodeSize() {
        return this.codeSize;
    }

    public int getDebugInfoOffset() {
        return this.debugInfoOffset;
    }

    public BlockNode getEnterBlock() {
        return this.enterBlock;
    }

    public Iterable getExceptionHandlers() {
        return this.exceptionHandlers;
    }

    public int getExceptionHandlersCount() {
        return this.exceptionHandlers.size();
    }

    public List getExitBlocks() {
        return this.exitBlocks;
    }

    public Map getGenericMap() {
        return this.genericMap;
    }

    public InsnNode[] getInstructions() {
        return this.instructions;
    }

    public LoopInfo getLoopForBlock(BlockNode blockNode) {
        if (this.loops.isEmpty()) {
            return null;
        }
        for (LoopInfo loopInfo : this.loops) {
            if (loopInfo.getLoopBlocks().contains(blockNode)) {
                return loopInfo;
            }
        }
        return null;
    }

    public Iterable getLoops() {
        return this.loops;
    }

    public int getLoopsCount() {
        return this.loops.size();
    }

    public MethodInfo getMethodInfo() {
        return this.mthInfo;
    }

    public String getName() {
        return this.mthInfo.getName();
    }

    public int getNextSVarVersion(int i) {
        int iMax = -1;
        Iterator it = this.sVars.iterator();
        while (true) {
            int i2 = iMax;
            if (!it.hasNext()) {
                return i2 + 1;
            }
            SSAVar sSAVar = (SSAVar) it.next();
            iMax = sSAVar.getRegNum() == i ? Math.max(i2, sSAVar.getVersion()) : i2;
        }
    }

    public ClassNode getParentClass() {
        return this.parentClass;
    }

    public Region getRegion() {
        return this.region;
    }

    public int getRegsCount() {
        return this.regsCount;
    }

    public ArgType getReturnType() {
        return this.retType;
    }

    public List getSVars() {
        return this.sVars;
    }

    public RegisterArg getThisArg() {
        return this.thisArg;
    }

    public int hashCode() {
        return this.mthInfo.hashCode();
    }

    public void initBasicBlocks() {
        this.blocks = new ArrayList();
        this.exitBlocks = new ArrayList(1);
    }

    public boolean isArgsOverload() {
        int size = this.mthInfo.getArgumentsTypes().size();
        if (size == 0) {
            return false;
        }
        String name = getName();
        for (MethodNode methodNode : this.parentClass.getMethods()) {
            MethodInfo methodInfo = methodNode.mthInfo;
            if (this != methodNode && methodInfo.getArgumentsTypes().size() == size && methodInfo.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean isDefaultConstructor() {
        int i;
        if (!this.accFlags.isConstructor() || !this.mthInfo.isConstructor()) {
            return false;
        }
        if (!this.parentClass.getClassInfo().isInner() || this.parentClass.getAccessFlags().isStatic()) {
            i = 0;
        } else {
            ClassNode parentClass = this.parentClass.getParentClass();
            if (this.argsList != null && !this.argsList.isEmpty() && ((RegisterArg) this.argsList.get(0)).getType().equals(parentClass.getClassInfo().getType())) {
                i = 1;
            }
        }
        return this.argsList == null || this.argsList.size() == i;
    }

    public boolean isNoCode() {
        return this.noCode;
    }

    public boolean isNoExceptionHandlers() {
        return this.exceptionHandlers.isEmpty();
    }

    public boolean isVirtual() {
        return this.methodIsVirtual;
    }

    @Override // jadx.core.dex.nodes.ILoadable
    public void load() {
        try {
            if (this.noCode) {
                this.regsCount = 0;
                this.codeSize = 0;
                initMethodTypes();
                return;
            }
            C0489f code = this.parentClass.dex().readCode(this.methodData);
            this.regsCount = code.m595a();
            initMethodTypes();
            InsnDecoder insnDecoder = new InsnDecoder(this);
            insnDecoder.decodeInsns(code);
            this.instructions = insnDecoder.process();
            this.codeSize = this.instructions.length;
            initTryCatches(code);
            initJumps();
            this.debugInfoOffset = code.m598d();
        } catch (Exception e) {
            if (!this.noCode) {
                this.noCode = true;
                load();
                this.noCode = false;
            }
            throw new DecodeException(this, "Load method exception", e);
        }
    }

    public SSAVar makeNewSVar(int i, int i2, RegisterArg registerArg) {
        SSAVar sSAVar = new SSAVar(i, i2, registerArg);
        if (this.sVars.isEmpty()) {
            this.sVars = new ArrayList();
        }
        this.sVars.add(sSAVar);
        return sSAVar;
    }

    public void registerLoop(LoopInfo loopInfo) {
        if (this.loops.isEmpty()) {
            this.loops = new ArrayList(5);
        }
        loopInfo.setId(this.loops.size());
        this.loops.add(loopInfo);
    }

    public RegisterArg removeFirstArgument() {
        add(AFlag.SKIP_FIRST_ARG);
        return (RegisterArg) this.argsList.remove(0);
    }

    public void removeSVar(SSAVar sSAVar) {
        this.sVars.remove(sSAVar);
    }

    public void setEnterBlock(BlockNode blockNode) {
        this.enterBlock = blockNode;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public String toString() {
        return this.parentClass + Deobfuscator.CLASS_NAME_SEPARATOR + this.mthInfo.getName() + "(" + Utils.listToString(this.mthInfo.getArgumentsTypes()) + "):" + this.retType;
    }

    @Override // jadx.core.dex.nodes.ILoadable
    public void unload() {
        if (this.noCode) {
            return;
        }
        this.instructions = null;
        this.blocks = null;
        this.exitBlocks = null;
        this.exceptionHandlers.clear();
    }

    public void unloadInsnArr() {
        this.instructions = null;
    }
}
