package com.p046a.p049b.p058c.p062c;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p073h.C0970r;

/* JADX INFO: renamed from: com.a.b.c.c.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0719e extends AbstractC0700ap {

    /* JADX INFO: renamed from: a */
    private C0718d f1455a;

    public C0719e(C0718d c0718d) {
        super(4, 4);
        this.f1455a = c0718d;
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0688ad
    /* JADX INFO: renamed from: a */
    public final EnumC0689ae mo1302a() {
        return EnumC0689ae.f1396t;
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0688ad
    /* JADX INFO: renamed from: a */
    public final void mo1304a(C0732r c0732r) {
        this.f1455a = (C0718d) c0732r.m1485e().m1336b(this.f1455a);
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0700ap
    /* JADX INFO: renamed from: a_ */
    protected final void mo1306a_(C0732r c0732r, C0970r c0970r) {
        int iF = this.f1455a.m1345f();
        if (c0970r.m2281b()) {
            c0970r.m2272a(4, "  annotations_off: " + C1067a.m2556t(iF));
        }
        c0970r.m2282c(iF);
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0700ap
    /* JADX INFO: renamed from: b */
    public final String mo1307b() {
        return this.f1455a.mo1307b();
    }
}
