package p019b.p022fn.p040c.p041a;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: b.fn.c.a.a */
/* JADX INFO: loaded from: classes.dex */
public class C0455a {

    /* JADX INFO: renamed from: a */
    private RandomAccessFile f583a;

    C0455a(File file) {
        this.f583a = new RandomAccessFile(file, "rw");
    }

    /* JADX INFO: renamed from: a */
    public final void m509a() throws IOException {
        this.f583a.close();
    }

    /* JADX INFO: renamed from: a */
    final void m510a(byte b2) throws IOException {
        m514a(new byte[]{(byte) (b2 & 255)});
    }

    /* JADX INFO: renamed from: a */
    final void m511a(int i) throws IOException {
        m512a(m515b() - ((long) i));
    }

    /* JADX INFO: renamed from: a */
    final void m512a(long j) throws IOException {
        this.f583a.seek(j);
    }

    /* JADX INFO: renamed from: a */
    final void m513a(short s) throws IOException {
        m514a(new byte[]{(byte) (s & 255), (byte) ((s >> 8) & 255)});
    }

    /* JADX INFO: renamed from: a */
    final void m514a(byte[] bArr) throws IOException {
        this.f583a.write(bArr);
    }

    /* JADX INFO: renamed from: b */
    final long m515b() {
        return this.f583a.getFilePointer();
    }

    /* JADX INFO: renamed from: b */
    final byte[] m516b(int i) throws IOException {
        byte[] bArr = new byte[i];
        this.f583a.read(bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: c */
    final byte m517c() {
        return this.f583a.readByte();
    }

    /* JADX INFO: renamed from: c */
    final int[] m518c(int i) {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = m519d();
        }
        return iArr;
    }

    /* JADX INFO: renamed from: d */
    final int m519d() {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(m516b(4));
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        return byteBufferWrap.getInt();
    }

    /* JADX INFO: renamed from: d */
    final void m520d(int i) throws IOException {
        m514a(new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255)});
    }

    /* JADX INFO: renamed from: e */
    final short m521e() {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(m516b(2));
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        return byteBufferWrap.getShort();
    }
}
