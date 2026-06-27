package com.p046a.p049b.p058c.p060b.p061a;

import com.p046a.p049b.p058c.p060b.AbstractC0669l;
import com.p046a.p049b.p058c.p060b.AbstractC0675r;
import com.p046a.p049b.p058c.p060b.C0666i;
import com.p046a.p049b.p066f.p068b.C0848r;
import com.p046a.p049b.p066f.p068b.C0850t;
import com.p046a.p049b.p066f.p069c.AbstractC0857a;
import com.p046a.p049b.p066f.p069c.C0880v;
import com.p046a.p049b.p066f.p069c.C0884z;
import com.p046a.p049b.p066f.p070d.C0887c;
import com.p046a.p049b.p073h.C0970r;
import java.util.BitSet;

/* JADX INFO: renamed from: com.a.b.c.b.a.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0641v extends AbstractC0675r {

    /* JADX INFO: renamed from: a */
    public static final AbstractC0675r f1056a = new C0641v();

    private C0641v() {
    }

    /* JADX INFO: renamed from: b */
    private static int m1114b(C0850t c0850t) {
        int i = 0;
        int iD_ = c0850t.m2239d_();
        if (iD_ > 5) {
            return -1;
        }
        int i2 = 0;
        while (i2 < iD_) {
            int iM1799k = c0850t.m1815b(i2).m1799k() + i;
            if (!m1257a((r5.m1795g() + r5.m1799k()) - 1)) {
                return -1;
            }
            i2++;
            i = iM1799k;
        }
        if (i <= 5) {
            return i;
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    private static C0850t m1115c(C0850t c0850t) {
        int i = 0;
        int iM1114b = m1114b(c0850t);
        int iD_ = c0850t.m2239d_();
        if (iM1114b == iD_) {
            return c0850t;
        }
        C0850t c0850t2 = new C0850t(iM1114b);
        for (int i2 = 0; i2 < iD_; i2++) {
            C0848r c0848rM1815b = c0850t.m1815b(i2);
            c0850t2.m1814a(i, c0848rM1815b);
            if (c0848rM1815b.m1799k() == 2) {
                c0850t2.m1814a(i + 1, C0848r.m1778a(c0848rM1815b.m1795g() + 1, C0887c.f2350i));
                i += 2;
            } else {
                i++;
            }
        }
        c0850t2.mo811b_();
        return c0850t2;
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0675r
    /* JADX INFO: renamed from: a */
    public final int mo1107a() {
        return 3;
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0675r
    /* JADX INFO: renamed from: a */
    public final String mo1108a(AbstractC0669l abstractC0669l) {
        return m1248a(m1115c(abstractC0669l.m1225j())) + ", " + m1265f(abstractC0669l);
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0675r
    /* JADX INFO: renamed from: a */
    public final String mo1109a(AbstractC0669l abstractC0669l, boolean z) {
        return z ? m1266g(abstractC0669l) : "";
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0675r
    /* JADX INFO: renamed from: a */
    public final void mo1110a(C0970r c0970r, AbstractC0669l abstractC0669l) {
        int iM1200d = ((C0666i) abstractC0669l).m1200d();
        C0850t c0850tM1115c = m1115c(abstractC0669l.m1225j());
        int iD_ = c0850tM1115c.m2239d_();
        int iM1795g = iD_ > 0 ? c0850tM1115c.m1815b(0).m1795g() : 0;
        int iM1795g2 = iD_ > 1 ? c0850tM1115c.m1815b(1).m1795g() : 0;
        int iM1795g3 = iD_ > 2 ? c0850tM1115c.m1815b(2).m1795g() : 0;
        int iM1795g4 = iD_ > 3 ? c0850tM1115c.m1815b(3).m1795g() : 0;
        short sA = m1252a(abstractC0669l, m1258b(iD_ > 4 ? c0850tM1115c.m1815b(4).m1795g() : 0, iD_));
        short s = (short) iM1200d;
        if ((iM1795g & 15) != iM1795g) {
            throw new IllegalArgumentException("n0 out of range 0..15");
        }
        if ((iM1795g2 & 15) != iM1795g2) {
            throw new IllegalArgumentException("n1 out of range 0..15");
        }
        if ((iM1795g3 & 15) != iM1795g3) {
            throw new IllegalArgumentException("n2 out of range 0..15");
        }
        if ((iM1795g4 & 15) != iM1795g4) {
            throw new IllegalArgumentException("n3 out of range 0..15");
        }
        m1256a(c0970r, sA, s, (short) ((iM1795g4 << 12) | (iM1795g3 << 8) | (iM1795g2 << 4) | iM1795g));
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0675r
    /* JADX INFO: renamed from: b */
    public final boolean mo1112b(AbstractC0669l abstractC0669l) {
        if (!(abstractC0669l instanceof C0666i)) {
            return false;
        }
        C0666i c0666i = (C0666i) abstractC0669l;
        if (!m1264e(c0666i.m1200d())) {
            return false;
        }
        AbstractC0857a abstractC0857aM1199c = c0666i.m1199c();
        return ((abstractC0857aM1199c instanceof C0880v) || (abstractC0857aM1199c instanceof C0884z)) && m1114b(c0666i.m1225j()) >= 0;
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0675r
    /* JADX INFO: renamed from: c */
    public final BitSet mo1113c(AbstractC0669l abstractC0669l) {
        C0850t c0850tM1225j = abstractC0669l.m1225j();
        int iD_ = c0850tM1225j.m2239d_();
        BitSet bitSet = new BitSet(iD_);
        for (int i = 0; i < iD_; i++) {
            C0848r c0848rM1815b = c0850tM1225j.m1815b(i);
            bitSet.set(i, m1257a((c0848rM1815b.m1799k() + c0848rM1815b.m1795g()) - 1));
        }
        return bitSet;
    }
}
