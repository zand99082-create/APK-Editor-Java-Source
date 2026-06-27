package com.p046a.p049b.p050a.p052b;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p050a.p055e.InterfaceC0595h;
import com.p046a.p049b.p066f.p068b.AbstractC0839i;
import com.p046a.p049b.p066f.p068b.C0827a;
import com.p046a.p049b.p066f.p068b.C0829ab;
import com.p046a.p049b.p066f.p068b.C0830ac;
import com.p046a.p049b.p066f.p068b.C0833c;
import com.p046a.p049b.p066f.p068b.C0842l;
import com.p046a.p049b.p066f.p068b.C0846p;
import com.p046a.p049b.p066f.p068b.C0847q;
import com.p046a.p049b.p066f.p068b.C0848r;
import com.p046a.p049b.p066f.p068b.C0850t;
import com.p046a.p049b.p066f.p068b.C0853w;
import com.p046a.p049b.p066f.p068b.C0854x;
import com.p046a.p049b.p066f.p068b.C0855y;
import com.p046a.p049b.p066f.p068b.C0856z;
import com.p046a.p049b.p066f.p068b.InterfaceC0831ad;
import com.p046a.p049b.p066f.p068b.InterfaceC0832b;
import com.p046a.p049b.p066f.p069c.C0872n;
import com.p046a.p049b.p066f.p069c.C0884z;
import com.p046a.p049b.p066f.p070d.C0886b;
import com.p046a.p049b.p066f.p070d.C0887c;
import com.p046a.p049b.p066f.p070d.InterfaceC0889e;
import com.p046a.p049b.p073h.C0962j;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;

/* JADX INFO: renamed from: com.a.b.a.b.x */
/* JADX INFO: loaded from: classes.dex */
public final class C0568x {

    /* JADX INFO: renamed from: a */
    private final C0556l f917a;

    /* JADX INFO: renamed from: b */
    private final C0548d f918b;

    /* JADX INFO: renamed from: c */
    private final int f919c;

    /* JADX INFO: renamed from: d */
    private final int f920d;

    /* JADX INFO: renamed from: e */
    private final C0540ag f921e;

    /* JADX INFO: renamed from: f */
    private final C0542ai f922f;

    /* JADX INFO: renamed from: g */
    private final C0558n[] f923g;

    /* JADX INFO: renamed from: h */
    private final ArrayList f924h;

    /* JADX INFO: renamed from: i */
    private final ArrayList f925i;

    /* JADX INFO: renamed from: j */
    private final C0534aa[] f926j;

    /* JADX INFO: renamed from: k */
    private boolean f927k;

    /* JADX INFO: renamed from: l */
    private final C0538ae[] f928l;

    /* JADX INFO: renamed from: m */
    private boolean f929m;

    /* JADX INFO: renamed from: n */
    private final C0536ac f930n;

    private C0568x(C0556l c0556l, InterfaceC0831ad interfaceC0831ad, InterfaceC0595h interfaceC0595h) {
        if (c0556l == null) {
            throw new NullPointerException("method == null");
        }
        if (interfaceC0831ad == null) {
            throw new NullPointerException("advice == null");
        }
        this.f917a = c0556l;
        this.f918b = C0546b.m816a(c0556l);
        this.f920d = this.f918b.m2263j();
        this.f919c = c0556l.m854j();
        this.f921e = new C0540ag(this, c0556l, interfaceC0831ad, interfaceC0595h);
        this.f922f = new C0542ai(this.f921e, c0556l);
        this.f923g = new C0558n[this.f920d];
        this.f928l = new C0538ae[this.f920d];
        this.f924h = new ArrayList((this.f918b.m2239d_() << 1) + 10);
        this.f925i = new ArrayList((this.f918b.m2239d_() << 1) + 10);
        this.f926j = new C0534aa[this.f920d];
        this.f927k = false;
        this.f923g[0] = new C0558n(this.f919c, c0556l.m853i());
        this.f930n = new C0536ac(this);
    }

    /* JADX INFO: renamed from: a */
    private int m931a(int i) {
        return this.f920d + this.f917a.m856l().m2239d_() + (i ^ (-1));
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ C0842l m934a(C0568x c0568x, C0842l c0842l) {
        int i;
        int i2 = 0;
        int iD_ = c0842l.m2239d_();
        int i3 = 0;
        for (int i4 = 0; i4 < iD_; i4++) {
            if (c0842l.m1759a(i4).m1752f() != C0855y.f2209g) {
                i3++;
            }
        }
        if (i3 == iD_) {
            return c0842l;
        }
        C0842l c0842l2 = new C0842l(i3);
        int i5 = 0;
        while (i5 < iD_) {
            AbstractC0839i abstractC0839iM1759a = c0842l.m1759a(i5);
            if (abstractC0839iM1759a.m1752f() != C0855y.f2209g) {
                i = i2 + 1;
                c0842l2.m1760a(i2, abstractC0839iM1759a);
            } else {
                i = i2;
            }
            i5++;
            i2 = i;
        }
        c0842l2.mo811b_();
        return c0842l2;
    }

    /* JADX INFO: renamed from: a */
    public static C0854x m935a(C0556l c0556l, InterfaceC0831ad interfaceC0831ad, InterfaceC0595h interfaceC0595h) {
        C0842l c0842l;
        try {
            C0568x c0568x = new C0568x(c0556l, interfaceC0831ad, interfaceC0595h);
            int[] iArrM2555s = C1067a.m2555s(c0568x.f920d);
            C1067a.m2508b(iArrM2555s, 0);
            C0561q c0561qM857m = c0568x.f917a.m857m();
            C0856z c0856zM844a = c0568x.f917a.m844a(0);
            C0886b c0886bM1927b = c0568x.f917a.mo851g().m1927b();
            int iD_ = c0886bM1927b.m2239d_();
            C0842l c0842l2 = new C0842l(iD_ + 1);
            int iM1949i = 0;
            for (int i = 0; i < iD_; i++) {
                C0887c c0887cM1938b = c0886bM1927b.m1938b(i);
                C0562r c0562rM897a = c0561qM857m.m897a(0, iM1949i);
                c0842l2.m1760a(i, (AbstractC0839i) new C0846p(C0855y.m1854b(c0887cM1938b), c0856zM844a, c0562rM897a == null ? C0848r.m1778a(iM1949i, c0887cM1938b) : C0848r.m1782b(iM1949i, c0887cM1938b, c0562rM897a.m901a()), C0850t.f2003a, C0872n.m1891a(iM1949i)));
                iM1949i = c0887cM1938b.m1949i() + iM1949i;
            }
            c0842l2.m1760a(iD_, (AbstractC0839i) new C0847q(C0855y.f2221s, c0856zM844a, (C0848r) null, C0850t.f2003a));
            c0842l2.mo811b_();
            boolean zM956d = c0568x.m956d();
            int iM931a = zM956d ? c0568x.m931a(-4) : 0;
            c0568x.m941a(new C0827a(c0568x.m931a(-1), c0842l2, C0962j.m2244a(iM931a), iM931a), C0962j.f2577a);
            if (zM956d) {
                C0848r c0848rM959g = c0568x.m959g();
                if (c0568x.m957e()) {
                    C0829ab c0829ab = new C0829ab(C0855y.f2219q, c0856zM844a, C0850t.f2003a, C0886b.f2306a, c0568x.f917a.mo850f());
                    C0842l c0842l3 = new C0842l(1);
                    c0842l3.m1760a(0, (AbstractC0839i) c0829ab);
                    c0842l = c0842l3;
                } else {
                    C0842l c0842l4 = new C0842l(2);
                    c0842l4.m1760a(0, (AbstractC0839i) new C0846p(C0855y.f2214l, c0856zM844a, c0848rM959g, C0850t.f2003a, C0872n.f2249b));
                    c0842l4.m1760a(1, (AbstractC0839i) new C0847q(C0855y.f2221s, c0856zM844a, (C0848r) null, C0850t.f2003a));
                    c0842l = c0842l4;
                }
                int iM931a2 = c0568x.m931a(-5);
                c0842l.mo811b_();
                c0568x.m941a(new C0827a(iM931a, c0842l, C0962j.m2244a(iM931a2), iM931a2), C0962j.f2577a);
                C0842l c0842l5 = new C0842l(c0568x.m957e() ? 2 : 1);
                if (c0568x.m957e()) {
                    c0842l5.m1760a(0, (AbstractC0839i) new C0847q(C0855y.m1857e(c0848rM959g), c0856zM844a, c0848rM959g, C0850t.f2003a));
                }
                c0842l5.m1760a(c0568x.m957e() ? 1 : 0, (AbstractC0839i) new C0830ac(C0855y.f2137bj, c0856zM844a, C0850t.m1808a(c0848rM959g), C0886b.f2306a));
                c0842l5.mo811b_();
                c0568x.m941a(new C0827a(iM931a2, c0842l5, C0962j.m2244a(0), 0), C0962j.f2577a);
            }
            c0568x.f923g[0].m879a(c0568x.f917a.mo851g().m1927b());
            c0568x.f923g[0].m882b();
            while (true) {
                int iM2524d = C1067a.m2524d(iArrM2555s, 0);
                if (iM2524d < 0) {
                    break;
                }
                C1067a.m2521c(iArrM2555s, iM2524d);
                try {
                    c0568x.m938a(c0568x.f918b.m826a(iM2524d), c0568x.f923g[iM2524d], iArrM2555s);
                } catch (C0541ah e) {
                    e.m573a("...while working on block " + C1067a.m2558v(iM2524d));
                    throw e;
                }
            }
            C0853w c0853wM780n = c0568x.f921e.m780n();
            if (c0853wM780n != null) {
                C0856z c0856zM781o = c0568x.f921e.m781o();
                int iM931a3 = c0568x.m931a(-2);
                if (c0568x.m956d()) {
                    C0842l c0842l6 = new C0842l(1);
                    c0842l6.m1760a(0, (AbstractC0839i) new C0830ac(C0855y.f2138bk, c0856zM781o, C0850t.m1808a(c0568x.m959g()), C0886b.f2306a));
                    c0842l6.mo811b_();
                    int iM931a4 = c0568x.m931a(-3);
                    c0568x.m941a(new C0827a(iM931a3, c0842l6, C0962j.m2244a(iM931a4), iM931a4), C0962j.f2577a);
                    iM931a3 = iM931a4;
                }
                C0842l c0842l7 = new C0842l(1);
                InterfaceC0889e interfaceC0889eM1838c = c0853wM780n.m1838c();
                c0842l7.m1760a(0, (AbstractC0839i) new C0847q(c0853wM780n, c0856zM781o, (C0848r) null, interfaceC0889eM1838c.mo1021d_() == 0 ? C0850t.f2003a : C0850t.m1808a(C0848r.m1778a(0, interfaceC0889eM1838c.mo1018a(0)))));
                c0842l7.mo811b_();
                c0568x.m941a(new C0827a(iM931a3, c0842l7, C0962j.f2577a, -1), C0962j.f2577a);
            }
            if (c0568x.f927k) {
                C0856z c0856zM844a2 = c0568x.f917a.m844a(0);
                C0848r c0848rM1778a = C0848r.m1778a(0, C0887c.f2358q);
                C0842l c0842l8 = new C0842l(2);
                c0842l8.m1760a(0, (AbstractC0839i) new C0847q(C0855y.m1855c(C0887c.f2358q), c0856zM844a2, c0848rM1778a, C0850t.f2003a));
                c0842l8.m1760a(1, (AbstractC0839i) new C0830ac(C0855y.f2138bk, c0856zM844a2, C0850t.m1808a(c0568x.m959g()), C0886b.f2306a));
                c0842l8.mo811b_();
                int iM931a5 = c0568x.m931a(-7);
                c0568x.m941a(new C0827a(c0568x.m931a(-6), c0842l8, C0962j.m2244a(iM931a5), iM931a5), C0962j.f2577a);
                C0842l c0842l9 = new C0842l(1);
                c0842l9.m1760a(0, (AbstractC0839i) new C0830ac(C0855y.f2136bi, c0856zM844a2, C0850t.m1808a(c0848rM1778a), C0886b.f2306a));
                c0842l9.mo811b_();
                c0568x.m941a(new C0827a(iM931a5, c0842l9, C0962j.f2577a, -1), C0962j.f2577a);
            }
            c0568x.m961i();
            if (c0568x.f929m) {
                c0568x.m962j();
            }
            return c0568x.m960h();
        } catch (C0541ah e2) {
            e2.m573a("...while working on method " + c0556l.mo845a().mo919d());
            throw e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m936a(int i, int i2, C0538ae c0538ae, C0558n c0558n, int[] iArr) {
        C0558n c0558n2 = this.f923g[i];
        if (c0558n2 != null) {
            C0558n c0558nM876a = c0538ae != null ? c0558n2.m876a(c0558n, c0538ae.m769a(), i2) : c0558n2.m875a(c0558n);
            if (c0558nM876a == c0558n2) {
                return;
            } else {
                this.f923g[i] = c0558nM876a;
            }
        } else if (c0538ae != null) {
            this.f923g[i] = c0558n.m881b(i, i2);
        } else {
            this.f923g[i] = c0558n;
        }
        C1067a.m2508b(iArr, i);
    }

    /* JADX INFO: renamed from: a */
    private void m937a(int i, InterfaceC0832b interfaceC0832b) {
        m940a(m954c(i), interfaceC0832b, new BitSet(this.f920d));
    }

    /* JADX INFO: renamed from: a */
    private void m938a(C0547c c0547c, C0558n c0558n, int[] iArr) {
        int iM2247b;
        C0962j c0962j;
        int i;
        C0962j c0962jM2244a;
        int iM2248b;
        C0962j c0962j2;
        C0962j c0962jM2244a2;
        C0549e c0549eM825e = c0547c.m825e();
        this.f921e.m778a(c0549eM825e.m830a_());
        C0558n c0558nM873a = c0558n.m873a();
        this.f922f.m794a(c0547c, c0558nM873a);
        c0558nM873a.m882b();
        int iM785s = this.f921e.m785s();
        ArrayList arrayListM779m = this.f921e.m779m();
        int size = arrayListM779m.size();
        int iD_ = c0549eM825e.m2239d_();
        C0962j c0962jM824d = c0547c.m824d();
        C0538ae c0538ae = null;
        if (this.f921e.m787u()) {
            iM2247b = 1;
            int iM2248b2 = c0962jM824d.m2248b(1);
            if (this.f928l[iM2248b2] == null) {
                this.f928l[iM2248b2] = new C0538ae(this, iM2248b2);
            }
            this.f928l[iM2248b2].m773b(c0547c.mo821a());
            c0538ae = this.f928l[iM2248b2];
            c0962j = c0962jM824d;
        } else if (this.f921e.m788v()) {
            int iM930g = this.f921e.m789w().m930g();
            if (this.f928l[iM930g] == null) {
                this.f928l[iM930g] = new C0538ae(this, iM930g, c0547c.mo821a());
            } else {
                this.f928l[iM930g].m770a(c0547c.mo821a());
            }
            C0962j c0962jM772b = this.f928l[iM930g].m772b();
            this.f928l[iM930g].m771a(c0558nM873a, iArr);
            iM2247b = c0962jM772b.m2247b();
            c0962j = c0962jM772b;
        } else if (this.f921e.m782p()) {
            iM2247b = iD_;
            c0962j = c0962jM824d;
        } else {
            iM2247b = 0;
            c0962j = c0962jM824d;
        }
        int iM2247b2 = c0962j.m2247b();
        for (int i2 = iM2247b; i2 < iM2247b2; i2++) {
            int iM2248b3 = c0962j.m2248b(i2);
            try {
                m936a(iM2248b3, c0547c.mo821a(), c0538ae, c0558nM873a, iArr);
            } catch (C0541ah e) {
                e.m573a("...while merging to block " + C1067a.m2558v(iM2248b3));
                throw e;
            }
        }
        if (iM2247b2 == 0 && this.f921e.m783q()) {
            i = 1;
            c0962jM2244a = C0962j.m2244a(m931a(-2));
        } else {
            i = iM2247b2;
            c0962jM2244a = c0962j;
        }
        if (i == 0) {
            iM2248b = -1;
        } else {
            int iM784r = this.f921e.m784r();
            iM2248b = iM784r >= 0 ? c0962jM2244a.m2248b(iM784r) : iM784r;
        }
        boolean z = m956d() && this.f921e.m786t();
        if (z || iD_ != 0) {
            C0962j c0962j3 = new C0962j(i);
            boolean z2 = false;
            int i3 = 0;
            while (i3 < iD_) {
                C0550f c0550fM828a = c0549eM825e.m828a(i3);
                C0884z c0884zM836d = c0550fM828a.m836d();
                int iM835c = c0550fM828a.m835c();
                boolean z3 = z2 | (c0884zM836d == C0884z.f2270a);
                try {
                    m936a(iM835c, c0547c.mo821a(), null, c0558nM873a.m877a(c0884zM836d), iArr);
                    C0534aa c0534aa = this.f926j[iM835c];
                    if (c0534aa == null) {
                        c0534aa = new C0534aa(this, (byte) 0);
                        this.f926j[iM835c] = c0534aa;
                    }
                    c0962j3.m2250c(c0534aa.m762a(c0884zM836d.m1917i()).m765b());
                    i3++;
                    z2 = z3;
                } catch (C0541ah e2) {
                    e2.m573a("...while merging exception to block " + C1067a.m2558v(iM835c));
                    throw e2;
                }
            }
            if (z && !z2) {
                c0962j3.m2250c(m931a(-6));
                this.f927k = true;
                for (int i4 = (size - iM785s) - 1; i4 < size; i4++) {
                    AbstractC0839i abstractC0839i = (AbstractC0839i) arrayListM779m.get(i4);
                    if (abstractC0839i.m1757k()) {
                        arrayListM779m.set(i4, abstractC0839i.mo1728a(C0887c.f2355n));
                    }
                }
            }
            if (iM2248b >= 0) {
                c0962j3.m2250c(iM2248b);
            }
            c0962j3.mo811b_();
            c0962j2 = c0962j3;
        } else {
            c0962j2 = c0962jM2244a;
        }
        int iM2256f = c0962j2.m2256f(iM2248b);
        int i5 = iM2248b;
        C0962j c0962jM2257f = c0962j2;
        int i6 = iM785s;
        int i7 = size;
        while (i6 > 0) {
            int i8 = i7 - 1;
            AbstractC0839i abstractC0839i2 = (AbstractC0839i) arrayListM779m.get(i8);
            boolean z4 = abstractC0839i2.m1752f().m1839d() == 1;
            C0842l c0842l = new C0842l(z4 ? 2 : 1);
            c0842l.m1760a(0, abstractC0839i2);
            if (z4) {
                c0842l.m1760a(1, (AbstractC0839i) new C0847q(C0855y.f2221s, abstractC0839i2.m1753g(), (C0848r) null, C0850t.f2003a));
                c0962jM2244a2 = C0962j.m2244a(i5);
            } else {
                c0962jM2244a2 = c0962jM2257f;
            }
            c0842l.mo811b_();
            int iM952c = m952c();
            m941a(new C0827a(iM952c, c0842l, c0962jM2244a2, i5), c0558nM873a.m885e());
            c0962jM2257f = c0962jM2257f.m2257f();
            c0962jM2257f.m2249b(iM2256f, iM952c);
            c0962jM2257f.mo811b_();
            i5 = iM952c;
            i6--;
            i7 = i8;
        }
        AbstractC0839i abstractC0839i3 = i7 == 0 ? null : (AbstractC0839i) arrayListM779m.get(i7 - 1);
        if (abstractC0839i3 == null || abstractC0839i3.m1752f().m1839d() == 1) {
            arrayListM779m.add(new C0847q(C0855y.f2221s, abstractC0839i3 == null ? C0856z.f2229a : abstractC0839i3.m1753g(), (C0848r) null, C0850t.f2003a));
            i7++;
        }
        C0842l c0842l2 = new C0842l(i7);
        for (int i9 = 0; i9 < i7; i9++) {
            c0842l2.m1760a(i9, (AbstractC0839i) arrayListM779m.get(i9));
        }
        c0842l2.mo811b_();
        m951b(new C0827a(c0547c.mo821a(), c0842l2, c0962jM2257f, i5), c0558nM873a.m885e());
    }

    /* JADX INFO: renamed from: a */
    private void m940a(C0827a c0827a, InterfaceC0832b interfaceC0832b, BitSet bitSet) {
        int iM947b;
        interfaceC0832b.mo965a(c0827a);
        bitSet.set(c0827a.mo821a());
        C0962j c0962jM1720c = c0827a.m1720c();
        int iM2247b = c0962jM1720c.m2247b();
        for (int i = 0; i < iM2247b; i++) {
            int iM2248b = c0962jM1720c.m2248b(i);
            if (!bitSet.get(iM2248b) && ((!m945a(c0827a) || i <= 0) && (iM947b = m947b(iM2248b)) >= 0)) {
                m940a((C0827a) this.f924h.get(iM947b), interfaceC0832b, bitSet);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m941a(C0827a c0827a, C0962j c0962j) {
        if (c0827a == null) {
            throw new NullPointerException("block == null");
        }
        this.f924h.add(c0827a);
        c0962j.m2267m();
        this.f925i.add(c0962j);
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ boolean m943a(C0568x c0568x, C0827a c0827a, C0962j c0962j) {
        boolean z;
        if (c0827a == null) {
            throw new NullPointerException("block == null");
        }
        int iM947b = c0568x.m947b(c0827a.mo821a());
        if (iM947b < 0) {
            z = false;
        } else {
            c0568x.f924h.remove(iM947b);
            c0568x.f925i.remove(iM947b);
            z = true;
        }
        c0568x.f924h.add(c0827a);
        c0962j.m2267m();
        c0568x.f925i.add(c0962j);
        return z;
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ boolean m944a(C0568x c0568x, boolean z) {
        c0568x.f929m = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public boolean m945a(C0827a c0827a) {
        int iM2248b;
        C0962j c0962jM1720c = c0827a.m1720c();
        return c0962jM1720c.m2247b() >= 2 && (iM2248b = c0962jM1720c.m2248b(1)) < this.f928l.length && this.f928l[iM2248b] != null;
    }

    /* JADX INFO: renamed from: b */
    private int m946b() {
        return this.f920d + this.f917a.m856l().m2239d_() + 7;
    }

    /* JADX INFO: renamed from: b */
    private int m947b(int i) {
        int size = this.f924h.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((C0827a) this.f924h.get(i2)).mo821a() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    static /* synthetic */ C0538ae m949b(C0568x c0568x, int i) {
        for (int length = c0568x.f928l.length - 1; length >= 0; length--) {
            if (c0568x.f928l[length] != null) {
                C0538ae c0538ae = c0568x.f928l[length];
                if (c0538ae.f826b.get(i)) {
                    return c0538ae;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    private boolean m951b(C0827a c0827a, C0962j c0962j) {
        boolean z;
        int iM947b = m947b(c0827a.mo821a());
        if (iM947b < 0) {
            z = false;
        } else {
            m955d(iM947b);
            z = true;
        }
        this.f924h.add(c0827a);
        c0962j.m2267m();
        this.f925i.add(c0962j);
        return z;
    }

    /* JADX INFO: renamed from: c */
    private int m952c() {
        int iM946b = m946b();
        Iterator it = this.f924h.iterator();
        while (true) {
            int i = iM946b;
            if (!it.hasNext()) {
                return i;
            }
            int iMo821a = ((C0827a) it.next()).mo821a();
            iM946b = iMo821a >= i ? iMo821a + 1 : i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public C0827a m954c(int i) {
        int iM947b = m947b(i);
        if (iM947b < 0) {
            throw new IllegalArgumentException("no such label " + C1067a.m2558v(i));
        }
        return (C0827a) this.f924h.get(iM947b);
    }

    /* JADX INFO: renamed from: d */
    private void m955d(int i) {
        int iM946b = m946b();
        C0962j c0962jM1720c = ((C0827a) this.f924h.get(i)).m1720c();
        int iM2247b = c0962jM1720c.m2247b();
        this.f924h.remove(i);
        this.f925i.remove(i);
        for (int i2 = 0; i2 < iM2247b; i2++) {
            int iM2248b = c0962jM1720c.m2248b(i2);
            if (iM2248b >= iM946b) {
                int iM947b = m947b(iM2248b);
                if (iM947b < 0) {
                    throw new RuntimeException("Invalid label " + C1067a.m2558v(iM2248b));
                }
                m955d(iM947b);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private boolean m956d() {
        return (this.f917a.mo848d() & 32) != 0;
    }

    /* JADX INFO: renamed from: e */
    private boolean m957e() {
        return (this.f917a.mo848d() & 8) != 0;
    }

    /* JADX INFO: renamed from: f */
    private int m958f() {
        return this.f919c + this.f917a.m853i();
    }

    /* JADX INFO: renamed from: g */
    private C0848r m959g() {
        int iM958f = m958f();
        if (iM958f <= 0) {
            iM958f = 1;
        }
        return C0848r.m1778a(iM958f, C0887c.f2355n);
    }

    /* JADX INFO: renamed from: h */
    private C0854x m960h() {
        int size = this.f924h.size();
        C0833c c0833c = new C0833c(size);
        for (int i = 0; i < size; i++) {
            c0833c.m1738a(i, (C0827a) this.f924h.get(i));
        }
        c0833c.mo811b_();
        return new C0854x(c0833c, m931a(-1));
    }

    /* JADX INFO: renamed from: i */
    private void m961i() {
        int length = this.f926j.length;
        for (int i = 0; i < length; i++) {
            C0534aa c0534aa = this.f926j[i];
            if (c0534aa != null) {
                for (C0535ab c0535ab : c0534aa.m763a()) {
                    C0856z c0856zM1753g = m954c(i).m1723f().m1753g();
                    C0842l c0842l = new C0842l(2);
                    c0842l.m1760a(0, (AbstractC0839i) new C0847q(C0855y.m1855c(c0535ab.m764a()), c0856zM1753g, C0848r.m1778a(this.f919c, c0535ab.m764a()), C0850t.f2003a));
                    c0842l.m1760a(1, (AbstractC0839i) new C0847q(C0855y.f2221s, c0856zM1753g, (C0848r) null, C0850t.f2003a));
                    c0842l.mo811b_();
                    m941a(new C0827a(c0535ab.m765b(), c0842l, C0962j.m2244a(i), i), this.f923g[i].m885e());
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    private void m962j() {
        C0962j c0962j = new C0962j(4);
        m937a(0, new C0569y(this, c0962j));
        int iM952c = m952c();
        ArrayList arrayList = new ArrayList(iM952c);
        for (int i = 0; i < iM952c; i++) {
            arrayList.add(null);
        }
        for (int i2 = 0; i2 < this.f924h.size(); i2++) {
            C0827a c0827a = (C0827a) this.f924h.get(i2);
            if (c0827a != null) {
                arrayList.set(c0827a.mo821a(), (C0962j) this.f925i.get(i2));
            }
        }
        int iM2247b = c0962j.m2247b();
        for (int i3 = 0; i3 < iM2247b; i3++) {
            new C0539af(this, new C0537ad(m952c()), arrayList).m775a(m954c(c0962j.m2248b(i3)));
        }
        m963k();
    }

    /* JADX INFO: renamed from: k */
    private void m963k() {
        C0962j c0962j = new C0962j(this.f924h.size());
        this.f925i.clear();
        m937a(m931a(-1), new C0570z(this, c0962j));
        c0962j.m2259g();
        for (int size = this.f924h.size() - 1; size >= 0; size--) {
            if (c0962j.m2256f(((C0827a) this.f924h.get(size)).mo821a()) < 0) {
                this.f924h.remove(size);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    final int m964a() {
        int iM958f = m958f();
        return m956d() ? iM958f + 1 : iM958f;
    }
}
