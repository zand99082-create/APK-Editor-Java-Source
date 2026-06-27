package com.p046a.p049b.p071g;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p066f.p068b.AbstractC0839i;
import com.p046a.p049b.p066f.p068b.C0827a;
import com.p046a.p049b.p066f.p068b.C0833c;
import com.p046a.p049b.p066f.p068b.C0842l;
import com.p046a.p049b.p066f.p068b.C0847q;
import com.p046a.p049b.p066f.p068b.C0848r;
import com.p046a.p049b.p066f.p068b.C0850t;
import com.p046a.p049b.p066f.p068b.C0854x;
import com.p046a.p049b.p066f.p068b.C0855y;
import com.p046a.p049b.p066f.p068b.C0856z;
import com.p046a.p049b.p073h.C0962j;
import com.p046a.p049b.p073h.InterfaceC0963k;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.a.b.g.ai */
/* JADX INFO: loaded from: classes.dex */
public final class C0915ai {

    /* JADX INFO: renamed from: b */
    private BitSet f2444b;

    /* JADX INFO: renamed from: c */
    private BitSet f2445c;

    /* JADX INFO: renamed from: f */
    private int f2448f;

    /* JADX INFO: renamed from: g */
    private C0920an f2449g;

    /* JADX INFO: renamed from: h */
    private int f2450h;

    /* JADX INFO: renamed from: m */
    private InterfaceC0963k f2455m;

    /* JADX INFO: renamed from: n */
    private InterfaceC0963k f2456n;

    /* JADX INFO: renamed from: e */
    private int f2447e = -1;

    /* JADX INFO: renamed from: j */
    private int f2452j = 0;

    /* JADX INFO: renamed from: k */
    private int f2453k = 0;

    /* JADX INFO: renamed from: l */
    private int f2454l = -1;

    /* JADX INFO: renamed from: a */
    private ArrayList f2443a = new ArrayList();

    /* JADX INFO: renamed from: d */
    private C0962j f2446d = new C0962j();

    /* JADX INFO: renamed from: i */
    private final ArrayList f2451i = new ArrayList();

    static {
        new C0916aj();
    }

    public C0915ai(int i, int i2, C0920an c0920an) {
        this.f2449g = c0920an;
        this.f2450h = i;
        this.f2448f = i2;
        this.f2444b = new BitSet(c0920an.m2126j().size());
        this.f2445c = new BitSet(c0920an.m2126j().size());
    }

    /* JADX INFO: renamed from: a */
    public static C0915ai m2044a(C0854x c0854x, int i, C0920an c0920an) {
        C0833c c0833cM1844a = c0854x.m1844a();
        C0827a c0827aM1737a = c0833cM1844a.m1737a(i);
        C0915ai c0915ai = new C0915ai(i, c0827aM1737a.mo821a(), c0920an);
        C0842l c0842lM1719b = c0827aM1737a.m1719b();
        c0915ai.f2443a.ensureCapacity(c0842lM1719b.m2239d_());
        int iD_ = c0842lM1719b.m2239d_();
        for (int i2 = 0; i2 < iD_; i2++) {
            c0915ai.f2443a.add(new C0952z(c0842lM1719b.m1759a(i2), c0915ai));
        }
        c0915ai.f2444b = C0920an.m2096a(c0833cM1844a, c0854x.m1845a(c0827aM1737a.mo821a()));
        c0915ai.f2445c = C0920an.m2096a(c0833cM1844a, c0827aM1737a.m1720c());
        C0962j c0962jM1720c = c0827aM1737a.m1720c();
        C0962j c0962j = new C0962j(c0962jM1720c.m2247b());
        int iM2247b = c0962jM1720c.m2247b();
        for (int i3 = 0; i3 < iM2247b; i3++) {
            c0962j.m2250c(c0833cM1844a.m2262c(c0962jM1720c.m2248b(i3)));
        }
        c0915ai.f2446d = c0962j;
        if (c0915ai.f2446d.m2247b() != 0) {
            int iM1721d = c0827aM1737a.m1721d();
            c0915ai.f2447e = iM1721d < 0 ? -1 : c0833cM1844a.m2262c(iM1721d);
        }
        return c0915ai;
    }

    /* JADX INFO: renamed from: a */
    private static void m2045a(BitSet bitSet, C0848r c0848r) {
        bitSet.set(c0848r.m1795g());
        if (c0848r.m1799k() > 1) {
            bitSet.set(c0848r.m1795g() + 1);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m2046a(List list) {
        int size;
        AbstractC0918al abstractC0918al;
        int i;
        BitSet bitSet = new BitSet(this.f2449g.m2123g());
        BitSet bitSet2 = new BitSet(this.f2449g.m2123g());
        int size2 = list.size();
        int i2 = 0;
        while (i2 < size2) {
            for (int i3 = i2; i3 < size2; i3++) {
                m2045a(bitSet, ((AbstractC0918al) list.get(i3)).mo2018a().m1815b(0));
                m2045a(bitSet2, ((AbstractC0918al) list.get(i3)).m2093n());
            }
            int i4 = i2;
            int i5 = i2;
            while (i4 < size2) {
                if (m2047b(bitSet, ((AbstractC0918al) list.get(i4)).m2093n())) {
                    i = i5;
                } else {
                    i = i5 + 1;
                    Collections.swap(list, i4, i5);
                }
                i4++;
                i5 = i;
            }
            if (i2 == i5) {
                int i6 = i5;
                while (true) {
                    if (i6 >= size2) {
                        abstractC0918al = null;
                        break;
                    }
                    abstractC0918al = (AbstractC0918al) list.get(i6);
                    if (m2047b(bitSet, abstractC0918al.m2093n()) && m2047b(bitSet2, abstractC0918al.mo2018a().m1815b(0))) {
                        Collections.swap(list, i5, i6);
                        break;
                    }
                    i6++;
                }
                C0848r c0848rM2093n = abstractC0918al.m2093n();
                C0848r c0848rM1787a = c0848rM2093n.m1787a(this.f2449g.m2113b(c0848rM2093n.m1799k()));
                C0952z c0952z = new C0952z(new C0847q(C0855y.m1849a(c0848rM2093n.mo925a()), C0856z.f2229a, c0848rM1787a, abstractC0918al.mo2018a()), this);
                int i7 = i5 + 1;
                list.add(i5, c0952z);
                list.set(i7, new C0952z(new C0847q(C0855y.m1849a(c0848rM2093n.mo925a()), C0856z.f2229a, c0848rM2093n, C0850t.m1808a(c0848rM1787a)), this));
                size = list.size();
                i5 = i7;
            } else {
                size = size2;
            }
            bitSet.clear();
            bitSet2.clear();
            i2 = i5;
            size2 = size;
        }
    }

    /* JADX INFO: renamed from: b */
    private static boolean m2047b(BitSet bitSet, C0848r c0848r) {
        int iM1795g = c0848r.m1795g();
        return bitSet.get(iM1795g) || (c0848r.m1799k() == 2 && bitSet.get(iM1795g + 1));
    }

    /* JADX INFO: renamed from: t */
    private int m2049t() {
        int size = this.f2443a.size();
        int i = 0;
        while (i < size && (((AbstractC0918al) this.f2443a.get(i)) instanceof C0909ac)) {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    public final ArrayList m2050a() {
        return this.f2451i;
    }

    /* JADX INFO: renamed from: a */
    public final void m2051a(int i) {
        this.f2443a.add(0, new C0909ac(i, this));
    }

    /* JADX INFO: renamed from: a */
    public final void m2052a(int i, int i2) {
        if (i == i2) {
            return;
        }
        this.f2445c.set(i2);
        if (this.f2447e == i) {
            this.f2447e = i2;
        }
        for (int iM2247b = this.f2446d.m2247b() - 1; iM2247b >= 0; iM2247b--) {
            if (this.f2446d.m2248b(iM2247b) == i) {
                this.f2446d.m2249b(iM2247b, i2);
            }
        }
        this.f2445c.clear(i);
        ((C0915ai) this.f2449g.m2126j().get(i2)).f2444b.set(this.f2450h);
        ((C0915ai) this.f2449g.m2126j().get(i)).f2444b.clear(this.f2450h);
    }

    /* JADX INFO: renamed from: a */
    public final void m2053a(AbstractC0839i abstractC0839i) {
        AbstractC0918al abstractC0918alM2084a = AbstractC0918al.m2084a(abstractC0839i, this);
        this.f2443a.add(m2049t(), abstractC0918alM2084a);
        this.f2449g.m2105a(abstractC0918alM2084a);
    }

    /* JADX INFO: renamed from: a */
    public final void m2054a(C0848r c0848r) {
        this.f2443a.add(0, new C0909ac(c0848r, this));
    }

    /* JADX INFO: renamed from: a */
    public final void m2055a(C0848r c0848r, C0848r c0848r2) {
        if (c0848r.m1795g() == c0848r2.m1795g()) {
            return;
        }
        C0952z c0952z = (C0952z) this.f2443a.get(this.f2443a.size() - 1);
        if (c0952z.m2093n() == null && c0952z.mo2018a().m2239d_() <= 0) {
            this.f2443a.add(this.f2443a.size() - 1, new C0952z(new C0847q(C0855y.m1849a(c0848r.mo925a()), C0856z.f2229a, c0848r, C0850t.m1808a(c0848r2)), this));
            this.f2452j++;
            return;
        }
        int iNextSetBit = this.f2445c.nextSetBit(0);
        while (iNextSetBit >= 0) {
            C0915ai c0915ai = (C0915ai) this.f2449g.m2126j().get(iNextSetBit);
            if (c0848r.m1795g() != c0848r2.m1795g()) {
                c0915ai.f2443a.add(c0915ai.m2049t(), new C0952z(new C0847q(C0855y.m1849a(c0848r.mo925a()), C0856z.f2229a, c0848r, C0850t.m1808a(c0848r2)), c0915ai));
                c0915ai.f2453k++;
            }
            iNextSetBit = this.f2445c.nextSetBit(iNextSetBit + 1);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2056a(InterfaceC0911ae interfaceC0911ae) {
        int size = this.f2443a.size();
        for (int i = 0; i < size; i++) {
            AbstractC0918al abstractC0918al = (AbstractC0918al) this.f2443a.get(i);
            if (!(abstractC0918al instanceof C0909ac)) {
                return;
            }
            interfaceC0911ae.mo2011a((C0909ac) abstractC0918al);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2057a(C0915ai c0915ai) {
        this.f2451i.add(c0915ai);
    }

    /* JADX INFO: renamed from: a */
    public final void m2058a(InterfaceC0919am interfaceC0919am) {
        int size = this.f2443a.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0918al) this.f2443a.get(i)).mo2024a(interfaceC0919am);
        }
    }

    /* JADX INFO: renamed from: b */
    public final C0915ai m2059b(C0915ai c0915ai) {
        C0915ai c0915aiM2114b = this.f2449g.m2114b();
        if (!this.f2445c.get(c0915ai.f2450h)) {
            throw new RuntimeException("Block " + C1067a.m2558v(c0915ai.f2448f) + " not successor of " + C1067a.m2558v(this.f2448f));
        }
        c0915aiM2114b.f2444b.set(this.f2450h);
        c0915aiM2114b.f2445c.set(c0915ai.f2450h);
        c0915aiM2114b.f2446d.m2250c(c0915ai.f2450h);
        c0915aiM2114b.f2447e = c0915ai.f2450h;
        for (int iM2247b = this.f2446d.m2247b() - 1; iM2247b >= 0; iM2247b--) {
            if (this.f2446d.m2248b(iM2247b) == c0915ai.f2450h) {
                this.f2446d.m2249b(iM2247b, c0915aiM2114b.f2450h);
            }
        }
        if (this.f2447e == c0915ai.f2450h) {
            this.f2447e = c0915aiM2114b.f2450h;
        }
        this.f2445c.clear(c0915ai.f2450h);
        this.f2445c.set(c0915aiM2114b.f2450h);
        c0915ai.f2444b.set(c0915aiM2114b.f2450h);
        c0915ai.f2444b.set(this.f2450h, this.f2445c.get(c0915ai.f2450h));
        return c0915aiM2114b;
    }

    /* JADX INFO: renamed from: b */
    public final void m2060b() {
        this.f2443a.subList(0, m2049t()).clear();
    }

    /* JADX INFO: renamed from: b */
    public final void m2061b(int i) {
        int i2 = 0;
        for (int iM2247b = this.f2446d.m2247b() - 1; iM2247b >= 0; iM2247b--) {
            if (this.f2446d.m2248b(iM2247b) == i) {
                i2 = iM2247b;
            } else {
                this.f2447e = this.f2446d.m2248b(iM2247b);
            }
        }
        this.f2446d.m2253d(i2);
        this.f2445c.clear(i);
        ((C0915ai) this.f2449g.m2126j().get(i)).f2444b.clear(this.f2450h);
    }

    /* JADX INFO: renamed from: b */
    public final void m2062b(AbstractC0839i abstractC0839i) {
        if (abstractC0839i.m1752f().m1839d() == 1) {
            throw new IllegalArgumentException("last insn must branch");
        }
        AbstractC0918al abstractC0918al = (AbstractC0918al) this.f2443a.get(this.f2443a.size() - 1);
        AbstractC0918al abstractC0918alM2084a = AbstractC0918al.m2084a(abstractC0839i, this);
        this.f2443a.set(this.f2443a.size() - 1, abstractC0918alM2084a);
        this.f2449g.m2115b(abstractC0918al);
        this.f2449g.m2105a(abstractC0918alM2084a);
    }

    /* JADX INFO: renamed from: c */
    public final ArrayList m2063c() {
        return this.f2443a;
    }

    /* JADX INFO: renamed from: c */
    public final void m2064c(int i) {
        if (this.f2456n == null) {
            this.f2456n = C0931e.m2160b(this.f2449g.m2123g());
        }
        this.f2456n.mo2206a(i);
    }

    /* JADX INFO: renamed from: c */
    public final void m2065c(C0915ai c0915ai) {
        if (this != c0915ai && this.f2446d.m2247b() == 0) {
            this.f2445c.set(c0915ai.f2450h);
            this.f2446d.m2250c(c0915ai.f2450h);
            this.f2447e = c0915ai.f2450h;
            c0915ai.f2444b.set(this.f2450h);
        }
    }

    /* JADX INFO: renamed from: d */
    public final List m2066d() {
        return this.f2443a.subList(0, m2049t());
    }

    /* JADX INFO: renamed from: d */
    public final void m2067d(int i) {
        if (this.f2455m == null) {
            this.f2455m = C0931e.m2160b(this.f2449g.m2123g());
        }
        this.f2455m.mo2206a(i);
    }

    /* JADX INFO: renamed from: e */
    public final int m2068e() {
        return this.f2450h;
    }

    /* JADX INFO: renamed from: e */
    public final void m2069e(int i) {
        this.f2454l = i;
    }

    /* JADX INFO: renamed from: f */
    public final int m2070f() {
        return this.f2448f;
    }

    /* JADX INFO: renamed from: g */
    public final BitSet m2071g() {
        return this.f2444b;
    }

    /* JADX INFO: renamed from: h */
    public final BitSet m2072h() {
        return this.f2445c;
    }

    /* JADX INFO: renamed from: i */
    public final C0962j m2073i() {
        return this.f2446d;
    }

    /* JADX INFO: renamed from: j */
    public final int m2074j() {
        return this.f2447e;
    }

    /* JADX INFO: renamed from: k */
    public final int m2075k() {
        return this.f2449g.m2101a(this.f2447e);
    }

    /* JADX INFO: renamed from: l */
    public final C0915ai m2076l() {
        if (this.f2447e < 0) {
            return null;
        }
        return (C0915ai) this.f2449g.m2126j().get(this.f2447e);
    }

    /* JADX INFO: renamed from: m */
    public final C0962j m2077m() {
        C0962j c0962j = new C0962j(this.f2446d.m2247b());
        int iM2247b = this.f2446d.m2247b();
        for (int i = 0; i < iM2247b; i++) {
            c0962j.m2250c(this.f2449g.m2101a(this.f2446d.m2248b(i)));
        }
        return c0962j;
    }

    /* JADX INFO: renamed from: n */
    public final C0920an m2078n() {
        return this.f2449g;
    }

    /* JADX INFO: renamed from: o */
    public final C0915ai m2079o() {
        C0915ai c0915aiM2114b = this.f2449g.m2114b();
        c0915aiM2114b.f2444b = this.f2444b;
        c0915aiM2114b.f2445c.set(this.f2450h);
        c0915aiM2114b.f2446d.m2250c(this.f2450h);
        c0915aiM2114b.f2447e = this.f2450h;
        this.f2444b = new BitSet(this.f2449g.m2126j().size());
        this.f2444b.set(c0915aiM2114b.f2450h);
        for (int iNextSetBit = c0915aiM2114b.f2444b.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = c0915aiM2114b.f2444b.nextSetBit(iNextSetBit + 1)) {
            ((C0915ai) this.f2449g.m2126j().get(iNextSetBit)).m2052a(this.f2450h, c0915aiM2114b.f2450h);
        }
        return c0915aiM2114b;
    }

    /* JADX INFO: renamed from: p */
    public final InterfaceC0963k m2080p() {
        if (this.f2456n == null) {
            this.f2456n = C0931e.m2160b(this.f2449g.m2123g());
        }
        return this.f2456n;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m2081q() {
        return this.f2450h == this.f2449g.m2120e();
    }

    /* JADX INFO: renamed from: r */
    public final boolean m2082r() {
        if (this.f2454l == -1) {
            this.f2449g.m2128l();
        }
        return this.f2454l == 1;
    }

    /* JADX INFO: renamed from: s */
    public final void m2083s() {
        if (this.f2453k > 1) {
            m2046a(this.f2443a.subList(0, this.f2453k));
            if (((AbstractC0918al) this.f2443a.get(this.f2453k)).mo2092i()) {
                throw new RuntimeException("Unexpected: moves from phis before move-exception");
            }
        }
        if (this.f2452j > 1) {
            m2046a(this.f2443a.subList((this.f2443a.size() - this.f2452j) - 1, this.f2443a.size() - 1));
        }
        this.f2449g.m2125i();
    }

    public final String toString() {
        return "{" + this.f2450h + ":" + C1067a.m2558v(this.f2448f) + '}';
    }
}
