package com.p046a.p049b.p066f.p069c;

import com.p046a.p049b.p066f.p070d.C0885a;
import com.p046a.p049b.p066f.p070d.C0887c;

/* JADX INFO: renamed from: com.a.b.f.c.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0864f extends AbstractC0879u {

    /* JADX INFO: renamed from: a */
    private final C0885a f2236a;

    /* JADX INFO: renamed from: b */
    private C0885a f2237b;

    AbstractC0864f(C0884z c0884z, C0881w c0881w) {
        super(c0884z, c0881w);
        this.f2236a = C0885a.m1920a(m1899l().m1901b().m1911j());
        this.f2237b = null;
    }

    /* JADX INFO: renamed from: a */
    public final C0885a m1878a(boolean z) {
        if (z) {
            return this.f2236a;
        }
        if (this.f2237b == null) {
            this.f2237b = this.f2236a.m1925a(m1898k().m1917i());
        }
        return this.f2237b;
    }

    @Override // com.p046a.p049b.p066f.p070d.InterfaceC0888d
    /* JADX INFO: renamed from: a */
    public final C0887c mo925a() {
        return this.f2236a.m1926a();
    }

    @Override // com.p046a.p049b.p066f.p069c.AbstractC0879u, com.p046a.p049b.p066f.p069c.AbstractC0857a
    /* JADX INFO: renamed from: b */
    protected final int mo1864b(AbstractC0857a abstractC0857a) {
        int iMo1864b = super.mo1864b(abstractC0857a);
        return iMo1864b != 0 ? iMo1864b : this.f2236a.compareTo(((AbstractC0864f) abstractC0857a).f2236a);
    }

    /* JADX INFO: renamed from: b */
    public final int m1879b(boolean z) {
        return m1878a(z).m1927b().m1940e();
    }

    /* JADX INFO: renamed from: i */
    public final C0885a m1880i() {
        return this.f2236a;
    }
}
