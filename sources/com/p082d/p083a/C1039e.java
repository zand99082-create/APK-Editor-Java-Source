package com.p082d.p083a;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.d.a.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1039e implements InterfaceC1045k {
    @Override // com.p082d.p083a.InterfaceC1045k
    /* JADX INFO: renamed from: a */
    public final Object mo2373a(Object obj, InterfaceC1044j interfaceC1044j, Map map) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry entry : ((ConcurrentHashMap) obj).entrySet()) {
            concurrentHashMap.put(interfaceC1044j.mo2372a(entry.getKey(), map), interfaceC1044j.mo2372a(entry.getValue(), map));
        }
        return concurrentHashMap;
    }
}
