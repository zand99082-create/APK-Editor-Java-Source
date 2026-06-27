package com.p046a.p049b.p058c.p060b.p061a;

import com.p046a.p049b.p058c.p060b.AbstractC0669l;
import com.p046a.p049b.p058c.p060b.AbstractC0675r;
import com.p046a.p049b.p058c.p060b.C0666i;
import com.p046a.p049b.p066f.p068b.C0850t;
import com.p046a.p049b.p066f.p069c.AbstractC0857a;
import com.p046a.p049b.p066f.p069c.AbstractC0877s;
import com.p046a.p049b.p073h.C0970r;
import java.util.BitSet;

/* JADX INFO: renamed from: com.a.b.c.b.a.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0622c extends AbstractC0675r {

    /* JADX INFO: renamed from: a */
    public static final AbstractC0675r f1037a = new C0622c();

    private C0622c() {
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0675r
    /* JADX INFO: renamed from: a */
    public final int mo1107a() {
        return 1;
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0675r
    /* JADX INFO: renamed from: a */
    public final String mo1108a(AbstractC0669l abstractC0669l) {
        return abstractC0669l.m1225j().m1815b(0).m1801m() + ", " + m1249a((AbstractC0877s) ((C0666i) abstractC0669l).m1199c());
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0675r
    /* JADX INFO: renamed from: a */
    public final String mo1109a(AbstractC0669l abstractC0669l, boolean z) {
        return m1250a((AbstractC0877s) ((C0666i) abstractC0669l).m1199c(), 4);
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0675r
    /* JADX INFO: renamed from: a */
    public final void mo1110a(C0970r c0970r, AbstractC0669l abstractC0669l) {
        c0970r.m2280b(m1252a(abstractC0669l, m1258b(abstractC0669l.m1225j().m1815b(0).m1795g(), ((AbstractC0877s) ((C0666i) abstractC0669l).m1199c()).mo1894j() & 15)));
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0675r
    /* JADX INFO: renamed from: b */
    public final boolean mo1112b(AbstractC0669l abstractC0669l) {
        C0850t c0850tM1225j = abstractC0669l.m1225j();
        if (!(abstractC0669l instanceof C0666i) || c0850tM1225j.m2239d_() != 1 || !m1257a(c0850tM1225j.m1815b(0).m1795g())) {
            return false;
        }
        AbstractC0857a abstractC0857aM1199c = ((C0666i) abstractC0669l).m1199c();
        if (!(abstractC0857aM1199c instanceof AbstractC0877s)) {
            return false;
        }
        AbstractC0877s abstractC0877s = (AbstractC0877s) abstractC0857aM1199c;
        if (abstractC0877s.mo1893i()) {
            int iMo1894j = abstractC0877s.mo1894j();
            if (iMo1894j >= -8 && iMo1894j <= 7) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0675r
    /* JADX INFO: renamed from: c */
    public final BitSet mo1113c(AbstractC0669l abstractC0669l) {
        C0850t c0850tM1225j = abstractC0669l.m1225j();
        BitSet bitSet = new BitSet(1);
        bitSet.set(0, m1257a(c0850tM1225j.m1815b(0).m1795g()));
        return bitSet;
    }
}
