package com.gmail.heagoo.apkeditor.p090a.p091a;

import com.gmail.heagoo.apkeditor.p090a.C1113i;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.a.a.x */
/* JADX INFO: loaded from: classes.dex */
public final class C1105x {

    /* JADX INFO: renamed from: a */
    public int f3265a;

    /* JADX INFO: renamed from: b */
    public String f3266b;

    /* JADX INFO: renamed from: c */
    private byte[] f3267c;

    /* JADX INFO: renamed from: d */
    private String f3268d;

    /* JADX INFO: renamed from: e */
    private int f3269e;

    /* JADX INFO: renamed from: f */
    private int f3270f;

    /* JADX INFO: renamed from: g */
    private int f3271g;

    C1105x(C1104w c1104w, byte[] bArr, int i) {
        this.f3267c = bArr;
        this.f3265a = i;
        int iM2929a = C1086e.m2929a(bArr, i + 4);
        this.f3269e = C1086e.m2929a(bArr, i + 8);
        int iM2929a2 = C1086e.m2929a(bArr, i + 12) >> 16;
        this.f3270f = ((iM2929a2 & 255) << 8) | ((iM2929a2 >> 8) & 255);
        this.f3271g = C1086e.m2929a(bArr, i + 16);
        this.f3266b = c1104w.f3263g.m2978b(iM2929a);
        if ((this.f3266b == null || this.f3266b.equals("")) && iM2929a < c1104w.f3264h.m2963a()) {
            this.f3266b = C1113i.m3019a(c1104w.f3264h.f3213a[iM2929a]);
        }
        if (this.f3270f == 3) {
            this.f3268d = c1104w.f3263g.m2978b(this.f3271g >= 0 ? this.f3271g : this.f3269e);
        }
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ void m3010a(C1105x c1105x, int[] iArr) {
        C1104w.m2999b(iArr, c1105x.f3267c, c1105x.f3265a);
        C1104w.m2999b(iArr, c1105x.f3267c, c1105x.f3265a + 4);
        C1104w.m2999b(iArr, c1105x.f3267c, c1105x.f3265a + 8);
        if (c1105x.f3270f == 3) {
            C1104w.m2999b(iArr, c1105x.f3267c, c1105x.f3265a + 16);
        }
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m3011a() {
        return this.f3267c;
    }

    /* JADX INFO: renamed from: b */
    public final int m3012b() {
        return this.f3270f;
    }

    /* JADX INFO: renamed from: c */
    public final int m3013c() {
        return this.f3271g;
    }

    public final String toString() {
        return this.f3268d != null ? this.f3266b + "=\"" + this.f3268d + "\"" : this.f3266b + "=valueType:" + this.f3270f + ",valueData:" + this.f3271g;
    }
}
