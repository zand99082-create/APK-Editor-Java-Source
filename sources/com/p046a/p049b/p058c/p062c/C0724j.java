package com.p046a.p049b.p058c.p062c;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p066f.p067a.C0824c;
import com.p046a.p049b.p066f.p067a.C0825d;
import com.p046a.p049b.p066f.p069c.AbstractC0857a;
import com.p046a.p049b.p066f.p069c.C0862d;
import com.p046a.p049b.p066f.p069c.C0870l;
import com.p046a.p049b.p066f.p069c.C0880v;
import com.p046a.p049b.p066f.p069c.C0883y;
import com.p046a.p049b.p066f.p069c.C0884z;
import com.p046a.p049b.p066f.p070d.C0886b;
import com.p046a.p049b.p066f.p070d.InterfaceC0889e;
import com.p046a.p049b.p073h.C0970r;
import jadx.core.codegen.CodeWriter;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.a.b.c.c.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0724j extends AbstractC0687ac {

    /* JADX INFO: renamed from: a */
    private final C0884z f1483a;

    /* JADX INFO: renamed from: b */
    private final int f1484b;

    /* JADX INFO: renamed from: c */
    private final C0884z f1485c;

    /* JADX INFO: renamed from: d */
    private C0713bb f1486d;

    /* JADX INFO: renamed from: e */
    private final C0883y f1487e;

    /* JADX INFO: renamed from: f */
    private final C0723i f1488f;

    /* JADX INFO: renamed from: g */
    private C0733s f1489g;

    /* JADX INFO: renamed from: h */
    private C0721g f1490h;

    public C0724j(C0884z c0884z, int i, C0884z c0884z2, InterfaceC0889e interfaceC0889e, C0883y c0883y) {
        if (c0884z == null) {
            throw new NullPointerException("thisClass == null");
        }
        if (interfaceC0889e == null) {
            throw new NullPointerException("interfaces == null");
        }
        this.f1483a = c0884z;
        this.f1484b = i;
        this.f1485c = c0884z2;
        this.f1486d = interfaceC0889e.mo1021d_() == 0 ? null : new C0713bb(interfaceC0889e);
        this.f1487e = c0883y;
        this.f1488f = new C0723i(c0884z);
        this.f1489g = null;
        this.f1490h = new C0721g();
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0688ad
    /* JADX INFO: renamed from: a */
    public final EnumC0689ae mo1302a() {
        return EnumC0689ae.f1383g;
    }

    /* JADX INFO: renamed from: a */
    public final C0824c m1431a(C0880v c0880v) {
        return this.f1490h.m1405a(c0880v);
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0688ad
    /* JADX INFO: renamed from: a */
    public final void mo1304a(C0732r c0732r) {
        C0712ba c0712baM1491k = c0732r.m1491k();
        C0696al c0696alM1495o = c0732r.m1495o();
        C0696al c0696alM1485e = c0732r.m1485e();
        C0696al c0696alM1486f = c0732r.m1486f();
        C0709ay c0709ayM1488h = c0732r.m1488h();
        c0712baM1491k.m1379a(this.f1483a);
        if (!this.f1488f.m1428c()) {
            c0732r.m1490j().m1333a((AbstractC0700ap) this.f1488f);
            C0862d c0862dM1430e = this.f1488f.m1430e();
            if (c0862dM1430e != null) {
                this.f1489g = (C0733s) c0696alM1495o.m1336b(new C0733s(c0862dM1430e));
            }
        }
        if (this.f1485c != null) {
            c0712baM1491k.m1379a(this.f1485c);
        }
        if (this.f1486d != null) {
            this.f1486d = (C0713bb) c0696alM1486f.m1336b(this.f1486d);
        }
        if (this.f1487e != null) {
            c0709ayM1488h.m1375a(this.f1487e);
        }
        if (this.f1490h.m1411c()) {
            return;
        }
        if (this.f1490h.m1412d()) {
            this.f1490h = (C0721g) c0696alM1485e.m1336b(this.f1490h);
        } else {
            c0696alM1485e.m1333a((AbstractC0700ap) this.f1490h);
        }
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0688ad
    /* JADX INFO: renamed from: a */
    public final void mo1315a(C0732r c0732r, C0970r c0970r) {
        boolean zM2281b = c0970r.m2281b();
        C0712ba c0712baM1491k = c0732r.m1491k();
        int iM1381b = c0712baM1491k.m1381b(this.f1483a);
        int iM1381b2 = this.f1485c == null ? -1 : c0712baM1491k.m1381b(this.f1485c);
        int iM1341b = AbstractC0700ap.m1341b(this.f1486d);
        int iF = this.f1490h.m1411c() ? 0 : this.f1490h.m1345f();
        int iM1376b = this.f1487e == null ? -1 : c0732r.m1488h().m1376b(this.f1487e);
        int iF2 = this.f1488f.m1428c() ? 0 : this.f1488f.m1345f();
        int iM1341b2 = AbstractC0700ap.m1341b(this.f1489g);
        if (zM2281b) {
            c0970r.m2272a(0, m1314j() + ' ' + this.f1483a.mo919d());
            c0970r.m2272a(4, "  class_idx:           " + C1067a.m2556t(iM1381b));
            c0970r.m2272a(4, "  access_flags:        " + C1067a.m2536g(this.f1484b));
            c0970r.m2272a(4, "  superclass_idx:      " + C1067a.m2556t(iM1381b2) + " // " + (this.f1485c == null ? "<none>" : this.f1485c.mo919d()));
            c0970r.m2272a(4, "  interfaces_off:      " + C1067a.m2556t(iM1341b));
            if (iM1341b != 0) {
                InterfaceC0889e interfaceC0889eM1384c = this.f1486d.m1384c();
                int iMo1021d_ = interfaceC0889eM1384c.mo1021d_();
                for (int i = 0; i < iMo1021d_; i++) {
                    c0970r.m2272a(0, CodeWriter.INDENT + interfaceC0889eM1384c.mo1018a(i).mo919d());
                }
            }
            c0970r.m2272a(4, "  source_file_idx:     " + C1067a.m2556t(iM1376b) + " // " + (this.f1487e == null ? "<none>" : this.f1487e.mo919d()));
            c0970r.m2272a(4, "  annotations_off:     " + C1067a.m2556t(iF));
            c0970r.m2272a(4, "  class_data_off:      " + C1067a.m2556t(iF2));
            c0970r.m2272a(4, "  static_values_off:   " + C1067a.m2556t(iM1341b2));
        }
        c0970r.m2282c(iM1381b);
        c0970r.m2282c(this.f1484b);
        c0970r.m2282c(iM1381b2);
        c0970r.m2282c(iM1341b);
        c0970r.m2282c(iM1376b);
        c0970r.m2282c(iF);
        c0970r.m2282c(iF2);
        c0970r.m2282c(iM1341b2);
    }

    /* JADX INFO: renamed from: a */
    public final void m1432a(C0734t c0734t) {
        this.f1488f.m1424a(c0734t);
    }

    /* JADX INFO: renamed from: a */
    public final void m1433a(C0734t c0734t, AbstractC0857a abstractC0857a) {
        this.f1488f.m1425a(c0734t, abstractC0857a);
    }

    /* JADX INFO: renamed from: a */
    public final void m1434a(C0736v c0736v) {
        this.f1488f.m1426a(c0736v);
    }

    /* JADX INFO: renamed from: a */
    public final void m1435a(C0824c c0824c, C0732r c0732r) {
        this.f1490h.m1406a(c0824c, c0732r);
    }

    /* JADX INFO: renamed from: a */
    public final void m1436a(C0870l c0870l, C0824c c0824c, C0732r c0732r) {
        this.f1490h.m1407a(c0870l, c0824c, c0732r);
    }

    /* JADX INFO: renamed from: a */
    public final void m1437a(C0880v c0880v, C0824c c0824c, C0732r c0732r) {
        this.f1490h.m1408a(c0880v, c0824c, c0732r);
    }

    /* JADX INFO: renamed from: a */
    public final void m1438a(C0880v c0880v, C0825d c0825d, C0732r c0732r) {
        this.f1490h.m1409a(c0880v, c0825d, c0732r);
    }

    /* JADX INFO: renamed from: b */
    public final C0825d m1439b(C0880v c0880v) {
        return this.f1490h.m1410b(c0880v);
    }

    /* JADX INFO: renamed from: b */
    public final void m1440b(C0736v c0736v) {
        this.f1488f.m1427b(c0736v);
    }

    /* JADX INFO: renamed from: c */
    public final C0884z m1441c() {
        return this.f1483a;
    }

    /* JADX INFO: renamed from: d */
    public final C0884z m1442d() {
        return this.f1485c;
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC0889e m1443e() {
        return this.f1486d == null ? C0886b.f2306a : this.f1486d.m1384c();
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0688ad
    /* JADX INFO: renamed from: e_ */
    public final int mo1316e_() {
        return 32;
    }

    /* JADX INFO: renamed from: f */
    public final C0883y m1444f() {
        return this.f1487e;
    }

    /* JADX INFO: renamed from: g */
    public final ArrayList m1445g() {
        return this.f1488f.m1429d();
    }
}
