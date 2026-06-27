package org.p120jf.dexlib2.immutable.value;

import org.p120jf.dexlib2.base.value.BaseMethodEncodedValue;
import org.p120jf.dexlib2.iface.value.MethodEncodedValue;
import org.p120jf.dexlib2.immutable.reference.ImmutableMethodReference;

/* JADX INFO: loaded from: classes.dex */
public class ImmutableMethodEncodedValue extends BaseMethodEncodedValue implements ImmutableEncodedValue {
    public final ImmutableMethodReference value;

    public ImmutableMethodEncodedValue(ImmutableMethodReference immutableMethodReference) {
        this.value = immutableMethodReference;
    }

    /* JADX INFO: renamed from: of */
    public static ImmutableMethodEncodedValue m4310of(MethodEncodedValue methodEncodedValue) {
        return methodEncodedValue instanceof ImmutableMethodEncodedValue ? (ImmutableMethodEncodedValue) methodEncodedValue : new ImmutableMethodEncodedValue(ImmutableMethodReference.m4293of(methodEncodedValue.getValue()));
    }

    @Override // org.p120jf.dexlib2.iface.value.MethodEncodedValue
    public ImmutableMethodReference getValue() {
        return this.value;
    }
}
