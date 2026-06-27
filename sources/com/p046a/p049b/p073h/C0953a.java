package com.p046a.p049b.p073h;

import com.gmail.heagoo.p084a.p089c.C1067a;

/* JADX INFO: renamed from: com.a.b.h.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0953a implements InterfaceC0963k {

    /* JADX INFO: renamed from: a */
    int[] f2558a;

    public C0953a(int i) {
        this.f2558a = C1067a.m2555s(i);
    }

    /* JADX INFO: renamed from: c */
    private void m2204c(int i) {
        if (i >= C1067a.m2437a(this.f2558a)) {
            int[] iArrM2555s = C1067a.m2555s(Math.max(i + 1, C1067a.m2437a(this.f2558a) * 2));
            System.arraycopy(this.f2558a, 0, iArrM2555s, 0, this.f2558a.length);
            this.f2558a = iArrM2555s;
        }
    }

    @Override // com.p046a.p049b.p073h.InterfaceC0963k
    /* JADX INFO: renamed from: a */
    public final int mo2205a() {
        return C1067a.m2514c(this.f2558a);
    }

    @Override // com.p046a.p049b.p073h.InterfaceC0963k
    /* JADX INFO: renamed from: a */
    public final void mo2206a(int i) {
        m2204c(i);
        C1067a.m2483a(this.f2558a, i, true);
    }

    @Override // com.p046a.p049b.p073h.InterfaceC0963k
    /* JADX INFO: renamed from: a */
    public final void mo2207a(InterfaceC0963k interfaceC0963k) {
        if (interfaceC0963k instanceof C0953a) {
            C0953a c0953a = (C0953a) interfaceC0963k;
            m2204c(C1067a.m2437a(c0953a.f2558a) + 1);
            C1067a.m2484a(this.f2558a, c0953a.f2558a);
        } else {
            if (!(interfaceC0963k instanceof C0966n)) {
                InterfaceC0961i interfaceC0961iMo2208b = interfaceC0963k.mo2208b();
                while (interfaceC0961iMo2208b.mo2210a()) {
                    mo2206a(interfaceC0961iMo2208b.mo2211b());
                }
                return;
            }
            C0966n c0966n = (C0966n) interfaceC0963k;
            int iM2247b = c0966n.f2582a.m2247b();
            if (iM2247b > 0) {
                m2204c(c0966n.f2582a.m2248b(iM2247b - 1));
            }
            for (int i = 0; i < c0966n.f2582a.m2247b(); i++) {
                C1067a.m2483a(this.f2558a, c0966n.f2582a.m2248b(i), true);
            }
        }
    }

    @Override // com.p046a.p049b.p073h.InterfaceC0963k
    /* JADX INFO: renamed from: b */
    public final InterfaceC0961i mo2208b() {
        return new C0954b(this);
    }

    @Override // com.p046a.p049b.p073h.InterfaceC0963k
    /* JADX INFO: renamed from: b */
    public final boolean mo2209b(int i) {
        return i < C1067a.m2437a(this.f2558a) && C1067a.m2489a(this.f2558a, i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        boolean z = true;
        int iM2524d = C1067a.m2524d(this.f2558a, 0);
        while (iM2524d >= 0) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(iM2524d);
            iM2524d = C1067a.m2524d(this.f2558a, iM2524d + 1);
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
