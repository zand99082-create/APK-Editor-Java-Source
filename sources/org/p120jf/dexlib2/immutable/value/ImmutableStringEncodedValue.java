package org.p120jf.dexlib2.immutable.value;

import org.p120jf.dexlib2.base.value.BaseStringEncodedValue;
import org.p120jf.dexlib2.iface.value.StringEncodedValue;

/* JADX INFO: loaded from: classes.dex */
public class ImmutableStringEncodedValue extends BaseStringEncodedValue implements ImmutableEncodedValue {
    public final String value;

    public ImmutableStringEncodedValue(String str) {
        this.value = str;
    }

    /* JADX INFO: renamed from: of */
    public static ImmutableStringEncodedValue m4314of(StringEncodedValue stringEncodedValue) {
        return stringEncodedValue instanceof ImmutableStringEncodedValue ? (ImmutableStringEncodedValue) stringEncodedValue : new ImmutableStringEncodedValue(stringEncodedValue.getValue());
    }

    @Override // org.p120jf.dexlib2.iface.value.StringEncodedValue
    public String getValue() {
        return this.value;
    }
}
