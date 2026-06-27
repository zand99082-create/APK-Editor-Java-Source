package com.p046a.p049b.p066f.p068b;

import com.p046a.p049b.p073h.C0968p;

/* JADX INFO: renamed from: com.a.b.f.b.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0852v extends C0968p {

    /* JADX INFO: renamed from: a */
    private final C0848r[] f2009a;

    /* JADX INFO: renamed from: b */
    private int f2010b;

    static {
        new C0852v(0);
    }

    public C0852v(int i) {
        super(i != 0);
        this.f2009a = new C0848r[i];
        this.f2010b = 0;
    }

    /* JADX INFO: renamed from: a */
    public final C0848r m1824a(int i) {
        try {
            return this.f2009a[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IllegalArgumentException("bogus reg");
        }
    }

    /* JADX INFO: renamed from: a */
    public final C0848r m1825a(C0843m c0843m) {
        int length = this.f2009a.length;
        for (int i = 0; i < length; i++) {
            C0848r c0848r = this.f2009a[i];
            if (c0848r != null && c0843m.equals(c0848r.m1797i())) {
                return c0848r;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final C0848r m1826a(C0848r c0848r) {
        return m1824a(c0848r.m1795g());
    }

    /* JADX INFO: renamed from: a */
    public final void m1827a(C0852v c0852v) {
        int length = c0852v.f2009a.length;
        for (int i = 0; i < length; i++) {
            C0848r c0848rM1824a = c0852v.m1824a(i);
            if (c0848rM1824a != null) {
                m1834d(c0848rM1824a);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1828a(C0852v c0852v, boolean z) {
        C0848r c0848rM1789a;
        m2266l();
        C0848r[] c0848rArr = c0852v.f2009a;
        int length = this.f2009a.length;
        int iMin = Math.min(length, c0848rArr.length);
        this.f2010b = -1;
        for (int i = 0; i < iMin; i++) {
            C0848r c0848r = this.f2009a[i];
            if (c0848r != null && (c0848rM1789a = c0848r.m1789a(c0848rArr[i], true)) != c0848r) {
                this.f2009a[i] = c0848rM1789a;
            }
        }
        while (iMin < length) {
            this.f2009a[iMin] = null;
            iMin++;
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m1829b() {
        return this.f2009a.length;
    }

    /* JADX INFO: renamed from: b */
    public final C0848r m1830b(C0848r c0848r) {
        int length = this.f2009a.length;
        for (int i = 0; i < length; i++) {
            C0848r c0848r2 = this.f2009a[i];
            if (c0848r2 != null && c0848r.m1793b(c0848r2)) {
                return c0848r2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final C0852v m1831b(int i) {
        int length = this.f2009a.length;
        C0852v c0852v = new C0852v(length + i);
        for (int i2 = 0; i2 < length; i2++) {
            C0848r c0848r = this.f2009a[i2];
            if (c0848r != null) {
                c0852v.m1834d(c0848r.m1792b(i));
            }
        }
        c0852v.f2010b = this.f2010b;
        if (m2265k()) {
            c0852v.mo811b_();
        }
        return c0852v;
    }

    /* JADX INFO: renamed from: c */
    public final void m1832c(C0848r c0848r) {
        try {
            this.f2009a[c0848r.m1795g()] = null;
            this.f2010b = -1;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IllegalArgumentException("bogus reg");
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m1833d() {
        int i = this.f2010b;
        if (i < 0) {
            int length = this.f2009a.length;
            i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (this.f2009a[i2] != null) {
                    i++;
                }
            }
            this.f2010b = i;
        }
        return i;
    }

    /* JADX INFO: renamed from: d */
    public final void m1834d(C0848r c0848r) {
        int i;
        C0848r c0848r2;
        m2266l();
        if (c0848r == null) {
            throw new NullPointerException("spec == null");
        }
        this.f2010b = -1;
        try {
            int iM1795g = c0848r.m1795g();
            this.f2009a[iM1795g] = c0848r;
            if (iM1795g > 0 && (c0848r2 = this.f2009a[iM1795g - 1]) != null && c0848r2.m1799k() == 2) {
                this.f2009a[i] = null;
            }
            if (c0848r.m1799k() == 2) {
                this.f2009a[iM1795g + 1] = null;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IllegalArgumentException("spec.getReg() out of range");
        }
    }

    /* JADX INFO: renamed from: e */
    public final C0852v m1835e() {
        int length = this.f2009a.length;
        C0852v c0852v = new C0852v(length);
        for (int i = 0; i < length; i++) {
            C0848r c0848r = this.f2009a[i];
            if (c0848r != null) {
                c0852v.m1834d(c0848r);
            }
        }
        c0852v.f2010b = this.f2010b;
        return c0852v;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0852v)) {
            return false;
        }
        C0852v c0852v = (C0852v) obj;
        C0848r[] c0848rArr = c0852v.f2009a;
        int length = this.f2009a.length;
        if (length != c0848rArr.length || m1833d() != c0852v.m1833d()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            C0848r c0848r = this.f2009a[i];
            Object obj2 = c0848rArr[i];
            if (c0848r != obj2 && (c0848r == null || !c0848r.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int length = this.f2009a.length;
        int iHashCode = 0;
        for (int i = 0; i < length; i++) {
            C0848r c0848r = this.f2009a[i];
            iHashCode = (iHashCode * 31) + (c0848r == null ? 0 : c0848r.hashCode());
        }
        return iHashCode;
    }

    public final String toString() {
        boolean z = false;
        int length = this.f2009a.length;
        StringBuffer stringBuffer = new StringBuffer(length * 25);
        stringBuffer.append('{');
        for (int i = 0; i < length; i++) {
            C0848r c0848r = this.f2009a[i];
            if (c0848r != null) {
                if (z) {
                    stringBuffer.append(", ");
                } else {
                    z = true;
                }
                stringBuffer.append(c0848r);
            }
        }
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
