package com.p046a.p049b.p073h;

/* JADX INFO: renamed from: com.a.b.h.p */
/* JADX INFO: loaded from: classes.dex */
public class C0968p {

    /* JADX INFO: renamed from: a */
    private boolean f2585a;

    public C0968p() {
        this.f2585a = true;
    }

    public C0968p(boolean z) {
        this.f2585a = z;
    }

    /* JADX INFO: renamed from: b_ */
    public void mo811b_() {
        this.f2585a = false;
    }

    /* JADX INFO: renamed from: c_ */
    public final boolean m2264c_() {
        return this.f2585a;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m2265k() {
        return !this.f2585a;
    }

    /* JADX INFO: renamed from: l */
    public final void m2266l() {
        if (!this.f2585a) {
            throw new C0969q("immutable instance");
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m2267m() {
        if (this.f2585a) {
            throw new C0969q("mutable instance");
        }
    }
}
