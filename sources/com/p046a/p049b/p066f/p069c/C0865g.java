package com.p046a.p049b.p066f.p069c;

import com.p046a.p049b.p066f.p070d.C0887c;

/* JADX INFO: renamed from: com.a.b.f.c.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0865g extends AbstractC0875q {

    /* JADX INFO: renamed from: a */
    public static final C0865g f2238a = new C0865g(false);

    /* JADX INFO: renamed from: b */
    private static C0865g f2239b = new C0865g(true);

    private C0865g(boolean z) {
        super(z ? 1 : 0);
    }

    /* JADX INFO: renamed from: a */
    public static C0865g m1881a(int i) {
        if (i == 0) {
            return f2238a;
        }
        if (i == 1) {
            return f2239b;
        }
        throw new IllegalArgumentException("bogus value: " + i);
    }

    /* JADX INFO: renamed from: m */
    private boolean m1882m() {
        return mo1894j() != 0;
    }

    @Override // com.p046a.p049b.p066f.p070d.InterfaceC0888d
    /* JADX INFO: renamed from: a */
    public final C0887c mo925a() {
        return C0887c.f2342a;
    }

    @Override // com.p046a.p049b.p073h.InterfaceC0971s
    /* JADX INFO: renamed from: d */
    public final String mo919d() {
        return m1882m() ? "true" : "false";
    }

    @Override // com.p046a.p049b.p066f.p069c.AbstractC0857a
    /* JADX INFO: renamed from: h */
    public final String mo1866h() {
        return "boolean";
    }

    public final String toString() {
        return m1882m() ? "boolean{true}" : "boolean{false}";
    }
}
