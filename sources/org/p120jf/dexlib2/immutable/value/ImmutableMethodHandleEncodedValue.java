package org.p120jf.dexlib2.immutable.value;

import org.p120jf.dexlib2.base.value.BaseMethodHandleEncodedValue;
import org.p120jf.dexlib2.iface.value.MethodHandleEncodedValue;
import org.p120jf.dexlib2.immutable.reference.ImmutableMethodHandleReference;

/* JADX INFO: loaded from: classes.dex */
public class ImmutableMethodHandleEncodedValue extends BaseMethodHandleEncodedValue implements ImmutableEncodedValue {
    public final ImmutableMethodHandleReference methodHandleReference;

    public ImmutableMethodHandleEncodedValue(ImmutableMethodHandleReference immutableMethodHandleReference) {
        this.methodHandleReference = immutableMethodHandleReference;
    }

    /* JADX INFO: renamed from: of */
    public static ImmutableMethodHandleEncodedValue m4311of(MethodHandleEncodedValue methodHandleEncodedValue) {
        return methodHandleEncodedValue instanceof ImmutableMethodHandleEncodedValue ? (ImmutableMethodHandleEncodedValue) methodHandleEncodedValue : new ImmutableMethodHandleEncodedValue(ImmutableMethodHandleReference.m4291of(methodHandleEncodedValue.getValue()));
    }

    @Override // org.p120jf.dexlib2.iface.value.MethodHandleEncodedValue
    public ImmutableMethodHandleReference getValue() {
        return this.methodHandleReference;
    }
}
