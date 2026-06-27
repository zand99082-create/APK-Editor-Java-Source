package jadx.core.dex.instructions;

import com.p046a.p049b.p063d.p064a.AbstractC0774f;
import jadx.core.dex.info.MethodInfo;
import jadx.core.dex.instructions.args.ArgType;
import jadx.core.dex.instructions.args.InsnArg;
import jadx.core.dex.nodes.InsnNode;
import jadx.core.utils.InsnUtils;
import jadx.core.utils.Utils;

/* JADX INFO: loaded from: classes.dex */
public class InvokeNode extends InsnNode {
    private final MethodInfo mth;
    private final InvokeType type;

    public InvokeNode(MethodInfo methodInfo, AbstractC0774f abstractC0774f, InvokeType invokeType, boolean z, int i) {
        super(InsnType.INVOKE, (invokeType != InvokeType.STATIC ? 1 : 0) + methodInfo.getArgsCount());
        this.mth = methodInfo;
        this.type = invokeType;
        if (i >= 0) {
            setResult(InsnArg.reg(i, methodInfo.getReturnType()));
        }
        int iMo1527n = z ? abstractC0774f.mo1527n() : 0;
        if (invokeType != InvokeType.STATIC) {
            addReg(z ? iMo1527n : InsnUtils.getArg(abstractC0774f, iMo1527n), methodInfo.getDeclClass().getType());
            iMo1527n++;
        }
        int regCount = iMo1527n;
        for (ArgType argType : methodInfo.getArgumentsTypes()) {
            addReg(z ? regCount : InsnUtils.getArg(abstractC0774f, regCount), argType);
            regCount += argType.getRegCount();
        }
    }

    private InvokeNode(MethodInfo methodInfo, InvokeType invokeType, int i) {
        super(InsnType.INVOKE, i);
        this.mth = methodInfo;
        this.type = invokeType;
    }

    @Override // jadx.core.dex.nodes.InsnNode
    public InsnNode copy() {
        return copyCommonParams(new InvokeNode(this.mth, this.type, getArgsCount()));
    }

    public MethodInfo getCallMth() {
        return this.mth;
    }

    public InvokeType getInvokeType() {
        return this.type;
    }

    @Override // jadx.core.dex.nodes.InsnNode
    public boolean isSame(InsnNode insnNode) {
        if (this == insnNode) {
            return true;
        }
        if (!(insnNode instanceof InvokeNode) || !super.isSame(insnNode)) {
            return false;
        }
        InvokeNode invokeNode = (InvokeNode) insnNode;
        return this.type == invokeNode.type && this.mth.equals(invokeNode.mth);
    }

    @Override // jadx.core.dex.nodes.InsnNode
    public String toString() {
        return InsnUtils.formatOffset(this.offset) + ": " + InsnUtils.insnTypeToString(this.insnType) + (getResult() == null ? "" : getResult() + " = ") + Utils.listToString(getArguments()) + " " + this.mth + " type: " + this.type;
    }
}
