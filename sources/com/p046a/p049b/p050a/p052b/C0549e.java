package com.p046a.p049b.p050a.p052b;

import com.p046a.p049b.p066f.p069c.C0884z;
import com.p046a.p049b.p066f.p070d.C0886b;
import com.p046a.p049b.p066f.p070d.InterfaceC0889e;
import com.p046a.p049b.p073h.C0959g;

/* JADX INFO: renamed from: com.a.b.a.b.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0549e extends C0959g {

    /* JADX INFO: renamed from: a */
    public static final C0549e f877a = new C0549e(0);

    public C0549e(int i) {
        super(i);
    }

    /* JADX INFO: renamed from: a */
    public final C0550f m828a(int i) {
        return (C0550f) m2240e(i);
    }

    /* JADX INFO: renamed from: a */
    public final void m829a(int i, int i2, int i3, int i4, C0884z c0884z) {
        m2237a(i, new C0550f(i2, i3, i4, c0884z));
    }

    /* JADX INFO: renamed from: a_ */
    public final InterfaceC0889e m830a_() {
        int iD_ = m2239d_();
        if (iD_ == 0) {
            return C0886b.f2306a;
        }
        C0886b c0886b = new C0886b(iD_);
        for (int i = 0; i < iD_; i++) {
            c0886b.m1937a(i, m828a(i).m836d().m1917i());
        }
        c0886b.mo811b_();
        return c0886b;
    }

    /* JADX INFO: renamed from: b */
    public final C0549e m831b(int i) {
        boolean z;
        int iD_ = m2239d_();
        C0550f[] c0550fArr = new C0550f[iD_];
        int i2 = 0;
        for (int i3 = 0; i3 < iD_; i3++) {
            C0550f c0550fM828a = m828a(i3);
            if (c0550fM828a.m833a(i)) {
                C0884z c0884zM836d = c0550fM828a.m836d();
                for (int i4 = 0; i4 < i2; i4++) {
                    C0884z c0884zM836d2 = c0550fArr[i4].m836d();
                    if (c0884zM836d2 == c0884zM836d || c0884zM836d2 == C0884z.f2270a) {
                        z = false;
                        break;
                    }
                }
                z = true;
                if (z) {
                    c0550fArr[i2] = c0550fM828a;
                    i2++;
                }
            }
        }
        if (i2 == 0) {
            return f877a;
        }
        C0549e c0549e = new C0549e(i2);
        for (int i5 = 0; i5 < i2; i5++) {
            C0550f c0550f = c0550fArr[i5];
            if (c0550f == null) {
                throw new NullPointerException("item == null");
            }
            c0549e.m2237a(i5, c0550f);
        }
        c0549e.mo811b_();
        return c0549e;
    }
}
