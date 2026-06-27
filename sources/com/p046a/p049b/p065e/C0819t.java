package com.p046a.p049b.p065e;

import com.p046a.p049b.p063d.InterfaceC0796c;
import com.p046a.p049b.p063d.p064a.AbstractC0774f;

/* JADX INFO: renamed from: com.a.b.e.t */
/* JADX INFO: loaded from: classes.dex */
final class C0819t implements InterfaceC0796c {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C0814o f1932a;

    private C0819t(C0814o c0814o) {
        this.f1932a = c0814o;
    }

    /* synthetic */ C0819t(C0814o c0814o, byte b2) {
        this(c0814o);
    }

    @Override // com.p046a.p049b.p063d.InterfaceC0796c
    /* JADX INFO: renamed from: a */
    public final void mo1597a(AbstractC0774f abstractC0774f) {
        int iM1669b = this.f1932a.f1924a.m1669b(abstractC0774f.m1561d());
        C0814o.m1688a(abstractC0774f.m1557b() == 27, iM1669b);
        this.f1932a.f1926c[C0814o.m1690b(this.f1932a)] = abstractC0774f.mo1525d(iM1669b);
    }
}
