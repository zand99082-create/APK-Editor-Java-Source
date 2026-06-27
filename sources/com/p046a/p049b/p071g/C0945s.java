package com.p046a.p049b.p071g;

import com.p046a.p049b.p066f.p068b.AbstractC0839i;
import com.p046a.p049b.p066f.p068b.C0846p;
import com.p046a.p049b.p066f.p068b.C0847q;
import com.p046a.p049b.p066f.p068b.C0848r;
import com.p046a.p049b.p066f.p068b.C0850t;
import com.p046a.p049b.p066f.p068b.C0853w;
import com.p046a.p049b.p066f.p068b.C0855y;
import com.p046a.p049b.p066f.p069c.AbstractC0857a;
import com.p046a.p049b.p066f.p069c.AbstractC0877s;
import com.p046a.p049b.p066f.p070d.InterfaceC0888d;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.a.b.g.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0945s {

    /* JADX INFO: renamed from: a */
    private final C0920an f2539a;

    private C0945s(C0920an c0920an) {
        this.f2539a = c0920an;
    }

    /* JADX INFO: renamed from: a */
    public static void m2186a(C0920an c0920an) {
        C0945s c0945s = new C0945s(c0920an);
        c0945s.f2539a.m2109a(new C0946t(c0945s, C0907aa.m2015b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m2188a(C0952z c0952z, C0850t c0850t, int i, AbstractC0857a abstractC0857a) {
        AbstractC0839i abstractC0839iMo2028e = c0952z.mo2028e();
        C0853w c0853wM1847a = C0855y.m1847a(i, c0952z.m2093n(), c0850t, abstractC0857a);
        C0952z c0952z2 = new C0952z(abstractC0857a == null ? new C0847q(c0853wM1847a, abstractC0839iMo2028e.m1753g(), c0952z.m2093n(), c0850t) : new C0846p(c0853wM1847a, abstractC0839iMo2028e.m1753g(), c0952z.m2093n(), c0850t, abstractC0857a), c0952z.m2094o());
        ArrayList arrayListM2063c = c0952z.m2094o().m2063c();
        this.f2539a.m2115b(c0952z);
        arrayListM2063c.set(arrayListM2063c.lastIndexOf(c0952z), c0952z2);
        this.f2539a.m2105a(c0952z2);
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ boolean m2189a(C0848r c0848r) {
        boolean z;
        InterfaceC0888d interfaceC0888dM1796h = c0848r.m1796h();
        if (!(interfaceC0888dM1796h instanceof AbstractC0877s)) {
            z = false;
        } else {
            if (((AbstractC0877s) interfaceC0888dM1796h).mo1895k() != 0) {
                return false;
            }
            z = true;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    static /* synthetic */ boolean m2190a(C0945s c0945s, C0952z c0952z) {
        C0853w c0853wM1752f = c0952z.mo2028e().m1752f();
        C0848r c0848rN = c0952z.m2093n();
        if (c0848rN != null && !c0945s.f2539a.m2112a(c0848rN) && c0853wM1752f.m1836a() != 5) {
            InterfaceC0888d interfaceC0888dM1796h = c0952z.m2093n().m1796h();
            if (interfaceC0888dM1796h.mo929f() && interfaceC0888dM1796h.mo927c() == 6) {
                c0945s.m2188a(c0952z, C0850t.f2003a, 5, (AbstractC0857a) interfaceC0888dM1796h);
                if (c0853wM1752f.m1836a() == 56) {
                    c0945s.m2188a((C0952z) ((C0915ai) c0945s.f2539a.m2126j().get(c0952z.m2094o().m2071g().nextSetBit(0))).m2063c().get(r0.size() - 1), C0850t.f2003a, 6, null);
                }
                return true;
            }
        }
        return false;
    }
}
