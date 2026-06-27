package com.p046a.p049b.p066f.p068b;

/* JADX INFO: renamed from: com.a.b.f.b.d */
/* JADX INFO: loaded from: classes.dex */
class C0834d implements InterfaceC0841k {

    /* JADX INFO: renamed from: a */
    private int f1959a = 0;

    /* JADX INFO: renamed from: a */
    private void m1745a(AbstractC0839i abstractC0839i) {
        C0848r c0848rM1754h = abstractC0839i.m1754h();
        if (c0848rM1754h != null) {
            m1746a(c0848rM1754h);
        }
        C0850t c0850tM1756j = abstractC0839i.m1756j();
        int iD_ = c0850tM1756j.m2239d_();
        for (int i = 0; i < iD_; i++) {
            m1746a(c0850tM1756j.m1815b(i));
        }
    }

    /* JADX INFO: renamed from: a */
    private void m1746a(C0848r c0848r) {
        int iM1798j = c0848r.m1798j();
        if (iM1798j > this.f1959a) {
            this.f1959a = iM1798j;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m1747a() {
        return this.f1959a;
    }

    @Override // com.p046a.p049b.p066f.p068b.InterfaceC0841k
    /* JADX INFO: renamed from: a */
    public final void mo1153a(C0828aa c0828aa) {
        m1745a((AbstractC0839i) c0828aa);
    }

    @Override // com.p046a.p049b.p066f.p068b.InterfaceC0841k
    /* JADX INFO: renamed from: a */
    public final void mo1154a(C0829ab c0829ab) {
        m1745a((AbstractC0839i) c0829ab);
    }

    @Override // com.p046a.p049b.p066f.p068b.InterfaceC0841k
    /* JADX INFO: renamed from: a */
    public final void mo1155a(C0830ac c0830ac) {
        m1745a((AbstractC0839i) c0830ac);
    }

    @Override // com.p046a.p049b.p066f.p068b.InterfaceC0841k
    /* JADX INFO: renamed from: a */
    public final void mo1161a(C0838h c0838h) {
        m1745a((AbstractC0839i) c0838h);
    }

    @Override // com.p046a.p049b.p066f.p068b.InterfaceC0841k
    /* JADX INFO: renamed from: a */
    public final void mo1151a(C0846p c0846p) {
        m1745a((AbstractC0839i) c0846p);
    }

    @Override // com.p046a.p049b.p066f.p068b.InterfaceC0841k
    /* JADX INFO: renamed from: a */
    public final void mo1156a(C0847q c0847q) {
        m1745a((AbstractC0839i) c0847q);
    }
}
