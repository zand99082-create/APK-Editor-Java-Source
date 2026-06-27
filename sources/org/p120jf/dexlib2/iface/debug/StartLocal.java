package org.p120jf.dexlib2.iface.debug;

import org.p120jf.dexlib2.iface.reference.StringReference;
import org.p120jf.dexlib2.iface.reference.TypeReference;

/* JADX INFO: loaded from: classes.dex */
public interface StartLocal extends DebugItem, LocalInfo {
    StringReference getNameReference();

    int getRegister();

    StringReference getSignatureReference();

    TypeReference getTypeReference();
}
