package com.p046a.p049b.p065e;

import com.p046a.p049b.p063d.InterfaceC0796c;
import com.p046a.p049b.p063d.p064a.AbstractC0774f;

/* JADX INFO: renamed from: com.a.b.e.p */
/* JADX INFO: loaded from: classes.dex */
final class C0815p implements InterfaceC0796c {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C0814o f1928a;

    private C0815p(C0814o c0814o) {
        this.f1928a = c0814o;
    }

    /* synthetic */ C0815p(C0814o c0814o, byte b2) {
        this(c0814o);
    }

    @Override // com.p046a.p049b.p063d.InterfaceC0796c
    /* JADX INFO: renamed from: a */
    public final void mo1597a(AbstractC0774f abstractC0774f) {
        int iM1671c = this.f1928a.f1924a.m1671c(abstractC0774f.m1561d());
        C0814o.m1688a(abstractC0774f.m1557b() == 27, iM1671c);
        this.f1928a.f1926c[C0814o.m1690b(this.f1928a)] = abstractC0774f.mo1525d(iM1671c);
    }
}
