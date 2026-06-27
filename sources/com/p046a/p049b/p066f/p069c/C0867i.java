package com.p046a.p049b.p066f.p069c;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p066f.p070d.C0887c;

/* JADX INFO: renamed from: com.a.b.f.c.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0867i extends AbstractC0875q {

    /* JADX INFO: renamed from: a */
    public static final C0867i f2241a = m1885a((char) 0);

    private C0867i(char c) {
        super(c);
    }

    /* JADX INFO: renamed from: a */
    private static C0867i m1885a(char c) {
        return new C0867i(c);
    }

    /* JADX INFO: renamed from: a */
    public static C0867i m1886a(int i) {
        char c = (char) i;
        if (c != i) {
            throw new IllegalArgumentException("bogus char value: " + i);
        }
        return m1885a(c);
    }

    @Override // com.p046a.p049b.p066f.p070d.InterfaceC0888d
    /* JADX INFO: renamed from: a */
    public final C0887c mo925a() {
        return C0887c.f2344c;
    }

    @Override // com.p046a.p049b.p073h.InterfaceC0971s
    /* JADX INFO: renamed from: d */
    public final String mo919d() {
        return Integer.toString(mo1894j());
    }

    @Override // com.p046a.p049b.p066f.p069c.AbstractC0857a
    /* JADX INFO: renamed from: h */
    public final String mo1866h() {
        return "char";
    }

    public final String toString() {
        int iJ = mo1894j();
        return "char{0x" + C1067a.m2558v(iJ) + " / " + iJ + '}';
    }
}
