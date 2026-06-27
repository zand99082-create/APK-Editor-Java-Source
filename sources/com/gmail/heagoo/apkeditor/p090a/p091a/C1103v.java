package com.gmail.heagoo.apkeditor.p090a.p091a;

import com.github.megatronking.stringfog.xor.StringFogImpl;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import p000a.p001a.p003b.p006b.C0056n;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.a.a.v */
/* JADX INFO: loaded from: classes.dex */
public final class C1103v {

    /* JADX INFO: renamed from: a */
    private static final CharsetDecoder f3243a = Charset.forName("UTF-16LE").newDecoder();

    /* JADX INFO: renamed from: b */
    private static final CharsetDecoder f3244b = Charset.forName(StringFogImpl.CHARSET_NAME_UTF_8).newDecoder();

    /* JADX INFO: renamed from: c */
    private C1102u f3245c;

    /* JADX INFO: renamed from: d */
    private byte[] f3246d;

    /* JADX INFO: renamed from: e */
    private int f3247e;

    /* JADX INFO: renamed from: f */
    private int f3248f;

    /* JADX INFO: renamed from: g */
    private int f3249g;

    /* JADX INFO: renamed from: h */
    private int f3250h;

    /* JADX INFO: renamed from: i */
    private int f3251i;

    /* JADX INFO: renamed from: j */
    private int f3252j;

    /* JADX INFO: renamed from: k */
    private boolean f3253k;

    /* JADX INFO: renamed from: l */
    private int[] f3254l;

    /* JADX INFO: renamed from: m */
    private int[] f3255m;

    /* JADX INFO: renamed from: n */
    private int f3256n = 0;

    public C1103v(C1102u c1102u, byte[] bArr) {
        this.f3245c = c1102u;
        this.f3246d = bArr;
        this.f3247e = c1102u.f3241a;
        this.f3248f = m2988a(bArr, 0);
        this.f3249g = m2988a(bArr, 4);
        this.f3250h = m2988a(bArr, 8);
        this.f3251i = m2988a(bArr, 12);
        this.f3252j = m2988a(bArr, 16);
        this.f3253k = (this.f3250h & 256) != 0;
        this.f3254l = new int[this.f3248f];
        int i = 20;
        for (int i2 = 0; i2 < this.f3248f; i2++) {
            this.f3254l[i2] = m2988a(bArr, i);
            i += 4;
        }
        if (this.f3249g != 0) {
            this.f3255m = new int[this.f3249g];
            for (int i3 = 0; i3 < this.f3249g; i3++) {
                this.f3255m[i3] = m2988a(bArr, i);
                i += 4;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static int m2988a(byte[] bArr, int i) {
        return (bArr[i + 3] << 24) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    /* JADX INFO: renamed from: a */
    private String m2989a(int i, int i2) {
        try {
            return (this.f3253k ? f3244b : f3243a).decode(ByteBuffer.wrap(this.f3246d, i, i2)).toString();
        } catch (Exception e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m2990a(int i, int i2, int i3, byte[] bArr) {
        int i4;
        this.f3247e += bArr.length - i3;
        if (this.f3247e % 4 != 0) {
            i4 = 4 - (this.f3247e % 4);
            this.f3247e += i4;
        } else {
            i4 = 0;
        }
        int length = bArr.length - i3;
        this.f3245c.m2985a(this.f3247e);
        if (this.f3252j > 0 && this.f3249g > 0) {
            this.f3252j += length + i4;
            m2991a(this.f3246d, 16, this.f3252j);
        }
        int i5 = ((i + 1) << 2) + 20;
        for (int i6 = i + 1; i6 < this.f3248f; i6++) {
            int[] iArr = this.f3254l;
            iArr[i6] = iArr[i6] + length;
            m2991a(this.f3246d, i5, this.f3254l[i6]);
            i5 += 4;
        }
        byte[] bArr2 = new byte[this.f3246d.length + length + i4];
        System.arraycopy(this.f3246d, 0, bArr2, 0, i2);
        System.arraycopy(bArr, 0, bArr2, i2, bArr.length);
        if (this.f3252j > 0) {
            int i7 = ((this.f3252j - length) - i4) - 8;
            System.arraycopy(this.f3246d, i2 + i3, bArr2, bArr.length + i2, (i7 - i2) - i3);
            System.arraycopy(this.f3246d, i7, bArr2, i7 + length + i4, this.f3246d.length - i7);
        } else {
            System.arraycopy(this.f3246d, i2 + i3, bArr2, bArr.length + i2, (this.f3246d.length - i2) - i3);
        }
        this.f3246d = bArr2;
        this.f3256n = i4 + length + this.f3256n;
    }

    /* JADX INFO: renamed from: a */
    private static void m2991a(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) i2;
        bArr[i + 1] = (byte) (i2 >> 8);
        bArr[i + 2] = (byte) (i2 >> 16);
        bArr[i + 3] = (byte) (i2 >>> 24);
    }

    /* JADX INFO: renamed from: a */
    private byte[] m2992a(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-16LE");
            while (bytes.length > 32767) {
                str = str.substring(0, str.length() - 1);
                bytes = str.getBytes("UTF-16LE");
            }
            int length = str.length();
            byte[] bArr = new byte[bytes.length + 4];
            bArr[0] = (byte) length;
            bArr[1] = (byte) (length >> 8);
            System.arraycopy(bytes, 0, bArr, 2, bytes.length);
            bArr[bytes.length + 2] = 0;
            bArr[bytes.length + 3] = 0;
            return bArr;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    private static byte[] m2993b(String str) {
        try {
            byte[] bytes = str.getBytes(StringFogImpl.CHARSET_NAME_UTF_8);
            while (bytes.length >= 128) {
                str = str.substring(0, str.length() - 1);
                bytes = str.getBytes(StringFogImpl.CHARSET_NAME_UTF_8);
            }
            int length = str.length();
            int length2 = bytes.length;
            byte[] bArr = new byte[length2 + 3];
            bArr[0] = (byte) length;
            bArr[1] = (byte) length2;
            System.arraycopy(bytes, 0, bArr, 2, length2);
            bArr[length2 + 2] = 0;
            return bArr;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m2994a() {
        return this.f3256n;
    }

    /* JADX INFO: renamed from: a */
    public final void m2995a(OutputStream outputStream) throws IOException {
        this.f3245c.m2987a(outputStream);
        outputStream.write(this.f3246d);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2996a(String str, String str2, String str3, String str4) {
        boolean z;
        int i;
        int i2;
        int i3;
        boolean z2 = false;
        for (int i4 = 0; i4 < this.f3248f; i4++) {
            if (i4 >= 0) {
                int i5 = this.f3254l[i4];
                if (this.f3253k) {
                    int i6 = (i5 + this.f3251i) - 8;
                    int[] iArrM149a = C0056n.m149a(this.f3246d, i6);
                    i2 = iArrM149a[0];
                    i = i2 - i6;
                    i3 = iArrM149a[1];
                } else {
                    int[] iArrM150b = C0056n.m150b(this.f3246d, (this.f3251i + i5) - 8);
                    i = iArrM150b[0];
                    i2 = ((i5 + this.f3251i) - 8) + i;
                    i3 = iArrM150b[1];
                }
                String strM2989a = m2989a(i2, i3);
                if (strM2989a != null) {
                    String str5 = null;
                    if (strM2989a.equals(str) && str2 != null) {
                        str5 = str2;
                    } else if (strM2989a.startsWith(str3) && str4 != null) {
                        str5 = str4 + strM2989a.substring(str3.length());
                    }
                    if (str5 != null) {
                        m2990a(i4, i2 - i, i + i3 + (this.f3253k ? 1 : 2), this.f3253k ? m2993b(str5) : m2992a(str5));
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
            if (z) {
                z2 = true;
            }
        }
        return z2;
    }
}
