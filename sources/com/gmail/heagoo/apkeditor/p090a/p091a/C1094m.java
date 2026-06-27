package com.gmail.heagoo.apkeditor.p090a.p091a;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.a.a.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1094m {

    /* JADX INFO: renamed from: a */
    int f3191a = 0;

    /* JADX INFO: renamed from: b */
    InputStream f3192b;

    public C1094m(InputStream inputStream) {
        this.f3192b = inputStream;
    }

    /* JADX INFO: renamed from: a */
    public final int m2949a() throws IOException {
        byte[] bArr = new byte[4];
        this.f3192b.read(bArr);
        this.f3191a += 4;
        return C1086e.m2929a(bArr, 0);
    }

    /* JADX INFO: renamed from: a */
    public final void m2950a(byte[] bArr) {
        int i;
        int i2 = 0;
        while (i2 < bArr.length && (i = this.f3192b.read(bArr, i2, bArr.length - i2)) != -1) {
            if (i > 0) {
                this.f3191a += i;
                i2 += i;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2951a(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int i4 = this.f3192b.read(bArr, i3 + 8, i2 - i3);
            if (i4 == -1) {
                return;
            }
            if (i4 > 0) {
                this.f3191a += i4;
                i3 += i4;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2952a(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = m2949a();
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m2953b(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f3192b.read(bArr, 0, 4096);
        if (i3 > 0) {
            this.f3191a += i3;
        }
        return i3;
    }
}
