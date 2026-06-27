package com.p046a.p049b.p058c.p060b.p061a;

import com.p046a.p049b.p058c.p060b.AbstractC0669l;
import com.p046a.p049b.p058c.p060b.AbstractC0675r;
import com.p046a.p049b.p058c.p060b.C0666i;
import com.p046a.p049b.p066f.p068b.C0850t;
import com.p046a.p049b.p066f.p069c.AbstractC0857a;
import com.p046a.p049b.p066f.p069c.AbstractC0877s;
import com.p046a.p049b.p073h.C0970r;
import java.util.BitSet;

/* JADX INFO: renamed from: com.a.b.c.b.a.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0630k extends AbstractC0675r {

    /* JADX INFO: renamed from: a */
    public static final AbstractC0675r f1045a = new C0630k();

    private C0630k() {
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0675r
    /* JADX INFO: renamed from: a */
    public final int mo1107a() {
        return 2;
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0675r
    /* JADX INFO: renamed from: a */
    public final String mo1108a(AbstractC0669l abstractC0669l) {
        C0850t c0850tM1225j = abstractC0669l.m1225j();
        return c0850tM1225j.m1815b(0).m1801m() + ", " + c0850tM1225j.m1815b(1).m1801m() + ", " + m1249a((AbstractC0877s) ((C0666i) abstractC0669l).m1199c());
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0675r
    /* JADX INFO: renamed from: a */
    public final String mo1109a(AbstractC0669l abstractC0669l, boolean z) {
        return m1250a((AbstractC0877s) ((C0666i) abstractC0669l).m1199c(), 8);
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0675r
    /* JADX INFO: renamed from: a */
    public final void mo1110a(C0970r c0970r, AbstractC0669l abstractC0669l) {
        C0850t c0850tM1225j = abstractC0669l.m1225j();
        m1255a(c0970r, m1252a(abstractC0669l, c0850tM1225j.m1815b(0).m1795g()), m1251a(c0850tM1225j.m1815b(1).m1795g(), ((AbstractC0877s) ((C0666i) abstractC0669l).m1199c()).mo1894j() & 255));
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0675r
    /* JADX INFO: renamed from: b */
    public final boolean mo1112b(AbstractC0669l abstractC0669l) {
        C0850t c0850tM1225j = abstractC0669l.m1225j();
        if (!(abstractC0669l instanceof C0666i) || c0850tM1225j.m2239d_() != 2 || !m1260c(c0850tM1225j.m1815b(0).m1795g()) || !m1260c(c0850tM1225j.m1815b(1).m1795g())) {
            return false;
        }
        AbstractC0857a abstractC0857aM1199c = ((C0666i) abstractC0669l).m1199c();
        if (!(abstractC0857aM1199c instanceof AbstractC0877s)) {
            return false;
        }
        AbstractC0877s abstractC0877s = (AbstractC0877s) abstractC0857aM1199c;
        return abstractC0877s.mo1893i() && m1259b(abstractC0877s.mo1894j());
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0675r
    /* JADX INFO: renamed from: c */
    public final BitSet mo1113c(AbstractC0669l abstractC0669l) {
        C0850t c0850tM1225j = abstractC0669l.m1225j();
        BitSet bitSet = new BitSet(2);
        bitSet.set(0, m1260c(c0850tM1225j.m1815b(0).m1795g()));
        bitSet.set(1, m1260c(c0850tM1225j.m1815b(1).m1795g()));
        return bitSet;
    }
}
