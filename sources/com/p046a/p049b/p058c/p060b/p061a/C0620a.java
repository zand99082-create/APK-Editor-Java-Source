package com.p046a.p049b.p058c.p060b.p061a;

import com.p046a.p049b.p058c.p060b.AbstractC0669l;
import com.p046a.p049b.p058c.p060b.AbstractC0675r;
import com.p046a.p049b.p058c.p060b.C0656al;
import com.p046a.p049b.p073h.C0970r;

/* JADX INFO: renamed from: com.a.b.c.b.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0620a extends AbstractC0675r {

    /* JADX INFO: renamed from: a */
    public static final AbstractC0675r f1035a = new C0620a();

    private C0620a() {
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0675r
    /* JADX INFO: renamed from: a */
    public final int mo1107a() {
        return 1;
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0675r
    /* JADX INFO: renamed from: a */
    public final String mo1108a(AbstractC0669l abstractC0669l) {
        return m1261d(abstractC0669l);
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0675r
    /* JADX INFO: renamed from: a */
    public final String mo1109a(AbstractC0669l abstractC0669l, boolean z) {
        return m1263e(abstractC0669l);
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0675r
    /* JADX INFO: renamed from: a */
    public final void mo1110a(C0970r c0970r, AbstractC0669l abstractC0669l) {
        c0970r.m2280b(m1252a(abstractC0669l, ((C0656al) abstractC0669l).m1174e() & 255));
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0675r
    /* JADX INFO: renamed from: a */
    public final boolean mo1111a(C0656al c0656al) {
        int iM1174e = c0656al.m1174e();
        return iM1174e != 0 && m1259b(iM1174e);
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0675r
    /* JADX INFO: renamed from: b */
    public final boolean mo1112b(AbstractC0669l abstractC0669l) {
        if (!(abstractC0669l instanceof C0656al) || abstractC0669l.m1225j().m2239d_() != 0) {
            return false;
        }
        C0656al c0656al = (C0656al) abstractC0669l;
        if (c0656al.m1175n()) {
            return mo1111a(c0656al);
        }
        return true;
    }
}
