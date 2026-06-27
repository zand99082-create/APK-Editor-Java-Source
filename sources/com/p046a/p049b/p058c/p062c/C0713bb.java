package com.p046a.p049b.p058c.p062c;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p066f.p070d.C0886b;
import com.p046a.p049b.p066f.p070d.C0887c;
import com.p046a.p049b.p066f.p070d.InterfaceC0889e;
import com.p046a.p049b.p073h.C0970r;

/* JADX INFO: renamed from: com.a.b.c.c.bb */
/* JADX INFO: loaded from: classes.dex */
public final class C0713bb extends AbstractC0700ap {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0889e f1448a;

    public C0713bb(InterfaceC0889e interfaceC0889e) {
        super(4, (interfaceC0889e.mo1021d_() << 1) + 4);
        this.f1448a = interfaceC0889e;
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0700ap
    /* JADX INFO: renamed from: a */
    protected final int mo1301a(AbstractC0700ap abstractC0700ap) {
        return C0886b.m1935b(this.f1448a, ((C0713bb) abstractC0700ap).f1448a);
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0688ad
    /* JADX INFO: renamed from: a */
    public final EnumC0689ae mo1302a() {
        return EnumC0689ae.f1385i;
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0688ad
    /* JADX INFO: renamed from: a */
    public final void mo1304a(C0732r c0732r) {
        C0712ba c0712baM1491k = c0732r.m1491k();
        int iMo1021d_ = this.f1448a.mo1021d_();
        for (int i = 0; i < iMo1021d_; i++) {
            c0712baM1491k.m1380a(this.f1448a.mo1018a(i));
        }
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0700ap
    /* JADX INFO: renamed from: a_ */
    protected final void mo1306a_(C0732r c0732r, C0970r c0970r) {
        C0712ba c0712baM1491k = c0732r.m1491k();
        int iMo1021d_ = this.f1448a.mo1021d_();
        if (c0970r.m2281b()) {
            c0970r.m2272a(0, m1347h() + " type_list");
            c0970r.m2272a(4, "  size: " + C1067a.m2556t(iMo1021d_));
            for (int i = 0; i < iMo1021d_; i++) {
                C0887c c0887cMo1018a = this.f1448a.mo1018a(i);
                c0970r.m2272a(2, "  " + C1067a.m2558v(c0712baM1491k.m1382b(c0887cMo1018a)) + " // " + c0887cMo1018a.mo919d());
            }
        }
        c0970r.m2282c(iMo1021d_);
        for (int i2 = 0; i2 < iMo1021d_; i2++) {
            c0970r.m2280b(c0712baM1491k.m1382b(this.f1448a.mo1018a(i2)));
        }
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0700ap
    /* JADX INFO: renamed from: b */
    public final String mo1307b() {
        throw new RuntimeException("unsupported");
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC0889e m1384c() {
        return this.f1448a;
    }

    public final int hashCode() {
        return C0886b.m1934b(this.f1448a);
    }
}
