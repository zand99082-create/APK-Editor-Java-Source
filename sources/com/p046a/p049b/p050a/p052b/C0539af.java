package com.p046a.p049b.p050a.p052b;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p066f.p068b.C0827a;
import com.p046a.p049b.p073h.C0962j;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;

/* JADX INFO: renamed from: com.a.b.a.b.af */
/* JADX INFO: loaded from: classes.dex */
final class C0539af {

    /* JADX INFO: renamed from: a */
    private final HashMap f829a = new HashMap();

    /* JADX INFO: renamed from: b */
    private final BitSet f830b;

    /* JADX INFO: renamed from: c */
    private int f831c;

    /* JADX INFO: renamed from: d */
    private int f832d;

    /* JADX INFO: renamed from: e */
    private final C0537ad f833e;

    /* JADX INFO: renamed from: f */
    private final ArrayList f834f;

    /* JADX INFO: renamed from: g */
    private /* synthetic */ C0568x f835g;

    C0539af(C0568x c0568x, C0537ad c0537ad, ArrayList arrayList) {
        this.f835g = c0568x;
        this.f830b = new BitSet(c0568x.f920d);
        this.f833e = c0537ad;
        this.f834f = arrayList;
    }

    /* JADX INFO: renamed from: a */
    private int m774a(int i) {
        Integer num = (Integer) this.f829a.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        int i2 = this.f831c;
        C0962j c0962j = (C0962j) this.f834f.get(i);
        if (!(c0962j != null && c0962j.m2247b() > 0 && c0962j.m2252d() == i2)) {
            return i;
        }
        int iMo766a = this.f833e.mo766a();
        this.f830b.set(i);
        this.f829a.put(Integer.valueOf(i), Integer.valueOf(iMo766a));
        while (this.f834f.size() <= iMo766a) {
            this.f834f.add(null);
        }
        this.f834f.set(iMo766a, this.f834f.get(i));
        return iMo766a;
    }

    /* JADX INFO: renamed from: a */
    final void m775a(C0827a c0827a) {
        C0962j c0962jM2244a;
        this.f832d = c0827a.m1720c().m2248b(0);
        this.f831c = c0827a.m1720c().m2248b(1);
        int iM774a = m774a(this.f831c);
        int iNextSetBit = this.f830b.nextSetBit(0);
        while (iNextSetBit >= 0) {
            this.f830b.clear(iNextSetBit);
            int iIntValue = ((Integer) this.f829a.get(Integer.valueOf(iNextSetBit))).intValue();
            C0827a c0827aM954c = this.f835g.m954c(iNextSetBit);
            C0962j c0962jM1720c = c0827aM954c.m1720c();
            int i = -1;
            if (this.f835g.m945a(c0827aM954c)) {
                c0962jM2244a = C0962j.m2245a(m774a(c0962jM1720c.m2248b(0)), c0962jM1720c.m2248b(1));
            } else {
                C0538ae c0538aeM949b = C0568x.m949b(this.f835g, iNextSetBit);
                if (c0538aeM949b == null) {
                    int iM1721d = c0827aM954c.m1721d();
                    int iM2247b = c0962jM1720c.m2247b();
                    C0962j c0962j = new C0962j(iM2247b);
                    int i2 = 0;
                    while (i2 < iM2247b) {
                        int iM2248b = c0962jM1720c.m2248b(i2);
                        int iM774a2 = m774a(iM2248b);
                        c0962j.m2250c(iM774a2);
                        if (iM1721d != iM2248b) {
                            iM774a2 = i;
                        }
                        i2++;
                        i = iM774a2;
                    }
                    c0962j.mo811b_();
                    c0962jM2244a = c0962j;
                } else {
                    if (c0538aeM949b.f827c != this.f831c) {
                        throw new RuntimeException("ret instruction returns to label " + C1067a.m2558v(c0538aeM949b.f827c) + " expected: " + C1067a.m2558v(this.f831c));
                    }
                    c0962jM2244a = C0962j.m2244a(this.f832d);
                    i = this.f832d;
                }
            }
            this.f835g.m941a(new C0827a(iIntValue, C0568x.m934a(this.f835g, c0827aM954c.m1719b()), c0962jM2244a, i), (C0962j) this.f834f.get(iIntValue));
            if (this.f835g.m945a(this.f835g.m954c(iNextSetBit))) {
                new C0539af(this.f835g, this.f833e, this.f834f).m775a(this.f835g.m954c(iIntValue));
            }
            iNextSetBit = this.f830b.nextSetBit(0);
        }
        C0568x.m943a(this.f835g, new C0827a(c0827a.mo821a(), c0827a.m1719b(), C0962j.m2244a(iM774a), iM774a), (C0962j) this.f834f.get(c0827a.mo821a()));
    }
}
