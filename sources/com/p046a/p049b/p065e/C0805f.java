package com.p046a.p049b.p065e;

import com.p046a.p047a.C0483aa;
import com.p046a.p047a.C0498o;
import com.p046a.p047a.C0503t;
import com.p046a.p047a.C0508y;
import com.p046a.p047a.C0509z;

/* JADX INFO: renamed from: com.a.b.e.f */
/* JADX INFO: loaded from: classes.dex */
final class C0805f extends AbstractC0809j {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C0801b f1887a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0805f(C0801b c0801b, C0498o c0498o) {
        super(c0801b, c0498o);
        this.f1887a = c0801b;
    }

    @Override // com.p046a.p049b.p065e.AbstractC0809j
    /* JADX INFO: renamed from: a */
    final C0483aa mo1636a(C0509z c0509z) {
        return c0509z.f757d;
    }

    @Override // com.p046a.p049b.p065e.AbstractC0809j
    /* JADX INFO: renamed from: a */
    final /* synthetic */ Comparable mo1637a(C0498o c0498o, C0812m c0812m, int i) {
        return c0812m.m1667a(c0498o.m659i());
    }

    @Override // com.p046a.p049b.p065e.AbstractC0809j
    /* JADX INFO: renamed from: a */
    final void mo1638a(int i, C0812m c0812m, int i2, int i3) {
        if (i3 < 0 || i3 > 65535) {
            throw new C0503t("proto ID not in [0, 0xffff]: " + i3);
        }
        c0812m.f1912c[i2] = (short) i3;
    }

    @Override // com.p046a.p049b.p065e.AbstractC0809j
    /* JADX INFO: renamed from: a */
    final /* synthetic */ void mo1639a(Comparable comparable) {
        ((C0508y) comparable).m699a(this.f1887a.f1866g);
    }
}
