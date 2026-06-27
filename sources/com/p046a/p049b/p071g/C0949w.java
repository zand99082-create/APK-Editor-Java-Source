package com.p046a.p049b.p071g;

import com.p046a.p049b.p066f.p068b.C0848r;
import java.util.HashSet;

/* JADX INFO: renamed from: com.a.b.g.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0949w {

    /* JADX INFO: renamed from: a */
    private final C0920an f2550a;

    private C0949w(C0920an c0920an) {
        this.f2550a = c0920an;
    }

    /* JADX INFO: renamed from: a */
    public static void m2200a(C0920an c0920an) {
        C0949w c0949w = new C0949w(c0920an);
        C0848r[] c0848rArr = new C0848r[c0949w.f2550a.m2124h()];
        HashSet hashSet = new HashSet();
        c0949w.f2550a.m2109a(new C0950x(c0949w, c0848rArr, hashSet));
        c0949w.f2550a.m2110a(hashSet);
    }
}
