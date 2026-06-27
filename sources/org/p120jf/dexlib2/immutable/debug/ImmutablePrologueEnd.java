package org.p120jf.dexlib2.immutable.debug;

import org.p120jf.dexlib2.iface.debug.PrologueEnd;

/* JADX INFO: loaded from: classes.dex */
public class ImmutablePrologueEnd extends ImmutableDebugItem implements PrologueEnd {
    public ImmutablePrologueEnd(int i) {
        super(i);
    }

    /* JADX INFO: renamed from: of */
    public static ImmutablePrologueEnd m4246of(PrologueEnd prologueEnd) {
        return prologueEnd instanceof ImmutablePrologueEnd ? (ImmutablePrologueEnd) prologueEnd : new ImmutablePrologueEnd(prologueEnd.getCodeAddress());
    }

    @Override // org.p120jf.dexlib2.iface.debug.DebugItem
    public int getDebugItemType() {
        return 7;
    }
}
