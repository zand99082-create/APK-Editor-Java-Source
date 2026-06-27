package com.p080c.p081a;

/* JADX INFO: renamed from: com.c.a.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1019c implements InterfaceC1017a {

    /* JADX INFO: renamed from: a */
    private float f2645a;

    /* JADX INFO: renamed from: b */
    private float f2646b;

    /* JADX INFO: renamed from: c */
    private float f2647c = 0.95f;

    /* JADX INFO: renamed from: d */
    private float f2648d = 10.0f;

    /* JADX INFO: renamed from: e */
    private InterfaceC1020d f2649e;

    /* JADX INFO: renamed from: a */
    public final void m2315a(float f) {
        this.f2645a = f;
    }

    /* JADX INFO: renamed from: a */
    public final void m2316a(InterfaceC1020d interfaceC1020d) {
        this.f2649e = interfaceC1020d;
    }

    @Override // com.p080c.p081a.InterfaceC1017a
    /* JADX INFO: renamed from: a */
    public final boolean mo2310a(C1022f c1022f, long j) {
        float f = j / 1000.0f;
        float f2 = this.f2645a * f;
        float f3 = this.f2646b * f;
        this.f2645a *= this.f2647c;
        this.f2646b *= this.f2647c;
        boolean z = Math.abs(this.f2645a) > this.f2648d && Math.abs(this.f2646b) > this.f2648d;
        if (this.f2649e != null) {
            this.f2649e.mo2318a(f2, f3);
        }
        return z;
    }

    /* JADX INFO: renamed from: b */
    public final void m2317b(float f) {
        this.f2646b = f;
    }
}
