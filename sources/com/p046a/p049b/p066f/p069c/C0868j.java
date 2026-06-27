package com.p046a.p049b.p066f.p069c;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p066f.p070d.C0887c;

/* JADX INFO: renamed from: com.a.b.f.c.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0868j extends AbstractC0876r {

    /* JADX INFO: renamed from: a */
    public static final C0868j f2242a = new C0868j(Double.doubleToLongBits(0.0d));

    /* JADX INFO: renamed from: b */
    public static final C0868j f2243b = new C0868j(Double.doubleToLongBits(1.0d));

    private C0868j(long j) {
        super(j);
    }

    /* JADX INFO: renamed from: a */
    public static C0868j m1887a(long j) {
        return new C0868j(j);
    }

    @Override // com.p046a.p049b.p066f.p070d.InterfaceC0888d
    /* JADX INFO: renamed from: a */
    public final C0887c mo925a() {
        return C0887c.f2345d;
    }

    @Override // com.p046a.p049b.p073h.InterfaceC0971s
    /* JADX INFO: renamed from: d */
    public final String mo919d() {
        return Double.toString(Double.longBitsToDouble(mo1895k()));
    }

    @Override // com.p046a.p049b.p066f.p069c.AbstractC0857a
    /* JADX INFO: renamed from: h */
    public final String mo1866h() {
        return "double";
    }

    public final String toString() {
        long jK = mo1895k();
        return "double{0x" + C1067a.m2455a(jK) + " / " + Double.longBitsToDouble(jK) + '}';
    }
}
