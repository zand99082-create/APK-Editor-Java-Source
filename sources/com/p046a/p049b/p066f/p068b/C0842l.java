package com.p046a.p049b.p066f.p068b;

import com.p046a.p049b.p073h.C0959g;

/* JADX INFO: renamed from: com.a.b.f.b.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0842l extends C0959g {
    public C0842l(int i) {
        super(i);
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC0839i m1759a(int i) {
        return (AbstractC0839i) m2240e(i);
    }

    /* JADX INFO: renamed from: a */
    public final void m1760a(int i, AbstractC0839i abstractC0839i) {
        m2237a(i, (Object) abstractC0839i);
    }

    /* JADX INFO: renamed from: a */
    public final void m1761a(InterfaceC0841k interfaceC0841k) {
        int iD_ = m2239d_();
        for (int i = 0; i < iD_; i++) {
            m1759a(i).mo1730a(interfaceC0841k);
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1762a(C0842l c0842l) {
        int iD_;
        if (c0842l == null || (iD_ = m2239d_()) != c0842l.m2239d_()) {
            return false;
        }
        for (int i = 0; i < iD_; i++) {
            if (!m1759a(i).mo1731a(c0842l.m1759a(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC0839i m1763e() {
        return m1759a(m2239d_() - 1);
    }
}
