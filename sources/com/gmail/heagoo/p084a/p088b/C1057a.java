package com.gmail.heagoo.p084a.p088b;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.gmail.heagoo.a.b.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1057a extends AbstractC1058b {

    /* JADX INFO: renamed from: a */
    private byte[] f2795a;

    /* JADX INFO: renamed from: b */
    private AbstractC1058b f2796b;

    public C1057a(AbstractC1058b abstractC1058b) {
        this.f2796b = abstractC1058b;
        this.f2795a = null;
    }

    public C1057a(byte[] bArr) {
        this.f2796b = null;
        this.f2795a = bArr;
    }

    @Override // com.gmail.heagoo.p084a.p088b.AbstractC1058b
    /* JADX INFO: renamed from: a */
    public final int mo2420a() {
        return this.f2796b == null ? this.f2795a.length : this.f2796b.m2423b();
    }

    @Override // com.gmail.heagoo.p084a.p088b.AbstractC1058b
    /* JADX INFO: renamed from: a */
    public final void mo2421a(OutputStream outputStream) throws IOException {
        outputStream.write(160);
        m2422a(outputStream, mo2420a());
        if (this.f2796b == null) {
            outputStream.write(this.f2795a);
        } else {
            this.f2796b.mo2421a(outputStream);
        }
    }
}
