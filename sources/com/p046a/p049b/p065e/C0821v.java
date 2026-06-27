package com.p046a.p049b.p065e;

import java.util.Comparator;

/* JADX INFO: renamed from: com.a.b.e.v */
/* JADX INFO: loaded from: classes.dex */
final class C0821v implements Comparator {
    C0821v() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        C0820u c0820u = (C0820u) obj;
        C0820u c0820u2 = (C0820u) obj2;
        if (c0820u == c0820u2) {
            return 0;
        }
        if (c0820u2 == null) {
            return -1;
        }
        if (c0820u == null) {
            return 1;
        }
        return c0820u.f1936d != c0820u2.f1936d ? c0820u.f1936d - c0820u2.f1936d : c0820u.m1697c() - c0820u2.m1697c();
    }
}
