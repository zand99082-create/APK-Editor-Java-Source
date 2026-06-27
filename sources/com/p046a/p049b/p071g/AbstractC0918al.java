package com.p046a.p049b.p071g;

import com.p046a.p049b.p066f.p068b.AbstractC0839i;
import com.p046a.p049b.p066f.p068b.C0843m;
import com.p046a.p049b.p066f.p068b.C0848r;
import com.p046a.p049b.p066f.p068b.C0850t;
import com.p046a.p049b.p066f.p068b.C0853w;
import com.p046a.p049b.p073h.InterfaceC0971s;

/* JADX INFO: renamed from: com.a.b.g.al */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0918al implements InterfaceC0971s, Cloneable {

    /* JADX INFO: renamed from: a */
    private final C0915ai f2457a;

    /* JADX INFO: renamed from: b */
    private C0848r f2458b;

    protected AbstractC0918al(C0848r c0848r, C0915ai c0915ai) {
        if (c0915ai == null) {
            throw new NullPointerException("block == null");
        }
        this.f2457a = c0915ai;
        this.f2458b = c0848r;
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC0918al m2084a(AbstractC0839i abstractC0839i, C0915ai c0915ai) {
        return new C0952z(abstractC0839i, c0915ai);
    }

    /* JADX INFO: renamed from: a */
    public abstract C0850t mo2018a();

    /* JADX INFO: renamed from: a */
    public final void m2085a(C0843m c0843m) {
        if (c0843m != this.f2458b.m1797i()) {
            if (c0843m == null || !c0843m.equals(this.f2458b.m1797i())) {
                this.f2458b = C0848r.m1782b(this.f2458b.m1795g(), this.f2458b.mo925a(), c0843m);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo2023a(AbstractC0913ag abstractC0913ag);

    /* JADX INFO: renamed from: a */
    public abstract void mo2024a(InterfaceC0919am interfaceC0919am);

    /* JADX INFO: renamed from: b */
    public abstract AbstractC0839i mo2026b();

    /* JADX INFO: renamed from: b */
    protected final void m2086b(C0848r c0848r) {
        if (c0848r == null) {
            throw new NullPointerException("result == null");
        }
        this.f2458b = c0848r;
    }

    /* JADX INFO: renamed from: b */
    public final void m2087b(AbstractC0913ag abstractC0913ag) {
        C0848r c0848r = this.f2458b;
        this.f2458b = abstractC0913ag.mo1962a(this.f2458b);
        this.f2457a.m2078n().m2106a(this, c0848r);
        mo2023a(abstractC0913ag);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m2088b(int i) {
        return this.f2458b != null && this.f2458b.m1795g() == i;
    }

    /* JADX INFO: renamed from: c */
    public abstract C0853w mo2027c();

    /* JADX INFO: renamed from: c */
    public final void m2089c(int i) {
        if (this.f2458b != null) {
            this.f2458b = this.f2458b.m1787a(i);
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract AbstractC0839i mo2028e();

    /* JADX INFO: renamed from: f */
    public C0848r mo2090f() {
        if (this.f2458b == null || this.f2458b.m1797i() == null) {
            return null;
        }
        return this.f2458b;
    }

    /* JADX INFO: renamed from: h */
    public boolean mo2091h() {
        return false;
    }

    /* JADX INFO: renamed from: i */
    public boolean mo2092i() {
        return false;
    }

    /* JADX INFO: renamed from: j */
    public abstract boolean mo2030j();

    /* JADX INFO: renamed from: k */
    public abstract boolean mo2031k();

    /* JADX INFO: renamed from: l */
    public abstract boolean mo2032l();

    @Override // 
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public AbstractC0918al clone() {
        try {
            return (AbstractC0918al) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("unexpected", e);
        }
    }

    /* JADX INFO: renamed from: n */
    public final C0848r m2093n() {
        return this.f2458b;
    }

    /* JADX INFO: renamed from: o */
    public final C0915ai m2094o() {
        return this.f2457a;
    }
}
