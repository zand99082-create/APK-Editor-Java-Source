package com.p046a.p049b.p071g;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p066f.p068b.C0843m;
import com.p046a.p049b.p066f.p068b.C0848r;
import com.p046a.p049b.p066f.p068b.C0850t;
import com.p046a.p049b.p066f.p070d.InterfaceC0888d;
import java.util.BitSet;
import java.util.List;

/* JADX INFO: renamed from: com.a.b.g.af */
/* JADX INFO: loaded from: classes.dex */
public final class C0912af {

    /* JADX INFO: renamed from: a */
    private C0920an f2431a;

    /* JADX INFO: renamed from: b */
    private final BitSet f2432b;

    private C0912af(C0920an c0920an) {
        this.f2431a = c0920an;
        this.f2432b = new BitSet(c0920an.m2123g());
    }

    /* JADX INFO: renamed from: a */
    public static void m2034a(C0920an c0920an) {
        boolean z;
        C0912af c0912af = new C0912af(c0920an);
        int iM2123g = c0912af.f2431a.m2123g();
        for (int i = 0; i < iM2123g; i++) {
            AbstractC0918al abstractC0918alM2117c = c0912af.f2431a.m2117c(i);
            if (abstractC0918alM2117c != null && abstractC0918alM2117c.m2093n().mo927c() == 0) {
                c0912af.f2432b.set(i);
            }
        }
        while (true) {
            int iNextSetBit = c0912af.f2432b.nextSetBit(0);
            if (iNextSetBit < 0) {
                return;
            }
            c0912af.f2432b.clear(iNextSetBit);
            C0909ac c0909ac = (C0909ac) c0912af.f2431a.m2117c(iNextSetBit);
            c0909ac.m2025a(c0912af.f2431a);
            C0850t c0850tMo2018a = c0909ac.mo2018a();
            int i2 = -1;
            int iD_ = c0850tMo2018a.m2239d_();
            int i3 = 0;
            C0848r c0848r = null;
            while (i3 < iD_) {
                C0848r c0848rM1815b = c0850tMo2018a.m1815b(i3);
                if (c0848rM1815b.mo927c() != 0) {
                    i2 = i3;
                } else {
                    c0848rM1815b = c0848r;
                }
                i3++;
                c0848r = c0848rM1815b;
            }
            if (c0848r == null) {
                z = false;
            } else {
                C0843m c0843mM1797i = c0848r.m1797i();
                InterfaceC0888d interfaceC0888dMo925a = c0848r.mo925a();
                boolean z2 = true;
                for (int i4 = 0; i4 < iD_; i4++) {
                    if (i4 != i2) {
                        C0848r c0848rM1815b2 = c0850tMo2018a.m1815b(i4);
                        if (c0848rM1815b2.mo927c() != 0) {
                            z2 = z2 && m2035a(c0843mM1797i, c0848rM1815b2.m1797i());
                            interfaceC0888dMo925a = C1067a.m2448a(interfaceC0888dMo925a, c0848rM1815b2.mo925a());
                        }
                    }
                }
                if (interfaceC0888dMo925a == null) {
                    StringBuilder sb = new StringBuilder();
                    for (int i5 = 0; i5 < iD_; i5++) {
                        sb.append(c0850tMo2018a.m1815b(i5).toString());
                        sb.append(' ');
                    }
                    throw new RuntimeException("Couldn't map types in phi insn:" + ((Object) sb));
                }
                C0843m c0843m = z2 ? c0843mM1797i : null;
                C0848r c0848rN = c0909ac.m2093n();
                if (c0848rN.m1796h() == interfaceC0888dMo925a && m2035a(c0843m, c0848rN.m1797i())) {
                    z = false;
                } else {
                    c0909ac.m2022a(interfaceC0888dMo925a, c0843m);
                    z = true;
                }
            }
            if (z) {
                List listM2119d = c0912af.f2431a.m2119d(iNextSetBit);
                int size = listM2119d.size();
                for (int i6 = 0; i6 < size; i6++) {
                    AbstractC0918al abstractC0918al = (AbstractC0918al) listM2119d.get(i6);
                    C0848r c0848rM2093n = abstractC0918al.m2093n();
                    if (c0848rM2093n != null && (abstractC0918al instanceof C0909ac)) {
                        c0912af.f2432b.set(c0848rM2093n.m1795g());
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m2035a(C0843m c0843m, C0843m c0843m2) {
        return c0843m == c0843m2 || (c0843m != null && c0843m.equals(c0843m2));
    }
}
