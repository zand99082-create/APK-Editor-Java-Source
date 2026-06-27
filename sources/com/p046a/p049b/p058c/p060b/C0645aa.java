package com.p046a.p049b.p058c.p060b;

import com.p046a.p047a.C0502s;
import com.p046a.p049b.p058c.C0615a;
import com.p046a.p049b.p066f.p068b.C0843m;
import com.p046a.p049b.p066f.p068b.C0848r;
import com.p046a.p049b.p066f.p068b.C0850t;
import com.p046a.p049b.p066f.p068b.C0852v;
import com.p046a.p049b.p066f.p069c.AbstractC0857a;
import com.p046a.p049b.p066f.p069c.AbstractC0879u;
import com.p046a.p049b.p066f.p069c.C0883y;
import com.p046a.p049b.p066f.p069c.C0884z;
import com.p046a.p049b.p066f.p070d.C0887c;
import com.p046a.p049b.p071g.C0890a;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: com.a.b.c.b.aa */
/* JADX INFO: loaded from: classes.dex */
public final class C0645aa {

    /* JADX INFO: renamed from: a */
    private final C0615a f1060a;

    /* JADX INFO: renamed from: b */
    private final int f1061b;

    /* JADX INFO: renamed from: c */
    private ArrayList f1062c;

    /* JADX INFO: renamed from: g */
    private int f1066g;

    /* JADX INFO: renamed from: h */
    private final int f1067h;

    /* JADX INFO: renamed from: f */
    private int f1065f = -1;

    /* JADX INFO: renamed from: d */
    private boolean f1063d = false;

    /* JADX INFO: renamed from: e */
    private boolean f1064e = false;

    public C0645aa(C0615a c0615a, int i, int i2, int i3) {
        this.f1060a = c0615a;
        this.f1061b = i2;
        this.f1062c = new ArrayList(i);
        this.f1067h = i3;
    }

    /* JADX INFO: renamed from: a */
    private C0671n m1116a(AbstractC0669l abstractC0669l, C0671n c0671n) {
        while (c0671n != null && (!c0671n.m1238c().mo1112b(abstractC0669l) || (this.f1060a.f1014c && c0671n.m1236a() == 26))) {
            c0671n = C0672o.m1244a(c0671n);
        }
        return c0671n;
    }

    /* JADX INFO: renamed from: a */
    private void m1117a(int i) {
        int size = this.f1062c.size();
        int i2 = this.f1066g + this.f1061b + this.f1065f;
        int i3 = i2 - this.f1067h;
        C0890a c0890a = new C0890a(i2);
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 >= i3) {
                c0890a.mo1963a(i4, i4 + 1, 1);
            } else {
                c0890a.mo1963a(i4, i4, 1);
            }
        }
        for (int i5 = 0; i5 < size; i5++) {
            AbstractC0669l abstractC0669l = (AbstractC0669l) this.f1062c.get(i5);
            if (!(abstractC0669l instanceof C0665h)) {
                this.f1062c.set(i5, abstractC0669l.mo1215a(c0890a));
            }
        }
        this.f1066g++;
    }

    /* JADX INFO: renamed from: a */
    private static void m1118a(HashSet hashSet, AbstractC0669l abstractC0669l) {
        if (abstractC0669l instanceof C0666i) {
            hashSet.add(((C0666i) abstractC0669l).m1199c());
            return;
        }
        if (!(abstractC0669l instanceof C0680w)) {
            if (abstractC0669l instanceof C0681x) {
                m1119a(hashSet, ((C0681x) abstractC0669l).m1293c());
            }
        } else {
            C0852v c0852vM1291c = ((C0680w) abstractC0669l).m1291c();
            int iM1833d = c0852vM1291c.m1833d();
            for (int i = 0; i < iM1833d; i++) {
                m1119a(hashSet, c0852vM1291c.m1824a(i));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m1119a(HashSet hashSet, C0848r c0848r) {
        if (c0848r == null) {
            return;
        }
        C0843m c0843mM1797i = c0848r.m1797i();
        C0883y c0883yM1767a = c0843mM1797i.m1767a();
        C0883y c0883yM1768b = c0843mM1797i.m1768b();
        C0887c c0887cMo925a = c0848r.mo925a();
        if (c0887cMo925a != C0887c.f2351j) {
            hashSet.add(C0884z.m1916b(c0887cMo925a));
        }
        if (c0883yM1767a != null) {
            hashSet.add(c0883yM1767a);
        }
        if (c0883yM1768b != null) {
            hashSet.add(c0883yM1768b);
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m1120a(C0848r c0848r) {
        return (c0848r == null || c0848r.m1797i().m1767a() == null) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    private boolean m1121a(C0671n[] c0671nArr) {
        int i;
        boolean z;
        if (this.f1065f < 0) {
            i = 0;
            z = false;
        } else {
            i = this.f1065f;
            z = false;
        }
        while (true) {
            int size = this.f1062c.size();
            int i2 = this.f1065f;
            for (int i3 = 0; i3 < size; i3++) {
                AbstractC0669l abstractC0669l = (AbstractC0669l) this.f1062c.get(i3);
                C0671n c0671n = c0671nArr[i3];
                C0671n c0671nM1116a = m1116a(abstractC0669l, c0671n);
                if (c0671nM1116a == null) {
                    int iM1214a = abstractC0669l.m1214a(m1122b(abstractC0669l).m1238c().mo1113c(abstractC0669l));
                    if (iM1214a > i2) {
                        i2 = iM1214a;
                    }
                } else {
                    if (c0671n != c0671nM1116a) {
                    }
                }
                c0671nArr[i3] = c0671nM1116a;
            }
            if (i >= i2) {
                this.f1065f = i;
                return z;
            }
            z = true;
            int i4 = i2 - i;
            int size2 = this.f1062c.size();
            for (int i5 = 0; i5 < size2; i5++) {
                AbstractC0669l abstractC0669l2 = (AbstractC0669l) this.f1062c.get(i5);
                if (!(abstractC0669l2 instanceof C0665h)) {
                    this.f1062c.set(i5, abstractC0669l2.mo1176d(i4));
                }
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: b */
    private C0671n m1122b(AbstractC0669l abstractC0669l) {
        C0671n c0671nM1116a = m1116a(abstractC0669l.m1226k(), abstractC0669l.m1223h());
        if (c0671nM1116a == null) {
            throw new C0502s("No expanded opcode for " + abstractC0669l);
        }
        return c0671nM1116a;
    }

    /* JADX INFO: renamed from: b */
    private void m1123b(int i) {
        int size = this.f1062c.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0669l abstractC0669l = (AbstractC0669l) this.f1062c.get(i2);
            if (!(abstractC0669l instanceof C0665h)) {
                this.f1062c.set(i2, abstractC0669l.mo1176d(1));
            }
        }
        this.f1065f++;
    }

    /* JADX INFO: renamed from: b */
    private void m1124b(C0671n[] c0671nArr) {
        C0671n c0671n;
        AbstractC0669l abstractC0669l;
        AbstractC0669l abstractC0669l2;
        AbstractC0669l abstractC0669lMo1162a;
        if (this.f1065f == 0) {
            int size = this.f1062c.size();
            for (int i = 0; i < size; i++) {
                AbstractC0669l abstractC0669l3 = (AbstractC0669l) this.f1062c.get(i);
                C0671n c0671nM1223h = abstractC0669l3.m1223h();
                C0671n c0671n2 = c0671nArr[i];
                if (c0671nM1223h != c0671n2) {
                    this.f1062c.set(i, abstractC0669l3.mo1162a(c0671n2));
                }
            }
            return;
        }
        int size2 = this.f1062c.size();
        ArrayList arrayList = new ArrayList(size2 << 1);
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < size2; i2++) {
            AbstractC0669l abstractC0669l4 = (AbstractC0669l) this.f1062c.get(i2);
            C0671n c0671nM1223h2 = abstractC0669l4.m1223h();
            C0671n c0671n3 = c0671nArr[i2];
            if (c0671n3 != null) {
                abstractC0669l2 = null;
                abstractC0669l = null;
                c0671n = c0671n3;
                abstractC0669lMo1162a = abstractC0669l4;
            } else {
                C0671n c0671nM1122b = m1122b(abstractC0669l4);
                BitSet bitSetMo1113c = c0671nM1122b.m1238c().mo1113c(abstractC0669l4);
                AbstractC0669l abstractC0669lM1217b = abstractC0669l4.m1217b(bitSetMo1113c);
                AbstractC0669l abstractC0669lM1218c = abstractC0669l4.m1218c(bitSetMo1113c);
                AbstractC0669l abstractC0669lM1220d = abstractC0669l4.m1220d(bitSetMo1113c);
                c0671n = c0671nM1122b;
                abstractC0669l = abstractC0669lM1217b;
                abstractC0669l2 = abstractC0669lM1218c;
                abstractC0669lMo1162a = abstractC0669lM1220d;
            }
            if ((abstractC0669lMo1162a instanceof C0665h) && ((C0665h) abstractC0669lMo1162a).m1196c()) {
                arrayList2.add((C0665h) abstractC0669lMo1162a);
            } else {
                if (abstractC0669l != null) {
                    arrayList.add(abstractC0669l);
                }
                if (!(abstractC0669lMo1162a instanceof AbstractC0658an) && arrayList2.size() > 0) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList.add((C0665h) it.next());
                    }
                    arrayList2.clear();
                }
                if (c0671n != c0671nM1223h2) {
                    abstractC0669lMo1162a = abstractC0669lMo1162a.mo1162a(c0671n);
                }
                arrayList.add(abstractC0669lMo1162a);
                if (abstractC0669l2 != null) {
                    arrayList.add(abstractC0669l2);
                }
            }
        }
        this.f1062c = arrayList;
    }

    /* JADX INFO: renamed from: c */
    private void m1125c(C0671n[] c0671nArr) {
        do {
            int i = ((this.f1061b + this.f1065f) + this.f1066g) - this.f1067h;
            Iterator it = this.f1062c.iterator();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (it.hasNext()) {
                C0850t c0850tM1225j = ((AbstractC0669l) it.next()).m1225j();
                int i6 = i2;
                int i7 = i3;
                int i8 = i4;
                int i9 = i5;
                int i10 = 0;
                while (i10 < c0850tM1225j.m2239d_()) {
                    C0848r c0848rM1815b = c0850tM1225j.m1815b(i10);
                    if (c0848rM1815b.m1800l()) {
                        boolean z = c0848rM1815b.m1795g() >= i;
                        if ((c0848rM1815b.m1795g() & 1) == 0) {
                            if (z) {
                                i6++;
                            } else {
                                i8++;
                            }
                        } else if (z) {
                            i7++;
                        } else {
                            i9++;
                        }
                    }
                    int i11 = i9;
                    i10++;
                    i6 = i6;
                    i7 = i7;
                    i8 = i8;
                    i9 = i11;
                }
                i5 = i9;
                i4 = i8;
                i3 = i7;
                i2 = i6;
            }
            if (i3 > i2 && i5 > i4) {
                m1123b(1);
            } else if (i3 > i2) {
                m1117a(1);
            } else {
                if (i5 <= i4) {
                    return;
                }
                m1123b(1);
                if (this.f1067h != 0 && i2 > i3) {
                    m1117a(1);
                }
            }
        } while (m1121a(c0671nArr));
    }

    /* JADX INFO: renamed from: e */
    private C0671n[] m1126e() {
        int size = this.f1062c.size();
        C0671n[] c0671nArr = new C0671n[size];
        for (int i = 0; i < size; i++) {
            c0671nArr[i] = ((AbstractC0669l) this.f1062c.get(i)).m1223h();
        }
        return c0671nArr;
    }

    /* JADX INFO: renamed from: f */
    private void m1127f() {
        do {
            int size = this.f1062c.size();
            int iMo1102a = 0;
            for (int i = 0; i < size; i++) {
                AbstractC0669l abstractC0669l = (AbstractC0669l) this.f1062c.get(i);
                abstractC0669l.m1219c(iMo1102a);
                iMo1102a += abstractC0669l.mo1102a();
            }
        } while (m1128g());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0092  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m1128g() {
        boolean z;
        int i;
        int i2;
        int i3 = 0;
        int size = this.f1062c.size();
        boolean z2 = false;
        while (i3 < size) {
            AbstractC0669l abstractC0669l = (AbstractC0669l) this.f1062c.get(i3);
            if (abstractC0669l instanceof C0656al) {
                C0671n c0671nM1223h = abstractC0669l.m1223h();
                C0656al c0656al = (C0656al) abstractC0669l;
                if (c0671nM1223h.m1238c().mo1111a(c0656al)) {
                    z = z2;
                } else {
                    if (c0671nM1223h.m1237b() == 40) {
                        C0671n c0671nM1116a = m1116a(abstractC0669l, c0671nM1223h);
                        if (c0671nM1116a == null) {
                            throw new UnsupportedOperationException("method too long");
                        }
                        this.f1062c.set(i3, abstractC0669l.mo1162a(c0671nM1116a));
                        i2 = i3;
                        i = size;
                    } else {
                        try {
                            C0665h c0665h = (C0665h) this.f1062c.get(i3 + 1);
                            this.f1062c.set(i3, new C0656al(C0672o.f1136H, c0656al.m1224i(), C0850t.f2003a, c0656al.m1172c()));
                            this.f1062c.add(i3, c0656al.m1171a(c0665h));
                            i = size + 1;
                            i2 = i3 + 1;
                        } catch (ClassCastException e) {
                            throw new IllegalStateException("unpaired TargetInsn");
                        } catch (IndexOutOfBoundsException e2) {
                            throw new IllegalStateException("unpaired TargetInsn (dangling)");
                        }
                    }
                    size = i;
                    i3 = i2;
                    z = true;
                }
            }
            i3++;
            z2 = z;
        }
        return z2;
    }

    /* JADX INFO: renamed from: a */
    public final void m1129a(int i, C0665h c0665h) {
        int size = (this.f1062c.size() - i) - 1;
        try {
            this.f1062c.set(size, ((C0656al) this.f1062c.get(size)).m1171a(c0665h));
        } catch (ClassCastException e) {
            throw new IllegalArgumentException("non-reversible instruction");
        } catch (IndexOutOfBoundsException e2) {
            throw new IllegalArgumentException("too few instructions");
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1130a(InterfaceC0668k interfaceC0668k) {
        int iMo1097a;
        for (AbstractC0669l abstractC0669l : this.f1062c) {
            if (abstractC0669l instanceof C0666i) {
                C0666i c0666i = (C0666i) abstractC0669l;
                AbstractC0857a abstractC0857aM1199c = c0666i.m1199c();
                int iMo1097a2 = interfaceC0668k.mo1097a(abstractC0857aM1199c);
                if (iMo1097a2 >= 0) {
                    c0666i.m1197a(iMo1097a2);
                }
                if ((abstractC0857aM1199c instanceof AbstractC0879u) && (iMo1097a = interfaceC0668k.mo1097a(((AbstractC0879u) abstractC0857aM1199c).m1898k())) >= 0) {
                    c0666i.m1198b(iMo1097a);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1131a(AbstractC0669l abstractC0669l) {
        boolean z = false;
        this.f1062c.add(abstractC0669l);
        if (!this.f1063d && abstractC0669l.m1224i().m1861a() >= 0) {
            this.f1063d = true;
        }
        if (this.f1064e) {
            return;
        }
        if (abstractC0669l instanceof C0680w) {
            C0852v c0852vM1291c = ((C0680w) abstractC0669l).m1291c();
            int iM1833d = c0852vM1291c.m1833d();
            int i = 0;
            while (true) {
                if (i >= iM1833d) {
                    break;
                }
                if (m1120a(c0852vM1291c.m1824a(i))) {
                    z = true;
                    break;
                }
                i++;
            }
        } else if ((abstractC0669l instanceof C0681x) && m1120a(((C0681x) abstractC0669l).m1293c())) {
            z = true;
        }
        if (z) {
            this.f1064e = true;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1132a() {
        return this.f1063d;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1133b() {
        return this.f1064e;
    }

    /* JADX INFO: renamed from: c */
    public final HashSet m1134c() {
        HashSet hashSet = new HashSet(20);
        Iterator it = this.f1062c.iterator();
        while (it.hasNext()) {
            m1118a(hashSet, (AbstractC0669l) it.next());
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: d */
    public final C0670m m1135d() {
        if (this.f1065f >= 0) {
            throw new UnsupportedOperationException("already processed");
        }
        C0671n[] c0671nArrM1126e = m1126e();
        m1121a(c0671nArrM1126e);
        if (this.f1060a.f1012a) {
            m1125c(c0671nArrM1126e);
        }
        m1124b(c0671nArrM1126e);
        m1127f();
        return C0670m.m1229a(this.f1062c, this.f1065f + this.f1061b + this.f1066g);
    }
}
