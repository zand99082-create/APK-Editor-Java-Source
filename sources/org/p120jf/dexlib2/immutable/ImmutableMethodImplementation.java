package org.p120jf.dexlib2.immutable;

import com.google.common.collect.ImmutableList;
import java.util.List;
import org.p120jf.dexlib2.iface.ExceptionHandler;
import org.p120jf.dexlib2.iface.MethodImplementation;
import org.p120jf.dexlib2.iface.TryBlock;
import org.p120jf.dexlib2.iface.debug.DebugItem;
import org.p120jf.dexlib2.iface.instruction.Instruction;
import org.p120jf.dexlib2.immutable.debug.ImmutableDebugItem;
import org.p120jf.dexlib2.immutable.instruction.ImmutableInstruction;

/* JADX INFO: loaded from: classes.dex */
public class ImmutableMethodImplementation implements MethodImplementation {
    public final ImmutableList<? extends ImmutableDebugItem> debugItems;
    public final ImmutableList<? extends ImmutableInstruction> instructions;
    public final int registerCount;
    public final ImmutableList<? extends ImmutableTryBlock> tryBlocks;

    public ImmutableMethodImplementation(int i, Iterable<? extends Instruction> iterable, List<? extends TryBlock<? extends ExceptionHandler>> list, Iterable<? extends DebugItem> iterable2) {
        this.registerCount = i;
        this.instructions = ImmutableInstruction.immutableListOf(iterable);
        this.tryBlocks = ImmutableTryBlock.immutableListOf(list);
        this.debugItems = ImmutableDebugItem.immutableListOf(iterable2);
    }

    /* JADX INFO: renamed from: of */
    public static ImmutableMethodImplementation m4239of(MethodImplementation methodImplementation) {
        if (methodImplementation == null) {
            return null;
        }
        return methodImplementation instanceof ImmutableMethodImplementation ? (ImmutableMethodImplementation) methodImplementation : new ImmutableMethodImplementation(methodImplementation.getRegisterCount(), methodImplementation.getInstructions(), methodImplementation.getTryBlocks(), methodImplementation.getDebugItems());
    }

    @Override // org.p120jf.dexlib2.iface.MethodImplementation
    public ImmutableList<? extends ImmutableDebugItem> getDebugItems() {
        return this.debugItems;
    }

    @Override // org.p120jf.dexlib2.iface.MethodImplementation
    public ImmutableList<? extends ImmutableInstruction> getInstructions() {
        return this.instructions;
    }

    @Override // org.p120jf.dexlib2.iface.MethodImplementation
    public int getRegisterCount() {
        return this.registerCount;
    }

    @Override // org.p120jf.dexlib2.iface.MethodImplementation
    public ImmutableList<? extends ImmutableTryBlock> getTryBlocks() {
        return this.tryBlocks;
    }
}
