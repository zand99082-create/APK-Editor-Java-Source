package org.p120jf.dexlib2.analysis;

import org.p120jf.dexlib2.iface.Method;

/* JADX INFO: loaded from: classes.dex */
public interface TypeProto {
    TypeProto getCommonSuperclass(TypeProto typeProto);

    Method getMethodByVtableIndex(int i);

    String getType();

    boolean isInterface();
}
