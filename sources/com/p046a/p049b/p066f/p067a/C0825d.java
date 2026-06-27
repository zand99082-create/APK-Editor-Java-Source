package com.p046a.p049b.p066f.p067a;

import com.p046a.p049b.p073h.C0959g;

/* JADX INFO: renamed from: com.a.b.f.a.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0825d extends C0959g {

    /* JADX INFO: renamed from: a */
    public static final C0825d f1948a = new C0825d(0);

    public C0825d(int i) {
        super(i);
    }

    /* JADX INFO: renamed from: a */
    public static C0825d m1713a(C0825d c0825d, C0825d c0825d2) {
        int iD_ = c0825d.m2239d_();
        if (iD_ != c0825d2.m2239d_()) {
            throw new IllegalArgumentException("list1.size() != list2.size()");
        }
        C0825d c0825d3 = new C0825d(iD_);
        for (int i = 0; i < iD_; i++) {
            c0825d3.m1715a(i, C0824c.m1707a(c0825d.m1714a(i), c0825d2.m1714a(i)));
        }
        c0825d3.mo811b_();
        return c0825d3;
    }

    /* JADX INFO: renamed from: a */
    public final C0824c m1714a(int i) {
        return (C0824c) m2240e(i);
    }

    /* JADX INFO: renamed from: a */
    public final void m1715a(int i, C0824c c0824c) {
        c0824c.m2267m();
        m2237a(i, (Object) c0824c);
    }
}
