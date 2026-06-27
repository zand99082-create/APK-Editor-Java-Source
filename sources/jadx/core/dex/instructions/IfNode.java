package jadx.core.dex.instructions;

import com.p046a.p049b.p063d.p064a.AbstractC0774f;
import jadx.core.dex.instructions.args.ArgType;
import jadx.core.dex.instructions.args.InsnArg;
import jadx.core.dex.instructions.args.PrimitiveType;
import jadx.core.dex.nodes.BlockNode;
import jadx.core.dex.nodes.InsnNode;
import jadx.core.utils.BlockUtils;
import jadx.core.utils.InsnUtils;

/* JADX INFO: loaded from: classes.dex */
public class IfNode extends GotoNode {
    private static final ArgType ARG_TYPE = ArgType.unknown(PrimitiveType.INT, PrimitiveType.OBJECT, PrimitiveType.ARRAY, PrimitiveType.BOOLEAN, PrimitiveType.BYTE, PrimitiveType.SHORT, PrimitiveType.CHAR);
    private BlockNode elseBlock;

    /* JADX INFO: renamed from: op */
    protected IfOp f5165op;
    private BlockNode thenBlock;

    public IfNode(AbstractC0774f abstractC0774f, IfOp ifOp) {
        this(ifOp, abstractC0774f.m1564g(), InsnArg.reg(abstractC0774f, 0, ARG_TYPE), abstractC0774f.mo1526m() == 1 ? InsnArg.lit(0L, ARG_TYPE) : InsnArg.reg(abstractC0774f, 1, ARG_TYPE));
    }

    public IfNode(IfOp ifOp, int i, InsnArg insnArg, InsnArg insnArg2) {
        super(InsnType.IF, i, 2);
        this.f5165op = ifOp;
        addArg(insnArg);
        addArg(insnArg2);
    }

    public void changeCondition(IfOp ifOp, InsnArg insnArg, InsnArg insnArg2) {
        this.f5165op = ifOp;
        setArg(0, insnArg);
        setArg(1, insnArg2);
    }

    public BlockNode getElseBlock() {
        return this.elseBlock;
    }

    public IfOp getOp() {
        return this.f5165op;
    }

    public BlockNode getThenBlock() {
        return this.thenBlock;
    }

    public void initBlocks(BlockNode blockNode) {
        this.thenBlock = BlockUtils.getBlockByOffset(this.target, blockNode.getSuccessors());
        if (blockNode.getSuccessors().size() == 1) {
            this.elseBlock = this.thenBlock;
        } else {
            this.elseBlock = BlockUtils.selectOther(this.thenBlock, blockNode.getSuccessors());
        }
    }

    public void invertCondition() {
        this.f5165op = this.f5165op.invert();
        BlockNode blockNode = this.thenBlock;
        this.thenBlock = this.elseBlock;
        this.elseBlock = blockNode;
        this.target = this.thenBlock.getStartOffset();
    }

    @Override // jadx.core.dex.nodes.InsnNode
    public boolean isSame(InsnNode insnNode) {
        if (this == insnNode) {
            return true;
        }
        if ((insnNode instanceof IfNode) && super.isSame(insnNode)) {
            return this.f5165op == ((IfNode) insnNode).f5165op;
        }
        return false;
    }

    @Override // jadx.core.dex.instructions.GotoNode, jadx.core.dex.nodes.InsnNode
    public String toString() {
        return InsnUtils.formatOffset(this.offset) + ": " + InsnUtils.insnTypeToString(this.insnType) + getArg(0) + " " + this.f5165op.getSymbol() + " " + getArg(1) + "  -> " + (this.thenBlock != null ? this.thenBlock : InsnUtils.formatOffset(this.target));
    }
}
