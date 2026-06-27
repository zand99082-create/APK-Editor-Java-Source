package com.p046a.p049b.p066f.p068b;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p066f.p070d.C0886b;
import com.p046a.p049b.p066f.p070d.C0887c;
import com.p046a.p049b.p066f.p070d.InterfaceC0889e;

/* JADX INFO: renamed from: com.a.b.f.b.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0853w {

    /* JADX INFO: renamed from: a */
    private final int f2011a;

    /* JADX INFO: renamed from: b */
    private final C0887c f2012b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC0889e f2013c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC0889e f2014d;

    /* JADX INFO: renamed from: e */
    private final int f2015e;

    /* JADX INFO: renamed from: f */
    private final boolean f2016f;

    /* JADX INFO: renamed from: g */
    private final String f2017g;

    public C0853w(int i, C0887c c0887c, InterfaceC0889e interfaceC0889e, int i2, String str) {
        this(i, c0887c, interfaceC0889e, C0886b.f2306a, i2, false, str);
    }

    private C0853w(int i, C0887c c0887c, InterfaceC0889e interfaceC0889e, InterfaceC0889e interfaceC0889e2, int i2, boolean z, String str) {
        if (c0887c == null) {
            throw new NullPointerException("result == null");
        }
        if (interfaceC0889e == null) {
            throw new NullPointerException("sources == null");
        }
        if (interfaceC0889e2 == null) {
            throw new NullPointerException("exceptions == null");
        }
        if (i2 <= 0 || i2 > 6) {
            throw new IllegalArgumentException("bogus branchingness");
        }
        if (interfaceC0889e2.mo1021d_() != 0 && i2 != 6) {
            throw new IllegalArgumentException("exceptions / branchingness mismatch");
        }
        this.f2011a = i;
        this.f2012b = c0887c;
        this.f2013c = interfaceC0889e;
        this.f2014d = interfaceC0889e2;
        this.f2015e = i2;
        this.f2016f = z;
        this.f2017g = str;
    }

    public C0853w(int i, C0887c c0887c, InterfaceC0889e interfaceC0889e, InterfaceC0889e interfaceC0889e2, String str) {
        this(i, c0887c, interfaceC0889e, interfaceC0889e2, 6, false, str);
    }

    public C0853w(int i, C0887c c0887c, InterfaceC0889e interfaceC0889e, String str) {
        this(i, c0887c, interfaceC0889e, C0886b.f2306a, 1, false, str);
    }

    public C0853w(int i, InterfaceC0889e interfaceC0889e, InterfaceC0889e interfaceC0889e2) {
        this(i, C0887c.f2350i, interfaceC0889e, interfaceC0889e2, 6, true, null);
    }

    /* JADX INFO: renamed from: a */
    public final int m1836a() {
        return this.f2011a;
    }

    /* JADX INFO: renamed from: b */
    public final C0887c m1837b() {
        return this.f2012b;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC0889e m1838c() {
        return this.f2013c;
    }

    /* JADX INFO: renamed from: d */
    public final int m1839d() {
        return this.f2015e;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m1840e() {
        return this.f2016f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0853w)) {
            return false;
        }
        C0853w c0853w = (C0853w) obj;
        return this.f2011a == c0853w.f2011a && this.f2015e == c0853w.f2015e && this.f2012b == c0853w.f2012b && this.f2013c.equals(c0853w.f2013c) && this.f2014d.equals(c0853w.f2014d);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m1841f() {
        switch (this.f2011a) {
            case 14:
            case 16:
            case 20:
            case 21:
            case 22:
                return true;
            case 15:
            case 17:
            case 18:
            case 19:
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public final String m1842g() {
        return this.f2017g != null ? this.f2017g : toString();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m1843h() {
        return this.f2014d.mo1021d_() != 0;
    }

    public final int hashCode() {
        return (((((((this.f2011a * 31) + this.f2015e) * 31) + this.f2012b.hashCode()) * 31) + this.f2013c.hashCode()) * 31) + this.f2014d.hashCode();
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer(40);
        stringBuffer.append("Rop{");
        stringBuffer.append(C1067a.m2553q(this.f2011a));
        if (this.f2012b != C0887c.f2350i) {
            stringBuffer.append(" ");
            stringBuffer.append(this.f2012b);
        } else {
            stringBuffer.append(" .");
        }
        stringBuffer.append(" <-");
        int iMo1021d_ = this.f2013c.mo1021d_();
        if (iMo1021d_ == 0) {
            stringBuffer.append(" .");
        } else {
            for (int i = 0; i < iMo1021d_; i++) {
                stringBuffer.append(' ');
                stringBuffer.append(this.f2013c.mo1018a(i));
            }
        }
        if (this.f2016f) {
            stringBuffer.append(" call");
        }
        int iMo1021d_2 = this.f2014d.mo1021d_();
        if (iMo1021d_2 == 0) {
            switch (this.f2015e) {
                case 1:
                    stringBuffer.append(" flows");
                    break;
                case 2:
                    stringBuffer.append(" returns");
                    break;
                case 3:
                    stringBuffer.append(" gotos");
                    break;
                case 4:
                    stringBuffer.append(" ifs");
                    break;
                case 5:
                    stringBuffer.append(" switches");
                    break;
                default:
                    stringBuffer.append(" " + C1067a.m2560x(this.f2015e));
                    break;
            }
        } else {
            stringBuffer.append(" throws");
            for (int i2 = 0; i2 < iMo1021d_2; i2++) {
                stringBuffer.append(' ');
                if (this.f2014d.mo1018a(i2) == C0887c.f2358q) {
                    stringBuffer.append("<any>");
                } else {
                    stringBuffer.append(this.f2014d.mo1018a(i2));
                }
            }
        }
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
