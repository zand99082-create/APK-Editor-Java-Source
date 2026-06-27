package com.p046a.p049b.p058c.p062c;

import android.support.v4.view.InputDeviceCompat;
import com.p046a.p047a.p048a.C0482d;
import com.p046a.p049b.p058c.p060b.C0646ab;
import com.p046a.p049b.p058c.p060b.C0647ac;
import com.p046a.p049b.p058c.p060b.C0676s;
import com.p046a.p049b.p058c.p060b.C0678u;
import com.p046a.p049b.p058c.p060b.EnumC0677t;
import com.p046a.p049b.p066f.p069c.C0880v;
import com.p046a.p049b.p066f.p069c.C0883y;
import com.p046a.p049b.p066f.p069c.C0884z;
import com.p046a.p049b.p066f.p070d.C0885a;
import com.p046a.p049b.p066f.p070d.C0886b;
import com.p046a.p049b.p066f.p070d.C0887c;
import com.p046a.p049b.p073h.C0970r;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: com.a.b.c.c.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0728n {

    /* JADX INFO: renamed from: a */
    private final C0646ab f1500a;

    /* JADX INFO: renamed from: b */
    private final C0676s f1501b;

    /* JADX INFO: renamed from: d */
    private final C0732r f1503d;

    /* JADX INFO: renamed from: e */
    private final int f1504e;

    /* JADX INFO: renamed from: f */
    private final int f1505f;

    /* JADX INFO: renamed from: g */
    private final C0885a f1506g;

    /* JADX INFO: renamed from: h */
    private final boolean f1507h;

    /* JADX INFO: renamed from: k */
    private C0970r f1510k;

    /* JADX INFO: renamed from: l */
    private PrintWriter f1511l;

    /* JADX INFO: renamed from: m */
    private String f1512m;

    /* JADX INFO: renamed from: n */
    private boolean f1513n;

    /* JADX INFO: renamed from: o */
    private final C0678u[] f1514o;

    /* JADX INFO: renamed from: i */
    private int f1508i = 0;

    /* JADX INFO: renamed from: j */
    private int f1509j = 1;

    /* JADX INFO: renamed from: c */
    private final C0970r f1502c = new C0970r();

    public C0728n(C0646ab c0646ab, C0676s c0676s, C0732r c0732r, int i, int i2, boolean z, C0880v c0880v) {
        this.f1500a = c0646ab;
        this.f1501b = c0676s;
        this.f1503d = c0732r;
        this.f1506g = c0880v.m1880i();
        this.f1507h = z;
        this.f1504e = i;
        this.f1505f = i2;
        this.f1514o = new C0678u[i2];
    }

    /* JADX INFO: renamed from: a */
    private int m1454a(int i) {
        int iD_ = this.f1501b.m2239d_();
        while (i < iD_ && this.f1501b.m1268a(i).m1271a() == this.f1508i) {
            int i2 = i + 1;
            C0678u c0678uM1268a = this.f1501b.m1268a(i);
            int iM1280g = c0678uM1268a.m1280g();
            C0678u c0678u = this.f1514o[iM1280g];
            if (c0678uM1268a != c0678u) {
                this.f1514o[iM1280g] = c0678uM1268a;
                if (c0678uM1268a.m1276c()) {
                    if (c0678u == null || !c0678uM1268a.m1273a(c0678u)) {
                        if (c0678uM1268a.m1278e() != null) {
                            m1465b(c0678uM1268a);
                        } else {
                            int iM2270a = this.f1502c.m2270a();
                            this.f1502c.mo569d(3);
                            m1468d(c0678uM1268a.m1280g());
                            m1460a(c0678uM1268a.m1277d());
                            m1461a(c0678uM1268a.m1279f());
                            if (this.f1510k != null || this.f1511l != null) {
                                m1458a(this.f1502c.m2270a() - iM2270a, String.format("%04x: +local %s", Integer.valueOf(this.f1508i), m1457a(c0678uM1268a)));
                            }
                            i = i2;
                        }
                    } else {
                        if (c0678u.m1276c()) {
                            throw new RuntimeException("shouldn't happen");
                        }
                        int iM2270a2 = this.f1502c.m2270a();
                        this.f1502c.mo569d(6);
                        m1468d(c0678uM1268a.m1280g());
                        if (this.f1510k != null || this.f1511l != null) {
                            m1458a(this.f1502c.m2270a() - iM2270a2, String.format("%04x: +local restart %s", Integer.valueOf(this.f1508i), m1457a(c0678uM1268a)));
                        }
                        i = i2;
                    }
                } else if (c0678uM1268a.m1275b() != EnumC0677t.f1353c) {
                    int iM2270a3 = this.f1502c.m2270a();
                    this.f1502c.mo569d(5);
                    this.f1502c.m2286e(c0678uM1268a.m1280g());
                    if (this.f1510k != null || this.f1511l != null) {
                        m1458a(this.f1502c.m2270a() - iM2270a3, String.format("%04x: -local %s", Integer.valueOf(this.f1508i), m1457a(c0678uM1268a)));
                    }
                }
                i = i2;
            } else {
                i = i2;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    private static int m1455a(int i, int i2) {
        if (i < -4 || i > 10) {
            throw new RuntimeException("Parameter out of range");
        }
        return i + 4 + (i2 * 15) + 10;
    }

    /* JADX INFO: renamed from: a */
    private int m1456a(int i, ArrayList arrayList) {
        int size = arrayList.size();
        while (i < size && ((C0647ac) arrayList.get(i)).m1138a() == this.f1508i) {
            m1459a((C0647ac) arrayList.get(i));
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    private static String m1457a(C0678u c0678u) {
        StringBuilder sb = new StringBuilder();
        sb.append("v");
        sb.append(c0678u.m1280g());
        sb.append(' ');
        C0883y c0883yM1277d = c0678u.m1277d();
        if (c0883yM1277d == null) {
            sb.append("null");
        } else {
            sb.append(c0883yM1277d.mo919d());
        }
        sb.append(' ');
        C0884z c0884zM1279f = c0678u.m1279f();
        if (c0884zM1279f == null) {
            sb.append("null");
        } else {
            sb.append(c0884zM1279f.mo919d());
        }
        C0883y c0883yM1278e = c0678u.m1278e();
        if (c0883yM1278e != null) {
            sb.append(' ');
            sb.append(c0883yM1278e.mo919d());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    private void m1458a(int i, String str) {
        if (this.f1512m != null) {
            str = this.f1512m + str;
        }
        if (this.f1510k != null) {
            C0970r c0970r = this.f1510k;
            if (!this.f1513n) {
                i = 0;
            }
            c0970r.m2272a(i, str);
        }
        if (this.f1511l != null) {
            this.f1511l.println(str);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m1459a(C0647ac c0647ac) {
        int i;
        int i2;
        int iM1861a = c0647ac.m1139b().m1861a();
        int iM1138a = c0647ac.m1138a();
        int i3 = iM1861a - this.f1509j;
        int i4 = iM1138a - this.f1508i;
        if (i4 < 0) {
            throw new RuntimeException("Position entries must be in ascending address order");
        }
        if (i3 < -4 || i3 > 10) {
            m1464b(i3);
            i3 = 0;
        }
        int iM1455a = m1455a(i3, i4);
        if ((iM1455a & InputDeviceCompat.SOURCE_ANY) > 0) {
            m1467c(i4);
            int iM1455a2 = m1455a(i3, 0);
            if ((iM1455a2 & InputDeviceCompat.SOURCE_ANY) > 0) {
                m1464b(i3);
                i = 0;
                iM1455a = m1455a(0, 0);
                i2 = 0;
            } else {
                iM1455a = iM1455a2;
                i = i3;
                i2 = 0;
            }
        } else {
            i = i3;
            i2 = i4;
        }
        this.f1502c.mo569d(iM1455a);
        this.f1509j = i + this.f1509j;
        this.f1508i = i2 + this.f1508i;
        if (this.f1510k == null && this.f1511l == null) {
            return;
        }
        m1458a(1, String.format("%04x: line %d", Integer.valueOf(this.f1508i), Integer.valueOf(this.f1509j)));
    }

    /* JADX INFO: renamed from: a */
    private void m1460a(C0883y c0883y) {
        if (c0883y == null || this.f1503d == null) {
            this.f1502c.m2286e(0);
        } else {
            this.f1502c.m2286e(this.f1503d.m1488h().m1376b(c0883y) + 1);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m1461a(C0884z c0884z) {
        if (c0884z == null || this.f1503d == null) {
            this.f1502c.m2286e(0);
        } else {
            this.f1502c.m2286e(this.f1503d.m1491k().m1381b(c0884z) + 1);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m1462a(ArrayList arrayList, ArrayList arrayList2) {
        int i;
        C0678u c0678u;
        boolean z = (this.f1510k == null && this.f1511l == null) ? false : true;
        int iM2270a = this.f1502c.m2270a();
        if (arrayList.size() > 0) {
            this.f1509j = ((C0647ac) arrayList.get(0)).m1139b().m1861a();
        }
        this.f1502c.m2286e(this.f1509j);
        if (z) {
            m1458a(this.f1502c.m2270a() - iM2270a, "line_start: " + this.f1509j);
        }
        int iM1463b = m1463b();
        C0886b c0886bM1927b = this.f1506g.m1927b();
        int iD_ = c0886bM1927b.m2239d_();
        if (this.f1507h) {
            i = iM1463b;
        } else {
            Iterator it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C0678u c0678u2 = (C0678u) it.next();
                if (iM1463b == c0678u2.m1280g()) {
                    this.f1514o[iM1463b] = c0678u2;
                    break;
                }
            }
            i = iM1463b + 1;
        }
        int iM2270a2 = this.f1502c.m2270a();
        this.f1502c.m2286e(iD_);
        if (z) {
            m1458a(this.f1502c.m2270a() - iM2270a2, String.format("parameters_size: %04x", Integer.valueOf(iD_)));
        }
        int iM1949i = i;
        for (int i2 = 0; i2 < iD_; i2++) {
            C0887c c0887cM1938b = c0886bM1927b.m1938b(i2);
            int iM2270a3 = this.f1502c.m2270a();
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    c0678u = null;
                    break;
                }
                c0678u = (C0678u) it2.next();
                if (iM1949i == c0678u.m1280g()) {
                    if (c0678u.m1278e() != null) {
                        m1460a((C0883y) null);
                    } else {
                        m1460a(c0678u.m1277d());
                    }
                    this.f1514o[iM1949i] = c0678u;
                }
            }
            if (c0678u == null) {
                m1460a((C0883y) null);
            }
            if (z) {
                m1458a(this.f1502c.m2270a() - iM2270a3, "parameter " + ((c0678u == null || c0678u.m1278e() != null) ? "<unnamed>" : c0678u.m1277d().mo919d()) + " v" + iM1949i);
            }
            iM1949i += c0887cM1938b.m1949i();
        }
        for (C0678u c0678u3 : this.f1514o) {
            if (c0678u3 != null && c0678u3.m1278e() != null) {
                m1465b(c0678u3);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private int m1463b() {
        return (this.f1505f - this.f1506g.m1927b().m1940e()) - (this.f1507h ? 0 : 1);
    }

    /* JADX INFO: renamed from: b */
    private void m1464b(int i) {
        int iM2270a = this.f1502c.m2270a();
        this.f1502c.mo569d(2);
        this.f1502c.m2291h(i);
        this.f1509j += i;
        if (this.f1510k == null && this.f1511l == null) {
            return;
        }
        m1458a(this.f1502c.m2270a() - iM2270a, String.format("line = %d", Integer.valueOf(this.f1509j)));
    }

    /* JADX INFO: renamed from: b */
    private void m1465b(C0678u c0678u) {
        int iM2270a = this.f1502c.m2270a();
        this.f1502c.mo569d(4);
        m1468d(c0678u.m1280g());
        m1460a(c0678u.m1277d());
        m1461a(c0678u.m1279f());
        m1460a(c0678u.m1278e());
        if (this.f1510k == null && this.f1511l == null) {
            return;
        }
        m1458a(this.f1502c.m2270a() - iM2270a, String.format("%04x: +localx %s", Integer.valueOf(this.f1508i), m1457a(c0678u)));
    }

    /* JADX INFO: renamed from: c */
    private ArrayList m1466c() {
        ArrayList arrayList = new ArrayList(this.f1506g.m1927b().m2239d_());
        int iM1463b = m1463b();
        BitSet bitSet = new BitSet(this.f1505f - iM1463b);
        int iD_ = this.f1501b.m2239d_();
        for (int i = 0; i < iD_; i++) {
            C0678u c0678uM1268a = this.f1501b.m1268a(i);
            int iM1280g = c0678uM1268a.m1280g();
            if (iM1280g >= iM1463b && !bitSet.get(iM1280g - iM1463b)) {
                bitSet.set(iM1280g - iM1463b);
                arrayList.add(c0678uM1268a);
            }
        }
        Collections.sort(arrayList, new C0730p(this));
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    private void m1467c(int i) {
        int iM2270a = this.f1502c.m2270a();
        this.f1502c.mo569d(1);
        this.f1502c.m2286e(i);
        this.f1508i += i;
        if (this.f1510k == null && this.f1511l == null) {
            return;
        }
        m1458a(this.f1502c.m2270a() - iM2270a, String.format("%04x: advance pc", Integer.valueOf(this.f1508i)));
    }

    /* JADX INFO: renamed from: d */
    private void m1468d(int i) {
        if (i < 0) {
            throw new RuntimeException("Signed value where unsigned required: " + i);
        }
        this.f1502c.m2286e(i);
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m1469a() {
        int i = 0;
        try {
            int iD_ = this.f1500a == null ? 0 : this.f1500a.m2239d_();
            ArrayList arrayList = new ArrayList(iD_);
            for (int i2 = 0; i2 < iD_; i2++) {
                arrayList.add(this.f1500a.m1137a(i2));
            }
            Collections.sort(arrayList, new C0729o(this));
            m1462a(arrayList, m1466c());
            this.f1502c.mo569d(7);
            if (this.f1510k != null || this.f1511l != null) {
                m1458a(1, String.format("%04x: prologue end", Integer.valueOf(this.f1508i)));
            }
            int size = arrayList.size();
            int iD_2 = this.f1501b.m2239d_();
            int i3 = 0;
            while (true) {
                int iM1454a = m1454a(i);
                int iM1456a = m1456a(i3, arrayList);
                int iM1271a = iM1454a < iD_2 ? this.f1501b.m1268a(iM1454a).m1271a() : Integer.MAX_VALUE;
                int iM1138a = iM1456a < size ? ((C0647ac) arrayList.get(iM1456a)).m1138a() : Integer.MAX_VALUE;
                int iMin = Math.min(iM1138a, iM1271a);
                if (iMin == Integer.MAX_VALUE || (iMin == this.f1504e && iM1271a == Integer.MAX_VALUE && iM1138a == Integer.MAX_VALUE)) {
                    break;
                }
                if (iMin == iM1138a) {
                    i3 = iM1456a + 1;
                    m1459a((C0647ac) arrayList.get(iM1456a));
                    i = iM1454a;
                } else {
                    m1467c(iMin - this.f1508i);
                    i = iM1454a;
                    i3 = iM1456a;
                }
            }
            this.f1502c.mo569d(0);
            if (this.f1510k != null || this.f1511l != null) {
                m1458a(1, "end sequence");
            }
            return this.f1502c.m2290g();
        } catch (IOException e) {
            throw C0482d.m570a(e, "...while encoding debug info");
        }
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m1470a(String str, PrintWriter printWriter, C0970r c0970r, boolean z) {
        this.f1512m = str;
        this.f1511l = printWriter;
        this.f1510k = c0970r;
        this.f1513n = z;
        return m1469a();
    }
}
