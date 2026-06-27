package com.p046a.p049b.p071g;

import com.p046a.p049b.p066f.p068b.C0848r;
import com.p046a.p049b.p066f.p068b.C0852v;
import com.p046a.p049b.p073h.C0962j;
import java.util.ArrayList;
import java.util.BitSet;

/* JADX INFO: renamed from: com.a.b.g.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0947u {

    /* JADX INFO: renamed from: a */
    private final C0920an f2542a;

    /* JADX INFO: renamed from: b */
    private final ArrayList f2543b;

    /* JADX INFO: renamed from: c */
    private final C0948v f2544c;

    /* JADX INFO: renamed from: d */
    private final BitSet f2545d;

    private C0947u(C0920an c0920an) {
        if (c0920an == null) {
            throw new NullPointerException("method == null");
        }
        ArrayList arrayListM2126j = c0920an.m2126j();
        this.f2542a = c0920an;
        this.f2543b = arrayListM2126j;
        this.f2544c = new C0948v(c0920an);
        this.f2545d = new BitSet(arrayListM2126j.size());
    }

    /* JADX INFO: renamed from: a */
    public static C0948v m2191a(C0920an c0920an) {
        C0852v c0852vM1835e;
        C0947u c0947u = new C0947u(c0920an);
        if (c0947u.f2542a.m2123g() > 0) {
            for (int iM2116c = c0947u.f2542a.m2116c(); iM2116c >= 0; iM2116c = c0947u.f2545d.nextSetBit(0)) {
                c0947u.f2545d.clear(iM2116c);
                C0852v c0852vM2197b = c0947u.f2544c.m2197b(iM2116c);
                C0915ai c0915ai = (C0915ai) c0947u.f2543b.get(iM2116c);
                ArrayList arrayListM2063c = c0915ai.m2063c();
                int size = arrayListM2063c.size();
                if (iM2116c != c0947u.f2542a.m2120e()) {
                    AbstractC0918al abstractC0918al = (AbstractC0918al) arrayListM2063c.get(size - 1);
                    boolean z = (abstractC0918al.mo2028e().mo1732b().mo1021d_() != 0) && abstractC0918al.m2093n() != null;
                    int i = size - 1;
                    int i2 = 0;
                    C0852v c0852v = c0852vM2197b;
                    while (i2 < size) {
                        if (z && i2 == i) {
                            c0852v.mo811b_();
                            c0852vM1835e = c0852v.m1835e();
                        } else {
                            c0852vM1835e = c0852v;
                        }
                        AbstractC0918al abstractC0918al2 = (AbstractC0918al) arrayListM2063c.get(i2);
                        C0848r c0848rMo2090f = abstractC0918al2.mo2090f();
                        if (c0848rMo2090f == null) {
                            C0848r c0848rM2093n = abstractC0918al2.m2093n();
                            if (c0848rM2093n != null && c0852vM1835e.m1824a(c0848rM2093n.m1795g()) != null) {
                                c0852vM1835e.m1832c(c0852vM1835e.m1824a(c0848rM2093n.m1795g()));
                            }
                        } else {
                            C0848r c0848rM1802n = c0848rMo2090f.m1802n();
                            if (!c0848rM1802n.equals(c0852vM1835e.m1826a(c0848rM1802n))) {
                                C0848r c0848rM1825a = c0852vM1835e.m1825a(c0848rM1802n.m1797i());
                                if (c0848rM1825a != null && c0848rM1825a.m1795g() != c0848rM1802n.m1795g()) {
                                    c0852vM1835e.m1832c(c0848rM1825a);
                                }
                                c0947u.f2544c.m2195a(abstractC0918al2, c0848rM1802n);
                                c0852vM1835e.m1834d(c0848rM1802n);
                            }
                        }
                        i2++;
                        c0852v = c0852vM1835e;
                    }
                    c0852v.mo811b_();
                    C0962j c0962jM2073i = c0915ai.m2073i();
                    int iM2247b = c0962jM2073i.m2247b();
                    int iM2074j = c0915ai.m2074j();
                    for (int i3 = 0; i3 < iM2247b; i3++) {
                        int iM2248b = c0962jM2073i.m2248b(i3);
                        if (c0947u.f2544c.m2196a(iM2248b, iM2248b == iM2074j ? c0852v : c0852vM2197b)) {
                            c0947u.f2545d.set(iM2248b);
                        }
                    }
                }
            }
        }
        c0947u.f2544c.mo811b_();
        return c0947u.f2544c;
    }
}
