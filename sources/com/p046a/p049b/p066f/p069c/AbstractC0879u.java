package com.p046a.p049b.p066f.p069c;

/* JADX INFO: renamed from: com.a.b.f.c.u */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0879u extends AbstractC0859ab {

    /* JADX INFO: renamed from: a */
    private final C0884z f2262a;

    /* JADX INFO: renamed from: b */
    private final C0881w f2263b;

    AbstractC0879u(C0884z c0884z, C0881w c0881w) {
        if (c0884z == null) {
            throw new NullPointerException("definingClass == null");
        }
        if (c0881w == null) {
            throw new NullPointerException("nat == null");
        }
        this.f2262a = c0884z;
        this.f2263b = c0881w;
    }

    @Override // com.p046a.p049b.p066f.p069c.AbstractC0857a
    /* JADX INFO: renamed from: b */
    protected int mo1864b(AbstractC0857a abstractC0857a) {
        AbstractC0879u abstractC0879u = (AbstractC0879u) abstractC0857a;
        int iA = this.f2262a.compareTo(abstractC0879u.f2262a);
        return iA != 0 ? iA : this.f2263b.m1900a().compareTo(abstractC0879u.f2263b.m1900a());
    }

    @Override // com.p046a.p049b.p073h.InterfaceC0971s
    /* JADX INFO: renamed from: d */
    public final String mo919d() {
        return this.f2262a.mo919d() + '.' + this.f2263b.mo919d();
    }

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC0879u abstractC0879u = (AbstractC0879u) obj;
        return this.f2262a.equals(abstractC0879u.f2262a) && this.f2263b.equals(abstractC0879u.f2263b);
    }

    @Override // com.p046a.p049b.p066f.p069c.AbstractC0857a
    /* JADX INFO: renamed from: g */
    public final boolean mo1865g() {
        return false;
    }

    public final int hashCode() {
        return (this.f2262a.hashCode() * 31) ^ this.f2263b.hashCode();
    }

    /* JADX INFO: renamed from: k */
    public final C0884z m1898k() {
        return this.f2262a;
    }

    /* JADX INFO: renamed from: l */
    public final C0881w m1899l() {
        return this.f2263b;
    }

    public final String toString() {
        return mo1866h() + '{' + mo919d() + '}';
    }
}
