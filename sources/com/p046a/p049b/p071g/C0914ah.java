package com.p046a.p049b.p071g;

import android.support.v7.appcompat.C0327R;
import com.p046a.p049b.p066f.p068b.AbstractC0835e;
import com.p046a.p049b.p066f.p068b.AbstractC0839i;
import com.p046a.p049b.p066f.p068b.C0847q;
import com.p046a.p049b.p066f.p068b.C0848r;
import com.p046a.p049b.p066f.p068b.C0850t;
import com.p046a.p049b.p066f.p068b.C0853w;
import com.p046a.p049b.p066f.p068b.C0855y;
import com.p046a.p049b.p066f.p069c.AbstractC0857a;
import com.p046a.p049b.p066f.p069c.AbstractC0859ab;
import com.p046a.p049b.p066f.p069c.C0872n;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;

/* JADX INFO: renamed from: com.a.b.g.ah */
/* JADX INFO: loaded from: classes.dex */
public final class C0914ah {

    /* JADX INFO: renamed from: a */
    private C0920an f2433a;

    /* JADX INFO: renamed from: b */
    private int f2434b;

    /* JADX INFO: renamed from: c */
    private int[] f2435c;

    /* JADX INFO: renamed from: d */
    private AbstractC0857a[] f2436d;

    /* JADX INFO: renamed from: g */
    private BitSet f2439g;

    /* JADX INFO: renamed from: e */
    private ArrayList f2437e = new ArrayList();

    /* JADX INFO: renamed from: f */
    private ArrayList f2438f = new ArrayList();

    /* JADX INFO: renamed from: h */
    private ArrayList f2440h = new ArrayList();

    /* JADX INFO: renamed from: i */
    private ArrayList f2441i = new ArrayList();

    /* JADX INFO: renamed from: j */
    private ArrayList f2442j = new ArrayList();

    private C0914ah(C0920an c0920an) {
        this.f2433a = c0920an;
        this.f2434b = c0920an.m2123g();
        this.f2435c = new int[this.f2434b];
        this.f2436d = new AbstractC0857a[this.f2434b];
        this.f2439g = new BitSet(c0920an.m2126j().size());
        for (int i = 0; i < this.f2434b; i++) {
            this.f2435c[i] = 0;
            this.f2436d[i] = null;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m2038a(int i, int i2) {
        if (i2 == 2) {
            Iterator it = this.f2433a.m2119d(i).iterator();
            while (it.hasNext()) {
                this.f2441i.add((AbstractC0918al) it.next());
            }
            return;
        }
        Iterator it2 = this.f2433a.m2119d(i).iterator();
        while (it2.hasNext()) {
            this.f2440h.add((AbstractC0918al) it2.next());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m2039a(C0909ac c0909ac) {
        int iM1795g = c0909ac.m2093n().m1795g();
        if (this.f2435c[iM1795g] == 2) {
            return;
        }
        C0850t c0850tMo2018a = c0909ac.mo2018a();
        int iD_ = c0850tMo2018a.m2239d_();
        int i = 0;
        int i2 = 0;
        AbstractC0857a abstractC0857a = null;
        while (true) {
            if (i >= iD_) {
                break;
            }
            int iM2017a = c0909ac.m2017a(i);
            int iM1795g2 = c0850tMo2018a.m1815b(i).m1795g();
            int i3 = this.f2435c[iM1795g2];
            if (this.f2439g.get(iM2017a)) {
                if (i3 != 1) {
                    i2 = i3;
                    break;
                } else if (abstractC0857a == null) {
                    abstractC0857a = this.f2436d[iM1795g2];
                    i2 = 1;
                } else if (!this.f2436d[iM1795g2].equals(abstractC0857a)) {
                    i2 = 2;
                    break;
                }
            }
            i++;
        }
        if (m2043a(iM1795g, i2, abstractC0857a)) {
            m2038a(iM1795g, i2);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m2040a(C0915ai c0915ai) {
        if (this.f2439g.get(c0915ai.m2068e())) {
            this.f2438f.add(c0915ai);
        } else {
            this.f2437e.add(c0915ai);
            this.f2439g.set(c0915ai.m2068e());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:163:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x012d  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m2041a(AbstractC0918al abstractC0918al) {
        boolean z;
        boolean z2;
        AbstractC0857a abstractC0857aM1748g_;
        int i;
        AbstractC0857a abstractC0857aM1891a = null;
        boolean z3 = false;
        int i2 = 1;
        AbstractC0839i abstractC0839iMo2028e = abstractC0918al.mo2028e();
        if (abstractC0839iMo2028e.m1752f().m1839d() != 1 || abstractC0839iMo2028e.m1752f().m1840e()) {
            C0853w c0853wMo2027c = abstractC0918al.mo2027c();
            C0850t c0850tMo2018a = abstractC0918al.mo2018a();
            if (c0853wMo2027c.m1839d() == 4) {
                C0848r c0848rM1815b = c0850tMo2018a.m1815b(0);
                int iM1795g = c0848rM1815b.m1795g();
                AbstractC0857a abstractC0857a = (this.f2433a.m2112a(c0848rM1815b) || this.f2435c[iM1795g] != 1) ? null : this.f2436d[iM1795g];
                if (c0850tMo2018a.m2239d_() == 2) {
                    C0848r c0848rM1815b2 = c0850tMo2018a.m1815b(1);
                    int iM1795g2 = c0848rM1815b2.m1795g();
                    AbstractC0857a abstractC0857a2 = (this.f2433a.m2112a(c0848rM1815b2) || this.f2435c[iM1795g2] != 1) ? null : this.f2436d[iM1795g2];
                    if (abstractC0857a != null && c0850tMo2018a.m2239d_() == 1) {
                        switch (((AbstractC0859ab) abstractC0857a).mo927c()) {
                            case 6:
                                int iJ = ((C0872n) abstractC0857a).mo1894j();
                                switch (c0853wMo2027c.m1836a()) {
                                    case 7:
                                        z = iJ == 0;
                                        z2 = true;
                                        break;
                                    case 8:
                                        z = iJ != 0;
                                        z2 = true;
                                        break;
                                    case 9:
                                        z = iJ < 0;
                                        z2 = true;
                                        break;
                                    case 10:
                                        z = iJ >= 0;
                                        z2 = true;
                                        break;
                                    case 11:
                                        z = iJ <= 0;
                                        z2 = true;
                                        break;
                                    case 12:
                                        z = iJ > 0;
                                        z2 = true;
                                        break;
                                    default:
                                        throw new RuntimeException("Unexpected op");
                                }
                                break;
                            default:
                                z = false;
                                z2 = false;
                                break;
                        }
                    } else if (abstractC0857a != null && abstractC0857a2 != null) {
                        switch (((AbstractC0859ab) abstractC0857a).mo927c()) {
                            case 6:
                                int iJ2 = ((C0872n) abstractC0857a).mo1894j();
                                int iJ3 = ((C0872n) abstractC0857a2).mo1894j();
                                switch (c0853wMo2027c.m1836a()) {
                                    case 7:
                                        z = iJ2 == iJ3;
                                        z2 = true;
                                        break;
                                    case 8:
                                        z = iJ2 != iJ3;
                                        z2 = true;
                                        break;
                                    case 9:
                                        z = iJ2 < iJ3;
                                        z2 = true;
                                        break;
                                    case 10:
                                        z = iJ2 >= iJ3;
                                        z2 = true;
                                        break;
                                    case 11:
                                        z = iJ2 <= iJ3;
                                        z2 = true;
                                        break;
                                    case 12:
                                        z = iJ2 > iJ3;
                                        z2 = true;
                                        break;
                                    default:
                                        throw new RuntimeException("Unexpected op");
                                }
                                break;
                        }
                    } else {
                        z = false;
                        z2 = false;
                    }
                    C0915ai c0915aiM2094o = abstractC0918al.m2094o();
                    if (z2) {
                        m2040a((C0915ai) this.f2433a.m2126j().get(z ? c0915aiM2094o.m2073i().m2248b(1) : c0915aiM2094o.m2073i().m2248b(0)));
                        this.f2442j.add(abstractC0918al);
                    } else {
                        for (int i3 = 0; i3 < c0915aiM2094o.m2073i().m2247b(); i3++) {
                            m2040a((C0915ai) this.f2433a.m2126j().get(c0915aiM2094o.m2073i().m2248b(i3)));
                        }
                    }
                }
            }
        }
        int iM1836a = abstractC0918al.mo2027c().m1836a();
        C0848r c0848rM2093n = abstractC0918al.m2093n();
        if (c0848rM2093n == null) {
            if (iM1836a != 17 && iM1836a != 18) {
                return;
            } else {
                c0848rM2093n = ((AbstractC0918al) abstractC0918al.m2094o().m2076l().m2063c().get(0)).m2093n();
            }
        }
        int iM1795g3 = c0848rM2093n.m1795g();
        switch (iM1836a) {
            case 2:
                if (abstractC0918al.mo2018a().m2239d_() == 1) {
                    int iM1795g4 = abstractC0918al.mo2018a().m1815b(0).m1795g();
                    i2 = this.f2435c[iM1795g4];
                    abstractC0857aM1891a = this.f2436d[iM1795g4];
                } else {
                    i2 = 2;
                }
                break;
            case 5:
                abstractC0857aM1891a = ((AbstractC0835e) abstractC0839iMo2028e).m1748g_();
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                int iMo927c = c0848rM2093n.mo927c();
                AbstractC0839i abstractC0839iMo2028e2 = abstractC0918al.mo2028e();
                int iM1836a2 = abstractC0918al.mo2027c().m1836a();
                C0850t c0850tMo2018a2 = abstractC0918al.mo2018a();
                int iM1795g5 = c0850tMo2018a2.m1815b(0).m1795g();
                AbstractC0857a abstractC0857a3 = this.f2435c[iM1795g5] != 1 ? null : this.f2436d[iM1795g5];
                if (c0850tMo2018a2.m2239d_() == 1) {
                    abstractC0857aM1748g_ = ((AbstractC0835e) abstractC0839iMo2028e2).m1748g_();
                } else {
                    int iM1795g6 = c0850tMo2018a2.m1815b(1).m1795g();
                    abstractC0857aM1748g_ = this.f2435c[iM1795g6] != 1 ? null : this.f2436d[iM1795g6];
                }
                if (abstractC0857a3 != null && abstractC0857aM1748g_ != null) {
                    switch (iMo927c) {
                        case 6:
                            int iJ4 = ((C0872n) abstractC0857a3).mo1894j();
                            int iJ5 = ((C0872n) abstractC0857aM1748g_).mo1894j();
                            switch (iM1836a2) {
                                case 14:
                                    i = iJ5 + iJ4;
                                    break;
                                case 15:
                                    i = c0850tMo2018a2.m2239d_() == 1 ? iJ5 - iJ4 : iJ4 - iJ5;
                                    break;
                                case 16:
                                    i = iJ5 * iJ4;
                                    break;
                                case 17:
                                    if (iJ5 == 0) {
                                        i = 0;
                                        z3 = true;
                                    } else {
                                        i = iJ4 / iJ5;
                                    }
                                    break;
                                case 18:
                                    if (iJ5 == 0) {
                                        i = 0;
                                        z3 = true;
                                    } else {
                                        i = iJ4 % iJ5;
                                    }
                                    break;
                                case 19:
                                default:
                                    throw new RuntimeException("Unexpected op");
                                case 20:
                                    i = iJ5 & iJ4;
                                    break;
                                case 21:
                                    i = iJ5 | iJ4;
                                    break;
                                case 22:
                                    i = iJ5 ^ iJ4;
                                    break;
                                case 23:
                                    i = iJ4 << iJ5;
                                    break;
                                case 24:
                                    i = iJ4 >> iJ5;
                                    break;
                                case 25:
                                    i = iJ4 >>> iJ5;
                                    break;
                            }
                            if (!z3) {
                                abstractC0857aM1891a = C0872n.m1891a(i);
                                break;
                            }
                        default:
                            if (abstractC0857aM1891a == null) {
                                i2 = 2;
                            }
                            break;
                    }
                }
                if (abstractC0857aM1891a == null) {
                }
                break;
            case C0327R.styleable.AppCompatTheme_borderlessButtonStyle /* 56 */:
                if (this.f2435c[iM1795g3] == 1) {
                    i2 = this.f2435c[iM1795g3];
                    abstractC0857aM1891a = this.f2436d[iM1795g3];
                } else {
                    i2 = 2;
                }
                break;
            default:
                i2 = 2;
                break;
        }
        if (m2043a(iM1795g3, i2, abstractC0857aM1891a)) {
            m2038a(iM1795g3, i2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2042a(C0920an c0920an) {
        C0914ah c0914ah = new C0914ah(c0920an);
        c0914ah.m2040a(c0914ah.f2433a.m2118d());
        while (true) {
            if (c0914ah.f2437e.isEmpty() && c0914ah.f2438f.isEmpty() && c0914ah.f2440h.isEmpty() && c0914ah.f2441i.isEmpty()) {
                break;
            }
            while (!c0914ah.f2437e.isEmpty()) {
                for (AbstractC0918al abstractC0918al : ((C0915ai) c0914ah.f2437e.remove(c0914ah.f2437e.size() - 1)).m2063c()) {
                    if (abstractC0918al instanceof C0909ac) {
                        c0914ah.m2039a((C0909ac) abstractC0918al);
                    } else {
                        c0914ah.m2041a(abstractC0918al);
                    }
                }
            }
            while (!c0914ah.f2438f.isEmpty()) {
                for (AbstractC0918al abstractC0918al2 : ((C0915ai) c0914ah.f2438f.remove(c0914ah.f2438f.size() - 1)).m2063c()) {
                    if (abstractC0918al2 instanceof C0909ac) {
                        c0914ah.m2039a((C0909ac) abstractC0918al2);
                    }
                }
            }
            while (!c0914ah.f2441i.isEmpty()) {
                AbstractC0918al abstractC0918al3 = (AbstractC0918al) c0914ah.f2441i.remove(c0914ah.f2441i.size() - 1);
                if (c0914ah.f2439g.get(abstractC0918al3.m2094o().m2068e())) {
                    if (abstractC0918al3 instanceof C0909ac) {
                        c0914ah.m2039a((C0909ac) abstractC0918al3);
                    } else {
                        c0914ah.m2041a(abstractC0918al3);
                    }
                }
            }
            while (!c0914ah.f2440h.isEmpty()) {
                AbstractC0918al abstractC0918al4 = (AbstractC0918al) c0914ah.f2440h.remove(c0914ah.f2440h.size() - 1);
                if (c0914ah.f2439g.get(abstractC0918al4.m2094o().m2068e())) {
                    if (abstractC0918al4 instanceof C0909ac) {
                        c0914ah.m2039a((C0909ac) abstractC0918al4);
                    } else {
                        c0914ah.m2041a(abstractC0918al4);
                    }
                }
            }
        }
        for (int i = 0; i < c0914ah.f2434b; i++) {
            if (c0914ah.f2435c[i] == 1 && (c0914ah.f2436d[i] instanceof AbstractC0859ab)) {
                AbstractC0918al abstractC0918alM2117c = c0914ah.f2433a.m2117c(i);
                if (!abstractC0918alM2117c.m2093n().m1796h().mo929f()) {
                    abstractC0918alM2117c.m2086b(abstractC0918alM2117c.m2093n().m1790a((AbstractC0859ab) c0914ah.f2436d[i]));
                    for (AbstractC0918al abstractC0918al5 : c0914ah.f2433a.m2119d(i)) {
                        if (!abstractC0918al5.mo2031k()) {
                            C0952z c0952z = (C0952z) abstractC0918al5;
                            C0850t c0850tMo2018a = abstractC0918al5.mo2018a();
                            int iM1817c = c0850tMo2018a.m1817c(i);
                            c0952z.m2201a(iM1817c, c0850tMo2018a.m1815b(iM1817c).m1790a((AbstractC0859ab) c0914ah.f2436d[i]));
                        }
                    }
                }
            }
        }
        for (AbstractC0918al abstractC0918al6 : c0914ah.f2442j) {
            C0915ai c0915aiM2094o = abstractC0918al6.m2094o();
            int iM2247b = c0915aiM2094o.m2073i().m2247b();
            int i2 = 0;
            int i3 = -1;
            while (i2 < iM2247b) {
                int iM2248b = c0915aiM2094o.m2073i().m2248b(i2);
                if (c0914ah.f2439g.get(iM2248b)) {
                    iM2248b = i3;
                }
                i2++;
                i3 = iM2248b;
            }
            if (iM2247b == 2 && i3 != -1) {
                c0915aiM2094o.m2062b(new C0847q(C0855y.f2221s, abstractC0918al6.mo2028e().m1753g(), (C0848r) null, C0850t.f2003a));
                c0915aiM2094o.m2061b(i3);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m2043a(int i, int i2, AbstractC0857a abstractC0857a) {
        if (i2 != 1) {
            if (this.f2435c[i] == i2) {
                return false;
            }
            this.f2435c[i] = i2;
            return true;
        }
        if (this.f2435c[i] == i2 && this.f2436d[i].equals(abstractC0857a)) {
            return false;
        }
        this.f2435c[i] = i2;
        this.f2436d[i] = abstractC0857a;
        return true;
    }
}
