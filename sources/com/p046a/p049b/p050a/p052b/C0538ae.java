package com.p046a.p049b.p050a.p052b;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p073h.C0962j;
import java.util.BitSet;

/* JADX INFO: renamed from: com.a.b.a.b.ae */
/* JADX INFO: loaded from: classes.dex */
final class C0538ae {

    /* JADX INFO: renamed from: a */
    private BitSet f825a;

    /* JADX INFO: renamed from: b */
    private BitSet f826b;

    /* JADX INFO: renamed from: c */
    private int f827c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ C0568x f828d;

    C0538ae(C0568x c0568x, int i) {
        this.f828d = c0568x;
        this.f827c = i;
        this.f826b = new BitSet(c0568x.f920d);
        this.f825a = new BitSet(c0568x.f920d);
        C0568x.m944a(c0568x, true);
    }

    C0538ae(C0568x c0568x, int i, int i2) {
        this(c0568x, i);
        m770a(i2);
    }

    /* JADX INFO: renamed from: a */
    final int m769a() {
        return this.f827c;
    }

    /* JADX INFO: renamed from: a */
    final void m770a(int i) {
        this.f826b.set(i);
    }

    /* JADX INFO: renamed from: a */
    final void m771a(C0558n c0558n, int[] iArr) {
        int iNextSetBit = this.f825a.nextSetBit(0);
        while (iNextSetBit >= 0) {
            int iM2248b = this.f828d.m954c(iNextSetBit).m1720c().m2248b(0);
            C0558n c0558nM874a = c0558n.m874a(this.f827c, iNextSetBit);
            if (c0558nM874a != null) {
                this.f828d.m936a(iM2248b, -1, null, c0558nM874a, iArr);
            } else {
                C1067a.m2508b(iArr, iNextSetBit);
            }
            iNextSetBit = this.f825a.nextSetBit(iNextSetBit + 1);
        }
    }

    /* JADX INFO: renamed from: b */
    final C0962j m772b() {
        C0962j c0962j = new C0962j(this.f825a.size());
        int iNextSetBit = this.f825a.nextSetBit(0);
        while (iNextSetBit >= 0) {
            c0962j.m2250c(this.f828d.m954c(iNextSetBit).m1720c().m2248b(0));
            iNextSetBit = this.f825a.nextSetBit(iNextSetBit + 1);
        }
        c0962j.mo811b_();
        return c0962j;
    }

    /* JADX INFO: renamed from: b */
    final void m773b(int i) {
        this.f825a.set(i);
    }
}
