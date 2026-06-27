package com.p046a.p049b.p050a.p051a;

import com.p046a.p049b.p050a.p055e.AbstractC0588a;
import com.p046a.p049b.p066f.p070d.InterfaceC0889e;
import com.p046a.p049b.p073h.C0969q;

/* JADX INFO: renamed from: com.a.b.a.a.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0515f extends AbstractC0588a {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0889e f790a;

    public C0515f(InterfaceC0889e interfaceC0889e) {
        super("Exceptions");
        try {
            if (interfaceC0889e.mo1020c_()) {
                throw new C0969q("exceptions.isMutable()");
            }
            this.f790a = interfaceC0889e;
        } catch (NullPointerException e) {
            throw new NullPointerException("exceptions == null");
        }
    }

    @Override // com.p046a.p049b.p050a.p055e.AbstractC0588a
    /* JADX INFO: renamed from: a */
    public final int mo705a() {
        return (this.f790a.mo1021d_() << 1) + 8;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC0889e m715b() {
        return this.f790a;
    }
}
