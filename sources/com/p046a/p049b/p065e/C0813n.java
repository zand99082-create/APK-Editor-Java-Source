package com.p046a.p049b.p065e;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p047a.C0502s;
import com.p046a.p047a.C0505v;
import com.p046a.p047a.p048a.InterfaceC0481c;

/* JADX INFO: renamed from: com.a.b.e.n */
/* JADX INFO: loaded from: classes.dex */
final class C0813n {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0481c f1922a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C0812m f1923b;

    public C0813n(C0812m c0812m, InterfaceC0481c interfaceC0481c) {
        this.f1923b = c0812m;
        this.f1922a = interfaceC0481c;
    }

    /* JADX INFO: renamed from: a */
    private void m1682a(int i, int i2) {
        this.f1922a.mo569d((i2 << 5) | i);
    }

    /* JADX INFO: renamed from: a */
    private void m1683a(C0505v c0505v) {
        switch (c0505v.m670a()) {
            case 0:
                C1067a.m2470a(this.f1922a, 0, c0505v.m675f());
                return;
            case 1:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            default:
                throw new C0502s("Unexpected type: " + Integer.toHexString(c0505v.m670a()));
            case 2:
                C1067a.m2470a(this.f1922a, 2, c0505v.m676g());
                return;
            case 3:
                C1067a.m2504b(this.f1922a, 3, c0505v.m677h());
                return;
            case 4:
                C1067a.m2470a(this.f1922a, 4, c0505v.m678i());
                return;
            case 6:
                C1067a.m2470a(this.f1922a, 6, c0505v.m679j());
                return;
            case 16:
                C1067a.m2520c(this.f1922a, 16, ((long) Float.floatToIntBits(c0505v.m680k())) << 32);
                return;
            case 17:
                C1067a.m2520c(this.f1922a, 17, Double.doubleToLongBits(c0505v.m681l()));
                return;
            case 23:
                C1067a.m2504b(this.f1922a, 23, this.f1923b.m1661a(c0505v.m682m()));
                return;
            case 24:
                C1067a.m2504b(this.f1922a, 24, this.f1923b.m1669b(c0505v.m683n()));
                return;
            case 25:
                C1067a.m2504b(this.f1922a, 25, this.f1923b.m1671c(c0505v.m684o()));
                return;
            case 26:
                C1067a.m2504b(this.f1922a, 26, this.f1923b.m1673d(c0505v.m686q()));
                return;
            case 27:
                C1067a.m2504b(this.f1922a, 27, this.f1923b.m1671c(c0505v.m685p()));
                return;
            case 28:
                m1682a(28, 0);
                m1687c(c0505v);
                return;
            case 29:
                m1682a(29, 0);
                m1685b(c0505v);
                return;
            case 30:
                c0505v.m687r();
                m1682a(30, 0);
                return;
            case 31:
                m1682a(31, c0505v.m688s() ? 1 : 0);
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m1685b(C0505v c0505v) {
        int iM672c = c0505v.m672c();
        C1067a.m2469a(this.f1922a, this.f1923b.m1669b(c0505v.m673d()));
        C1067a.m2469a(this.f1922a, iM672c);
        for (int i = 0; i < iM672c; i++) {
            C1067a.m2469a(this.f1922a, this.f1923b.m1661a(c0505v.m674e()));
            m1683a(c0505v);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m1687c(C0505v c0505v) {
        int iM671b = c0505v.m671b();
        C1067a.m2469a(this.f1922a, iM671b);
        for (int i = 0; i < iM671b; i++) {
            m1683a(c0505v);
        }
    }
}
