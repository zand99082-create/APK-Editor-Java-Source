package com.p046a.p049b.p065e;

import com.p046a.p047a.C0483aa;
import com.p046a.p047a.C0492i;
import com.p046a.p047a.C0498o;
import com.p046a.p047a.C0509z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.a.b.e.j */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0809j {

    /* JADX INFO: renamed from: a */
    private final C0498o f1891a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C0801b f1892b;

    protected AbstractC0809j(C0801b c0801b, C0498o c0498o) {
        this.f1892b = c0801b;
        this.f1891a = c0498o;
    }

    /* JADX INFO: renamed from: a */
    private List m1640a(C0492i c0492i, C0812m c0812m) {
        C0483aa c0483aaMo1636a = mo1636a(c0492i.m618a());
        if (!c0483aaMo1636a.m574a()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        C0498o c0498oM616a = c0492i.m616a(c0483aaMo1636a.f675c);
        for (int i = 0; i < c0483aaMo1636a.f674b; i++) {
            arrayList.add(new C0810k(this, c0492i, c0812m, mo1637a(c0498oM616a, c0812m, 0), i, c0498oM616a.m640a()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    abstract C0483aa mo1636a(C0509z c0509z);

    /* JADX INFO: renamed from: a */
    abstract Comparable mo1637a(C0498o c0498o, C0812m c0812m, int i);

    /* JADX INFO: renamed from: a */
    public final void m1641a() {
        int iM640a;
        Comparable comparableMo1637a;
        int i;
        boolean z;
        boolean z2;
        int i2;
        Comparable comparable;
        Comparable comparable2;
        int i3;
        int i4;
        C0483aa c0483aaMo1636a = mo1636a(this.f1892b.f1860a.m618a());
        C0483aa c0483aaMo1636a2 = mo1636a(this.f1892b.f1861b.m618a());
        mo1636a(this.f1892b.f1878s).f675c = this.f1891a.m640a();
        C0498o c0498oM616a = c0483aaMo1636a.m574a() ? this.f1892b.f1860a.m616a(c0483aaMo1636a.f675c) : null;
        C0498o c0498oM616a2 = c0483aaMo1636a2.m574a() ? this.f1892b.f1861b.m616a(c0483aaMo1636a2.f675c) : null;
        int i5 = -1;
        int i6 = 0;
        Comparable comparableMo1637a2 = null;
        Comparable comparable3 = null;
        int i7 = -1;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (comparable3 != null || i8 >= c0483aaMo1636a.f674b) {
                iM640a = i7;
                comparableMo1637a = comparable3;
            } else {
                iM640a = c0498oM616a.m640a();
                comparableMo1637a = mo1637a(c0498oM616a, this.f1892b.f1879t, i8);
            }
            if (comparableMo1637a2 != null || i6 >= c0483aaMo1636a2.f674b) {
                i = i5;
            } else {
                int iM640a2 = c0498oM616a2.m640a();
                comparableMo1637a2 = mo1637a(c0498oM616a2, this.f1892b.f1880u, i6);
                i = iM640a2;
            }
            if (comparableMo1637a == null || comparableMo1637a2 == null) {
                z = comparableMo1637a != null;
                z2 = comparableMo1637a2 != null;
            } else {
                int iCompareTo = comparableMo1637a.compareTo(comparableMo1637a2);
                z = iCompareTo <= 0;
                z2 = iCompareTo >= 0;
            }
            Comparable comparable4 = null;
            if (z) {
                mo1638a(iM640a, this.f1892b.f1879t, i8, i9);
                i8++;
                i2 = -1;
                Comparable comparable5 = comparableMo1637a;
                comparableMo1637a = null;
                comparable4 = comparable5;
            } else {
                i2 = iM640a;
            }
            if (z2) {
                int i10 = i6 + 1;
                mo1638a(i, this.f1892b.f1880u, i6, i9);
                comparable2 = null;
                i4 = -1;
                Comparable comparable6 = comparableMo1637a2;
                i3 = i10;
                comparable = comparable6;
            } else {
                comparable = comparable4;
                comparable2 = comparableMo1637a2;
                i3 = i6;
                i4 = i;
            }
            if (comparable == null) {
                mo1636a(this.f1892b.f1878s).f674b = i9;
                return;
            }
            mo1639a(comparable);
            i9++;
            Comparable comparable7 = comparableMo1637a;
            i7 = i2;
            i5 = i4;
            i6 = i3;
            comparableMo1637a2 = comparable2;
            comparable3 = comparable7;
        }
    }

    /* JADX INFO: renamed from: a */
    abstract void mo1638a(int i, C0812m c0812m, int i2, int i3);

    /* JADX INFO: renamed from: a */
    abstract void mo1639a(Comparable comparable);

    /* JADX INFO: renamed from: b */
    public final void m1642b() {
        int i;
        mo1636a(this.f1892b.f1878s).f675c = this.f1891a.m640a();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(m1640a(this.f1892b.f1860a, this.f1892b.f1879t));
        arrayList.addAll(m1640a(this.f1892b.f1861b, this.f1892b.f1880u));
        Collections.sort(arrayList);
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3 = i) {
            i = i3 + 1;
            C0810k c0810k = (C0810k) arrayList.get(i3);
            mo1638a(c0810k.f1896d, C0801b.m1609a(this.f1892b, c0810k.f1893a), c0810k.f1895c, i2 - 1);
            while (i < arrayList.size() && c0810k.compareTo((C0810k) arrayList.get(i)) == 0) {
                C0810k c0810k2 = (C0810k) arrayList.get(i);
                mo1638a(c0810k2.f1896d, C0801b.m1609a(this.f1892b, c0810k2.f1893a), c0810k2.f1895c, i2 - 1);
                i++;
            }
            mo1639a(c0810k.f1894b);
            i2++;
        }
        mo1636a(this.f1892b.f1878s).f674b = i2;
    }
}
