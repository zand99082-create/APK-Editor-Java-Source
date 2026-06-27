package com.p046a.p049b.p071g;

import com.p046a.p049b.p066f.p068b.C0829ab;
import com.p046a.p049b.p066f.p068b.C0846p;
import com.p046a.p049b.p066f.p068b.C0847q;
import com.p046a.p049b.p066f.p068b.C0848r;
import com.p046a.p049b.p066f.p068b.C0850t;
import com.p046a.p049b.p066f.p068b.C0853w;
import com.p046a.p049b.p066f.p068b.C0855y;
import com.p046a.p049b.p066f.p068b.C0856z;
import com.p046a.p049b.p066f.p069c.AbstractC0859ab;
import com.p046a.p049b.p066f.p069c.C0883y;
import com.p046a.p049b.p066f.p070d.C0886b;
import com.p046a.p049b.p066f.p070d.InterfaceC0888d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: renamed from: com.a.b.g.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0928b {

    /* JADX INFO: renamed from: a */
    private static boolean f2488a = false;

    /* JADX INFO: renamed from: b */
    private static boolean f2489b = false;

    /* JADX INFO: renamed from: c */
    private final C0920an f2490c;

    private C0928b(C0920an c0920an) {
        this.f2490c = c0920an;
    }

    /* JADX INFO: renamed from: a */
    public static void m2151a(C0920an c0920an) {
        C0928b c0928b = new C0928b(c0920an);
        int iM2123g = c0928b.f2490c.m2123g();
        int iM2123g2 = c0928b.f2490c.m2123g();
        HashMap map = new HashMap();
        new HashSet();
        for (int i = 0; i < iM2123g2; i++) {
            AbstractC0918al abstractC0918alM2117c = c0928b.f2490c.m2117c(i);
            if (abstractC0918alM2117c != null && abstractC0918alM2117c.mo2027c() != null) {
                C0848r c0848rM2093n = abstractC0918alM2117c.m2093n();
                InterfaceC0888d interfaceC0888dM1796h = c0848rM2093n.m1796h();
                if (interfaceC0888dM1796h.mo929f()) {
                    AbstractC0859ab abstractC0859ab = (AbstractC0859ab) interfaceC0888dM1796h;
                    if (abstractC0918alM2117c.mo2027c().m1836a() == 56) {
                        abstractC0918alM2117c = (AbstractC0918al) ((C0915ai) c0928b.f2490c.m2126j().get(abstractC0918alM2117c.m2094o().m2071g().nextSetBit(0))).m2063c().get(r3.size() - 1);
                    }
                    if (abstractC0918alM2117c.mo2030j()) {
                        if (abstractC0859ab instanceof C0883y) {
                        }
                    } else if (!c0928b.f2490c.m2112a(c0848rM2093n)) {
                        Integer num = (Integer) map.get(abstractC0859ab);
                        if (num == null) {
                            map.put(abstractC0859ab, 1);
                        } else {
                            map.put(abstractC0859ab, Integer.valueOf(num.intValue() + 1));
                        }
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Integer) entry.getValue()).intValue() > 1) {
                arrayList.add(entry.getKey());
            }
        }
        Collections.sort(arrayList, new C0929c(c0928b, map));
        int iMin = Math.min(arrayList.size(), 5);
        C0915ai c0915aiM2118d = c0928b.f2490c.m2118d();
        HashMap map2 = new HashMap(iMin);
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= iMin) {
                c0928b.m2152a(map2, iM2123g);
                return;
            }
            AbstractC0859ab abstractC0859ab2 = (AbstractC0859ab) arrayList.get(i3);
            C0848r c0848rM1778a = C0848r.m1778a(c0928b.f2490c.m2131o(), abstractC0859ab2);
            C0853w c0853wM1858f = C0855y.m1858f(abstractC0859ab2);
            if (c0853wM1858f.m1839d() == 1) {
                c0915aiM2118d.m2053a(new C0846p(C0855y.m1858f(abstractC0859ab2), C0856z.f2229a, c0848rM1778a, C0850t.f2003a, abstractC0859ab2));
            } else {
                C0915ai c0915aiM2118d2 = c0928b.f2490c.m2118d();
                C0915ai c0915aiM2076l = c0915aiM2118d2.m2076l();
                C0915ai c0915aiM2059b = c0915aiM2118d2.m2059b(c0915aiM2076l);
                c0915aiM2059b.m2062b(new C0829ab(c0853wM1858f, C0856z.f2229a, C0850t.f2003a, C0886b.f2306a, abstractC0859ab2));
                c0915aiM2059b.m2059b(c0915aiM2076l).m2053a(new C0847q(C0855y.m1857e(c0848rM1778a.m1796h()), C0856z.f2229a, c0848rM1778a, C0850t.f2003a));
            }
            map2.put(abstractC0859ab2, c0848rM1778a);
            i2 = i3 + 1;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m2152a(HashMap map, int i) {
        C0848r c0848r;
        new HashSet();
        ArrayList[] arrayListArrM2130n = this.f2490c.m2130n();
        for (int i2 = 0; i2 < i; i2++) {
            AbstractC0918al abstractC0918alM2117c = this.f2490c.m2117c(i2);
            if (abstractC0918alM2117c != null) {
                C0848r c0848rM2093n = abstractC0918alM2117c.m2093n();
                InterfaceC0888d interfaceC0888dM1796h = abstractC0918alM2117c.m2093n().m1796h();
                if (interfaceC0888dM1796h.mo929f() && (c0848r = (C0848r) map.get((AbstractC0859ab) interfaceC0888dM1796h)) != null && !this.f2490c.m2112a(c0848rM2093n)) {
                    C0930d c0930d = new C0930d(this, c0848rM2093n, c0848r);
                    for (AbstractC0918al abstractC0918al : arrayListArrM2130n[c0848rM2093n.m1795g()]) {
                        if (!abstractC0918al.mo2030j() || abstractC0918al.m2094o().m2072h().cardinality() <= 1) {
                            abstractC0918al.mo2023a(c0930d);
                        }
                    }
                }
            }
        }
    }
}
