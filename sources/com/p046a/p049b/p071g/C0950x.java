package com.p046a.p049b.p071g;

import com.p046a.p049b.p066f.p068b.AbstractC0835e;
import com.p046a.p049b.p066f.p068b.C0843m;
import com.p046a.p049b.p066f.p068b.C0848r;
import com.p046a.p049b.p066f.p069c.C0872n;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: com.a.b.g.x */
/* JADX INFO: loaded from: classes.dex */
final class C0950x implements InterfaceC0919am {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0949w f2551a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C0848r[] f2552b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ HashSet f2553c;

    C0950x(C0949w c0949w, C0848r[] c0848rArr, HashSet hashSet) {
        this.f2551a = c0949w;
        this.f2552b = c0848rArr;
        this.f2553c = hashSet;
    }

    @Override // com.p046a.p049b.p071g.InterfaceC0919am
    /* JADX INFO: renamed from: a */
    public final void mo1990a(C0909ac c0909ac) {
    }

    @Override // com.p046a.p049b.p071g.InterfaceC0919am
    /* JADX INFO: renamed from: a */
    public final void mo1991a(C0952z c0952z) {
    }

    @Override // com.p046a.p049b.p071g.InterfaceC0919am
    /* JADX INFO: renamed from: b */
    public final void mo1992b(C0952z c0952z) {
        if (c0952z.mo2027c().m1836a() != 3) {
            return;
        }
        C0949w c0949w = this.f2551a;
        int iJ = ((C0872n) ((AbstractC0835e) c0952z.mo2028e()).m1748g_()).mo1894j();
        if (this.f2552b[iJ] == null) {
            this.f2552b[iJ] = c0952z.m2093n();
            return;
        }
        C0848r c0848r = this.f2552b[iJ];
        C0848r c0848rN = c0952z.m2093n();
        C0843m c0843mM1797i = c0848r.m1797i();
        C0843m c0843mM1797i2 = c0848rN.m1797i();
        if (c0843mM1797i != null) {
            if (c0843mM1797i2 != null && !c0843mM1797i.equals(c0843mM1797i2)) {
                return;
            } else {
                c0843mM1797i2 = c0843mM1797i;
            }
        }
        this.f2551a.f2550a.m2117c(c0848r.m1795g()).m2085a(c0843mM1797i2);
        C0951y c0951y = new C0951y(this, c0848rN, c0848r);
        List listM2119d = this.f2551a.f2550a.m2119d(c0848rN.m1795g());
        for (int size = listM2119d.size() - 1; size >= 0; size--) {
            ((AbstractC0918al) listM2119d.get(size)).mo2023a(c0951y);
        }
        this.f2553c.add(c0952z);
    }
}
