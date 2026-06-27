package com.p046a.p049b.p066f.p069c;

import com.p046a.p049b.p066f.p070d.C0887c;

/* JADX INFO: renamed from: com.a.b.f.c.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0881w extends AbstractC0857a {

    /* JADX INFO: renamed from: a */
    public static final C0881w f2264a = new C0881w(new C0883y("TYPE"), new C0883y("Ljava/lang/Class;"));

    /* JADX INFO: renamed from: b */
    private final C0883y f2265b;

    /* JADX INFO: renamed from: c */
    private final C0883y f2266c;

    public C0881w(C0883y c0883y, C0883y c0883y2) {
        if (c0883y == null) {
            throw new NullPointerException("name == null");
        }
        if (c0883y2 == null) {
            throw new NullPointerException("descriptor == null");
        }
        this.f2265b = c0883y;
        this.f2266c = c0883y2;
    }

    /* JADX INFO: renamed from: a */
    public final C0883y m1900a() {
        return this.f2265b;
    }

    @Override // com.p046a.p049b.p066f.p069c.AbstractC0857a
    /* JADX INFO: renamed from: b */
    protected final int mo1864b(AbstractC0857a abstractC0857a) {
        C0881w c0881w = (C0881w) abstractC0857a;
        int iA = this.f2265b.compareTo(c0881w.f2265b);
        return iA != 0 ? iA : this.f2266c.compareTo(c0881w.f2266c);
    }

    /* JADX INFO: renamed from: b */
    public final C0883y m1901b() {
        return this.f2266c;
    }

    /* JADX INFO: renamed from: c */
    public final C0887c m1902c() {
        return C0887c.m1941a(this.f2266c.m1911j());
    }

    @Override // com.p046a.p049b.p073h.InterfaceC0971s
    /* JADX INFO: renamed from: d */
    public final String mo919d() {
        return this.f2265b.mo919d() + ':' + this.f2266c.mo919d();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m1903e() {
        return this.f2265b.m1911j().equals("<init>");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0881w)) {
            return false;
        }
        C0881w c0881w = (C0881w) obj;
        return this.f2265b.equals(c0881w.f2265b) && this.f2266c.equals(c0881w.f2266c);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m1904f() {
        return this.f2265b.m1911j().equals("<clinit>");
    }

    @Override // com.p046a.p049b.p066f.p069c.AbstractC0857a
    /* JADX INFO: renamed from: g */
    public final boolean mo1865g() {
        return false;
    }

    @Override // com.p046a.p049b.p066f.p069c.AbstractC0857a
    /* JADX INFO: renamed from: h */
    public final String mo1866h() {
        return "nat";
    }

    public final int hashCode() {
        return (this.f2265b.hashCode() * 31) ^ this.f2266c.hashCode();
    }

    public final String toString() {
        return "nat{" + mo919d() + '}';
    }
}
