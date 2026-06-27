package com.p080c.p081a;

/* JADX INFO: renamed from: com.c.a.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1030n implements InterfaceC1017a {

    /* JADX INFO: renamed from: b */
    private float f2725b;

    /* JADX INFO: renamed from: c */
    private float f2726c;

    /* JADX INFO: renamed from: f */
    private InterfaceC1031o f2729f;

    /* JADX INFO: renamed from: a */
    private boolean f2724a = true;

    /* JADX INFO: renamed from: d */
    private long f2727d = 100;

    /* JADX INFO: renamed from: e */
    private long f2728e = 0;

    /* JADX INFO: renamed from: a */
    public final void m2356a(InterfaceC1031o interfaceC1031o) {
        this.f2729f = interfaceC1031o;
    }

    @Override // com.p080c.p081a.InterfaceC1017a
    /* JADX INFO: renamed from: a */
    public final boolean mo2310a(C1022f c1022f, long j) {
        this.f2728e += j;
        if (this.f2724a) {
            this.f2724a = false;
            this.f2725b = c1022f.m2336f();
            this.f2726c = c1022f.m2337g();
        }
        if (this.f2728e >= this.f2727d) {
            if (this.f2729f == null) {
                return false;
            }
            this.f2729f.mo2355a(0.0f, 0.0f);
            return false;
        }
        float f = this.f2728e / this.f2727d;
        float f2 = ((0.0f - this.f2725b) * f) + this.f2725b;
        float f3 = (f * (0.0f - this.f2726c)) + this.f2726c;
        if (this.f2729f != null) {
            this.f2729f.mo2355a(f2, f3);
        }
        return true;
    }
}
