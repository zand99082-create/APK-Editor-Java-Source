package com.p046a.p049b.p071g.p072a;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p066f.p068b.C0827a;
import com.p046a.p049b.p066f.p068b.C0833c;
import com.p046a.p049b.p066f.p068b.C0842l;
import com.p046a.p049b.p066f.p068b.C0853w;
import com.p046a.p049b.p066f.p068b.C0854x;
import com.p046a.p049b.p066f.p068b.C0855y;
import com.p046a.p049b.p071g.AbstractC0913ag;
import com.p046a.p049b.p071g.AbstractC0918al;
import com.p046a.p049b.p071g.C0890a;
import com.p046a.p049b.p071g.C0915ai;
import com.p046a.p049b.p071g.C0920an;
import com.p046a.p049b.p071g.InterfaceC0917ak;
import com.p046a.p049b.p073h.C0962j;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.a.b.g.a.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0904n {

    /* JADX INFO: renamed from: a */
    private final C0920an f2413a;

    /* JADX INFO: renamed from: b */
    private final boolean f2414b;

    /* JADX INFO: renamed from: c */
    private final C0899i f2415c;

    private C0904n(C0920an c0920an, boolean z) {
        this.f2414b = z;
        this.f2413a = c0920an;
        this.f2415c = C0900j.m2001a(c0920an);
    }

    /* JADX INFO: renamed from: a */
    private C0833c m2007a() {
        int i;
        C0962j c0962j;
        int i2 = 0;
        ArrayList arrayListM2126j = this.f2413a.m2126j();
        C0915ai c0915aiM2122f = this.f2413a.m2122f();
        this.f2413a.m2128l();
        C0833c c0833c = new C0833c(this.f2413a.m2127k() - ((c0915aiM2122f == null || !c0915aiM2122f.m2082r()) ? 0 : 1));
        Iterator it = arrayListM2126j.iterator();
        while (true) {
            int i3 = i2;
            if (!it.hasNext()) {
                if (c0915aiM2122f == null || c0915aiM2122f.m2063c().size() == 0) {
                    return c0833c;
                }
                throw new RuntimeException("Exit block must have no insns when leaving SSA form");
            }
            C0915ai c0915ai = (C0915ai) it.next();
            if (!c0915ai.m2082r() || c0915ai == c0915aiM2122f) {
                i2 = i3;
            } else {
                int i4 = i3 + 1;
                C0962j c0962jM2077m = c0915ai.m2077m();
                int iM2075k = c0915ai.m2075k();
                C0915ai c0915aiM2122f2 = this.f2413a.m2122f();
                if (!c0962jM2077m.m2260h(c0915aiM2122f2 == null ? -1 : c0915aiM2122f2.m2070f())) {
                    i = iM2075k;
                    c0962j = c0962jM2077m;
                } else {
                    if (c0962jM2077m.m2247b() > 1) {
                        throw new RuntimeException("Exit predecessor must have no other successors" + C1067a.m2558v(c0915ai.m2070f()));
                    }
                    c0962j = C0962j.f2577a;
                    C0853w c0853wMo2027c = ((AbstractC0918al) c0915ai.m2063c().get(r1.size() - 1)).mo2027c();
                    if (c0853wMo2027c.m1839d() != 2 && c0853wMo2027c != C0855y.f2136bi) {
                        throw new RuntimeException("Exit predecessor must end in valid exit statement.");
                    }
                    i = -1;
                }
                c0962j.mo811b_();
                c0833c.m1738a(i3, new C0827a(c0915ai.m2070f(), m2008a(c0915ai.m2063c()), c0962j, i));
                i2 = i4;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static C0842l m2008a(ArrayList arrayList) {
        int size = arrayList.size();
        C0842l c0842l = new C0842l(size);
        for (int i = 0; i < size; i++) {
            c0842l.m1760a(i, ((AbstractC0918al) arrayList.get(i)).mo2026b());
        }
        c0842l.mo811b_();
        return c0842l;
    }

    /* JADX INFO: renamed from: a */
    public static C0854x m2009a(C0920an c0920an, boolean z) {
        C0904n c0904n = new C0904n(c0920an, z);
        AbstractC0913ag abstractC0913agMo1988a = new C0891a(c0904n.f2413a, c0904n.f2415c, c0904n.f2414b).mo1988a();
        c0904n.f2413a.m2132p();
        c0904n.f2413a.m2103a(abstractC0913agMo1988a);
        ArrayList<C0915ai> arrayListM2126j = c0904n.f2413a.m2126j();
        for (C0915ai c0915ai : arrayListM2126j) {
            c0915ai.m2056a(new C0906p(arrayListM2126j));
            c0915ai.m2060b();
        }
        Iterator it = arrayListM2126j.iterator();
        while (it.hasNext()) {
            ((C0915ai) it.next()).m2083s();
        }
        int iM2124h = c0904n.f2413a.m2124h();
        C0890a c0890a = new C0890a(c0904n.f2413a.m2123g());
        int iM2123g = c0904n.f2413a.m2123g();
        for (int i = 0; i < iM2123g; i++) {
            if (i < iM2124h) {
                c0890a.mo1963a(i, (iM2123g - iM2124h) + i, 1);
            } else {
                c0890a.mo1963a(i, i - iM2124h, 1);
            }
        }
        c0904n.f2413a.m2103a(c0890a);
        c0904n.f2413a.m2111a(false, (InterfaceC0917ak) new C0905o(c0904n, c0904n.f2413a.m2126j()));
        return new C0898h(new C0854x(c0904n.m2007a(), c0904n.f2413a.m2101a(c0904n.f2413a.m2116c()))).m1998a();
    }
}
