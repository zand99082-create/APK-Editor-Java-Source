package org.p120jf.dexlib2.immutable.reference;

import org.p120jf.dexlib2.base.reference.BaseMethodHandleReference;
import org.p120jf.dexlib2.iface.reference.FieldReference;
import org.p120jf.dexlib2.iface.reference.MethodHandleReference;
import org.p120jf.dexlib2.iface.reference.MethodReference;
import org.p120jf.dexlib2.iface.reference.Reference;
import org.p120jf.util.ExceptionWithContext;

/* JADX INFO: loaded from: classes.dex */
public class ImmutableMethodHandleReference extends BaseMethodHandleReference implements ImmutableReference {
    public final ImmutableReference memberReference;
    public final int methodHandleType;

    public ImmutableMethodHandleReference(int i, ImmutableReference immutableReference) {
        this.methodHandleType = i;
        this.memberReference = immutableReference;
    }

    /* JADX INFO: renamed from: of */
    public static ImmutableMethodHandleReference m4291of(MethodHandleReference methodHandleReference) {
        ImmutableReference immutableReferenceM4290of;
        if (methodHandleReference instanceof ImmutableMethodHandleReference) {
            return (ImmutableMethodHandleReference) methodHandleReference;
        }
        int methodHandleType = methodHandleReference.getMethodHandleType();
        switch (methodHandleType) {
            case 0:
            case 1:
            case 2:
            case 3:
                immutableReferenceM4290of = ImmutableFieldReference.m4290of((FieldReference) methodHandleReference.getMemberReference());
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                immutableReferenceM4290of = ImmutableMethodReference.m4293of((MethodReference) methodHandleReference.getMemberReference());
                break;
            default:
                throw new ExceptionWithContext("Invalid method handle type: %d", Integer.valueOf(methodHandleType));
        }
        return new ImmutableMethodHandleReference(methodHandleType, immutableReferenceM4290of);
    }

    @Override // org.p120jf.dexlib2.iface.reference.MethodHandleReference
    public Reference getMemberReference() {
        return this.memberReference;
    }

    @Override // org.p120jf.dexlib2.iface.reference.MethodHandleReference
    public int getMethodHandleType() {
        return this.methodHandleType;
    }
}
