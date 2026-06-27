package org.p120jf.dexlib2.dexbacked.reference;

import org.p120jf.dexlib2.base.reference.BaseTypeReference;
import org.p120jf.dexlib2.dexbacked.DexBackedDexFile;
import org.p120jf.dexlib2.iface.reference.Reference;

/* JADX INFO: loaded from: classes.dex */
public class DexBackedTypeReference extends BaseTypeReference {
    public final DexBackedDexFile dexFile;
    public final int typeIndex;

    public DexBackedTypeReference(DexBackedDexFile dexBackedDexFile, int i) {
        this.dexFile = dexBackedDexFile;
        this.typeIndex = i;
    }

    @Override // org.p120jf.dexlib2.iface.reference.TypeReference
    public String getType() {
        return this.dexFile.getTypeSection().get(this.typeIndex);
    }

    @Override // org.p120jf.dexlib2.base.reference.BaseReference, org.p120jf.dexlib2.iface.reference.Reference
    public void validateReference() throws Reference.InvalidReferenceException {
        int i = this.typeIndex;
        if (i < 0 || i >= this.dexFile.getTypeSection().size()) {
            throw new Reference.InvalidReferenceException("type@" + this.typeIndex);
        }
    }
}
