package com.p082d.p083a;

import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.d.a.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1043i implements InterfaceC1045k {
    @Override // com.p082d.p083a.InterfaceC1045k
    /* JADX INFO: renamed from: a */
    public final Object mo2373a(Object obj, InterfaceC1044j interfaceC1044j, Map map) {
        TreeMap treeMap = (TreeMap) obj;
        TreeMap treeMap2 = new TreeMap(treeMap.comparator());
        for (Map.Entry entry : treeMap.entrySet()) {
            treeMap2.put(interfaceC1044j.mo2372a(entry.getKey(), map), interfaceC1044j.mo2372a(entry.getValue(), map));
        }
        return treeMap2;
    }
}
