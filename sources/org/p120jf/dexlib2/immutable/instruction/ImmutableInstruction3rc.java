package org.p120jf.dexlib2.immutable.instruction;

import org.p120jf.dexlib2.Format;
import org.p120jf.dexlib2.Opcode;
import org.p120jf.dexlib2.iface.instruction.formats.Instruction3rc;
import org.p120jf.dexlib2.iface.reference.Reference;
import org.p120jf.dexlib2.immutable.reference.ImmutableReference;
import org.p120jf.dexlib2.immutable.reference.ImmutableReferenceFactory;
import org.p120jf.dexlib2.util.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public class ImmutableInstruction3rc extends ImmutableInstruction implements Instruction3rc {
    public static final Format FORMAT = Format.Format3rc;
    public final ImmutableReference reference;
    public final int registerCount;
    public final int startRegister;

    public ImmutableInstruction3rc(Opcode opcode, int i, int i2, Reference reference) {
        super(opcode);
        this.startRegister = Preconditions.checkShortRegister(i);
        this.registerCount = Preconditions.checkRegisterRangeCount(i2);
        this.reference = ImmutableReferenceFactory.m4294of(opcode.referenceType, reference);
    }

    /* JADX INFO: renamed from: of */
    public static ImmutableInstruction3rc m4279of(Instruction3rc instruction3rc) {
        return instruction3rc instanceof ImmutableInstruction3rc ? (ImmutableInstruction3rc) instruction3rc : new ImmutableInstruction3rc(instruction3rc.getOpcode(), instruction3rc.getStartRegister(), instruction3rc.getRegisterCount(), instruction3rc.getReference());
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

    @Override // org.p120jf.dexlib2.iface.instruction.VariableRegisterInstruction
    public int getRegisterCount() {
        return this.registerCount;
    }

    @Override // org.p120jf.dexlib2.iface.instruction.RegisterRangeInstruction
    public int getStartRegister() {
        return this.startRegister;
    }
}
