package com.gmail.heagoo.p084a.p088b;

import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;

/* JADX INFO: renamed from: com.gmail.heagoo.a.b.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1060d extends AbstractC1058b {

    /* JADX INFO: renamed from: a */
    private byte[] f2798a;

    /* JADX INFO: renamed from: b */
    private BigInteger f2799b;

    public C1060d(int i) {
        this.f2799b = BigInteger.valueOf(1L);
        this.f2798a = this.f2799b.toByteArray();
    }

    public C1060d(BigInteger bigInteger) {
        this.f2799b = bigInteger;
        this.f2798a = this.f2799b.toByteArray();
    }

    /* JADX INFO: renamed from: c */
    private boolean m2424c() {
        return this.f2799b.signum() > 0 && (this.f2798a[0] & 128) != 0;
    }

    @Override // com.gmail.heagoo.p084a.p088b.AbstractC1058b
    /* JADX INFO: renamed from: a */
    public final int mo2420a() {
        return !m2424c() ? this.f2798a.length : this.f2798a.length + 1;
    }

    @Override // com.gmail.heagoo.p084a.p088b.AbstractC1058b
    /* JADX INFO: renamed from: a */
    public final void mo2421a(OutputStream outputStream) throws IOException {
        outputStream.write(2);
        m2422a(outputStream, mo2420a());
        if (m2424c()) {
            outputStream.write(0);
        }
        outputStream.write(this.f2798a);
    }
}
