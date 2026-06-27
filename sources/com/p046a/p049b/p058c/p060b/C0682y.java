package com.p046a.p049b.p058c.p060b;

import com.p046a.p049b.p066f.p068b.C0850t;
import com.p046a.p049b.p066f.p068b.C0856z;
import com.p046a.p049b.p073h.C0970r;

/* JADX INFO: renamed from: com.a.b.c.b.y */
/* JADX INFO: loaded from: classes.dex */
public final class C0682y extends AbstractC0657am {
    public C0682y(C0856z c0856z) {
        super(c0856z, C0850t.f2003a);
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0669l
    /* JADX INFO: renamed from: a */
    public final int mo1102a() {
        return m1222g() & 1;
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0669l
    /* JADX INFO: renamed from: a */
    public final AbstractC0669l mo1103a(C0850t c0850t) {
        return new C0682y(m1224i());
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0669l
    /* JADX INFO: renamed from: a */
    protected final String mo1104a(boolean z) {
        if ((m1222g() & 1) == 0) {
            return null;
        }
        return "nop // spacer";
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0669l
    /* JADX INFO: renamed from: a */
    public final void mo1105a(C0970r c0970r) {
        if ((m1222g() & 1) != 0) {
            c0970r.m2280b(AbstractC0675r.m1251a(0, 0));
        }
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0669l
    /* JADX INFO: renamed from: b */
    protected final String mo1106b() {
        return null;
    }
}
