package com.gmail.heagoo.apkeditor.p090a.p091a;

import java.io.IOException;
import java.io.OutputStream;
import p000a.p001a.p003b.p004a.C0028b;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.a.a.u */
/* JADX INFO: loaded from: classes.dex */
final class C1102u {

    /* JADX INFO: renamed from: a */
    public int f3241a;

    /* JADX INFO: renamed from: b */
    private byte[] f3242b;

    C1102u() {
    }

    /* JADX INFO: renamed from: a */
    public final void m2985a(int i) {
        this.f3241a = i;
        byte[] bArr = this.f3242b;
        bArr[4] = (byte) i;
        bArr[5] = (byte) (i >> 8);
        bArr[6] = (byte) (i >> 16);
        bArr[7] = (byte) (i >>> 24);
    }

    /* JADX INFO: renamed from: a */
    public final void m2986a(C0028b c0028b) throws IOException {
        this.f3242b = new byte[8];
        c0028b.readFully(this.f3242b);
        byte[] bArr = this.f3242b;
        this.f3241a = (bArr[4] & 255) | (bArr[7] << 24) | ((bArr[6] & 255) << 16) | ((bArr[5] & 255) << 8);
    }

    /* JADX INFO: renamed from: a */
    public final void m2987a(OutputStream outputStream) throws IOException {
        outputStream.write(this.f3242b);
    }
}
