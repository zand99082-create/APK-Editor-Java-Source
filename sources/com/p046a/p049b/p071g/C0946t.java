package com.p046a.p049b.p071g;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p066f.p068b.C0850t;
import com.p046a.p049b.p066f.p068b.C0853w;
import com.p046a.p049b.p066f.p068b.InterfaceC0831ad;

/* JADX INFO: renamed from: com.a.b.g.t */
/* JADX INFO: loaded from: classes.dex */
final class C0946t implements InterfaceC0919am {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ InterfaceC0831ad f2540a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C0945s f2541b;

    C0946t(C0945s c0945s, InterfaceC0831ad interfaceC0831ad) {
        this.f2541b = c0945s;
        this.f2540a = interfaceC0831ad;
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
        C0853w c0853wM1752f = c0952z.mo2028e().m1752f();
        C0850t c0850tMo2018a = c0952z.mo2018a();
        if (!C0945s.m2190a(this.f2541b, c0952z) && c0850tMo2018a.m2239d_() == 2) {
            if (c0853wM1752f.m1839d() == 4) {
                if (C0945s.m2189a(c0850tMo2018a.m1815b(0))) {
                    this.f2541b.m2188a(c0952z, c0850tMo2018a.m1820f(), C1067a.m2554r(c0853wM1752f.m1836a()), null);
                    return;
                } else {
                    if (C0945s.m2189a(c0850tMo2018a.m1815b(1))) {
                        this.f2541b.m2188a(c0952z, c0850tMo2018a.m1821g(), c0853wM1752f.m1836a(), null);
                        return;
                    }
                    return;
                }
            }
            if (this.f2540a.mo1735a(c0853wM1752f, c0850tMo2018a.m1815b(0), c0850tMo2018a.m1815b(1))) {
                c0952z.m2203g();
            } else if (c0853wM1752f.m1841f() && this.f2540a.mo1735a(c0853wM1752f, c0850tMo2018a.m1815b(1), c0850tMo2018a.m1815b(0))) {
                c0952z.m2202a(C0850t.m1809a(c0850tMo2018a.m1815b(1), c0850tMo2018a.m1815b(0)));
                c0952z.m2203g();
            }
        }
    }
}
