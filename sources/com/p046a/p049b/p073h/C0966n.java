package com.p046a.p049b.p073h;

import com.gmail.heagoo.p084a.p089c.C1067a;

/* JADX INFO: renamed from: com.a.b.h.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0966n implements InterfaceC0963k {

    /* JADX INFO: renamed from: a */
    final C0962j f2582a = new C0962j();

    public C0966n() {
        this.f2582a.m2259g();
    }

    @Override // com.p046a.p049b.p073h.InterfaceC0963k
    /* JADX INFO: renamed from: a */
    public final int mo2205a() {
        return this.f2582a.m2247b();
    }

    @Override // com.p046a.p049b.p073h.InterfaceC0963k
    /* JADX INFO: renamed from: a */
    public final void mo2206a(int i) {
        int iM2258g = this.f2582a.m2258g(i);
        if (iM2258g < 0) {
            this.f2582a.m2251c(-(iM2258g + 1), i);
        }
    }

    @Override // com.p046a.p049b.p073h.InterfaceC0963k
    /* JADX INFO: renamed from: a */
    public final void mo2207a(InterfaceC0963k interfaceC0963k) {
        int iM2524d = 0;
        if (!(interfaceC0963k instanceof C0966n)) {
            if (!(interfaceC0963k instanceof C0953a)) {
                InterfaceC0961i interfaceC0961iMo2208b = interfaceC0963k.mo2208b();
                while (interfaceC0961iMo2208b.mo2210a()) {
                    mo2206a(interfaceC0961iMo2208b.mo2211b());
                }
                return;
            } else {
                C0953a c0953a = (C0953a) interfaceC0963k;
                while (iM2524d >= 0) {
                    this.f2582a.m2250c(iM2524d);
                    iM2524d = C1067a.m2524d(c0953a.f2558a, iM2524d + 1);
                }
                this.f2582a.m2259g();
                return;
            }
        }
        C0966n c0966n = (C0966n) interfaceC0963k;
        int iM2247b = this.f2582a.m2247b();
        int iM2247b2 = c0966n.f2582a.m2247b();
        int i = 0;
        while (iM2524d < iM2247b2 && i < iM2247b) {
            while (iM2524d < iM2247b2 && c0966n.f2582a.m2248b(iM2524d) < this.f2582a.m2248b(i)) {
                mo2206a(c0966n.f2582a.m2248b(iM2524d));
                iM2524d++;
            }
            if (iM2524d == iM2247b2) {
                break;
            }
            while (i < iM2247b && c0966n.f2582a.m2248b(iM2524d) >= this.f2582a.m2248b(i)) {
                i++;
            }
        }
        while (iM2524d < iM2247b2) {
            mo2206a(c0966n.f2582a.m2248b(iM2524d));
            iM2524d++;
        }
        this.f2582a.m2259g();
    }

    @Override // com.p046a.p049b.p073h.InterfaceC0963k
    /* JADX INFO: renamed from: b */
    public final InterfaceC0961i mo2208b() {
        return new C0967o(this);
    }

    @Override // com.p046a.p049b.p073h.InterfaceC0963k
    /* JADX INFO: renamed from: b */
    public final boolean mo2209b(int i) {
        return this.f2582a.m2256f(i) >= 0;
    }

    public final String toString() {
        return this.f2582a.toString();
    }
}
