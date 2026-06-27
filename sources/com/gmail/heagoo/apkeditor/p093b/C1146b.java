package com.gmail.heagoo.apkeditor.p093b;

import android.support.v7.appcompat.C0327R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.b.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1146b {

    /* JADX INFO: renamed from: a */
    private byte[] f3370a;

    /* JADX INFO: renamed from: b */
    private final int f3371b = m3036b(52);

    /* JADX INFO: renamed from: c */
    private final int f3372c = m3036b(56);

    /* JADX INFO: renamed from: d */
    private final int f3373d = m3036b(60);

    /* JADX INFO: renamed from: e */
    private final int f3374e;

    /* JADX INFO: renamed from: f */
    private final int f3375f;

    /* JADX INFO: renamed from: g */
    private final int f3376g;

    /* JADX INFO: renamed from: h */
    private final int f3377h;

    /* JADX INFO: renamed from: i */
    private final int f3378i;

    /* JADX INFO: renamed from: j */
    private final int f3379j;

    /* JADX INFO: renamed from: k */
    private final int f3380k;

    /* JADX INFO: renamed from: l */
    private final int f3381l;

    /* JADX INFO: renamed from: m */
    private final int f3382m;

    public C1146b(byte[] bArr) throws C1153i {
        this.f3370a = bArr;
        m3036b(64);
        this.f3374e = m3036b(68);
        this.f3375f = m3036b(72);
        this.f3376g = m3036b(76);
        m3036b(80);
        this.f3377h = m3036b(84);
        m3036b(88);
        this.f3378i = m3036b(92);
        this.f3379j = m3036b(96);
        this.f3380k = m3036b(100);
        this.f3381l = m3036b(C0327R.styleable.AppCompatTheme_buttonStyle);
        this.f3382m = m3036b(108);
    }

    /* JADX INFO: renamed from: a */
    public static int m3033a(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | (bArr[i + 3] << 24);
    }

    /* JADX INFO: renamed from: a */
    public static void m3034a(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    /* JADX INFO: renamed from: a */
    private boolean m3035a(int i, int i2, int i3, int i4) {
        if (i < i2) {
            return false;
        }
        m3034a(i + i3, this.f3370a, i4);
        return true;
    }

    /* JADX INFO: renamed from: b */
    private int m3036b(int i) throws C1153i {
        byte[] bArr = this.f3370a;
        int i2 = (bArr[i + 3] << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        if (i2 < 0) {
            throw new C1153i("out of range when read int at offset 0x%x", Integer.valueOf(i));
        }
        return i2;
    }

    /* JADX INFO: renamed from: a */
    public final int m3037a() {
        return this.f3379j;
    }

    /* JADX INFO: renamed from: a */
    public final int m3038a(int i) throws C1153i {
        if (i < 0 || i >= this.f3372c) {
            throw new C1153i("String index out of bounds: %d", Integer.valueOf(i));
        }
        return this.f3373d + (i << 2);
    }

    /* JADX INFO: renamed from: a */
    public final void m3039a(int i, int i2) {
        if (i2 != 0) {
            m3034a(m3033a(this.f3370a, 32) + i2, this.f3370a, 32);
            m3035a(this.f3371b, i, i2, 52);
            m3035a(this.f3373d, i, i2, 60);
            m3035a(this.f3374e, i, i2, 68);
            m3035a(this.f3376g, i, i2, 76);
            m3035a(this.f3377h, i, i2, 84);
            m3035a(this.f3378i, i, i2, 92);
            m3035a(this.f3380k, i, i2, 100);
            if (m3035a(this.f3382m, i, i2, 108)) {
                return;
            }
            m3034a(this.f3381l + i2, this.f3370a, C0327R.styleable.AppCompatTheme_buttonStyle);
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m3040b() {
        return this.f3372c;
    }

    /* JADX INFO: renamed from: c */
    public final int m3041c() {
        return this.f3375f;
    }

    /* JADX INFO: renamed from: d */
    public final int m3042d() {
        return this.f3376g;
    }

    /* JADX INFO: renamed from: e */
    public final int m3043e() {
        return this.f3380k;
    }

    /* JADX INFO: renamed from: f */
    public final List m3044f() throws C1153i {
        int iM3036b = m3036b(this.f3371b);
        ArrayList arrayList = new ArrayList(iM3036b);
        for (int i = 0; i < iM3036b; i++) {
            byte[] bArr = this.f3370a;
            int i2 = this.f3371b + 4 + (i * 12);
            C1145a c1145a = new C1145a();
            c1145a.f3367a = (short) ((bArr[i2] & 255) | (bArr[i2 + 1] << 8));
            c1145a.f3368b = m3033a(bArr, i2 + 4);
            c1145a.f3369c = m3033a(bArr, i2 + 8);
            arrayList.add(c1145a);
        }
        Collections.sort(arrayList, new C1147c(this));
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public final int m3045g() {
        return this.f3371b;
    }
}
