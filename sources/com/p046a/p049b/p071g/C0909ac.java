package com.p046a.p049b.p071g;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p066f.p068b.AbstractC0839i;
import com.p046a.p049b.p066f.p068b.C0843m;
import com.p046a.p049b.p066f.p068b.C0848r;
import com.p046a.p049b.p066f.p068b.C0850t;
import com.p046a.p049b.p066f.p068b.C0853w;
import com.p046a.p049b.p066f.p068b.C0856z;
import com.p046a.p049b.p066f.p070d.C0887c;
import com.p046a.p049b.p066f.p070d.InterfaceC0888d;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.a.b.g.ac */
/* JADX INFO: loaded from: classes.dex */
public final class C0909ac extends AbstractC0918al {

    /* JADX INFO: renamed from: a */
    private final int f2425a;

    /* JADX INFO: renamed from: b */
    private final ArrayList f2426b;

    /* JADX INFO: renamed from: c */
    private C0850t f2427c;

    public C0909ac(int i, C0915ai c0915ai) {
        super(C0848r.m1778a(i, C0887c.f2350i), c0915ai);
        this.f2426b = new ArrayList();
        this.f2425a = i;
    }

    public C0909ac(C0848r c0848r, C0915ai c0915ai) {
        super(c0848r, c0915ai);
        this.f2426b = new ArrayList();
        this.f2425a = c0848r.m1795g();
    }

    /* JADX INFO: renamed from: p */
    private static C0909ac m2016p() {
        throw new UnsupportedOperationException("can't clone phi");
    }

    /* JADX INFO: renamed from: a */
    public final int m2017a(int i) {
        return ((C0910ad) this.f2426b.get(i)).f2429b;
    }

    @Override // com.p046a.p049b.p071g.AbstractC0918al
    /* JADX INFO: renamed from: a */
    public final C0850t mo2018a() {
        if (this.f2427c != null) {
            return this.f2427c;
        }
        if (this.f2426b.size() == 0) {
            return C0850t.f2003a;
        }
        int size = this.f2426b.size();
        this.f2427c = new C0850t(size);
        for (int i = 0; i < size; i++) {
            this.f2427c.m1814a(i, ((C0910ad) this.f2426b.get(i)).f2428a);
        }
        this.f2427c.mo811b_();
        return this.f2427c;
    }

    /* JADX INFO: renamed from: a */
    public final List m2019a(int i, C0920an c0920an) {
        ArrayList arrayList = new ArrayList();
        for (C0910ad c0910ad : this.f2426b) {
            if (c0910ad.f2428a.m1795g() == i) {
                arrayList.add(c0920an.m2126j().get(c0910ad.f2429b));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final void m2020a(C0848r c0848r) {
        ArrayList arrayList = new ArrayList();
        for (C0910ad c0910ad : this.f2426b) {
            if (c0910ad.f2428a.m1795g() == c0848r.m1795g()) {
                arrayList.add(c0910ad);
            }
        }
        this.f2426b.removeAll(arrayList);
        this.f2427c = null;
    }

    /* JADX INFO: renamed from: a */
    public final void m2021a(C0848r c0848r, C0915ai c0915ai) {
        this.f2426b.add(new C0910ad(c0848r, c0915ai.m2068e(), c0915ai.m2070f()));
        this.f2427c = null;
    }

    /* JADX INFO: renamed from: a */
    public final void m2022a(InterfaceC0888d interfaceC0888d, C0843m c0843m) {
        m2086b(C0848r.m1782b(m2093n().m1795g(), interfaceC0888d, c0843m));
    }

    @Override // com.p046a.p049b.p071g.AbstractC0918al
    /* JADX INFO: renamed from: a */
    public final void mo2023a(AbstractC0913ag abstractC0913ag) {
        for (C0910ad c0910ad : this.f2426b) {
            C0848r c0848r = c0910ad.f2428a;
            c0910ad.f2428a = abstractC0913ag.mo1962a(c0848r);
            if (c0848r != c0910ad.f2428a) {
                m2094o().m2078n().m2107a(this, c0848r, c0910ad.f2428a);
            }
        }
        this.f2427c = null;
    }

    @Override // com.p046a.p049b.p071g.AbstractC0918al
    /* JADX INFO: renamed from: a */
    public final void mo2024a(InterfaceC0919am interfaceC0919am) {
        interfaceC0919am.mo1990a(this);
    }

    /* JADX INFO: renamed from: a */
    public final void m2025a(C0920an c0920an) {
        for (C0910ad c0910ad : this.f2426b) {
            c0910ad.f2428a = c0910ad.f2428a.m1790a(c0920an.m2117c(c0910ad.f2428a.m1795g()).m2093n().mo925a());
        }
        this.f2427c = null;
    }

    @Override // com.p046a.p049b.p071g.AbstractC0918al
    /* JADX INFO: renamed from: b */
    public final AbstractC0839i mo2026b() {
        throw new IllegalArgumentException("Cannot convert phi insns to rop form");
    }

    @Override // com.p046a.p049b.p071g.AbstractC0918al
    /* JADX INFO: renamed from: c */
    public final C0853w mo2027c() {
        return null;
    }

    @Override // com.p046a.p049b.p071g.AbstractC0918al
    public final /* synthetic */ Object clone() {
        return m2016p();
    }

    @Override // com.p046a.p049b.p073h.InterfaceC0971s
    /* JADX INFO: renamed from: d */
    public final String mo919d() {
        StringBuffer stringBuffer = new StringBuffer(80);
        stringBuffer.append(C0856z.f2229a);
        stringBuffer.append(": phi");
        C0848r c0848rN = m2093n();
        if (c0848rN == null) {
            stringBuffer.append(" .");
        } else {
            stringBuffer.append(" ");
            stringBuffer.append(c0848rN.mo919d());
        }
        stringBuffer.append(" <-");
        int iD_ = mo2018a().m2239d_();
        if (iD_ == 0) {
            stringBuffer.append(" .");
        } else {
            for (int i = 0; i < iD_; i++) {
                stringBuffer.append(" ");
                stringBuffer.append(this.f2427c.m1815b(i).mo919d() + "[b=" + C1067a.m2558v(((C0910ad) this.f2426b.get(i)).f2430c) + "]");
            }
        }
        return stringBuffer.toString();
    }

    @Override // com.p046a.p049b.p071g.AbstractC0918al
    /* JADX INFO: renamed from: e */
    public final AbstractC0839i mo2028e() {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final int m2029g() {
        return this.f2425a;
    }

    @Override // com.p046a.p049b.p071g.AbstractC0918al
    /* JADX INFO: renamed from: j */
    public final boolean mo2030j() {
        return false;
    }

    @Override // com.p046a.p049b.p071g.AbstractC0918al
    /* JADX INFO: renamed from: k */
    public final boolean mo2031k() {
        return true;
    }

    @Override // com.p046a.p049b.p071g.AbstractC0918al
    /* JADX INFO: renamed from: l */
    public final boolean mo2032l() {
        return C0907aa.m2014a() && mo2090f() != null;
    }

    @Override // com.p046a.p049b.p071g.AbstractC0918al
    /* JADX INFO: renamed from: m */
    public final /* synthetic */ AbstractC0918al clone() {
        return m2016p();
    }
}
