package com.p046a.p049b.p058c.p060b;

import com.p046a.p049b.p073h.C0959g;

/* JADX INFO: renamed from: com.a.b.c.b.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0663f extends C0959g implements Comparable {

    /* JADX INFO: renamed from: a */
    public static final C0663f f1104a = new C0663f(0);

    public C0663f(int i) {
        super(i);
    }

    /* JADX INFO: renamed from: a */
    public final C0664g m1190a(int i) {
        return (C0664g) m2240e(i);
    }

    /* JADX INFO: renamed from: a */
    public final void m1191a(int i, C0664g c0664g) {
        m2237a(i, (Object) c0664g);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        C0663f c0663f = (C0663f) obj;
        if (this != c0663f) {
            int iD_ = m2239d_();
            int iD_2 = c0663f.m2239d_();
            int iMin = Math.min(iD_, iD_2);
            for (int i = 0; i < iMin; i++) {
                int iCompareTo = m1190a(i).compareTo(c0663f.m1190a(i));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            if (iD_ < iD_2) {
                return -1;
            }
            if (iD_ > iD_2) {
                return 1;
            }
        }
        return 0;
    }
}
