package org.p120jf.dexlib2.immutable.value;

import org.p120jf.dexlib2.base.value.BaseByteEncodedValue;
import org.p120jf.dexlib2.iface.value.ByteEncodedValue;

/* JADX INFO: loaded from: classes.dex */
public class ImmutableByteEncodedValue extends BaseByteEncodedValue implements ImmutableEncodedValue {
    public final byte value;

    public ImmutableByteEncodedValue(byte b2) {
        this.value = b2;
    }

    /* JADX INFO: renamed from: of */
    public static ImmutableByteEncodedValue m4301of(ByteEncodedValue byteEncodedValue) {
        return byteEncodedValue instanceof ImmutableByteEncodedValue ? (ImmutableByteEncodedValue) byteEncodedValue : new ImmutableByteEncodedValue(byteEncodedValue.getValue());
    }

    @Override // org.p120jf.dexlib2.iface.value.ByteEncodedValue
    public byte getValue() {
        return this.value;
    }
}
