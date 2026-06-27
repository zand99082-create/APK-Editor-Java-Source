package org.p120jf.dexlib2.builder.instruction;

import org.p120jf.dexlib2.Format;
import org.p120jf.dexlib2.Opcode;
import org.p120jf.dexlib2.builder.BuilderInstruction;
import org.p120jf.dexlib2.iface.instruction.formats.Instruction11x;
import org.p120jf.dexlib2.util.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public class BuilderInstruction11x extends BuilderInstruction implements Instruction11x {
    public static final Format FORMAT = Format.Format11x;
    public final int registerA;

    public BuilderInstruction11x(Opcode opcode, int i) {
        super(opcode);
        this.registerA = Preconditions.checkByteRegister(i);
    }

    @Override // org.p120jf.dexlib2.builder.BuilderInstruction
    public Format getFormat() {
        return FORMAT;
    }

    @Override // org.p120jf.dexlib2.iface.instruction.OneRegisterInstruction
    public int getRegisterA() {
        return this.registerA;
    }
}
