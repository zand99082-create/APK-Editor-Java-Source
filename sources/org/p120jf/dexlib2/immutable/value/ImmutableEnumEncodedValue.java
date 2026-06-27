package org.p120jf.dexlib2.immutable.value;

import org.p120jf.dexlib2.base.value.BaseEnumEncodedValue;
import org.p120jf.dexlib2.iface.value.EnumEncodedValue;
import org.p120jf.dexlib2.immutable.reference.ImmutableFieldReference;

/* JADX INFO: loaded from: classes.dex */
public class ImmutableEnumEncodedValue extends BaseEnumEncodedValue implements ImmutableEncodedValue {
    public final ImmutableFieldReference value;

    public ImmutableEnumEncodedValue(ImmutableFieldReference immutableFieldReference) {
        this.value = immutableFieldReference;
    }

    /* JADX INFO: renamed from: of */
    public static ImmutableEnumEncodedValue m4305of(EnumEncodedValue enumEncodedValue) {
        return enumEncodedValue instanceof ImmutableEnumEncodedValue ? (ImmutableEnumEncodedValue) enumEncodedValue : new ImmutableEnumEncodedValue(ImmutableFieldReference.m4290of(enumEncodedValue.getValue()));
    }

    @Override // org.p120jf.dexlib2.iface.value.EnumEncodedValue
    public ImmutableFieldReference getValue() {
        return this.value;
    }
}
