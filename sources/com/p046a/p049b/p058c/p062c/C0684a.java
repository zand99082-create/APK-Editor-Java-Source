package com.p046a.p049b.p058c.p062c;

import com.p046a.p049b.p066f.p067a.C0822a;
import com.p046a.p049b.p066f.p067a.C0826e;
import com.p046a.p049b.p066f.p067a.EnumC0823b;
import com.p046a.p049b.p073h.C0970r;
import java.util.Arrays;

/* JADX INFO: renamed from: com.a.b.c.c.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0684a extends AbstractC0700ap {

    /* JADX INFO: renamed from: a */
    private static final C0717c f1370a = new C0717c(0);

    /* JADX INFO: renamed from: b */
    private final C0822a f1371b;

    /* JADX INFO: renamed from: c */
    private C0710az f1372c;

    /* JADX INFO: renamed from: d */
    private byte[] f1373d;

    public C0684a(C0822a c0822a, C0732r c0732r) {
        super(1, -1);
        if (c0822a == null) {
            throw new NullPointerException("annotation == null");
        }
        this.f1371b = c0822a;
        this.f1372c = null;
        this.f1373d = null;
        mo1304a(c0732r);
    }

    /* JADX INFO: renamed from: a */
    public static void m1300a(C0684a[] c0684aArr) {
        Arrays.sort(c0684aArr, f1370a);
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0700ap
    /* JADX INFO: renamed from: a */
    protected final int mo1301a(AbstractC0700ap abstractC0700ap) {
        return this.f1371b.compareTo(((C0684a) abstractC0700ap).f1371b);
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0688ad
    /* JADX INFO: renamed from: a */
    public final EnumC0689ae mo1302a() {
        return EnumC0689ae.f1392p;
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0700ap
    /* JADX INFO: renamed from: a */
    protected final void mo1303a(AbstractC0704at abstractC0704at, int i) {
        C0970r c0970r = new C0970r();
        new C0716be(abstractC0704at.m1361e(), c0970r).m1392a(this.f1371b, false);
        this.f1373d = c0970r.m2290g();
        m1342a(this.f1373d.length + 1);
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0688ad
    /* JADX INFO: renamed from: a */
    public final void mo1304a(C0732r c0732r) {
        this.f1372c = c0732r.m1491k().m1379a(this.f1371b.m1701b());
        C0716be.m1388a(c0732r, this.f1371b);
    }

    /* JADX INFO: renamed from: a */
    public final void m1305a(C0970r c0970r, String str) {
        c0970r.m2272a(0, str + "visibility: " + this.f1371b.m1703e().mo919d());
        c0970r.m2272a(0, str + "type: " + this.f1371b.m1701b().mo919d());
        for (C0826e c0826e : this.f1371b.m1704f()) {
            c0970r.m2272a(0, str + c0826e.m1717a().mo919d() + ": " + C0716be.m1387a(c0826e.m1718b()));
        }
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0700ap
    /* JADX INFO: renamed from: a_ */
    protected final void mo1306a_(C0732r c0732r, C0970r c0970r) {
        boolean zM2281b = c0970r.m2281b();
        EnumC0823b enumC0823bM1703e = this.f1371b.m1703e();
        if (zM2281b) {
            c0970r.m2272a(0, m1347h() + " annotation");
            c0970r.m2272a(1, "  visibility: VISBILITY_" + enumC0823bM1703e);
        }
        switch (C0711b.f1446a[enumC0823bM1703e.ordinal()]) {
            case 1:
                c0970r.mo569d(0);
                break;
            case 2:
                c0970r.mo569d(1);
                break;
            case 3:
                c0970r.mo569d(2);
                break;
            default:
                throw new RuntimeException("shouldn't happen");
        }
        if (zM2281b) {
            new C0716be(c0732r, c0970r).m1392a(this.f1371b, true);
        } else {
            c0970r.m2278a(this.f1373d);
        }
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0700ap
    /* JADX INFO: renamed from: b */
    public final String mo1307b() {
        return this.f1371b.mo919d();
    }

    public final int hashCode() {
        return this.f1371b.hashCode();
    }
}
