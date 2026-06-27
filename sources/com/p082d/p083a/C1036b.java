package com.p082d.p083a;

import java.util.Map;

/* JADX INFO: renamed from: com.d.a.b */
/* JADX INFO: loaded from: classes.dex */
final class C1036b implements InterfaceC1044j {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1035a f2759a;

    C1036b(C1035a c1035a) {
        this.f2759a = c1035a;
    }

    @Override // com.p082d.p083a.InterfaceC1044j
    /* JADX INFO: renamed from: a */
    public final Object mo2372a(Object obj, Map map) {
        try {
            return this.f2759a.m2369a(obj, map);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }
}
