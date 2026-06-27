package com.p046a.p049b.p071g;

import android.support.v7.appcompat.C0327R;
import com.p046a.p049b.p066f.p068b.AbstractC0839i;
import com.p046a.p049b.p066f.p068b.C0848r;
import com.p046a.p049b.p066f.p068b.C0850t;
import com.p046a.p049b.p066f.p068b.C0853w;

/* JADX INFO: renamed from: com.a.b.g.z */
/* JADX INFO: loaded from: classes.dex */
public final class C0952z extends AbstractC0918al implements Cloneable {

    /* JADX INFO: renamed from: a */
    private AbstractC0839i f2557a;

    C0952z(AbstractC0839i abstractC0839i, C0915ai c0915ai) {
        super(abstractC0839i.m1754h(), c0915ai);
        this.f2557a = abstractC0839i;
    }

    @Override // com.p046a.p049b.p071g.AbstractC0918al
    /* JADX INFO: renamed from: a */
    public final C0850t mo2018a() {
        return this.f2557a.m1756j();
    }

    /* JADX INFO: renamed from: a */
    public final void m2201a(int i, C0848r c0848r) {
        C0850t c0850tM1756j = this.f2557a.m1756j();
        int iD_ = c0850tM1756j.m2239d_();
        C0850t c0850t = new C0850t(iD_);
        int i2 = 0;
        while (i2 < iD_) {
            c0850t.m1814a(i2, i2 == i ? c0848r : c0850tM1756j.m1815b(i2));
            i2++;
        }
        c0850t.mo811b_();
        C0848r c0848rM1815b = c0850tM1756j.m1815b(i);
        if (c0848rM1815b.m1795g() != c0848r.m1795g()) {
            m2094o().m2078n().m2107a(this, c0848rM1815b, c0848r);
        }
        this.f2557a = this.f2557a.mo1727a(m2093n(), c0850t);
    }

    /* JADX INFO: renamed from: a */
    public final void m2202a(C0850t c0850t) {
        if (this.f2557a.m1756j().m2239d_() != c0850t.m2239d_()) {
            throw new RuntimeException("Sources counts don't match");
        }
        this.f2557a = this.f2557a.mo1727a(m2093n(), c0850t);
    }

    @Override // com.p046a.p049b.p071g.AbstractC0918al
    /* JADX INFO: renamed from: a */
    public final void mo2023a(AbstractC0913ag abstractC0913ag) {
        C0850t c0850tM1756j = this.f2557a.m1756j();
        C0850t c0850tM2036a = abstractC0913ag.m2036a(c0850tM1756j);
        if (c0850tM2036a != c0850tM1756j) {
            this.f2557a = this.f2557a.mo1727a(m2093n(), c0850tM2036a);
            m2094o().m2078n().m2108a(this, c0850tM1756j);
        }
    }

    @Override // com.p046a.p049b.p071g.AbstractC0918al
    /* JADX INFO: renamed from: a */
    public final void mo2024a(InterfaceC0919am interfaceC0919am) {
        if (mo2091h()) {
            interfaceC0919am.mo1991a(this);
        } else {
            interfaceC0919am.mo1992b(this);
        }
    }

    @Override // com.p046a.p049b.p071g.AbstractC0918al
    /* JADX INFO: renamed from: b */
    public final AbstractC0839i mo2026b() {
        return this.f2557a.mo1727a(m2093n(), this.f2557a.m1756j());
    }

    @Override // com.p046a.p049b.p071g.AbstractC0918al
    /* JADX INFO: renamed from: c */
    public final C0853w mo2027c() {
        return this.f2557a.m1752f();
    }

    @Override // com.p046a.p049b.p071g.AbstractC0918al
    public final /* synthetic */ Object clone() {
        return (C0952z) super.clone();
    }

    @Override // com.p046a.p049b.p073h.InterfaceC0971s
    /* JADX INFO: renamed from: d */
    public final String mo919d() {
        return mo2026b().mo919d();
    }

    @Override // com.p046a.p049b.p071g.AbstractC0918al
    /* JADX INFO: renamed from: e */
    public final AbstractC0839i mo2028e() {
        return this.f2557a;
    }

    @Override // com.p046a.p049b.p071g.AbstractC0918al
    /* JADX INFO: renamed from: f */
    public final C0848r mo2090f() {
        C0848r c0848rM1815b = this.f2557a.m1752f().m1836a() == 54 ? this.f2557a.m1756j().m1815b(0) : m2093n();
        if (c0848rM1815b == null || c0848rM1815b.m1797i() == null) {
            return null;
        }
        return c0848rM1815b;
    }

    /* JADX INFO: renamed from: g */
    public final void m2203g() {
        C0850t c0850tM1756j = this.f2557a.m1756j();
        this.f2557a = this.f2557a.mo1758l();
        m2094o().m2078n().m2108a(this, c0850tM1756j);
    }

    @Override // com.p046a.p049b.p071g.AbstractC0918al
    /* JADX INFO: renamed from: h */
    public final boolean mo2091h() {
        return this.f2557a.m1752f().m1836a() == 2;
    }

    @Override // com.p046a.p049b.p071g.AbstractC0918al
    /* JADX INFO: renamed from: i */
    public final boolean mo2092i() {
        return this.f2557a.m1752f().m1836a() == 4;
    }

    @Override // com.p046a.p049b.p071g.AbstractC0918al
    /* JADX INFO: renamed from: j */
    public final boolean mo2030j() {
        return this.f2557a.m1757k();
    }

    @Override // com.p046a.p049b.p071g.AbstractC0918al
    /* JADX INFO: renamed from: k */
    public final boolean mo2031k() {
        return mo2091h();
    }

    @Override // com.p046a.p049b.p071g.AbstractC0918al
    /* JADX INFO: renamed from: l */
    public final boolean mo2032l() {
        C0853w c0853wM1752f = this.f2557a.m1752f();
        if (c0853wM1752f.m1839d() != 1) {
            return true;
        }
        boolean z = C0907aa.m2014a() && mo2090f() != null;
        switch (c0853wM1752f.m1836a()) {
            case 2:
            case 5:
            case C0327R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 55 */:
                return z;
            default:
                return true;
        }
    }

    @Override // com.p046a.p049b.p071g.AbstractC0918al
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ AbstractC0918al clone() {
        return (C0952z) super.clone();
    }
}
