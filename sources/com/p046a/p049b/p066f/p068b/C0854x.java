package com.p046a.p049b.p066f.p068b;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p073h.C0962j;

/* JADX INFO: renamed from: com.a.b.f.b.x */
/* JADX INFO: loaded from: classes.dex */
public final class C0854x {

    /* JADX INFO: renamed from: a */
    private final C0833c f2018a;

    /* JADX INFO: renamed from: b */
    private final int f2019b;

    /* JADX INFO: renamed from: c */
    private C0962j[] f2020c;

    /* JADX INFO: renamed from: d */
    private C0962j f2021d;

    public C0854x(C0833c c0833c, int i) {
        if (c0833c == null) {
            throw new NullPointerException("blocks == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("firstLabel < 0");
        }
        this.f2018a = c0833c;
        this.f2019b = i;
        this.f2020c = null;
        this.f2021d = null;
    }

    /* JADX INFO: renamed from: a */
    public final C0833c m1844a() {
        return this.f2018a;
    }

    /* JADX INFO: renamed from: a */
    public final C0962j m1845a(int i) {
        if (this.f2021d == null) {
            int iJ = this.f2018a.m2263j();
            C0962j[] c0962jArr = new C0962j[iJ];
            C0962j c0962j = new C0962j(10);
            int iD_ = this.f2018a.m2239d_();
            for (int i2 = 0; i2 < iD_; i2++) {
                C0827a c0827aM1737a = this.f2018a.m1737a(i2);
                int iMo821a = c0827aM1737a.mo821a();
                C0962j c0962jM1720c = c0827aM1737a.m1720c();
                int iM2247b = c0962jM1720c.m2247b();
                if (iM2247b == 0) {
                    c0962j.m2250c(iMo821a);
                } else {
                    for (int i3 = 0; i3 < iM2247b; i3++) {
                        int iM2248b = c0962jM1720c.m2248b(i3);
                        C0962j c0962j2 = c0962jArr[iM2248b];
                        if (c0962j2 == null) {
                            c0962j2 = new C0962j(10);
                            c0962jArr[iM2248b] = c0962j2;
                        }
                        c0962j2.m2250c(iMo821a);
                    }
                }
            }
            for (int i4 = 0; i4 < iJ; i4++) {
                C0962j c0962j3 = c0962jArr[i4];
                if (c0962j3 != null) {
                    c0962j3.m2259g();
                    c0962j3.mo811b_();
                }
            }
            c0962j.m2259g();
            c0962j.mo811b_();
            if (c0962jArr[this.f2019b] == null) {
                c0962jArr[this.f2019b] = C0962j.f2577a;
            }
            this.f2020c = c0962jArr;
            this.f2021d = c0962j;
        }
        C0962j c0962j4 = this.f2020c[i];
        if (c0962j4 == null) {
            throw new RuntimeException("no such block: " + C1067a.m2558v(i));
        }
        return c0962j4;
    }

    /* JADX INFO: renamed from: b */
    public final int m1846b() {
        return this.f2019b;
    }
}
