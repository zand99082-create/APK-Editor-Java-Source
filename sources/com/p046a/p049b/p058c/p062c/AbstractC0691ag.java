package com.p046a.p049b.p058c.p062c;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p066f.p069c.AbstractC0879u;
import com.p046a.p049b.p066f.p069c.C0881w;
import com.p046a.p049b.p073h.C0970r;

/* JADX INFO: renamed from: com.a.b.c.c.ag */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0691ag extends AbstractC0686ab {

    /* JADX INFO: renamed from: a */
    private final AbstractC0879u f1406a;

    public AbstractC0691ag(AbstractC0879u abstractC0879u) {
        super(abstractC0879u.m1898k());
        this.f1406a = abstractC0879u;
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0686ab, com.p046a.p049b.p058c.p062c.AbstractC0688ad
    /* JADX INFO: renamed from: a */
    public void mo1304a(C0732r c0732r) {
        super.mo1304a(c0732r);
        c0732r.m1488h().m1375a(this.f1406a.m1899l().m1900a());
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0688ad
    /* JADX INFO: renamed from: a */
    public final void mo1315a(C0732r c0732r, C0970r c0970r) {
        C0712ba c0712baM1491k = c0732r.m1491k();
        C0709ay c0709ayM1488h = c0732r.m1488h();
        C0881w c0881wM1899l = this.f1406a.m1899l();
        int iM1381b = c0712baM1491k.m1381b(m1310d());
        int iM1376b = c0709ayM1488h.m1376b(c0881wM1899l.m1900a());
        int iMo1320b = mo1320b(c0732r);
        if (c0970r.m2281b()) {
            c0970r.m2272a(0, m1314j() + ' ' + this.f1406a.mo919d());
            c0970r.m2272a(2, "  class_idx: " + C1067a.m2558v(iM1381b));
            c0970r.m2272a(2, String.format("  %-10s %s", mo1321c() + ':', C1067a.m2558v(iMo1320b)));
            c0970r.m2272a(4, "  name_idx:  " + C1067a.m2556t(iM1376b));
        }
        c0970r.m2280b(iM1381b);
        c0970r.m2280b(iMo1320b);
        c0970r.m2282c(iM1376b);
    }

    /* JADX INFO: renamed from: b */
    protected abstract int mo1320b(C0732r c0732r);

    /* JADX INFO: renamed from: c */
    protected abstract String mo1321c();

    /* JADX INFO: renamed from: e */
    public final AbstractC0879u m1322e() {
        return this.f1406a;
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0688ad
    /* JADX INFO: renamed from: e_ */
    public final int mo1316e_() {
        return 8;
    }
}
