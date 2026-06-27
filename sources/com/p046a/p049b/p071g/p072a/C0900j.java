package com.p046a.p049b.p071g.p072a;

import com.p046a.p049b.p066f.p068b.C0848r;
import com.p046a.p049b.p071g.AbstractC0918al;
import com.p046a.p049b.p071g.C0909ac;
import com.p046a.p049b.p071g.C0915ai;
import com.p046a.p049b.p071g.C0920an;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.a.b.g.a.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0900j {

    /* JADX INFO: renamed from: a */
    private final BitSet f2397a;

    /* JADX INFO: renamed from: b */
    private final BitSet f2398b;

    /* JADX INFO: renamed from: c */
    private final int f2399c;

    /* JADX INFO: renamed from: d */
    private final C0920an f2400d;

    /* JADX INFO: renamed from: e */
    private final C0899i f2401e;

    /* JADX INFO: renamed from: f */
    private C0915ai f2402f;

    /* JADX INFO: renamed from: g */
    private int f2403g;

    /* JADX INFO: renamed from: h */
    private int f2404h;

    private C0900j(C0920an c0920an, int i, C0899i c0899i) {
        int size = c0920an.m2126j().size();
        this.f2400d = c0920an;
        this.f2399c = i;
        this.f2397a = new BitSet(size);
        this.f2398b = new BitSet(size);
        this.f2401e = c0899i;
    }

    /* JADX INFO: renamed from: a */
    public static C0899i m2001a(C0920an c0920an) {
        int iM2123g = c0920an.m2123g();
        C0899i c0899i = new C0899i(iM2123g);
        for (int i = 0; i < iM2123g; i++) {
            C0900j c0900j = new C0900j(c0920an, i, c0899i);
            for (AbstractC0918al abstractC0918al : c0900j.f2400d.m2119d(c0900j.f2399c)) {
                c0900j.f2404h = C0902l.f2409d;
                if (abstractC0918al instanceof C0909ac) {
                    Iterator it = ((C0909ac) abstractC0918al).m2019a(c0900j.f2399c, c0900j.f2400d).iterator();
                    while (it.hasNext()) {
                        c0900j.f2402f = (C0915ai) it.next();
                        c0900j.f2404h = C0902l.f2408c;
                        c0900j.m2002a();
                    }
                } else {
                    c0900j.f2402f = abstractC0918al.m2094o();
                    c0900j.f2403g = c0900j.f2402f.m2063c().indexOf(abstractC0918al);
                    if (c0900j.f2403g < 0) {
                        throw new RuntimeException("insn not found in it's own block");
                    }
                    c0900j.f2404h = C0902l.f2406a;
                    c0900j.m2002a();
                }
            }
            while (true) {
                int iNextSetBit = c0900j.f2398b.nextSetBit(0);
                if (iNextSetBit >= 0) {
                    c0900j.f2402f = (C0915ai) c0900j.f2400d.m2126j().get(iNextSetBit);
                    c0900j.f2398b.clear(iNextSetBit);
                    c0900j.f2404h = C0902l.f2408c;
                    c0900j.m2002a();
                }
            }
        }
        m2003a(c0920an, c0899i);
        return c0899i;
    }

    /* JADX INFO: renamed from: a */
    private void m2002a() {
        while (this.f2404h != C0902l.f2409d) {
            switch (C0901k.f2405a[this.f2404h - 1]) {
                case 1:
                    this.f2404h = C0902l.f2409d;
                    if (this.f2403g != 0) {
                        this.f2403g--;
                        this.f2404h = C0902l.f2407b;
                    } else {
                        this.f2402f.m2067d(this.f2399c);
                        this.f2398b.or(this.f2402f.m2071g());
                    }
                    break;
                case 2:
                    this.f2404h = C0902l.f2409d;
                    AbstractC0918al abstractC0918al = (AbstractC0918al) this.f2402f.m2063c().get(this.f2403g);
                    C0848r c0848rM2093n = abstractC0918al.m2093n();
                    if (!abstractC0918al.m2088b(this.f2399c)) {
                        if (c0848rM2093n != null) {
                            this.f2401e.m1999a(this.f2399c, c0848rM2093n.m1795g());
                        }
                        this.f2404h = C0902l.f2406a;
                    }
                    break;
                case 3:
                    this.f2404h = C0902l.f2409d;
                    if (!this.f2397a.get(this.f2402f.m2068e())) {
                        this.f2397a.set(this.f2402f.m2068e());
                        this.f2402f.m2064c(this.f2399c);
                        this.f2403g = this.f2402f.m2063c().size() - 1;
                        this.f2404h = C0902l.f2407b;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m2003a(C0920an c0920an, C0899i c0899i) {
        Iterator it = c0920an.m2126j().iterator();
        while (it.hasNext()) {
            List listM2066d = ((C0915ai) it.next()).m2066d();
            int size = listM2066d.size();
            for (int i = 0; i < size; i++) {
                for (int i2 = 0; i2 < size; i2++) {
                    if (i != i2) {
                        c0899i.m1999a(((AbstractC0918al) listM2066d.get(i)).m2093n().m1795g(), ((AbstractC0918al) listM2066d.get(i2)).m2093n().m1795g());
                    }
                }
            }
        }
    }
}
