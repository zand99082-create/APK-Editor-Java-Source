package org.p120jf.dexlib2.immutable.instruction;

import org.p120jf.dexlib2.Format;
import org.p120jf.dexlib2.Opcode;
import org.p120jf.dexlib2.iface.instruction.formats.Instruction31c;
import org.p120jf.dexlib2.iface.reference.Reference;
import org.p120jf.dexlib2.immutable.reference.ImmutableReference;
import org.p120jf.dexlib2.immutable.reference.ImmutableReferenceFactory;
import org.p120jf.dexlib2.util.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public class ImmutableInstruction31c extends ImmutableInstruction implements Instruction31c {
    public static final Format FORMAT = Format.Format31c;
    public final ImmutableReference reference;
    public final int registerA;

    public ImmutableInstruction31c(Opcode opcode, int i, Reference reference) {
        super(opcode);
        this.registerA = Preconditions.checkByteRegister(i);
        this.reference = ImmutableReferenceFactory.m4294of(opcode.referenceType, reference);
    }

    /* JADX INFO: renamed from: of */
    public static ImmutableInstruction31c m4272of(Instruction31c instruction31c) {
        return instruction31c instanceof ImmutableInstruction31c ? (ImmutableInstruction31c) instruction31c : new ImmutableInstruction31c(instruction31c.getOpcode(), instruction31c.getRegisterA(), instruction31c.getReference());
    }

    @Override // org.p120jf.dexlib2.immutable.instruction.ImmutableInstruction
    public Format getFormat() {
        return FORMAT;
    }

    @Override // org.p120jf.dexlib2.iface.instruction.ReferenceInstruction
    public ImmutableReference getReference() {
        return this.reference;
    }

    @Override // org.p120jf.dexlib2.iface.instruction.ReferenceInstruction
    public int getReferenceType() {
        return this.opcode.referenceType;
    }

    @Override // org.p120jf.dexlib2.iface.instruction.OneRegisterInstruction
    public int getRegisterA() {
        return this.registerA;
    }
}
