package org.p107b.p108a;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: org.b.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1768a {

    /* JADX INFO: renamed from: a */
    private byte[] f5186a;

    /* JADX INFO: renamed from: b */
    private final int[] f5187b;

    /* JADX INFO: renamed from: c */
    private final String[] f5188c;

    /* JADX INFO: renamed from: d */
    private final int f5189d;

    /* JADX INFO: renamed from: e */
    private int f5190e;

    public C1768a(InputStream inputStream) {
        this(m4172a(inputStream));
    }

    private C1768a(byte[] bArr) {
        this(bArr, 0);
    }

    private C1768a(byte[] bArr, int i) {
        int iM4171a;
        this.f5186a = bArr;
        this.f5187b = new int[m4171a(8)];
        int length = this.f5187b.length;
        this.f5188c = new String[length];
        int i2 = 0;
        int i3 = 1;
        int i4 = 10;
        while (i3 < length) {
            this.f5187b[i3] = i4 + 1;
            switch (bArr[i4]) {
                case 1:
                    iM4171a = m4171a(i4 + 1) + 3;
                    if (iM4171a > i2) {
                        i2 = iM4171a;
                    }
                    break;
                case 2:
                case 7:
                case 8:
                default:
                    iM4171a = 3;
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 11:
                case 12:
                    iM4171a = 5;
                    break;
                case 5:
                case 6:
                    iM4171a = 9;
                    i3++;
                    break;
            }
            i3++;
            i4 = iM4171a + i4;
        }
        this.f5189d = i2;
        this.f5190e = i4;
    }

    /* JADX INFO: renamed from: a */
    private int m4171a(int i) {
        byte[] bArr = this.f5186a;
        return (bArr[i + 1] & 255) | ((bArr[i] & 255) << 8);
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m4172a(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            throw new IOException("Class not found");
        }
        byte[] bArr = new byte[inputStream.available()];
        int i = 0;
        while (true) {
            int i2 = inputStream.read(bArr, i, bArr.length - i);
            if (i2 == -1) {
                if (i >= bArr.length) {
                    return bArr;
                }
                byte[] bArr2 = new byte[i];
                System.arraycopy(bArr, 0, bArr2, 0, i);
                return bArr2;
            }
            int i3 = i2 + i;
            if (i3 == bArr.length) {
                int i4 = inputStream.read();
                if (i4 < 0) {
                    return bArr;
                }
                byte[] bArr3 = new byte[bArr.length + 1000];
                System.arraycopy(bArr, 0, bArr3, 0, i3);
                i = i3 + 1;
                bArr3[i3] = (byte) i4;
                bArr = bArr3;
            } else {
                i = i3;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m4173a() {
        int i = this.f5190e + 2;
        char[] cArr = new char[this.f5189d];
        int iM4171a = m4171a(this.f5187b[m4171a(i)]);
        String str = this.f5188c[iM4171a];
        if (str != null) {
            return str;
        }
        int i2 = this.f5187b[iM4171a];
        String[] strArr = this.f5188c;
        int i3 = i2 + 2;
        int iM4171a2 = i3 + m4171a(i2);
        byte[] bArr = this.f5186a;
        char c = 0;
        int i4 = 0;
        int i5 = i3;
        char c2 = 0;
        while (i5 < iM4171a2) {
            int i6 = i5 + 1;
            byte b2 = bArr[i5];
            switch (c) {
                case 0:
                    int i7 = b2 & 255;
                    if (i7 < 128) {
                        cArr[i4] = (char) i7;
                        i4++;
                        i5 = i6;
                    } else if (i7 >= 224 || i7 <= 191) {
                        c2 = (char) (i7 & 15);
                        c = 2;
                        i5 = i6;
                        continue;
                    } else {
                        c2 = (char) (i7 & 31);
                        c = 1;
                        i5 = i6;
                    }
                    break;
                case 1:
                    cArr[i4] = (char) ((b2 & 63) | (c2 << 6));
                    i4++;
                    i5 = i6;
                    c = 0;
                    continue;
                case 2:
                    c2 = (char) ((c2 << 6) | (b2 & 63));
                    c = 1;
                    break;
            }
            i5 = i6;
        }
        String str2 = new String(cArr, 0, i4);
        strArr[iM4171a] = str2;
        return str2;
    }
}
