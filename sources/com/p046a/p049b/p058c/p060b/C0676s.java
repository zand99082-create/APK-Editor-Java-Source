package com.p046a.p049b.p058c.p060b;

import com.p046a.p049b.p073h.C0959g;

/* JADX INFO: renamed from: com.a.b.c.b.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0676s extends C0959g {

    /* JADX INFO: renamed from: a */
    public static final C0676s f1350a = new C0676s(0);

    public C0676s(int i) {
        super(i);
    }

    /* JADX INFO: renamed from: a */
    public static C0676s m1267a(C0670m c0670m) {
        int iD_ = c0670m.m2239d_();
        C0679v c0679v = new C0679v(iD_);
        for (int i = 0; i < iD_; i++) {
            AbstractC0669l abstractC0669lM1230a = c0670m.m1230a(i);
            if (abstractC0669lM1230a instanceof C0680w) {
                c0679v.m1290a(abstractC0669lM1230a.m1222g(), ((C0680w) abstractC0669lM1230a).m1291c());
            } else if (abstractC0669lM1230a instanceof C0681x) {
                c0679v.m1289a(abstractC0669lM1230a.m1222g(), ((C0681x) abstractC0669lM1230a).m1293c());
            }
        }
        return c0679v.m1288a();
    }

    /* JADX INFO: renamed from: a */
    public final C0678u m1268a(int i) {
        return (C0678u) m2240e(i);
    }

    /* JADX INFO: renamed from: a */
    public final void m1269a(int i, C0678u c0678u) {
        m2237a(i, (Object) c0678u);
    }
}
