package com.p046a.p049b.p058c.p060b.p061a;

import com.p046a.p049b.p058c.p060b.AbstractC0669l;
import com.p046a.p049b.p058c.p060b.AbstractC0675r;
import com.p046a.p049b.p058c.p060b.C0653ai;
import com.p046a.p049b.p066f.p068b.C0850t;
import com.p046a.p049b.p073h.C0970r;
import java.util.BitSet;

/* JADX INFO: renamed from: com.a.b.c.b.a.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0640u extends AbstractC0675r {

    /* JADX INFO: renamed from: a */
    public static final AbstractC0675r f1055a = new C0640u();

    private C0640u() {
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0675r
    /* JADX INFO: renamed from: a */
    public final int mo1107a() {
        return 3;
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0675r
    /* JADX INFO: renamed from: a */
    public final String mo1108a(AbstractC0669l abstractC0669l) {
        C0850t c0850tM1225j = abstractC0669l.m1225j();
        return c0850tM1225j.m1815b(0).m1801m() + ", " + c0850tM1225j.m1815b(1).m1801m();
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
        m1256a(c0970r, m1252a(abstractC0669l, 0), (short) c0850tM1225j.m1815b(0).m1795g(), (short) c0850tM1225j.m1815b(1).m1795g());
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0675r
    /* JADX INFO: renamed from: b */
    public final boolean mo1112b(AbstractC0669l abstractC0669l) {
        C0850t c0850tM1225j = abstractC0669l.m1225j();
        return (abstractC0669l instanceof C0653ai) && c0850tM1225j.m2239d_() == 2 && m1264e(c0850tM1225j.m1815b(0).m1795g()) && m1264e(c0850tM1225j.m1815b(1).m1795g());
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0675r
    /* JADX INFO: renamed from: c */
    public final BitSet mo1113c(AbstractC0669l abstractC0669l) {
        C0850t c0850tM1225j = abstractC0669l.m1225j();
        BitSet bitSet = new BitSet(2);
        bitSet.set(0, m1264e(c0850tM1225j.m1815b(0).m1795g()));
        bitSet.set(1, m1264e(c0850tM1225j.m1815b(1).m1795g()));
        return bitSet;
    }
}
