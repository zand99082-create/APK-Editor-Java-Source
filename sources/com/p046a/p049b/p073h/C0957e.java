package com.p046a.p049b.p073h;

import java.io.InputStream;

/* JADX INFO: renamed from: com.a.b.h.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0957e extends InputStream {

    /* JADX INFO: renamed from: a */
    private int f2564a = 0;

    /* JADX INFO: renamed from: b */
    private int f2565b = 0;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ C0955c f2566c;

    public C0957e(C0955c c0955c) {
        this.f2566c = c0955c;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f2566c.f2563c - this.f2564a;
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f2565b = this.f2564a;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f2564a >= this.f2566c.f2563c) {
            return -1;
        }
        int iM2218h = this.f2566c.m2218h(this.f2564a);
        this.f2564a++;
        return iM2218h;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (i + i2 > bArr.length) {
            i2 = bArr.length - i;
        }
        int i3 = this.f2566c.f2563c - this.f2564a;
        if (i2 > i3) {
            i2 = i3;
        }
        System.arraycopy(this.f2566c.f2561a, this.f2564a + this.f2566c.f2562b, bArr, i, i2);
        this.f2564a += i2;
        return i2;
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.f2564a = this.f2565b;
    }
}
