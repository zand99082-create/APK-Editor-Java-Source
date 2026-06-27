package jadx.core.dex.instructions;

import com.p046a.p049b.p063d.p064a.AbstractC0774f;
import jadx.core.dex.attributes.AFlag;
import jadx.core.dex.instructions.args.ArgType;
import jadx.core.dex.instructions.args.InsnArg;
import jadx.core.dex.instructions.args.RegisterArg;
import jadx.core.dex.nodes.InsnNode;
import jadx.core.utils.InsnUtils;

/* JADX INFO: loaded from: classes.dex */
public class ArithNode extends InsnNode {

    /* JADX INFO: renamed from: op */
    private final ArithOp f5163op;

    public ArithNode(AbstractC0774f abstractC0774f, ArithOp arithOp, ArgType argType, boolean z) {
        super(InsnType.ARITH, 2);
        this.f5163op = arithOp;
        setResult(InsnArg.reg(abstractC0774f, 0, argType));
        int iMo1526m = abstractC0774f.mo1526m();
        if (z) {
            if (iMo1526m == 1) {
                addReg(abstractC0774f, 0, argType);
                addLit(abstractC0774f, argType);
                return;
            } else {
                if (iMo1526m == 2) {
                    addReg(abstractC0774f, 1, argType);
                    addLit(abstractC0774f, argType);
                    return;
                }
                return;
            }
        }
        if (iMo1526m == 2) {
            addReg(abstractC0774f, 0, argType);
            addReg(abstractC0774f, 1, argType);
        } else if (iMo1526m == 3) {
            addReg(abstractC0774f, 1, argType);
            addReg(abstractC0774f, 2, argType);
        }
    }

    public ArithNode(ArithOp arithOp, RegisterArg registerArg, InsnArg insnArg) {
        this(arithOp, registerArg, registerArg, insnArg);
        add(AFlag.ARITH_ONEARG);
    }

    public ArithNode(ArithOp arithOp, RegisterArg registerArg, InsnArg insnArg, InsnArg insnArg2) {
        super(InsnType.ARITH, 2);
        this.f5163op = arithOp;
        setResult(registerArg);
        addArg(insnArg);
        addArg(insnArg2);
    }

    public ArithOp getOp() {
        return this.f5163op;
    }

    @Override // jadx.core.dex.nodes.InsnNode
    public boolean isSame(InsnNode insnNode) {
        if (this == insnNode) {
            return true;
        }
        if ((insnNode instanceof ArithNode) && super.isSame(insnNode)) {
            return this.f5163op == ((ArithNode) insnNode).f5163op;
        }
        return false;
    }

    @Override // jadx.core.dex.nodes.InsnNode
    public String toString() {
        return InsnUtils.formatOffset(this.offset) + ": " + InsnUtils.insnTypeToString(this.insnType) + getResult() + " = " + getArg(0) + " " + this.f5163op.getSymbol() + " " + getArg(1);
    }
}
