package com.p046a.p049b.p058c.p060b;

import com.p046a.p049b.p066f.p068b.C0848r;
import com.p046a.p049b.p066f.p068b.C0850t;
import com.p046a.p049b.p066f.p068b.C0856z;
import com.p046a.p049b.p073h.C0970r;

/* JADX INFO: renamed from: com.a.b.c.b.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0674q extends AbstractC0657am {

    /* JADX INFO: renamed from: a */
    private C0653ai[] f1349a;

    public C0674q(C0856z c0856z, C0850t c0850t) {
        super(c0856z, c0850t);
        if (c0850t.m2239d_() == 0) {
            throw new IllegalArgumentException("registers.size() == 0");
        }
        this.f1349a = null;
    }

    /* JADX INFO: renamed from: a */
    private static C0653ai m1246a(C0848r c0848r, int i) {
        return AbstractC0669l.m1213a(C0856z.f2229a, C0848r.m1778a(i, c0848r.mo925a()), c0848r);
    }

    /* JADX INFO: renamed from: c */
    private void m1247c() {
        int iM1799k = 0;
        if (this.f1349a != null) {
            return;
        }
        C0850t c0850tJ = m1225j();
        int iD_ = c0850tJ.m2239d_();
        this.f1349a = new C0653ai[iD_];
        for (int i = 0; i < iD_; i++) {
            C0848r c0848rM1815b = c0850tJ.m1815b(i);
            this.f1349a[i] = m1246a(c0848rM1815b, iM1799k);
            iM1799k += c0848rM1815b.m1799k();
        }
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0669l
    /* JADX INFO: renamed from: a */
    public final int mo1102a() {
        m1247c();
        int iA = 0;
        for (C0653ai c0653ai : this.f1349a) {
            iA += c0653ai.mo1102a();
        }
        return iA;
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0669l
    /* JADX INFO: renamed from: a */
    public final AbstractC0669l mo1103a(C0850t c0850t) {
        return new C0674q(m1224i(), c0850t);
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0669l
    /* JADX INFO: renamed from: a */
    protected final String mo1104a(boolean z) {
        int iM1799k = 0;
        C0850t c0850tJ = m1225j();
        int iD_ = c0850tJ.m2239d_();
        StringBuffer stringBuffer = new StringBuffer(100);
        for (int i = 0; i < iD_; i++) {
            C0848r c0848rM1815b = c0850tJ.m1815b(i);
            C0653ai c0653aiM1246a = m1246a(c0848rM1815b, iM1799k);
            if (i != 0) {
                stringBuffer.append('\n');
            }
            stringBuffer.append(c0653aiM1246a.mo1104a(z));
            iM1799k += c0848rM1815b.m1799k();
        }
        return stringBuffer.toString();
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0669l
    /* JADX INFO: renamed from: a */
    public final void mo1105a(C0970r c0970r) {
        m1247c();
        for (C0653ai c0653ai : this.f1349a) {
            c0653ai.mo1105a(c0970r);
        }
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0669l
    /* JADX INFO: renamed from: b */
    protected final String mo1106b() {
        return null;
    }
}
