package com.p046a.p049b.p050a.p055e;

import com.p046a.p049b.p073h.C0959g;

/* JADX INFO: renamed from: com.a.b.a.e.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0598k extends C0959g implements InterfaceC0589b {
    public C0598k(int i) {
        super(i);
    }

    /* JADX INFO: renamed from: a */
    private AbstractC0588a m1057a(int i) {
        return (AbstractC0588a) m2240e(i);
    }

    @Override // com.p046a.p049b.p050a.p055e.InterfaceC0589b
    /* JADX INFO: renamed from: a */
    public final AbstractC0588a mo1046a(AbstractC0588a abstractC0588a) {
        int iD_ = m2239d_();
        for (int i = 0; i < iD_; i++) {
            if (m1057a(i) == abstractC0588a) {
                String strM1045g = abstractC0588a.m1045g();
                for (int i2 = i + 1; i2 < iD_; i2++) {
                    AbstractC0588a abstractC0588aM1057a = m1057a(i2);
                    if (abstractC0588aM1057a.m1045g().equals(strM1045g)) {
                        return abstractC0588aM1057a;
                    }
                }
                return null;
            }
        }
        return null;
    }

    @Override // com.p046a.p049b.p050a.p055e.InterfaceC0589b
    /* JADX INFO: renamed from: a */
    public final AbstractC0588a mo1047a(String str) {
        int iD_ = m2239d_();
        for (int i = 0; i < iD_; i++) {
            AbstractC0588a abstractC0588aM1057a = m1057a(i);
            if (abstractC0588aM1057a.m1045g().equals(str)) {
                return abstractC0588aM1057a;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m1058a(int i, AbstractC0588a abstractC0588a) {
        m2237a(i, (Object) abstractC0588a);
    }

    @Override // com.p046a.p049b.p050a.p055e.InterfaceC0589b
    /* JADX INFO: renamed from: b */
    public final int mo1048b() {
        int iD_ = m2239d_();
        int iMo705a = 2;
        for (int i = 0; i < iD_; i++) {
            iMo705a += m1057a(i).mo705a();
        }
        return iMo705a;
    }
}
