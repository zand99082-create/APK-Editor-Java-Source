package com.p046a.p049b.p058c.p060b;

import com.p046a.p049b.p066f.p068b.C0848r;
import com.p046a.p049b.p066f.p069c.C0883y;
import com.p046a.p049b.p066f.p069c.C0884z;

/* JADX INFO: renamed from: com.a.b.c.b.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0678u implements Comparable {

    /* JADX INFO: renamed from: a */
    private final int f1357a;

    /* JADX INFO: renamed from: b */
    private final EnumC0677t f1358b;

    /* JADX INFO: renamed from: c */
    private final C0848r f1359c;

    /* JADX INFO: renamed from: d */
    private final C0884z f1360d;

    public C0678u(int i, EnumC0677t enumC0677t, C0848r c0848r) {
        if (i < 0) {
            throw new IllegalArgumentException("address < 0");
        }
        if (enumC0677t == null) {
            throw new NullPointerException("disposition == null");
        }
        try {
            if (c0848r.m1797i() == null) {
                throw new NullPointerException("spec.getLocalItem() == null");
            }
            this.f1357a = i;
            this.f1358b = enumC0677t;
            this.f1359c = c0848r;
            this.f1360d = C0884z.m1916b(c0848r.mo925a());
        } catch (NullPointerException e) {
            throw new NullPointerException("spec == null");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(C0678u c0678u) {
        if (this.f1357a < c0678u.f1357a) {
            return -1;
        }
        if (this.f1357a > c0678u.f1357a) {
            return 1;
        }
        boolean zM1276c = m1276c();
        return zM1276c != c0678u.m1276c() ? zM1276c ? 1 : -1 : this.f1359c.compareTo(c0678u.f1359c);
    }

    /* JADX INFO: renamed from: a */
    public final int m1271a() {
        return this.f1357a;
    }

    /* JADX INFO: renamed from: a */
    public final C0678u m1272a(EnumC0677t enumC0677t) {
        return enumC0677t == this.f1358b ? this : new C0678u(this.f1357a, enumC0677t, this.f1359c);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1273a(C0678u c0678u) {
        return m1274a(c0678u.f1359c);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1274a(C0848r c0848r) {
        return this.f1359c.m1791a(c0848r);
    }

    /* JADX INFO: renamed from: b */
    public final EnumC0677t m1275b() {
        return this.f1358b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m1276c() {
        return this.f1358b == EnumC0677t.f1351a;
    }

    /* JADX INFO: renamed from: d */
    public final C0883y m1277d() {
        return this.f1359c.m1797i().m1767a();
    }

    /* JADX INFO: renamed from: e */
    public final C0883y m1278e() {
        return this.f1359c.m1797i().m1768b();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0678u) && compareTo((C0678u) obj) == 0;
    }

    /* JADX INFO: renamed from: f */
    public final C0884z m1279f() {
        return this.f1360d;
    }

    /* JADX INFO: renamed from: g */
    public final int m1280g() {
        return this.f1359c.m1795g();
    }

    /* JADX INFO: renamed from: h */
    public final C0848r m1281h() {
        return this.f1359c;
    }

    public final String toString() {
        return Integer.toHexString(this.f1357a) + " " + this.f1358b + " " + this.f1359c;
    }
}
