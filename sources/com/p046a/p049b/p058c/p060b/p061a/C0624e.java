package com.p046a.p049b.p058c.p060b.p061a;

import com.p046a.p049b.p058c.p060b.AbstractC0669l;
import com.p046a.p049b.p058c.p060b.AbstractC0675r;
import com.p046a.p049b.p058c.p060b.C0653ai;
import com.p046a.p049b.p066f.p068b.C0848r;
import com.p046a.p049b.p066f.p068b.C0850t;
import com.p046a.p049b.p073h.C0970r;
import java.util.BitSet;

/* JADX INFO: renamed from: com.a.b.c.b.a.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0624e extends AbstractC0675r {

    /* JADX INFO: renamed from: a */
    public static final AbstractC0675r f1039a = new C0624e();

    private C0624e() {
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0675r
    /* JADX INFO: renamed from: a */
    public final int mo1107a() {
        return 1;
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0675r
    /* JADX INFO: renamed from: a */
    public final String mo1108a(AbstractC0669l abstractC0669l) {
        C0850t c0850tM1225j = abstractC0669l.m1225j();
        int iD_ = c0850tM1225j.m2239d_();
        return c0850tM1225j.m1815b(iD_ - 2).m1801m() + ", " + c0850tM1225j.m1815b(iD_ - 1).m1801m();
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0675r
    /* JADX INFO: renamed from: a */
    public final String mo1109a(AbstractC0669l abstractC0669l, boolean z) {
        return "";
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0675r
    /* JADX INFO: renamed from: a */
    public final void mo1110a(C0970r c0970r, AbstractC0669l abstractC0669l) {
        C0850t c0850tM1225j = abstractC0669l.m1225j();
        int iD_ = c0850tM1225j.m2239d_();
        c0970r.m2280b(m1252a(abstractC0669l, m1258b(c0850tM1225j.m1815b(iD_ - 2).m1795g(), c0850tM1225j.m1815b(iD_ - 1).m1795g())));
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0675r
    /* JADX INFO: renamed from: b */
    public final boolean mo1112b(AbstractC0669l abstractC0669l) {
        C0848r c0848rM1815b;
        C0848r c0848rM1815b2;
        if (!(abstractC0669l instanceof C0653ai)) {
            return false;
        }
        C0850t c0850tM1225j = abstractC0669l.m1225j();
        switch (c0850tM1225j.m2239d_()) {
            case 2:
                c0848rM1815b = c0850tM1225j.m1815b(0);
                c0848rM1815b2 = c0850tM1225j.m1815b(1);
                break;
            case 3:
                c0848rM1815b = c0850tM1225j.m1815b(1);
                c0848rM1815b2 = c0850tM1225j.m1815b(2);
                if (c0848rM1815b.m1795g() != c0850tM1225j.m1815b(0).m1795g()) {
                    return false;
                }
                break;
            default:
                return false;
        }
        return m1257a(c0848rM1815b.m1795g()) && m1257a(c0848rM1815b2.m1795g());
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0675r
    /* JADX INFO: renamed from: c */
    public final BitSet mo1113c(AbstractC0669l abstractC0669l) {
        C0850t c0850tM1225j = abstractC0669l.m1225j();
        BitSet bitSet = new BitSet(2);
        int iM1795g = c0850tM1225j.m1815b(0).m1795g();
        int iM1795g2 = c0850tM1225j.m1815b(1).m1795g();
        switch (c0850tM1225j.m2239d_()) {
            case 2:
                bitSet.set(0, m1257a(iM1795g));
                bitSet.set(1, m1257a(iM1795g2));
                return bitSet;
            case 3:
                if (iM1795g != iM1795g2) {
                    bitSet.set(0, false);
                    bitSet.set(1, false);
                } else {
                    boolean zA = m1257a(iM1795g2);
                    bitSet.set(0, zA);
                    bitSet.set(1, zA);
                }
                bitSet.set(2, m1257a(c0850tM1225j.m1815b(2).m1795g()));
                return bitSet;
            default:
                throw new AssertionError();
        }
    }
}
