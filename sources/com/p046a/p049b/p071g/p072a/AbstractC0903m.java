package com.p046a.p049b.p071g.p072a;

import com.p046a.p049b.p066f.p068b.C0847q;
import com.p046a.p049b.p066f.p068b.C0848r;
import com.p046a.p049b.p066f.p068b.C0850t;
import com.p046a.p049b.p066f.p068b.C0855y;
import com.p046a.p049b.p066f.p068b.C0856z;
import com.p046a.p049b.p071g.AbstractC0913ag;
import com.p046a.p049b.p071g.AbstractC0918al;
import com.p046a.p049b.p071g.C0915ai;
import com.p046a.p049b.p071g.C0920an;
import com.p046a.p049b.p073h.InterfaceC0961i;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.a.b.g.a.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0903m {

    /* JADX INFO: renamed from: a */
    protected final C0920an f2411a;

    /* JADX INFO: renamed from: b */
    private C0899i f2412b;

    public AbstractC0903m(C0920an c0920an, C0899i c0899i) {
        this.f2411a = c0920an;
        this.f2412b = c0899i;
    }

    /* JADX INFO: renamed from: a */
    protected final C0848r m2005a(AbstractC0918al abstractC0918al, C0848r c0848r) {
        C0915ai c0915aiM2094o = abstractC0918al.m2094o();
        ArrayList arrayListM2063c = c0915aiM2094o.m2063c();
        int iIndexOf = arrayListM2063c.indexOf(abstractC0918al);
        if (iIndexOf < 0) {
            throw new IllegalArgumentException("specified insn is not in this block");
        }
        if (iIndexOf != arrayListM2063c.size() - 1) {
            throw new IllegalArgumentException("Adding move here not supported:" + abstractC0918al.mo919d());
        }
        C0848r c0848rM1778a = C0848r.m1778a(this.f2411a.m2131o(), c0848r.m1796h());
        arrayListM2063c.add(iIndexOf, AbstractC0918al.m2084a(new C0847q(C0855y.m1849a(c0848rM1778a.mo925a()), C0856z.f2229a, c0848rM1778a, C0850t.m1808a(c0848r)), c0915aiM2094o));
        int iM1795g = c0848rM1778a.m1795g();
        InterfaceC0961i interfaceC0961iMo2208b = c0915aiM2094o.m2080p().mo2208b();
        while (interfaceC0961iMo2208b.mo2210a()) {
            this.f2412b.m1999a(iM1795g, interfaceC0961iMo2208b.mo2211b());
        }
        C0850t c0850tMo2018a = abstractC0918al.mo2018a();
        int iD_ = c0850tMo2018a.m2239d_();
        for (int i = 0; i < iD_; i++) {
            this.f2412b.m1999a(iM1795g, c0850tMo2018a.m1815b(i).m1795g());
        }
        this.f2411a.m2129m();
        return c0848rM1778a;
    }

    /* JADX INFO: renamed from: a */
    public abstract AbstractC0913ag mo1988a();

    /* JADX INFO: renamed from: b */
    protected final C0848r m2006b(int i) {
        AbstractC0918al abstractC0918alM2117c = this.f2411a.m2117c(i);
        if (abstractC0918alM2117c == null) {
            return null;
        }
        return abstractC0918alM2117c.m2093n();
    }
}
