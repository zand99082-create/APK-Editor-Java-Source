package com.p046a.p049b.p050a.p052b;

import com.p046a.p049b.p073h.C0959g;

/* JADX INFO: renamed from: com.a.b.a.b.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0559o extends C0959g {

    /* JADX INFO: renamed from: a */
    public static final C0559o f903a = new C0559o(0);

    public C0559o(int i) {
        super(i);
    }

    /* JADX INFO: renamed from: a */
    public static C0559o m886a(C0559o c0559o, C0559o c0559o2) {
        if (c0559o == f903a) {
            return c0559o2;
        }
        int iD_ = c0559o.m2239d_();
        int iD_2 = c0559o2.m2239d_();
        C0559o c0559o3 = new C0559o(iD_ + iD_2);
        for (int i = 0; i < iD_; i++) {
            c0559o3.m887a(i, c0559o.m888b(i));
        }
        for (int i2 = 0; i2 < iD_2; i2++) {
            c0559o3.m887a(iD_ + i2, c0559o2.m888b(i2));
        }
        return c0559o3;
    }

    /* JADX INFO: renamed from: a */
    private void m887a(int i, C0560p c0560p) {
        if (c0560p == null) {
            throw new NullPointerException("item == null");
        }
        m2237a(i, (Object) c0560p);
    }

    /* JADX INFO: renamed from: b */
    private C0560p m888b(int i) {
        return (C0560p) m2240e(i);
    }

    /* JADX INFO: renamed from: a */
    public final int m889a(int i) {
        int iD_ = m2239d_();
        int i2 = 0;
        int i3 = -1;
        int iM892b = -1;
        while (i2 < iD_) {
            C0560p c0560pM888b = m888b(i2);
            int iM891a = c0560pM888b.m891a();
            if (iM891a <= i && iM891a > i3) {
                iM892b = c0560pM888b.m892b();
                if (iM891a == i) {
                    break;
                }
            } else {
                iM891a = i3;
            }
            i2++;
            i3 = iM891a;
        }
        return iM892b;
    }

    /* JADX INFO: renamed from: a */
    public final void m890a(int i, int i2, int i3) {
        m2237a(i, (Object) new C0560p(i2, i3));
    }
}
