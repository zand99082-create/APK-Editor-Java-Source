package com.p082d.p083a;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.d.a.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1040f implements InterfaceC1045k {
    @Override // com.p082d.p083a.InterfaceC1045k
    /* JADX INFO: renamed from: a */
    public final Object mo2373a(Object obj, InterfaceC1044j interfaceC1044j, Map map) {
        HashMap map2 = new HashMap();
        for (Map.Entry entry : ((HashMap) obj).entrySet()) {
            map2.put(interfaceC1044j.mo2372a(entry.getKey(), map), interfaceC1044j.mo2372a(entry.getValue(), map));
        }
        return map2;
    }
}
