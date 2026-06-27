package com.p046a.p049b.p058c.p060b;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p058c.C0615a;
import com.p046a.p049b.p066f.p068b.AbstractC0839i;
import com.p046a.p049b.p066f.p068b.C0827a;
import com.p046a.p049b.p066f.p068b.C0833c;
import com.p046a.p049b.p066f.p068b.C0845o;
import com.p046a.p049b.p066f.p068b.C0848r;
import com.p046a.p049b.p066f.p068b.C0850t;
import com.p046a.p049b.p066f.p068b.C0854x;
import com.p046a.p049b.p073h.C0962j;

/* JADX INFO: renamed from: com.a.b.c.b.ae */
/* JADX INFO: loaded from: classes.dex */
public final class C0649ae {

    /* JADX INFO: renamed from: a */
    private final C0854x f1072a;

    /* JADX INFO: renamed from: b */
    private final int f1073b;

    /* JADX INFO: renamed from: c */
    private final C0845o f1074c;

    /* JADX INFO: renamed from: d */
    private final C0659b f1075d;

    /* JADX INFO: renamed from: e */
    private final C0683z f1076e;

    /* JADX INFO: renamed from: f */
    private final C0652ah f1077f;

    /* JADX INFO: renamed from: g */
    private final int f1078g;

    /* JADX INFO: renamed from: h */
    private int[] f1079h = null;

    /* JADX INFO: renamed from: i */
    private final int f1080i;

    /* JADX INFO: renamed from: j */
    private boolean f1081j;

    private C0649ae(C0854x c0854x, int i, C0845o c0845o, int i2, C0615a c0615a) {
        this.f1072a = c0854x;
        this.f1073b = i;
        this.f1074c = c0845o;
        this.f1075d = new C0659b(c0854x);
        this.f1080i = i2;
        boolean[] zArr = {true};
        c0854x.m1844a().m1739a(new C0650af(zArr, c0854x.m1844a().m1741e(), i2));
        this.f1081j = zArr[0];
        C0833c c0833cM1844a = c0854x.m1844a();
        int iD_ = c0833cM1844a.m2239d_();
        int iM1742f = (iD_ * 3) + c0833cM1844a.m1742f();
        iM1742f = c0845o != null ? iM1742f + c0845o.m1776b() + iD_ : iM1742f;
        this.f1078g = (this.f1081j ? 0 : this.f1080i) + c0833cM1844a.m1741e();
        this.f1076e = new C0683z(c0615a, iM1742f, iD_ * 3, this.f1078g, i2);
        if (c0845o != null) {
            this.f1077f = new C0651ag(this, this.f1076e, c0845o);
        } else {
            this.f1077f = new C0652ah(this, this.f1076e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0667j m1142a(C0854x c0854x, int i, C0845o c0845o, int i2, C0615a c0615a) {
        int i3;
        C0827a c0827aM1740b;
        int i4;
        int iM2248b;
        C0649ae c0649ae = new C0649ae(c0854x, i, c0845o, i2, c0615a);
        C0833c c0833cM1844a = c0649ae.f1072a.m1844a();
        int iD_ = c0833cM1844a.m2239d_();
        int iJ = c0833cM1844a.m2263j();
        int[] iArrM2555s = C1067a.m2555s(iJ);
        int[] iArrM2555s2 = C1067a.m2555s(iJ);
        for (int i5 = 0; i5 < iD_; i5++) {
            C1067a.m2508b(iArrM2555s, c0833cM1844a.m1737a(i5).mo821a());
        }
        int[] iArr = new int[iD_];
        int i6 = 0;
        int iM1846b = c0649ae.f1072a.m1846b();
        while (iM1846b != -1) {
            while (true) {
                C0962j c0962jM1845a = c0649ae.f1072a.m1845a(iM1846b);
                int iM2247b = c0962jM1845a.m2247b();
                for (0; i3 < iM2247b; i3 + 1) {
                    iM2248b = c0962jM1845a.m2248b(i3);
                    if (!C1067a.m2489a(iArrM2555s2, iM2248b)) {
                        i3 = (C1067a.m2489a(iArrM2555s, iM2248b) && c0833cM1844a.m1740b(iM2248b).m1721d() == iM1846b) ? 0 : i3 + 1;
                    }
                }
                C1067a.m2508b(iArrM2555s2, iM2248b);
                iM1846b = iM2248b;
            }
            int iMo821a = iM1846b;
            int i7 = i6;
            while (iMo821a != -1) {
                C1067a.m2521c(iArrM2555s, iMo821a);
                C1067a.m2521c(iArrM2555s2, iMo821a);
                iArr[i7] = iMo821a;
                i7++;
                C0827a c0827aM1740b2 = c0833cM1844a.m1740b(iMo821a);
                int iM1721d = c0827aM1740b2.m1721d();
                C0962j c0962jM1720c = c0827aM1740b2.m1720c();
                switch (c0962jM1720c.m2247b()) {
                    case 0:
                        c0827aM1740b = null;
                        break;
                    case 1:
                        c0827aM1740b = c0833cM1844a.m1740b(c0962jM1720c.m2248b(0));
                        break;
                    default:
                        c0827aM1740b = iM1721d != -1 ? c0833cM1844a.m1740b(iM1721d) : c0833cM1844a.m1740b(c0962jM1720c.m2248b(0));
                        break;
                }
                if (c0827aM1740b != null) {
                    iMo821a = c0827aM1740b.mo821a();
                    int iM1721d2 = c0827aM1740b2.m1721d();
                    if (!C1067a.m2489a(iArrM2555s, iMo821a)) {
                        if (iM1721d2 == iMo821a || iM1721d2 < 0 || !C1067a.m2489a(iArrM2555s, iM1721d2)) {
                            C0962j c0962jM1720c2 = c0827aM1740b2.m1720c();
                            int iM2247b2 = c0962jM1720c2.m2247b();
                            while (true) {
                                if (i4 < iM2247b2) {
                                    iMo821a = c0962jM1720c2.m2248b(i4);
                                    i4 = C1067a.m2489a(iArrM2555s, iMo821a) ? 0 : i4 + 1;
                                } else {
                                    iMo821a = -1;
                                }
                            }
                        } else {
                            iMo821a = iM1721d2;
                        }
                    }
                }
            }
            i6 = i7;
            iM1846b = C1067a.m2524d(iArrM2555s, 0);
        }
        if (i6 != iD_) {
            throw new RuntimeException("shouldn't happen");
        }
        c0649ae.f1079h = iArr;
        c0649ae.m1145a();
        return new C0667j(c0649ae.f1073b, c0649ae.f1076e.m1295a(), new C0654aj(c0649ae.f1072a, c0649ae.f1079h, c0649ae.f1075d));
    }

    /* JADX INFO: renamed from: a */
    private void m1145a() {
        C0833c c0833cM1844a = this.f1072a.m1844a();
        int[] iArr = this.f1079h;
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = i + 1;
            int i3 = i2 == iArr.length ? -1 : iArr[i2];
            C0827a c0827aM1740b = c0833cM1844a.m1740b(iArr[i]);
            C0665h c0665hM1179a = this.f1075d.m1179a(c0827aM1740b);
            this.f1076e.m1297a(c0665hM1179a);
            if (this.f1074c != null) {
                this.f1076e.m1297a(new C0680w(c0665hM1179a.m1224i(), this.f1074c.m1773a(c0827aM1740b.mo821a())));
            }
            this.f1077f.m1160a(c0827aM1740b, this.f1075d.m1180b(c0827aM1740b));
            c0827aM1740b.m1719b().m1761a(this.f1077f);
            this.f1076e.m1297a(this.f1075d.m1181c(c0827aM1740b));
            int iM1721d = c0827aM1740b.m1721d();
            AbstractC0839i abstractC0839iM1724g = c0827aM1740b.m1724g();
            if (iM1721d >= 0 && iM1721d != i3) {
                if (abstractC0839iM1724g.m1752f().m1839d() == 4 && c0827aM1740b.m1722e() == i3) {
                    this.f1076e.m1296a(1, this.f1075d.m1178a(iM1721d));
                } else {
                    this.f1076e.m1297a(new C0656al(C0672o.f1136H, abstractC0839iM1724g.m1753g(), C0850t.f2003a, this.f1075d.m1178a(iM1721d)));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static C0850t m1146b(AbstractC0839i abstractC0839i, C0848r c0848r) {
        C0850t c0850tM1756j = abstractC0839i.m1756j();
        if (abstractC0839i.m1752f().m1841f() && c0850tM1756j.m2239d_() == 2 && c0848r.m1795g() == c0850tM1756j.m1815b(1).m1795g()) {
            c0850tM1756j = C0850t.m1809a(c0850tM1756j.m1815b(1), c0850tM1756j.m1815b(0));
        }
        return c0848r == null ? c0850tM1756j : c0850tM1756j.m1816b(c0848r);
    }
}
