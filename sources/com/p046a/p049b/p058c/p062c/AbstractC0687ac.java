package com.p046a.p049b.p058c.p062c;

/* JADX INFO: renamed from: com.a.b.c.c.ac */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0687ac extends AbstractC0688ad {

    /* JADX INFO: renamed from: a */
    private int f1376a = -1;

    /* JADX INFO: renamed from: a */
    public final void m1311a(int i) {
        if (this.f1376a != -1) {
            throw new RuntimeException("index already set");
        }
        this.f1376a = i;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m1312h() {
        return this.f1376a >= 0;
    }

    /* JADX INFO: renamed from: i */
    public final int m1313i() {
        if (this.f1376a < 0) {
            throw new RuntimeException("index not yet set");
        }
        return this.f1376a;
    }

    /* JADX INFO: renamed from: j */
    public final String m1314j() {
        return "[" + Integer.toHexString(this.f1376a) + ']';
    }
}
