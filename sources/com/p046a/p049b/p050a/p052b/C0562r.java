package com.p046a.p049b.p050a.p052b;

import com.p046a.p049b.p066f.p068b.C0843m;
import com.p046a.p049b.p066f.p069c.C0883y;
import com.p046a.p049b.p066f.p070d.C0887c;

/* JADX INFO: renamed from: com.a.b.a.b.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0562r {

    /* JADX INFO: renamed from: a */
    private final int f907a;

    /* JADX INFO: renamed from: b */
    private final int f908b;

    /* JADX INFO: renamed from: c */
    private final C0883y f909c;

    /* JADX INFO: renamed from: d */
    private final C0883y f910d;

    /* JADX INFO: renamed from: e */
    private final C0883y f911e;

    /* JADX INFO: renamed from: f */
    private final int f912f;

    public C0562r(int i, int i2, C0883y c0883y, C0883y c0883y2, C0883y c0883y3, int i3) {
        if (i < 0) {
            throw new IllegalArgumentException("startPc < 0");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("length < 0");
        }
        if (c0883y == null) {
            throw new NullPointerException("name == null");
        }
        if (c0883y2 == null && c0883y3 == null) {
            throw new NullPointerException("(descriptor == null) && (signature == null)");
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("index < 0");
        }
        this.f907a = i;
        this.f908b = i2;
        this.f909c = c0883y;
        this.f910d = c0883y2;
        this.f911e = c0883y3;
        this.f912f = i3;
    }

    /* JADX INFO: renamed from: a */
    public final C0562r m900a(C0883y c0883y) {
        return new C0562r(this.f907a, this.f908b, this.f909c, this.f910d, c0883y, this.f912f);
    }

    /* JADX INFO: renamed from: a */
    public final C0843m m901a() {
        return C0843m.m1764a(this.f909c, this.f911e);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m902a(int i, int i2) {
        return i2 == this.f912f && i >= this.f907a && i < this.f907a + this.f908b;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m903a(C0562r c0562r) {
        return this.f907a == c0562r.f907a && this.f908b == c0562r.f908b && this.f912f == c0562r.f912f && this.f909c.equals(c0562r.f909c);
    }

    /* JADX INFO: renamed from: b */
    public final C0887c m904b() {
        return C0887c.m1941a(this.f910d.m1911j());
    }
}
