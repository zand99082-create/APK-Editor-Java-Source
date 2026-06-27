package com.p046a.p049b.p065e;

import android.support.v7.appcompat.C0327R;
import com.github.megatronking.stringfog.xor.StringFogImpl;
import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p047a.C0483aa;
import com.p046a.p047a.C0485b;
import com.p046a.p047a.C0486c;
import com.p046a.p047a.C0487d;
import com.p046a.p047a.C0488e;
import com.p046a.p047a.C0489f;
import com.p046a.p047a.C0490g;
import com.p046a.p047a.C0491h;
import com.p046a.p047a.C0492i;
import com.p046a.p047a.C0498o;
import com.p046a.p047a.C0502s;
import com.p046a.p047a.C0504u;
import com.p046a.p047a.C0505v;
import com.p046a.p047a.C0509z;
import com.p046a.p049b.p073h.C0970r;
import java.util.Arrays;

/* JADX INFO: renamed from: com.a.b.e.b */
/* JADX INFO: loaded from: classes.dex */
public class C0801b {

    /* JADX INFO: renamed from: a */
    private final C0492i f1860a;

    /* JADX INFO: renamed from: b */
    private final C0492i f1861b;

    /* JADX INFO: renamed from: c */
    private final int f1862c;

    /* JADX INFO: renamed from: d */
    private final C0811l f1863d;

    /* JADX INFO: renamed from: e */
    private final C0492i f1864e;

    /* JADX INFO: renamed from: f */
    private final C0498o f1865f;

    /* JADX INFO: renamed from: g */
    private final C0498o f1866g;

    /* JADX INFO: renamed from: h */
    private final C0498o f1867h;

    /* JADX INFO: renamed from: i */
    private final C0498o f1868i;

    /* JADX INFO: renamed from: j */
    private final C0498o f1869j;

    /* JADX INFO: renamed from: k */
    private final C0498o f1870k;

    /* JADX INFO: renamed from: l */
    private final C0498o f1871l;

    /* JADX INFO: renamed from: m */
    private final C0498o f1872m;

    /* JADX INFO: renamed from: n */
    private final C0498o f1873n;

    /* JADX INFO: renamed from: o */
    private final C0498o f1874o;

    /* JADX INFO: renamed from: p */
    private final C0498o f1875p;

    /* JADX INFO: renamed from: q */
    private final C0498o f1876q;

    /* JADX INFO: renamed from: r */
    private final C0498o f1877r;

    /* JADX INFO: renamed from: s */
    private final C0509z f1878s;

    /* JADX INFO: renamed from: t */
    private final C0812m f1879t;

    /* JADX INFO: renamed from: u */
    private final C0812m f1880u;

    /* JADX INFO: renamed from: v */
    private final C0814o f1881v;

    /* JADX INFO: renamed from: w */
    private final C0814o f1882w;

    /* JADX INFO: renamed from: x */
    private int f1883x;

    public C0801b(C0492i c0492i, C0492i c0492i2, int i) {
        this(c0492i, c0492i2, i, new C0811l(c0492i, c0492i2));
    }

    private C0801b(C0492i c0492i, C0492i c0492i2, int i, C0811l c0811l) {
        this.f1883x = 1048576;
        this.f1860a = c0492i;
        this.f1861b = c0492i2;
        this.f1862c = i;
        this.f1863d = c0811l;
        this.f1864e = new C0492i(c0811l.m1659a());
        C0509z c0509zM618a = c0492i.m618a();
        C0509z c0509zM618a2 = c0492i2.m618a();
        this.f1879t = new C0812m(this.f1864e, c0509zM618a);
        this.f1880u = new C0812m(this.f1864e, c0509zM618a2);
        this.f1881v = new C0814o(this.f1879t);
        this.f1882w = new C0814o(this.f1880u);
        this.f1865f = this.f1864e.m617a(c0811l.f1897a, "header");
        this.f1866g = this.f1864e.m617a(c0811l.f1898b, "ids defs");
        this.f1878s = this.f1864e.m618a();
        this.f1878s.f779z = this.f1864e.m622c();
        this.f1878s.f761h.f675c = this.f1864e.m622c();
        this.f1878s.f761h.f674b = 1;
        this.f1867h = this.f1864e.m617a(c0811l.f1899c, "map list");
        this.f1878s.f762i.f675c = this.f1864e.m622c();
        this.f1868i = this.f1864e.m617a(c0811l.f1900d, "type list");
        this.f1878s.f763j.f675c = this.f1864e.m622c();
        this.f1876q = this.f1864e.m617a(c0811l.f1908l, "annotation set ref list");
        this.f1878s.f764k.f675c = this.f1864e.m622c();
        this.f1875p = this.f1864e.m617a(c0811l.f1907k, "annotation sets");
        this.f1878s.f765l.f675c = this.f1864e.m622c();
        this.f1869j = this.f1864e.m617a(c0811l.f1901e, "class data");
        this.f1878s.f766m.f675c = this.f1864e.m622c();
        this.f1870k = this.f1864e.m617a(c0811l.f1902f, "code");
        this.f1878s.f767n.f675c = this.f1864e.m622c();
        this.f1871l = this.f1864e.m617a(c0811l.f1903g, "string data");
        this.f1878s.f768o.f675c = this.f1864e.m622c();
        this.f1872m = this.f1864e.m617a(c0811l.f1904h, "debug info");
        this.f1878s.f769p.f675c = this.f1864e.m622c();
        this.f1877r = this.f1864e.m617a(c0811l.f1909m, "annotation");
        this.f1878s.f770q.f675c = this.f1864e.m622c();
        this.f1873n = this.f1864e.m617a(c0811l.f1905i, "encoded array");
        this.f1878s.f771r.f675c = this.f1864e.m622c();
        this.f1874o = this.f1864e.m617a(c0811l.f1906j, "annotations directory");
        this.f1878s.f778y = this.f1864e.m622c() - this.f1878s.f779z;
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ C0812m m1609a(C0801b c0801b, C0492i c0492i) {
        if (c0492i == c0801b.f1860a) {
            return c0801b.f1879t;
        }
        if (c0492i == c0801b.f1861b) {
            return c0801b.f1880u;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: a */
    private void m1610a(C0492i c0492i, C0812m c0812m) {
        C0483aa c0483aa = c0492i.m618a().f764k;
        if (c0483aa.m574a()) {
            C0498o c0498oM616a = c0492i.m616a(c0483aa.f675c);
            for (int i = 0; i < c0483aa.f674b; i++) {
                this.f1878s.f764k.f674b++;
                this.f1875p.m663m();
                c0812m.m1672c(c0498oM616a.m640a(), this.f1875p.m640a());
                int iM647b = c0498oM616a.m647b();
                this.f1875p.m654f(iM647b);
                for (int i2 = 0; i2 < iM647b; i2++) {
                    this.f1875p.m654f(c0812m.m1675e(c0498oM616a.m647b()));
                }
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x00fd. Please report as an issue. */
    /* JADX INFO: renamed from: a */
    private void m1611a(C0492i c0492i, C0812m c0812m, C0487d[] c0487dArr) {
        int length = c0487dArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            C0487d c0487d = c0487dArr[i];
            int iM1673d = c0812m.m1673d(c0487d.m582a());
            this.f1869j.m656g(iM1673d - i2);
            this.f1869j.m656g(c0487d.m583b());
            if (c0487d.m584c() == 0) {
                this.f1869j.m656g(0);
            } else {
                this.f1870k.m662l();
                this.f1869j.m656g(this.f1870k.m640a());
                C0489f c0489fM615a = c0492i.m615a(c0487d);
                this.f1878s.f766m.f674b++;
                this.f1870k.m663m();
                this.f1870k.m652e(c0489fM615a.m595a());
                this.f1870k.m652e(c0489fM615a.m596b());
                this.f1870k.m652e(c0489fM615a.m597c());
                C0491h[] c0491hArrM600f = c0489fM615a.m600f();
                C0490g[] c0490gArrM601g = c0489fM615a.m601g();
                this.f1870k.m652e(c0491hArrM600f.length);
                int iM598d = c0489fM615a.m598d();
                if (iM598d != 0) {
                    this.f1870k.m654f(this.f1872m.m640a());
                    C0498o c0498oM616a = c0492i.m616a(iM598d);
                    this.f1878s.f768o.f674b++;
                    this.f1872m.m656g(C1067a.m2494b(c0498oM616a));
                    int iM2494b = C1067a.m2494b(c0498oM616a);
                    this.f1872m.m656g(iM2494b);
                    for (int i3 = 0; i3 < iM2494b; i3++) {
                        this.f1872m.m648b(c0812m.m1661a(C1067a.m2494b(c0498oM616a) - 1));
                    }
                    while (true) {
                        byte bMo568d = c0498oM616a.mo568d();
                        this.f1872m.mo569d(bMo568d);
                        switch (bMo568d) {
                            case 1:
                                this.f1872m.m656g(C1067a.m2494b(c0498oM616a));
                                break;
                            case 2:
                                this.f1872m.m658h(C1067a.m2433a(c0498oM616a));
                                break;
                            case 3:
                            case 4:
                                this.f1872m.m656g(C1067a.m2494b(c0498oM616a));
                                this.f1872m.m648b(c0812m.m1661a(C1067a.m2494b(c0498oM616a) - 1));
                                this.f1872m.m648b(c0812m.m1669b(C1067a.m2494b(c0498oM616a) - 1));
                                if (bMo568d == 4) {
                                    this.f1872m.m648b(c0812m.m1661a(C1067a.m2494b(c0498oM616a) - 1));
                                }
                                break;
                            case 5:
                            case 6:
                                this.f1872m.m656g(C1067a.m2494b(c0498oM616a));
                                break;
                            case 9:
                                this.f1872m.m648b(c0812m.m1661a(C1067a.m2494b(c0498oM616a) - 1));
                                break;
                        }
                    }
                } else {
                    this.f1870k.m654f(0);
                }
                short[] sArrM1692a = (c0492i == this.f1860a ? this.f1881v : this.f1882w).m1692a(c0489fM615a.m599e());
                this.f1870k.m654f(sArrM1692a.length);
                this.f1870k.m645a(sArrM1692a);
                if (c0491hArrM600f.length > 0) {
                    if (sArrM1692a.length % 2 == 1) {
                        this.f1870k.m643a((short) 0);
                    }
                    C0498o c0498oM616a2 = this.f1864e.m616a(this.f1870k.m640a());
                    this.f1870k.m650c(c0491hArrM600f.length << 3);
                    int iM640a = this.f1870k.m640a();
                    this.f1870k.m656g(c0490gArrM601g.length);
                    int[] iArr = new int[c0490gArrM601g.length];
                    int i4 = 0;
                    while (true) {
                        int i5 = i4;
                        if (i5 < c0490gArrM601g.length) {
                            iArr[i5] = this.f1870k.m640a() - iM640a;
                            C0490g c0490g = c0490gArrM601g[i5];
                            int iM604c = c0490g.m604c();
                            int[] iArrM602a = c0490g.m602a();
                            int[] iArrM603b = c0490g.m603b();
                            if (iM604c != -1) {
                                this.f1870k.m658h(-iArrM602a.length);
                            } else {
                                this.f1870k.m658h(iArrM602a.length);
                            }
                            for (int i6 = 0; i6 < iArrM602a.length; i6++) {
                                this.f1870k.m656g(c0812m.m1669b(iArrM602a[i6]));
                                this.f1870k.m656g(iArrM603b[i6]);
                            }
                            if (iM604c != -1) {
                                this.f1870k.m656g(iM604c);
                            }
                            i4 = i5 + 1;
                        } else {
                            for (C0491h c0491h : c0491hArrM600f) {
                                c0498oM616a2.m654f(c0491h.m605a());
                                c0498oM616a2.m652e(c0491h.m606b());
                                c0498oM616a2.m652e(iArr[c0491h.m607c()]);
                            }
                        }
                    }
                }
            }
            i++;
            i2 = iM1673d;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m1612a(C0812m c0812m, C0486c[] c0486cArr) {
        int i = 0;
        int length = c0486cArr.length;
        int i2 = 0;
        while (i < length) {
            C0486c c0486c = c0486cArr[i];
            int iM1671c = c0812m.m1671c(c0486c.m580a());
            this.f1869j.m656g(iM1671c - i2);
            this.f1869j.m656g(c0486c.m581b());
            i++;
            i2 = iM1671c;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m1613a(C0820u[] c0820uArr, C0492i c0492i, C0812m c0812m) {
        for (C0488e c0488e : c0492i.m631k()) {
            C0820u c0820u = new C0820u(c0492i, c0488e);
            C0820u c0820u2 = new C0820u(c0820u.m1694a(), c0812m.m1664a(c0820u.m1696b()));
            int iM1697c = c0820u2.m1697c();
            if (c0820uArr[iM1697c] == null) {
                c0820uArr[iM1697c] = c0820u2;
            } else if (this.f1862c != C0800a.f1858a) {
                throw new C0502s("Multiple dex files define " + ((String) c0492i.m627g().get(c0488e.m586b())));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private C0492i m1614b() {
        boolean zM1695a;
        new C0802c(this, this.f1866g).m1641a();
        new C0803d(this, this.f1866g).m1641a();
        new C0804e(this, this.f1868i).m1642b();
        new C0805f(this, this.f1866g).m1641a();
        new C0806g(this, this.f1866g).m1641a();
        new C0807h(this, this.f1866g).m1641a();
        new C0808i(this, this.f1877r).m1642b();
        m1610a(this.f1860a, this.f1879t);
        m1610a(this.f1861b, this.f1880u);
        m1616b(this.f1860a, this.f1879t);
        m1616b(this.f1861b, this.f1880u);
        m1618c(this.f1860a, this.f1879t);
        m1618c(this.f1861b, this.f1880u);
        m1620d(this.f1860a, this.f1879t);
        m1620d(this.f1861b, this.f1880u);
        C0820u[] c0820uArr = new C0820u[this.f1878s.f756c.f674b];
        m1613a(c0820uArr, this.f1860a, this.f1879t);
        m1613a(c0820uArr, this.f1861b, this.f1880u);
        do {
            zM1695a = true;
            for (C0820u c0820u : c0820uArr) {
                if (c0820u != null && !c0820u.m1698d()) {
                    zM1695a &= c0820u.m1695a(c0820uArr);
                }
            }
        } while (!zM1695a);
        Arrays.sort(c0820uArr, C0820u.f1933a);
        int iIndexOf = Arrays.asList(c0820uArr).indexOf(null);
        C0820u[] c0820uArr2 = iIndexOf != -1 ? (C0820u[]) Arrays.copyOfRange(c0820uArr, 0, iIndexOf) : c0820uArr;
        this.f1878s.f760g.f675c = this.f1866g.m640a();
        this.f1878s.f760g.f674b = c0820uArr2.length;
        for (C0820u c0820u2 : c0820uArr2) {
            C0492i c0492iM1694a = c0820u2.m1694a();
            C0812m c0812m = c0492iM1694a == this.f1860a ? this.f1879t : this.f1880u;
            C0488e c0488eM1696b = c0820u2.m1696b();
            this.f1866g.m663m();
            this.f1866g.m654f(c0488eM1696b.m586b());
            this.f1866g.m654f(c0488eM1696b.m590f());
            this.f1866g.m654f(c0488eM1696b.m587c());
            this.f1866g.m654f(c0488eM1696b.m588d());
            this.f1866g.m654f(c0812m.m1661a(c0488eM1696b.m591g()));
            this.f1866g.m654f(c0812m.m1680h(c0488eM1696b.m592h()));
            if (c0488eM1696b.m593i() == 0) {
                this.f1866g.m654f(0);
            } else {
                this.f1866g.m654f(this.f1869j.m640a());
                C0485b c0485bM614a = c0492iM1694a.m614a(c0488eM1696b);
                this.f1878s.f765l.f674b++;
                C0486c[] c0486cArrM576a = c0485bM614a.m576a();
                C0486c[] c0486cArrM577b = c0485bM614a.m577b();
                C0487d[] c0487dArrM578c = c0485bM614a.m578c();
                C0487d[] c0487dArrM579d = c0485bM614a.m579d();
                this.f1869j.m656g(c0486cArrM576a.length);
                this.f1869j.m656g(c0486cArrM577b.length);
                this.f1869j.m656g(c0487dArrM578c.length);
                this.f1869j.m656g(c0487dArrM579d.length);
                m1612a(c0812m, c0486cArrM576a);
                m1612a(c0812m, c0486cArrM577b);
                m1611a(c0492iM1694a, c0812m, c0487dArrM578c);
                m1611a(c0492iM1694a, c0812m, c0487dArrM579d);
            }
            this.f1866g.m654f(c0812m.m1681i(c0488eM1696b.m594j()));
        }
        this.f1878s.f754a.f675c = 0;
        this.f1878s.f754a.f674b = 1;
        this.f1878s.f775v = this.f1864e.m620b();
        this.f1878s.m703a();
        C0509z c0509z = this.f1878s;
        C0498o c0498o = this.f1865f;
        c0498o.m644a(C1067a.m2515c(13).getBytes(StringFogImpl.CHARSET_NAME_UTF_8));
        c0498o.m654f(c0509z.f773t);
        c0498o.m644a(c0509z.f774u);
        c0498o.m654f(c0509z.f775v);
        c0498o.m654f(C0327R.styleable.AppCompatTheme_ratingBarStyleSmall);
        c0498o.m654f(305419896);
        c0498o.m654f(c0509z.f776w);
        c0498o.m654f(c0509z.f777x);
        c0498o.m654f(c0509z.f761h.f675c);
        c0498o.m654f(c0509z.f755b.f674b);
        c0498o.m654f(c0509z.f755b.f675c);
        c0498o.m654f(c0509z.f756c.f674b);
        c0498o.m654f(c0509z.f756c.f675c);
        c0498o.m654f(c0509z.f757d.f674b);
        c0498o.m654f(c0509z.f757d.f675c);
        c0498o.m654f(c0509z.f758e.f674b);
        c0498o.m654f(c0509z.f758e.f675c);
        c0498o.m654f(c0509z.f759f.f674b);
        c0498o.m654f(c0509z.f759f.f675c);
        c0498o.m654f(c0509z.f760g.f674b);
        c0498o.m654f(c0509z.f760g.f675c);
        c0498o.m654f(c0509z.f778y);
        c0498o.m654f(c0509z.f779z);
        C0509z c0509z2 = this.f1878s;
        C0498o c0498o2 = this.f1867h;
        C0483aa[] c0483aaArr = c0509z2.f772s;
        int i = 0;
        for (int i2 = 0; i2 < 18; i2++) {
            if (c0483aaArr[i2].m574a()) {
                i++;
            }
        }
        c0498o2.m654f(i);
        C0483aa[] c0483aaArr2 = c0509z2.f772s;
        for (int i3 = 0; i3 < 18; i3++) {
            C0483aa c0483aa = c0483aaArr2[i3];
            if (c0483aa.m574a()) {
                c0498o2.m643a(c0483aa.f673a);
                c0498o2.m643a((short) 0);
                c0498o2.m654f(c0483aa.f674b);
                c0498o2.m654f(c0483aa.f675c);
            }
        }
        this.f1864e.m632l();
        return this.f1864e;
    }

    /* JADX INFO: renamed from: b */
    private void m1616b(C0492i c0492i, C0812m c0812m) {
        C0483aa c0483aa = c0492i.m618a().f763j;
        if (c0483aa.m574a()) {
            C0498o c0498oM616a = c0492i.m616a(c0483aa.f675c);
            for (int i = 0; i < c0483aa.f674b; i++) {
                this.f1878s.f763j.f674b++;
                this.f1876q.m663m();
                c0812m.m1674d(c0498oM616a.m640a(), this.f1876q.m640a());
                int iM647b = c0498oM616a.m647b();
                this.f1876q.m654f(iM647b);
                for (int i2 = 0; i2 < iM647b; i2++) {
                    this.f1876q.m654f(c0812m.m1677f(c0498oM616a.m647b()));
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private void m1618c(C0492i c0492i, C0812m c0812m) {
        C0483aa c0483aa = c0492i.m618a().f771r;
        if (c0483aa.m574a()) {
            C0498o c0498oM616a = c0492i.m616a(c0483aa.f675c);
            for (int i = 0; i < c0483aa.f674b; i++) {
                this.f1878s.f771r.f674b++;
                this.f1874o.m663m();
                c0812m.m1676e(c0498oM616a.m640a(), this.f1874o.m640a());
                this.f1874o.m654f(c0812m.m1677f(c0498oM616a.m647b()));
                int iM647b = c0498oM616a.m647b();
                this.f1874o.m654f(iM647b);
                int iM647b2 = c0498oM616a.m647b();
                this.f1874o.m654f(iM647b2);
                int iM647b3 = c0498oM616a.m647b();
                this.f1874o.m654f(iM647b3);
                for (int i2 = 0; i2 < iM647b; i2++) {
                    this.f1874o.m654f(c0812m.m1671c(c0498oM616a.m647b()));
                    this.f1874o.m654f(c0812m.m1677f(c0498oM616a.m647b()));
                }
                for (int i3 = 0; i3 < iM647b2; i3++) {
                    this.f1874o.m654f(c0812m.m1673d(c0498oM616a.m647b()));
                    this.f1874o.m654f(c0812m.m1677f(c0498oM616a.m647b()));
                }
                for (int i4 = 0; i4 < iM647b3; i4++) {
                    this.f1874o.m654f(c0812m.m1673d(c0498oM616a.m647b()));
                    this.f1874o.m654f(c0812m.m1679g(c0498oM616a.m647b()));
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private void m1620d(C0492i c0492i, C0812m c0812m) {
        C0483aa c0483aa = c0492i.m618a().f770q;
        if (c0483aa.m574a()) {
            C0498o c0498oM616a = c0492i.m616a(c0483aa.f675c);
            for (int i = 0; i < c0483aa.f674b; i++) {
                this.f1878s.f770q.f674b++;
                c0812m.m1678f(c0498oM616a.m640a(), this.f1873n.m640a());
                C0504u c0504uM661k = c0498oM616a.m661k();
                C0970r c0970r = new C0970r(32);
                new C0813n(c0812m, c0970r).m1687c(new C0505v(c0504uM661k, 28));
                new C0504u(c0970r.m2290g()).m668a(this.f1873n);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final C0492i m1635a() {
        long jNanoTime = System.nanoTime();
        C0492i c0492iM1614b = m1614b();
        C0811l c0811l = new C0811l(this);
        int iM1659a = this.f1863d.m1659a() - c0811l.m1659a();
        if (iM1659a > this.f1883x) {
            c0492iM1614b = new C0801b(this.f1864e, new C0492i(0), C0800a.f1859b, c0811l).m1614b();
            System.out.printf("Result compacted from %.1fKiB to %.1fKiB to save %.1fKiB%n", Float.valueOf(this.f1864e.m620b() / 1024.0f), Float.valueOf(c0492iM1614b.m620b() / 1024.0f), Float.valueOf(iM1659a / 1024.0f));
        }
        System.out.printf("Merged dex A (%d defs/%.1fKiB) with dex B (%d defs/%.1fKiB). Result is %d defs/%.1fKiB. Took %.1fs%n", Integer.valueOf(this.f1860a.m618a().f760g.f674b), Float.valueOf(this.f1860a.m620b() / 1024.0f), Integer.valueOf(this.f1861b.m618a().f760g.f674b), Float.valueOf(this.f1861b.m620b() / 1024.0f), Integer.valueOf(c0492iM1614b.m618a().f760g.f674b), Float.valueOf(c0492iM1614b.m620b() / 1024.0f), Float.valueOf((System.nanoTime() - jNanoTime) / 1.0E9f));
        return c0492iM1614b;
    }
}
