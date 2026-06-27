package com.p046a.p049b.p071g;

import com.p046a.p049b.p066f.p068b.C0848r;
import com.p046a.p049b.p066f.p068b.C0850t;
import com.p046a.p049b.p066f.p068b.C0852v;

/* JADX INFO: renamed from: com.a.b.g.ag */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0913ag {
    /* JADX INFO: renamed from: a */
    public abstract int mo1960a();

    /* JADX INFO: renamed from: a */
    public abstract C0848r mo1962a(C0848r c0848r);

    /* JADX INFO: renamed from: a */
    public final C0850t m2036a(C0850t c0850t) {
        int iD_ = c0850t.m2239d_();
        C0850t c0850t2 = new C0850t(iD_);
        for (int i = 0; i < iD_; i++) {
            c0850t2.m1814a(i, mo1962a(c0850t.m1815b(i)));
        }
        c0850t2.mo811b_();
        return c0850t2.equals(c0850t) ? c0850t : c0850t2;
    }

    /* JADX INFO: renamed from: a */
    public final C0852v m2037a(C0852v c0852v) {
        int iM1829b = c0852v.m1829b();
        C0852v c0852v2 = new C0852v(mo1960a());
        for (int i = 0; i < iM1829b; i++) {
            C0848r c0848rM1824a = c0852v.m1824a(i);
            if (c0848rM1824a != null) {
                c0852v2.m1834d(mo1962a(c0848rM1824a));
            }
        }
        c0852v2.mo811b_();
        return c0852v2.equals(c0852v) ? c0852v : c0852v2;
    }
}
