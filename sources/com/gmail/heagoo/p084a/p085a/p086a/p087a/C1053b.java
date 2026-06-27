package com.gmail.heagoo.p084a.p085a.p086a.p087a;

/* JADX INFO: renamed from: com.gmail.heagoo.a.a.a.a.b */
/* JADX INFO: loaded from: classes.dex */
class C1053b {

    /* JADX INFO: renamed from: a */
    private int[] f2780a = new int[32];

    /* JADX INFO: renamed from: b */
    private int f2781b;

    /* JADX INFO: renamed from: c */
    private int f2782c;

    /* JADX INFO: renamed from: d */
    private int f2783d;

    /* JADX INFO: renamed from: a */
    private final int m2390a(int i, boolean z) {
        if (this.f2781b == 0 || i < 0) {
            return -1;
        }
        int i2 = 0;
        for (int i3 = this.f2783d; i3 != 0; i3--) {
            int i4 = this.f2780a[i2];
            if (i < i4) {
                int i5 = (i << 1) + 1 + i2;
                if (!z) {
                    i5++;
                }
                return this.f2780a[i5];
            }
            i -= i4;
            i2 += (i4 << 1) + 2;
        }
        return -1;
    }

    /* JADX INFO: renamed from: e */
    private void m2391e(int i) {
        int length = this.f2780a.length - this.f2781b;
        if (length > 2) {
            return;
        }
        int[] iArr = new int[(length + this.f2780a.length) << 1];
        System.arraycopy(this.f2780a, 0, iArr, 0, this.f2781b);
        this.f2780a = iArr;
    }

    /* JADX INFO: renamed from: a */
    public final int m2392a(int i) {
        int i2 = 0;
        if (this.f2781b != 0 && i >= 0) {
            if (i > this.f2783d) {
                i = this.f2783d;
            }
            int i3 = 0;
            while (i != 0) {
                int i4 = this.f2780a[i3];
                i--;
                i3 = (i4 << 1) + 2 + i3;
                i2 += i4;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: a */
    public final void m2393a() {
        this.f2781b = 0;
        this.f2782c = 0;
        this.f2783d = 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m2394a(int i, int i2) {
        if (this.f2783d == 0) {
            m2401e();
        }
        m2391e(2);
        int i3 = this.f2781b - 1;
        int i4 = this.f2780a[i3];
        this.f2780a[(i3 - 1) - (i4 << 1)] = i4 + 1;
        this.f2780a[i3] = i;
        this.f2780a[i3 + 1] = i2;
        this.f2780a[i3 + 2] = i4 + 1;
        this.f2781b += 2;
        this.f2782c++;
    }

    /* JADX INFO: renamed from: b */
    public final int m2395b() {
        if (this.f2781b == 0) {
            return 0;
        }
        return this.f2780a[this.f2781b - 1];
    }

    /* JADX INFO: renamed from: b */
    public final int m2396b(int i) {
        return m2390a(i, true);
    }

    /* JADX INFO: renamed from: c */
    public final int m2397c(int i) {
        return m2390a(i, false);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m2398c() {
        int i;
        int i2;
        if (this.f2781b == 0 || (i2 = this.f2780a[this.f2781b - 1]) == 0) {
            return false;
        }
        int i3 = i2 - 1;
        int i4 = i - 2;
        this.f2780a[i4] = i3;
        this.f2780a[i4 - ((i3 << 1) + 1)] = i3;
        this.f2781b -= 2;
        this.f2782c--;
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final int m2399d() {
        return this.f2783d;
    }

    /* JADX INFO: renamed from: d */
    public final int m2400d(int i) {
        if (this.f2781b != 0) {
            int i2 = this.f2781b - 1;
            for (int i3 = this.f2783d; i3 != 0; i3--) {
                i2 -= 2;
                for (int i4 = this.f2780a[i2]; i4 != 0; i4--) {
                    if (this.f2780a[i2 + 1] == i) {
                        return this.f2780a[i2];
                    }
                    i2 -= 2;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: e */
    public final void m2401e() {
        m2391e(2);
        int i = this.f2781b;
        this.f2780a[i] = 0;
        this.f2780a[i + 1] = 0;
        this.f2781b += 2;
        this.f2783d++;
    }

    /* JADX INFO: renamed from: f */
    public final void m2402f() {
        if (this.f2781b == 0) {
            return;
        }
        int i = this.f2781b - 1;
        int i2 = this.f2780a[i];
        if ((i - 1) - (i2 << 1) != 0) {
            this.f2781b -= (i2 << 1) + 2;
            this.f2782c -= i2;
            this.f2783d--;
        }
    }
}
