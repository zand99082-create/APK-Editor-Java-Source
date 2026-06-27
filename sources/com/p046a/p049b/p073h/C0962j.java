package com.p046a.p049b.p073h;

import java.util.Arrays;

/* JADX INFO: renamed from: com.a.b.h.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0962j extends C0968p {

    /* JADX INFO: renamed from: a */
    public static final C0962j f2577a;

    /* JADX INFO: renamed from: b */
    private int[] f2578b;

    /* JADX INFO: renamed from: c */
    private int f2579c;

    /* JADX INFO: renamed from: d */
    private boolean f2580d;

    static {
        C0962j c0962j = new C0962j(0);
        f2577a = c0962j;
        c0962j.mo811b_();
    }

    public C0962j() {
        this(4);
    }

    public C0962j(int i) {
        super(true);
        try {
            this.f2578b = new int[i];
            this.f2579c = 0;
            this.f2580d = true;
        } catch (NegativeArraySizeException e) {
            throw new IllegalArgumentException("size < 0");
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0962j m2244a(int i) {
        C0962j c0962j = new C0962j(1);
        c0962j.m2250c(i);
        c0962j.mo811b_();
        return c0962j;
    }

    /* JADX INFO: renamed from: a */
    public static C0962j m2245a(int i, int i2) {
        C0962j c0962j = new C0962j(2);
        c0962j.m2250c(i);
        c0962j.m2250c(i2);
        c0962j.mo811b_();
        return c0962j;
    }

    /* JADX INFO: renamed from: h */
    private void m2246h() {
        if (this.f2579c == this.f2578b.length) {
            int[] iArr = new int[((this.f2579c * 3) / 2) + 10];
            System.arraycopy(this.f2578b, 0, iArr, 0, this.f2579c);
            this.f2578b = iArr;
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m2247b() {
        return this.f2579c;
    }

    /* JADX INFO: renamed from: b */
    public final int m2248b(int i) {
        if (i >= this.f2579c) {
            throw new IndexOutOfBoundsException("n >= size()");
        }
        try {
            return this.f2578b[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException("n < 0");
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2249b(int i, int i2) {
        m2266l();
        if (i >= this.f2579c) {
            throw new IndexOutOfBoundsException("n >= size()");
        }
        try {
            this.f2578b[i] = i2;
            this.f2580d = false;
        } catch (ArrayIndexOutOfBoundsException e) {
            if (i < 0) {
                throw new IllegalArgumentException("n < 0");
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2250c(int i) {
        m2266l();
        m2246h();
        int[] iArr = this.f2578b;
        int i2 = this.f2579c;
        this.f2579c = i2 + 1;
        iArr[i2] = i;
        if (!this.f2580d || this.f2579c <= 1) {
            return;
        }
        this.f2580d = i >= this.f2578b[this.f2579c + (-2)];
    }

    /* JADX INFO: renamed from: c */
    public final void m2251c(int i, int i2) {
        if (i > this.f2579c) {
            throw new IndexOutOfBoundsException("n > size()");
        }
        m2246h();
        System.arraycopy(this.f2578b, i, this.f2578b, i + 1, this.f2579c - i);
        this.f2578b[i] = i2;
        this.f2579c++;
        this.f2580d = this.f2580d && (i == 0 || i2 > this.f2578b[i + (-1)]) && (i == this.f2579c + (-1) || i2 < this.f2578b[i + 1]);
    }

    /* JADX INFO: renamed from: d */
    public final int m2252d() {
        return m2248b(this.f2579c - 1);
    }

    /* JADX INFO: renamed from: d */
    public final void m2253d(int i) {
        if (i >= this.f2579c) {
            throw new IndexOutOfBoundsException("n >= size()");
        }
        System.arraycopy(this.f2578b, i + 1, this.f2578b, i, (this.f2579c - i) - 1);
        this.f2579c--;
    }

    /* JADX INFO: renamed from: e */
    public final int m2254e() {
        m2266l();
        this.f2579c--;
        return m2248b(this.f2579c - 1);
    }

    /* JADX INFO: renamed from: e */
    public final void m2255e(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("newSize < 0");
        }
        if (i > this.f2579c) {
            throw new IllegalArgumentException("newSize > size");
        }
        m2266l();
        this.f2579c = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0962j)) {
            return false;
        }
        C0962j c0962j = (C0962j) obj;
        if (this.f2580d != c0962j.f2580d || this.f2579c != c0962j.f2579c) {
            return false;
        }
        for (int i = 0; i < this.f2579c; i++) {
            if (this.f2578b[i] != c0962j.f2578b[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final int m2256f(int i) {
        int iM2258g = m2258g(i);
        if (iM2258g >= 0) {
            return iM2258g;
        }
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public final C0962j m2257f() {
        int i = this.f2579c;
        C0962j c0962j = new C0962j(i);
        for (int i2 = 0; i2 < i; i2++) {
            c0962j.m2250c(this.f2578b[i2]);
        }
        return c0962j;
    }

    /* JADX INFO: renamed from: g */
    public final int m2258g(int i) {
        int i2 = this.f2579c;
        if (!this.f2580d) {
            for (int i3 = 0; i3 < i2; i3++) {
                if (this.f2578b[i3] == i) {
                    return i3;
                }
            }
            return -i2;
        }
        int i4 = i2;
        int i5 = -1;
        while (i4 > i5 + 1) {
            int i6 = ((i4 - i5) >> 1) + i5;
            if (i <= this.f2578b[i6]) {
                i4 = i6;
            } else {
                i5 = i6;
            }
        }
        return i4 != i2 ? i != this.f2578b[i4] ? (-i4) - 1 : i4 : (-i2) - 1;
    }

    /* JADX INFO: renamed from: g */
    public final void m2259g() {
        m2266l();
        if (this.f2580d) {
            return;
        }
        Arrays.sort(this.f2578b, 0, this.f2579c);
        this.f2580d = true;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m2260h(int i) {
        return m2256f(i) >= 0;
    }

    public final int hashCode() {
        int i = 0;
        for (int i2 = 0; i2 < this.f2579c; i2++) {
            i = (i * 31) + this.f2578b[i2];
        }
        return i;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer((this.f2579c * 5) + 10);
        stringBuffer.append('{');
        for (int i = 0; i < this.f2579c; i++) {
            if (i != 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(this.f2578b[i]);
        }
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
