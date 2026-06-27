package com.p046a.p049b.p058c.p060b.p061a;

import android.support.v4.internal.view.SupportMenu;
import com.p046a.p049b.p058c.p060b.AbstractC0669l;
import com.p046a.p049b.p058c.p060b.AbstractC0675r;
import com.p046a.p049b.p058c.p060b.C0666i;
import com.p046a.p049b.p066f.p068b.C0850t;
import com.p046a.p049b.p066f.p069c.AbstractC0857a;
import com.p046a.p049b.p066f.p069c.AbstractC0877s;
import com.p046a.p049b.p073h.C0970r;
import java.util.BitSet;

/* JADX INFO: renamed from: com.a.b.c.b.a.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0627h extends AbstractC0675r {

    /* JADX INFO: renamed from: a */
    public static final AbstractC0675r f1042a = new C0627h();

    private C0627h() {
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0675r
    /* JADX INFO: renamed from: a */
    public final int mo1107a() {
        return 2;
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0675r
    /* JADX INFO: renamed from: a */
    public final String mo1108a(AbstractC0669l abstractC0669l) {
        return abstractC0669l.m1225j().m1815b(0).m1801m() + ", " + m1249a((AbstractC0877s) ((C0666i) abstractC0669l).m1199c());
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0675r
    /* JADX INFO: renamed from: a */
    public final String mo1109a(AbstractC0669l abstractC0669l, boolean z) {
        return m1250a((AbstractC0877s) ((C0666i) abstractC0669l).m1199c(), abstractC0669l.m1225j().m1815b(0).m1799k() == 1 ? 32 : 64);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p046a.p049b.p058c.p060b.AbstractC0675r
    /* JADX INFO: renamed from: a */
    public final void mo1110a(C0970r c0970r, AbstractC0669l abstractC0669l) {
        C0850t c0850tM1225j = abstractC0669l.m1225j();
        m1255a(c0970r, m1252a(abstractC0669l, c0850tM1225j.m1815b(0).m1795g()), c0850tM1225j.m1815b(0).m1799k() == 1 ? ((AbstractC0877s) ((C0666i) abstractC0669l).m1199c()).mo1894j() >> 16 : (short) (r0.mo1895k() >>> 48));
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0675r
    /* JADX INFO: renamed from: b */
    public final boolean mo1112b(AbstractC0669l abstractC0669l) {
        C0850t c0850tM1225j = abstractC0669l.m1225j();
        if (!(abstractC0669l instanceof C0666i) || c0850tM1225j.m2239d_() != 1 || !m1260c(c0850tM1225j.m1815b(0).m1795g())) {
            return false;
        }
        AbstractC0857a abstractC0857aM1199c = ((C0666i) abstractC0669l).m1199c();
        if (!(abstractC0857aM1199c instanceof AbstractC0877s)) {
            return false;
        }
        AbstractC0877s abstractC0877s = (AbstractC0877s) abstractC0857aM1199c;
        return c0850tM1225j.m1815b(0).m1799k() == 1 ? (abstractC0877s.mo1894j() & SupportMenu.USER_MASK) == 0 : (abstractC0877s.mo1895k() & 281474976710655L) == 0;
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
