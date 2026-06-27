package com.p046a.p049b.p071g.p072a;

import com.p046a.p049b.p066f.p068b.AbstractC0835e;
import com.p046a.p049b.p066f.p068b.C0843m;
import com.p046a.p049b.p066f.p068b.C0848r;
import com.p046a.p049b.p066f.p068b.C0850t;
import com.p046a.p049b.p066f.p068b.C0853w;
import com.p046a.p049b.p066f.p069c.C0872n;
import com.p046a.p049b.p071g.AbstractC0913ag;
import com.p046a.p049b.p071g.AbstractC0918al;
import com.p046a.p049b.p071g.C0909ac;
import com.p046a.p049b.p071g.C0915ai;
import com.p046a.p049b.p071g.C0920an;
import com.p046a.p049b.p071g.C0944r;
import com.p046a.p049b.p071g.C0952z;
import com.p046a.p049b.p073h.InterfaceC0961i;
import com.p046a.p049b.p073h.InterfaceC0963k;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.a.b.g.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0891a extends AbstractC0903m {

    /* JADX INFO: renamed from: b */
    private final Map f2377b;

    /* JADX INFO: renamed from: c */
    private final ArrayList f2378c;

    /* JADX INFO: renamed from: d */
    private final ArrayList f2379d;

    /* JADX INFO: renamed from: e */
    private final ArrayList f2380e;

    /* JADX INFO: renamed from: f */
    private final BitSet f2381f;

    /* JADX INFO: renamed from: g */
    private final C0944r f2382g;

    /* JADX INFO: renamed from: h */
    private final int f2383h;

    /* JADX INFO: renamed from: i */
    private final BitSet f2384i;

    /* JADX INFO: renamed from: j */
    private final BitSet f2385j;

    public C0891a(C0920an c0920an, C0899i c0899i, boolean z) {
        super(c0920an, c0899i);
        this.f2381f = new BitSet(c0920an.m2123g());
        this.f2382g = new C0944r(c0899i, c0920an.m2123g());
        this.f2383h = c0920an.m2124h();
        this.f2384i = new BitSet(this.f2383h << 1);
        this.f2384i.set(0, this.f2383h);
        this.f2385j = new BitSet(this.f2383h << 1);
        this.f2377b = new TreeMap();
        this.f2378c = new ArrayList();
        this.f2379d = new ArrayList();
        this.f2380e = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    private int m1964a(int i, int i2, EnumC0893c enumC0893c) {
        int iMo1993a = enumC0893c.mo1993a(this.f2384i, i);
        while (true) {
            int i3 = 1;
            while (i3 < i2 && !this.f2384i.get(iMo1993a + i3)) {
                i3++;
            }
            if (i3 == i2) {
                return iMo1993a;
            }
            iMo1993a = enumC0893c.mo1993a(this.f2384i, iMo1993a + i3);
        }
    }

    /* JADX INFO: renamed from: a */
    private int m1965a(int i, C0952z c0952z, int[] iArr, BitSet bitSet) {
        C0850t c0850tMo2018a = c0952z.mo2018a();
        int iD_ = c0850tMo2018a.m2239d_();
        InterfaceC0963k interfaceC0963kM2080p = c0952z.m2094o().m2080p();
        C0850t c0850t = new C0850t(interfaceC0963kM2080p.mo2205a());
        InterfaceC0961i interfaceC0961iMo2208b = interfaceC0963kM2080p.mo2208b();
        int i2 = 0;
        while (interfaceC0961iMo2208b.mo2210a()) {
            c0850t.m1814a(i2, m2006b(interfaceC0961iMo2208b.mo2211b()));
            i2++;
        }
        BitSet bitSet2 = new BitSet(this.f2411a.m2123g());
        int i3 = 0;
        int i4 = i;
        for (int i5 = 0; i5 < iD_; i5++) {
            C0848r c0848rM1815b = c0850tMo2018a.m1815b(i5);
            int iM1795g = c0848rM1815b.m1795g();
            int i6 = iArr[i5];
            if (i5 != 0) {
                i4 += iArr[i5 - 1];
            }
            if (this.f2381f.get(iM1795g) && this.f2382g.m1961a(iM1795g) == i4) {
                i3 += i6;
            } else {
                if (m1976b(i4, i6)) {
                    return -1;
                }
                if (this.f2381f.get(iM1795g) || !m1970a(c0848rM1815b, i4) || bitSet2.get(iM1795g)) {
                    if (this.f2382g.m2185a(c0850t, i4, i6) || this.f2382g.m2185a(c0850tMo2018a, i4, i6)) {
                        return -1;
                    }
                    bitSet.set(i5);
                } else {
                    i3 += i6;
                }
            }
            bitSet2.set(iM1795g);
        }
        return i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004c  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int m1966a(C0952z c0952z, int i, int[] iArr, BitSet bitSet) {
        EnumC0893c enumC0893c;
        int i2 = 0;
        EnumC0893c enumC0893c2 = EnumC0893c.f2389c;
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            if (i5 == 2) {
                if (m1987f(i4)) {
                    i3++;
                } else {
                    i2++;
                }
                i4 += 2;
            } else {
                i4++;
            }
        }
        if (i2 > i3) {
            enumC0893c = !m1987f(this.f2383h) ? EnumC0893c.f2387a : EnumC0893c.f2388b;
        } else if (i3 <= 0) {
            enumC0893c = enumC0893c2;
        } else if (m1987f(this.f2383h)) {
            enumC0893c = EnumC0893c.f2387a;
        }
        int i6 = this.f2383h;
        while (true) {
            int iM1964a = m1964a(i6, i, enumC0893c);
            if (m1965a(iM1964a, c0952z, iArr, bitSet) >= 0) {
                return iM1964a;
            }
            i6 = iM1964a + 1;
            bitSet.clear();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m1968a(int i, int i2) {
        this.f2384i.set(i, i + i2, true);
    }

    /* JADX INFO: renamed from: a */
    private boolean m1970a(C0848r c0848r, int i) {
        return (m1984d(i, c0848r.m1799k()) || this.f2382g.m2184a(c0848r, i)) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    private boolean m1971a(C0848r c0848r, int i, int i2) {
        if (c0848r.m1799k() > i2 || this.f2381f.get(c0848r.m1795g()) || !m1970a(c0848r, i)) {
            return false;
        }
        m1975b(c0848r, i);
        return true;
    }

    /* JADX INFO: renamed from: a */
    private boolean m1972a(ArrayList arrayList, int i, int i2, boolean z) {
        Iterator it = arrayList.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            C0848r c0848r = (C0848r) it.next();
            if (!this.f2381f.get(c0848r.m1795g())) {
                boolean zM1971a = m1971a(c0848r, i, i2);
                z2 = !zM1971a || z2;
                if (zM1971a && z) {
                    m1968a(i, c0848r.m1799k());
                }
            }
        }
        return !z2;
    }

    /* JADX INFO: renamed from: b */
    private void m1974b() {
        int i;
        boolean z;
        for (ArrayList arrayList : this.f2377b.values()) {
            boolean z2 = false;
            int i2 = this.f2383h;
            while (true) {
                int size = arrayList.size();
                int i3 = 0;
                int i4 = 1;
                while (i3 < size) {
                    C0848r c0848r = (C0848r) arrayList.get(i3);
                    int iM1799k = c0848r.m1799k();
                    i3++;
                    i4 = (this.f2381f.get(c0848r.m1795g()) || iM1799k <= i4) ? i4 : iM1799k;
                }
                EnumC0893c enumC0893cM1981d = m1981d(i4);
                int iMo1993a = enumC0893cM1981d.mo1993a(this.f2385j, i2);
                while (true) {
                    i = iMo1993a;
                    int i5 = 1;
                    while (i5 < i4 && !this.f2385j.get(i + i5)) {
                        i5++;
                    }
                    if (i5 == i4) {
                        break;
                    } else {
                        iMo1993a = enumC0893cM1981d.mo1993a(this.f2385j, i5 + i);
                    }
                }
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    }
                    C0848r c0848r2 = (C0848r) it.next();
                    if (!this.f2381f.get(c0848r2.m1795g()) && !m1970a(c0848r2, i)) {
                        z = false;
                        break;
                    }
                }
                boolean zM1972a = z ? m1972a(arrayList, i, i4, true) : z2;
                int i6 = i + 1;
                if (!zM1972a) {
                    i2 = i6;
                    z2 = zM1972a;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m1975b(C0848r c0848r, int i) {
        int iM1795g = c0848r.m1795g();
        if (this.f2381f.get(iM1795g) || !m1970a(c0848r, i)) {
            throw new RuntimeException("attempt to add invalid register mapping");
        }
        int iM1799k = c0848r.m1799k();
        this.f2382g.mo1963a(c0848r.m1795g(), i, iM1799k);
        this.f2381f.set(iM1795g);
        this.f2385j.set(i, iM1799k + i);
    }

    /* JADX INFO: renamed from: b */
    private boolean m1976b(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            if (this.f2384i.get(i3)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    private int m1977c(int i) {
        C0853w c0853wMo2027c;
        AbstractC0918al abstractC0918alM2117c = this.f2411a.m2117c(i);
        if (abstractC0918alM2117c == null || (c0853wMo2027c = abstractC0918alM2117c.mo2027c()) == null || c0853wMo2027c.m1836a() != 3) {
            return -1;
        }
        return ((C0872n) ((AbstractC0835e) abstractC0918alM2117c.mo2028e()).m1748g_()).mo1894j();
    }

    /* JADX INFO: renamed from: c */
    private int m1978c(int i, int i2) {
        return m1964a(i, i2, m1981d(i2));
    }

    /* JADX INFO: renamed from: c */
    private void m1980c() {
        for (C0952z c0952z : this.f2378c) {
            C0848r c0848rN = c0952z.m2093n();
            int iM1795g = c0848rN.m1795g();
            BitSet bitSetM2071g = c0952z.m2094o().m2071g();
            if (bitSetM2071g.cardinality() == 1) {
                AbstractC0918al abstractC0918al = (AbstractC0918al) ((C0915ai) this.f2411a.m2126j().get(bitSetM2071g.nextSetBit(0))).m2063c().get(r0.size() - 1);
                if (abstractC0918al.mo2027c().m1836a() == 43) {
                    C0848r c0848rM1815b = abstractC0918al.mo2018a().m1815b(0);
                    int iM1795g2 = c0848rM1815b.m1795g();
                    int iM1799k = c0848rM1815b.m1799k();
                    boolean zM1971a = this.f2381f.get(iM1795g);
                    boolean z = this.f2381f.get(iM1795g2);
                    boolean zM1971a2 = (!z) & zM1971a ? m1971a(c0848rM1815b, this.f2382g.m1961a(iM1795g), iM1799k) : z;
                    if ((!zM1971a) & zM1971a2) {
                        zM1971a = m1971a(c0848rN, this.f2382g.m1961a(iM1795g2), iM1799k);
                    }
                    if (!zM1971a || !zM1971a2) {
                        int iM1978c = m1978c(this.f2383h, iM1799k);
                        ArrayList arrayList = new ArrayList(2);
                        arrayList.add(c0848rN);
                        arrayList.add(c0848rM1815b);
                        while (!m1972a(arrayList, iM1978c, iM1799k, false)) {
                            iM1978c = m1978c(iM1978c + 1, iM1799k);
                        }
                    }
                    boolean z2 = abstractC0918al.mo2028e().mo1732b().mo1021d_() != 0;
                    int iA = this.f2382g.m1961a(iM1795g);
                    if (iA != this.f2382g.m1961a(iM1795g2) && !z2) {
                        ((C0952z) abstractC0918al).m2201a(0, m2005a(abstractC0918al, c0848rM1815b));
                        m1975b(abstractC0918al.mo2018a().m1815b(0), iA);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private EnumC0893c m1981d(int i) {
        return i == 2 ? m1987f(this.f2383h) ? EnumC0893c.f2387a : EnumC0893c.f2388b : EnumC0893c.f2389c;
    }

    /* JADX INFO: renamed from: d */
    private void m1983d() {
        for (C0909ac c0909ac : this.f2380e) {
            C0848r c0848rN = c0909ac.m2093n();
            int iM1795g = c0848rN.m1795g();
            int iM1799k = c0848rN.m1799k();
            C0850t c0850tMo2018a = c0909ac.mo2018a();
            int iD_ = c0850tMo2018a.m2239d_();
            ArrayList arrayList = new ArrayList();
            C0897g c0897g = new C0897g(iD_ + 1);
            if (this.f2381f.get(iM1795g)) {
                c0897g.m1995a(this.f2382g.m1961a(iM1795g));
            } else {
                arrayList.add(c0848rN);
            }
            for (int i = 0; i < iD_; i++) {
                C0848r c0848rM2093n = this.f2411a.m2117c(c0850tMo2018a.m1815b(i).m1795g()).m2093n();
                int iM1795g2 = c0848rM2093n.m1795g();
                if (this.f2381f.get(iM1795g2)) {
                    c0897g.m1995a(this.f2382g.m1961a(iM1795g2));
                } else {
                    arrayList.add(c0848rM2093n);
                }
            }
            for (int i2 = 0; i2 < c0897g.m1996b(); i2++) {
                m1972a(arrayList, c0897g.m1994a(), iM1799k, false);
            }
            int iM1978c = m1978c(this.f2383h, iM1799k);
            while (!m1972a(arrayList, iM1978c, iM1799k, false)) {
                iM1978c = m1978c(iM1978c + 1, iM1799k);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private boolean m1984d(int i, int i2) {
        return i < this.f2383h && i + i2 > this.f2383h;
    }

    /* JADX INFO: renamed from: e */
    private C0843m m1985e(int i) {
        for (Map.Entry entry : this.f2377b.entrySet()) {
            Iterator it = ((ArrayList) entry.getValue()).iterator();
            while (it.hasNext()) {
                if (((C0848r) it.next()).m1795g() == i) {
                    return (C0843m) entry.getKey();
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    private void m1986e() {
        C0848r c0848rB;
        int iM2123g = this.f2411a.m2123g();
        for (int i = 0; i < iM2123g; i++) {
            if (!this.f2381f.get(i) && (c0848rB = m2006b(i)) != null) {
                int iM1799k = c0848rB.m1799k();
                int iM1978c = m1978c(this.f2383h, iM1799k);
                while (!m1970a(c0848rB, iM1978c)) {
                    iM1978c = m1978c(iM1978c + 1, iM1799k);
                }
                m1975b(c0848rB, iM1978c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static boolean m1987f(int i) {
        return (i & 1) == 0;
    }

    @Override // com.p046a.p049b.p071g.p072a.AbstractC0903m
    /* JADX INFO: renamed from: a */
    public final AbstractC0913ag mo1988a() {
        int iA;
        BitSet bitSet;
        int iM1965a;
        int i;
        int i2;
        this.f2411a.m2109a(new C0892b(this));
        for (ArrayList arrayList : this.f2377b.values()) {
            int size = arrayList.size();
            int i3 = 0;
            int i4 = -1;
            while (true) {
                if (i3 >= size) {
                    i = i4;
                    i2 = 0;
                    break;
                }
                C0848r c0848r = (C0848r) arrayList.get(i3);
                int iM1977c = m1977c(c0848r.m1795g());
                if (iM1977c >= 0) {
                    int iM1799k = c0848r.m1799k();
                    m1975b(c0848r, iM1977c);
                    i2 = iM1799k;
                    i = iM1977c;
                    break;
                }
                i3++;
                i4 = iM1977c;
            }
            if (i >= 0) {
                m1972a(arrayList, i, i2, true);
            }
        }
        int iM2123g = this.f2411a.m2123g();
        for (int i5 = 0; i5 < iM2123g; i5++) {
            if (!this.f2381f.get(i5)) {
                int iM1977c2 = m1977c(i5);
                C0848r c0848rB = m2006b(i5);
                if (iM1977c2 >= 0) {
                    m1975b(c0848rB, iM1977c2);
                }
            }
        }
        for (C0952z c0952z : this.f2379d) {
            C0850t c0850tMo2018a = c0952z.mo2018a();
            int iD_ = c0850tMo2018a.m2239d_();
            int[] iArr = new int[iD_];
            int i6 = 0;
            int i7 = 0;
            while (i6 < iD_) {
                iArr[i6] = c0850tMo2018a.m1815b(i6).m1799k();
                int i8 = iArr[i6] + i7;
                i6++;
                i7 = i8;
            }
            int i9 = 0;
            BitSet bitSet2 = null;
            int iM1966a = -1;
            int i10 = Integer.MIN_VALUE;
            for (int i11 = 0; i11 < iD_; i11++) {
                int iM1795g = c0850tMo2018a.m1815b(i11).m1795g();
                if (i11 != 0) {
                    i9 -= iArr[i11 - 1];
                }
                if (this.f2381f.get(iM1795g) && (iA = this.f2382g.m1961a(iM1795g) + i9) >= 0 && !m1984d(iA, i7) && (iM1965a = m1965a(iA, c0952z, iArr, (bitSet = new BitSet(iD_)))) >= 0) {
                    int iCardinality = iM1965a - bitSet.cardinality();
                    if (iCardinality > i10) {
                        bitSet2 = bitSet;
                        iM1966a = iA;
                        i10 = iCardinality;
                    }
                    if (iM1965a == i7) {
                        break;
                    }
                }
            }
            if (iM1966a == -1) {
                bitSet2 = new BitSet(iD_);
                iM1966a = m1966a(c0952z, i7, iArr, bitSet2);
            }
            for (int iNextSetBit = bitSet2.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSet2.nextSetBit(iNextSetBit + 1)) {
                c0952z.m2201a(iNextSetBit, m2005a(c0952z, c0850tMo2018a.m1815b(iNextSetBit)));
            }
            C0850t c0850tMo2018a2 = c0952z.mo2018a();
            int iD_2 = c0850tMo2018a2.m2239d_();
            for (int i12 = 0; i12 < iD_2; i12++) {
                C0848r c0848rM1815b = c0850tMo2018a2.m1815b(i12);
                int iM1795g2 = c0848rM1815b.m1795g();
                int iM1799k2 = c0848rM1815b.m1799k();
                int i13 = iM1966a + iM1799k2;
                if (!this.f2381f.get(iM1795g2)) {
                    C0843m c0843mM1985e = m1985e(iM1795g2);
                    m1975b(c0848rM1815b, iM1966a);
                    if (c0843mM1985e != null) {
                        m1968a(iM1966a, iM1799k2);
                        ArrayList arrayList2 = (ArrayList) this.f2377b.get(c0843mM1985e);
                        int size2 = arrayList2.size();
                        for (int i14 = 0; i14 < size2; i14++) {
                            C0848r c0848r2 = (C0848r) arrayList2.get(i14);
                            if (-1 == c0850tMo2018a2.m1817c(c0848r2.m1795g())) {
                                m1971a(c0848r2, iM1966a, iM1799k2);
                            }
                        }
                    }
                }
                iM1966a = i13;
            }
        }
        m1974b();
        m1980c();
        m1983d();
        m1986e();
        return this.f2382g;
    }
}
