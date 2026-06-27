package com.p046a.p049b.p058c.p060b;

import com.p046a.p049b.p066f.p068b.C0840j;
import com.p046a.p049b.p066f.p068b.C0846p;
import com.p046a.p049b.p066f.p069c.C0872n;

/* JADX INFO: renamed from: com.a.b.c.b.af */
/* JADX INFO: loaded from: classes.dex */
final class C0650af extends C0840j {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ boolean[] f1082a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ int f1083b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ int f1084c;

    C0650af(boolean[] zArr, int i, int i2) {
        this.f1082a = zArr;
        this.f1083b = i;
        this.f1084c = i2;
    }

    @Override // com.p046a.p049b.p066f.p068b.C0840j, com.p046a.p049b.p066f.p068b.InterfaceC0841k
    /* JADX INFO: renamed from: a */
    public final void mo1151a(C0846p c0846p) {
        if (c0846p.m1752f().m1836a() == 3) {
            this.f1082a[0] = this.f1082a[0] && ((C0872n) c0846p.m1748g_()).mo1894j() + (this.f1083b - this.f1084c) == c0846p.m1754h().m1795g();
        }
    }
}
