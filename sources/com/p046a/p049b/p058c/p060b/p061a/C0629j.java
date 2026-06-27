package com.p046a.p049b.p058c.p060b.p061a;

import com.p046a.p049b.p058c.p060b.AbstractC0669l;
import com.p046a.p049b.p058c.p060b.AbstractC0675r;
import com.p046a.p049b.p058c.p060b.C0656al;
import com.p046a.p049b.p066f.p068b.C0850t;
import com.p046a.p049b.p073h.C0970r;
import java.util.BitSet;

/* JADX INFO: renamed from: com.a.b.c.b.a.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0629j extends AbstractC0675r {

    /* JADX INFO: renamed from: a */
    public static final AbstractC0675r f1044a = new C0629j();

    private C0629j() {
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0675r
    /* JADX INFO: renamed from: a */
    public final int mo1107a() {
        return 2;
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0675r
    /* JADX INFO: renamed from: a */
    public final String mo1108a(AbstractC0669l abstractC0669l) {
        return abstractC0669l.m1225j().m1815b(0).m1801m() + ", " + m1261d(abstractC0669l);
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0675r
    /* JADX INFO: renamed from: a */
    public final String mo1109a(AbstractC0669l abstractC0669l, boolean z) {
        return m1263e(abstractC0669l);
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0675r
    /* JADX INFO: renamed from: a */
    public final void mo1110a(C0970r c0970r, AbstractC0669l abstractC0669l) {
        m1255a(c0970r, m1252a(abstractC0669l, abstractC0669l.m1225j().m1815b(0).m1795g()), (short) ((C0656al) abstractC0669l).m1174e());
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0675r
    /* JADX INFO: renamed from: a */
    public final boolean mo1111a(C0656al c0656al) {
        int iM1174e = c0656al.m1174e();
        return iM1174e != 0 && m1262d(iM1174e);
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0675r
    /* JADX INFO: renamed from: b */
    public final boolean mo1112b(AbstractC0669l abstractC0669l) {
        C0850t c0850tM1225j = abstractC0669l.m1225j();
        if (!(abstractC0669l instanceof C0656al) || c0850tM1225j.m2239d_() != 1 || !m1260c(c0850tM1225j.m1815b(0).m1795g())) {
            return false;
        }
        C0656al c0656al = (C0656al) abstractC0669l;
        if (c0656al.m1175n()) {
            return mo1111a(c0656al);
        }
        return true;
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0675r
    /* JADX INFO: renamed from: c */
    public final BitSet mo1113c(AbstractC0669l abstractC0669l) {
        C0850t c0850tM1225j = abstractC0669l.m1225j();
        BitSet bitSet = new BitSet(1);
        bitSet.set(0, m1260c(c0850tM1225j.m1815b(0).m1795g()));
        return bitSet;
    }
}
