package org.p120jf.dexlib2.immutable.value;

import org.p120jf.dexlib2.base.value.BaseCharEncodedValue;
import org.p120jf.dexlib2.iface.value.CharEncodedValue;

/* JADX INFO: loaded from: classes.dex */
public class ImmutableCharEncodedValue extends BaseCharEncodedValue implements ImmutableEncodedValue {
    public final char value;

    public ImmutableCharEncodedValue(char c) {
        this.value = c;
    }

    /* JADX INFO: renamed from: of */
    public static ImmutableCharEncodedValue m4302of(CharEncodedValue charEncodedValue) {
        return charEncodedValue instanceof ImmutableCharEncodedValue ? (ImmutableCharEncodedValue) charEncodedValue : new ImmutableCharEncodedValue(charEncodedValue.getValue());
    }

    @Override // org.p120jf.dexlib2.iface.value.CharEncodedValue
    public char getValue() {
        return this.value;
    }
}
