package com.p046a.p049b.p066f.p069c;

import com.p046a.p049b.p066f.p067a.C0822a;

/* JADX INFO: renamed from: com.a.b.f.c.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0861c extends AbstractC0857a {

    /* JADX INFO: renamed from: a */
    private final C0822a f2234a;

    public C0861c(C0822a c0822a) {
        if (c0822a == null) {
            throw new NullPointerException("annotation == null");
        }
        c0822a.m2267m();
        this.f2234a = c0822a;
    }

    /* JADX INFO: renamed from: a */
    public final C0822a m1873a() {
        return this.f2234a;
    }

    @Override // com.p046a.p049b.p066f.p069c.AbstractC0857a
    /* JADX INFO: renamed from: b */
    protected final int mo1864b(AbstractC0857a abstractC0857a) {
        return this.f2234a.compareTo(((C0861c) abstractC0857a).f2234a);
    }

    @Override // com.p046a.p049b.p073h.InterfaceC0971s
    /* JADX INFO: renamed from: d */
    public final String mo919d() {
        return this.f2234a.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0861c) {
            return this.f2234a.equals(((C0861c) obj).f2234a);
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
        return "annotation";
    }

    public final int hashCode() {
        return this.f2234a.hashCode();
    }

    public final String toString() {
        return this.f2234a.toString();
    }
}
