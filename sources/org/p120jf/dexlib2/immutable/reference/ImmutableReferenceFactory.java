package org.p120jf.dexlib2.immutable.reference;

import org.p120jf.dexlib2.iface.reference.CallSiteReference;
import org.p120jf.dexlib2.iface.reference.FieldReference;
import org.p120jf.dexlib2.iface.reference.MethodHandleReference;
import org.p120jf.dexlib2.iface.reference.MethodProtoReference;
import org.p120jf.dexlib2.iface.reference.MethodReference;
import org.p120jf.dexlib2.iface.reference.Reference;
import org.p120jf.dexlib2.iface.reference.StringReference;
import org.p120jf.dexlib2.iface.reference.TypeReference;
import org.p120jf.util.ExceptionWithContext;

/* JADX INFO: loaded from: classes.dex */
public class ImmutableReferenceFactory {
    /* JADX INFO: renamed from: of */
    public static ImmutableReference m4294of(int i, Reference reference) {
        switch (i) {
            case 0:
                return ImmutableStringReference.m4296of((StringReference) reference);
            case 1:
                return ImmutableTypeReference.m4297of((TypeReference) reference);
            case 2:
                return ImmutableFieldReference.m4290of((FieldReference) reference);
            case 3:
                return ImmutableMethodReference.m4293of((MethodReference) reference);
            case 4:
                return ImmutableMethodProtoReference.m4292of((MethodProtoReference) reference);
            case 5:
                return ImmutableCallSiteReference.m4289of((CallSiteReference) reference);
            case 6:
                return ImmutableMethodHandleReference.m4291of((MethodHandleReference) reference);
            default:
                throw new ExceptionWithContext("Invalid reference type: %d", Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: of */
    public static ImmutableReference m4295of(Reference reference) {
        if (reference instanceof StringReference) {
            return ImmutableStringReference.m4296of((StringReference) reference);
        }
        if (reference instanceof TypeReference) {
            return ImmutableTypeReference.m4297of((TypeReference) reference);
        }
        if (reference instanceof FieldReference) {
            return ImmutableFieldReference.m4290of((FieldReference) reference);
        }
        if (reference instanceof MethodReference) {
            return ImmutableMethodReference.m4293of((MethodReference) reference);
        }
        if (reference instanceof MethodProtoReference) {
            return ImmutableMethodProtoReference.m4292of((MethodProtoReference) reference);
        }
        if (reference instanceof CallSiteReference) {
            return ImmutableCallSiteReference.m4289of((CallSiteReference) reference);
        }
        if (reference instanceof MethodHandleReference) {
            return ImmutableMethodHandleReference.m4291of((MethodHandleReference) reference);
        }
        throw new ExceptionWithContext("Invalid reference type", new Object[0]);
    }
}
