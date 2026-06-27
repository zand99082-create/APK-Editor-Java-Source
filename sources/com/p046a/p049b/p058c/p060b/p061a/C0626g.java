package com.p046a.p049b.p058c.p060b.p061a;

import com.p046a.p049b.p058c.p060b.AbstractC0669l;
import com.p046a.p049b.p058c.p060b.AbstractC0675r;
import com.p046a.p049b.p058c.p060b.C0666i;
import com.p046a.p049b.p066f.p068b.C0848r;
import com.p046a.p049b.p066f.p068b.C0850t;
import com.p046a.p049b.p066f.p069c.AbstractC0857a;
import com.p046a.p049b.p066f.p069c.C0870l;
import com.p046a.p049b.p066f.p069c.C0883y;
import com.p046a.p049b.p066f.p069c.C0884z;
import com.p046a.p049b.p073h.C0970r;
import java.util.BitSet;

/* JADX INFO: renamed from: com.a.b.c.b.a.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0626g extends AbstractC0675r {

    /* JADX INFO: renamed from: a */
    public static final AbstractC0675r f1041a = new C0626g();

    private C0626g() {
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0675r
    /* JADX INFO: renamed from: a */
    public final int mo1107a() {
        return 2;
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0675r
    /* JADX INFO: renamed from: a */
    public final String mo1108a(AbstractC0669l abstractC0669l) {
        return abstractC0669l.m1225j().m1815b(0).m1801m() + ", " + m1265f(abstractC0669l);
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0675r
    /* JADX INFO: renamed from: a */
    public final String mo1109a(AbstractC0669l abstractC0669l, boolean z) {
        return z ? m1266g(abstractC0669l) : "";
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0675r
    /* JADX INFO: renamed from: a */
    public final void mo1110a(C0970r c0970r, AbstractC0669l abstractC0669l) {
        m1255a(c0970r, m1252a(abstractC0669l, abstractC0669l.m1225j().m1815b(0).m1795g()), (short) ((C0666i) abstractC0669l).m1200d());
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0675r
    /* JADX INFO: renamed from: b */
    public final boolean mo1112b(AbstractC0669l abstractC0669l) {
        C0848r c0848rM1815b;
        if (!(abstractC0669l instanceof C0666i)) {
            return false;
        }
        C0850t c0850tM1225j = abstractC0669l.m1225j();
        switch (c0850tM1225j.m2239d_()) {
            case 1:
                c0848rM1815b = c0850tM1225j.m1815b(0);
                break;
            case 2:
                c0848rM1815b = c0850tM1225j.m1815b(0);
                if (c0848rM1815b.m1795g() != c0850tM1225j.m1815b(1).m1795g()) {
                    return false;
                }
                break;
            default:
                return false;
        }
        if (!m1260c(c0848rM1815b.m1795g())) {
            return false;
        }
        C0666i c0666i = (C0666i) abstractC0669l;
        int iM1200d = c0666i.m1200d();
        AbstractC0857a abstractC0857aM1199c = c0666i.m1199c();
        if (m1264e(iM1200d)) {
            return (abstractC0857aM1199c instanceof C0884z) || (abstractC0857aM1199c instanceof C0870l) || (abstractC0857aM1199c instanceof C0883y);
        }
        return false;
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0675r
    /* JADX INFO: renamed from: c */
    public final BitSet mo1113c(AbstractC0669l abstractC0669l) {
        C0850t c0850tM1225j = abstractC0669l.m1225j();
        int iD_ = c0850tM1225j.m2239d_();
        BitSet bitSet = new BitSet(iD_);
        boolean zC = m1260c(c0850tM1225j.m1815b(0).m1795g());
        if (iD_ == 1) {
            bitSet.set(0, zC);
        } else if (c0850tM1225j.m1815b(0).m1795g() == c0850tM1225j.m1815b(1).m1795g()) {
            bitSet.set(0, zC);
            bitSet.set(1, zC);
        }
        return bitSet;
    }
}
