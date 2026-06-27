package com.p046a.p049b.p071g;

import com.p046a.p049b.p073h.C0953a;
import com.p046a.p049b.p073h.C0966n;
import java.util.ArrayList;
import java.util.BitSet;

/* JADX INFO: renamed from: com.a.b.g.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0933g {

    /* JADX INFO: renamed from: a */
    private static boolean f2500a = false;

    /* JADX INFO: renamed from: b */
    private final C0920an f2501b;

    /* JADX INFO: renamed from: c */
    private final ArrayList f2502c;

    /* JADX INFO: renamed from: d */
    private final C0934h[] f2503d;

    public C0933g(C0920an c0920an) {
        this.f2501b = c0920an;
        this.f2502c = c0920an.m2126j();
        int size = this.f2502c.size();
        this.f2503d = new C0934h[size];
        for (int i = 0; i < size; i++) {
            this.f2503d[i] = new C0934h();
        }
    }

    /* JADX INFO: renamed from: a */
    public final C0934h[] m2162a() {
        int size = this.f2502c.size();
        C0935i.m2164a(this.f2501b, this.f2503d, false);
        int size2 = this.f2502c.size();
        for (int i = 0; i < size2; i++) {
            C0934h c0934h = this.f2503d[i];
            if (c0934h.f2505b != -1) {
                ((C0915ai) this.f2502c.get(c0934h.f2505b)).m2057a((C0915ai) this.f2502c.get(i));
            }
        }
        for (int i2 = 0; i2 < size; i2++) {
            this.f2503d[i2].f2504a = size <= 3072 ? new C0953a(size) : new C0966n();
        }
        int size3 = this.f2502c.size();
        for (int i3 = 0; i3 < size3; i3++) {
            C0915ai c0915ai = (C0915ai) this.f2502c.get(i3);
            C0934h c0934h2 = this.f2503d[i3];
            BitSet bitSetM2071g = c0915ai.m2071g();
            if (bitSetM2071g.cardinality() > 1) {
                for (int iNextSetBit = bitSetM2071g.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSetM2071g.nextSetBit(iNextSetBit + 1)) {
                    int i4 = iNextSetBit;
                    while (i4 != c0934h2.f2505b && i4 != -1) {
                        C0934h c0934h3 = this.f2503d[i4];
                        if (!c0934h3.f2504a.mo2209b(i3)) {
                            c0934h3.f2504a.mo2206a(i3);
                            i4 = c0934h3.f2505b;
                        }
                    }
                }
            }
        }
        return this.f2503d;
    }
}
