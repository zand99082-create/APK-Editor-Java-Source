package com.p046a.p049b.p071g;

import com.p046a.p049b.p066f.p068b.C0848r;
import com.p046a.p049b.p073h.C0962j;

/* JADX INFO: renamed from: com.a.b.g.a */
/* JADX INFO: loaded from: classes.dex */
public class C0890a extends AbstractC0913ag {

    /* JADX INFO: renamed from: a */
    private C0962j f2375a;

    /* JADX INFO: renamed from: b */
    private int f2376b;

    public C0890a(int i) {
        this.f2375a = new C0962j(i);
    }

    @Override // com.p046a.p049b.p071g.AbstractC0913ag
    /* JADX INFO: renamed from: a */
    public final int mo1960a() {
        return this.f2376b;
    }

    /* JADX INFO: renamed from: a */
    public final int m1961a(int i) {
        if (i >= this.f2375a.m2247b()) {
            return -1;
        }
        return this.f2375a.m2248b(i);
    }

    @Override // com.p046a.p049b.p071g.AbstractC0913ag
    /* JADX INFO: renamed from: a */
    public final C0848r mo1962a(C0848r c0848r) {
        int iM2248b;
        if (c0848r == null) {
            return null;
        }
        try {
            iM2248b = this.f2375a.m2248b(c0848r.m1795g());
        } catch (IndexOutOfBoundsException e) {
            iM2248b = -1;
        }
        if (iM2248b < 0) {
            throw new RuntimeException("no mapping specified for register");
        }
        return c0848r.m1787a(iM2248b);
    }

    /* JADX INFO: renamed from: a */
    public void mo1963a(int i, int i2, int i3) {
        if (i >= this.f2375a.m2247b()) {
            for (int iM2247b = i - this.f2375a.m2247b(); iM2247b >= 0; iM2247b--) {
                this.f2375a.m2250c(-1);
            }
        }
        this.f2375a.m2249b(i, i2);
        if (this.f2376b < i2 + i3) {
            this.f2376b = i2 + i3;
        }
    }
}
