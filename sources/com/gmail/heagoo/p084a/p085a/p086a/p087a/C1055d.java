package com.gmail.heagoo.p084a.p085a.p086a.p087a;

import android.util.SparseArray;
import com.github.megatronking.stringfog.xor.StringFogImpl;
import com.gmail.heagoo.neweditor.Token;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

/* JADX INFO: renamed from: com.gmail.heagoo.a.a.a.a.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1055d {

    /* JADX INFO: renamed from: b */
    private int[] f2788b;

    /* JADX INFO: renamed from: c */
    private byte[] f2789c;

    /* JADX INFO: renamed from: d */
    private boolean f2790d;

    /* JADX INFO: renamed from: e */
    private int[] f2791e;

    /* JADX INFO: renamed from: a */
    private SparseArray f2787a = new SparseArray();

    /* JADX INFO: renamed from: f */
    private final CharsetDecoder f2792f = Charset.forName("UTF-16LE").newDecoder();

    /* JADX INFO: renamed from: g */
    private final CharsetDecoder f2793g = Charset.forName(StringFogImpl.CHARSET_NAME_UTF_8).newDecoder();

    private C1055d() {
    }

    /* JADX INFO: renamed from: a */
    private static final int m2411a(byte[] bArr, int i) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    /* JADX INFO: renamed from: a */
    public static C1055d m2412a(C1054c c1054c) throws IOException {
        m2414a(c1054c, 1835009, 0);
        int iM2409c = c1054c.m2409c();
        int iM2409c2 = c1054c.m2409c();
        int iM2409c3 = c1054c.m2409c();
        int iM2409c4 = c1054c.m2409c();
        int iM2409c5 = c1054c.m2409c();
        int iM2409c6 = c1054c.m2409c();
        C1055d c1055d = new C1055d();
        c1055d.f2790d = (iM2409c4 & 256) != 0;
        c1055d.f2788b = c1054c.m2407a(iM2409c2);
        c1055d.f2791e = new int[iM2409c2];
        for (int i = 0; i < iM2409c2; i++) {
            c1055d.f2791e[i] = -1;
        }
        if (iM2409c3 != 0) {
            c1054c.m2407a(iM2409c3);
        }
        c1055d.f2789c = new byte[(iM2409c6 == 0 ? iM2409c : iM2409c6) - iM2409c5];
        c1054c.m2406a(c1055d.f2789c);
        if (iM2409c6 != 0) {
            int i2 = iM2409c - iM2409c6;
            c1054c.m2407a(i2 / 4);
            int i3 = i2 % 4;
            if (i3 > 0) {
                while (true) {
                    int i4 = i3 - 1;
                    if (i3 <= 0) {
                        break;
                    }
                    c1054c.m2408b();
                    i3 = i4;
                }
            }
        }
        return c1055d;
    }

    /* JADX INFO: renamed from: a */
    private String m2413a(int i, int i2) {
        try {
            return (this.f2790d ? this.f2793g : this.f2792f).decode(ByteBuffer.wrap(this.f2789c, i, i2)).toString();
        } catch (Exception e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m2414a(C1054c c1054c, int i, int i2) throws IOException {
        int iM2409c = c1054c.m2409c();
        if (iM2409c == i2 || iM2409c < i) {
            m2414a(c1054c, i, -1);
        } else if (iM2409c != i) {
            throw new IOException(String.format("Expected: 0x%08x, actual: 0x%08x", Integer.valueOf(i), Integer.valueOf(iM2409c)));
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m2415a(String str) {
        if (str == null) {
            return -1;
        }
        for (int i = 0; i != this.f2788b.length; i++) {
            int i2 = this.f2788b[i];
            int iM2411a = m2411a(this.f2789c, i2);
            if (iM2411a == str.length()) {
                int i3 = i2;
                int i4 = 0;
                while (i4 != iM2411a) {
                    i3 += 2;
                    if (str.charAt(i4) != m2411a(this.f2789c, i3)) {
                        break;
                    }
                    i4++;
                }
                if (i4 == iM2411a) {
                    return i;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: a */
    public final String m2416a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        String str = (String) this.f2787a.get(i);
        if (str != null) {
            return str;
        }
        if (i < 0 || this.f2788b == null || i >= this.f2788b.length) {
            return null;
        }
        int i6 = this.f2788b[i];
        if (this.f2790d) {
            byte[] bArr = this.f2789c;
            int i7 = (bArr[i6] & 128) != 0 ? i6 + 2 : i6 + 1;
            byte b2 = bArr[i7];
            int i8 = i7 + 1;
            if ((b2 & 128) != 0) {
                i4 = (bArr[i8] & 255) + ((b2 & Token.END) << 8);
                i5 = i8 + 1;
            } else {
                i4 = b2;
                i5 = i8;
            }
            int[] iArr = {i5, i4};
            i2 = iArr[0];
            i3 = iArr[1];
        } else {
            byte[] bArr2 = this.f2789c;
            int i9 = ((bArr2[i6 + 1] & 255) << 8) | (bArr2[i6] & 255);
            int[] iArr2 = (32768 & i9) != 0 ? new int[]{4, (((i9 & 32767) << 16) + ((bArr2[i6 + 2] & 255) + ((bArr2[i6 + 3] & 255) << 8))) << 1} : new int[]{2, i9 << 1};
            i2 = i6 + iArr2[0];
            i3 = iArr2[1];
        }
        return m2413a(i2, i3);
    }
}
