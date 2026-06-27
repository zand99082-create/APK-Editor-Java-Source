package com.gmail.heagoo.apkeditor.p090a.p091a;

import com.github.megatronking.stringfog.xor.StringFogImpl;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.a.a.s */
/* JADX INFO: loaded from: classes.dex */
public final class C1100s {

    /* JADX INFO: renamed from: m */
    private static final CharsetDecoder f3216m = Charset.forName("UTF-16LE").newDecoder();

    /* JADX INFO: renamed from: n */
    private static final CharsetDecoder f3217n = Charset.forName(StringFogImpl.CHARSET_NAME_UTF_8).newDecoder();

    /* JADX INFO: renamed from: a */
    public int f3218a;

    /* JADX INFO: renamed from: b */
    int f3219b;

    /* JADX INFO: renamed from: c */
    int f3220c;

    /* JADX INFO: renamed from: d */
    String[] f3221d;

    /* JADX INFO: renamed from: f */
    private int f3223f;

    /* JADX INFO: renamed from: g */
    private int f3224g;

    /* JADX INFO: renamed from: h */
    private int f3225h;

    /* JADX INFO: renamed from: i */
    private boolean f3226i;

    /* JADX INFO: renamed from: j */
    private Object[] f3227j;

    /* JADX INFO: renamed from: e */
    private byte[] f3222e = new byte[28];

    /* JADX INFO: renamed from: k */
    private int[] f3228k = null;

    /* JADX INFO: renamed from: l */
    private int[] f3229l = null;

    /* JADX INFO: renamed from: o */
    private List f3230o = new ArrayList();

    /* JADX INFO: renamed from: a */
    private String m2967a(byte[] bArr, int i, int i2) {
        try {
            return (this.f3226i ? f3217n : f3216m).decode(ByteBuffer.wrap(bArr, i, i2)).toString();
        } catch (Exception e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m2968a(int i) {
        return i > 16383 ? new byte[]{(byte) ((i & 127) | 128), (byte) (((i >> 7) & 127) | 128), (byte) (i >> 14)} : i >= 128 ? new byte[]{(byte) ((i & 127) | 128), (byte) (i >> 7)} : new byte[]{(byte) i};
    }

    /* JADX INFO: renamed from: b */
    private static byte[] m2969b(String str) {
        byte[] bArr;
        UnsupportedEncodingException e;
        byte[] bytes;
        byte[] bArrM2968a;
        byte[] bArrM2968a2;
        try {
            bytes = str.getBytes(StringFogImpl.CHARSET_NAME_UTF_8);
            int length = str.length();
            int length2 = bytes.length;
            bArrM2968a = m2968a(length);
            bArrM2968a2 = m2968a(length2);
            bArr = new byte[bArrM2968a.length + bArrM2968a2.length + bytes.length + 1];
        } catch (UnsupportedEncodingException e2) {
            bArr = null;
            e = e2;
        }
        try {
            System.arraycopy(bArrM2968a, 0, bArr, 0, bArrM2968a.length);
            System.arraycopy(bArrM2968a2, 0, bArr, bArrM2968a.length, bArrM2968a2.length);
            System.arraycopy(bytes, 0, bArr, bArrM2968a2.length + bArrM2968a.length, bytes.length);
        } catch (UnsupportedEncodingException e3) {
            e = e3;
            e.printStackTrace();
        }
        return bArr;
    }

    /* JADX INFO: renamed from: c */
    private static byte[] m2970c(String str) {
        byte[] bArr;
        UnsupportedEncodingException e;
        int i;
        int i2 = 0;
        try {
            byte[] bytes = str.getBytes("UTF-16LE");
            int length = bytes.length;
            if (bytes.length >= 2 && (bytes[0] & 255) == 255 && (bytes[1] & 255) == 254) {
                i2 = 2;
                i = length - 2;
            } else {
                i = length;
            }
            bArr = new byte[i];
            try {
                System.arraycopy(bytes, i2, bArr, 0, i);
            } catch (UnsupportedEncodingException e2) {
                e = e2;
                e.printStackTrace();
            }
        } catch (UnsupportedEncodingException e3) {
            bArr = null;
            e = e3;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: d */
    private byte[] m2971d(String str) {
        return this.f3226i ? m2969b(str) : m2970c(str);
    }

    /* JADX INFO: renamed from: a */
    public final int m2972a(String str) {
        for (int i = 0; i < this.f3221d.length; i++) {
            if (this.f3221d[i].equals(str)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: a */
    public final List m2973a() {
        return this.f3230o;
    }

    /* JADX INFO: renamed from: a */
    public final void m2974a(int i, String str) {
        byte[] bArrM2971d = m2971d(str);
        this.f3221d[i] = str;
        this.f3227j[i] = bArrM2971d;
    }

    /* JADX INFO: renamed from: a */
    public final void m2975a(C1093l c1093l) throws IOException {
        byte[] bArr;
        int[] iArr = new int[this.f3219b];
        int i = 0;
        for (int i2 = 0; i2 < this.f3219b; i2++) {
            iArr[i2] = i;
            int length = ((byte[]) this.f3227j[i2]).length;
            i = this.f3226i ? i + length : i + (length / 2 <= 32767 ? 2 : 4) + length + 2;
        }
        this.f3218a = (this.f3229l != null ? this.f3229l.length : 0) + (this.f3223f > 0 ? this.f3223f << 2 : 0) + (this.f3219b << 2) + 28 + i;
        int i3 = (4 - (this.f3218a % 4)) % 4;
        this.f3218a += i3;
        C1086e.m2935a(this.f3222e, 4, this.f3218a);
        if (this.f3224g > 0) {
            this.f3224g = this.f3218a - this.f3229l.length;
            C1086e.m2935a(this.f3222e, 24, this.f3224g);
        }
        c1093l.m2944a(this.f3222e);
        c1093l.m2946a(iArr);
        if (this.f3223f > 0) {
            c1093l.m2946a(this.f3228k);
        }
        for (int i4 = 0; i4 < this.f3219b; i4++) {
            byte[] bArr2 = (byte[]) this.f3227j[i4];
            if (this.f3226i) {
                c1093l.m2945a(bArr2, 0, bArr2.length);
            } else {
                int length2 = bArr2.length / 2;
                if (length2 > 32767) {
                    bArr = new byte[4];
                    C1086e.m2937b(bArr, 0, (length2 >> 15) & 32767);
                    C1086e.m2937b(bArr, 2, length2 & 32767);
                } else {
                    bArr = new byte[2];
                    C1086e.m2937b(bArr, 0, length2);
                }
                c1093l.m2944a(bArr);
                c1093l.m2945a(bArr2, 0, bArr2.length);
                c1093l.m2948b(0);
            }
        }
        if (i3 > 0) {
            switch (i3) {
                case 1:
                    c1093l.m2944a(new byte[]{0});
                    break;
                case 2:
                    c1093l.m2948b(0);
                    break;
                case 3:
                    c1093l.m2944a(new byte[]{0, 0, 0});
                    break;
            }
        }
        if (this.f3229l != null) {
            c1093l.m2946a(this.f3229l);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2976a(C1094m c1094m) {
        int i;
        int i2;
        c1094m.m2950a(this.f3222e);
        this.f3218a = C1086e.m2929a(this.f3222e, 4);
        this.f3219b = C1086e.m2929a(this.f3222e, 8);
        this.f3223f = C1086e.m2929a(this.f3222e, 12);
        this.f3225h = C1086e.m2929a(this.f3222e, 16);
        this.f3220c = C1086e.m2929a(this.f3222e, 20);
        this.f3224g = C1086e.m2929a(this.f3222e, 24);
        this.f3226i = (this.f3225h & 256) != 0;
        int[] iArr = new int[this.f3219b];
        this.f3221d = new String[this.f3219b];
        c1094m.m2952a(iArr);
        if (this.f3223f != 0) {
            this.f3228k = new int[this.f3223f];
            c1094m.m2952a(this.f3228k);
        }
        int i3 = this.f3220c - (((this.f3219b * 4) + 28) + (this.f3223f * 4));
        new Object[1][0] = Integer.valueOf(i3);
        if (i3 > 0 && i3 > 0) {
            c1094m.f3192b.skip(i3);
            c1094m.f3191a = i3 + c1094m.f3191a;
        }
        byte[] bArr = new byte[(this.f3224g == 0 ? this.f3218a : this.f3224g) - this.f3220c];
        c1094m.m2950a(bArr);
        if (this.f3224g > 0) {
            int i4 = this.f3218a - this.f3224g;
            this.f3229l = new int[i4 / 4];
            c1094m.m2952a(this.f3229l);
            int i5 = i4 % 4;
            if (i5 > 0) {
                while (true) {
                    int i6 = i5 - 1;
                    if (i5 <= 0) {
                        break;
                    }
                    c1094m.f3192b.read();
                    c1094m.f3191a++;
                    i5 = i6;
                }
            }
        }
        this.f3227j = new Object[iArr.length];
        Object[] objArr = this.f3227j;
        String[] strArr = this.f3221d;
        for (int i7 = 0; i7 < iArr.length; i7++) {
            int i8 = iArr[i7];
            if (this.f3226i) {
                int i9 = (bArr[i8] & 128) != 0 ? i8 + 2 : i8 + 1;
                int i10 = (bArr[i9] & 128) != 0 ? i9 + 2 : i9 + 1;
                int i11 = 0;
                while (bArr[i10 + i11] != 0) {
                    i11++;
                }
                int[] iArr2 = {i10, i11};
                int i12 = iArr2[0] - i8;
                i = iArr2[0];
                i2 = iArr2[1];
                objArr[i7] = new byte[i2 + i12 + 1];
                System.arraycopy(bArr, i - i12, objArr[i7], 0, i12 + i2);
            } else {
                int i13 = (bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8);
                int[] iArr3 = i13 == 32768 ? new int[]{4, (((bArr[i8 + 3] & 255) << 8) + (bArr[i8 + 2] & 255)) << 1} : new int[]{2, i13 << 1};
                i = iArr3[0] + i8;
                i2 = iArr3[1];
                objArr[i7] = new byte[i2];
                System.arraycopy(bArr, i, objArr[i7], 0, i2);
            }
            strArr[i7] = m2967a(bArr, i, i2);
            Object[] objArr2 = {Integer.valueOf(i7), strArr[i7]};
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2977a(String str, int i) {
        new StringBuilder("StringChunk.addString: ").append(str).append(", ").append(i);
        this.f3218a = ((str.length() + 2) << 1) + 4 + this.f3218a;
        this.f3219b++;
        this.f3220c += 4;
        C1086e.m2935a(this.f3222e, 4, this.f3218a);
        C1086e.m2935a(this.f3222e, 8, this.f3219b);
        C1086e.m2935a(this.f3222e, 20, this.f3220c);
        String[] strArr = new String[this.f3219b];
        Object[] objArr = new Object[this.f3219b];
        int i2 = 0;
        for (int i3 = 0; i3 < this.f3219b; i3++) {
            if (i3 != i) {
                strArr[i3] = this.f3221d[i2];
                objArr[i3] = this.f3227j[i2];
                i2++;
            } else {
                strArr[i3] = str;
                objArr[i3] = m2971d(str);
            }
        }
        this.f3221d = strArr;
        this.f3227j = objArr;
        this.f3230o.add(0, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: b */
    public final String m2978b(int i) {
        if (i < 0 || i >= this.f3221d.length) {
            return null;
        }
        return this.f3221d[i];
    }

    /* JADX INFO: renamed from: b */
    public final int[] m2979b() {
        int i = 0;
        int length = this.f3221d.length - this.f3230o.size();
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            if (this.f3230o.contains(Integer.valueOf(i2))) {
                i++;
            }
            iArr[i2] = i2 + i;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: c */
    public final int m2980c() {
        return this.f3221d.length;
    }
}
