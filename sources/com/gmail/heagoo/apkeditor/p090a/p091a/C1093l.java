package com.gmail.heagoo.apkeditor.p090a.p091a;

import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.a.a.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1093l {

    /* JADX INFO: renamed from: a */
    private RandomAccessFile f3189a;

    /* JADX INFO: renamed from: b */
    private int f3190b = 0;

    public C1093l(RandomAccessFile randomAccessFile) {
        this.f3189a = randomAccessFile;
    }

    /* JADX INFO: renamed from: a */
    public final int m2941a() {
        return this.f3190b;
    }

    /* JADX INFO: renamed from: a */
    public final void m2942a(int i) throws IOException {
        byte[] bArr = new byte[4];
        C1086e.m2935a(bArr, 0, i);
        this.f3189a.write(bArr);
        this.f3190b += 4;
    }

    /* JADX INFO: renamed from: a */
    public final void m2943a(int i, int i2) throws IOException {
        long filePointer = this.f3189a.getFilePointer();
        this.f3189a.seek(4L);
        m2942a(i2);
        this.f3189a.seek(filePointer);
    }

    /* JADX INFO: renamed from: a */
    public final void m2944a(byte[] bArr) throws IOException {
        this.f3189a.write(bArr);
        this.f3190b += bArr.length;
    }

    /* JADX INFO: renamed from: a */
    public final void m2945a(byte[] bArr, int i, int i2) throws IOException {
        this.f3189a.write(bArr, 0, i2);
        this.f3190b += i2;
    }

    /* JADX INFO: renamed from: a */
    public final void m2946a(int[] iArr) throws IOException {
        byte[] bArr = new byte[iArr.length * 4];
        for (int i = 0; i < iArr.length; i++) {
            C1086e.m2935a(bArr, i * 4, iArr[i]);
        }
        m2944a(bArr);
    }

    /* JADX INFO: renamed from: b */
    public final void m2947b() {
        this.f3189a.close();
    }

    /* JADX INFO: renamed from: b */
    public final void m2948b(int i) throws IOException {
        byte[] bArr = new byte[2];
        C1086e.m2937b(bArr, 0, 0);
        this.f3189a.write(bArr);
        this.f3190b += 2;
    }
}
