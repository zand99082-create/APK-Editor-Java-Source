package jadx.core.dex.instructions;

import android.support.v7.appcompat.C0327R;
import com.p046a.p047a.C0489f;
import com.p046a.p049b.p063d.C0798e;
import com.p046a.p049b.p063d.p064a.AbstractC0774f;
import com.p046a.p049b.p063d.p064a.C0762at;
import com.p046a.p049b.p063d.p064a.C0764av;
import com.p046a.p049b.p063d.p064a.C0766ax;
import com.p046a.p049b.p063d.p064a.C0775g;
import jadx.core.dex.info.FieldInfo;
import jadx.core.dex.info.MethodInfo;
import jadx.core.dex.instructions.args.ArgType;
import jadx.core.dex.instructions.args.InsnArg;
import jadx.core.dex.instructions.args.PrimitiveType;
import jadx.core.dex.instructions.args.RegisterArg;
import jadx.core.dex.nodes.DexNode;
import jadx.core.dex.nodes.InsnNode;
import jadx.core.dex.nodes.MethodNode;
import jadx.core.utils.InsnUtils;
import jadx.core.utils.exceptions.DecodeException;

/* JADX INFO: loaded from: classes.dex */
public class InsnDecoder {
    private final DexNode dex;
    private AbstractC0774f[] insnArr;
    private final MethodNode method;

    public InsnDecoder(MethodNode methodNode) {
        this.method = methodNode;
        this.dex = this.method.dex();
    }

    private InsnNode arith(AbstractC0774f abstractC0774f, ArithOp arithOp, ArgType argType) {
        return new ArithNode(abstractC0774f, arithOp, argType, false);
    }

    private InsnNode arithLit(AbstractC0774f abstractC0774f, ArithOp arithOp, ArgType argType) {
        return new ArithNode(abstractC0774f, arithOp, argType, true);
    }

    private InsnNode arrayGet(AbstractC0774f abstractC0774f, ArgType argType) {
        InsnNode insnNode = new InsnNode(InsnType.AGET, 2);
        insnNode.setResult(InsnArg.reg(abstractC0774f, 0, argType));
        insnNode.addArg(InsnArg.reg(abstractC0774f, 1, ArgType.unknown(PrimitiveType.ARRAY)));
        insnNode.addArg(InsnArg.reg(abstractC0774f, 2, ArgType.INT));
        return insnNode;
    }

    private InsnNode arrayPut(AbstractC0774f abstractC0774f, ArgType argType) {
        InsnNode insnNode = new InsnNode(InsnType.APUT, 3);
        insnNode.addArg(InsnArg.reg(abstractC0774f, 1, ArgType.unknown(PrimitiveType.ARRAY)));
        insnNode.addArg(InsnArg.reg(abstractC0774f, 2, ArgType.INT));
        insnNode.addArg(InsnArg.reg(abstractC0774f, 0, argType));
        return insnNode;
    }

    private InsnNode cast(AbstractC0774f abstractC0774f, ArgType argType, ArgType argType2) {
        IndexInsnNode indexInsnNode = new IndexInsnNode(InsnType.CAST, argType2, 1);
        indexInsnNode.setResult(InsnArg.reg(abstractC0774f, 0, argType2));
        indexInsnNode.addArg(InsnArg.reg(abstractC0774f, 1, argType));
        return indexInsnNode;
    }

    private InsnNode cmp(AbstractC0774f abstractC0774f, InsnType insnType, ArgType argType) {
        InsnNode insnNode = new InsnNode(insnType, 2);
        insnNode.setResult(InsnArg.reg(abstractC0774f, 0, ArgType.INT));
        insnNode.addArg(InsnArg.reg(abstractC0774f, 1, argType));
        insnNode.addArg(InsnArg.reg(abstractC0774f, 2, argType));
        return insnNode;
    }

    private InsnNode decode(AbstractC0774f abstractC0774f, int i) throws DecodeException {
        switch (abstractC0774f.m1557b()) {
            case 0:
            case 256:
            case 512:
            case 768:
                return null;
            case 1:
            case 2:
            case 3:
                return insn(InsnType.MOVE, InsnArg.reg(abstractC0774f, 0, ArgType.NARROW), InsnArg.reg(abstractC0774f, 1, ArgType.NARROW));
            case 4:
            case 5:
            case 6:
                return insn(InsnType.MOVE, InsnArg.reg(abstractC0774f, 0, ArgType.WIDE), InsnArg.reg(abstractC0774f, 1, ArgType.WIDE));
            case 7:
            case 8:
            case 9:
                return insn(InsnType.MOVE, InsnArg.reg(abstractC0774f, 0, ArgType.UNKNOWN_OBJECT), InsnArg.reg(abstractC0774f, 1, ArgType.UNKNOWN_OBJECT));
            case 10:
            case 11:
            case 12:
                return new InsnNode(InsnType.NOP, 0);
            case 13:
                return insn(InsnType.MOVE_EXCEPTION, InsnArg.reg(abstractC0774f, 0, ArgType.unknown(PrimitiveType.OBJECT)));
            case 14:
                return new InsnNode(InsnType.RETURN, 0);
            case 15:
            case 16:
            case 17:
                return insn(InsnType.RETURN, null, InsnArg.reg(abstractC0774f, 0, this.method.getReturnType()));
            case 18:
            case 19:
            case 20:
            case 21:
                return insn(InsnType.CONST, InsnArg.reg(abstractC0774f, 0, ArgType.NARROW), InsnArg.lit(abstractC0774f, ArgType.NARROW));
            case 22:
            case 23:
            case 24:
            case 25:
                return insn(InsnType.CONST, InsnArg.reg(abstractC0774f, 0, ArgType.WIDE), InsnArg.lit(abstractC0774f, ArgType.WIDE));
            case 26:
            case 27:
                ConstStringNode constStringNode = new ConstStringNode(this.dex.getString(abstractC0774f.m1561d()));
                constStringNode.setResult(InsnArg.reg(abstractC0774f, 0, ArgType.STRING));
                return constStringNode;
            case 28:
                ConstClassNode constClassNode = new ConstClassNode(this.dex.getType(abstractC0774f.m1561d()));
                constClassNode.setResult(InsnArg.reg(abstractC0774f, 0, ArgType.CLASS));
                return constClassNode;
            case 29:
                return insn(InsnType.MONITOR_ENTER, null, InsnArg.reg(abstractC0774f, 0, ArgType.UNKNOWN_OBJECT));
            case 30:
                return insn(InsnType.MONITOR_EXIT, null, InsnArg.reg(abstractC0774f, 0, ArgType.UNKNOWN_OBJECT));
            case 31:
                ArgType type = this.dex.getType(abstractC0774f.m1561d());
                IndexInsnNode indexInsnNode = new IndexInsnNode(InsnType.CHECK_CAST, type, 1);
                indexInsnNode.setResult(InsnArg.reg(abstractC0774f, 0, type));
                indexInsnNode.addArg(InsnArg.reg(abstractC0774f, 0, ArgType.UNKNOWN_OBJECT));
                return indexInsnNode;
            case 32:
                IndexInsnNode indexInsnNode2 = new IndexInsnNode(InsnType.INSTANCE_OF, this.dex.getType(abstractC0774f.m1561d()), 1);
                indexInsnNode2.setResult(InsnArg.reg(abstractC0774f, 0, ArgType.BOOLEAN));
                indexInsnNode2.addArg(InsnArg.reg(abstractC0774f, 1, ArgType.UNKNOWN_OBJECT));
                return indexInsnNode2;
            case 33:
                InsnNode insnNode = new InsnNode(InsnType.ARRAY_LENGTH, 1);
                insnNode.setResult(InsnArg.reg(abstractC0774f, 0, ArgType.INT));
                insnNode.addArg(InsnArg.reg(abstractC0774f, 1, ArgType.array(ArgType.UNKNOWN)));
                return insnNode;
            case 34:
                return insn(InsnType.NEW_INSTANCE, InsnArg.reg(abstractC0774f, 0, this.dex.getType(abstractC0774f.m1561d())));
            case 35:
                ArgType type2 = this.dex.getType(abstractC0774f.m1561d());
                return new NewArrayNode(type2, InsnArg.reg(abstractC0774f, 0, type2), InsnArg.reg(abstractC0774f, 1, ArgType.INT));
            case 36:
                return filledNewArray(abstractC0774f, i, false);
            case 37:
                return filledNewArray(abstractC0774f, i, true);
            case 38:
                return fillArray(abstractC0774f);
            case 39:
                return insn(InsnType.THROW, null, InsnArg.reg(abstractC0774f, 0, ArgType.unknown(PrimitiveType.OBJECT)));
            case 40:
            case 41:
            case 42:
                return new GotoNode(abstractC0774f.m1564g());
            case 43:
                return decodeSwitch(abstractC0774f, i, true);
            case 44:
                return decodeSwitch(abstractC0774f, i, false);
            case 45:
                return cmp(abstractC0774f, InsnType.CMP_L, ArgType.FLOAT);
            case 46:
                return cmp(abstractC0774f, InsnType.CMP_G, ArgType.FLOAT);
            case 47:
                return cmp(abstractC0774f, InsnType.CMP_L, ArgType.DOUBLE);
            case C0327R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 48 */:
                return cmp(abstractC0774f, InsnType.CMP_G, ArgType.DOUBLE);
            case C0327R.styleable.AppCompatTheme_spinnerDropDownItemStyle /* 49 */:
                return cmp(abstractC0774f, InsnType.CMP_L, ArgType.LONG);
            case 50:
            case C0327R.styleable.AppCompatTheme_borderlessButtonStyle /* 56 */:
                return new IfNode(abstractC0774f, IfOp.EQ);
            case C0327R.styleable.AppCompatTheme_actionButtonStyle /* 51 */:
            case C0327R.styleable.AppCompatTheme_dividerVertical /* 57 */:
                return new IfNode(abstractC0774f, IfOp.NE);
            case C0327R.styleable.AppCompatTheme_buttonBarStyle /* 52 */:
            case C0327R.styleable.AppCompatTheme_dividerHorizontal /* 58 */:
                return new IfNode(abstractC0774f, IfOp.LT);
            case C0327R.styleable.AppCompatTheme_buttonBarButtonStyle /* 53 */:
            case C0327R.styleable.AppCompatTheme_activityChooserViewStyle /* 59 */:
                return new IfNode(abstractC0774f, IfOp.GE);
            case C0327R.styleable.AppCompatTheme_selectableItemBackground /* 54 */:
            case C0327R.styleable.AppCompatTheme_toolbarStyle /* 60 */:
                return new IfNode(abstractC0774f, IfOp.GT);
            case C0327R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 55 */:
            case C0327R.styleable.AppCompatTheme_toolbarNavigationButtonStyle /* 61 */:
                return new IfNode(abstractC0774f, IfOp.LE);
            case C0327R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle /* 68 */:
                return arrayGet(abstractC0774f, ArgType.NARROW);
            case C0327R.styleable.AppCompatTheme_textColorSearchUrl /* 69 */:
                return arrayGet(abstractC0774f, ArgType.WIDE);
            case C0327R.styleable.AppCompatTheme_searchViewStyle /* 70 */:
                return arrayGet(abstractC0774f, ArgType.UNKNOWN_OBJECT);
            case C0327R.styleable.AppCompatTheme_listPreferredItemHeight /* 71 */:
                return arrayGet(abstractC0774f, ArgType.BOOLEAN);
            case C0327R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 72 */:
                return arrayGet(abstractC0774f, ArgType.BYTE);
            case C0327R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 73 */:
                return arrayGet(abstractC0774f, ArgType.CHAR);
            case C0327R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 74 */:
                return arrayGet(abstractC0774f, ArgType.SHORT);
            case C0327R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 75 */:
                return arrayPut(abstractC0774f, ArgType.NARROW);
            case C0327R.styleable.AppCompatTheme_dropDownListViewStyle /* 76 */:
                return arrayPut(abstractC0774f, ArgType.WIDE);
            case C0327R.styleable.AppCompatTheme_listPopupWindowStyle /* 77 */:
                return arrayPut(abstractC0774f, ArgType.UNKNOWN_OBJECT);
            case C0327R.styleable.AppCompatTheme_textAppearanceListItem /* 78 */:
                return arrayPut(abstractC0774f, ArgType.BOOLEAN);
            case C0327R.styleable.AppCompatTheme_textAppearanceListItemSecondary /* 79 */:
                return arrayPut(abstractC0774f, ArgType.BYTE);
            case C0327R.styleable.AppCompatTheme_textAppearanceListItemSmall /* 80 */:
                return arrayPut(abstractC0774f, ArgType.CHAR);
            case 81:
                return arrayPut(abstractC0774f, ArgType.SHORT);
            case C0327R.styleable.AppCompatTheme_panelMenuListWidth /* 82 */:
            case C0327R.styleable.AppCompatTheme_panelMenuListTheme /* 83 */:
            case C0327R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 84 */:
            case C0327R.styleable.AppCompatTheme_colorPrimary /* 85 */:
            case C0327R.styleable.AppCompatTheme_colorPrimaryDark /* 86 */:
            case C0327R.styleable.AppCompatTheme_colorAccent /* 87 */:
            case C0327R.styleable.AppCompatTheme_colorControlNormal /* 88 */:
                FieldInfo fieldInfoFromDex = FieldInfo.fromDex(this.dex, abstractC0774f.m1561d());
                IndexInsnNode indexInsnNode3 = new IndexInsnNode(InsnType.IGET, fieldInfoFromDex, 1);
                indexInsnNode3.setResult(InsnArg.reg(abstractC0774f, 0, fieldInfoFromDex.getType()));
                indexInsnNode3.addArg(InsnArg.reg(abstractC0774f, 1, fieldInfoFromDex.getDeclClass().getType()));
                return indexInsnNode3;
            case C0327R.styleable.AppCompatTheme_colorControlActivated /* 89 */:
            case C0327R.styleable.AppCompatTheme_colorControlHighlight /* 90 */:
            case C0327R.styleable.AppCompatTheme_colorButtonNormal /* 91 */:
            case C0327R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 92 */:
            case C0327R.styleable.AppCompatTheme_controlBackground /* 93 */:
            case C0327R.styleable.AppCompatTheme_colorBackgroundFloating /* 94 */:
            case C0327R.styleable.AppCompatTheme_alertDialogStyle /* 95 */:
                FieldInfo fieldInfoFromDex2 = FieldInfo.fromDex(this.dex, abstractC0774f.m1561d());
                IndexInsnNode indexInsnNode4 = new IndexInsnNode(InsnType.IPUT, fieldInfoFromDex2, 2);
                indexInsnNode4.addArg(InsnArg.reg(abstractC0774f, 0, fieldInfoFromDex2.getType()));
                indexInsnNode4.addArg(InsnArg.reg(abstractC0774f, 1, fieldInfoFromDex2.getDeclClass().getType()));
                return indexInsnNode4;
            case C0327R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 96 */:
            case C0327R.styleable.AppCompatTheme_alertDialogCenterButtons /* 97 */:
            case C0327R.styleable.AppCompatTheme_alertDialogTheme /* 98 */:
            case C0327R.styleable.AppCompatTheme_textColorAlertDialogListItem /* 99 */:
            case C0327R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 100 */:
            case C0327R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 101 */:
            case C0327R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 102 */:
                FieldInfo fieldInfoFromDex3 = FieldInfo.fromDex(this.dex, abstractC0774f.m1561d());
                IndexInsnNode indexInsnNode5 = new IndexInsnNode(InsnType.SGET, fieldInfoFromDex3, 0);
                indexInsnNode5.setResult(InsnArg.reg(abstractC0774f, 0, fieldInfoFromDex3.getType()));
                return indexInsnNode5;
            case C0327R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 103 */:
            case C0327R.styleable.AppCompatTheme_buttonStyle /* 104 */:
            case C0327R.styleable.AppCompatTheme_buttonStyleSmall /* 105 */:
            case C0327R.styleable.AppCompatTheme_checkboxStyle /* 106 */:
            case C0327R.styleable.AppCompatTheme_checkedTextViewStyle /* 107 */:
            case 108:
            case 109:
                FieldInfo fieldInfoFromDex4 = FieldInfo.fromDex(this.dex, abstractC0774f.m1561d());
                IndexInsnNode indexInsnNode6 = new IndexInsnNode(InsnType.SPUT, fieldInfoFromDex4, 1);
                indexInsnNode6.addArg(InsnArg.reg(abstractC0774f, 0, fieldInfoFromDex4.getType()));
                return indexInsnNode6;
            case C0327R.styleable.AppCompatTheme_ratingBarStyle /* 110 */:
                return invoke(abstractC0774f, i, InvokeType.VIRTUAL, false);
            case C0327R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 111 */:
                return invoke(abstractC0774f, i, InvokeType.SUPER, false);
            case C0327R.styleable.AppCompatTheme_ratingBarStyleSmall /* 112 */:
                return invoke(abstractC0774f, i, InvokeType.DIRECT, false);
            case C0327R.styleable.AppCompatTheme_seekBarStyle /* 113 */:
                return invoke(abstractC0774f, i, InvokeType.STATIC, false);
            case C0327R.styleable.AppCompatTheme_spinnerStyle /* 114 */:
                return invoke(abstractC0774f, i, InvokeType.INTERFACE, false);
            case C0327R.styleable.AppCompatTheme_listMenuViewStyle /* 116 */:
                return invoke(abstractC0774f, i, InvokeType.VIRTUAL, true);
            case C0327R.styleable.AppCompatTheme_tooltipFrameBackground /* 117 */:
                return invoke(abstractC0774f, i, InvokeType.SUPER, true);
            case C0327R.styleable.AppCompatTheme_tooltipForegroundColor /* 118 */:
                return invoke(abstractC0774f, i, InvokeType.DIRECT, true);
            case C0327R.styleable.AppCompatTheme_colorError /* 119 */:
                return invoke(abstractC0774f, i, InvokeType.STATIC, true);
            case 120:
                return invoke(abstractC0774f, i, InvokeType.INTERFACE, true);
            case 123:
                return neg(abstractC0774f, ArgType.INT);
            case 125:
                return neg(abstractC0774f, ArgType.LONG);
            case 127:
                return neg(abstractC0774f, ArgType.FLOAT);
            case 128:
                return neg(abstractC0774f, ArgType.DOUBLE);
            case 129:
                return cast(abstractC0774f, ArgType.INT, ArgType.LONG);
            case 130:
                return cast(abstractC0774f, ArgType.INT, ArgType.FLOAT);
            case 131:
                return cast(abstractC0774f, ArgType.INT, ArgType.DOUBLE);
            case 132:
                return cast(abstractC0774f, ArgType.LONG, ArgType.INT);
            case 133:
                return cast(abstractC0774f, ArgType.LONG, ArgType.FLOAT);
            case 134:
                return cast(abstractC0774f, ArgType.LONG, ArgType.DOUBLE);
            case 135:
                return cast(abstractC0774f, ArgType.FLOAT, ArgType.INT);
            case 136:
                return cast(abstractC0774f, ArgType.FLOAT, ArgType.LONG);
            case 137:
                return cast(abstractC0774f, ArgType.FLOAT, ArgType.DOUBLE);
            case 138:
                return cast(abstractC0774f, ArgType.DOUBLE, ArgType.INT);
            case 139:
                return cast(abstractC0774f, ArgType.DOUBLE, ArgType.LONG);
            case 140:
                return cast(abstractC0774f, ArgType.DOUBLE, ArgType.FLOAT);
            case 141:
                return cast(abstractC0774f, ArgType.INT, ArgType.BYTE);
            case 142:
                return cast(abstractC0774f, ArgType.INT, ArgType.CHAR);
            case 143:
                return cast(abstractC0774f, ArgType.INT, ArgType.SHORT);
            case 144:
            case 176:
                return arith(abstractC0774f, ArithOp.ADD, ArgType.INT);
            case 145:
            case 177:
                return arith(abstractC0774f, ArithOp.SUB, ArgType.INT);
            case 146:
            case 178:
                return arith(abstractC0774f, ArithOp.MUL, ArgType.INT);
            case 147:
            case 179:
                return arith(abstractC0774f, ArithOp.DIV, ArgType.INT);
            case 148:
            case 180:
                return arith(abstractC0774f, ArithOp.REM, ArgType.INT);
            case 149:
            case 181:
                return arith(abstractC0774f, ArithOp.AND, ArgType.INT);
            case 150:
            case 182:
                return arith(abstractC0774f, ArithOp.OR, ArgType.INT);
            case 151:
            case 183:
                return arith(abstractC0774f, ArithOp.XOR, ArgType.INT);
            case 152:
            case 184:
                return arith(abstractC0774f, ArithOp.SHL, ArgType.INT);
            case 153:
            case 185:
                return arith(abstractC0774f, ArithOp.SHR, ArgType.INT);
            case 154:
            case 186:
                return arith(abstractC0774f, ArithOp.USHR, ArgType.INT);
            case 155:
            case 187:
                return arith(abstractC0774f, ArithOp.ADD, ArgType.LONG);
            case 156:
            case 188:
                return arith(abstractC0774f, ArithOp.SUB, ArgType.LONG);
            case 157:
            case 189:
                return arith(abstractC0774f, ArithOp.MUL, ArgType.LONG);
            case 158:
            case 190:
                return arith(abstractC0774f, ArithOp.DIV, ArgType.LONG);
            case 159:
            case 191:
                return arith(abstractC0774f, ArithOp.REM, ArgType.LONG);
            case 160:
            case 192:
                return arith(abstractC0774f, ArithOp.AND, ArgType.LONG);
            case 161:
            case 193:
                return arith(abstractC0774f, ArithOp.OR, ArgType.LONG);
            case 162:
            case 194:
                return arith(abstractC0774f, ArithOp.XOR, ArgType.LONG);
            case 163:
            case 195:
                return arith(abstractC0774f, ArithOp.SHL, ArgType.LONG);
            case 164:
            case 196:
                return arith(abstractC0774f, ArithOp.SHR, ArgType.LONG);
            case 165:
            case 197:
                return arith(abstractC0774f, ArithOp.USHR, ArgType.LONG);
            case 166:
            case 198:
                return arith(abstractC0774f, ArithOp.ADD, ArgType.FLOAT);
            case 167:
            case 199:
                return arith(abstractC0774f, ArithOp.SUB, ArgType.FLOAT);
            case 168:
            case 200:
                return arith(abstractC0774f, ArithOp.MUL, ArgType.FLOAT);
            case 169:
            case 201:
                return arith(abstractC0774f, ArithOp.DIV, ArgType.FLOAT);
            case 170:
            case 202:
                return arith(abstractC0774f, ArithOp.REM, ArgType.FLOAT);
            case 171:
            case 203:
                return arith(abstractC0774f, ArithOp.ADD, ArgType.DOUBLE);
            case 172:
            case 204:
                return arith(abstractC0774f, ArithOp.SUB, ArgType.DOUBLE);
            case 173:
            case 205:
                return arith(abstractC0774f, ArithOp.MUL, ArgType.DOUBLE);
            case 174:
            case 206:
                return arith(abstractC0774f, ArithOp.DIV, ArgType.DOUBLE);
            case 175:
            case 207:
                return arith(abstractC0774f, ArithOp.REM, ArgType.DOUBLE);
            case 208:
            case 216:
                return arithLit(abstractC0774f, ArithOp.ADD, ArgType.INT);
            case 209:
            case 217:
                return new ArithNode(ArithOp.SUB, InsnArg.reg(abstractC0774f, 0, ArgType.INT), InsnArg.lit(abstractC0774f, ArgType.INT), InsnArg.reg(abstractC0774f, 1, ArgType.INT));
            case 210:
            case 218:
                return arithLit(abstractC0774f, ArithOp.MUL, ArgType.INT);
            case 211:
            case 219:
                return arithLit(abstractC0774f, ArithOp.DIV, ArgType.INT);
            case 212:
            case 220:
                return arithLit(abstractC0774f, ArithOp.REM, ArgType.INT);
            case 213:
            case 221:
                return arithLit(abstractC0774f, ArithOp.AND, ArgType.INT);
            case 214:
            case 222:
                return arithLit(abstractC0774f, ArithOp.OR, ArgType.INT);
            case 215:
            case 223:
                return arithLit(abstractC0774f, ArithOp.XOR, ArgType.INT);
            case 224:
                return arithLit(abstractC0774f, ArithOp.SHL, ArgType.INT);
            case 225:
                return arithLit(abstractC0774f, ArithOp.SHR, ArgType.INT);
            case 226:
                return arithLit(abstractC0774f, ArithOp.USHR, ArgType.INT);
            default:
                throw new DecodeException("Unknown instruction: " + C0798e.m1599a(abstractC0774f.m1557b()));
        }
    }

    private InsnNode decodeSwitch(AbstractC0774f abstractC0774f, int i, boolean z) {
        int[] iArr;
        Object[] objArr;
        int iM1564g = abstractC0774f.m1564g();
        AbstractC0774f abstractC0774f2 = this.insnArr[iM1564g];
        if (z) {
            C0762at c0762at = (C0762at) abstractC0774f2;
            int[] iArrM1529v = c0762at.m1529v();
            Object[] objArr2 = new Object[iArrM1529v.length];
            int iM1528u = c0762at.m1528u();
            int i2 = 0;
            while (i2 < objArr2.length) {
                objArr2[i2] = Integer.valueOf(iM1528u);
                i2++;
                iM1528u++;
            }
            iArr = iArrM1529v;
            objArr = objArr2;
        } else {
            C0766ax c0766ax = (C0766ax) abstractC0774f2;
            int[] iArrM1545v = c0766ax.m1545v();
            Object[] objArr3 = new Object[iArrM1545v.length];
            for (int i3 = 0; i3 < objArr3.length; i3++) {
                objArr3[i3] = Integer.valueOf(c0766ax.m1544u()[i3]);
            }
            iArr = iArrM1545v;
            objArr = objArr3;
        }
        for (int i4 = 0; i4 < iArr.length; i4++) {
            iArr[i4] = (iArr[i4] - iM1564g) + i;
        }
        return new SwitchNode(InsnArg.reg(abstractC0774f, 0, ArgType.NARROW), objArr, iArr, getNextInsnOffset(this.insnArr, i));
    }

    private InsnNode fillArray(AbstractC0774f abstractC0774f) {
        return new FillArrayNode(abstractC0774f.mo1527n(), (C0775g) this.insnArr[abstractC0774f.m1564g()]);
    }

    private InsnNode filledNewArray(AbstractC0774f abstractC0774f, int i, boolean z) {
        int moveResultRegister = getMoveResultRegister(this.insnArr, i);
        ArgType type = this.dex.getType(abstractC0774f.m1561d());
        ArgType arrayElement = type.getArrayElement();
        boolean zIsPrimitive = arrayElement.isPrimitive();
        int iMo1526m = abstractC0774f.mo1526m();
        InsnArg[] insnArgArr = new InsnArg[iMo1526m];
        if (z) {
            int iMo1527n = abstractC0774f.mo1527n();
            for (int i2 = 0; i2 < iMo1526m; i2++) {
                insnArgArr[i2] = InsnArg.reg(iMo1527n, arrayElement, zIsPrimitive);
                iMo1527n++;
            }
        } else {
            for (int i3 = 0; i3 < iMo1526m; i3++) {
                insnArgArr[i3] = InsnArg.reg(InsnUtils.getArg(abstractC0774f, i3), arrayElement, zIsPrimitive);
            }
        }
        FilledNewArrayNode filledNewArrayNode = new FilledNewArrayNode(arrayElement, insnArgArr.length);
        filledNewArrayNode.setResult(moveResultRegister == -1 ? null : InsnArg.reg(moveResultRegister, type));
        for (InsnArg insnArg : insnArgArr) {
            filledNewArrayNode.addArg(insnArg);
        }
        return filledNewArrayNode;
    }

    private int getMoveResultRegister(AbstractC0774f[] abstractC0774fArr, int i) {
        AbstractC0774f abstractC0774f;
        int iM1557b;
        int nextInsnOffset = getNextInsnOffset(abstractC0774fArr, i);
        if (nextInsnOffset < 0 || !((iM1557b = (abstractC0774f = abstractC0774fArr[nextInsnOffset]).m1557b()) == 10 || iM1557b == 11 || iM1557b == 12)) {
            return -1;
        }
        return abstractC0774f.mo1527n();
    }

    public static int getNextInsnOffset(Object[] objArr, int i) {
        int i2 = i + 1;
        while (i2 < objArr.length && objArr[i2] == null) {
            i2++;
        }
        if (i2 >= objArr.length) {
            return -1;
        }
        return i2;
    }

    public static int getPrevInsnOffset(Object[] objArr, int i) {
        int i2 = i - 1;
        while (i2 >= 0 && objArr[i2] == null) {
            i2--;
        }
        if (i2 < 0) {
            return -1;
        }
        return i2;
    }

    private InsnNode insn(InsnType insnType, RegisterArg registerArg) {
        InsnNode insnNode = new InsnNode(insnType, 0);
        insnNode.setResult(registerArg);
        return insnNode;
    }

    private InsnNode insn(InsnType insnType, RegisterArg registerArg, InsnArg insnArg) {
        InsnNode insnNode = new InsnNode(insnType, 1);
        insnNode.setResult(registerArg);
        insnNode.addArg(insnArg);
        return insnNode;
    }

    private InsnNode invoke(AbstractC0774f abstractC0774f, int i, InvokeType invokeType, boolean z) {
        return new InvokeNode(MethodInfo.fromDex(this.dex, abstractC0774f.m1561d()), abstractC0774f, invokeType, z, getMoveResultRegister(this.insnArr, i));
    }

    private InsnNode neg(AbstractC0774f abstractC0774f, ArgType argType) {
        InsnNode insnNode = new InsnNode(InsnType.NEG, 1);
        insnNode.setResult(InsnArg.reg(abstractC0774f, 0, argType));
        insnNode.addArg(InsnArg.reg(abstractC0774f, 1, argType));
        return insnNode;
    }

    public void decodeInsns(C0489f c0489f) throws DecodeException {
        short[] sArrM599e = c0489f.m599e();
        AbstractC0774f[] abstractC0774fArr = new AbstractC0774f[sArrM599e.length];
        C0764av c0764av = new C0764av(sArrM599e);
        while (c0764av.m1533f()) {
            try {
                abstractC0774fArr[c0764av.mo1548a()] = AbstractC0774f.m1552a(c0764av);
            } catch (Exception e) {
                throw new DecodeException(this.method, "", e);
            }
        }
        this.insnArr = abstractC0774fArr;
    }

    public InsnNode[] process() throws DecodeException {
        InsnNode[] insnNodeArr = new InsnNode[this.insnArr.length];
        for (int i = 0; i < this.insnArr.length; i++) {
            AbstractC0774f abstractC0774f = this.insnArr[i];
            if (abstractC0774f != null) {
                InsnNode insnNodeDecode = decode(abstractC0774f, i);
                if (insnNodeDecode != null) {
                    insnNodeDecode.setOffset(i);
                }
                insnNodeArr[i] = insnNodeDecode;
            } else {
                insnNodeArr[i] = null;
            }
        }
        this.insnArr = null;
        return insnNodeArr;
    }
}
