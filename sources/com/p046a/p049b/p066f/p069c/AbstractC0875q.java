package com.p046a.p049b.p066f.p069c;

/* JADX INFO: renamed from: com.a.b.f.c.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0875q extends AbstractC0877s {

    /* JADX INFO: renamed from: a */
    private final int f2258a;

    AbstractC0875q(int i) {
        this.f2258a = i;
    }

    @Override // com.p046a.p049b.p066f.p069c.AbstractC0857a
    /* JADX INFO: renamed from: b */
    protected final int mo1864b(AbstractC0857a abstractC0857a) {
        int i = ((AbstractC0875q) abstractC0857a).f2258a;
        if (this.f2258a < i) {
            return -1;
        }
        return this.f2258a > i ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        return obj != null && getClass() == obj.getClass() && this.f2258a == ((AbstractC0875q) obj).f2258a;
    }

    @Override // com.p046a.p049b.p066f.p069c.AbstractC0857a
    /* JADX INFO: renamed from: g */
    public final boolean mo1865g() {
        return false;
    }

    public final int hashCode() {
        return this.f2258a;
    }

    @Override // com.p046a.p049b.p066f.p069c.AbstractC0877s
    /* JADX INFO: renamed from: i */
    public final boolean mo1893i() {
        return true;
    }

    @Override // com.p046a.p049b.p066f.p069c.AbstractC0877s
    /* JADX INFO: renamed from: j */
    public final int mo1894j() {
        return this.f2258a;
    }

    @Override // com.p046a.p049b.p066f.p069c.AbstractC0877s
    /* JADX INFO: renamed from: k */
    public final long mo1895k() {
        return this.f2258a;
    }
}
