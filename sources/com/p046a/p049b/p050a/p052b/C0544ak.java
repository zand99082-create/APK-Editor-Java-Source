package com.p046a.p049b.p050a.p052b;

import com.p046a.p049b.p073h.C0962j;
import com.p046a.p049b.p073h.C0968p;

/* JADX INFO: renamed from: com.a.b.a.b.ak */
/* JADX INFO: loaded from: classes.dex */
public final class C0544ak extends C0968p {

    /* JADX INFO: renamed from: a */
    private final C0962j f862a;

    /* JADX INFO: renamed from: b */
    private final C0962j f863b;

    /* JADX INFO: renamed from: c */
    private int f864c;

    public C0544ak(int i) {
        super(true);
        this.f862a = new C0962j(i);
        this.f863b = new C0962j(i + 1);
        this.f864c = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m806a() {
        return this.f864c;
    }

    /* JADX INFO: renamed from: a */
    public final int m807a(int i) {
        return this.f862a.m2248b(i);
    }

    /* JADX INFO: renamed from: a */
    public final void m808a(int i, int i2) {
        m2266l();
        if (i2 < 0) {
            throw new IllegalArgumentException("target < 0");
        }
        this.f862a.m2250c(i);
        this.f863b.m2250c(i2);
    }

    /* JADX INFO: renamed from: b */
    public final int m809b() {
        return this.f863b.m2248b(this.f864c);
    }

    /* JADX INFO: renamed from: b */
    public final int m810b(int i) {
        return this.f863b.m2248b(i);
    }

    @Override // com.p046a.p049b.p073h.C0968p
    /* JADX INFO: renamed from: b_ */
    public final void mo811b_() {
        this.f862a.mo811b_();
        this.f863b.mo811b_();
        super.mo811b_();
    }

    /* JADX INFO: renamed from: c */
    public final void m812c(int i) {
        m2266l();
        if (i < 0) {
            throw new IllegalArgumentException("target < 0");
        }
        if (this.f863b.m2247b() != this.f864c) {
            throw new RuntimeException("non-default elements not all set");
        }
        this.f863b.m2250c(i);
    }

    /* JADX INFO: renamed from: d */
    public final C0962j m813d() {
        return this.f863b;
    }

    /* JADX INFO: renamed from: e */
    public final C0962j m814e() {
        return this.f862a;
    }

    /* JADX INFO: renamed from: f */
    public final void m815f() {
        int i = 0;
        m2266l();
        int i2 = this.f864c;
        if (i2 != this.f863b.m2247b() - 1) {
            throw new IllegalArgumentException("incomplete instance");
        }
        int iM2248b = this.f863b.m2248b(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            int iM2248b2 = this.f863b.m2248b(i3);
            if (iM2248b2 != iM2248b) {
                if (i3 != i) {
                    this.f863b.m2249b(i, iM2248b2);
                    this.f862a.m2249b(i, this.f862a.m2248b(i3));
                }
                i++;
            }
        }
        if (i != i2) {
            this.f862a.m2255e(i);
            this.f863b.m2249b(i, iM2248b);
            this.f863b.m2255e(i + 1);
            this.f864c = i;
        }
    }
}
