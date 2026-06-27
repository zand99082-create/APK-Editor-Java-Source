package com.p046a.p049b.p066f.p068b;

import com.p046a.p049b.p066f.p069c.AbstractC0857a;

/* JADX INFO: renamed from: com.a.b.f.b.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0835e extends AbstractC0839i {

    /* JADX INFO: renamed from: a */
    private final AbstractC0857a f1960a;

    public AbstractC0835e(C0853w c0853w, C0856z c0856z, C0848r c0848r, C0850t c0850t, AbstractC0857a abstractC0857a) {
        super(c0853w, c0856z, c0848r, c0850t);
        if (abstractC0857a == null) {
            throw new NullPointerException("cst == null");
        }
        this.f1960a = abstractC0857a;
    }

    @Override // com.p046a.p049b.p066f.p068b.AbstractC0839i
    /* JADX INFO: renamed from: a */
    public String mo1729a() {
        return this.f1960a.mo919d();
    }

    @Override // com.p046a.p049b.p066f.p068b.AbstractC0839i
    /* JADX INFO: renamed from: a */
    public final boolean mo1731a(AbstractC0839i abstractC0839i) {
        return super.mo1731a(abstractC0839i) && this.f1960a.equals(((AbstractC0835e) abstractC0839i).f1960a);
    }

    /* JADX INFO: renamed from: g_ */
    public final AbstractC0857a m1748g_() {
        return this.f1960a;
    }
}
