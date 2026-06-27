package com.p046a.p049b.p058c.p060b;

import com.p046a.p049b.p066f.p068b.C0848r;
import com.p046a.p049b.p066f.p068b.C0850t;
import com.p046a.p049b.p066f.p068b.C0856z;
import com.p046a.p049b.p071g.AbstractC0913ag;

/* JADX INFO: renamed from: com.a.b.c.b.x */
/* JADX INFO: loaded from: classes.dex */
public final class C0681x extends AbstractC0658an {

    /* JADX INFO: renamed from: a */
    private final C0848r f1367a;

    public C0681x(C0856z c0856z, C0848r c0848r) {
        super(c0856z);
        if (c0848r == null) {
            throw new NullPointerException("local == null");
        }
        this.f1367a = c0848r;
    }

    /* JADX INFO: renamed from: a */
    public static String m1292a(C0848r c0848r) {
        return c0848r.m1801m() + ' ' + c0848r.m1797i().toString() + ": " + c0848r.m1796h().mo919d();
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0669l
    /* JADX INFO: renamed from: a */
    public final AbstractC0669l mo1103a(C0850t c0850t) {
        return new C0681x(m1224i(), this.f1367a);
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0669l
    /* JADX INFO: renamed from: a */
    public final AbstractC0669l mo1215a(AbstractC0913ag abstractC0913ag) {
        return new C0681x(m1224i(), abstractC0913ag.mo1962a(this.f1367a));
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0669l
    /* JADX INFO: renamed from: a */
    protected final String mo1104a(boolean z) {
        return "local-start " + m1292a(this.f1367a);
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0669l
    /* JADX INFO: renamed from: b */
    protected final String mo1106b() {
        return this.f1367a.toString();
    }

    /* JADX INFO: renamed from: c */
    public final C0848r m1293c() {
        return this.f1367a;
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0658an, com.p046a.p049b.p058c.p060b.AbstractC0669l
    /* JADX INFO: renamed from: d */
    public final AbstractC0669l mo1176d(int i) {
        return new C0681x(m1224i(), this.f1367a.m1792b(i));
    }
}
