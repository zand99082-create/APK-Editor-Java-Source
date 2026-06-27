package com.p046a.p049b.p066f.p068b;

import com.p046a.p049b.p066f.p070d.C0886b;
import com.p046a.p049b.p066f.p070d.C0887c;
import com.p046a.p049b.p066f.p070d.InterfaceC0889e;
import com.p046a.p049b.p073h.C0962j;

/* JADX INFO: renamed from: com.a.b.f.b.aa */
/* JADX INFO: loaded from: classes.dex */
public final class C0828aa extends AbstractC0839i {

    /* JADX INFO: renamed from: a */
    private final C0962j f1955a;

    public C0828aa(C0853w c0853w, C0856z c0856z, C0848r c0848r, C0850t c0850t, C0962j c0962j) {
        super(c0853w, c0856z, c0848r, c0850t);
        if (c0853w.m1839d() != 5) {
            throw new IllegalArgumentException("bogus branchingness");
        }
        if (c0962j == null) {
            throw new NullPointerException("cases == null");
        }
        this.f1955a = c0962j;
    }

    @Override // com.p046a.p049b.p066f.p068b.AbstractC0839i
    /* JADX INFO: renamed from: a */
    public final AbstractC0839i mo1727a(C0848r c0848r, C0850t c0850t) {
        return new C0828aa(m1752f(), m1753g(), c0848r, c0850t, this.f1955a);
    }

    @Override // com.p046a.p049b.p066f.p068b.AbstractC0839i
    /* JADX INFO: renamed from: a */
    public final AbstractC0839i mo1728a(C0887c c0887c) {
        throw new UnsupportedOperationException("unsupported");
    }

    @Override // com.p046a.p049b.p066f.p068b.AbstractC0839i
    /* JADX INFO: renamed from: a */
    public final String mo1729a() {
        return this.f1955a.toString();
    }

    @Override // com.p046a.p049b.p066f.p068b.AbstractC0839i
    /* JADX INFO: renamed from: a */
    public final void mo1730a(InterfaceC0841k interfaceC0841k) {
        interfaceC0841k.mo1153a(this);
    }

    @Override // com.p046a.p049b.p066f.p068b.AbstractC0839i
    /* JADX INFO: renamed from: a */
    public final boolean mo1731a(AbstractC0839i abstractC0839i) {
        return false;
    }

    @Override // com.p046a.p049b.p066f.p068b.AbstractC0839i
    /* JADX INFO: renamed from: b */
    public final InterfaceC0889e mo1732b() {
        return C0886b.f2306a;
    }

    /* JADX INFO: renamed from: c */
    public final C0962j m1733c() {
        return this.f1955a;
    }
}
