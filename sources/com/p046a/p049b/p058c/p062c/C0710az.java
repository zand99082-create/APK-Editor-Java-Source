package com.p046a.p049b.p058c.p062c;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p066f.p069c.C0883y;
import com.p046a.p049b.p066f.p069c.C0884z;
import com.p046a.p049b.p073h.C0970r;

/* JADX INFO: renamed from: com.a.b.c.c.az */
/* JADX INFO: loaded from: classes.dex */
public final class C0710az extends AbstractC0686ab {
    public C0710az(C0884z c0884z) {
        super(c0884z);
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0688ad
    /* JADX INFO: renamed from: a */
    public final EnumC0689ae mo1302a() {
        return EnumC0689ae.f1379c;
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0686ab, com.p046a.p049b.p058c.p062c.AbstractC0688ad
    /* JADX INFO: renamed from: a */
    public final void mo1304a(C0732r c0732r) {
        c0732r.m1488h().m1375a(m1310d().m1918j());
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0688ad
    /* JADX INFO: renamed from: a */
    public final void mo1315a(C0732r c0732r, C0970r c0970r) {
        C0883y c0883yM1918j = m1310d().m1918j();
        int iM1376b = c0732r.m1488h().m1376b(c0883yM1918j);
        if (c0970r.m2281b()) {
            c0970r.m2272a(0, m1314j() + ' ' + c0883yM1918j.mo919d());
            c0970r.m2272a(4, "  descriptor_idx: " + C1067a.m2556t(iM1376b));
        }
        c0970r.m2282c(iM1376b);
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0688ad
    /* JADX INFO: renamed from: e_ */
    public final int mo1316e_() {
        return 4;
    }
}
