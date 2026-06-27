package com.p046a.p049b.p058c.p060b.p061a;

import com.p046a.p049b.p058c.p060b.AbstractC0669l;
import com.p046a.p049b.p058c.p060b.AbstractC0675r;
import com.p046a.p049b.p058c.p060b.C0666i;
import com.p046a.p049b.p066f.p068b.C0848r;
import com.p046a.p049b.p066f.p068b.C0850t;
import com.p046a.p049b.p066f.p069c.AbstractC0857a;
import com.p046a.p049b.p066f.p069c.C0880v;
import com.p046a.p049b.p066f.p069c.C0884z;
import com.p046a.p049b.p073h.C0970r;

/* JADX INFO: renamed from: com.a.b.c.b.a.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0642w extends AbstractC0675r {

    /* JADX INFO: renamed from: a */
    public static final AbstractC0675r f1057a = new C0642w();

    private C0642w() {
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0675r
    /* JADX INFO: renamed from: a */
    public final int mo1107a() {
        return 3;
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0675r
    /* JADX INFO: renamed from: a */
    public final String mo1108a(AbstractC0669l abstractC0669l) {
        StringBuilder sb = new StringBuilder();
        C0850t c0850tM1225j = abstractC0669l.m1225j();
        int iD_ = c0850tM1225j.m2239d_();
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append("{");
        switch (iD_) {
            case 0:
                break;
            case 1:
                sb2.append(c0850tM1225j.m1815b(0).m1801m());
                break;
            default:
                C0848r c0848rM1815b = c0850tM1225j.m1815b(iD_ - 1);
                if (c0848rM1815b.m1799k() == 2) {
                    c0848rM1815b = c0848rM1815b.m1792b(1);
                }
                sb2.append(c0850tM1225j.m1815b(0).m1801m());
                sb2.append("..");
                sb2.append(c0848rM1815b.m1801m());
                break;
        }
        sb2.append("}");
        return sb.append(sb2.toString()).append(", ").append(m1265f(abstractC0669l)).toString();
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0675r
    /* JADX INFO: renamed from: a */
    public final String mo1109a(AbstractC0669l abstractC0669l, boolean z) {
        return z ? m1266g(abstractC0669l) : "";
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0675r
    /* JADX INFO: renamed from: a */
    public final void mo1110a(C0970r c0970r, AbstractC0669l abstractC0669l) {
        C0850t c0850tM1225j = abstractC0669l.m1225j();
        m1256a(c0970r, m1252a(abstractC0669l, c0850tM1225j.m1819e()), (short) ((C0666i) abstractC0669l).m1200d(), (short) (c0850tM1225j.m2239d_() == 0 ? 0 : c0850tM1225j.m1815b(0).m1795g()));
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0675r
    /* JADX INFO: renamed from: b */
    public final boolean mo1112b(AbstractC0669l abstractC0669l) {
        boolean z;
        if (!(abstractC0669l instanceof C0666i)) {
            return false;
        }
        C0666i c0666i = (C0666i) abstractC0669l;
        int iM1200d = c0666i.m1200d();
        AbstractC0857a abstractC0857aM1199c = c0666i.m1199c();
        if (!m1264e(iM1200d)) {
            return false;
        }
        if (!(abstractC0857aM1199c instanceof C0880v) && !(abstractC0857aM1199c instanceof C0884z)) {
            return false;
        }
        C0850t c0850tJ = c0666i.m1225j();
        if (c0850tJ.m2239d_() != 0) {
            int iD_ = c0850tJ.m2239d_();
            if (iD_ < 2) {
                z = true;
                return z ? false : false;
            }
            int iM1795g = c0850tJ.m1815b(0).m1795g();
            for (int i = 0; i < iD_; i++) {
                C0848r c0848rM1815b = c0850tJ.m1815b(i);
                if (c0848rM1815b.m1795g() != iM1795g) {
                    z = false;
                    break;
                }
                iM1795g += c0848rM1815b.m1799k();
            }
            z = true;
            if (z || !m1264e(c0850tJ.m1815b(0).m1795g()) || !m1260c(c0850tJ.m1819e())) {
                return false;
            }
        }
        return true;
    }
}
