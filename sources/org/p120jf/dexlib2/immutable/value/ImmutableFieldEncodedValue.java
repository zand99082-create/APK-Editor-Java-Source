package org.p120jf.dexlib2.immutable.value;

import org.p120jf.dexlib2.base.value.BaseFieldEncodedValue;
import org.p120jf.dexlib2.iface.value.FieldEncodedValue;
import org.p120jf.dexlib2.immutable.reference.ImmutableFieldReference;

/* JADX INFO: loaded from: classes.dex */
public class ImmutableFieldEncodedValue extends BaseFieldEncodedValue implements ImmutableEncodedValue {
    public final ImmutableFieldReference value;

    public ImmutableFieldEncodedValue(ImmutableFieldReference immutableFieldReference) {
        this.value = immutableFieldReference;
    }

    /* JADX INFO: renamed from: of */
    public static ImmutableFieldEncodedValue m4306of(FieldEncodedValue fieldEncodedValue) {
        return fieldEncodedValue instanceof ImmutableFieldEncodedValue ? (ImmutableFieldEncodedValue) fieldEncodedValue : new ImmutableFieldEncodedValue(ImmutableFieldReference.m4290of(fieldEncodedValue.getValue()));
    }

    @Override // org.p120jf.dexlib2.iface.value.FieldEncodedValue
    public ImmutableFieldReference getValue() {
        return this.value;
    }
}
