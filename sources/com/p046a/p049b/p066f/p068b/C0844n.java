package com.p046a.p049b.p066f.p068b;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p073h.C0962j;

/* JADX INFO: renamed from: com.a.b.f.b.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0844n {

    /* JADX INFO: renamed from: a */
    private final C0854x f1987a;

    /* JADX INFO: renamed from: b */
    private final C0833c f1988b;

    /* JADX INFO: renamed from: c */
    private final C0845o f1989c;

    /* JADX INFO: renamed from: d */
    private final int[] f1990d;

    private C0844n(C0854x c0854x) {
        if (c0854x == null) {
            throw new NullPointerException("method == null");
        }
        C0833c c0833cM1844a = c0854x.m1844a();
        int iJ = c0833cM1844a.m2263j();
        this.f1987a = c0854x;
        this.f1988b = c0833cM1844a;
        this.f1989c = new C0845o(c0854x);
        this.f1990d = C1067a.m2555s(iJ);
    }

    /* JADX INFO: renamed from: a */
    public static C0845o m1769a(C0854x c0854x) {
        C0844n c0844n = new C0844n(c0854x);
        for (int iM1846b = c0844n.f1987a.m1846b(); iM1846b >= 0; iM1846b = C1067a.m2524d(c0844n.f1990d, 0)) {
            C1067a.m2521c(c0844n.f1990d, iM1846b);
            C0852v c0852vM1777b = c0844n.f1989c.m1777b(iM1846b);
            C0827a c0827aM1740b = c0844n.f1988b.m1740b(iM1846b);
            C0842l c0842lM1719b = c0827aM1740b.m1719b();
            int iD_ = c0842lM1719b.m2239d_();
            boolean z = c0827aM1740b.m1726i() && c0842lM1719b.m1763e().m1754h() != null;
            int i = iD_ - 1;
            C0852v c0852vM1835e = c0852vM1777b;
            for (int i2 = 0; i2 < iD_; i2++) {
                if (z && i2 == i) {
                    c0852vM1835e.mo811b_();
                    c0852vM1835e = c0852vM1835e.m1835e();
                }
                AbstractC0839i abstractC0839iM1759a = c0842lM1719b.m1759a(i2);
                C0848r c0848rM1755i = abstractC0839iM1759a.m1755i();
                if (c0848rM1755i == null) {
                    C0848r c0848rM1754h = abstractC0839iM1759a.m1754h();
                    if (c0848rM1754h != null && c0852vM1835e.m1824a(c0848rM1754h.m1795g()) != null) {
                        c0852vM1835e.m1832c(c0852vM1835e.m1824a(c0848rM1754h.m1795g()));
                    }
                } else {
                    C0848r c0848rM1802n = c0848rM1755i.m1802n();
                    if (!c0848rM1802n.equals(c0852vM1835e.m1826a(c0848rM1802n))) {
                        C0848r c0848rM1825a = c0852vM1835e.m1825a(c0848rM1802n.m1797i());
                        if (c0848rM1825a != null && c0848rM1825a.m1795g() != c0848rM1802n.m1795g()) {
                            c0852vM1835e.m1832c(c0848rM1825a);
                        }
                        c0844n.f1989c.m1774a(abstractC0839iM1759a, c0848rM1802n);
                        c0852vM1835e.m1834d(c0848rM1802n);
                    }
                }
            }
            c0852vM1835e.mo811b_();
            C0962j c0962jM1720c = c0827aM1740b.m1720c();
            int iM2247b = c0962jM1720c.m2247b();
            int iM1721d = c0827aM1740b.m1721d();
            for (int i3 = 0; i3 < iM2247b; i3++) {
                int iM2248b = c0962jM1720c.m2248b(i3);
                if (c0844n.f1989c.m1775a(iM2248b, iM2248b == iM1721d ? c0852vM1835e : c0852vM1777b)) {
                    C1067a.m2508b(c0844n.f1990d, iM2248b);
                }
            }
        }
        c0844n.f1989c.mo811b_();
        return c0844n.f1989c;
    }
}
