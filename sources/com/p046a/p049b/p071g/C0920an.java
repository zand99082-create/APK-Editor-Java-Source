package com.p046a.p049b.p071g;

import com.p046a.p049b.p066f.p068b.AbstractC0839i;
import com.p046a.p049b.p066f.p068b.C0833c;
import com.p046a.p049b.p066f.p068b.C0847q;
import com.p046a.p049b.p066f.p068b.C0848r;
import com.p046a.p049b.p066f.p068b.C0850t;
import com.p046a.p049b.p066f.p068b.C0854x;
import com.p046a.p049b.p066f.p068b.C0855y;
import com.p046a.p049b.p066f.p068b.C0856z;
import com.p046a.p049b.p073h.C0962j;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Stack;

/* JADX INFO: renamed from: com.a.b.g.an */
/* JADX INFO: loaded from: classes.dex */
public final class C0920an {

    /* JADX INFO: renamed from: a */
    private ArrayList f2459a;

    /* JADX INFO: renamed from: b */
    private int f2460b;

    /* JADX INFO: renamed from: c */
    private int f2461c;

    /* JADX INFO: renamed from: d */
    private int f2462d;

    /* JADX INFO: renamed from: e */
    private int f2463e;

    /* JADX INFO: renamed from: f */
    private int f2464f;

    /* JADX INFO: renamed from: g */
    private int f2465g;

    /* JADX INFO: renamed from: h */
    private final int f2466h;

    /* JADX INFO: renamed from: i */
    private AbstractC0918al[] f2467i;

    /* JADX INFO: renamed from: j */
    private ArrayList[] f2468j;

    /* JADX INFO: renamed from: k */
    private List[] f2469k;

    /* JADX INFO: renamed from: l */
    private boolean f2470l = false;

    private C0920an(C0854x c0854x, int i, boolean z) {
        this.f2466h = i;
        this.f2465g = c0854x.m1844a().m2263j();
        this.f2462d = c0854x.m1844a().m1741e();
        this.f2463e = this.f2462d;
    }

    /* JADX INFO: renamed from: a */
    public static C0920an m2095a(C0854x c0854x, int i, boolean z) {
        C0920an c0920an = new C0920an(c0854x, i, z);
        int iD_ = c0854x.m1844a().m2239d_();
        c0920an.f2459a = new ArrayList(iD_ + 2);
        for (int i2 = 0; i2 < iD_; i2++) {
            c0920an.f2459a.add(C0915ai.m2044a(c0854x, i2, c0920an));
        }
        c0920an.f2460b = ((C0915ai) c0920an.f2459a.get(c0854x.m1844a().m2262c(c0854x.m1846b()))).m2079o().m2068e();
        c0920an.f2461c = -1;
        return c0920an;
    }

    /* JADX INFO: renamed from: a */
    static BitSet m2096a(C0833c c0833c, C0962j c0962j) {
        BitSet bitSet = new BitSet(c0833c.m2239d_());
        int iM2247b = c0962j.m2247b();
        for (int i = 0; i < iM2247b; i++) {
            bitSet.set(c0833c.m2262c(c0962j.m2248b(i)));
        }
        return bitSet;
    }

    /* JADX INFO: renamed from: b */
    private void m2098b(AbstractC0918al abstractC0918al, C0850t c0850t) {
        if (c0850t == null) {
            return;
        }
        int iD_ = c0850t.m2239d_();
        for (int i = 0; i < iD_; i++) {
            if (!this.f2468j[c0850t.m1815b(i).m1795g()].remove(abstractC0918al)) {
                throw new RuntimeException("use not found");
            }
        }
    }

    /* JADX INFO: renamed from: q */
    private void m2100q() {
        if (this.f2470l) {
            throw new RuntimeException("No use list in back mode");
        }
        this.f2468j = new ArrayList[this.f2462d];
        for (int i = 0; i < this.f2462d; i++) {
            this.f2468j[i] = new ArrayList();
        }
        m2109a(new C0922ap(this));
        this.f2469k = new List[this.f2462d];
        for (int i2 = 0; i2 < this.f2462d; i2++) {
            this.f2469k[i2] = Collections.unmodifiableList(this.f2468j[i2]);
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m2101a(int i) {
        if (i < 0) {
            return -1;
        }
        return ((C0915ai) this.f2459a.get(i)).m2070f();
    }

    /* JADX INFO: renamed from: a */
    final void m2102a() {
        if (this.f2461c >= 0) {
            throw new RuntimeException("must be called at most once");
        }
        this.f2461c = this.f2459a.size();
        int i = this.f2461c;
        int i2 = this.f2465g;
        this.f2465g = i2 + 1;
        C0915ai c0915ai = new C0915ai(i, i2, this);
        this.f2459a.add(c0915ai);
        Iterator it = this.f2459a.iterator();
        while (it.hasNext()) {
            ((C0915ai) it.next()).m2065c(c0915ai);
        }
        if (c0915ai.m2071g().cardinality() == 0) {
            this.f2459a.remove(this.f2461c);
            this.f2461c = -1;
            this.f2465g--;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2103a(AbstractC0913ag abstractC0913ag) {
        Iterator it = this.f2459a.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((C0915ai) it.next()).m2063c().iterator();
            while (it2.hasNext()) {
                ((AbstractC0918al) it2.next()).m2087b(abstractC0913ag);
            }
        }
        this.f2462d = abstractC0913ag.mo1960a();
        this.f2463e = this.f2462d;
    }

    /* JADX INFO: renamed from: a */
    public final void m2104a(InterfaceC0917ak interfaceC0917ak) {
        BitSet bitSet = new BitSet(this.f2459a.size());
        Stack stack = new Stack();
        stack.add(m2118d());
        while (stack.size() > 0) {
            C0915ai c0915ai = (C0915ai) stack.pop();
            ArrayList arrayListM2050a = c0915ai.m2050a();
            if (!bitSet.get(c0915ai.m2068e())) {
                for (int size = arrayListM2050a.size() - 1; size >= 0; size--) {
                    stack.add((C0915ai) arrayListM2050a.get(size));
                }
                bitSet.set(c0915ai.m2068e());
                interfaceC0917ak.mo2010a(c0915ai, null);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    final void m2105a(AbstractC0918al abstractC0918al) {
        m2108a(abstractC0918al, (C0850t) null);
        m2106a(abstractC0918al, (C0848r) null);
    }

    /* JADX INFO: renamed from: a */
    final void m2106a(AbstractC0918al abstractC0918al, C0848r c0848r) {
        if (this.f2467i == null) {
            return;
        }
        if (c0848r != null) {
            this.f2467i[c0848r.m1795g()] = null;
        }
        C0848r c0848rM2093n = abstractC0918al.m2093n();
        if (c0848rM2093n != null) {
            if (this.f2467i[c0848rM2093n.m1795g()] != null) {
                throw new RuntimeException("Duplicate add of insn");
            }
            this.f2467i[c0848rM2093n.m1795g()] = abstractC0918al;
        }
    }

    /* JADX INFO: renamed from: a */
    final void m2107a(AbstractC0918al abstractC0918al, C0848r c0848r, C0848r c0848r2) {
        if (this.f2468j == null) {
            return;
        }
        if (c0848r != null) {
            this.f2468j[c0848r.m1795g()].remove(abstractC0918al);
        }
        int iM1795g = c0848r2.m1795g();
        if (this.f2468j.length <= iM1795g) {
            this.f2468j = null;
        } else {
            this.f2468j[iM1795g].add(abstractC0918al);
        }
    }

    /* JADX INFO: renamed from: a */
    final void m2108a(AbstractC0918al abstractC0918al, C0850t c0850t) {
        if (this.f2468j == null) {
            return;
        }
        if (c0850t != null) {
            m2098b(abstractC0918al, c0850t);
        }
        C0850t c0850tMo2018a = abstractC0918al.mo2018a();
        int iD_ = c0850tMo2018a.m2239d_();
        for (int i = 0; i < iD_; i++) {
            this.f2468j[c0850tMo2018a.m1815b(i).m1795g()].add(abstractC0918al);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2109a(InterfaceC0919am interfaceC0919am) {
        Iterator it = this.f2459a.iterator();
        while (it.hasNext()) {
            ((C0915ai) it.next()).m2058a(interfaceC0919am);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2110a(Set set) {
        for (C0915ai c0915ai : this.f2459a) {
            ArrayList arrayListM2063c = c0915ai.m2063c();
            for (int size = arrayListM2063c.size() - 1; size >= 0; size--) {
                AbstractC0918al abstractC0918al = (AbstractC0918al) arrayListM2063c.get(size);
                if (set.contains(abstractC0918al)) {
                    m2115b(abstractC0918al);
                    arrayListM2063c.remove(size);
                }
            }
            int size2 = arrayListM2063c.size();
            AbstractC0918al abstractC0918al2 = size2 == 0 ? null : (AbstractC0918al) arrayListM2063c.get(size2 - 1);
            if (c0915ai != m2122f() && (size2 == 0 || abstractC0918al2.mo2028e() == null || abstractC0918al2.mo2028e().m1752f().m1839d() == 1)) {
                arrayListM2063c.add(AbstractC0918al.m2084a(new C0847q(C0855y.f2221s, C0856z.f2229a, (C0848r) null, C0850t.f2003a), c0915ai));
                BitSet bitSetM2072h = c0915ai.m2072h();
                for (int iNextSetBit = bitSetM2072h.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSetM2072h.nextSetBit(iNextSetBit + 1)) {
                    if (iNextSetBit != c0915ai.m2074j()) {
                        c0915ai.m2061b(iNextSetBit);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2111a(boolean z, InterfaceC0917ak interfaceC0917ak) {
        BitSet bitSet = new BitSet(this.f2459a.size());
        Stack stack = new Stack();
        C0915ai c0915aiM2122f = z ? m2122f() : m2118d();
        if (c0915aiM2122f == null) {
            return;
        }
        stack.add(null);
        stack.add(c0915aiM2122f);
        while (stack.size() > 0) {
            C0915ai c0915ai = (C0915ai) stack.pop();
            C0915ai c0915ai2 = (C0915ai) stack.pop();
            if (!bitSet.get(c0915ai.m2068e())) {
                BitSet bitSetM2071g = z ? c0915ai.m2071g() : c0915ai.m2072h();
                for (int iNextSetBit = bitSetM2071g.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSetM2071g.nextSetBit(iNextSetBit + 1)) {
                    stack.add(c0915ai);
                    stack.add(this.f2459a.get(iNextSetBit));
                }
                bitSet.set(c0915ai.m2068e());
                interfaceC0917ak.mo2010a(c0915ai, c0915ai2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m2112a(C0848r c0848r) {
        AbstractC0918al abstractC0918alM2117c = m2117c(c0848r.m1795g());
        if (abstractC0918alM2117c == null) {
            return false;
        }
        if (abstractC0918alM2117c.mo2090f() != null) {
            return true;
        }
        Iterator it = m2119d(c0848r.m1795g()).iterator();
        while (it.hasNext()) {
            AbstractC0839i abstractC0839iMo2028e = ((AbstractC0918al) it.next()).mo2028e();
            if (abstractC0839iMo2028e != null && abstractC0839iMo2028e.m1752f().m1836a() == 54) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final int m2113b(int i) {
        int i2 = this.f2463e + this.f2464f;
        this.f2464f += i;
        this.f2462d = Math.max(this.f2462d, i2 + i);
        return i2;
    }

    /* JADX INFO: renamed from: b */
    public final C0915ai m2114b() {
        int size = this.f2459a.size();
        int i = this.f2465g;
        this.f2465g = i + 1;
        C0915ai c0915ai = new C0915ai(size, i, this);
        c0915ai.m2063c().add(new C0952z(new C0847q(C0855y.f2221s, C0856z.f2229a, (C0848r) null, C0850t.f2003a), c0915ai));
        this.f2459a.add(c0915ai);
        return c0915ai;
    }

    /* JADX INFO: renamed from: b */
    final void m2115b(AbstractC0918al abstractC0918al) {
        if (this.f2468j != null) {
            m2098b(abstractC0918al, abstractC0918al.mo2018a());
        }
        C0848r c0848rM2093n = abstractC0918al.m2093n();
        if (this.f2467i == null || c0848rM2093n == null) {
            return;
        }
        this.f2467i[c0848rM2093n.m1795g()] = null;
    }

    /* JADX INFO: renamed from: c */
    public final int m2116c() {
        return this.f2460b;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC0918al m2117c(int i) {
        if (this.f2470l) {
            throw new RuntimeException("No def list in back mode");
        }
        if (this.f2467i != null) {
            return this.f2467i[i];
        }
        this.f2467i = new AbstractC0918al[this.f2462d];
        m2109a(new C0921ao(this));
        return this.f2467i[i];
    }

    /* JADX INFO: renamed from: d */
    public final C0915ai m2118d() {
        return (C0915ai) this.f2459a.get(this.f2460b);
    }

    /* JADX INFO: renamed from: d */
    public final List m2119d(int i) {
        if (this.f2469k == null) {
            m2100q();
        }
        return this.f2469k[i];
    }

    /* JADX INFO: renamed from: e */
    public final int m2120e() {
        return this.f2461c;
    }

    /* JADX INFO: renamed from: e */
    final void m2121e(int i) {
        this.f2462d = i;
        this.f2463e = this.f2462d;
        m2129m();
    }

    /* JADX INFO: renamed from: f */
    public final C0915ai m2122f() {
        if (this.f2461c < 0) {
            return null;
        }
        return (C0915ai) this.f2459a.get(this.f2461c);
    }

    /* JADX INFO: renamed from: g */
    public final int m2123g() {
        return this.f2462d;
    }

    /* JADX INFO: renamed from: h */
    public final int m2124h() {
        return this.f2466h;
    }

    /* JADX INFO: renamed from: i */
    public final void m2125i() {
        this.f2464f = 0;
    }

    /* JADX INFO: renamed from: j */
    public final ArrayList m2126j() {
        return this.f2459a;
    }

    /* JADX INFO: renamed from: k */
    public final int m2127k() {
        int i = 0;
        Iterator it = this.f2459a.iterator();
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return i2;
            }
            i = ((C0915ai) it.next()).m2082r() ? i2 + 1 : i2;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m2128l() {
        Iterator it = this.f2459a.iterator();
        while (it.hasNext()) {
            ((C0915ai) it.next()).m2069e(0);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(m2118d());
        while (!arrayList.isEmpty()) {
            C0915ai c0915ai = (C0915ai) arrayList.remove(0);
            if (!c0915ai.m2082r()) {
                c0915ai.m2069e(1);
                BitSet bitSetM2072h = c0915ai.m2072h();
                for (int iNextSetBit = bitSetM2072h.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSetM2072h.nextSetBit(iNextSetBit + 1)) {
                    arrayList.add(this.f2459a.get(iNextSetBit));
                }
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m2129m() {
        this.f2467i = null;
        this.f2468j = null;
        this.f2469k = null;
    }

    /* JADX INFO: renamed from: n */
    public final ArrayList[] m2130n() {
        if (this.f2468j == null) {
            m2100q();
        }
        ArrayList[] arrayListArr = new ArrayList[this.f2462d];
        for (int i = 0; i < this.f2462d; i++) {
            arrayListArr[i] = new ArrayList(this.f2468j[i]);
        }
        return arrayListArr;
    }

    /* JADX INFO: renamed from: o */
    public final int m2131o() {
        int i = this.f2462d;
        this.f2462d = i + 1;
        this.f2463e = this.f2462d;
        m2129m();
        return i;
    }

    /* JADX INFO: renamed from: p */
    public final void m2132p() {
        this.f2470l = true;
        this.f2468j = null;
        this.f2467i = null;
    }
}
