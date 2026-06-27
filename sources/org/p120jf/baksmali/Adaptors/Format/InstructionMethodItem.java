package org.p120jf.baksmali.Adaptors.Format;

import android.support.v7.appcompat.C0327R;
import java.io.IOException;
import org.p120jf.baksmali.Adaptors.MethodDefinition;
import org.p120jf.baksmali.Adaptors.MethodItem;
import org.p120jf.baksmali.BaksmaliOptions;
import org.p120jf.baksmali.formatter.BaksmaliWriter;
import org.p120jf.dexlib2.Format;
import org.p120jf.dexlib2.Opcode;
import org.p120jf.dexlib2.VerificationError;
import org.p120jf.dexlib2.iface.instruction.DualReferenceInstruction;
import org.p120jf.dexlib2.iface.instruction.FieldOffsetInstruction;
import org.p120jf.dexlib2.iface.instruction.FiveRegisterInstruction;
import org.p120jf.dexlib2.iface.instruction.InlineIndexInstruction;
import org.p120jf.dexlib2.iface.instruction.Instruction;
import org.p120jf.dexlib2.iface.instruction.NarrowLiteralInstruction;
import org.p120jf.dexlib2.iface.instruction.OneRegisterInstruction;
import org.p120jf.dexlib2.iface.instruction.ReferenceInstruction;
import org.p120jf.dexlib2.iface.instruction.RegisterRangeInstruction;
import org.p120jf.dexlib2.iface.instruction.ThreeRegisterInstruction;
import org.p120jf.dexlib2.iface.instruction.TwoRegisterInstruction;
import org.p120jf.dexlib2.iface.instruction.VtableIndexInstruction;
import org.p120jf.dexlib2.iface.instruction.WideLiteralInstruction;
import org.p120jf.dexlib2.iface.instruction.formats.Instruction20bc;
import org.p120jf.dexlib2.iface.instruction.formats.Instruction31t;
import org.p120jf.dexlib2.iface.instruction.formats.UnknownInstruction;
import org.p120jf.dexlib2.iface.reference.Reference;
import org.p120jf.util.ExceptionWithContext;
import org.p120jf.util.NumberUtils;

/* JADX INFO: loaded from: classes.dex */
public class InstructionMethodItem<T extends Instruction> extends MethodItem {
    public final T instruction;
    public final MethodDefinition methodDef;

    /* JADX INFO: renamed from: org.jf.baksmali.Adaptors.Format.InstructionMethodItem$5 */
    public static /* synthetic */ class C18055 {
        public static final /* synthetic */ int[] $SwitchMap$org$jf$dexlib2$Format;
        public static final /* synthetic */ int[] $SwitchMap$org$jf$dexlib2$Opcode;

        static {
            int[] iArr = new int[Format.values().length];
            $SwitchMap$org$jf$dexlib2$Format = iArr;
            try {
                iArr[Format.Format10t.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format20t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format30t.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format10x.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format11n.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format11x.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format12x.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format20bc.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format21c.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format31c.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format21ih.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format21lh.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format21s.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format31i.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format51l.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format21t.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format31t.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format22b.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format22s.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format22c.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format22cs.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format22t.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format22x.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format32x.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format23x.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format35c.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format35mi.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format35ms.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format3rc.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format3rmi.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format3rms.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format45cc.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format4rcc.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            int[] iArr2 = new int[Opcode.values().length];
            $SwitchMap$org$jf$dexlib2$Opcode = iArr2;
            try {
                iArr2[Opcode.PACKED_SWITCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Opcode[Opcode.SPARSE_SWITCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Opcode[Opcode.FILL_ARRAY_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused36) {
            }
        }
    }

    public interface Writable {
        void write() throws IOException;
    }

    public InstructionMethodItem(MethodDefinition methodDefinition, int i, T t) {
        super(i);
        this.methodDef = methodDefinition;
        this.instruction = t;
    }

    @Override // org.p120jf.baksmali.Adaptors.MethodItem
    public double getSortOrder() {
        return 100.0d;
    }

    public final boolean isAllowedOdex(Opcode opcode) {
        BaksmaliOptions baksmaliOptions = this.methodDef.classDef.options;
        if (baksmaliOptions.allowOdex) {
            return true;
        }
        if (baksmaliOptions.apiLevel >= 14) {
            return false;
        }
        return opcode.isVolatileFieldAccessor() || opcode == Opcode.THROW_VERIFICATION_ERROR;
    }

    public void writeCommentIfLikelyDouble(BaksmaliWriter baksmaliWriter) throws IOException {
        writeCommentIfLikelyDouble(baksmaliWriter, ((WideLiteralInstruction) this.instruction).getWideLiteral());
    }

    public void writeCommentIfLikelyDouble(BaksmaliWriter baksmaliWriter, long j) throws IOException {
        if (NumberUtils.isLikelyDouble(j)) {
            baksmaliWriter.write("    # ");
            double dLongBitsToDouble = Double.longBitsToDouble(j);
            if (dLongBitsToDouble == Double.POSITIVE_INFINITY) {
                baksmaliWriter.write("Double.POSITIVE_INFINITY");
                return;
            }
            if (dLongBitsToDouble == Double.NEGATIVE_INFINITY) {
                baksmaliWriter.write("Double.NEGATIVE_INFINITY");
                return;
            }
            if (Double.isNaN(dLongBitsToDouble)) {
                baksmaliWriter.write("Double.NaN");
                return;
            }
            if (dLongBitsToDouble == Double.MAX_VALUE) {
                baksmaliWriter.write("Double.MAX_VALUE");
                return;
            }
            if (dLongBitsToDouble == 3.141592653589793d) {
                baksmaliWriter.write("Math.PI");
            } else if (dLongBitsToDouble == 2.718281828459045d) {
                baksmaliWriter.write("Math.E");
            } else {
                baksmaliWriter.write(Double.toString(dLongBitsToDouble));
            }
        }
    }

    public void writeCommentIfLikelyFloat(BaksmaliWriter baksmaliWriter) throws IOException {
        writeCommentIfLikelyFloat(baksmaliWriter, ((NarrowLiteralInstruction) this.instruction).getNarrowLiteral());
    }

    public void writeCommentIfLikelyFloat(BaksmaliWriter baksmaliWriter, int i) throws IOException {
        if (NumberUtils.isLikelyFloat(i)) {
            baksmaliWriter.write("    # ");
            float fIntBitsToFloat = Float.intBitsToFloat(i);
            if (fIntBitsToFloat == Float.POSITIVE_INFINITY) {
                baksmaliWriter.write("Float.POSITIVE_INFINITY");
                return;
            }
            if (fIntBitsToFloat == Float.NEGATIVE_INFINITY) {
                baksmaliWriter.write("Float.NEGATIVE_INFINITY");
                return;
            }
            if (Float.isNaN(fIntBitsToFloat)) {
                baksmaliWriter.write("Float.NaN");
                return;
            }
            if (fIntBitsToFloat == Float.MAX_VALUE) {
                baksmaliWriter.write("Float.MAX_VALUE");
                return;
            }
            if (fIntBitsToFloat == 3.1415927f) {
                baksmaliWriter.write("(float)Math.PI");
            } else if (fIntBitsToFloat == 2.7182817f) {
                baksmaliWriter.write("(float)Math.E");
            } else {
                baksmaliWriter.write(Float.toString(fIntBitsToFloat));
                baksmaliWriter.write(C0327R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle);
            }
        }
    }

    public boolean writeCommentIfResourceId(BaksmaliWriter baksmaliWriter) throws IOException {
        return writeCommentIfResourceId(baksmaliWriter, ((NarrowLiteralInstruction) this.instruction).getNarrowLiteral());
    }

    public boolean writeCommentIfResourceId(BaksmaliWriter baksmaliWriter, int i) throws IOException {
        String str = this.methodDef.classDef.options.resourceIds.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        baksmaliWriter.write("    # ");
        baksmaliWriter.write(str);
        return true;
    }

    public void writeFieldOffset(BaksmaliWriter baksmaliWriter) throws IOException {
        baksmaliWriter.write("field@0x");
        baksmaliWriter.writeUnsignedLongAsHex(((FieldOffsetInstruction) this.instruction).getFieldOffset());
    }

    public void writeFirstRegister(BaksmaliWriter baksmaliWriter) throws IOException {
        writeRegister(baksmaliWriter, ((OneRegisterInstruction) this.instruction).getRegisterA());
    }

    public void writeInlineIndex(BaksmaliWriter baksmaliWriter) throws IOException {
        baksmaliWriter.write("inline@");
        baksmaliWriter.writeSignedIntAsDec(((InlineIndexInstruction) this.instruction).getInlineIndex());
    }

    public void writeInvokeRangeRegisters(BaksmaliWriter baksmaliWriter) throws IOException {
        RegisterRangeInstruction registerRangeInstruction = (RegisterRangeInstruction) this.instruction;
        if (registerRangeInstruction.getRegisterCount() == 0) {
            baksmaliWriter.write("{}");
        } else {
            this.methodDef.registerFormatter.writeRegisterRange(baksmaliWriter, registerRangeInstruction.getStartRegister(), (r1 + r0) - 1);
        }
    }

    public void writeInvokeRegisters(BaksmaliWriter baksmaliWriter) throws IOException {
        FiveRegisterInstruction fiveRegisterInstruction = (FiveRegisterInstruction) this.instruction;
        int registerCount = fiveRegisterInstruction.getRegisterCount();
        baksmaliWriter.write(123);
        if (registerCount == 1) {
            writeRegister(baksmaliWriter, fiveRegisterInstruction.getRegisterC());
        } else if (registerCount == 2) {
            writeRegister(baksmaliWriter, fiveRegisterInstruction.getRegisterC());
            baksmaliWriter.write(", ");
            writeRegister(baksmaliWriter, fiveRegisterInstruction.getRegisterD());
        } else if (registerCount == 3) {
            writeRegister(baksmaliWriter, fiveRegisterInstruction.getRegisterC());
            baksmaliWriter.write(", ");
            writeRegister(baksmaliWriter, fiveRegisterInstruction.getRegisterD());
            baksmaliWriter.write(", ");
            writeRegister(baksmaliWriter, fiveRegisterInstruction.getRegisterE());
        } else if (registerCount == 4) {
            writeRegister(baksmaliWriter, fiveRegisterInstruction.getRegisterC());
            baksmaliWriter.write(", ");
            writeRegister(baksmaliWriter, fiveRegisterInstruction.getRegisterD());
            baksmaliWriter.write(", ");
            writeRegister(baksmaliWriter, fiveRegisterInstruction.getRegisterE());
            baksmaliWriter.write(", ");
            writeRegister(baksmaliWriter, fiveRegisterInstruction.getRegisterF());
        } else if (registerCount == 5) {
            writeRegister(baksmaliWriter, fiveRegisterInstruction.getRegisterC());
            baksmaliWriter.write(", ");
            writeRegister(baksmaliWriter, fiveRegisterInstruction.getRegisterD());
            baksmaliWriter.write(", ");
            writeRegister(baksmaliWriter, fiveRegisterInstruction.getRegisterE());
            baksmaliWriter.write(", ");
            writeRegister(baksmaliWriter, fiveRegisterInstruction.getRegisterF());
            baksmaliWriter.write(", ");
            writeRegister(baksmaliWriter, fiveRegisterInstruction.getRegisterG());
        }
        baksmaliWriter.write(125);
    }

    public void writeLiteral(BaksmaliWriter baksmaliWriter) throws IOException {
        baksmaliWriter.writeSignedIntOrLongTo(((WideLiteralInstruction) this.instruction).getWideLiteral());
    }

    public void writeOpcode(BaksmaliWriter baksmaliWriter) throws IOException {
        baksmaliWriter.write(this.instruction.getOpcode().name);
    }

    public void writeRegister(BaksmaliWriter baksmaliWriter, int i) throws IOException {
        this.methodDef.registerFormatter.writeTo(baksmaliWriter, i);
    }

    public void writeSecondRegister(BaksmaliWriter baksmaliWriter) throws IOException {
        writeRegister(baksmaliWriter, ((TwoRegisterInstruction) this.instruction).getRegisterB());
    }

    public void writeTargetLabel(BaksmaliWriter baksmaliWriter) throws IOException {
        throw new RuntimeException();
    }

    public void writeThirdRegister(BaksmaliWriter baksmaliWriter) throws IOException {
        writeRegister(baksmaliWriter, ((ThreeRegisterInstruction) this.instruction).getRegisterC());
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f2  */
    @Override // org.p120jf.baksmali.Adaptors.MethodItem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean writeTo(final BaksmaliWriter baksmaliWriter) throws IOException {
        String verificationErrorName;
        Writable writable;
        boolean z;
        boolean z2;
        Writable writable2;
        Opcode opcode = this.instruction.getOpcode();
        T t = this.instruction;
        Writable writable3 = null;
        if (t instanceof Instruction20bc) {
            int verificationError = ((Instruction20bc) t).getVerificationError();
            verificationErrorName = VerificationError.getVerificationErrorName(verificationError);
            if (verificationErrorName == null) {
                baksmaliWriter.write("#was invalid verification error type: ");
                baksmaliWriter.writeSignedIntAsDec(verificationError);
                baksmaliWriter.write("\n");
                verificationErrorName = "generic-error";
            }
        } else {
            verificationErrorName = null;
        }
        T t2 = this.instruction;
        if (t2 instanceof ReferenceInstruction) {
            final Reference reference = ((ReferenceInstruction) t2).getReference();
            try {
                reference.validateReference();
                writable2 = new Writable(this) { // from class: org.jf.baksmali.Adaptors.Format.InstructionMethodItem.1
                    @Override // org.jf.baksmali.Adaptors.Format.InstructionMethodItem.Writable
                    public void write() throws IOException {
                        baksmaliWriter.writeReference(reference);
                    }
                };
                z = false;
            } catch (Reference.InvalidReferenceException e) {
                baksmaliWriter.write("#");
                baksmaliWriter.write(e.getMessage());
                baksmaliWriter.write("\n");
                writable2 = new Writable(this) { // from class: org.jf.baksmali.Adaptors.Format.InstructionMethodItem.2
                    @Override // org.jf.baksmali.Adaptors.Format.InstructionMethodItem.Writable
                    public void write() throws IOException {
                        baksmaliWriter.write(e.getInvalidReferenceRepresentation());
                    }
                };
                z = true;
            }
            T t3 = this.instruction;
            if (t3 instanceof DualReferenceInstruction) {
                try {
                    final Reference reference2 = ((DualReferenceInstruction) t3).getReference2();
                    reference2.validateReference();
                    writable = new Writable(this) { // from class: org.jf.baksmali.Adaptors.Format.InstructionMethodItem.3
                        @Override // org.jf.baksmali.Adaptors.Format.InstructionMethodItem.Writable
                        public void write() throws IOException {
                            baksmaliWriter.writeReference(reference2);
                        }
                    };
                } catch (Reference.InvalidReferenceException e2) {
                    baksmaliWriter.write("#");
                    baksmaliWriter.write(e2.getMessage());
                    baksmaliWriter.write("\n");
                    Writable writable4 = new Writable(this) { // from class: org.jf.baksmali.Adaptors.Format.InstructionMethodItem.4
                        @Override // org.jf.baksmali.Adaptors.Format.InstructionMethodItem.Writable
                        public void write() throws IOException {
                            baksmaliWriter.write(e2.getInvalidReferenceRepresentation());
                        }
                    };
                    writable = null;
                    z = true;
                    writable3 = writable4;
                }
            } else {
                writable = null;
            }
            writable3 = writable2;
        } else {
            writable = null;
            z = false;
        }
        T t4 = this.instruction;
        if (t4 instanceof Instruction31t) {
            int i = C18055.$SwitchMap$org$jf$dexlib2$Opcode[t4.getOpcode().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    z2 = this.methodDef.getSparseSwitchBaseAddress(this.codeAddress + ((Instruction31t) this.instruction).getCodeOffset()) != -1;
                } else {
                    if (i != 3) {
                        throw new ExceptionWithContext("Invalid 31t opcode: %s", this.instruction.getOpcode());
                    }
                    try {
                        this.methodDef.findPayloadOffset(this.codeAddress + ((Instruction31t) this.instruction).getCodeOffset(), Opcode.ARRAY_PAYLOAD);
                    } catch (MethodDefinition.InvalidSwitchPayload unused) {
                    }
                }
            } else if (this.methodDef.getPackedSwitchBaseAddress(this.codeAddress + ((Instruction31t) this.instruction).getCodeOffset()) == -1) {
            }
            if (!z2) {
                baksmaliWriter.write("#invalid payload reference\n");
                z = true;
            }
        }
        if (opcode.odexOnly() && !isAllowedOdex(opcode)) {
            baksmaliWriter.write("#disallowed odex opcode\n");
            z = true;
        }
        if (z) {
            baksmaliWriter.write("#");
        }
        switch (C18055.$SwitchMap$org$jf$dexlib2$Format[this.instruction.getOpcode().format.ordinal()]) {
            case 1:
            case 2:
            case 3:
                writeOpcode(baksmaliWriter);
                baksmaliWriter.write(32);
                writeTargetLabel(baksmaliWriter);
                break;
            case 4:
                if (this.instruction instanceof UnknownInstruction) {
                    baksmaliWriter.write("#unknown opcode: 0x");
                    baksmaliWriter.writeUnsignedLongAsHex(((UnknownInstruction) this.instruction).getOriginalOpcode());
                    baksmaliWriter.write(10);
                }
                writeOpcode(baksmaliWriter);
                break;
            case 5:
                writeOpcode(baksmaliWriter);
                baksmaliWriter.write(32);
                writeFirstRegister(baksmaliWriter);
                baksmaliWriter.write(", ");
                writeLiteral(baksmaliWriter);
                break;
            case 6:
                writeOpcode(baksmaliWriter);
                baksmaliWriter.write(32);
                writeFirstRegister(baksmaliWriter);
                break;
            case 7:
                writeOpcode(baksmaliWriter);
                baksmaliWriter.write(32);
                writeFirstRegister(baksmaliWriter);
                baksmaliWriter.write(", ");
                writeSecondRegister(baksmaliWriter);
                break;
            case 8:
                writeOpcode(baksmaliWriter);
                baksmaliWriter.write(32);
                baksmaliWriter.write(verificationErrorName);
                baksmaliWriter.write(", ");
                writable3.write();
                break;
            case 9:
            case 10:
                writeOpcode(baksmaliWriter);
                baksmaliWriter.write(32);
                writeFirstRegister(baksmaliWriter);
                baksmaliWriter.write(", ");
                writable3.write();
                break;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                writeOpcode(baksmaliWriter);
                baksmaliWriter.write(32);
                writeFirstRegister(baksmaliWriter);
                baksmaliWriter.write(", ");
                writeLiteral(baksmaliWriter);
                if (this.instruction.getOpcode().setsWideRegister()) {
                    writeCommentIfLikelyDouble(baksmaliWriter);
                } else if (!writeCommentIfResourceId(baksmaliWriter)) {
                    writeCommentIfLikelyFloat(baksmaliWriter);
                }
                break;
            case 16:
            case 17:
                writeOpcode(baksmaliWriter);
                baksmaliWriter.write(32);
                writeFirstRegister(baksmaliWriter);
                baksmaliWriter.write(", ");
                writeTargetLabel(baksmaliWriter);
                break;
            case 18:
            case 19:
                writeOpcode(baksmaliWriter);
                baksmaliWriter.write(32);
                writeFirstRegister(baksmaliWriter);
                baksmaliWriter.write(", ");
                writeSecondRegister(baksmaliWriter);
                baksmaliWriter.write(", ");
                writeLiteral(baksmaliWriter);
                break;
            case 20:
                writeOpcode(baksmaliWriter);
                baksmaliWriter.write(32);
                writeFirstRegister(baksmaliWriter);
                baksmaliWriter.write(", ");
                writeSecondRegister(baksmaliWriter);
                baksmaliWriter.write(", ");
                writable3.write();
                break;
            case 21:
                writeOpcode(baksmaliWriter);
                baksmaliWriter.write(32);
                writeFirstRegister(baksmaliWriter);
                baksmaliWriter.write(", ");
                writeSecondRegister(baksmaliWriter);
                baksmaliWriter.write(", ");
                writeFieldOffset(baksmaliWriter);
                break;
            case 22:
                writeOpcode(baksmaliWriter);
                baksmaliWriter.write(32);
                writeFirstRegister(baksmaliWriter);
                baksmaliWriter.write(", ");
                writeSecondRegister(baksmaliWriter);
                baksmaliWriter.write(", ");
                writeTargetLabel(baksmaliWriter);
                break;
            case 23:
            case 24:
                writeOpcode(baksmaliWriter);
                baksmaliWriter.write(32);
                writeFirstRegister(baksmaliWriter);
                baksmaliWriter.write(", ");
                writeSecondRegister(baksmaliWriter);
                break;
            case 25:
                writeOpcode(baksmaliWriter);
                baksmaliWriter.write(32);
                writeFirstRegister(baksmaliWriter);
                baksmaliWriter.write(", ");
                writeSecondRegister(baksmaliWriter);
                baksmaliWriter.write(", ");
                writeThirdRegister(baksmaliWriter);
                break;
            case 26:
                writeOpcode(baksmaliWriter);
                baksmaliWriter.write(32);
                writeInvokeRegisters(baksmaliWriter);
                baksmaliWriter.write(", ");
                writable3.write();
                break;
            case 27:
                writeOpcode(baksmaliWriter);
                baksmaliWriter.write(32);
                writeInvokeRegisters(baksmaliWriter);
                baksmaliWriter.write(", ");
                writeInlineIndex(baksmaliWriter);
                break;
            case 28:
                writeOpcode(baksmaliWriter);
                baksmaliWriter.write(32);
                writeInvokeRegisters(baksmaliWriter);
                baksmaliWriter.write(", ");
                writeVtableIndex(baksmaliWriter);
                break;
            case 29:
                writeOpcode(baksmaliWriter);
                baksmaliWriter.write(32);
                writeInvokeRangeRegisters(baksmaliWriter);
                baksmaliWriter.write(", ");
                writable3.write();
                break;
            case 30:
                writeOpcode(baksmaliWriter);
                baksmaliWriter.write(32);
                writeInvokeRangeRegisters(baksmaliWriter);
                baksmaliWriter.write(", ");
                writeInlineIndex(baksmaliWriter);
                break;
            case 31:
                writeOpcode(baksmaliWriter);
                baksmaliWriter.write(32);
                writeInvokeRangeRegisters(baksmaliWriter);
                baksmaliWriter.write(", ");
                writeVtableIndex(baksmaliWriter);
                break;
            case 32:
                writeOpcode(baksmaliWriter);
                baksmaliWriter.write(32);
                writeInvokeRegisters(baksmaliWriter);
                baksmaliWriter.write(", ");
                writable3.write();
                baksmaliWriter.write(", ");
                writable.write();
                break;
            case 33:
                writeOpcode(baksmaliWriter);
                baksmaliWriter.write(32);
                writeInvokeRangeRegisters(baksmaliWriter);
                baksmaliWriter.write(", ");
                writable3.write();
                baksmaliWriter.write(", ");
                writable.write();
                break;
            default:
                return false;
        }
        if (z) {
            baksmaliWriter.write("\nnop");
        }
        return true;
    }

    public void writeVtableIndex(BaksmaliWriter baksmaliWriter) throws IOException {
        baksmaliWriter.write("vtable@");
        baksmaliWriter.writeSignedIntAsDec(((VtableIndexInstruction) this.instruction).getVtableIndex());
    }
}
