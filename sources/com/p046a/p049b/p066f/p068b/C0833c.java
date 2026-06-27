package com.p046a.p049b.p066f.p068b;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p073h.C0965m;
import com.p046a.p049b.p073h.InterfaceC0964l;

/* JADX INFO: renamed from: com.a.b.f.b.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0833c extends C0965m {

    /* JADX INFO: renamed from: a */
    private int f1958a;

    public C0833c(int i) {
        super(i);
        this.f1958a = -1;
    }

    private C0833c(C0833c c0833c) {
        super(c0833c);
        this.f1958a = c0833c.f1958a;
    }

    /* JADX INFO: renamed from: a */
    public final C0827a m1737a(int i) {
        return (C0827a) m2240e(i);
    }

    /* JADX INFO: renamed from: a */
    public final void m1738a(int i, C0827a c0827a) {
        super.m2261a(i, (InterfaceC0964l) c0827a);
        this.f1958a = -1;
    }

    /* JADX INFO: renamed from: a */
    public final void m1739a(InterfaceC0841k interfaceC0841k) {
        int iD_ = m2239d_();
        for (int i = 0; i < iD_; i++) {
            m1737a(i).m1719b().m1761a(interfaceC0841k);
        }
    }

    /* JADX INFO: renamed from: b */
    public final C0827a m1740b(int i) {
        int iC = m2262c(i);
        if (iC < 0) {
            throw new IllegalArgumentException("no such label: " + C1067a.m2558v(i));
        }
        return m1737a(iC);
    }

    /* JADX INFO: renamed from: e */
    public final int m1741e() {
        if (this.f1958a == -1) {
            C0834d c0834d = new C0834d();
            m1739a(c0834d);
            this.f1958a = c0834d.m1747a();
        }
        return this.f1958a;
    }

    /* JADX INFO: renamed from: f */
    public final int m1742f() {
        int iD_ = m2239d_();
        int i = 0;
        int iD_2 = 0;
        while (i < iD_) {
            C0827a c0827a = (C0827a) m2241f(i);
            i++;
            iD_2 = c0827a != null ? c0827a.m1719b().m2239d_() + iD_2 : iD_2;
        }
        return iD_2;
    }

    /* JADX INFO: renamed from: g */
    public final int m1743g() {
        int i;
        int iD_ = m2239d_();
        int i2 = 0;
        int i3 = 0;
        while (i2 < iD_) {
            C0827a c0827a = (C0827a) m2241f(i2);
            if (c0827a != null) {
                C0842l c0842lM1719b = c0827a.m1719b();
                int iD_2 = c0842lM1719b.m2239d_();
                i = i3;
                for (int i4 = 0; i4 < iD_2; i4++) {
                    if (c0842lM1719b.m1759a(i4).m1752f().m1836a() != 54) {
                        i++;
                    }
                }
            } else {
                i = i3;
            }
            i2++;
            i3 = i;
        }
        return i3;
    }

    /* JADX INFO: renamed from: h */
    public final C0833c m1744h() {
        return new C0833c(this);
    }
}
