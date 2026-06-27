package org.p120jf.dexlib2.immutable.instruction;

import org.p120jf.dexlib2.Format;
import org.p120jf.dexlib2.Opcode;
import org.p120jf.dexlib2.iface.instruction.formats.Instruction21c;
import org.p120jf.dexlib2.iface.reference.Reference;
import org.p120jf.dexlib2.immutable.reference.ImmutableReference;
import org.p120jf.dexlib2.immutable.reference.ImmutableReferenceFactory;
import org.p120jf.dexlib2.util.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public class ImmutableInstruction21c extends ImmutableInstruction implements Instruction21c {
    public static final Format FORMAT = Format.Format21c;
    public final ImmutableReference reference;
    public final int registerA;

    public ImmutableInstruction21c(Opcode opcode, int i, Reference reference) {
        super(opcode);
        this.registerA = Preconditions.checkByteRegister(i);
        this.reference = ImmutableReferenceFactory.m4294of(opcode.referenceType, reference);
    }

    /* JADX INFO: renamed from: of */
    public static ImmutableInstruction21c m4259of(Instruction21c instruction21c) {
        return instruction21c instanceof ImmutableInstruction21c ? (ImmutableInstruction21c) instruction21c : new ImmutableInstruction21c(instruction21c.getOpcode(), instruction21c.getRegisterA(), instruction21c.getReference());
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
