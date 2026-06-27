package com.p046a.p049b.p058c.p060b;

import com.p046a.p049b.p066f.p068b.C0856z;

/* JADX INFO: renamed from: com.a.b.c.b.ac */
/* JADX INFO: loaded from: classes.dex */
public final class C0647ac {

    /* JADX INFO: renamed from: a */
    private final int f1069a;

    /* JADX INFO: renamed from: b */
    private final C0856z f1070b;

    public C0647ac(int i, C0856z c0856z) {
        if (i < 0) {
            throw new IllegalArgumentException("address < 0");
        }
        if (c0856z == null) {
            throw new NullPointerException("position == null");
        }
        this.f1069a = i;
        this.f1070b = c0856z;
    }

    /* JADX INFO: renamed from: a */
    public final int m1138a() {
        return this.f1069a;
    }

    /* JADX INFO: renamed from: b */
    public final C0856z m1139b() {
        return this.f1070b;
    }
}
