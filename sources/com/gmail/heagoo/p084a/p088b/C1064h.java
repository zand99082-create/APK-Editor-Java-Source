package com.gmail.heagoo.p084a.p088b;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.gmail.heagoo.a.b.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1064h extends AbstractC1058b {

    /* JADX INFO: renamed from: a */
    private String f2802a;

    public C1064h(String str) {
        this.f2802a = str;
    }

    @Override // com.gmail.heagoo.p084a.p088b.AbstractC1058b
    /* JADX INFO: renamed from: a */
    public final int mo2420a() {
        return this.f2802a.length();
    }

    @Override // com.gmail.heagoo.p084a.p088b.AbstractC1058b
    /* JADX INFO: renamed from: a */
    public final void mo2421a(OutputStream outputStream) throws IOException {
        outputStream.write(19);
        m2422a(outputStream, this.f2802a.length());
        outputStream.write(this.f2802a.getBytes());
    }
}
