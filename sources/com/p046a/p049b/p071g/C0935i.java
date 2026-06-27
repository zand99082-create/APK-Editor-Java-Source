package com.p046a.p049b.p071g;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;

/* JADX INFO: renamed from: com.a.b.g.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0935i {

    /* JADX INFO: renamed from: a */
    private final boolean f2506a;

    /* JADX INFO: renamed from: b */
    private final C0920an f2507b;

    /* JADX INFO: renamed from: c */
    private final ArrayList f2508c;

    /* JADX INFO: renamed from: d */
    private final C0936j[] f2509d;

    /* JADX INFO: renamed from: e */
    private final ArrayList f2510e = new ArrayList();

    /* JADX INFO: renamed from: f */
    private final C0934h[] f2511f;

    private C0935i(C0920an c0920an, C0934h[] c0934hArr, boolean z) {
        this.f2507b = c0920an;
        this.f2511f = c0934hArr;
        this.f2506a = z;
        this.f2508c = c0920an.m2126j();
        this.f2509d = new C0936j[this.f2508c.size() + 2];
    }

    /* JADX INFO: renamed from: a */
    private C0915ai m2163a(C0915ai c0915ai) {
        C0936j c0936j = this.f2509d[c0915ai.m2068e()];
        if (c0936j.f2515d == null) {
            return c0915ai;
        }
        if (this.f2509d[this.f2509d[c0915ai.m2068e()].f2515d.m2068e()].f2515d != null) {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            arrayList.add(c0915ai);
            while (!arrayList.isEmpty()) {
                int size = arrayList.size();
                C0936j c0936j2 = this.f2509d[((C0915ai) arrayList.get(size - 1)).m2068e()];
                C0915ai c0915ai2 = c0936j2.f2515d;
                C0936j c0936j3 = this.f2509d[c0915ai2.m2068e()];
                if (!hashSet.add(c0915ai2) || c0936j3.f2515d == null) {
                    arrayList.remove(size - 1);
                    if (c0936j3.f2515d != null) {
                        C0915ai c0915ai3 = c0936j3.f2514c;
                        if (this.f2509d[c0915ai3.m2068e()].f2512a < this.f2509d[c0936j2.f2514c.m2068e()].f2512a) {
                            c0936j2.f2514c = c0915ai3;
                        }
                        c0936j2.f2515d = c0936j3.f2515d;
                    }
                } else {
                    arrayList.add(c0915ai2);
                }
            }
        }
        return c0936j.f2514c;
    }

    /* JADX INFO: renamed from: a */
    public static C0935i m2164a(C0920an c0920an, C0934h[] c0934hArr, boolean z) {
        int i;
        byte b2 = 0;
        C0935i c0935i = new C0935i(c0920an, c0934hArr, false);
        C0915ai c0915aiM2122f = c0935i.f2506a ? c0935i.f2507b.m2122f() : c0935i.f2507b.m2118d();
        if (c0915aiM2122f != null) {
            c0935i.f2510e.add(c0915aiM2122f);
            c0935i.f2511f[c0915aiM2122f.m2068e()].f2505b = c0915aiM2122f.m2068e();
        }
        c0935i.f2507b.m2111a(c0935i.f2506a, new C0937k(c0935i, b2));
        int size = c0935i.f2510e.size() - 1;
        for (int i2 = size; i2 >= 2; i2--) {
            C0915ai c0915ai = (C0915ai) c0935i.f2510e.get(i2);
            C0936j c0936j = c0935i.f2509d[c0915ai.m2068e()];
            BitSet bitSetM2072h = c0935i.f2506a ? c0915ai.m2072h() : c0915ai.m2071g();
            for (int iNextSetBit = bitSetM2072h.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSetM2072h.nextSetBit(iNextSetBit + 1)) {
                C0915ai c0915ai2 = (C0915ai) c0935i.f2508c.get(iNextSetBit);
                if (c0935i.f2509d[c0915ai2.m2068e()] != null && (i = c0935i.f2509d[c0935i.m2163a(c0915ai2).m2068e()].f2512a) < c0936j.f2512a) {
                    c0936j.f2512a = i;
                }
            }
            c0935i.f2509d[((C0915ai) c0935i.f2510e.get(c0936j.f2512a)).m2068e()].f2516e.add(c0915ai);
            c0936j.f2515d = c0936j.f2513b;
            ArrayList arrayList = c0935i.f2509d[c0936j.f2513b.m2068e()].f2516e;
            while (!arrayList.isEmpty()) {
                C0915ai c0915ai3 = (C0915ai) arrayList.remove(arrayList.size() - 1);
                C0915ai c0915aiM2163a = c0935i.m2163a(c0915ai3);
                if (c0935i.f2509d[c0915aiM2163a.m2068e()].f2512a < c0935i.f2509d[c0915ai3.m2068e()].f2512a) {
                    c0935i.f2511f[c0915ai3.m2068e()].f2505b = c0915aiM2163a.m2068e();
                } else {
                    c0935i.f2511f[c0915ai3.m2068e()].f2505b = c0936j.f2513b.m2068e();
                }
            }
        }
        for (int i3 = 2; i3 <= size; i3++) {
            C0915ai c0915ai4 = (C0915ai) c0935i.f2510e.get(i3);
            if (c0935i.f2511f[c0915ai4.m2068e()].f2505b != ((C0915ai) c0935i.f2510e.get(c0935i.f2509d[c0915ai4.m2068e()].f2512a)).m2068e()) {
                c0935i.f2511f[c0915ai4.m2068e()].f2505b = c0935i.f2511f[c0935i.f2511f[c0915ai4.m2068e()].f2505b].f2505b;
            }
        }
        return c0935i;
    }
}
