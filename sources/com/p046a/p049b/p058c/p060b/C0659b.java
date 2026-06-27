package com.p046a.p049b.p058c.p060b;

import com.p046a.p049b.p066f.p068b.C0827a;
import com.p046a.p049b.p066f.p068b.C0833c;
import com.p046a.p049b.p066f.p068b.C0854x;
import com.p046a.p049b.p066f.p068b.C0856z;

/* JADX INFO: renamed from: com.a.b.c.b.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0659b {

    /* JADX INFO: renamed from: a */
    private final C0665h[] f1098a;

    /* JADX INFO: renamed from: b */
    private final C0665h[] f1099b;

    /* JADX INFO: renamed from: c */
    private final C0665h[] f1100c;

    public C0659b(C0854x c0854x) {
        int iJ = c0854x.m1844a().m2263j();
        this.f1098a = new C0665h[iJ];
        this.f1099b = new C0665h[iJ];
        this.f1100c = new C0665h[iJ];
        m1177a(c0854x);
    }

    /* JADX INFO: renamed from: a */
    private void m1177a(C0854x c0854x) {
        C0833c c0833cM1844a = c0854x.m1844a();
        int iD_ = c0833cM1844a.m2239d_();
        for (int i = 0; i < iD_; i++) {
            C0827a c0827aM1737a = c0833cM1844a.m1737a(i);
            int iMo821a = c0827aM1737a.mo821a();
            this.f1098a[iMo821a] = new C0665h(c0827aM1737a.m1719b().m1759a(0).m1753g());
            C0856z c0856zM1753g = c0827aM1737a.m1724g().m1753g();
            this.f1099b[iMo821a] = new C0665h(c0856zM1753g);
            this.f1100c[iMo821a] = new C0665h(c0856zM1753g);
        }
    }

    /* JADX INFO: renamed from: a */
    public final C0665h m1178a(int i) {
        return this.f1098a[i];
    }

    /* JADX INFO: renamed from: a */
    public final C0665h m1179a(C0827a c0827a) {
        return this.f1098a[c0827a.mo821a()];
    }

    /* JADX INFO: renamed from: b */
    public final C0665h m1180b(C0827a c0827a) {
        return this.f1099b[c0827a.mo821a()];
    }

    /* JADX INFO: renamed from: c */
    public final C0665h m1181c(C0827a c0827a) {
        return this.f1100c[c0827a.mo821a()];
    }
}
