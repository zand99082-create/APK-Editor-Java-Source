package com.p046a.p049b.p071g;

import android.support.v7.appcompat.C0327R;
import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p066f.p068b.AbstractC0839i;
import com.p046a.p049b.p066f.p068b.C0829ab;
import com.p046a.p049b.p066f.p068b.C0830ac;
import com.p046a.p049b.p066f.p068b.C0837g;
import com.p046a.p049b.p066f.p068b.C0838h;
import com.p046a.p049b.p066f.p068b.C0846p;
import com.p046a.p049b.p066f.p068b.C0847q;
import com.p046a.p049b.p066f.p068b.C0848r;
import com.p046a.p049b.p066f.p068b.C0850t;
import com.p046a.p049b.p066f.p068b.C0853w;
import com.p046a.p049b.p066f.p068b.C0855y;
import com.p046a.p049b.p066f.p069c.AbstractC0857a;
import com.p046a.p049b.p066f.p069c.AbstractC0859ab;
import com.p046a.p049b.p066f.p069c.AbstractC0877s;
import com.p046a.p049b.p066f.p069c.C0880v;
import com.p046a.p049b.p066f.p069c.C0881w;
import com.p046a.p049b.p066f.p069c.C0883y;
import com.p046a.p049b.p066f.p069c.C0884z;
import com.p046a.p049b.p066f.p070d.C0886b;
import com.p046a.p049b.p066f.p070d.C0887c;
import com.p046a.p049b.p066f.p070d.InterfaceC0888d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: com.a.b.g.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0938l {

    /* JADX INFO: renamed from: a */
    private C0920an f2519a;

    /* JADX INFO: renamed from: b */
    private int f2520b;

    /* JADX INFO: renamed from: c */
    private ArrayList f2521c = new ArrayList();

    private C0938l(C0920an c0920an) {
        this.f2519a = c0920an;
        this.f2520b = c0920an.m2123g();
    }

    /* JADX INFO: renamed from: a */
    private int m2167a(C0848r c0848r) {
        int i;
        int i2 = 0;
        while (true) {
            i = i2;
            if (i >= this.f2521c.size() || ((C0942p) this.f2521c.get(i)).f2527a.get(c0848r.m1795g())) {
                break;
            }
            i2 = i + 1;
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    private AbstractC0918al m2168a(AbstractC0918al abstractC0918al) {
        return (AbstractC0918al) ((C0915ai) this.f2519a.m2126j().get(abstractC0918al.m2094o().m2071g().nextSetBit(0))).m2063c().get(r0.size() - 1);
    }

    /* JADX INFO: renamed from: a */
    private void m2170a() {
        for (int i = 0; i < this.f2519a.m2123g(); i++) {
            AbstractC0918al abstractC0918alM2117c = this.f2519a.m2117c(i);
            if (abstractC0918alM2117c != null && abstractC0918alM2117c.mo2027c() != null && abstractC0918alM2117c.mo2027c().m1836a() == 2) {
                ArrayList[] arrayListArrM2130n = this.f2519a.m2130n();
                C0848r c0848rM1815b = abstractC0918alM2117c.mo2018a().m1815b(0);
                C0848r c0848rM2093n = abstractC0918alM2117c.m2093n();
                if (c0848rM1815b.m1795g() >= this.f2520b || c0848rM2093n.m1795g() >= this.f2520b) {
                    C0939m c0939m = new C0939m(this, c0848rM2093n, c0848rM1815b);
                    Iterator it = arrayListArrM2130n[c0848rM2093n.m1795g()].iterator();
                    while (it.hasNext()) {
                        ((AbstractC0918al) it.next()).mo2023a(c0939m);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00e6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x002a A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m2171a(C0848r c0848r, C0942p c0942p) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(c0848r);
        while (!arrayList.isEmpty()) {
            C0848r c0848r2 = (C0848r) arrayList.remove(arrayList.size() - 1);
            for (AbstractC0918al abstractC0918al : this.f2519a.m2119d(c0848r2.m1795g())) {
                if (abstractC0918al.mo2027c() != null) {
                    switch (abstractC0918al.mo2027c().m1836a()) {
                        case 2:
                            c0942p.f2527a.set(abstractC0918al.m2093n().m1795g());
                            arrayList.add(abstractC0918al.m2093n());
                            break;
                        case 7:
                        case 8:
                        case 43:
                            if (c0942p.f2528b.compareTo(EnumC0943q.f2533b) < 0) {
                                c0942p.f2528b = EnumC0943q.f2533b;
                            }
                            break;
                        case 33:
                        case 35:
                        case C0327R.styleable.AppCompatTheme_spinnerDropDownItemStyle /* 49 */:
                        case 50:
                        case C0327R.styleable.AppCompatTheme_actionButtonStyle /* 51 */:
                        case C0327R.styleable.AppCompatTheme_buttonBarStyle /* 52 */:
                        case C0327R.styleable.AppCompatTheme_buttonBarButtonStyle /* 53 */:
                            c0942p.f2528b = EnumC0943q.f2534c;
                            break;
                        case 38:
                            if (!abstractC0918al.mo2018a().m1815b(1).m1796h().mo929f()) {
                                c0942p.f2531e = false;
                            }
                            break;
                        case 39:
                            if (!abstractC0918al.mo2018a().m1815b(2).m1796h().mo929f()) {
                                c0942p.f2531e = false;
                            }
                            if (abstractC0918al.mo2018a().m1815b(0).m1796h().mo927c() != 9) {
                                c0942p.f2531e = false;
                                C0850t c0850tMo2018a = abstractC0918al.mo2018a();
                                if (c0850tMo2018a.m1815b(0).m1795g() == c0848r2.m1795g()) {
                                    int iM2167a = m2167a(c0850tMo2018a.m1815b(1));
                                    if (iM2167a != this.f2521c.size()) {
                                        C0942p c0942p2 = (C0942p) this.f2521c.get(iM2167a);
                                        m2178a(c0942p2, c0942p);
                                        if (c0942p.f2528b.compareTo(c0942p2.f2528b) < 0) {
                                            c0942p.f2528b = c0942p2.f2528b;
                                        }
                                    }
                                } else {
                                    int iM2167a2 = m2167a(c0850tMo2018a.m1815b(0));
                                    if (iM2167a2 != this.f2521c.size()) {
                                        C0942p c0942p3 = (C0942p) this.f2521c.get(iM2167a2);
                                        m2178a(c0942p, c0942p3);
                                        if (c0942p3.f2528b.compareTo(c0942p.f2528b) < 0) {
                                            c0942p3.f2528b = c0942p.f2528b;
                                        }
                                    }
                                }
                            }
                            break;
                        case 47:
                            if (abstractC0918al.mo2018a().m1815b(0).m1796h().mo927c() != 9) {
                            }
                            break;
                        case C0327R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 48 */:
                            c0942p.f2528b = EnumC0943q.f2535d;
                            break;
                    }
                } else {
                    int iM2167a3 = m2167a(abstractC0918al.m2093n());
                    if (iM2167a3 != this.f2521c.size()) {
                        C0942p c0942p4 = (C0942p) this.f2521c.get(iM2167a3);
                        if (c0942p4 != c0942p) {
                            c0942p.f2531e = false;
                            c0942p.f2527a.or(c0942p4.f2527a);
                            if (c0942p.f2528b.compareTo(c0942p4.f2528b) < 0) {
                                c0942p.f2528b = c0942p4.f2528b;
                            }
                            m2181b(c0942p, c0942p4);
                            this.f2521c.remove(iM2167a3);
                        }
                    } else {
                        c0942p.f2527a.set(abstractC0918al.m2093n().m1795g());
                        arrayList.add(abstractC0918al.m2093n());
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m2172a(AbstractC0918al abstractC0918al, int i, ArrayList arrayList) {
        C0887c c0887cMo925a = abstractC0918al.m2093n().mo925a();
        for (int i2 = 0; i2 < i; i2++) {
            AbstractC0857a abstractC0857aM2447a = C1067a.m2447a(c0887cMo925a.m1959s());
            C0848r c0848rM1778a = C0848r.m1778a(this.f2519a.m2131o(), (AbstractC0859ab) abstractC0857aM2447a);
            arrayList.add(c0848rM1778a);
            m2174a(abstractC0918al, C0850t.f2003a, c0848rM1778a, 5, abstractC0857aM2447a);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m2173a(AbstractC0918al abstractC0918al, C0848r c0848r, HashSet hashSet) {
        C0884z c0884z = new C0884z(C0837g.f1963a);
        m2180b(abstractC0918al, C0850t.f2003a, null, 40, c0884z);
        C0915ai c0915aiM2094o = abstractC0918al.m2094o();
        C0915ai c0915aiM2059b = c0915aiM2094o.m2059b(c0915aiM2094o.m2076l());
        AbstractC0918al abstractC0918al2 = (AbstractC0918al) c0915aiM2059b.m2063c().get(0);
        C0848r c0848rM1778a = C0848r.m1778a(this.f2519a.m2131o(), c0884z);
        m2174a(abstractC0918al2, C0850t.f2003a, c0848rM1778a, 56, null);
        C0915ai c0915aiM2059b2 = c0915aiM2059b.m2059b(c0915aiM2059b.m2076l());
        AbstractC0918al abstractC0918al3 = (AbstractC0918al) c0915aiM2059b2.m2063c().get(0);
        m2180b(abstractC0918al3, C0850t.m1809a(c0848rM1778a, c0848r), null, 52, new C0880v(c0884z, new C0881w(new C0883y("<init>"), new C0883y("(I)V"))));
        hashSet.add(abstractC0918al3);
        C0915ai c0915aiM2059b3 = c0915aiM2059b2.m2059b(c0915aiM2059b2.m2076l());
        AbstractC0918al abstractC0918al4 = (AbstractC0918al) c0915aiM2059b3.m2063c().get(0);
        m2180b(abstractC0918al4, C0850t.m1808a(c0848rM1778a), null, 35, null);
        c0915aiM2059b3.m2052a(c0915aiM2059b3.m2074j(), this.f2519a.m2122f().m2068e());
        hashSet.add(abstractC0918al4);
    }

    /* JADX INFO: renamed from: a */
    private void m2174a(AbstractC0918al abstractC0918al, C0850t c0850t, C0848r c0848r, int i, AbstractC0857a abstractC0857a) {
        AbstractC0839i abstractC0839iMo2028e = abstractC0918al.mo2028e();
        C0853w c0853wM1857e = i == 56 ? C0855y.m1857e(c0848r.mo925a()) : C0855y.m1847a(i, c0848r, c0850t, abstractC0857a);
        C0952z c0952z = new C0952z(abstractC0857a == null ? new C0847q(c0853wM1857e, abstractC0839iMo2028e.m1753g(), c0848r, c0850t) : new C0846p(c0853wM1857e, abstractC0839iMo2028e.m1753g(), c0848r, c0850t, abstractC0857a), abstractC0918al.m2094o());
        ArrayList arrayListM2063c = abstractC0918al.m2094o().m2063c();
        arrayListM2063c.add(arrayListM2063c.lastIndexOf(abstractC0918al), c0952z);
        this.f2519a.m2105a(c0952z);
    }

    /* JADX INFO: renamed from: a */
    private void m2175a(AbstractC0918al abstractC0918al, AbstractC0918al abstractC0918al2, ArrayList arrayList, HashSet hashSet) {
        int size = arrayList.size();
        switch (abstractC0918al.mo2027c().m1836a()) {
            case 34:
                Object objM1796h = abstractC0918al2.mo2018a().m1815b(0).m1796h();
                AbstractC0918al abstractC0918alM2179b = m2179b(abstractC0918al);
                m2174a(abstractC0918alM2179b, C0850t.f2003a, abstractC0918alM2179b.m2093n(), 5, (AbstractC0857a) objM1796h);
                hashSet.add(abstractC0918alM2179b);
                break;
            case 38:
                AbstractC0918al abstractC0918alM2179b2 = m2179b(abstractC0918al);
                C0850t c0850tMo2018a = abstractC0918al.mo2018a();
                int iMo1894j = ((AbstractC0877s) c0850tMo2018a.m1815b(1).m1796h()).mo1894j();
                if (iMo1894j < size) {
                    C0848r c0848r = (C0848r) arrayList.get(iMo1894j);
                    m2174a(abstractC0918alM2179b2, C0850t.m1808a(c0848r), c0848r.m1787a(abstractC0918alM2179b2.m2093n().m1795g()), 2, null);
                } else {
                    m2173a(abstractC0918alM2179b2, c0850tMo2018a.m1815b(1), hashSet);
                    hashSet.add(abstractC0918alM2179b2.m2094o().m2063c().get(2));
                }
                hashSet.add(abstractC0918alM2179b2);
                break;
            case 39:
                C0850t c0850tMo2018a2 = abstractC0918al.mo2018a();
                int iMo1894j2 = ((AbstractC0877s) c0850tMo2018a2.m1815b(2).m1796h()).mo1894j();
                if (iMo1894j2 < size) {
                    C0848r c0848rM1815b = c0850tMo2018a2.m1815b(0);
                    C0848r c0848rM1787a = c0848rM1815b.m1787a(((C0848r) arrayList.get(iMo1894j2)).m1795g());
                    m2174a(abstractC0918al, C0850t.m1808a(c0848rM1815b), c0848rM1787a, 2, null);
                    arrayList.set(iMo1894j2, c0848rM1787a.m1802n());
                } else {
                    m2173a(abstractC0918al, c0850tMo2018a2.m1815b(2), hashSet);
                }
                break;
            case C0327R.styleable.AppCompatTheme_dividerVertical /* 57 */:
                ArrayList arrayListM1749c = ((C0838h) abstractC0918al.mo2028e()).m1749c();
                for (int i = 0; i < size; i++) {
                    C0848r c0848rM1778a = C0848r.m1778a(((C0848r) arrayList.get(i)).m1795g(), (InterfaceC0888d) arrayListM1749c.get(i));
                    m2174a(abstractC0918al, C0850t.f2003a, c0848rM1778a, 5, (AbstractC0857a) arrayListM1749c.get(i));
                    arrayList.set(i, c0848rM1778a);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2176a(C0920an c0920an) {
        C0938l c0938l = new C0938l(c0920an);
        c0938l.f2519a.m2104a(new C0940n(c0938l));
        for (C0942p c0942p : c0938l.f2521c) {
            if (c0942p.f2528b != EnumC0943q.f2532a) {
                for (C0942p c0942p2 : c0942p.f2529c) {
                    if (c0942p.f2528b.compareTo(c0942p2.f2528b) > 0) {
                        c0942p2.f2528b = c0942p.f2528b;
                    }
                }
            }
        }
        for (C0942p c0942p3 : c0938l.f2521c) {
            if (c0942p3.f2531e && c0942p3.f2528b == EnumC0943q.f2532a) {
                int iNextSetBit = c0942p3.f2527a.nextSetBit(0);
                AbstractC0918al abstractC0918alM2117c = c0938l.f2519a.m2117c(iNextSetBit);
                AbstractC0918al abstractC0918alM2168a = c0938l.m2168a(abstractC0918alM2117c);
                int iMo1894j = ((AbstractC0877s) abstractC0918alM2168a.mo2018a().m1815b(0).m1796h()).mo1894j();
                ArrayList arrayList = new ArrayList(iMo1894j);
                HashSet hashSet = new HashSet();
                c0938l.m2172a(abstractC0918alM2117c, iMo1894j, arrayList);
                hashSet.add(abstractC0918alM2168a);
                hashSet.add(abstractC0918alM2117c);
                for (AbstractC0918al abstractC0918al : c0938l.f2519a.m2119d(iNextSetBit)) {
                    c0938l.m2175a(abstractC0918al, abstractC0918alM2168a, arrayList, hashSet);
                    hashSet.add(abstractC0918al);
                }
                c0938l.f2519a.m2110a(hashSet);
                c0938l.f2519a.m2129m();
                C0931e.m2156a(c0938l.f2519a, c0938l.f2520b);
                c0938l.m2170a();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ void m2177a(C0938l c0938l, AbstractC0918al abstractC0918al) {
        C0942p c0942p;
        int iM1836a = abstractC0918al.mo2027c().m1836a();
        C0848r c0848rM2093n = abstractC0918al.m2093n();
        if (iM1836a != 56 || c0848rM2093n.m1796h().mo927c() != 9) {
            if (iM1836a == 3 && c0848rM2093n.m1796h().mo927c() == 9) {
                C0942p c0942p2 = new C0942p(c0848rM2093n.m1795g(), c0938l.f2520b, EnumC0943q.f2532a);
                c0938l.f2521c.add(c0942p2);
                c0938l.m2171a(c0848rM2093n, c0942p2);
                return;
            } else {
                if (iM1836a == 55 && c0848rM2093n.m1796h().mo927c() == 9) {
                    C0942p c0942p3 = new C0942p(c0848rM2093n.m1795g(), c0938l.f2520b, EnumC0943q.f2532a);
                    c0938l.f2521c.add(c0942p3);
                    c0938l.m2171a(c0848rM2093n, c0942p3);
                    return;
                }
                return;
            }
        }
        C0848r c0848rM2093n2 = abstractC0918al.m2093n();
        AbstractC0918al abstractC0918alM2168a = c0938l.m2168a(abstractC0918al);
        switch (abstractC0918alM2168a.mo2027c().m1836a()) {
            case 5:
            case 40:
                c0942p = new C0942p(c0848rM2093n2.m1795g(), c0938l.f2520b, EnumC0943q.f2532a);
                c0938l.f2521c.add(c0942p);
                break;
            case 38:
            case 43:
            case 45:
                C0848r c0848rM1815b = abstractC0918alM2168a.mo2018a().m1815b(0);
                int iM2167a = c0938l.m2167a(c0848rM1815b);
                if (iM2167a == c0938l.f2521c.size()) {
                    c0942p = c0848rM1815b.mo925a() == C0887c.f2351j ? new C0942p(c0848rM2093n2.m1795g(), c0938l.f2520b, EnumC0943q.f2532a) : new C0942p(c0848rM2093n2.m1795g(), c0938l.f2520b, EnumC0943q.f2535d);
                    c0938l.f2521c.add(c0942p);
                } else {
                    c0942p = (C0942p) c0938l.f2521c.get(iM2167a);
                    c0942p.f2527a.set(c0848rM2093n2.m1795g());
                }
                break;
            case 41:
            case 42:
                if (abstractC0918alM2168a.mo2018a().m1815b(0).m1796h().mo929f()) {
                    c0942p = new C0942p(c0848rM2093n2.m1795g(), c0938l.f2520b, EnumC0943q.f2532a);
                    c0942p.f2531e = true;
                } else {
                    c0942p = new C0942p(c0848rM2093n2.m1795g(), c0938l.f2520b, EnumC0943q.f2535d);
                }
                c0938l.f2521c.add(c0942p);
                break;
            case 46:
                c0942p = new C0942p(c0848rM2093n2.m1795g(), c0938l.f2520b, EnumC0943q.f2535d);
                c0938l.f2521c.add(c0942p);
                break;
            default:
                c0942p = null;
                break;
        }
        c0938l.m2171a(c0848rM2093n, c0942p);
    }

    /* JADX INFO: renamed from: a */
    private static void m2178a(C0942p c0942p, C0942p c0942p2) {
        if (!c0942p2.f2530d.contains(c0942p)) {
            c0942p2.f2530d.add(c0942p);
        }
        if (c0942p.f2529c.contains(c0942p2)) {
            return;
        }
        c0942p.f2529c.add(c0942p2);
    }

    /* JADX INFO: renamed from: b */
    private AbstractC0918al m2179b(AbstractC0918al abstractC0918al) {
        return (AbstractC0918al) ((C0915ai) this.f2519a.m2126j().get(abstractC0918al.m2094o().m2072h().nextSetBit(0))).m2063c().get(0);
    }

    /* JADX INFO: renamed from: b */
    private void m2180b(AbstractC0918al abstractC0918al, C0850t c0850t, C0848r c0848r, int i, AbstractC0857a abstractC0857a) {
        AbstractC0839i abstractC0839iMo2028e = abstractC0918al.mo2028e();
        C0853w c0853wM1847a = C0855y.m1847a(i, null, c0850t, abstractC0857a);
        C0952z c0952z = new C0952z(abstractC0857a == null ? new C0830ac(c0853wM1847a, abstractC0839iMo2028e.m1753g(), c0850t, C0886b.f2306a) : new C0829ab(c0853wM1847a, abstractC0839iMo2028e.m1753g(), c0850t, C0886b.f2306a, abstractC0857a), abstractC0918al.m2094o());
        ArrayList arrayListM2063c = abstractC0918al.m2094o().m2063c();
        arrayListM2063c.add(arrayListM2063c.lastIndexOf(abstractC0918al), c0952z);
        this.f2519a.m2105a(c0952z);
    }

    /* JADX INFO: renamed from: b */
    private static void m2181b(C0942p c0942p, C0942p c0942p2) {
        for (C0942p c0942p3 : c0942p2.f2530d) {
            c0942p3.f2529c.remove(c0942p2);
            c0942p3.f2529c.add(c0942p);
            c0942p.f2530d.add(c0942p3);
        }
        for (C0942p c0942p4 : c0942p2.f2529c) {
            c0942p4.f2530d.remove(c0942p2);
            c0942p4.f2530d.add(c0942p);
            c0942p.f2529c.add(c0942p4);
        }
    }
}
