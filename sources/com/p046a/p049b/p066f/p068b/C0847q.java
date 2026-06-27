package com.p046a.p049b.p066f.p068b;

import com.p046a.p049b.p066f.p069c.AbstractC0857a;
import com.p046a.p049b.p066f.p069c.C0872n;
import com.p046a.p049b.p066f.p070d.C0886b;
import com.p046a.p049b.p066f.p070d.C0887c;
import com.p046a.p049b.p066f.p070d.InterfaceC0888d;
import com.p046a.p049b.p066f.p070d.InterfaceC0889e;

/* JADX INFO: renamed from: com.a.b.f.b.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0847q extends AbstractC0839i {
    public C0847q(C0853w c0853w, C0856z c0856z, C0848r c0848r, C0848r c0848r2) {
        this(c0853w, c0856z, c0848r, C0850t.m1808a(c0848r2));
    }

    public C0847q(C0853w c0853w, C0856z c0856z, C0848r c0848r, C0850t c0850t) {
        super(c0853w, c0856z, c0848r, c0850t);
        switch (c0853w.m1839d()) {
            case 5:
            case 6:
                throw new IllegalArgumentException("bogus branchingness");
            default:
                if (c0848r != null && c0853w.m1839d() != 1) {
                    throw new IllegalArgumentException("can't mix branchingness with result");
                }
                return;
        }
    }

    @Override // com.p046a.p049b.p066f.p068b.AbstractC0839i
    /* JADX INFO: renamed from: a */
    public final AbstractC0839i mo1727a(C0848r c0848r, C0850t c0850t) {
        return new C0847q(m1752f(), m1753g(), c0848r, c0850t);
    }

    @Override // com.p046a.p049b.p066f.p068b.AbstractC0839i
    /* JADX INFO: renamed from: a */
    public final AbstractC0839i mo1728a(C0887c c0887c) {
        throw new UnsupportedOperationException("unsupported");
    }

    @Override // com.p046a.p049b.p066f.p068b.AbstractC0839i
    /* JADX INFO: renamed from: a */
    public final void mo1730a(InterfaceC0841k interfaceC0841k) {
        interfaceC0841k.mo1156a(this);
    }

    @Override // com.p046a.p049b.p066f.p068b.AbstractC0839i
    /* JADX INFO: renamed from: b */
    public final InterfaceC0889e mo1732b() {
        return C0886b.f2306a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p046a.p049b.p066f.p068b.AbstractC0839i
    /* JADX INFO: renamed from: l */
    public final AbstractC0839i mo1758l() {
        AbstractC0857a abstractC0857aM1891a;
        int i;
        C0850t c0850tJ = m1756j();
        int iD_ = c0850tJ.m2239d_();
        if (iD_ == 0) {
            return this;
        }
        InterfaceC0888d interfaceC0888dM1796h = c0850tJ.m1815b(iD_ - 1).m1796h();
        if (!interfaceC0888dM1796h.mo929f()) {
            InterfaceC0888d interfaceC0888dM1796h2 = c0850tJ.m1815b(0).m1796h();
            if (iD_ != 2 || !interfaceC0888dM1796h2.mo929f()) {
                return this;
            }
            AbstractC0857a abstractC0857a = (AbstractC0857a) interfaceC0888dM1796h2;
            C0850t c0850tM1820f = c0850tJ.m1820f();
            return new C0846p(C0855y.m1847a(m1752f().m1836a(), m1754h(), c0850tM1820f, abstractC0857a), m1753g(), m1754h(), c0850tM1820f, abstractC0857a);
        }
        AbstractC0857a abstractC0857a2 = (AbstractC0857a) interfaceC0888dM1796h;
        C0850t c0850tM1821g = c0850tJ.m1821g();
        try {
            int iM1836a = m1752f().m1836a();
            if (iM1836a == 15 && (abstractC0857a2 instanceof C0872n)) {
                abstractC0857aM1891a = C0872n.m1891a(-((C0872n) abstractC0857a2).mo1894j());
                i = 14;
            } else {
                abstractC0857aM1891a = abstractC0857a2;
                i = iM1836a;
            }
            return new C0846p(C0855y.m1847a(i, m1754h(), c0850tM1821g, abstractC0857aM1891a), m1753g(), m1754h(), c0850tM1821g, abstractC0857aM1891a);
        } catch (IllegalArgumentException e) {
            return this;
        }
    }
}
