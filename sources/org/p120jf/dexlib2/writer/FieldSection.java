package org.p120jf.dexlib2.writer;

import org.p120jf.dexlib2.iface.reference.FieldReference;

/* JADX INFO: loaded from: classes.dex */
public interface FieldSection<StringKey, TypeKey, FieldRefKey extends FieldReference, FieldKey> extends IndexSection<FieldRefKey> {
    TypeKey getDefiningClass(FieldRefKey fieldrefkey);

    int getFieldIndex(FieldKey fieldkey);

    TypeKey getFieldType(FieldRefKey fieldrefkey);

    StringKey getName(FieldRefKey fieldrefkey);
}
