package org.p120jf.dexlib2.immutable.reference;

import org.p120jf.dexlib2.base.reference.BaseTypeReference;
import org.p120jf.dexlib2.iface.reference.TypeReference;
import org.p120jf.util.ImmutableConverter;

/* JADX INFO: loaded from: classes.dex */
public class ImmutableTypeReference extends BaseTypeReference implements ImmutableReference {
    public final String type;

    static {
        new ImmutableConverter<ImmutableTypeReference, TypeReference>() { // from class: org.jf.dexlib2.immutable.reference.ImmutableTypeReference.1
            @Override // org.p120jf.util.ImmutableConverter
            public boolean isImmutable(TypeReference typeReference) {
                return typeReference instanceof ImmutableTypeReference;
            }

            @Override // org.p120jf.util.ImmutableConverter
            public ImmutableTypeReference makeImmutable(TypeReference typeReference) {
                return ImmutableTypeReference.m4297of(typeReference);
            }
        };
    }

    public ImmutableTypeReference(String str) {
        this.type = str;
    }

    /* JADX INFO: renamed from: of */
    public static ImmutableTypeReference m4297of(TypeReference typeReference) {
        return typeReference instanceof ImmutableTypeReference ? (ImmutableTypeReference) typeReference : new ImmutableTypeReference(typeReference.getType());
    }

    @Override // org.p120jf.dexlib2.iface.reference.TypeReference
    public String getType() {
        return this.type;
    }
}
