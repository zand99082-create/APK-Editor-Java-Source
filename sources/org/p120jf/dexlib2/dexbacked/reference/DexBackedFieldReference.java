package org.p120jf.dexlib2.dexbacked.reference;

import org.p120jf.dexlib2.base.reference.BaseFieldReference;
import org.p120jf.dexlib2.dexbacked.DexBackedDexFile;
import org.p120jf.dexlib2.iface.reference.Reference;

/* JADX INFO: loaded from: classes.dex */
public class DexBackedFieldReference extends BaseFieldReference {
    public final DexBackedDexFile dexFile;
    public final int fieldIndex;

    public DexBackedFieldReference(DexBackedDexFile dexBackedDexFile, int i) {
        this.dexFile = dexBackedDexFile;
        this.fieldIndex = i;
    }

    @Override // org.p120jf.dexlib2.iface.reference.FieldReference, org.p120jf.dexlib2.iface.Field
    public String getDefiningClass() {
        return this.dexFile.getTypeSection().get(this.dexFile.getBuffer().readUshort(this.dexFile.getFieldSection().getOffset(this.fieldIndex) + 0));
    }

    @Override // org.p120jf.dexlib2.iface.reference.FieldReference, org.p120jf.dexlib2.iface.Field
    public String getName() {
        return this.dexFile.getStringSection().get(this.dexFile.getBuffer().readSmallUint(this.dexFile.getFieldSection().getOffset(this.fieldIndex) + 4));
    }

    @Override // org.p120jf.dexlib2.iface.reference.FieldReference, org.p120jf.dexlib2.iface.Field
    public String getType() {
        return this.dexFile.getTypeSection().get(this.dexFile.getBuffer().readUshort(this.dexFile.getFieldSection().getOffset(this.fieldIndex) + 2));
    }

    @Override // org.p120jf.dexlib2.base.reference.BaseReference, org.p120jf.dexlib2.iface.reference.Reference
    public void validateReference() throws Reference.InvalidReferenceException {
        int i = this.fieldIndex;
        if (i < 0 || i >= this.dexFile.getFieldSection().size()) {
            throw new Reference.InvalidReferenceException("field@" + this.fieldIndex);
        }
    }
}
