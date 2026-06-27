package com.p046a.p049b.p066f.p069c;

/* JADX INFO: renamed from: com.a.b.f.c.r */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0876r extends AbstractC0877s {

    /* JADX INFO: renamed from: a */
    private final long f2259a;

    AbstractC0876r(long j) {
        this.f2259a = j;
    }

    @Override // com.p046a.p049b.p066f.p069c.AbstractC0857a
    /* JADX INFO: renamed from: b */
    protected final int mo1864b(AbstractC0857a abstractC0857a) {
        long j = ((AbstractC0876r) abstractC0857a).f2259a;
        if (this.f2259a < j) {
            return -1;
        }
        return this.f2259a > j ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        return obj != null && getClass() == obj.getClass() && this.f2259a == ((AbstractC0876r) obj).f2259a;
    }

    @Override // com.p046a.p049b.p066f.p069c.AbstractC0857a
    /* JADX INFO: renamed from: g */
    public final boolean mo1865g() {
        return true;
    }

    public final int hashCode() {
        return ((int) this.f2259a) ^ ((int) (this.f2259a >> 32));
    }

    @Override // com.p046a.p049b.p066f.p069c.AbstractC0877s
    /* JADX INFO: renamed from: i */
    public final boolean mo1893i() {
        return ((long) ((int) this.f2259a)) == this.f2259a;
    }

    @Override // com.p046a.p049b.p066f.p069c.AbstractC0877s
    /* JADX INFO: renamed from: j */
    public final int mo1894j() {
        return (int) this.f2259a;
    }

    @Override // com.p046a.p049b.p066f.p069c.AbstractC0877s
    /* JADX INFO: renamed from: k */
    public final long mo1895k() {
        return this.f2259a;
    }
}
