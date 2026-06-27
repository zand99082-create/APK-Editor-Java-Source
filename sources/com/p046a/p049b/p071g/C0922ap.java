package com.p046a.p049b.p071g;

import com.p046a.p049b.p066f.p068b.C0850t;

/* JADX INFO: renamed from: com.a.b.g.ap */
/* JADX INFO: loaded from: classes.dex */
final class C0922ap implements InterfaceC0919am {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C0920an f2472a;

    C0922ap(C0920an c0920an) {
        this.f2472a = c0920an;
    }

    /* JADX INFO: renamed from: a */
    private void m2133a(AbstractC0918al abstractC0918al) {
        C0850t c0850tMo2018a = abstractC0918al.mo2018a();
        int iD_ = c0850tMo2018a.m2239d_();
        for (int i = 0; i < iD_; i++) {
            this.f2472a.f2468j[c0850tMo2018a.m1815b(i).m1795g()].add(abstractC0918al);
        }
    }

    @Override // com.p046a.p049b.p071g.InterfaceC0919am
    /* JADX INFO: renamed from: a */
    public final void mo1990a(C0909ac c0909ac) {
        m2133a((AbstractC0918al) c0909ac);
    }

    @Override // com.p046a.p049b.p071g.InterfaceC0919am
    /* JADX INFO: renamed from: a */
    public final void mo1991a(C0952z c0952z) {
        m2133a((AbstractC0918al) c0952z);
    }

    @Override // com.p046a.p049b.p071g.InterfaceC0919am
    /* JADX INFO: renamed from: b */
    public final void mo1992b(C0952z c0952z) {
        m2133a((AbstractC0918al) c0952z);
    }
}
