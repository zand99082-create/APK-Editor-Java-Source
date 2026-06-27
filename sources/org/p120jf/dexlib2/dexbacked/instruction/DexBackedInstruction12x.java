package org.p120jf.dexlib2.dexbacked.instruction;

import org.p120jf.dexlib2.Opcode;
import org.p120jf.dexlib2.dexbacked.DexBackedDexFile;
import org.p120jf.dexlib2.iface.instruction.formats.Instruction12x;
import org.p120jf.util.NibbleUtils;

/* JADX INFO: loaded from: classes.dex */
public class DexBackedInstruction12x extends DexBackedInstruction implements Instruction12x {
    public DexBackedInstruction12x(DexBackedDexFile dexBackedDexFile, Opcode opcode, int i) {
        super(dexBackedDexFile, opcode, i);
    }

    @Override // org.p120jf.dexlib2.iface.instruction.OneRegisterInstruction
    public int getRegisterA() {
        return NibbleUtils.extractLowUnsignedNibble(this.dexFile.getDataBuffer().readByte(this.instructionStart + 1));
    }

    @Override // org.p120jf.dexlib2.iface.instruction.TwoRegisterInstruction
    public int getRegisterB() {
        return NibbleUtils.extractHighUnsignedNibble(this.dexFile.getDataBuffer().readByte(this.instructionStart + 1));
    }
}
