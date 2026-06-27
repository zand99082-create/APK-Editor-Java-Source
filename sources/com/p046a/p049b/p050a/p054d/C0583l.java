package com.p046a.p049b.p050a.p054d;

import com.p046a.p049b.p050a.p055e.InterfaceC0597j;
import com.p046a.p049b.p066f.p069c.C0858aa;
import com.p046a.p049b.p066f.p069c.C0884z;
import com.p046a.p049b.p066f.p070d.C0887c;
import com.p046a.p049b.p066f.p070d.InterfaceC0889e;
import com.p046a.p049b.p073h.C0955c;

/* JADX INFO: renamed from: com.a.b.a.d.l */
/* JADX INFO: loaded from: classes.dex */
final class C0583l implements InterfaceC0889e {

    /* JADX INFO: renamed from: a */
    private final C0955c f970a;

    /* JADX INFO: renamed from: b */
    private final int f971b;

    /* JADX INFO: renamed from: c */
    private final C0858aa f972c;

    public C0583l(C0955c c0955c, int i, int i2, C0858aa c0858aa, InterfaceC0597j interfaceC0597j) {
        if (i2 < 0) {
            throw new IllegalArgumentException("size < 0");
        }
        C0955c c0955cM2221a = c0955c.m2221a(i, (i2 << 1) + i);
        this.f970a = c0955cM2221a;
        this.f971b = i2;
        this.f972c = c0858aa;
        for (int i3 = 0; i3 < i2; i3++) {
            try {
                C0884z c0884z = (C0884z) c0858aa.mo1869a(c0955cM2221a.m2228f(i3 << 1));
                if (interfaceC0597j != null) {
                    new StringBuilder("  ").append(c0884z);
                }
            } catch (ClassCastException e) {
                throw new RuntimeException("bogus class cpi", e);
            }
        }
    }

    @Override // com.p046a.p049b.p066f.p070d.InterfaceC0889e
    /* JADX INFO: renamed from: a */
    public final C0887c mo1018a(int i) {
        return ((C0884z) this.f972c.mo1869a(this.f970a.m2228f(i << 1))).m1917i();
    }

    @Override // com.p046a.p049b.p066f.p070d.InterfaceC0889e
    /* JADX INFO: renamed from: a */
    public final InterfaceC0889e mo1019a(C0887c c0887c) {
        throw new UnsupportedOperationException("unsupported");
    }

    @Override // com.p046a.p049b.p066f.p070d.InterfaceC0889e
    /* JADX INFO: renamed from: c_ */
    public final boolean mo1020c_() {
        return false;
    }

    @Override // com.p046a.p049b.p066f.p070d.InterfaceC0889e
    /* JADX INFO: renamed from: d_ */
    public final int mo1021d_() {
        return this.f971b;
    }
}
