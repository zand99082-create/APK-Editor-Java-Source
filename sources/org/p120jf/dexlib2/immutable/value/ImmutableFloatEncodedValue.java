package org.p120jf.dexlib2.immutable.value;

import org.p120jf.dexlib2.base.value.BaseFloatEncodedValue;
import org.p120jf.dexlib2.iface.value.FloatEncodedValue;

/* JADX INFO: loaded from: classes.dex */
public class ImmutableFloatEncodedValue extends BaseFloatEncodedValue implements ImmutableEncodedValue {
    public final float value;

    public ImmutableFloatEncodedValue(float f) {
        this.value = f;
    }

    /* JADX INFO: renamed from: of */
    public static ImmutableFloatEncodedValue m4307of(FloatEncodedValue floatEncodedValue) {
        return floatEncodedValue instanceof ImmutableFloatEncodedValue ? (ImmutableFloatEncodedValue) floatEncodedValue : new ImmutableFloatEncodedValue(floatEncodedValue.getValue());
    }

    @Override // org.p120jf.dexlib2.iface.value.FloatEncodedValue
    public float getValue() {
        return this.value;
    }
}
