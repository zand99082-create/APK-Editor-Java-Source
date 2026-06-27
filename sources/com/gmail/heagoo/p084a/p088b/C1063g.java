package com.gmail.heagoo.p084a.p088b;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.gmail.heagoo.a.b.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1063g extends AbstractC1058b {

    /* JADX INFO: renamed from: a */
    private byte[] f2801a;

    public C1063g(byte[] bArr) {
        this.f2801a = bArr;
    }

    @Override // com.gmail.heagoo.p084a.p088b.AbstractC1058b
    /* JADX INFO: renamed from: a */
    public final int mo2420a() {
        return this.f2801a.length;
    }

    @Override // com.gmail.heagoo.p084a.p088b.AbstractC1058b
    /* JADX INFO: renamed from: a */
    public final void mo2421a(OutputStream outputStream) throws IOException {
        outputStream.write(4);
        m2422a(outputStream, this.f2801a.length);
        outputStream.write(this.f2801a);
    }
}
