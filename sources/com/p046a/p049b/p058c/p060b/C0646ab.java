package com.p046a.p049b.p058c.p060b;

import com.p046a.p049b.p066f.p068b.C0856z;
import com.p046a.p049b.p073h.C0959g;

/* JADX INFO: renamed from: com.a.b.c.b.ab */
/* JADX INFO: loaded from: classes.dex */
public final class C0646ab extends C0959g {

    /* JADX INFO: renamed from: a */
    private static C0646ab f1068a = new C0646ab(0);

    private C0646ab(int i) {
        super(i);
    }

    /* JADX INFO: renamed from: a */
    public static C0646ab m1136a(C0670m c0670m, int i) {
        switch (i) {
            case 1:
                return f1068a;
            case 2:
            case 3:
                C0856z c0856z = C0856z.f2229a;
                int iD_ = c0670m.m2239d_();
                C0647ac[] c0647acArr = new C0647ac[iD_];
                int i2 = 0;
                boolean z = false;
                C0856z c0856z2 = c0856z;
                for (int i3 = 0; i3 < iD_; i3++) {
                    AbstractC0669l abstractC0669lM1230a = c0670m.m1230a(i3);
                    if (abstractC0669lM1230a instanceof C0665h) {
                        z = true;
                    } else {
                        C0856z c0856zM1224i = abstractC0669lM1230a.m1224i();
                        if (!c0856zM1224i.equals(c0856z) && !c0856zM1224i.m1862a(c0856z2) && (i != 3 || z)) {
                            c0647acArr[i2] = new C0647ac(abstractC0669lM1230a.m1222g(), c0856zM1224i);
                            i2++;
                            z = false;
                            c0856z2 = c0856zM1224i;
                        }
                    }
                }
                C0646ab c0646ab = new C0646ab(i2);
                for (int i4 = 0; i4 < i2; i4++) {
                    c0646ab.m2237a(i4, c0647acArr[i4]);
                }
                c0646ab.mo811b_();
                return c0646ab;
            default:
                throw new IllegalArgumentException("bogus howMuch");
        }
    }

    /* JADX INFO: renamed from: a */
    public final C0647ac m1137a(int i) {
        return (C0647ac) m2240e(i);
    }
}
