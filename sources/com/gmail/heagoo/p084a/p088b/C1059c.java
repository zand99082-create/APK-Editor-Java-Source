package com.gmail.heagoo.p084a.p088b;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.gmail.heagoo.a.b.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1059c extends AbstractC1058b {

    /* JADX INFO: renamed from: a */
    private String f2797a;

    public C1059c(String str) {
        this.f2797a = str;
    }

    @Override // com.gmail.heagoo.p084a.p088b.AbstractC1058b
    /* JADX INFO: renamed from: a */
    public final int mo2420a() {
        return this.f2797a.length();
    }

    @Override // com.gmail.heagoo.p084a.p088b.AbstractC1058b
    /* JADX INFO: renamed from: a */
    public final void mo2421a(OutputStream outputStream) throws IOException {
        outputStream.write(22);
        m2422a(outputStream, this.f2797a.length());
        outputStream.write(this.f2797a.getBytes());
    }
}
