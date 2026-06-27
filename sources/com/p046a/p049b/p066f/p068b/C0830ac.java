package com.p046a.p049b.p066f.p068b;

import com.p046a.p049b.p066f.p070d.C0887c;
import com.p046a.p049b.p066f.p070d.InterfaceC0889e;

/* JADX INFO: renamed from: com.a.b.f.b.ac */
/* JADX INFO: loaded from: classes.dex */
public final class C0830ac extends AbstractC0839i {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0889e f1957a;

    public C0830ac(C0853w c0853w, C0856z c0856z, C0850t c0850t, InterfaceC0889e interfaceC0889e) {
        super(c0853w, c0856z, null, c0850t);
        if (c0853w.m1839d() != 6) {
            throw new IllegalArgumentException("bogus branchingness");
        }
        if (interfaceC0889e == null) {
            throw new NullPointerException("catches == null");
        }
        this.f1957a = interfaceC0889e;
    }

    /* JADX INFO: renamed from: a */
    public static String m1734a(InterfaceC0889e interfaceC0889e) {
        StringBuffer stringBuffer = new StringBuffer(100);
        stringBuffer.append("catch");
        int iMo1021d_ = interfaceC0889e.mo1021d_();
        for (int i = 0; i < iMo1021d_; i++) {
            stringBuffer.append(" ");
            stringBuffer.append(interfaceC0889e.mo1018a(i).mo919d());
        }
        return stringBuffer.toString();
    }

    @Override // com.p046a.p049b.p066f.p068b.AbstractC0839i
    /* JADX INFO: renamed from: a */
    public final AbstractC0839i mo1727a(C0848r c0848r, C0850t c0850t) {
        return new C0830ac(m1752f(), m1753g(), c0850t, this.f1957a);
    }

    @Override // com.p046a.p049b.p066f.p068b.AbstractC0839i
    /* JADX INFO: renamed from: a */
    public final AbstractC0839i mo1728a(C0887c c0887c) {
        return new C0830ac(m1752f(), m1753g(), m1756j(), this.f1957a.mo1019a(c0887c));
    }

    @Override // com.p046a.p049b.p066f.p068b.AbstractC0839i
    /* JADX INFO: renamed from: a */
    public final String mo1729a() {
        return m1734a(this.f1957a);
    }

    @Override // com.p046a.p049b.p066f.p068b.AbstractC0839i
    /* JADX INFO: renamed from: a */
    public final void mo1730a(InterfaceC0841k interfaceC0841k) {
        interfaceC0841k.mo1155a(this);
    }

    @Override // com.p046a.p049b.p066f.p068b.AbstractC0839i
    /* JADX INFO: renamed from: b */
    public final InterfaceC0889e mo1732b() {
        return this.f1957a;
    }
}
