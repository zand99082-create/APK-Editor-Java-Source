package com.p082d.p083a;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

/* JADX INFO: renamed from: com.d.a.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1042h implements InterfaceC1045k {
    @Override // com.p082d.p083a.InterfaceC1045k
    /* JADX INFO: renamed from: a */
    public final Object mo2373a(Object obj, InterfaceC1044j interfaceC1044j, Map map) {
        LinkedList linkedList = new LinkedList();
        Iterator it = ((LinkedList) obj).iterator();
        while (it.hasNext()) {
            linkedList.add(interfaceC1044j.mo2372a(it.next(), map));
        }
        return linkedList;
    }
}
