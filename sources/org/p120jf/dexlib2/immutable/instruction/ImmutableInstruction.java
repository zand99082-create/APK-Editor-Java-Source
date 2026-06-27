package org.p120jf.dexlib2.immutable.instruction;

import com.google.common.collect.ImmutableList;
import org.p120jf.dexlib2.Format;
import org.p120jf.dexlib2.Opcode;
import org.p120jf.dexlib2.iface.instruction.Instruction;
import org.p120jf.dexlib2.iface.instruction.formats.ArrayPayload;
import org.p120jf.dexlib2.iface.instruction.formats.Instruction10t;
import org.p120jf.dexlib2.iface.instruction.formats.Instruction10x;
import org.p120jf.dexlib2.iface.instruction.formats.Instruction11n;
import org.p120jf.dexlib2.iface.instruction.formats.Instruction11x;
import org.p120jf.dexlib2.iface.instruction.formats.Instruction12x;
import org.p120jf.dexlib2.iface.instruction.formats.Instruction20bc;
import org.p120jf.dexlib2.iface.instruction.formats.Instruction20t;
import org.p120jf.dexlib2.iface.instruction.formats.Instruction21c;
import org.p120jf.dexlib2.iface.instruction.formats.Instruction21ih;
import org.p120jf.dexlib2.iface.instruction.formats.Instruction21lh;
import org.p120jf.dexlib2.iface.instruction.formats.Instruction21s;
import org.p120jf.dexlib2.iface.instruction.formats.Instruction21t;
import org.p120jf.dexlib2.iface.instruction.formats.Instruction22b;
import org.p120jf.dexlib2.iface.instruction.formats.Instruction22c;
import org.p120jf.dexlib2.iface.instruction.formats.Instruction22cs;
import org.p120jf.dexlib2.iface.instruction.formats.Instruction22s;
import org.p120jf.dexlib2.iface.instruction.formats.Instruction22t;
import org.p120jf.dexlib2.iface.instruction.formats.Instruction22x;
import org.p120jf.dexlib2.iface.instruction.formats.Instruction23x;
import org.p120jf.dexlib2.iface.instruction.formats.Instruction30t;
import org.p120jf.dexlib2.iface.instruction.formats.Instruction31c;
import org.p120jf.dexlib2.iface.instruction.formats.Instruction31i;
import org.p120jf.dexlib2.iface.instruction.formats.Instruction31t;
import org.p120jf.dexlib2.iface.instruction.formats.Instruction32x;
import org.p120jf.dexlib2.iface.instruction.formats.Instruction35c;
import org.p120jf.dexlib2.iface.instruction.formats.Instruction35mi;
import org.p120jf.dexlib2.iface.instruction.formats.Instruction35ms;
import org.p120jf.dexlib2.iface.instruction.formats.Instruction3rc;
import org.p120jf.dexlib2.iface.instruction.formats.Instruction3rmi;
import org.p120jf.dexlib2.iface.instruction.formats.Instruction3rms;
import org.p120jf.dexlib2.iface.instruction.formats.Instruction45cc;
import org.p120jf.dexlib2.iface.instruction.formats.Instruction4rcc;
import org.p120jf.dexlib2.iface.instruction.formats.Instruction51l;
import org.p120jf.dexlib2.iface.instruction.formats.PackedSwitchPayload;
import org.p120jf.dexlib2.iface.instruction.formats.SparseSwitchPayload;
import org.p120jf.dexlib2.iface.instruction.formats.UnknownInstruction;
import org.p120jf.dexlib2.util.Preconditions;
import org.p120jf.util.ImmutableConverter;

/* JADX INFO: loaded from: classes.dex */
public abstract class ImmutableInstruction implements Instruction {
    public static final ImmutableConverter<ImmutableInstruction, Instruction> CONVERTER = new ImmutableConverter<ImmutableInstruction, Instruction>() { // from class: org.jf.dexlib2.immutable.instruction.ImmutableInstruction.1
        @Override // org.p120jf.util.ImmutableConverter
        public boolean isImmutable(Instruction instruction) {
            return instruction instanceof ImmutableInstruction;
        }

        @Override // org.p120jf.util.ImmutableConverter
        public ImmutableInstruction makeImmutable(Instruction instruction) {
            return ImmutableInstruction.m4251of(instruction);
        }
    };
    public final Opcode opcode;

    /* JADX INFO: renamed from: org.jf.dexlib2.immutable.instruction.ImmutableInstruction$2 */
    public static /* synthetic */ class C18962 {
        public static final /* synthetic */ int[] $SwitchMap$org$jf$dexlib2$Format;

        static {
            int[] iArr = new int[Format.values().length];
            $SwitchMap$org$jf$dexlib2$Format = iArr;
            try {
                iArr[Format.Format10t.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format10x.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format11n.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format11x.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format12x.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format20bc.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format20t.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format21c.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format21ih.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format21lh.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format21s.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format21t.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format22b.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format22c.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format22cs.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format22s.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format22t.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format22x.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format23x.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format30t.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format31c.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format31i.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format31t.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format32x.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format35c.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format35mi.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format35ms.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format3rc.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format3rmi.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format3rms.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format45cc.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format4rcc.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.Format51l.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.PackedSwitchPayload.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.SparseSwitchPayload.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                $SwitchMap$org$jf$dexlib2$Format[Format.ArrayPayload.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
        }
    }

    public ImmutableInstruction(Opcode opcode) {
        Preconditions.checkFormat(opcode, getFormat());
        this.opcode = opcode;
    }

    public static ImmutableList<ImmutableInstruction> immutableListOf(Iterable<? extends Instruction> iterable) {
        return CONVERTER.toList(iterable);
    }

    /* JADX INFO: renamed from: of */
    public static ImmutableInstruction m4251of(Instruction instruction) {
        if (instruction instanceof ImmutableInstruction) {
            return (ImmutableInstruction) instruction;
        }
        switch (C18962.$SwitchMap$org$jf$dexlib2$Format[instruction.getOpcode().format.ordinal()]) {
            case 1:
                return ImmutableInstruction10t.m4252of((Instruction10t) instruction);
            case 2:
                return instruction instanceof UnknownInstruction ? ImmutableUnknownInstruction.m4288of((UnknownInstruction) instruction) : ImmutableInstruction10x.m4253of((Instruction10x) instruction);
            case 3:
                return ImmutableInstruction11n.m4254of((Instruction11n) instruction);
            case 4:
                return ImmutableInstruction11x.m4255of((Instruction11x) instruction);
            case 5:
                return ImmutableInstruction12x.m4256of((Instruction12x) instruction);
            case 6:
                return ImmutableInstruction20bc.m4257of((Instruction20bc) instruction);
            case 7:
                return ImmutableInstruction20t.m4258of((Instruction20t) instruction);
            case 8:
                return ImmutableInstruction21c.m4259of((Instruction21c) instruction);
            case 9:
                return ImmutableInstruction21ih.m4260of((Instruction21ih) instruction);
            case 10:
                return ImmutableInstruction21lh.m4261of((Instruction21lh) instruction);
            case 11:
                return ImmutableInstruction21s.m4262of((Instruction21s) instruction);
            case 12:
                return ImmutableInstruction21t.m4263of((Instruction21t) instruction);
            case 13:
                return ImmutableInstruction22b.m4264of((Instruction22b) instruction);
            case 14:
                return ImmutableInstruction22c.m4265of((Instruction22c) instruction);
            case 15:
                return ImmutableInstruction22cs.m4266of((Instruction22cs) instruction);
            case 16:
                return ImmutableInstruction22s.m4267of((Instruction22s) instruction);
            case 17:
                return ImmutableInstruction22t.m4268of((Instruction22t) instruction);
            case 18:
                return ImmutableInstruction22x.m4269of((Instruction22x) instruction);
            case 19:
                return ImmutableInstruction23x.m4270of((Instruction23x) instruction);
            case 20:
                return ImmutableInstruction30t.m4271of((Instruction30t) instruction);
            case 21:
                return ImmutableInstruction31c.m4272of((Instruction31c) instruction);
            case 22:
                return ImmutableInstruction31i.m4273of((Instruction31i) instruction);
            case 23:
                return ImmutableInstruction31t.m4274of((Instruction31t) instruction);
            case 24:
                return ImmutableInstruction32x.m4275of((Instruction32x) instruction);
            case 25:
                return ImmutableInstruction35c.m4276of((Instruction35c) instruction);
            case 26:
                return ImmutableInstruction35mi.m4277of((Instruction35mi) instruction);
            case 27:
                return ImmutableInstruction35ms.m4278of((Instruction35ms) instruction);
            case 28:
                return ImmutableInstruction3rc.m4279of((Instruction3rc) instruction);
            case 29:
                return ImmutableInstruction3rmi.m4280of((Instruction3rmi) instruction);
            case 30:
                return ImmutableInstruction3rms.m4281of((Instruction3rms) instruction);
            case 31:
                return ImmutableInstruction45cc.m4282of((Instruction45cc) instruction);
            case 32:
                return ImmutableInstruction4rcc.m4283of((Instruction4rcc) instruction);
            case 33:
                return ImmutableInstruction51l.m4284of((Instruction51l) instruction);
            case 34:
                return ImmutablePackedSwitchPayload.m4285of((PackedSwitchPayload) instruction);
            case 35:
                return ImmutableSparseSwitchPayload.m4286of((SparseSwitchPayload) instruction);
            case 36:
                return ImmutableArrayPayload.m4250of((ArrayPayload) instruction);
            default:
                throw new RuntimeException("Unexpected instruction type");
        }
    }

    @Override // org.p120jf.dexlib2.iface.instruction.Instruction
    public int getCodeUnits() {
        return getFormat().size / 2;
    }

    public abstract Format getFormat();

    @Override // org.p120jf.dexlib2.iface.instruction.Instruction
    public Opcode getOpcode() {
        return this.opcode;
    }
}
