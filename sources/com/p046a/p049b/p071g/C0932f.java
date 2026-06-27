package com.p046a.p049b.p071g;

import com.p046a.p049b.p066f.p068b.C0848r;
import java.util.BitSet;

/* JADX INFO: renamed from: com.a.b.g.f */
/* JADX INFO: loaded from: classes.dex */
final class C0932f implements InterfaceC0919am {

    /* JADX INFO: renamed from: a */
    private BitSet f2499a;

    public C0932f(BitSet bitSet) {
        this.f2499a = bitSet;
    }

    @Override // com.p046a.p049b.p071g.InterfaceC0919am
    /* JADX INFO: renamed from: a */
    public final void mo1990a(C0909ac c0909ac) {
        if (C0931e.m2161b(c0909ac)) {
            return;
        }
        this.f2499a.set(c0909ac.m2093n().m1795g());
    }

    @Override // com.p046a.p049b.p071g.InterfaceC0919am
    /* JADX INFO: renamed from: a */
    public final void mo1991a(C0952z c0952z) {
        if (C0931e.m2161b(c0952z)) {
            return;
        }
        this.f2499a.set(c0952z.m2093n().m1795g());
    }

    @Override // com.p046a.p049b.p071g.InterfaceC0919am
    /* JADX INFO: renamed from: b */
    public final void mo1992b(C0952z c0952z) {
        C0848r c0848rN = c0952z.m2093n();
        if (C0931e.m2161b(c0952z) || c0848rN == null) {
            return;
        }
        this.f2499a.set(c0848rN.m1795g());
    }
}
