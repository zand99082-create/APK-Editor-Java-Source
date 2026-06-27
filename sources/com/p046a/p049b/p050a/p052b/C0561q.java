package com.p046a.p049b.p050a.p052b;

import com.p046a.p049b.p066f.p069c.C0883y;
import com.p046a.p049b.p073h.C0959g;

/* JADX INFO: renamed from: com.a.b.a.b.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0561q extends C0959g {

    /* JADX INFO: renamed from: a */
    public static final C0561q f906a = new C0561q(0);

    public C0561q(int i) {
        super(i);
    }

    /* JADX INFO: renamed from: a */
    public static C0561q m893a(C0561q c0561q, C0561q c0561q2) {
        if (c0561q == f906a) {
            return c0561q2;
        }
        int iD_ = c0561q.m2239d_();
        int iD_2 = c0561q2.m2239d_();
        C0561q c0561q3 = new C0561q(iD_ + iD_2);
        for (int i = 0; i < iD_; i++) {
            c0561q3.m895a(i, c0561q.m894a(i));
        }
        for (int i2 = 0; i2 < iD_2; i2++) {
            c0561q3.m895a(iD_ + i2, c0561q2.m894a(i2));
        }
        c0561q3.mo811b_();
        return c0561q3;
    }

    /* JADX INFO: renamed from: a */
    private C0562r m894a(int i) {
        return (C0562r) m2240e(i);
    }

    /* JADX INFO: renamed from: a */
    private void m895a(int i, C0562r c0562r) {
        if (c0562r == null) {
            throw new NullPointerException("item == null");
        }
        m2237a(i, (Object) c0562r);
    }

    /* JADX INFO: renamed from: b */
    public static C0561q m896b(C0561q c0561q, C0561q c0561q2) {
        C0562r c0562r;
        int iD_ = c0561q.m2239d_();
        C0561q c0561q3 = new C0561q(iD_);
        for (int i = 0; i < iD_; i++) {
            C0562r c0562rM894a = c0561q.m894a(i);
            int iD_2 = c0561q2.m2239d_();
            int i2 = 0;
            while (true) {
                if (i2 >= iD_2) {
                    c0562r = null;
                    break;
                }
                c0562r = (C0562r) c0561q2.m2240e(i2);
                if (c0562r != null && c0562r.m903a(c0562rM894a)) {
                    break;
                }
                i2++;
            }
            c0561q3.m895a(i, c0562r != null ? c0562rM894a.m900a(c0562r.f911e) : c0562rM894a);
        }
        c0561q3.mo811b_();
        return c0561q3;
    }

    /* JADX INFO: renamed from: a */
    public final C0562r m897a(int i, int i2) {
        int iD_ = m2239d_();
        for (int i3 = 0; i3 < iD_; i3++) {
            C0562r c0562r = (C0562r) m2240e(i3);
            if (c0562r != null && c0562r.m902a(i, i2)) {
                return c0562r;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m898a(int i, int i2, int i3, C0883y c0883y, C0883y c0883y2, C0883y c0883y3, int i4) {
        m2237a(i, (Object) new C0562r(i2, i3, c0883y, c0883y2, c0883y3, i4));
    }
}
