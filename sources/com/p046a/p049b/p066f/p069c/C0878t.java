package com.p046a.p049b.p066f.p069c;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p066f.p070d.C0887c;

/* JADX INFO: renamed from: com.a.b.f.c.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0878t extends AbstractC0876r {

    /* JADX INFO: renamed from: a */
    public static final C0878t f2260a = m1897a(0);

    /* JADX INFO: renamed from: b */
    public static final C0878t f2261b = m1897a(1);

    private C0878t(long j) {
        super(j);
    }

    /* JADX INFO: renamed from: a */
    public static C0878t m1897a(long j) {
        return new C0878t(j);
    }

    @Override // com.p046a.p049b.p066f.p070d.InterfaceC0888d
    /* JADX INFO: renamed from: a */
    public final C0887c mo925a() {
        return C0887c.f2348g;
    }

    @Override // com.p046a.p049b.p073h.InterfaceC0971s
    /* JADX INFO: renamed from: d */
    public final String mo919d() {
        return Long.toString(mo1895k());
    }

    @Override // com.p046a.p049b.p066f.p069c.AbstractC0857a
    /* JADX INFO: renamed from: h */
    public final String mo1866h() {
        return "long";
    }

    public final String toString() {
        long jK = mo1895k();
        return "long{0x" + C1067a.m2455a(jK) + " / " + jK + '}';
    }
}
