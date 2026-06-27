package com.p046a.p049b.p073h;

/* JADX INFO: renamed from: com.a.b.h.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0955c {

    /* JADX INFO: renamed from: a */
    private final byte[] f2561a;

    /* JADX INFO: renamed from: b */
    private final int f2562b;

    /* JADX INFO: renamed from: c */
    private final int f2563c;

    public C0955c(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    private C0955c(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("bytes == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("start < 0");
        }
        if (i2 < i) {
            throw new IllegalArgumentException("end < start");
        }
        if (i2 > bArr.length) {
            throw new IllegalArgumentException("end > bytes.length");
        }
        this.f2561a = bArr;
        this.f2562b = i;
        this.f2563c = i2 - i;
    }

    /* JADX INFO: renamed from: b */
    private void m2214b(int i, int i2) {
        if (i < 0 || i2 < i || i2 > this.f2563c) {
            throw new IllegalArgumentException("bad range: " + i + ".." + i2 + "; actual size " + this.f2563c);
        }
    }

    /* JADX INFO: renamed from: g */
    private int m2217g(int i) {
        return this.f2561a[this.f2562b + i];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public int m2218h(int i) {
        return this.f2561a[this.f2562b + i] & 255;
    }

    /* JADX INFO: renamed from: a */
    public final int m2219a() {
        return this.f2563c;
    }

    /* JADX INFO: renamed from: a */
    public final int m2220a(int i) {
        m2214b(i, i + 1);
        return m2217g(i);
    }

    /* JADX INFO: renamed from: a */
    public final C0955c m2221a(int i, int i2) {
        m2214b(i, i2);
        return new C0955c(this.f2561a, this.f2562b + i, this.f2562b + i2);
    }

    /* JADX INFO: renamed from: a */
    public final void m2222a(byte[] bArr, int i) {
        if (bArr.length - i < this.f2563c) {
            throw new IndexOutOfBoundsException("(out.length - offset) < size()");
        }
        System.arraycopy(this.f2561a, this.f2562b, bArr, i, this.f2563c);
    }

    /* JADX INFO: renamed from: b */
    public final int m2223b(int i) {
        m2214b(i, i + 2);
        return (m2217g(i) << 8) | m2218h(i + 1);
    }

    /* JADX INFO: renamed from: b */
    public final C0956d m2224b() {
        return new C0956d(new C0957e(this));
    }

    /* JADX INFO: renamed from: c */
    public final int m2225c(int i) {
        m2214b(i, i + 4);
        return (m2217g(i) << 24) | (m2218h(i + 1) << 16) | (m2218h(i + 2) << 8) | m2218h(i + 3);
    }

    /* JADX INFO: renamed from: d */
    public final long m2226d(int i) {
        m2214b(i, i + 8);
        return (((long) ((((m2217g(i) << 24) | (m2218h(i + 1) << 16)) | (m2218h(i + 2) << 8)) | m2218h(i + 3))) << 32) | (((long) ((m2217g(i + 4) << 24) | (m2218h(i + 5) << 16) | (m2218h(i + 6) << 8) | m2218h(i + 7))) & 4294967295L);
    }

    /* JADX INFO: renamed from: e */
    public final int m2227e(int i) {
        m2214b(i, i + 1);
        return m2218h(i);
    }

    /* JADX INFO: renamed from: f */
    public final int m2228f(int i) {
        m2214b(i, i + 2);
        return (m2218h(i) << 8) | m2218h(i + 1);
    }
}
