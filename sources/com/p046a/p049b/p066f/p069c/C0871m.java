package com.p046a.p049b.p066f.p069c;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p066f.p070d.C0887c;

/* JADX INFO: renamed from: com.a.b.f.c.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0871m extends AbstractC0875q {

    /* JADX INFO: renamed from: a */
    public static final C0871m f2245a = m1890a(Float.floatToIntBits(0.0f));

    /* JADX INFO: renamed from: b */
    public static final C0871m f2246b = m1890a(Float.floatToIntBits(1.0f));

    /* JADX INFO: renamed from: c */
    public static final C0871m f2247c = m1890a(Float.floatToIntBits(2.0f));

    private C0871m(int i) {
        super(i);
    }

    /* JADX INFO: renamed from: a */
    public static C0871m m1890a(int i) {
        return new C0871m(i);
    }

    @Override // com.p046a.p049b.p066f.p070d.InterfaceC0888d
    /* JADX INFO: renamed from: a */
    public final C0887c mo925a() {
        return C0887c.f2346e;
    }

    @Override // com.p046a.p049b.p073h.InterfaceC0971s
    /* JADX INFO: renamed from: d */
    public final String mo919d() {
        return Float.toString(Float.intBitsToFloat(mo1894j()));
    }

    @Override // com.p046a.p049b.p066f.p069c.AbstractC0857a
    /* JADX INFO: renamed from: h */
    public final String mo1866h() {
        return "float";
    }

    public final String toString() {
        int iJ = mo1894j();
        return "float{0x" + C1067a.m2556t(iJ) + " / " + Float.intBitsToFloat(iJ) + '}';
    }
}
