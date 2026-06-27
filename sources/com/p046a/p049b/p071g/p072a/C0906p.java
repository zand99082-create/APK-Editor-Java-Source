package com.p046a.p049b.p071g.p072a;

import com.p046a.p049b.p066f.p068b.C0848r;
import com.p046a.p049b.p066f.p068b.C0850t;
import com.p046a.p049b.p071g.C0909ac;
import com.p046a.p049b.p071g.C0915ai;
import com.p046a.p049b.p071g.InterfaceC0911ae;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.a.b.g.a.p */
/* JADX INFO: loaded from: classes.dex */
final class C0906p implements InterfaceC0911ae {

    /* JADX INFO: renamed from: a */
    private final ArrayList f2417a;

    public C0906p(ArrayList arrayList) {
        this.f2417a = arrayList;
    }

    @Override // com.p046a.p049b.p071g.InterfaceC0911ae
    /* JADX INFO: renamed from: a */
    public final void mo2011a(C0909ac c0909ac) {
        C0850t c0850tMo2018a = c0909ac.mo2018a();
        C0848r c0848rN = c0909ac.m2093n();
        int iD_ = c0850tMo2018a.m2239d_();
        for (int i = 0; i < iD_; i++) {
            ((C0915ai) this.f2417a.get(c0909ac.m2017a(i))).m2055a(c0848rN, c0850tMo2018a.m1815b(i));
        }
    }
}
