package com.p046a.p049b.p058c.p060b;

/* JADX INFO: renamed from: com.a.b.c.b.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0664g implements Comparable {

    /* JADX INFO: renamed from: a */
    private final int f1105a;

    /* JADX INFO: renamed from: b */
    private final int f1106b;

    /* JADX INFO: renamed from: c */
    private final C0661d f1107c;

    public C0664g(int i, int i2, C0661d c0661d) {
        if (i < 0) {
            throw new IllegalArgumentException("start < 0");
        }
        if (i2 <= i) {
            throw new IllegalArgumentException("end <= start");
        }
        if (c0661d.m2264c_()) {
            throw new IllegalArgumentException("handlers.isMutable()");
        }
        this.f1105a = i;
        this.f1106b = i2;
        this.f1107c = c0661d;
    }

    /* JADX INFO: renamed from: a */
    public final int m1192a() {
        return this.f1105a;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C0664g c0664g) {
        if (this.f1105a < c0664g.f1105a) {
            return -1;
        }
        if (this.f1105a > c0664g.f1105a) {
            return 1;
        }
        if (this.f1106b < c0664g.f1106b) {
            return -1;
        }
        if (this.f1106b > c0664g.f1106b) {
            return 1;
        }
        return this.f1107c.compareTo(c0664g.f1107c);
    }

    /* JADX INFO: renamed from: b */
    public final int m1194b() {
        return this.f1106b;
    }

    /* JADX INFO: renamed from: c */
    public final C0661d m1195c() {
        return this.f1107c;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0664g) && compareTo((C0664g) obj) == 0;
    }

    public final int hashCode() {
        return (((this.f1105a * 31) + this.f1106b) * 31) + this.f1107c.hashCode();
    }
}
