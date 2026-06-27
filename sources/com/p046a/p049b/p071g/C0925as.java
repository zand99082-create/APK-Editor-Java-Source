package com.p046a.p049b.p071g;

import com.p046a.p049b.p066f.p068b.C0843m;
import com.p046a.p049b.p066f.p068b.C0847q;
import com.p046a.p049b.p066f.p068b.C0848r;
import com.p046a.p049b.p066f.p068b.C0850t;
import com.p046a.p049b.p066f.p068b.C0855y;
import com.p046a.p049b.p066f.p068b.C0856z;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: com.a.b.g.as */
/* JADX INFO: loaded from: classes.dex */
final class C0925as implements InterfaceC0919am {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ RunnableC0923aq f2480a;

    /* JADX INFO: renamed from: b */
    private final C0915ai f2481b;

    /* JADX INFO: renamed from: c */
    private final C0848r[] f2482c;

    /* JADX INFO: renamed from: d */
    private final HashSet f2483d = new HashSet();

    /* JADX INFO: renamed from: e */
    private final HashMap f2484e = new HashMap();

    /* JADX INFO: renamed from: f */
    private final C0927au f2485f = new C0927au(this);

    C0925as(RunnableC0923aq runnableC0923aq, C0915ai c0915ai) {
        this.f2480a = runnableC0923aq;
        this.f2481b = c0915ai;
        this.f2482c = runnableC0923aq.f2477e[c0915ai.m2068e()];
        runnableC0923aq.f2477e[c0915ai.m2068e()] = null;
    }

    /* JADX INFO: renamed from: a */
    private void m2145a(int i, C0848r c0848r) {
        int iM1795g = c0848r.m1795g();
        C0843m c0843mM1797i = c0848r.m1797i();
        this.f2482c[i] = c0848r;
        for (int length = this.f2482c.length - 1; length >= 0; length--) {
            if (iM1795g == this.f2482c[length].m1795g()) {
                this.f2482c[length] = c0848r;
            }
        }
        if (c0843mM1797i == null) {
            return;
        }
        RunnableC0923aq.m2135a(this.f2480a, c0848r);
        for (int length2 = this.f2482c.length - 1; length2 >= 0; length2--) {
            C0848r c0848r2 = this.f2482c[length2];
            if (iM1795g != c0848r2.m1795g() && c0843mM1797i.equals(c0848r2.m1797i())) {
                this.f2482c[length2] = c0848r2.m1788a((C0843m) null);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m2146a(AbstractC0918al abstractC0918al) {
        C0848r c0848rM2093n = abstractC0918al.m2093n();
        if (c0848rM2093n == null) {
            return;
        }
        int iM1795g = c0848rM2093n.m1795g();
        if (RunnableC0923aq.m2140b(this.f2480a, iM1795g)) {
            return;
        }
        abstractC0918al.m2089c(this.f2480a.f2474b);
        m2145a(iM1795g, abstractC0918al.m2093n());
        RunnableC0923aq.m2143d(this.f2480a);
    }

    /* JADX INFO: renamed from: a */
    public final void m2149a() {
        boolean z;
        this.f2481b.m2058a(this);
        C0926at c0926at = new C0926at(this);
        BitSet bitSetM2072h = this.f2481b.m2072h();
        for (int iNextSetBit = bitSetM2072h.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSetM2072h.nextSetBit(iNextSetBit + 1)) {
            ((C0915ai) this.f2480a.f2473a.m2126j().get(iNextSetBit)).m2056a(c0926at);
        }
        ArrayList arrayListM2063c = this.f2481b.m2063c();
        for (int size = arrayListM2063c.size() - 1; size >= 0; size--) {
            AbstractC0918al abstractC0918al = (AbstractC0918al) arrayListM2063c.get(size);
            AbstractC0918al abstractC0918al2 = (AbstractC0918al) this.f2484e.get(abstractC0918al);
            if (abstractC0918al2 != null) {
                arrayListM2063c.set(size, abstractC0918al2);
            } else if (abstractC0918al.mo2091h() && !this.f2483d.contains(abstractC0918al)) {
                arrayListM2063c.remove(size);
            }
        }
        boolean z2 = true;
        for (C0915ai c0915ai : this.f2481b.m2050a()) {
            if (c0915ai != this.f2481b) {
                this.f2480a.f2477e[c0915ai.m2068e()] = z2 ? this.f2482c : RunnableC0923aq.m2137a(this.f2482c);
                z = false;
            } else {
                z = z2;
            }
            z2 = z;
        }
    }

    @Override // com.p046a.p049b.p071g.InterfaceC0919am
    /* JADX INFO: renamed from: a */
    public final void mo1990a(C0909ac c0909ac) {
        m2146a((AbstractC0918al) c0909ac);
    }

    @Override // com.p046a.p049b.p071g.InterfaceC0919am
    /* JADX INFO: renamed from: a */
    public final void mo1991a(C0952z c0952z) {
        C0848r c0848rN = c0952z.m2093n();
        int iM1795g = c0848rN.m1795g();
        int iM1795g2 = c0952z.mo2018a().m1815b(0).m1795g();
        c0952z.mo2023a(this.f2485f);
        int iM1795g3 = c0952z.mo2018a().m1815b(0).m1795g();
        C0843m c0843mM1797i = this.f2482c[iM1795g2].m1797i();
        C0843m c0843mM1797i2 = c0848rN.m1797i();
        if (c0843mM1797i2 == null) {
            c0843mM1797i2 = c0843mM1797i;
        }
        C0843m c0843mM2134a = RunnableC0923aq.m2134a(this.f2480a, iM1795g3);
        boolean z = c0843mM2134a == null || c0843mM1797i2 == null || c0843mM1797i2.equals(c0843mM2134a);
        C0848r c0848rM1782b = C0848r.m1782b(iM1795g3, c0848rN.mo925a(), c0843mM1797i2);
        if (!C0907aa.m2014a() || (z && RunnableC0923aq.m2136a(c0843mM1797i2, c0843mM1797i) && this.f2480a.f2476d == 0)) {
            m2145a(iM1795g, c0848rM1782b);
            return;
        }
        if (z && c0843mM1797i == null && this.f2480a.f2476d == 0) {
            this.f2484e.put(c0952z, AbstractC0918al.m2084a(new C0847q(C0855y.m1859g(c0848rM1782b), C0856z.f2229a, (C0848r) null, C0850t.m1808a(C0848r.m1779a(c0848rM1782b.m1795g(), c0848rM1782b.mo925a(), c0843mM1797i2))), this.f2481b));
            m2145a(iM1795g, c0848rM1782b);
        } else {
            m2146a((AbstractC0918al) c0952z);
            this.f2483d.add(c0952z);
        }
    }

    @Override // com.p046a.p049b.p071g.InterfaceC0919am
    /* JADX INFO: renamed from: b */
    public final void mo1992b(C0952z c0952z) {
        c0952z.mo2023a(this.f2485f);
        m2146a((AbstractC0918al) c0952z);
    }
}
