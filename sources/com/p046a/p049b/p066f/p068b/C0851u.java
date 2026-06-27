package com.p046a.p049b.p066f.p068b;

import java.util.BitSet;

/* JADX INFO: renamed from: com.a.b.f.b.u */
/* JADX INFO: loaded from: classes.dex */
final class C0851u {

    /* JADX INFO: renamed from: a */
    private BitSet f2004a;

    /* JADX INFO: renamed from: b */
    private C0850t f2005b;

    /* JADX INFO: renamed from: c */
    private int f2006c;

    /* JADX INFO: renamed from: d */
    private C0850t f2007d;

    /* JADX INFO: renamed from: e */
    private boolean f2008e;

    private C0851u(C0850t c0850t, BitSet bitSet, int i, boolean z) {
        this.f2005b = c0850t;
        this.f2004a = bitSet;
        this.f2006c = i;
        this.f2007d = new C0850t(c0850t.m2239d_());
        this.f2008e = z;
    }

    /* synthetic */ C0851u(C0850t c0850t, BitSet bitSet, int i, boolean z, byte b2) {
        this(c0850t, bitSet, i, z);
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ C0850t m1822a(C0851u c0851u) {
        if (c0851u.f2005b.m2265k()) {
            c0851u.f2007d.mo811b_();
        }
        return c0851u.f2007d;
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ void m1823a(C0851u c0851u, int i) {
        boolean z = true;
        C0848r c0848rM1787a = (C0848r) c0851u.f2005b.m2240e(i);
        if (c0851u.f2004a != null && c0851u.f2004a.get(i)) {
            z = false;
        }
        if (z) {
            c0848rM1787a = c0848rM1787a.m1787a(c0851u.f2006c);
            if (!c0851u.f2008e) {
                c0851u.f2006c += c0848rM1787a.m1799k();
            }
            c0851u.f2008e = false;
        }
        c0851u.f2007d.m2237a(i, (Object) c0848rM1787a);
    }
}
