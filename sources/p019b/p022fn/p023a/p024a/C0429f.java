package p019b.p022fn.p023a.p024a;

import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* JADX INFO: renamed from: b.fn.a.a.f */
/* JADX INFO: loaded from: classes.dex */
public class C0429f extends ZipOutputStream {

    /* JADX INFO: renamed from: a */
    private b f486a;

    /* JADX INFO: renamed from: b */
    private int f487b;

    /* JADX INFO: renamed from: b.fn.a.a.f$b */
    private static class b extends OutputStream {

        /* JADX INFO: renamed from: a */
        private OutputStream f488a;

        /* JADX INFO: renamed from: b */
        private long f489b;

        private b(OutputStream outputStream) {
            this.f489b = 0L;
            this.f488a = outputStream;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public long m411c() {
            return this.f489b;
        }

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
            this.f488a.write(i);
            this.f489b++;
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f488a.write(bArr);
            this.f489b += (long) bArr.length;
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            this.f488a.write(bArr, i, i2);
            this.f489b += (long) i2;
        }
    }

    private C0429f(b bVar, int i) {
        super(bVar);
        this.f487b = i;
    }

    /* JADX INFO: renamed from: a */
    public static C0429f m408a(OutputStream outputStream, int i) {
        b bVar = new b(outputStream);
        C0429f c0429f = new C0429f(bVar, i);
        c0429f.f486a = bVar;
        return c0429f;
    }

    /* JADX INFO: renamed from: a */
    public void m409a(int i) {
        this.f487b = i;
    }

    @Override // java.util.zip.ZipOutputStream
    public void putNextEntry(ZipEntry zipEntry) throws IOException {
        if (zipEntry.getMethod() == 0) {
            zipEntry.setExtra(new byte[(int) (((long) this.f487b) - ((this.f486a.m411c() + ((long) (zipEntry.getName().getBytes().length + 30))) % ((long) this.f487b)))]);
        }
        super.putNextEntry(zipEntry);
    }
}
