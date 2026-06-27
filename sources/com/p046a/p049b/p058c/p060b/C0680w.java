package com.p046a.p049b.p058c.p060b;

import com.p046a.p049b.p066f.p068b.C0848r;
import com.p046a.p049b.p066f.p068b.C0850t;
import com.p046a.p049b.p066f.p068b.C0852v;
import com.p046a.p049b.p066f.p068b.C0856z;
import com.p046a.p049b.p071g.AbstractC0913ag;

/* JADX INFO: renamed from: com.a.b.c.b.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0680w extends AbstractC0658an {

    /* JADX INFO: renamed from: a */
    private final C0852v f1366a;

    public C0680w(C0856z c0856z, C0852v c0852v) {
        super(c0856z);
        if (c0852v == null) {
            throw new NullPointerException("locals == null");
        }
        this.f1366a = c0852v;
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0669l
    /* JADX INFO: renamed from: a */
    public final AbstractC0669l mo1103a(C0850t c0850t) {
        return new C0680w(m1224i(), this.f1366a);
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0669l
    /* JADX INFO: renamed from: a */
    public final AbstractC0669l mo1215a(AbstractC0913ag abstractC0913ag) {
        return new C0680w(m1224i(), abstractC0913ag.m2037a(this.f1366a));
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0669l
    /* JADX INFO: renamed from: a */
    protected final String mo1104a(boolean z) {
        int iM1833d = this.f1366a.m1833d();
        int iM1829b = this.f1366a.m1829b();
        StringBuffer stringBuffer = new StringBuffer((iM1833d * 40) + 100);
        stringBuffer.append("local-snapshot");
        for (int i = 0; i < iM1829b; i++) {
            C0848r c0848rM1824a = this.f1366a.m1824a(i);
            if (c0848rM1824a != null) {
                stringBuffer.append("\n  ");
                stringBuffer.append(C0681x.m1292a(c0848rM1824a));
            }
        }
        return stringBuffer.toString();
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0669l
    /* JADX INFO: renamed from: b */
    protected final String mo1106b() {
        return this.f1366a.toString();
    }

    /* JADX INFO: renamed from: c */
    public final C0852v m1291c() {
        return this.f1366a;
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0658an, com.p046a.p049b.p058c.p060b.AbstractC0669l
    /* JADX INFO: renamed from: d */
    public final AbstractC0669l mo1176d(int i) {
        return new C0680w(m1224i(), this.f1366a.m1831b(i));
    }
}
