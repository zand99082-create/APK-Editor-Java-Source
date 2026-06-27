package org.p120jf.dexlib2.immutable.value;

import android.support.v7.appcompat.C0327R;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import org.p120jf.dexlib2.iface.value.AnnotationEncodedValue;
import org.p120jf.dexlib2.iface.value.ArrayEncodedValue;
import org.p120jf.dexlib2.iface.value.BooleanEncodedValue;
import org.p120jf.dexlib2.iface.value.ByteEncodedValue;
import org.p120jf.dexlib2.iface.value.CharEncodedValue;
import org.p120jf.dexlib2.iface.value.DoubleEncodedValue;
import org.p120jf.dexlib2.iface.value.EncodedValue;
import org.p120jf.dexlib2.iface.value.EnumEncodedValue;
import org.p120jf.dexlib2.iface.value.FieldEncodedValue;
import org.p120jf.dexlib2.iface.value.FloatEncodedValue;
import org.p120jf.dexlib2.iface.value.IntEncodedValue;
import org.p120jf.dexlib2.iface.value.LongEncodedValue;
import org.p120jf.dexlib2.iface.value.MethodEncodedValue;
import org.p120jf.dexlib2.iface.value.MethodHandleEncodedValue;
import org.p120jf.dexlib2.iface.value.MethodTypeEncodedValue;
import org.p120jf.dexlib2.iface.value.ShortEncodedValue;
import org.p120jf.dexlib2.iface.value.StringEncodedValue;
import org.p120jf.dexlib2.iface.value.TypeEncodedValue;
import org.p120jf.util.ExceptionWithContext;
import org.p120jf.util.ImmutableConverter;

/* JADX INFO: loaded from: classes.dex */
public class ImmutableEncodedValueFactory {
    public static final ImmutableConverter<ImmutableEncodedValue, EncodedValue> CONVERTER = new ImmutableConverter<ImmutableEncodedValue, EncodedValue>() { // from class: org.jf.dexlib2.immutable.value.ImmutableEncodedValueFactory.1
        @Override // org.p120jf.util.ImmutableConverter
        public boolean isImmutable(EncodedValue encodedValue) {
            return encodedValue instanceof ImmutableEncodedValue;
        }

        @Override // org.p120jf.util.ImmutableConverter
        public ImmutableEncodedValue makeImmutable(EncodedValue encodedValue) {
            return ImmutableEncodedValueFactory.m4304of(encodedValue);
        }
    };

    public static EncodedValue defaultValueForType(String str) {
        char cCharAt = str.charAt(0);
        if (cCharAt == 'F') {
            return new ImmutableFloatEncodedValue(0.0f);
        }
        if (cCharAt != 'L') {
            if (cCharAt == 'S') {
                return new ImmutableShortEncodedValue((short) 0);
            }
            if (cCharAt == 'I') {
                return new ImmutableIntEncodedValue(0);
            }
            if (cCharAt == 'J') {
                return new ImmutableLongEncodedValue(0L);
            }
            if (cCharAt == 'Z') {
                return ImmutableBooleanEncodedValue.FALSE_VALUE;
            }
            if (cCharAt != '[') {
                switch (cCharAt) {
                    case C0327R.styleable.AppCompatTheme_imageButtonStyle /* 66 */:
                        return new ImmutableByteEncodedValue((byte) 0);
                    case C0327R.styleable.AppCompatTheme_textAppearanceSearchResultTitle /* 67 */:
                        return new ImmutableCharEncodedValue((char) 0);
                    case C0327R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle /* 68 */:
                        return new ImmutableDoubleEncodedValue(0.0d);
                    default:
                        throw new ExceptionWithContext("Unrecognized type: %s", str);
                }
            }
        }
        return ImmutableNullEncodedValue.INSTANCE;
    }

    public static ImmutableList<ImmutableEncodedValue> immutableListOf(Iterable<? extends EncodedValue> iterable) {
        return CONVERTER.toList(iterable);
    }

    /* JADX INFO: renamed from: of */
    public static ImmutableEncodedValue m4304of(EncodedValue encodedValue) {
        int valueType = encodedValue.getValueType();
        if (valueType == 0) {
            return ImmutableByteEncodedValue.m4301of((ByteEncodedValue) encodedValue);
        }
        if (valueType == 6) {
            return ImmutableLongEncodedValue.m4309of((LongEncodedValue) encodedValue);
        }
        if (valueType == 2) {
            return ImmutableShortEncodedValue.m4313of((ShortEncodedValue) encodedValue);
        }
        if (valueType == 3) {
            return ImmutableCharEncodedValue.m4302of((CharEncodedValue) encodedValue);
        }
        if (valueType == 4) {
            return ImmutableIntEncodedValue.m4308of((IntEncodedValue) encodedValue);
        }
        if (valueType == 16) {
            return ImmutableFloatEncodedValue.m4307of((FloatEncodedValue) encodedValue);
        }
        if (valueType == 17) {
            return ImmutableDoubleEncodedValue.m4303of((DoubleEncodedValue) encodedValue);
        }
        switch (valueType) {
            case 21:
                return ImmutableMethodTypeEncodedValue.m4312of((MethodTypeEncodedValue) encodedValue);
            case 22:
                return ImmutableMethodHandleEncodedValue.m4311of((MethodHandleEncodedValue) encodedValue);
            case 23:
                return ImmutableStringEncodedValue.m4314of((StringEncodedValue) encodedValue);
            case 24:
                return ImmutableTypeEncodedValue.m4315of((TypeEncodedValue) encodedValue);
            case 25:
                return ImmutableFieldEncodedValue.m4306of((FieldEncodedValue) encodedValue);
            case 26:
                return ImmutableMethodEncodedValue.m4310of((MethodEncodedValue) encodedValue);
            case 27:
                return ImmutableEnumEncodedValue.m4305of((EnumEncodedValue) encodedValue);
            case 28:
                return ImmutableArrayEncodedValue.m4299of((ArrayEncodedValue) encodedValue);
            case 29:
                return ImmutableAnnotationEncodedValue.m4298of((AnnotationEncodedValue) encodedValue);
            case 30:
                return ImmutableNullEncodedValue.INSTANCE;
            case 31:
                return ImmutableBooleanEncodedValue.m4300of((BooleanEncodedValue) encodedValue);
            default:
                Preconditions.checkArgument(false);
                return null;
        }
    }

    public static ImmutableEncodedValue ofNullable(EncodedValue encodedValue) {
        if (encodedValue == null) {
            return null;
        }
        return m4304of(encodedValue);
    }
}
