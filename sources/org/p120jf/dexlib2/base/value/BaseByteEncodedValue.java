package org.p120jf.dexlib2.base.value;

import com.google.common.primitives.Ints;
import org.p120jf.dexlib2.formatter.DexFormatter;
import org.p120jf.dexlib2.iface.value.ByteEncodedValue;
import org.p120jf.dexlib2.iface.value.EncodedValue;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseByteEncodedValue implements ByteEncodedValue {
    @Override // java.lang.Comparable
    public int compareTo(EncodedValue encodedValue) {
        int iCompare = Ints.compare(getValueType(), encodedValue.getValueType());
        return iCompare != 0 ? iCompare : Ints.compare(getValue(), ((ByteEncodedValue) encodedValue).getValue());
    }

    public boolean equals(Object obj) {
        return (obj instanceof ByteEncodedValue) && getValue() == ((ByteEncodedValue) obj).getValue();
    }

    @Override // org.p120jf.dexlib2.iface.value.EncodedValue
    public int getValueType() {
        return 0;
    }

    public int hashCode() {
        return getValue();
    }

    public String toString() {
        return DexFormatter.INSTANCE.getEncodedValue(this);
    }
}
