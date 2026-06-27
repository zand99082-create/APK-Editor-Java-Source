package com.p080c.p081a;

import android.graphics.PointF;

/* JADX INFO: renamed from: com.c.a.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1033q implements InterfaceC1017a {

    /* JADX INFO: renamed from: b */
    private float f2735b;

    /* JADX INFO: renamed from: c */
    private float f2736c;

    /* JADX INFO: renamed from: d */
    private float f2737d;

    /* JADX INFO: renamed from: e */
    private float f2738e;

    /* JADX INFO: renamed from: f */
    private float f2739f;

    /* JADX INFO: renamed from: g */
    private float f2740g;

    /* JADX INFO: renamed from: h */
    private float f2741h;

    /* JADX INFO: renamed from: k */
    private InterfaceC1034r f2744k;

    /* JADX INFO: renamed from: a */
    private boolean f2734a = true;

    /* JADX INFO: renamed from: i */
    private long f2742i = 200;

    /* JADX INFO: renamed from: j */
    private long f2743j = 0;

    /* JADX INFO: renamed from: a */
    public final void m2362a(float f) {
        this.f2735b = 2.0f;
    }

    /* JADX INFO: renamed from: a */
    public final void m2363a(InterfaceC1034r interfaceC1034r) {
        this.f2744k = interfaceC1034r;
    }

    @Override // com.p080c.p081a.InterfaceC1017a
    /* JADX INFO: renamed from: a */
    public final boolean mo2310a(C1022f c1022f, long j) {
        if (this.f2734a) {
            this.f2734a = false;
            this.f2736c = c1022f.m2336f();
            this.f2737d = c1022f.m2337g();
            this.f2738e = c1022f.m2335e();
            this.f2741h = (this.f2735b * this.f2738e) - this.f2738e;
            if (this.f2741h > 0.0f) {
                C1032p c1032p = new C1032p();
                c1032p.m2358a(new PointF(0.0f, 0.0f));
                c1032p.m2360b(new PointF(this.f2736c, this.f2737d));
                c1032p.m2361c();
                c1032p.f2730a = c1032p.m2359b() * this.f2735b;
                c1032p.m2357a();
                this.f2739f = c1032p.f2732c.x - this.f2736c;
                this.f2740g = c1032p.f2732c.y - this.f2737d;
            } else {
                this.f2739f = c1022f.m2339i() - this.f2736c;
                this.f2740g = c1022f.m2340j() - this.f2737d;
            }
        }
        this.f2743j += j;
        float f = this.f2743j / this.f2742i;
        if (f < 1.0f) {
            if (f > 0.0f) {
                float f2 = (this.f2741h * f) + this.f2738e;
                float f3 = (this.f2739f * f) + this.f2736c;
                float f4 = (f * this.f2740g) + this.f2737d;
                if (this.f2744k != null) {
                    this.f2744k.mo2354a(f2, f3, f4);
                }
            }
            return true;
        }
        float f5 = this.f2741h + this.f2738e;
        float f6 = this.f2739f + this.f2736c;
        float f7 = this.f2740g + this.f2737d;
        if (this.f2744k == null) {
            return false;
        }
        this.f2744k.mo2354a(f5, f6, f7);
        this.f2744k.mo2353a();
        return false;
    }
}
