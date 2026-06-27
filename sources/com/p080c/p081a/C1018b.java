package com.p080c.p081a;

/* JADX INFO: renamed from: com.c.a.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1018b extends Thread {

    /* JADX INFO: renamed from: a */
    private C1022f f2640a;

    /* JADX INFO: renamed from: b */
    private InterfaceC1017a f2641b;

    /* JADX INFO: renamed from: c */
    private boolean f2642c;

    /* JADX INFO: renamed from: d */
    private boolean f2643d;

    /* JADX INFO: renamed from: e */
    private long f2644e;

    public C1018b(C1022f c1022f, String str) {
        super(str);
        this.f2642c = false;
        this.f2643d = false;
        this.f2644e = -1L;
        this.f2640a = c1022f;
    }

    /* JADX INFO: renamed from: c */
    private synchronized void m2311c() {
        this.f2644e = System.currentTimeMillis();
        this.f2643d = true;
        notifyAll();
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m2312a() {
        this.f2642c = false;
        this.f2643d = false;
        notifyAll();
    }

    /* JADX INFO: renamed from: a */
    public final void m2313a(InterfaceC1017a interfaceC1017a) {
        if (this.f2643d) {
            this.f2643d = false;
        }
        this.f2641b = interfaceC1017a;
        m2311c();
    }

    /* JADX INFO: renamed from: b */
    public final void m2314b() {
        this.f2643d = false;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        this.f2642c = true;
        while (this.f2642c) {
            while (this.f2643d && this.f2641b != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.f2643d = this.f2641b.mo2310a(this.f2640a, jCurrentTimeMillis - this.f2644e);
                this.f2640a.postInvalidate();
                this.f2644e = jCurrentTimeMillis;
                while (this.f2643d) {
                    try {
                    } catch (InterruptedException e) {
                        this.f2643d = false;
                    }
                    if (this.f2640a.m2329a(32L)) {
                        break;
                    }
                }
            }
            synchronized (this) {
                if (this.f2642c) {
                    try {
                        wait();
                    } catch (InterruptedException e2) {
                    }
                }
            }
        }
    }
}
