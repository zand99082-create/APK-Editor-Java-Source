package com.p046a.p049b.p073h;

/* JADX INFO: renamed from: com.a.b.h.m */
/* JADX INFO: loaded from: classes.dex */
public class C0965m extends C0959g {

    /* JADX INFO: renamed from: a */
    private final C0962j f2581a;

    public C0965m(int i) {
        super(i);
        this.f2581a = new C0962j(i);
    }

    public C0965m(C0965m c0965m) {
        super(c0965m.m2239d_());
        this.f2581a = c0965m.f2581a.m2257f();
        int iD_ = c0965m.m2239d_();
        for (int i = 0; i < iD_; i++) {
            Object objE = c0965m.m2240e(i);
            if (objE != null) {
                m2237a(i, objE);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    protected final void m2261a(int i, InterfaceC0964l interfaceC0964l) {
        InterfaceC0964l interfaceC0964l2 = (InterfaceC0964l) m2241f(i);
        m2237a(i, (Object) interfaceC0964l);
        if (interfaceC0964l2 != null) {
            this.f2581a.m2249b(interfaceC0964l2.mo821a(), -1);
        }
        if (interfaceC0964l != null) {
            int iMo821a = interfaceC0964l.mo821a();
            int iM2247b = this.f2581a.m2247b();
            for (int i2 = 0; i2 <= iMo821a - iM2247b; i2++) {
                this.f2581a.m2250c(-1);
            }
            this.f2581a.m2249b(iMo821a, i);
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m2262c(int i) {
        if (i >= this.f2581a.m2247b()) {
            return -1;
        }
        return this.f2581a.m2248b(i);
    }

    @Override // com.p046a.p049b.p073h.C0959g
    /* JADX INFO: renamed from: i */
    public final void mo2242i() {
        super.mo2242i();
        int iD_ = m2239d_();
        for (int i = 0; i < iD_; i++) {
            InterfaceC0964l interfaceC0964l = (InterfaceC0964l) m2240e(i);
            if (interfaceC0964l != null) {
                this.f2581a.m2249b(interfaceC0964l.mo821a(), i);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final int m2263j() {
        int iM2247b = this.f2581a.m2247b() - 1;
        while (iM2247b >= 0 && this.f2581a.m2248b(iM2247b) < 0) {
            iM2247b--;
        }
        int i = iM2247b + 1;
        this.f2581a.m2255e(i);
        return i;
    }
}
