package com.p046a.p049b.p050a.p052b;

import com.p046a.p049b.p066f.p069c.C0884z;

/* JADX INFO: renamed from: com.a.b.a.b.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0550f {

    /* JADX INFO: renamed from: a */
    private final int f878a;

    /* JADX INFO: renamed from: b */
    private final int f879b;

    /* JADX INFO: renamed from: c */
    private final int f880c;

    /* JADX INFO: renamed from: d */
    private final C0884z f881d;

    public C0550f(int i, int i2, int i3, C0884z c0884z) {
        if (i < 0) {
            throw new IllegalArgumentException("startPc < 0");
        }
        if (i2 < i) {
            throw new IllegalArgumentException("endPc < startPc");
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("handlerPc < 0");
        }
        this.f878a = i;
        this.f879b = i2;
        this.f880c = i3;
        this.f881d = c0884z;
    }

    /* JADX INFO: renamed from: a */
    public final int m832a() {
        return this.f878a;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m833a(int i) {
        return i >= this.f878a && i < this.f879b;
    }

    /* JADX INFO: renamed from: b */
    public final int m834b() {
        return this.f879b;
    }

    /* JADX INFO: renamed from: c */
    public final int m835c() {
        return this.f880c;
    }

    /* JADX INFO: renamed from: d */
    public final C0884z m836d() {
        return this.f881d != null ? this.f881d : C0884z.f2270a;
    }
}
