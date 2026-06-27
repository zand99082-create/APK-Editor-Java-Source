package com.p046a.p049b.p066f.p068b;

import com.p046a.p049b.p066f.p069c.AbstractC0857a;
import com.p046a.p049b.p066f.p070d.C0886b;
import com.p046a.p049b.p066f.p070d.C0887c;
import com.p046a.p049b.p066f.p070d.InterfaceC0889e;

/* JADX INFO: renamed from: com.a.b.f.b.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0846p extends AbstractC0835e {
    public C0846p(C0853w c0853w, C0856z c0856z, C0848r c0848r, C0850t c0850t, AbstractC0857a abstractC0857a) {
        super(c0853w, c0856z, c0848r, c0850t, abstractC0857a);
        if (c0853w.m1839d() != 1) {
            throw new IllegalArgumentException("bogus branchingness");
        }
    }

    @Override // com.p046a.p049b.p066f.p068b.AbstractC0839i
    /* JADX INFO: renamed from: a */
    public final AbstractC0839i mo1727a(C0848r c0848r, C0850t c0850t) {
        return new C0846p(m1752f(), m1753g(), c0848r, c0850t, m1748g_());
    }

    @Override // com.p046a.p049b.p066f.p068b.AbstractC0839i
    /* JADX INFO: renamed from: a */
    public final AbstractC0839i mo1728a(C0887c c0887c) {
        throw new UnsupportedOperationException("unsupported");
    }

    @Override // com.p046a.p049b.p066f.p068b.AbstractC0839i
    /* JADX INFO: renamed from: a */
    public final void mo1730a(InterfaceC0841k interfaceC0841k) {
        interfaceC0841k.mo1151a(this);
    }

    @Override // com.p046a.p049b.p066f.p068b.AbstractC0839i
    /* JADX INFO: renamed from: b */
    public final InterfaceC0889e mo1732b() {
        return C0886b.f2306a;
    }
}
