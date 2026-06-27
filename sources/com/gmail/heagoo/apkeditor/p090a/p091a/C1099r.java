package com.gmail.heagoo.apkeditor.p090a.p091a;

import java.io.IOException;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.a.a.r */
/* JADX INFO: loaded from: classes.dex */
public final class C1099r {

    /* JADX INFO: renamed from: a */
    public int[] f3213a;

    /* JADX INFO: renamed from: b */
    private int f3214b;

    /* JADX INFO: renamed from: c */
    private int f3215c;

    /* JADX INFO: renamed from: a */
    public final int m2963a() {
        if (this.f3213a != null) {
            return this.f3213a.length;
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m2964a(int i, int i2) {
        this.f3215c += 4;
        int[] iArr = new int[this.f3213a.length + 1];
        iArr[0] = 16843447;
        for (int i3 = 1; i3 < iArr.length; i3++) {
            iArr[i3] = this.f3213a[i3 - 1];
        }
        this.f3213a = iArr;
    }

    /* JADX INFO: renamed from: a */
    public final void m2965a(C1093l c1093l) throws IOException {
        c1093l.m2942a(this.f3214b);
        c1093l.m2942a(this.f3215c);
        c1093l.m2946a(this.f3213a);
    }

    /* JADX INFO: renamed from: a */
    public final void m2966a(C1094m c1094m) {
        this.f3214b = c1094m.m2949a();
        this.f3215c = c1094m.m2949a();
        int i = (this.f3215c - 8) / 4;
        this.f3213a = new int[i];
        new StringBuilder("Attr Count: ").append(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.f3213a[i2] = c1094m.m2949a();
            new StringBuilder("\t").append(this.f3213a[i2]);
        }
    }
}
