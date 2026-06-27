package com.p046a.p049b.p050a.p052b;

/* JADX INFO: renamed from: com.a.b.a.b.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0560p {

    /* JADX INFO: renamed from: a */
    private final int f904a;

    /* JADX INFO: renamed from: b */
    private final int f905b;

    public C0560p(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("startPc < 0");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("lineNumber < 0");
        }
        this.f904a = i;
        this.f905b = i2;
    }

    /* JADX INFO: renamed from: a */
    public final int m891a() {
        return this.f904a;
    }

    /* JADX INFO: renamed from: b */
    public final int m892b() {
        return this.f905b;
    }
}
