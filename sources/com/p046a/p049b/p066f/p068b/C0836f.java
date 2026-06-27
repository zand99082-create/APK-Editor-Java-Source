package com.p046a.p049b.p066f.p068b;

import com.p046a.p049b.p066f.p069c.C0872n;
import com.p046a.p049b.p066f.p070d.C0887c;

/* JADX INFO: renamed from: com.a.b.f.b.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0836f implements InterfaceC0831ad {

    /* JADX INFO: renamed from: a */
    public static final C0836f f1961a = new C0836f();

    /* JADX INFO: renamed from: b */
    private final boolean f1962b = false;

    static {
        new C0836f(true);
    }

    private C0836f() {
    }

    private C0836f(boolean z) {
    }

    @Override // com.p046a.p049b.p066f.p068b.InterfaceC0831ad
    /* JADX INFO: renamed from: a */
    public final boolean mo1735a(C0853w c0853w, C0848r c0848r, C0848r c0848r2) {
        if (c0848r.mo925a() != C0887c.f2347f) {
            return false;
        }
        if (!(c0848r2.m1796h() instanceof C0872n)) {
            if ((c0848r.m1796h() instanceof C0872n) && c0853w.m1836a() == 15) {
                return ((C0872n) c0848r.m1796h()).m1896l();
            }
            return false;
        }
        C0872n c0872n = (C0872n) c0848r2.m1796h();
        switch (c0853w.m1836a()) {
            case 14:
            case 16:
            case 17:
            case 18:
            case 20:
            case 21:
            case 22:
                return c0872n.m1896l();
            case 15:
                return C0872n.m1891a(-c0872n.mo1894j()).m1896l();
            case 19:
            default:
                return false;
            case 23:
            case 24:
            case 25:
                if (c0872n.mo1893i()) {
                    int iMo1894j = c0872n.mo1894j();
                    if (((byte) iMo1894j) == iMo1894j) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // com.p046a.p049b.p066f.p068b.InterfaceC0831ad
    /* JADX INFO: renamed from: a */
    public final boolean mo1736a(C0853w c0853w, C0850t c0850t) {
        if (this.f1962b || !c0853w.m1840e()) {
            return false;
        }
        int iD_ = c0850t.m2239d_();
        int iM1799k = 0;
        for (int i = 0; i < iD_; i++) {
            iM1799k += c0850t.m1815b(i).m1799k();
        }
        return iM1799k >= 6;
    }
}
