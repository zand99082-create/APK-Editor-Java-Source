package com.p046a.p049b.p063d.p064a;

/* JADX INFO: renamed from: com.a.b.d.a.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0769b implements InterfaceC0771c {

    /* JADX INFO: renamed from: a */
    private final C0742a f1565a = new C0742a();

    /* JADX INFO: renamed from: b */
    private int f1566b = 0;

    @Override // com.p046a.p049b.p063d.p064a.InterfaceC0771c
    /* JADX INFO: renamed from: a */
    public final int mo1548a() {
        return this.f1566b;
    }

    /* JADX INFO: renamed from: a */
    protected final void m1549a(int i) {
        this.f1566b++;
    }

    @Override // com.p046a.p049b.p063d.p064a.InterfaceC0771c
    /* JADX INFO: renamed from: a */
    public final void mo1550a(int i, int i2) {
        this.f1565a.m1522a(i, i2);
    }

    @Override // com.p046a.p049b.p063d.p064a.InterfaceC0771c
    /* JADX INFO: renamed from: b */
    public final int mo1551b() {
        int iM1521a = this.f1565a.m1521a(this.f1566b);
        return iM1521a >= 0 ? iM1521a : this.f1566b;
    }
}
