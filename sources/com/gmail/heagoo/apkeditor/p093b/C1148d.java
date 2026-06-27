package com.gmail.heagoo.apkeditor.p093b;

import com.gmail.heagoo.neweditor.Token;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.b.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1148d {

    /* JADX INFO: renamed from: a */
    private byte[] f3383a;

    /* JADX INFO: renamed from: b */
    private int f3384b;

    public C1148d(byte[] bArr, int i) {
        this.f3383a = bArr;
        this.f3384b = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0076 A[PHI: r0 r2
      0x0076: PHI (r0v6 int) = (r0v5 int), (r0v8 int) binds: [B:5:0x001f, B:9:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x0076: PHI (r2v2 int) = (r2v1 int), (r2v5 int) binds: [B:5:0x001f, B:9:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m3046a() throws C1153i {
        int i = this.f3384b;
        int i2 = i + 1;
        int i3 = this.f3383a[i] & 255;
        if (i3 > 127) {
            int i4 = i2 + 1;
            int i5 = this.f3383a[i2] & 255;
            i3 = (i3 & 127) | ((i5 & 127) << 7);
            if (i5 > 127) {
                i2 = i4 + 1;
                int i6 = this.f3383a[i4] & 255;
                i3 |= (i6 & 127) << 14;
                if (i6 > 127) {
                    i4 = i2 + 1;
                    int i7 = this.f3383a[i2] & 255;
                    i3 |= (i7 & 127) << 21;
                    if (i7 > 127) {
                        i2 = i4 + 1;
                        byte b2 = this.f3383a[i4];
                        if (b2 < 0) {
                            throw new C1153i("Invalid uleb128 at offset 0x%x", Integer.valueOf(this.f3384b));
                        }
                        if ((b2 & Token.LITERAL3) > 7) {
                            throw new C1153i("uleb128 is out of range at offset 0x%x", Integer.valueOf(this.f3384b));
                        }
                        i3 |= b2 << 28;
                    } else {
                        i2 = i4;
                    }
                }
            }
        }
        this.f3384b = i2;
        return i3;
    }

    /* JADX INFO: renamed from: a */
    public final String m3047a(int i) {
        int[] iArr = new int[1];
        String strM3069a = C1154j.m3069a(this.f3383a, this.f3384b, i, iArr);
        this.f3384b = iArr[0] + this.f3384b;
        return strM3069a;
    }

    /* JADX INFO: renamed from: b */
    public final int m3048b() {
        return this.f3384b;
    }

    /* JADX INFO: renamed from: b */
    public final void m3049b(int i) {
        this.f3384b = i;
    }
}
