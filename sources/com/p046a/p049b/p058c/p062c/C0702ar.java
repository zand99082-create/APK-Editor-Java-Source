package com.p046a.p049b.p058c.p062c;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p066f.p069c.C0883y;
import com.p046a.p049b.p066f.p070d.C0885a;
import com.p046a.p049b.p066f.p070d.C0886b;
import com.p046a.p049b.p066f.p070d.C0887c;
import com.p046a.p049b.p073h.C0970r;

/* JADX INFO: renamed from: com.a.b.c.c.ar */
/* JADX INFO: loaded from: classes.dex */
public final class C0702ar extends AbstractC0687ac {

    /* JADX INFO: renamed from: a */
    private final C0885a f1427a;

    /* JADX INFO: renamed from: b */
    private final C0883y f1428b;

    /* JADX INFO: renamed from: c */
    private C0713bb f1429c;

    public C0702ar(C0885a c0885a) {
        if (c0885a == null) {
            throw new NullPointerException("prototype == null");
        }
        this.f1427a = c0885a;
        this.f1428b = m1353a(c0885a);
        C0886b c0886bM1927b = c0885a.m1927b();
        this.f1429c = c0886bM1927b.m2239d_() == 0 ? null : new C0713bb(c0886bM1927b);
    }

    /* JADX INFO: renamed from: a */
    private static char m1352a(C0887c c0887c) {
        char cCharAt = c0887c.m1947g().charAt(0);
        if (cCharAt == '[') {
            return 'L';
        }
        return cCharAt;
    }

    /* JADX INFO: renamed from: a */
    private static C0883y m1353a(C0885a c0885a) {
        C0886b c0886bM1927b = c0885a.m1927b();
        int iD_ = c0886bM1927b.m2239d_();
        StringBuilder sb = new StringBuilder(iD_ + 1);
        sb.append(m1352a(c0885a.m1926a()));
        for (int i = 0; i < iD_; i++) {
            sb.append(m1352a(c0886bM1927b.mo1018a(i)));
        }
        return new C0883y(sb.toString());
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0688ad
    /* JADX INFO: renamed from: a */
    public final EnumC0689ae mo1302a() {
        return EnumC0689ae.f1380d;
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0688ad
    /* JADX INFO: renamed from: a */
    public final void mo1304a(C0732r c0732r) {
        C0709ay c0709ayM1488h = c0732r.m1488h();
        C0712ba c0712baM1491k = c0732r.m1491k();
        C0696al c0696alM1486f = c0732r.m1486f();
        c0712baM1491k.m1380a(this.f1427a.m1926a());
        c0709ayM1488h.m1375a(this.f1428b);
        if (this.f1429c != null) {
            this.f1429c = (C0713bb) c0696alM1486f.m1336b(this.f1429c);
        }
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0688ad
    /* JADX INFO: renamed from: a */
    public final void mo1315a(C0732r c0732r, C0970r c0970r) {
        int iM1376b = c0732r.m1488h().m1376b(this.f1428b);
        int iM1382b = c0732r.m1491k().m1382b(this.f1427a.m1926a());
        int iM1341b = AbstractC0700ap.m1341b(this.f1429c);
        if (c0970r.m2281b()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f1427a.m1926a().mo919d());
            sb.append(" proto(");
            C0886b c0886bM1927b = this.f1427a.m1927b();
            int iD_ = c0886bM1927b.m2239d_();
            for (int i = 0; i < iD_; i++) {
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(c0886bM1927b.mo1018a(i).mo919d());
            }
            sb.append(")");
            c0970r.m2272a(0, m1314j() + ' ' + sb.toString());
            c0970r.m2272a(4, "  shorty_idx:      " + C1067a.m2556t(iM1376b) + " // " + this.f1428b.m1910i());
            c0970r.m2272a(4, "  return_type_idx: " + C1067a.m2556t(iM1382b) + " // " + this.f1427a.m1926a().mo919d());
            c0970r.m2272a(4, "  parameters_off:  " + C1067a.m2556t(iM1341b));
        }
        c0970r.m2282c(iM1376b);
        c0970r.m2282c(iM1382b);
        c0970r.m2282c(iM1341b);
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0688ad
    /* JADX INFO: renamed from: e_ */
    public final int mo1316e_() {
        return 12;
    }
}
