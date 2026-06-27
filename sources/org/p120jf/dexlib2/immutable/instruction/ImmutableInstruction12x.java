package org.p120jf.dexlib2.immutable.instruction;

import org.p120jf.dexlib2.Format;
import org.p120jf.dexlib2.Opcode;
import org.p120jf.dexlib2.iface.instruction.formats.Instruction12x;
import org.p120jf.dexlib2.util.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public class ImmutableInstruction12x extends ImmutableInstruction implements Instruction12x {
    public static final Format FORMAT = Format.Format12x;
    public final int registerA;
    public final int registerB;

    public ImmutableInstruction12x(Opcode opcode, int i, int i2) {
        super(opcode);
        this.registerA = Preconditions.checkNibbleRegister(i);
        this.registerB = Preconditions.checkNibbleRegister(i2);
    }

    /* JADX INFO: renamed from: of */
    public static ImmutableInstruction12x m4256of(Instruction12x instruction12x) {
        return instruction12x instanceof ImmutableInstruction12x ? (ImmutableInstruction12x) instruction12x : new ImmutableInstruction12x(instruction12x.getOpcode(), instruction12x.getRegisterA(), instruction12x.getRegisterB());
    }

    @Override // org.p120jf.dexlib2.immutable.instruction.ImmutableInstruction
    public Format getFormat() {
        return FORMAT;
    }

    @Override // org.p120jf.dexlib2.iface.instruction.OneRegisterInstruction
    public int getRegisterA() {
        return this.registerA;
    }

    @Override // org.p120jf.dexlib2.iface.instruction.TwoRegisterInstruction
    public int getRegisterB() {
        return this.registerB;
    }
}
