package com.p046a.p049b.p066f.p068b;

import com.p046a.p049b.p066f.p069c.AbstractC0857a;
import com.p046a.p049b.p066f.p069c.C0883y;
import com.p046a.p049b.p066f.p070d.C0887c;
import com.p046a.p049b.p066f.p070d.InterfaceC0888d;
import com.p046a.p049b.p073h.InterfaceC0971s;
import java.util.HashMap;

/* JADX INFO: renamed from: com.a.b.f.b.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0848r implements InterfaceC0888d, InterfaceC0971s, Comparable {

    /* JADX INFO: renamed from: a */
    private static final HashMap f1995a = new HashMap(1000);

    /* JADX INFO: renamed from: b */
    private static final C0849s f1996b = new C0849s(0);

    /* JADX INFO: renamed from: c */
    private final int f1997c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC0888d f1998d;

    /* JADX INFO: renamed from: e */
    private final C0843m f1999e;

    private C0848r(int i, InterfaceC0888d interfaceC0888d, C0843m c0843m) {
        if (i < 0) {
            throw new IllegalArgumentException("reg < 0");
        }
        if (interfaceC0888d == null) {
            throw new NullPointerException("type == null");
        }
        this.f1997c = i;
        this.f1998d = interfaceC0888d;
        this.f1999e = c0843m;
    }

    /* synthetic */ C0848r(int i, InterfaceC0888d interfaceC0888d, C0843m c0843m, byte b2) {
        this(i, interfaceC0888d, c0843m);
    }

    /* JADX INFO: renamed from: a */
    public static C0848r m1778a(int i, InterfaceC0888d interfaceC0888d) {
        return m1784d(i, interfaceC0888d, null);
    }

    /* JADX INFO: renamed from: a */
    public static C0848r m1779a(int i, InterfaceC0888d interfaceC0888d, C0843m c0843m) {
        if (c0843m == null) {
            throw new NullPointerException("local  == null");
        }
        return m1784d(i, interfaceC0888d, c0843m);
    }

    /* JADX INFO: renamed from: a */
    private String m1780a(boolean z) {
        StringBuffer stringBuffer = new StringBuffer(40);
        stringBuffer.append(m1801m());
        stringBuffer.append(":");
        if (this.f1999e != null) {
            stringBuffer.append(this.f1999e.toString());
        }
        C0887c c0887cMo925a = this.f1998d.mo925a();
        stringBuffer.append(c0887cMo925a);
        if (c0887cMo925a != this.f1998d) {
            stringBuffer.append("=");
            if (z && (this.f1998d instanceof C0883y)) {
                stringBuffer.append(((C0883y) this.f1998d).m1910i());
            } else if (z && (this.f1998d instanceof AbstractC0857a)) {
                stringBuffer.append(this.f1998d.mo919d());
            } else {
                stringBuffer.append(this.f1998d);
            }
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: b */
    public static C0848r m1782b(int i, InterfaceC0888d interfaceC0888d, C0843m c0843m) {
        return m1784d(i, interfaceC0888d, c0843m);
    }

    /* JADX INFO: renamed from: d */
    private static C0848r m1784d(int i, InterfaceC0888d interfaceC0888d, C0843m c0843m) {
        C0848r c0848rM1806a;
        synchronized (f1995a) {
            f1996b.m1807a(i, interfaceC0888d, c0843m);
            c0848rM1806a = (C0848r) f1995a.get(f1996b);
            if (c0848rM1806a == null) {
                c0848rM1806a = f1996b.m1806a();
                f1995a.put(c0848rM1806a, c0848rM1806a);
            }
        }
        return c0848rM1806a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public boolean m1785e(int i, InterfaceC0888d interfaceC0888d, C0843m c0843m) {
        return this.f1997c == i && this.f1998d.equals(interfaceC0888d) && (this.f1999e == c0843m || (this.f1999e != null && this.f1999e.equals(c0843m)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static int m1786f(int i, InterfaceC0888d interfaceC0888d, C0843m c0843m) {
        return ((((c0843m != null ? c0843m.hashCode() : 0) * 31) + interfaceC0888d.hashCode()) * 31) + i;
    }

    /* JADX INFO: renamed from: a */
    public final C0848r m1787a(int i) {
        return this.f1997c == i ? this : m1784d(i, this.f1998d, this.f1999e);
    }

    /* JADX INFO: renamed from: a */
    public final C0848r m1788a(C0843m c0843m) {
        return this.f1999e != c0843m ? (this.f1999e == null || !this.f1999e.equals(c0843m)) ? m1784d(this.f1997c, this.f1998d, c0843m) : this : this;
    }

    /* JADX INFO: renamed from: a */
    public final C0848r m1789a(C0848r c0848r, boolean z) {
        InterfaceC0888d interfaceC0888dMo925a;
        if (this == c0848r) {
            return this;
        }
        if (c0848r == null || this.f1997c != c0848r.f1997c) {
            return null;
        }
        C0843m c0843m = (this.f1999e == null || !this.f1999e.equals(c0848r.f1999e)) ? null : this.f1999e;
        boolean z2 = c0843m == this.f1999e;
        if ((z && !z2) || (interfaceC0888dMo925a = mo925a()) != c0848r.mo925a()) {
            return null;
        }
        if (this.f1998d.equals(c0848r.f1998d)) {
            interfaceC0888dMo925a = this.f1998d;
        }
        return (interfaceC0888dMo925a == this.f1998d && z2) ? this : c0843m == null ? m1784d(this.f1997c, interfaceC0888dMo925a, null) : m1779a(this.f1997c, interfaceC0888dMo925a, c0843m);
    }

    /* JADX INFO: renamed from: a */
    public final C0848r m1790a(InterfaceC0888d interfaceC0888d) {
        return m1784d(this.f1997c, interfaceC0888d, this.f1999e);
    }

    @Override // com.p046a.p049b.p066f.p070d.InterfaceC0888d
    /* JADX INFO: renamed from: a */
    public final C0887c mo925a() {
        return this.f1998d.mo925a();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1791a(C0848r c0848r) {
        return m1793b(c0848r) && this.f1997c == c0848r.f1997c;
    }

    /* JADX INFO: renamed from: b */
    public final C0848r m1792b(int i) {
        return i == 0 ? this : m1787a(this.f1997c + i);
    }

    @Override // com.p046a.p049b.p066f.p070d.InterfaceC0888d
    /* JADX INFO: renamed from: b */
    public final InterfaceC0888d mo926b() {
        return this.f1998d.mo926b();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1793b(C0848r c0848r) {
        if (c0848r != null && this.f1998d.mo925a().equals(c0848r.f1998d.mo925a())) {
            return this.f1999e == c0848r.f1999e || (this.f1999e != null && this.f1999e.equals(c0848r.f1999e));
        }
        return false;
    }

    @Override // com.p046a.p049b.p066f.p070d.InterfaceC0888d
    /* JADX INFO: renamed from: c */
    public final int mo927c() {
        return this.f1998d.mo927c();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C0848r c0848r) {
        if (this.f1997c < c0848r.f1997c) {
            return -1;
        }
        if (this.f1997c > c0848r.f1997c) {
            return 1;
        }
        int iCompareTo = this.f1998d.mo925a().compareTo(c0848r.f1998d.mo925a());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (this.f1999e == null) {
            return c0848r.f1999e == null ? 0 : -1;
        }
        if (c0848r.f1999e == null) {
            return 1;
        }
        return this.f1999e.compareTo(c0848r.f1999e);
    }

    @Override // com.p046a.p049b.p073h.InterfaceC0971s
    /* JADX INFO: renamed from: d */
    public final String mo919d() {
        return m1780a(true);
    }

    @Override // com.p046a.p049b.p066f.p070d.InterfaceC0888d
    /* JADX INFO: renamed from: e */
    public final int mo928e() {
        return this.f1998d.mo928e();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0848r) {
            C0848r c0848r = (C0848r) obj;
            return m1785e(c0848r.f1997c, c0848r.f1998d, c0848r.f1999e);
        }
        if (!(obj instanceof C0849s)) {
            return false;
        }
        C0849s c0849s = (C0849s) obj;
        return m1785e(c0849s.f2000a, c0849s.f2001b, c0849s.f2002c);
    }

    @Override // com.p046a.p049b.p066f.p070d.InterfaceC0888d
    /* JADX INFO: renamed from: f */
    public final boolean mo929f() {
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final int m1795g() {
        return this.f1997c;
    }

    /* JADX INFO: renamed from: h */
    public final InterfaceC0888d m1796h() {
        return this.f1998d;
    }

    public final int hashCode() {
        return m1786f(this.f1997c, this.f1998d, this.f1999e);
    }

    /* JADX INFO: renamed from: i */
    public final C0843m m1797i() {
        return this.f1999e;
    }

    /* JADX INFO: renamed from: j */
    public final int m1798j() {
        return this.f1997c + m1799k();
    }

    /* JADX INFO: renamed from: k */
    public final int m1799k() {
        return this.f1998d.mo925a().m1949i();
    }

    /* JADX INFO: renamed from: l */
    public final boolean m1800l() {
        return this.f1998d.mo925a().m1951k();
    }

    /* JADX INFO: renamed from: m */
    public final String m1801m() {
        return "v" + this.f1997c;
    }

    /* JADX INFO: renamed from: n */
    public final C0848r m1802n() {
        InterfaceC0888d interfaceC0888d = this.f1998d;
        C0887c c0887cMo925a = interfaceC0888d instanceof C0887c ? (C0887c) interfaceC0888d : interfaceC0888d.mo925a();
        if (c0887cMo925a.m1956p()) {
            c0887cMo925a = c0887cMo925a.m1957q();
        }
        return c0887cMo925a == interfaceC0888d ? this : m1784d(this.f1997c, c0887cMo925a, this.f1999e);
    }

    public final String toString() {
        return m1780a(false);
    }
}
