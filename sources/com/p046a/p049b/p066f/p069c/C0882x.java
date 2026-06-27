package com.p046a.p049b.p066f.p069c;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p066f.p070d.C0887c;

/* JADX INFO: renamed from: com.a.b.f.c.x */
/* JADX INFO: loaded from: classes.dex */
public final class C0882x extends AbstractC0875q {

    /* JADX INFO: renamed from: a */
    public static final C0882x f2267a = m1906a((short) 0);

    private C0882x(short s) {
        super(s);
    }

    /* JADX INFO: renamed from: a */
    public static C0882x m1905a(int i) {
        short s = (short) i;
        if (s != i) {
            throw new IllegalArgumentException("bogus short value: " + i);
        }
        return m1906a(s);
    }

    /* JADX INFO: renamed from: a */
    private static C0882x m1906a(short s) {
        return new C0882x(s);
    }

    @Override // com.p046a.p049b.p066f.p070d.InterfaceC0888d
    /* JADX INFO: renamed from: a */
    public final C0887c mo925a() {
        return C0887c.f2349h;
    }

    @Override // com.p046a.p049b.p073h.InterfaceC0971s
    /* JADX INFO: renamed from: d */
    public final String mo919d() {
        return Integer.toString(mo1894j());
    }

    @Override // com.p046a.p049b.p066f.p069c.AbstractC0857a
    /* JADX INFO: renamed from: h */
    public final String mo1866h() {
        return "short";
    }

    public final String toString() {
        int iJ = mo1894j();
        return "short{0x" + C1067a.m2558v(iJ) + " / " + iJ + '}';
    }
}
