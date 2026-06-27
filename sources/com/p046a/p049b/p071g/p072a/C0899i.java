package com.p046a.p049b.p071g.p072a;

import com.p046a.p049b.p071g.C0931e;
import com.p046a.p049b.p073h.InterfaceC0963k;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.a.b.g.a.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0899i {

    /* JADX INFO: renamed from: a */
    private final ArrayList f2396a;

    public C0899i(int i) {
        this.f2396a = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.f2396a.add(C0931e.m2154a(i));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1999a(int i, int i2) {
        int iMax = Math.max(i, i2) + 1;
        this.f2396a.ensureCapacity(iMax);
        for (int size = this.f2396a.size(); size < iMax; size++) {
            this.f2396a.add(C0931e.m2154a(iMax));
        }
        ((InterfaceC0963k) this.f2396a.get(i)).mo2206a(i2);
        ((InterfaceC0963k) this.f2396a.get(i2)).mo2206a(i);
    }

    /* JADX INFO: renamed from: a */
    public final void m2000a(int i, InterfaceC0963k interfaceC0963k) {
        if (i < this.f2396a.size()) {
            interfaceC0963k.mo2207a((InterfaceC0963k) this.f2396a.get(i));
        }
    }
}
