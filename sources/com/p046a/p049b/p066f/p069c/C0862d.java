package com.p046a.p049b.p066f.p069c;

/* JADX INFO: renamed from: com.a.b.f.c.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0862d extends AbstractC0857a {

    /* JADX INFO: renamed from: a */
    private final C0863e f2235a;

    public C0862d(C0863e c0863e) {
        c0863e.m2267m();
        this.f2235a = c0863e;
    }

    /* JADX INFO: renamed from: a */
    public final C0863e m1874a() {
        return this.f2235a;
    }

    @Override // com.p046a.p049b.p066f.p069c.AbstractC0857a
    /* JADX INFO: renamed from: b */
    protected final int mo1864b(AbstractC0857a abstractC0857a) {
        return this.f2235a.compareTo(((C0862d) abstractC0857a).f2235a);
    }

    @Override // com.p046a.p049b.p073h.InterfaceC0971s
    /* JADX INFO: renamed from: d */
    public final String mo919d() {
        return this.f2235a.m2238b("{", ", ", "}");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0862d) {
            return this.f2235a.equals(((C0862d) obj).f2235a);
        }
        return false;
    }

    @Override // com.p046a.p049b.p066f.p069c.AbstractC0857a
    /* JADX INFO: renamed from: g */
    public final boolean mo1865g() {
        return false;
    }

    @Override // com.p046a.p049b.p066f.p069c.AbstractC0857a
    /* JADX INFO: renamed from: h */
    public final String mo1866h() {
        return "array";
    }

    public final int hashCode() {
        return this.f2235a.hashCode();
    }

    public final String toString() {
        return this.f2235a.m2236a("array{", ", ", "}");
    }
}
