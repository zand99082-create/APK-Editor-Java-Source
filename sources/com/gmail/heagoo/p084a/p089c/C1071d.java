package com.gmail.heagoo.p084a.p089c;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.Signature;
import java.security.SignatureException;

/* JADX INFO: renamed from: com.gmail.heagoo.a.c.d */
/* JADX INFO: loaded from: classes.dex */
final class C1071d extends FilterOutputStream {

    /* JADX INFO: renamed from: a */
    private Signature f2823a;

    /* JADX INFO: renamed from: b */
    private int f2824b;

    public C1071d(OutputStream outputStream, Signature signature) {
        super(outputStream);
        this.f2823a = signature;
        this.f2824b = 0;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        try {
            this.f2823a.update((byte) i);
            super.write(i);
            this.f2824b++;
        } catch (SignatureException e) {
            throw new IOException("SignatureException: " + e);
        }
    }
}
