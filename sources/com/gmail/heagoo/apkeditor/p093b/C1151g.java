package com.gmail.heagoo.apkeditor.p093b;

import com.gmail.heagoo.apkeditor.p090a.p091a.C1100s;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.b.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1151g {

    /* JADX INFO: renamed from: a */
    byte[] f3388a;

    /* JADX INFO: renamed from: b */
    int f3389b;

    /* JADX INFO: renamed from: c */
    int f3390c;

    /* JADX INFO: renamed from: d */
    String f3391d;

    public C1151g(int i, String str) {
        this.f3391d = str;
    }

    public C1151g(int i, String str, byte[] bArr, int i2, int i3) {
        this.f3391d = str;
        this.f3388a = bArr;
        this.f3389b = i2;
        this.f3390c = i3;
    }

    /* JADX INFO: renamed from: b */
    private void m3063b() {
        int[] iArr = new int[1];
        C1148d c1148d = new C1148d(this.f3388a, this.f3389b);
        int iM3046a = 0;
        try {
            iM3046a = c1148d.m3046a();
        } catch (C1153i e) {
            e.printStackTrace();
        }
        this.f3391d = C1154j.m3069a(this.f3388a, c1148d.m3048b(), iM3046a, iArr);
    }

    /* JADX INFO: renamed from: c */
    private void m3064c() {
        byte[] bArrM2968a = C1100s.m2968a(this.f3391d.length());
        byte[] bArrM3070a = C1154j.m3070a(this.f3391d);
        this.f3388a = new byte[bArrM2968a.length + bArrM3070a.length + 1];
        System.arraycopy(bArrM2968a, 0, this.f3388a, 0, bArrM2968a.length);
        System.arraycopy(bArrM3070a, 0, this.f3388a, bArrM2968a.length, bArrM3070a.length);
        this.f3389b = 0;
        this.f3390c = bArrM2968a.length + bArrM3070a.length + 1;
    }

    /* JADX INFO: renamed from: a */
    public final int m3065a() {
        if (this.f3388a != null && this.f3390c > 0) {
            return this.f3390c;
        }
        m3064c();
        return this.f3390c;
    }

    /* JADX INFO: renamed from: a */
    public final int m3066a(C1151g c1151g) {
        if (this.f3391d == null) {
            m3063b();
        }
        if (c1151g.f3391d == null) {
            c1151g.m3063b();
        }
        return this.f3391d.compareTo(c1151g.f3391d);
    }

    /* JADX INFO: renamed from: a */
    public final void m3067a(String str) {
        this.f3391d = str;
        m3064c();
    }
}
