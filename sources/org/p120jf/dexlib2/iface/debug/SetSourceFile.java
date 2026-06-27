package org.p120jf.dexlib2.iface.debug;

import org.p120jf.dexlib2.iface.reference.StringReference;

/* JADX INFO: loaded from: classes.dex */
public interface SetSourceFile extends DebugItem {
    String getSourceFile();

    StringReference getSourceFileReference();
}
