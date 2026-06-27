package com.p082d.p083a;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.d.a.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1041g implements InterfaceC1045k {
    @Override // com.p082d.p083a.InterfaceC1045k
    /* JADX INFO: renamed from: a */
    public final Object mo2373a(Object obj, InterfaceC1044j interfaceC1044j, Map map) {
        HashSet hashSet = new HashSet();
        Iterator it = ((HashSet) obj).iterator();
        while (it.hasNext()) {
            hashSet.add(interfaceC1044j.mo2372a(it.next(), map));
        }
        return hashSet;
    }
}
