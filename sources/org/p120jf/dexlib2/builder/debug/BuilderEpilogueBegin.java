package org.p120jf.dexlib2.builder.debug;

import org.p120jf.dexlib2.builder.BuilderDebugItem;
import org.p120jf.dexlib2.iface.debug.EpilogueBegin;

/* JADX INFO: loaded from: classes.dex */
public class BuilderEpilogueBegin extends BuilderDebugItem implements EpilogueBegin {
    @Override // org.p120jf.dexlib2.iface.debug.DebugItem
    public int getDebugItemType() {
        return 8;
    }
}
