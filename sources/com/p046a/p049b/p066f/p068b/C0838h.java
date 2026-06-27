package com.p046a.p049b.p066f.p068b;

import com.p046a.p049b.p066f.p069c.AbstractC0857a;
import com.p046a.p049b.p066f.p070d.C0886b;
import com.p046a.p049b.p066f.p070d.C0887c;
import com.p046a.p049b.p066f.p070d.InterfaceC0889e;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.a.b.f.b.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0838h extends AbstractC0839i {

    /* JADX INFO: renamed from: a */
    private final ArrayList f1979a;

    /* JADX INFO: renamed from: b */
    private final AbstractC0857a f1980b;

    public C0838h(C0853w c0853w, C0856z c0856z, C0850t c0850t, ArrayList arrayList, AbstractC0857a abstractC0857a) {
        super(c0853w, c0856z, null, c0850t);
        if (c0853w.m1839d() != 1) {
            throw new IllegalArgumentException("bogus branchingness");
        }
        this.f1979a = arrayList;
        this.f1980b = abstractC0857a;
    }

    @Override // com.p046a.p049b.p066f.p068b.AbstractC0839i
    /* JADX INFO: renamed from: a */
    public final AbstractC0839i mo1727a(C0848r c0848r, C0850t c0850t) {
        return new C0838h(m1752f(), m1753g(), c0850t, this.f1979a, this.f1980b);
    }

    @Override // com.p046a.p049b.p066f.p068b.AbstractC0839i
    /* JADX INFO: renamed from: a */
    public final AbstractC0839i mo1728a(C0887c c0887c) {
        throw new UnsupportedOperationException("unsupported");
    }

    @Override // com.p046a.p049b.p066f.p068b.AbstractC0839i
    /* JADX INFO: renamed from: a */
    public final void mo1730a(InterfaceC0841k interfaceC0841k) {
        interfaceC0841k.mo1161a(this);
    }

    @Override // com.p046a.p049b.p066f.p068b.AbstractC0839i
    /* JADX INFO: renamed from: b */
    public final InterfaceC0889e mo1732b() {
        return C0886b.f2306a;
    }

    /* JADX INFO: renamed from: c */
    public final ArrayList m1749c() {
        return this.f1979a;
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC0857a m1750e() {
        return this.f1980b;
    }
}
