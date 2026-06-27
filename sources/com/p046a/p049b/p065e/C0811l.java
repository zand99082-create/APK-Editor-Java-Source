package com.p046a.p049b.p065e;

import android.support.v7.appcompat.C0327R;
import com.p046a.p047a.C0492i;
import com.p046a.p047a.C0509z;

/* JADX INFO: renamed from: com.a.b.e.l */
/* JADX INFO: loaded from: classes.dex */
final class C0811l {

    /* JADX INFO: renamed from: a */
    private int f1897a;

    /* JADX INFO: renamed from: b */
    private int f1898b;

    /* JADX INFO: renamed from: c */
    private int f1899c;

    /* JADX INFO: renamed from: d */
    private int f1900d;

    /* JADX INFO: renamed from: e */
    private int f1901e;

    /* JADX INFO: renamed from: f */
    private int f1902f;

    /* JADX INFO: renamed from: g */
    private int f1903g;

    /* JADX INFO: renamed from: h */
    private int f1904h;

    /* JADX INFO: renamed from: i */
    private int f1905i;

    /* JADX INFO: renamed from: j */
    private int f1906j;

    /* JADX INFO: renamed from: k */
    private int f1907k;

    /* JADX INFO: renamed from: l */
    private int f1908l;

    /* JADX INFO: renamed from: m */
    private int f1909m;

    public C0811l(C0492i c0492i, C0492i c0492i2) {
        this.f1897a = C0327R.styleable.AppCompatTheme_ratingBarStyleSmall;
        m1645a(c0492i.m618a(), false);
        m1645a(c0492i2.m618a(), false);
        m1647b();
    }

    public C0811l(C0801b c0801b) {
        this.f1897a = C0327R.styleable.AppCompatTheme_ratingBarStyleSmall;
        this.f1897a = c0801b.f1865f.m664n();
        this.f1898b = c0801b.f1866g.m664n();
        this.f1899c = c0801b.f1867h.m664n();
        this.f1900d = c0801b.f1868i.m664n();
        this.f1901e = c0801b.f1869j.m664n();
        this.f1902f = c0801b.f1870k.m664n();
        this.f1903g = c0801b.f1871l.m664n();
        this.f1904h = c0801b.f1872m.m664n();
        this.f1905i = c0801b.f1873n.m664n();
        this.f1906j = c0801b.f1874o.m664n();
        this.f1907k = c0801b.f1875p.m664n();
        this.f1908l = c0801b.f1876q.m664n();
        this.f1909m = c0801b.f1877r.m664n();
        m1647b();
    }

    /* JADX INFO: renamed from: a */
    private void m1645a(C0509z c0509z, boolean z) {
        this.f1898b += (c0509z.f755b.f674b << 2) + (c0509z.f756c.f674b << 2) + (c0509z.f757d.f674b * 12) + (c0509z.f758e.f674b << 3) + (c0509z.f759f.f674b << 3) + (c0509z.f760g.f674b << 5);
        this.f1899c = 220;
        this.f1900d += (c0509z.f762i.f676d + 3) & (-4);
        this.f1903g += c0509z.f767n.f676d;
        this.f1906j += c0509z.f771r.f676d;
        this.f1907k += c0509z.f764k.f676d;
        this.f1908l += c0509z.f763j.f676d;
        this.f1902f += (int) Math.ceil(((double) c0509z.f766m.f676d) * 1.25d);
        this.f1901e += (int) Math.ceil(((double) c0509z.f765l.f676d) * 1.34d);
        this.f1905i += c0509z.f770q.f676d << 1;
        this.f1909m += (int) Math.ceil(c0509z.f769p.f676d << 1);
        this.f1904h += c0509z.f768o.f676d << 1;
    }

    /* JADX INFO: renamed from: b */
    private void m1647b() {
        this.f1897a = (this.f1897a + 3) & (-4);
        this.f1898b = (this.f1898b + 3) & (-4);
        this.f1899c = (this.f1899c + 3) & (-4);
        this.f1900d = (this.f1900d + 3) & (-4);
        this.f1901e = (this.f1901e + 3) & (-4);
        this.f1902f = (this.f1902f + 3) & (-4);
        this.f1903g = (this.f1903g + 3) & (-4);
        this.f1904h = (this.f1904h + 3) & (-4);
        this.f1905i = (this.f1905i + 3) & (-4);
        this.f1906j = (this.f1906j + 3) & (-4);
        this.f1907k = (this.f1907k + 3) & (-4);
        this.f1908l = (this.f1908l + 3) & (-4);
        this.f1909m = (this.f1909m + 3) & (-4);
    }

    /* JADX INFO: renamed from: a */
    public final int m1659a() {
        return this.f1897a + this.f1898b + this.f1899c + this.f1900d + this.f1901e + this.f1902f + this.f1903g + this.f1904h + this.f1905i + this.f1906j + this.f1907k + this.f1908l + this.f1909m;
    }
}
