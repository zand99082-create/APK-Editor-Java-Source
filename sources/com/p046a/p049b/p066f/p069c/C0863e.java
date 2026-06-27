package com.p046a.p049b.p066f.p069c;

import com.p046a.p049b.p073h.C0959g;

/* JADX INFO: renamed from: com.a.b.f.c.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0863e extends C0959g implements Comparable {
    public C0863e(int i) {
        super(i);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C0863e c0863e) {
        int iD_ = m2239d_();
        int iD_2 = c0863e.m2239d_();
        int i = iD_ < iD_2 ? iD_ : iD_2;
        for (int i2 = 0; i2 < i; i2++) {
            int iCompareTo = ((AbstractC0857a) m2240e(i2)).compareTo((AbstractC0857a) c0863e.m2240e(i2));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        if (iD_ < iD_2) {
            return -1;
        }
        return iD_ > iD_2 ? 1 : 0;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC0857a m1876a(int i) {
        return (AbstractC0857a) m2240e(i);
    }

    /* JADX INFO: renamed from: a */
    public final void m1877a(int i, AbstractC0857a abstractC0857a) {
        m2237a(i, (Object) abstractC0857a);
    }
}
