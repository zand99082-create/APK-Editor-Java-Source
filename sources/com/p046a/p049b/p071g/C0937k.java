package com.p046a.p049b.p071g;

/* JADX INFO: renamed from: com.a.b.g.k */
/* JADX INFO: loaded from: classes.dex */
final class C0937k implements InterfaceC0917ak {

    /* JADX INFO: renamed from: a */
    private int f2517a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C0935i f2518b;

    private C0937k(C0935i c0935i) {
        this.f2518b = c0935i;
        this.f2517a = 0;
    }

    /* synthetic */ C0937k(C0935i c0935i, byte b2) {
        this(c0935i);
    }

    @Override // com.p046a.p049b.p071g.InterfaceC0917ak
    /* JADX INFO: renamed from: a */
    public final void mo2010a(C0915ai c0915ai, C0915ai c0915ai2) {
        C0936j c0936j = new C0936j();
        int i = this.f2517a + 1;
        this.f2517a = i;
        c0936j.f2512a = i;
        c0936j.f2514c = c0915ai;
        c0936j.f2513b = c0915ai2;
        this.f2518b.f2510e.add(c0915ai);
        this.f2518b.f2509d[c0915ai.m2068e()] = c0936j;
    }
}
