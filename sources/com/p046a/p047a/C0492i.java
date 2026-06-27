package com.p046a.p047a;

import com.gmail.heagoo.p084a.p089c.C1067a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.zip.Adler32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: com.a.a.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0492i {

    /* JADX INFO: renamed from: a */
    static final short[] f713a = new short[0];

    /* JADX INFO: renamed from: b */
    private ByteBuffer f714b;

    /* JADX INFO: renamed from: c */
    private final C0509z f715c;

    /* JADX INFO: renamed from: d */
    private int f716d;

    /* JADX INFO: renamed from: e */
    private final C0499p f717e;

    /* JADX INFO: renamed from: f */
    private final C0500q f718f;

    /* JADX INFO: renamed from: g */
    private final C0501r f719g;

    /* JADX INFO: renamed from: h */
    private final C0497n f720h;

    /* JADX INFO: renamed from: i */
    private final C0495l f721i;

    /* JADX INFO: renamed from: j */
    private final C0496m f722j;

    public C0492i(int i) {
        byte b2 = 0;
        this.f715c = new C0509z();
        this.f716d = 0;
        this.f717e = new C0499p(this, b2);
        this.f718f = new C0500q(this, b2);
        this.f719g = new C0501r(this, b2);
        this.f720h = new C0497n(this, b2);
        this.f721i = new C0495l(this, b2);
        this.f722j = new C0496m(this, b2);
        this.f714b = ByteBuffer.wrap(new byte[i]);
        this.f714b.order(ByteOrder.LITTLE_ENDIAN);
    }

    public C0492i(File file) throws IOException {
        byte b2 = 0;
        this.f715c = new C0509z();
        this.f716d = 0;
        this.f717e = new C0499p(this, b2);
        this.f718f = new C0500q(this, b2);
        this.f719g = new C0501r(this, b2);
        this.f720h = new C0497n(this, b2);
        this.f721i = new C0495l(this, b2);
        this.f722j = new C0496m(this, b2);
        if (!C1067a.m2537g(file.getName())) {
            if (!file.getName().endsWith(".dex")) {
                throw new C0502s("unknown output extension: " + file);
            }
            m610a(new FileInputStream(file));
        } else {
            ZipFile zipFile = new ZipFile(file);
            ZipEntry entry = zipFile.getEntry("classes.dex");
            if (entry == null) {
                throw new C0502s("Expected classes.dex in " + file);
            }
            m610a(zipFile.getInputStream(entry));
            zipFile.close();
        }
    }

    private C0492i(ByteBuffer byteBuffer) {
        byte b2 = 0;
        this.f715c = new C0509z();
        this.f716d = 0;
        this.f717e = new C0499p(this, b2);
        this.f718f = new C0500q(this, b2);
        this.f719g = new C0501r(this, b2);
        this.f720h = new C0497n(this, b2);
        this.f721i = new C0495l(this, b2);
        this.f722j = new C0496m(this, b2);
        this.f714b = byteBuffer;
        this.f714b.order(ByteOrder.LITTLE_ENDIAN);
        this.f715c.m704a(this);
    }

    public C0492i(byte[] bArr) {
        this(ByteBuffer.wrap(bArr));
    }

    /* JADX INFO: renamed from: a */
    private void m610a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                inputStream.close();
                this.f714b = ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
                this.f714b.order(ByteOrder.LITTLE_ENDIAN);
                this.f715c.m704a(this);
                return;
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static void m612b(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index:" + i + ", length=" + i2);
        }
    }

    /* JADX INFO: renamed from: m */
    private byte[] m613m() {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            byte[] bArr = new byte[8192];
            ByteBuffer byteBufferDuplicate = this.f714b.duplicate();
            byteBufferDuplicate.limit(byteBufferDuplicate.capacity());
            byteBufferDuplicate.position(32);
            while (byteBufferDuplicate.hasRemaining()) {
                int iMin = Math.min(8192, byteBufferDuplicate.remaining());
                byteBufferDuplicate.get(bArr, 0, iMin);
                messageDigest.update(bArr, 0, iMin);
            }
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: a */
    public final C0485b m614a(C0488e c0488e) {
        int iM593i = c0488e.m593i();
        if (iM593i == 0) {
            throw new IllegalArgumentException("offset == 0");
        }
        return C0498o.m633a(m616a(iM593i));
    }

    /* JADX INFO: renamed from: a */
    public final C0489f m615a(C0487d c0487d) {
        int iM584c = c0487d.m584c();
        if (iM584c == 0) {
            throw new IllegalArgumentException("offset == 0");
        }
        return C0498o.m634b(m616a(iM584c));
    }

    /* JADX INFO: renamed from: a */
    public final C0498o m616a(int i) {
        if (i < 0 || i >= this.f714b.capacity()) {
            throw new IllegalArgumentException("position=" + i + " length=" + this.f714b.capacity());
        }
        ByteBuffer byteBufferDuplicate = this.f714b.duplicate();
        byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferDuplicate.position(i);
        byteBufferDuplicate.limit(this.f714b.capacity());
        return new C0498o(this, "section", byteBufferDuplicate, (byte) 0);
    }

    /* JADX INFO: renamed from: a */
    public final C0498o m617a(int i, String str) {
        if ((i & 3) != 0) {
            throw new IllegalStateException("Not four byte aligned!");
        }
        int i2 = this.f716d + i;
        ByteBuffer byteBufferDuplicate = this.f714b.duplicate();
        byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferDuplicate.position(this.f716d);
        byteBufferDuplicate.limit(i2);
        C0498o c0498o = new C0498o(this, str, byteBufferDuplicate, (byte) 0);
        this.f716d = i2;
        return c0498o;
    }

    /* JADX INFO: renamed from: a */
    public final C0509z m618a() {
        return this.f715c;
    }

    /* JADX INFO: renamed from: a */
    public final void m619a(OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        ByteBuffer byteBufferDuplicate = this.f714b.duplicate();
        byteBufferDuplicate.clear();
        while (byteBufferDuplicate.hasRemaining()) {
            int iMin = Math.min(8192, byteBufferDuplicate.remaining());
            byteBufferDuplicate.get(bArr, 0, iMin);
            outputStream.write(bArr, 0, iMin);
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m620b() {
        return this.f714b.capacity();
    }

    /* JADX INFO: renamed from: b */
    public final C0484ab m621b(int i) {
        return i == 0 ? C0484ab.f677a : m616a(i).m651e();
    }

    /* JADX INFO: renamed from: c */
    public final int m622c() {
        return this.f716d;
    }

    /* JADX INFO: renamed from: c */
    public final int m623c(int i) {
        m612b(i, this.f715c.f756c.f674b);
        return this.f714b.getInt(this.f715c.f756c.f675c + (i * 4));
    }

    /* JADX INFO: renamed from: d */
    public final byte[] m624d() {
        ByteBuffer byteBufferDuplicate = this.f714b.duplicate();
        byte[] bArr = new byte[byteBufferDuplicate.capacity()];
        byteBufferDuplicate.position(0);
        byteBufferDuplicate.get(bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: e */
    public final List m625e() {
        return this.f717e;
    }

    /* JADX INFO: renamed from: f */
    public final List m626f() {
        return this.f718f;
    }

    /* JADX INFO: renamed from: g */
    public final List m627g() {
        return this.f719g;
    }

    /* JADX INFO: renamed from: h */
    public final List m628h() {
        return this.f720h;
    }

    /* JADX INFO: renamed from: i */
    public final List m629i() {
        return this.f721i;
    }

    /* JADX INFO: renamed from: j */
    public final List m630j() {
        return this.f722j;
    }

    /* JADX INFO: renamed from: k */
    public final Iterable m631k() {
        return new C0493j(this, (byte) 0);
    }

    /* JADX INFO: renamed from: l */
    public final void m632l() {
        m616a(12).m644a(m613m());
        C0498o c0498oM616a = m616a(8);
        Adler32 adler32 = new Adler32();
        byte[] bArr = new byte[8192];
        ByteBuffer byteBufferDuplicate = this.f714b.duplicate();
        byteBufferDuplicate.limit(byteBufferDuplicate.capacity());
        byteBufferDuplicate.position(12);
        while (byteBufferDuplicate.hasRemaining()) {
            int iMin = Math.min(8192, byteBufferDuplicate.remaining());
            byteBufferDuplicate.get(bArr, 0, iMin);
            adler32.update(bArr, 0, iMin);
        }
        c0498oM616a.m654f((int) adler32.getValue());
    }
}
