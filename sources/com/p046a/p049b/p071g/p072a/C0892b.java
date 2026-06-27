package com.p046a.p049b.p071g.p072a;

import com.p046a.p049b.p066f.p068b.C0843m;
import com.p046a.p049b.p066f.p068b.C0848r;
import com.p046a.p049b.p071g.AbstractC0918al;
import com.p046a.p049b.p071g.C0907aa;
import com.p046a.p049b.p071g.C0909ac;
import com.p046a.p049b.p071g.C0952z;
import com.p046a.p049b.p071g.InterfaceC0919am;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.a.b.g.a.b */
/* JADX INFO: loaded from: classes.dex */
final class C0892b implements InterfaceC0919am {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C0891a f2386a;

    C0892b(C0891a c0891a) {
        this.f2386a = c0891a;
    }

    /* JADX INFO: renamed from: a */
    private void m1989a(AbstractC0918al abstractC0918al) {
        C0848r c0848rMo2090f = abstractC0918al.mo2090f();
        if (c0848rMo2090f != null) {
            C0843m c0843mM1797i = c0848rMo2090f.m1797i();
            ArrayList arrayList = (ArrayList) this.f2386a.f2377b.get(c0843mM1797i);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f2386a.f2377b.put(c0843mM1797i, arrayList);
            }
            arrayList.add(c0848rMo2090f);
        }
        if (!(abstractC0918al instanceof C0952z)) {
            if (abstractC0918al instanceof C0909ac) {
                this.f2386a.f2380e.add((C0909ac) abstractC0918al);
            }
        } else if (abstractC0918al.mo2027c().m1836a() == 56) {
            this.f2386a.f2378c.add((C0952z) abstractC0918al);
        } else if (C0907aa.m2015b().mo1736a(abstractC0918al.mo2028e().m1752f(), abstractC0918al.mo2018a())) {
            this.f2386a.f2379d.add((C0952z) abstractC0918al);
        }
    }

    @Override // com.p046a.p049b.p071g.InterfaceC0919am
    /* JADX INFO: renamed from: a */
    public final void mo1990a(C0909ac c0909ac) {
        m1989a((AbstractC0918al) c0909ac);
    }

    @Override // com.p046a.p049b.p071g.InterfaceC0919am
    /* JADX INFO: renamed from: a */
    public final void mo1991a(C0952z c0952z) {
        m1989a((AbstractC0918al) c0952z);
    }

    @Override // com.p046a.p049b.p071g.InterfaceC0919am
    /* JADX INFO: renamed from: b */
    public final void mo1992b(C0952z c0952z) {
        m1989a((AbstractC0918al) c0952z);
    }
}
