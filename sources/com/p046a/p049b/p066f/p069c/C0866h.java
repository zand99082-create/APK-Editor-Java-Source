package com.p046a.p049b.p066f.p069c;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p066f.p070d.C0887c;

/* JADX INFO: renamed from: com.a.b.f.c.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0866h extends AbstractC0875q {

    /* JADX INFO: renamed from: a */
    public static final C0866h f2240a = m1883a((byte) 0);

    private C0866h(byte b2) {
        super(b2);
    }

    /* JADX INFO: renamed from: a */
    private static C0866h m1883a(byte b2) {
        return new C0866h(b2);
    }

    /* JADX INFO: renamed from: a */
    public static C0866h m1884a(int i) {
        byte b2 = (byte) i;
        if (b2 != i) {
            throw new IllegalArgumentException("bogus byte value: " + i);
        }
        return m1883a(b2);
    }

    @Override // com.p046a.p049b.p066f.p070d.InterfaceC0888d
    /* JADX INFO: renamed from: a */
    public final C0887c mo925a() {
        return C0887c.f2343b;
    }

    @Override // com.p046a.p049b.p073h.InterfaceC0971s
    /* JADX INFO: renamed from: d */
    public final String mo919d() {
        return Integer.toString(mo1894j());
    }

    @Override // com.p046a.p049b.p066f.p069c.AbstractC0857a
    /* JADX INFO: renamed from: h */
    public final String mo1866h() {
        return "byte";
    }

    public final String toString() {
        int iJ = mo1894j();
        return "byte{0x" + C1067a.m2560x(iJ) + " / " + iJ + '}';
    }
}
