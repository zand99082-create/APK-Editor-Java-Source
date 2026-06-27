package com.p046a.p049b.p065e;

import com.p046a.p047a.C0478a;
import com.p046a.p047a.C0484ab;
import com.p046a.p047a.C0488e;
import com.p046a.p047a.C0492i;
import com.p046a.p047a.C0504u;
import com.p046a.p047a.C0506w;
import com.p046a.p047a.C0507x;
import com.p046a.p047a.C0508y;
import com.p046a.p047a.C0509z;
import com.p046a.p049b.p073h.C0970r;
import java.util.HashMap;

/* JADX INFO: renamed from: com.a.b.e.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0812m {

    /* JADX INFO: renamed from: a */
    public final int[] f1910a;

    /* JADX INFO: renamed from: b */
    public final short[] f1911b;

    /* JADX INFO: renamed from: c */
    public final short[] f1912c;

    /* JADX INFO: renamed from: d */
    public final short[] f1913d;

    /* JADX INFO: renamed from: e */
    public final short[] f1914e;

    /* JADX INFO: renamed from: f */
    private final C0492i f1915f;

    /* JADX INFO: renamed from: g */
    private final HashMap f1916g = new HashMap();

    /* JADX INFO: renamed from: h */
    private final HashMap f1917h = new HashMap();

    /* JADX INFO: renamed from: i */
    private final HashMap f1918i = new HashMap();

    /* JADX INFO: renamed from: j */
    private final HashMap f1919j = new HashMap();

    /* JADX INFO: renamed from: k */
    private final HashMap f1920k = new HashMap();

    /* JADX INFO: renamed from: l */
    private final HashMap f1921l = new HashMap();

    public C0812m(C0492i c0492i, C0509z c0509z) {
        this.f1915f = c0492i;
        this.f1910a = new int[c0509z.f755b.f674b];
        this.f1911b = new short[c0509z.f756c.f674b];
        this.f1912c = new short[c0509z.f757d.f674b];
        this.f1913d = new short[c0509z.f758e.f674b];
        this.f1914e = new short[c0509z.f759f.f674b];
        this.f1916g.put(0, 0);
        this.f1918i.put(0, 0);
        this.f1920k.put(0, 0);
        this.f1921l.put(0, 0);
    }

    /* JADX INFO: renamed from: j */
    private int m1660j(int i) {
        return ((Integer) this.f1916g.get(Integer.valueOf(i))).intValue();
    }

    /* JADX INFO: renamed from: a */
    public final int m1661a(int i) {
        if (i == -1) {
            return -1;
        }
        return this.f1910a[i];
    }

    /* JADX INFO: renamed from: a */
    public final C0478a m1662a(C0478a c0478a) {
        C0970r c0970r = new C0970r(32);
        new C0813n(this, c0970r).m1685b(c0478a.m567b());
        return new C0478a(this.f1915f, c0478a.m565a(), new C0504u(c0970r.m2290g()));
    }

    /* JADX INFO: renamed from: a */
    public final C0484ab m1663a(C0484ab c0484ab) {
        if (c0484ab == C0484ab.f677a) {
            return c0484ab;
        }
        short[] sArr = (short[]) c0484ab.m575a().clone();
        for (int i = 0; i < sArr.length; i++) {
            sArr[i] = (short) m1669b(sArr[i]);
        }
        return new C0484ab(this.f1915f, sArr);
    }

    /* JADX INFO: renamed from: a */
    public final C0488e m1664a(C0488e c0488e) {
        return new C0488e(this.f1915f, c0488e.m585a(), m1669b(c0488e.m586b()), c0488e.m590f(), m1669b(c0488e.m587c()), m1660j(c0488e.m588d()), c0488e.m591g(), c0488e.m592h(), c0488e.m593i(), c0488e.m594j());
    }

    /* JADX INFO: renamed from: a */
    public final C0506w m1665a(C0506w c0506w) {
        return new C0506w(this.f1915f, m1669b(c0506w.m690a()), m1669b(c0506w.m692b()), m1661a(c0506w.m693c()));
    }

    /* JADX INFO: renamed from: a */
    public final C0507x m1666a(C0507x c0507x) {
        return new C0507x(this.f1915f, m1669b(c0507x.m694a()), this.f1912c[c0507x.m696b()] & 65535, m1661a(c0507x.m697c()));
    }

    /* JADX INFO: renamed from: a */
    public final C0508y m1667a(C0508y c0508y) {
        return new C0508y(this.f1915f, m1661a(c0508y.m698a()), m1669b(c0508y.m700b()), m1660j(c0508y.m701c()));
    }

    /* JADX INFO: renamed from: a */
    public final void m1668a(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException();
        }
        this.f1916g.put(Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: b */
    public final int m1669b(int i) {
        if (i == -1) {
            return -1;
        }
        return this.f1911b[i] & 65535;
    }

    /* JADX INFO: renamed from: b */
    public final void m1670b(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException();
        }
        this.f1917h.put(Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: c */
    public final int m1671c(int i) {
        return this.f1913d[i] & 65535;
    }

    /* JADX INFO: renamed from: c */
    public final void m1672c(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException();
        }
        this.f1918i.put(Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: d */
    public final int m1673d(int i) {
        return this.f1914e[i] & 65535;
    }

    /* JADX INFO: renamed from: d */
    public final void m1674d(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException();
        }
        this.f1919j.put(Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: e */
    public final int m1675e(int i) {
        return ((Integer) this.f1917h.get(Integer.valueOf(i))).intValue();
    }

    /* JADX INFO: renamed from: e */
    public final void m1676e(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException();
        }
        this.f1920k.put(Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: f */
    public final int m1677f(int i) {
        return ((Integer) this.f1918i.get(Integer.valueOf(i))).intValue();
    }

    /* JADX INFO: renamed from: f */
    public final void m1678f(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException();
        }
        this.f1921l.put(Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: g */
    public final int m1679g(int i) {
        return ((Integer) this.f1919j.get(Integer.valueOf(i))).intValue();
    }

    /* JADX INFO: renamed from: h */
    public final int m1680h(int i) {
        return ((Integer) this.f1920k.get(Integer.valueOf(i))).intValue();
    }

    /* JADX INFO: renamed from: i */
    public final int m1681i(int i) {
        return ((Integer) this.f1921l.get(Integer.valueOf(i))).intValue();
    }
}
