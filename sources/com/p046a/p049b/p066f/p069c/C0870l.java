package com.p046a.p049b.p066f.p069c;

import com.p046a.p049b.p066f.p070d.C0887c;

/* JADX INFO: renamed from: com.a.b.f.c.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0870l extends AbstractC0879u {
    public C0870l(C0884z c0884z, C0881w c0881w) {
        super(c0884z, c0881w);
    }

    /* JADX INFO: renamed from: a */
    public static C0870l m1889a(C0887c c0887c) {
        return new C0870l(C0884z.m1915a(c0887c), C0881w.f2264a);
    }

    @Override // com.p046a.p049b.p066f.p070d.InterfaceC0888d
    /* JADX INFO: renamed from: a */
    public final C0887c mo925a() {
        return m1899l().m1902c();
    }

    @Override // com.p046a.p049b.p066f.p069c.AbstractC0879u, com.p046a.p049b.p066f.p069c.AbstractC0857a
    /* JADX INFO: renamed from: b */
    protected final int mo1864b(AbstractC0857a abstractC0857a) {
        int iMo1864b = super.mo1864b(abstractC0857a);
        return iMo1864b != 0 ? iMo1864b : m1899l().m1901b().compareTo(((C0870l) abstractC0857a).m1899l().m1901b());
    }

    @Override // com.p046a.p049b.p066f.p069c.AbstractC0857a
    /* JADX INFO: renamed from: h */
    public final String mo1866h() {
        return "field";
    }
}
