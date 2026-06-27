package com.p046a.p049b.p058c.p062c;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p066f.p069c.C0883y;
import com.p046a.p049b.p073h.C0955c;
import com.p046a.p049b.p073h.C0970r;

/* JADX INFO: renamed from: com.a.b.c.c.aw */
/* JADX INFO: loaded from: classes.dex */
public final class C0707aw extends AbstractC0700ap {

    /* JADX INFO: renamed from: a */
    private final C0883y f1442a;

    public C0707aw(C0883y c0883y) {
        super(1, C1067a.m2523d(c0883y.m1914m()) + c0883y.m1913l() + 1);
        this.f1442a = c0883y;
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0700ap
    /* JADX INFO: renamed from: a */
    protected final int mo1301a(AbstractC0700ap abstractC0700ap) {
        return this.f1442a.compareTo(((C0707aw) abstractC0700ap).f1442a);
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0688ad
    /* JADX INFO: renamed from: a */
    public final EnumC0689ae mo1302a() {
        return EnumC0689ae.f1390n;
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0688ad
    /* JADX INFO: renamed from: a */
    public final void mo1304a(C0732r c0732r) {
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0700ap
    /* JADX INFO: renamed from: a_ */
    public final void mo1306a_(C0732r c0732r, C0970r c0970r) {
        C0955c c0955cM1912k = this.f1442a.m1912k();
        int iM1914m = this.f1442a.m1914m();
        if (c0970r.m2281b()) {
            c0970r.m2272a(C1067a.m2523d(iM1914m), "utf16_size: " + C1067a.m2556t(iM1914m));
            c0970r.m2272a(c0955cM1912k.m2219a() + 1, this.f1442a.m1910i());
        }
        c0970r.m2286e(iM1914m);
        c0970r.m2275a(c0955cM1912k);
        c0970r.mo569d(0);
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0700ap
    /* JADX INFO: renamed from: b */
    public final String mo1307b() {
        return this.f1442a.m1910i();
    }
}
