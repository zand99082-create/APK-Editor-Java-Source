package org.p120jf.dexlib2.writer.pool;

import java.util.List;
import org.p120jf.dexlib2.base.reference.BaseMethodProtoReference;
import org.p120jf.dexlib2.iface.reference.MethodReference;

/* JADX INFO: loaded from: classes.dex */
public class PoolMethodProto extends BaseMethodProtoReference {
    public final MethodReference methodReference;

    public PoolMethodProto(MethodReference methodReference) {
        this.methodReference = methodReference;
    }

    @Override // org.p120jf.dexlib2.iface.reference.MethodProtoReference
    public List<? extends CharSequence> getParameterTypes() {
        return this.methodReference.getParameterTypes();
    }

    @Override // org.p120jf.dexlib2.iface.reference.MethodProtoReference
    public String getReturnType() {
        return this.methodReference.getReturnType();
    }
}
