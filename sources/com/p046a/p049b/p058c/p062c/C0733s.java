package com.p046a.p049b.p058c.p062c;

import com.p046a.p049b.p066f.p069c.C0862d;
import com.p046a.p049b.p073h.C0970r;

/* JADX INFO: renamed from: com.a.b.c.c.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0733s extends AbstractC0700ap {

    /* JADX INFO: renamed from: a */
    private final C0862d f1536a;

    /* JADX INFO: renamed from: b */
    private byte[] f1537b;

    public C0733s(C0862d c0862d) {
        super(1, -1);
        if (c0862d == null) {
            throw new NullPointerException("array == null");
        }
        this.f1536a = c0862d;
        this.f1537b = null;
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0700ap
    /* JADX INFO: renamed from: a */
    protected final int mo1301a(AbstractC0700ap abstractC0700ap) {
        return this.f1536a.compareTo(((C0733s) abstractC0700ap).f1536a);
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0688ad
    /* JADX INFO: renamed from: a */
    public final EnumC0689ae mo1302a() {
        return EnumC0689ae.f1393q;
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0700ap
    /* JADX INFO: renamed from: a */
    protected final void mo1303a(AbstractC0704at abstractC0704at, int i) {
        C0970r c0970r = new C0970r();
        new C0716be(abstractC0704at.m1361e(), c0970r).m1393a(this.f1536a, false);
        this.f1537b = c0970r.m2290g();
        m1342a(this.f1537b.length);
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0688ad
    /* JADX INFO: renamed from: a */
    public final void mo1304a(C0732r c0732r) {
        C0716be.m1389a(c0732r, this.f1536a);
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0700ap
    /* JADX INFO: renamed from: a_ */
    protected final void mo1306a_(C0732r c0732r, C0970r c0970r) {
        if (!c0970r.m2281b()) {
            c0970r.m2278a(this.f1537b);
        } else {
            c0970r.m2272a(0, m1347h() + " encoded array");
            new C0716be(c0732r, c0970r).m1393a(this.f1536a, true);
        }
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0700ap
    /* JADX INFO: renamed from: b */
    public final String mo1307b() {
        return this.f1536a.mo919d();
    }

    public final int hashCode() {
        return this.f1536a.hashCode();
    }
}
