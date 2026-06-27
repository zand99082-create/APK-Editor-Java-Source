package org.p120jf.dexlib2.immutable.value;

import org.p120jf.dexlib2.base.value.BaseMethodTypeEncodedValue;
import org.p120jf.dexlib2.iface.value.MethodTypeEncodedValue;
import org.p120jf.dexlib2.immutable.reference.ImmutableMethodProtoReference;

/* JADX INFO: loaded from: classes.dex */
public class ImmutableMethodTypeEncodedValue extends BaseMethodTypeEncodedValue implements ImmutableEncodedValue {
    public final ImmutableMethodProtoReference methodProtoReference;

    public ImmutableMethodTypeEncodedValue(ImmutableMethodProtoReference immutableMethodProtoReference) {
        this.methodProtoReference = immutableMethodProtoReference;
    }

    /* JADX INFO: renamed from: of */
    public static ImmutableMethodTypeEncodedValue m4312of(MethodTypeEncodedValue methodTypeEncodedValue) {
        return methodTypeEncodedValue instanceof ImmutableMethodTypeEncodedValue ? (ImmutableMethodTypeEncodedValue) methodTypeEncodedValue : new ImmutableMethodTypeEncodedValue(ImmutableMethodProtoReference.m4292of(methodTypeEncodedValue.getValue()));
    }

    @Override // org.p120jf.dexlib2.iface.value.MethodTypeEncodedValue
    public ImmutableMethodProtoReference getValue() {
        return this.methodProtoReference;
    }
}
