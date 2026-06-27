package com.gmail.heagoo.p084a.p088b;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.gmail.heagoo.a.b.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1062f extends AbstractC1058b {

    /* JADX INFO: renamed from: a */
    private int[] f2800a;

    public C1062f(String str) {
        String[] strArrSplit = str.split("\\.");
        this.f2800a = new int[strArrSplit.length];
        for (int i = 0; i < strArrSplit.length; i++) {
            this.f2800a[i] = Integer.parseInt(strArrSplit[i]);
        }
    }

    @Override // com.gmail.heagoo.p084a.p088b.AbstractC1058b
    /* JADX INFO: renamed from: a */
    public final int mo2420a() {
        int i = 1;
        if (this.f2800a.length < 2 || this.f2800a[0] < 0 || this.f2800a[0] > 2 || this.f2800a[1] < 0 || this.f2800a[1] > 39) {
            throw new IllegalArgumentException("Object identifier out of range");
        }
        for (int i2 = 2; i2 < this.f2800a.length; i2++) {
            i = this.f2800a[i2] > 16384 ? i + 3 : this.f2800a[i2] > 128 ? i + 2 : i + 1;
        }
        return i;
    }

    @Override // com.gmail.heagoo.p084a.p088b.AbstractC1058b
    /* JADX INFO: renamed from: a */
    public final void mo2421a(OutputStream outputStream) throws IOException {
        int i;
        int i2;
        int i3 = 1;
        outputStream.write(6);
        int iMo2420a = mo2420a();
        m2422a(outputStream, mo2420a());
        byte[] bArr = new byte[iMo2420a];
        bArr[0] = (byte) ((this.f2800a[0] * 40) + this.f2800a[1]);
        for (int i4 = 2; i4 < this.f2800a.length; i4++) {
            int i5 = this.f2800a[i4];
            if (i5 >= 16384) {
                i = i3 + 1;
                bArr[i3] = (byte) ((i5 >> 14) | 128);
                i2 = i5 & 16383;
            } else {
                i = i3;
                i2 = i5;
            }
            if (i2 >= 128) {
                bArr[i] = (byte) ((i2 >> 7) | 128);
                i2 &= 127;
                i++;
            }
            int i6 = i2;
            i3 = i + 1;
            bArr[i] = (byte) i6;
        }
        outputStream.write(bArr);
    }
}
