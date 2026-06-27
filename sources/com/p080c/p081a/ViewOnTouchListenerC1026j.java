package com.p080c.p081a;

import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: com.c.a.j */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC1026j implements View.OnTouchListener {

    /* JADX INFO: renamed from: A */
    private int f2687A;

    /* JADX INFO: renamed from: B */
    private int f2688B;

    /* JADX INFO: renamed from: C */
    private C1021e f2689C;

    /* JADX INFO: renamed from: D */
    private C1019c f2690D;

    /* JADX INFO: renamed from: E */
    private C1033q f2691E;

    /* JADX INFO: renamed from: F */
    private C1030n f2692F;

    /* JADX INFO: renamed from: G */
    private GestureDetector f2693G;

    /* JADX INFO: renamed from: H */
    private InterfaceC1025i f2694H;

    /* JADX INFO: renamed from: a */
    private C1022f f2695a;

    /* JADX INFO: renamed from: j */
    private float f2704j;

    /* JADX INFO: renamed from: k */
    private float f2705k;

    /* JADX INFO: renamed from: l */
    private float f2706l;

    /* JADX INFO: renamed from: m */
    private float f2707m;

    /* JADX INFO: renamed from: n */
    private float f2708n;

    /* JADX INFO: renamed from: o */
    private float f2709o;

    /* JADX INFO: renamed from: p */
    private float f2710p;

    /* JADX INFO: renamed from: s */
    private float f2713s;

    /* JADX INFO: renamed from: t */
    private float f2714t;

    /* JADX INFO: renamed from: u */
    private float f2715u;

    /* JADX INFO: renamed from: y */
    private int f2719y;

    /* JADX INFO: renamed from: z */
    private int f2720z;

    /* JADX INFO: renamed from: b */
    private final PointF f2696b = new PointF();

    /* JADX INFO: renamed from: c */
    private final PointF f2697c = new PointF();

    /* JADX INFO: renamed from: d */
    private final PointF f2698d = new PointF();

    /* JADX INFO: renamed from: e */
    private final PointF f2699e = new PointF();

    /* JADX INFO: renamed from: f */
    private final C1032p f2700f = new C1032p();

    /* JADX INFO: renamed from: g */
    private final C1032p f2701g = new C1032p();

    /* JADX INFO: renamed from: h */
    private boolean f2702h = false;

    /* JADX INFO: renamed from: i */
    private boolean f2703i = false;

    /* JADX INFO: renamed from: q */
    private float f2711q = 5.0f;

    /* JADX INFO: renamed from: r */
    private float f2712r = 0.25f;

    /* JADX INFO: renamed from: v */
    private boolean f2716v = false;

    /* JADX INFO: renamed from: w */
    private boolean f2717w = false;

    /* JADX INFO: renamed from: x */
    private boolean f2718x = false;

    public ViewOnTouchListenerC1026j(C1022f c1022f, int i, int i2) {
        this.f2705k = 1.0f;
        this.f2706l = 1.0f;
        this.f2707m = 0.0f;
        this.f2708n = 0.0f;
        this.f2709o = 0.0f;
        this.f2710p = 0.0f;
        this.f2713s = 0.0f;
        this.f2714t = 0.0f;
        this.f2715u = 0.0f;
        this.f2695a = c1022f;
        this.f2719y = i;
        this.f2720z = i2;
        this.f2713s = i / 2.0f;
        this.f2714t = i2 / 2.0f;
        this.f2687A = c1022f.m2333c();
        this.f2688B = c1022f.m2334d();
        this.f2715u = c1022f.m2335e();
        this.f2706l = this.f2715u;
        this.f2705k = this.f2715u;
        this.f2709o = i;
        this.f2710p = i2;
        this.f2707m = 0.0f;
        this.f2708n = 0.0f;
        this.f2698d.x = c1022f.m2336f();
        this.f2698d.y = c1022f.m2337g();
        this.f2689C = new C1021e();
        this.f2690D = new C1019c();
        this.f2691E = new C1033q();
        this.f2692F = new C1030n();
        this.f2690D.m2316a(new C1027k(this));
        this.f2691E.m2362a(2.0f);
        this.f2691E.m2363a(new C1028l(this));
        this.f2692F.m2356a(new C1029m(this, c1022f));
        this.f2693G = new GestureDetector(c1022f.getContext(), this.f2689C);
        this.f2694H = c1022f.m2338h();
        m2347c();
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ boolean m2343a(ViewOnTouchListenerC1026j viewOnTouchListenerC1026j, boolean z) {
        viewOnTouchListenerC1026j.f2703i = false;
        return false;
    }

    /* JADX INFO: renamed from: b */
    private void m2345b() {
        if (this.f2698d.x < this.f2707m) {
            this.f2698d.x = this.f2707m;
        } else if (this.f2698d.x > this.f2709o) {
            this.f2698d.x = this.f2709o;
        }
        if (this.f2698d.y < this.f2708n) {
            this.f2698d.y = this.f2708n;
        } else if (this.f2698d.y > this.f2710p) {
            this.f2698d.y = this.f2710p;
        }
    }

    /* JADX INFO: renamed from: c */
    private void m2347c() {
        int iRound = Math.round(this.f2687A * this.f2706l);
        int iRound2 = Math.round(this.f2688B * this.f2706l);
        this.f2716v = iRound > this.f2719y;
        this.f2717w = iRound2 > this.f2720z;
        if (this.f2716v) {
            float f = (iRound - this.f2719y) / 2.0f;
            this.f2707m = this.f2713s - f;
            this.f2709o = f + this.f2713s;
        }
        if (this.f2717w) {
            float f2 = (iRound2 - this.f2720z) / 2.0f;
            this.f2708n = this.f2714t - f2;
            this.f2710p = f2 + this.f2714t;
        }
    }

    /* JADX INFO: renamed from: a */
    protected final void m2348a() {
        this.f2718x = false;
        this.f2704j = 0.0f;
        this.f2705k = this.f2706l;
        if (!this.f2716v) {
            this.f2698d.x = this.f2713s;
        }
        if (!this.f2717w) {
            this.f2698d.y = this.f2714t;
        }
        m2345b();
        this.f2695a.m2325a(this.f2706l);
        this.f2695a.m2326a(this.f2698d.x, this.f2698d.y);
        if (this.f2694H != null) {
            this.f2694H.mo2341a(this.f2706l);
            float f = this.f2698d.x;
            float f2 = this.f2698d.y;
        }
        this.f2695a.postInvalidate();
    }

    /* JADX INFO: renamed from: a */
    public final void m2349a(float f) {
        this.f2711q = f;
    }

    /* JADX INFO: renamed from: a */
    protected final void m2350a(float f, float f2, float f3) {
        this.f2706l = f;
        if (this.f2706l > this.f2711q) {
            this.f2706l = this.f2711q;
        } else if (this.f2706l < this.f2712r) {
            this.f2706l = this.f2712r;
        } else {
            this.f2698d.x = f2;
            this.f2698d.y = f3;
        }
        m2347c();
        this.f2695a.m2325a(this.f2706l);
        this.f2695a.m2326a(this.f2698d.x, this.f2698d.y);
        if (this.f2694H != null) {
            this.f2694H.mo2341a(this.f2706l);
            float f4 = this.f2698d.x;
            float f5 = this.f2698d.y;
        }
        this.f2695a.postInvalidate();
    }

    /* JADX INFO: renamed from: a */
    protected final boolean m2351a(float f, float f2) {
        this.f2696b.x = f;
        this.f2696b.y = f2;
        float f3 = this.f2696b.x - this.f2697c.x;
        float f4 = this.f2696b.y - this.f2697c.y;
        if (f3 != 0.0f || f4 != 0.0f) {
            if (this.f2716v) {
                PointF pointF = this.f2698d;
                pointF.x = f3 + pointF.x;
            }
            if (this.f2717w) {
                PointF pointF2 = this.f2698d;
                pointF2.y = f4 + pointF2.y;
            }
            m2345b();
            this.f2697c.x = this.f2696b.x;
            this.f2697c.y = this.f2696b.y;
            if (this.f2716v || this.f2717w) {
                this.f2695a.m2326a(this.f2698d.x, this.f2698d.y);
                if (this.f2694H != null) {
                    float f5 = this.f2698d.x;
                    float f6 = this.f2698d.y;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final void m2352b(float f) {
        this.f2712r = f;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f2703i) {
            if (motionEvent.getPointerCount() == 1 && this.f2693G.onTouchEvent(motionEvent)) {
                this.f2690D.m2315a(this.f2689C.m2319a());
                this.f2690D.m2317b(this.f2689C.m2320b());
                this.f2695a.m2327a(this.f2690D);
            }
            if (motionEvent.getAction() == 1) {
                m2348a();
            } else if (motionEvent.getAction() == 0) {
                this.f2695a.m2330b();
                this.f2697c.x = motionEvent.getX();
                this.f2697c.y = motionEvent.getY();
                if (this.f2694H != null) {
                    float f = this.f2697c.x;
                    float f2 = this.f2697c.y;
                }
                this.f2702h = true;
            } else if (motionEvent.getAction() == 2) {
                if (motionEvent.getPointerCount() > 1) {
                    this.f2718x = true;
                    if (this.f2704j > 0.0f) {
                        C1032p c1032p = this.f2701g;
                        c1032p.f2731b.x = motionEvent.getX(0);
                        c1032p.f2731b.y = motionEvent.getY(0);
                        c1032p.f2732c.x = motionEvent.getX(1);
                        c1032p.f2732c.y = motionEvent.getY(1);
                        this.f2701g.m2359b();
                        float f3 = this.f2701g.f2730a;
                        if (this.f2704j != f3) {
                            float f4 = (f3 / this.f2704j) * this.f2705k;
                            if (f4 <= this.f2711q) {
                                this.f2700f.f2730a *= f4;
                                this.f2700f.m2357a();
                                this.f2700f.f2730a /= f4;
                                float f5 = this.f2700f.f2732c.x;
                                float f6 = this.f2700f.f2732c.y;
                                m2350a(f4, this.f2713s, this.f2714t);
                            }
                        }
                    } else {
                        float x = motionEvent.getX(0) - motionEvent.getX(1);
                        float y = motionEvent.getY(0) - motionEvent.getY(1);
                        this.f2704j = (float) Math.sqrt((x * x) + (y * y));
                        PointF pointF = this.f2699e;
                        float x2 = motionEvent.getX(0);
                        float y2 = motionEvent.getY(0);
                        float x3 = motionEvent.getX(1);
                        float y3 = motionEvent.getY(1);
                        pointF.x = (x2 + x3) / 2.0f;
                        pointF.y = (y2 + y3) / 2.0f;
                        this.f2700f.m2358a(this.f2699e);
                        this.f2700f.m2360b(this.f2698d);
                        this.f2700f.m2359b();
                        this.f2700f.m2361c();
                        this.f2700f.f2730a /= this.f2705k;
                    }
                } else if (!this.f2702h) {
                    this.f2702h = true;
                    this.f2697c.x = motionEvent.getX();
                    this.f2697c.y = motionEvent.getY();
                    this.f2698d.x = this.f2695a.m2336f();
                    this.f2698d.y = this.f2695a.m2337g();
                } else if (!this.f2718x && m2351a(motionEvent.getX(), motionEvent.getY())) {
                    this.f2695a.postInvalidate();
                }
            }
        }
        return true;
    }
}
