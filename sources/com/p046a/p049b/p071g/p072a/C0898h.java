package com.p046a.p049b.p071g.p072a;

import com.p046a.p049b.p066f.p068b.C0827a;
import com.p046a.p049b.p066f.p068b.C0833c;
import com.p046a.p049b.p066f.p068b.C0854x;
import com.p046a.p049b.p073h.C0962j;
import java.util.BitSet;

/* JADX INFO: renamed from: com.a.b.g.a.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0898h {

    /* JADX INFO: renamed from: a */
    private final C0854x f2393a;

    /* JADX INFO: renamed from: b */
    private final C0833c f2394b;

    /* JADX INFO: renamed from: c */
    private final C0833c f2395c;

    public C0898h(C0854x c0854x) {
        this.f2393a = c0854x;
        this.f2394b = this.f2393a.m1844a();
        this.f2395c = this.f2394b.m1744h();
    }

    /* JADX INFO: renamed from: a */
    private void m1997a(int i, C0962j c0962j) {
        int iM2247b = c0962j.m2247b();
        for (int i2 = 0; i2 < iM2247b; i2++) {
            int iM2248b = c0962j.m2248b(i2);
            C0962j c0962jM1845a = this.f2393a.m1845a(this.f2394b.m1740b(iM2248b).mo821a());
            int iM2247b2 = c0962jM1845a.m2247b();
            for (int i3 = 0; i3 < iM2247b2; i3++) {
                C0827a c0827aM1740b = this.f2395c.m1740b(c0962jM1845a.m2248b(i3));
                C0962j c0962jM2257f = c0827aM1740b.m1720c().m2257f();
                c0962jM2257f.m2249b(c0962jM2257f.m2256f(iM2248b), i);
                int iM1721d = c0827aM1740b.m1721d();
                if (iM1721d == iM2248b) {
                    iM1721d = i;
                }
                c0962jM2257f.mo811b_();
                this.f2395c.m1738a(this.f2395c.m2262c(c0827aM1740b.mo821a()), new C0827a(c0827aM1740b.mo821a(), c0827aM1740b.m1719b(), c0962jM2257f, iM1721d));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final C0854x m1998a() {
        int iD_ = this.f2394b.m2239d_();
        BitSet bitSet = new BitSet(this.f2394b.m2263j());
        for (int i = 0; i < iD_; i++) {
            C0827a c0827aM1737a = this.f2394b.m1737a(i);
            if (!bitSet.get(c0827aM1737a.mo821a())) {
                C0962j c0962jM1845a = this.f2393a.m1845a(c0827aM1737a.mo821a());
                int iM2247b = c0962jM1845a.m2247b();
                for (int i2 = 0; i2 < iM2247b; i2++) {
                    int iM2248b = c0962jM1845a.m2248b(i2);
                    C0827a c0827aM1740b = this.f2394b.m1740b(iM2248b);
                    if (!bitSet.get(iM2248b) && c0827aM1740b.m1720c().m2247b() <= 1 && c0827aM1740b.m1723f().m1752f().m1836a() != 55) {
                        C0962j c0962j = new C0962j();
                        for (int i3 = i2 + 1; i3 < iM2247b; i3++) {
                            int iM2248b2 = c0962jM1845a.m2248b(i3);
                            C0827a c0827aM1740b2 = this.f2394b.m1740b(iM2248b2);
                            if (c0827aM1740b2.m1720c().m2247b() == 1 && c0827aM1740b.m1719b().m1762a(c0827aM1740b2.m1719b())) {
                                c0962j.m2250c(iM2248b2);
                                bitSet.set(iM2248b2);
                            }
                        }
                        m1997a(iM2248b, c0962j);
                    }
                }
            }
        }
        for (int i4 = iD_ - 1; i4 >= 0; i4--) {
            if (bitSet.get(this.f2395c.m1737a(i4).mo821a())) {
                this.f2395c.m1738a(i4, (C0827a) null);
            }
        }
        this.f2395c.mo2242i();
        this.f2395c.mo811b_();
        return new C0854x(this.f2395c, this.f2393a.m1846b());
    }
}
