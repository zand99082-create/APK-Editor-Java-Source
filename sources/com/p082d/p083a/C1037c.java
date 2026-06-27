package com.p082d.p083a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.d.a.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1037c implements InterfaceC1045k {
    @Override // com.p082d.p083a.InterfaceC1045k
    /* JADX INFO: renamed from: a */
    public final Object mo2373a(Object obj, InterfaceC1044j interfaceC1044j, Map map) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(interfaceC1044j.mo2372a(it.next(), map));
        }
        return arrayList;
    }
}
