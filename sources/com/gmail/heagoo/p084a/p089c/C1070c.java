package com.gmail.heagoo.p084a.p089c;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.gmail.heagoo.a.c.c */
/* JADX INFO: loaded from: classes.dex */
final class C1070c extends OutputStream {

    /* JADX INFO: renamed from: a */
    private long f2821a = 0;

    /* JADX INFO: renamed from: b */
    private OutputStream f2822b;

    public C1070c(OutputStream outputStream) {
        this.f2822b = outputStream;
    }

    /* JADX INFO: renamed from: a */
    public final long m2575a() {
        return this.f2821a;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f2822b.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f2822b.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.f2822b.write(i);
        this.f2821a++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f2822b.write(bArr, i, i2);
        this.f2821a += (long) i2;
    }
}
