package com.p046a.p049b.p071g.p072a;

/* JADX INFO: renamed from: com.a.b.g.a.g */
/* JADX INFO: loaded from: classes.dex */
final class C0897g {

    /* JADX INFO: renamed from: a */
    private final int[] f2390a;

    /* JADX INFO: renamed from: b */
    private final int[] f2391b;

    /* JADX INFO: renamed from: c */
    private int f2392c = 0;

    public C0897g(int i) {
        this.f2390a = new int[i];
        this.f2391b = new int[i];
    }

    /* JADX INFO: renamed from: a */
    public final int m1994a() {
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < this.f2392c; i4++) {
            if (i < this.f2391b[i4]) {
                i2 = this.f2390a[i4];
                i = this.f2391b[i4];
                i3 = i4;
            }
        }
        this.f2391b[i3] = 0;
        return i2;
    }

    /* JADX INFO: renamed from: a */
    public final void m1995a(int i) {
        for (int i2 = 0; i2 < this.f2392c; i2++) {
            if (this.f2390a[i2] == i) {
                int[] iArr = this.f2391b;
                iArr[i2] = iArr[i2] + 1;
                return;
            }
        }
        this.f2390a[this.f2392c] = i;
        this.f2391b[this.f2392c] = 1;
        this.f2392c++;
    }

    /* JADX INFO: renamed from: b */
    public final int m1996b() {
        return this.f2392c;
    }
}
