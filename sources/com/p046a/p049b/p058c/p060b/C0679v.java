package com.p046a.p049b.p058c.p060b;

import android.support.v7.widget.ActivityChooserView;
import com.p046a.p049b.p066f.p068b.C0848r;
import com.p046a.p049b.p066f.p068b.C0852v;
import com.p046a.p049b.p066f.p070d.C0887c;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: com.a.b.c.b.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0679v {

    /* JADX INFO: renamed from: a */
    private final ArrayList f1361a;

    /* JADX INFO: renamed from: b */
    private int f1362b = 0;

    /* JADX INFO: renamed from: c */
    private C0852v f1363c = null;

    /* JADX INFO: renamed from: d */
    private int[] f1364d = null;

    /* JADX INFO: renamed from: e */
    private int f1365e = 0;

    public C0679v(int i) {
        this.f1361a = new ArrayList(i);
    }

    /* JADX INFO: renamed from: a */
    private static C0848r m1282a(C0848r c0848r) {
        return (c0848r == null || c0848r.mo925a() != C0887c.f2351j) ? c0848r : c0848r.m1790a(C0887c.f2355n);
    }

    /* JADX INFO: renamed from: a */
    private void m1283a(int i, int i2) {
        boolean z = this.f1364d == null;
        if (i != 0 || z) {
            if (i < 0) {
                throw new RuntimeException("shouldn't happen");
            }
            if (z || i2 >= this.f1364d.length) {
                int i3 = i2 + 1;
                C0852v c0852v = new C0852v(i3);
                int[] iArr = new int[i3];
                Arrays.fill(iArr, -1);
                if (!z) {
                    c0852v.m1827a(this.f1363c);
                    System.arraycopy(this.f1364d, 0, iArr, 0, this.f1364d.length);
                }
                this.f1363c = c0852v;
                this.f1364d = iArr;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m1284a(int i, EnumC0677t enumC0677t, C0848r c0848r) {
        int iM1795g = c0848r.m1795g();
        this.f1361a.add(new C0678u(i, enumC0677t, c0848r));
        if (enumC0677t == EnumC0677t.f1351a) {
            this.f1363c.m1834d(c0848r);
            this.f1364d[iM1795g] = -1;
        } else {
            this.f1363c.m1832c(c0848r);
            this.f1364d[iM1795g] = this.f1361a.size() - 1;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m1285a(int i, C0848r c0848r, EnumC0677t enumC0677t) {
        boolean z;
        boolean z2 = false;
        int iM1795g = c0848r.m1795g();
        C0848r c0848rM1282a = m1282a(c0848r);
        m1283a(i, iM1795g);
        if (this.f1364d[iM1795g] >= 0) {
            return;
        }
        int size = this.f1361a.size() - 1;
        while (size >= 0) {
            C0678u c0678u = (C0678u) this.f1361a.get(size);
            if (c0678u != null) {
                if (c0678u.m1271a() == i) {
                    if (c0678u.m1274a(c0848rM1282a)) {
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            size--;
        }
        this.f1363c.m1832c(c0848rM1282a);
        this.f1361a.set(size, null);
        this.f1362b++;
        int iM1795g2 = c0848rM1282a.m1795g();
        int i2 = size - 1;
        C0678u c0678u2 = null;
        while (true) {
            if (i2 >= 0) {
                c0678u2 = (C0678u) this.f1361a.get(i2);
                if (c0678u2 != null && c0678u2.m1281h().m1795g() == iM1795g2) {
                    z2 = true;
                    break;
                }
                i2--;
            } else {
                break;
            }
        }
        if (z2) {
            this.f1364d[iM1795g2] = i2;
            if (c0678u2.m1271a() == i) {
                this.f1361a.set(i2, c0678u2.m1272a(EnumC0677t.f1352b));
            }
        }
        z = true;
        if (z) {
            return;
        }
        m1284a(i, enumC0677t, c0848rM1282a);
    }

    /* JADX INFO: renamed from: b */
    private void m1286b(int i, EnumC0677t enumC0677t, C0848r c0848r) {
        if (enumC0677t == EnumC0677t.f1351a) {
            throw new RuntimeException("shouldn't happen");
        }
        int i2 = this.f1364d[c0848r.m1795g()];
        if (i2 >= 0) {
            C0678u c0678u = (C0678u) this.f1361a.get(i2);
            if (c0678u.m1271a() == i && c0678u.m1281h().equals(c0848r)) {
                this.f1361a.set(i2, c0678u.m1272a(enumC0677t));
                this.f1363c.m1832c(c0848r);
                return;
            }
        }
        m1285a(i, c0848r, enumC0677t);
    }

    /* JADX INFO: renamed from: b */
    private void m1287b(int i, C0848r c0848r) {
        m1285a(i, c0848r, EnumC0677t.f1352b);
    }

    /* JADX INFO: renamed from: a */
    public final C0676s m1288a() {
        int i;
        m1283a(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, 0);
        int size = this.f1361a.size();
        int i2 = size - this.f1362b;
        if (i2 == 0) {
            return C0676s.f1350a;
        }
        C0678u[] c0678uArr = new C0678u[i2];
        if (size == i2) {
            this.f1361a.toArray(c0678uArr);
        } else {
            int i3 = 0;
            for (C0678u c0678u : this.f1361a) {
                if (c0678u != null) {
                    c0678uArr[i3] = c0678u;
                    i = i3 + 1;
                } else {
                    i = i3;
                }
                i3 = i;
            }
        }
        Arrays.sort(c0678uArr);
        C0676s c0676s = new C0676s(i2);
        for (int i4 = 0; i4 < i2; i4++) {
            c0676s.m1269a(i4, c0678uArr[i4]);
        }
        c0676s.mo811b_();
        return c0676s;
    }

    /* JADX INFO: renamed from: a */
    public final void m1289a(int i, C0848r c0848r) {
        C0848r c0848rM1824a;
        C0848r c0848rM1824a2;
        int iM1795g = c0848r.m1795g();
        C0848r c0848rM1282a = m1282a(c0848r);
        m1283a(i, iM1795g);
        C0848r c0848rM1824a3 = this.f1363c.m1824a(iM1795g);
        if (c0848rM1282a.m1791a(c0848rM1824a3)) {
            return;
        }
        C0848r c0848rM1830b = this.f1363c.m1830b(c0848rM1282a);
        if (c0848rM1830b != null) {
            m1286b(i, EnumC0677t.f1354d, c0848rM1830b);
        }
        int i2 = this.f1364d[iM1795g];
        if (c0848rM1824a3 != null) {
            m1284a(i, EnumC0677t.f1353c, c0848rM1824a3);
        } else if (i2 >= 0) {
            C0678u c0678u = (C0678u) this.f1361a.get(i2);
            if (c0678u.m1271a() == i) {
                if (c0678u.m1274a(c0848rM1282a)) {
                    this.f1361a.set(i2, null);
                    this.f1362b++;
                    this.f1363c.m1834d(c0848rM1282a);
                    this.f1364d[iM1795g] = -1;
                    return;
                }
                this.f1361a.set(i2, c0678u.m1272a(EnumC0677t.f1353c));
            }
        }
        if (iM1795g > 0 && (c0848rM1824a2 = this.f1363c.m1824a(iM1795g - 1)) != null && c0848rM1824a2.m1800l()) {
            m1286b(i, EnumC0677t.f1356f, c0848rM1824a2);
        }
        if (c0848rM1282a.m1800l() && (c0848rM1824a = this.f1363c.m1824a(iM1795g + 1)) != null) {
            m1286b(i, EnumC0677t.f1355e, c0848rM1824a);
        }
        m1284a(i, EnumC0677t.f1351a, c0848rM1282a);
    }

    /* JADX INFO: renamed from: a */
    public final void m1290a(int i, C0852v c0852v) {
        int iM1829b = c0852v.m1829b();
        m1283a(i, iM1829b - 1);
        for (int i2 = 0; i2 < iM1829b; i2++) {
            C0848r c0848rM1824a = this.f1363c.m1824a(i2);
            C0848r c0848rM1282a = m1282a(c0852v.m1824a(i2));
            if (c0848rM1824a == null) {
                if (c0848rM1282a != null) {
                    m1289a(i, c0848rM1282a);
                }
            } else if (c0848rM1282a == null) {
                m1287b(i, c0848rM1824a);
            } else if (!c0848rM1282a.m1791a(c0848rM1824a)) {
                m1287b(i, c0848rM1824a);
                m1289a(i, c0848rM1282a);
            }
        }
    }
}
