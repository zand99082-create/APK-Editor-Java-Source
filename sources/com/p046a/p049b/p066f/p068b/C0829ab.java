package com.p046a.p049b.p066f.p068b;

import com.p046a.p049b.p066f.p069c.AbstractC0857a;
import com.p046a.p049b.p066f.p069c.C0883y;
import com.p046a.p049b.p066f.p070d.C0887c;
import com.p046a.p049b.p066f.p070d.InterfaceC0889e;

/* JADX INFO: renamed from: com.a.b.f.b.ab */
/* JADX INFO: loaded from: classes.dex */
public final class C0829ab extends AbstractC0835e {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0889e f1956a;

    public C0829ab(C0853w c0853w, C0856z c0856z, C0850t c0850t, InterfaceC0889e interfaceC0889e, AbstractC0857a abstractC0857a) {
        super(c0853w, c0856z, null, c0850t, abstractC0857a);
        if (c0853w.m1839d() != 6) {
            throw new IllegalArgumentException("bogus branchingness");
        }
        if (interfaceC0889e == null) {
            throw new NullPointerException("catches == null");
        }
        this.f1956a = interfaceC0889e;
    }

    @Override // com.p046a.p049b.p066f.p068b.AbstractC0839i
    /* JADX INFO: renamed from: a */
    public final AbstractC0839i mo1727a(C0848r c0848r, C0850t c0850t) {
        return new C0829ab(m1752f(), m1753g(), c0850t, this.f1956a, m1748g_());
    }

    @Override // com.p046a.p049b.p066f.p068b.AbstractC0839i
    /* JADX INFO: renamed from: a */
    public final AbstractC0839i mo1728a(C0887c c0887c) {
        return new C0829ab(m1752f(), m1753g(), m1756j(), this.f1956a.mo1019a(c0887c), m1748g_());
    }

    @Override // com.p046a.p049b.p066f.p068b.AbstractC0835e, com.p046a.p049b.p066f.p068b.AbstractC0839i
    /* JADX INFO: renamed from: a */
    public final String mo1729a() {
        AbstractC0857a abstractC0857aG_ = m1748g_();
        return (abstractC0857aG_ instanceof C0883y ? ((C0883y) abstractC0857aG_).m1910i() : abstractC0857aG_.mo919d()) + " " + C0830ac.m1734a(this.f1956a);
    }

    @Override // com.p046a.p049b.p066f.p068b.AbstractC0839i
    /* JADX INFO: renamed from: a */
    public final void mo1730a(InterfaceC0841k interfaceC0841k) {
        interfaceC0841k.mo1154a(this);
    }

    @Override // com.p046a.p049b.p066f.p068b.AbstractC0839i
    /* JADX INFO: renamed from: b */
    public final InterfaceC0889e mo1732b() {
        return this.f1956a;
    }
}
