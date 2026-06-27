package com.p046a.p049b.p058c.p062c;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p066f.p067a.C0822a;
import com.p046a.p049b.p066f.p067a.C0826e;
import com.p046a.p049b.p066f.p069c.AbstractC0857a;
import com.p046a.p049b.p066f.p069c.AbstractC0877s;
import com.p046a.p049b.p066f.p069c.C0861c;
import com.p046a.p049b.p066f.p069c.C0862d;
import com.p046a.p049b.p066f.p069c.C0863e;
import com.p046a.p049b.p066f.p069c.C0865g;
import com.p046a.p049b.p066f.p069c.C0866h;
import com.p046a.p049b.p066f.p069c.C0867i;
import com.p046a.p049b.p066f.p069c.C0868j;
import com.p046a.p049b.p066f.p069c.C0869k;
import com.p046a.p049b.p066f.p069c.C0870l;
import com.p046a.p049b.p066f.p069c.C0871m;
import com.p046a.p049b.p066f.p069c.C0872n;
import com.p046a.p049b.p066f.p069c.C0874p;
import com.p046a.p049b.p066f.p069c.C0878t;
import com.p046a.p049b.p066f.p069c.C0880v;
import com.p046a.p049b.p066f.p069c.C0882x;
import com.p046a.p049b.p066f.p069c.C0883y;
import com.p046a.p049b.p066f.p069c.C0884z;
import com.p046a.p049b.p073h.C0970r;
import java.util.Collection;

/* JADX INFO: renamed from: com.a.b.c.c.be */
/* JADX INFO: loaded from: classes.dex */
public final class C0716be {

    /* JADX INFO: renamed from: a */
    private final C0732r f1451a;

    /* JADX INFO: renamed from: b */
    private final C0970r f1452b;

    public C0716be(C0732r c0732r, C0970r c0970r) {
        if (c0732r == null) {
            throw new NullPointerException("file == null");
        }
        if (c0970r == null) {
            throw new NullPointerException("out == null");
        }
        this.f1451a = c0732r;
        this.f1452b = c0970r;
    }

    /* JADX INFO: renamed from: a */
    public static String m1387a(AbstractC0857a abstractC0857a) {
        if (m1391c(abstractC0857a) == 30) {
            return "null";
        }
        return abstractC0857a.mo1866h() + ' ' + abstractC0857a.mo919d();
    }

    /* JADX INFO: renamed from: a */
    public static void m1388a(C0732r c0732r, C0822a c0822a) {
        C0712ba c0712baM1491k = c0732r.m1491k();
        C0709ay c0709ayM1488h = c0732r.m1488h();
        c0712baM1491k.m1379a(c0822a.m1701b());
        for (C0826e c0826e : c0822a.m1704f()) {
            c0709ayM1488h.m1375a(c0826e.m1717a());
            m1389a(c0732r, c0826e.m1718b());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1389a(C0732r c0732r, AbstractC0857a abstractC0857a) {
        if (abstractC0857a instanceof C0861c) {
            m1388a(c0732r, ((C0861c) abstractC0857a).m1873a());
            return;
        }
        if (!(abstractC0857a instanceof C0862d)) {
            c0732r.m1478a(abstractC0857a);
            return;
        }
        C0863e c0863eM1874a = ((C0862d) abstractC0857a).m1874a();
        int iD_ = c0863eM1874a.m2239d_();
        for (int i = 0; i < iD_; i++) {
            m1389a(c0732r, c0863eM1874a.m1876a(i));
        }
    }

    /* JADX INFO: renamed from: b */
    private void m1390b(AbstractC0857a abstractC0857a) {
        int iM1391c = m1391c(abstractC0857a);
        switch (iM1391c) {
            case 0:
            case 2:
            case 4:
            case 6:
                C1067a.m2470a(this.f1452b, iM1391c, ((AbstractC0877s) abstractC0857a).mo1895k());
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
                throw new RuntimeException("Shouldn't happen");
            case 3:
                C1067a.m2504b(this.f1452b, iM1391c, ((AbstractC0877s) abstractC0857a).mo1895k());
                return;
            case 16:
                C1067a.m2520c(this.f1452b, iM1391c, ((C0871m) abstractC0857a).mo1895k() << 32);
                return;
            case 17:
                C1067a.m2520c(this.f1452b, iM1391c, ((C0868j) abstractC0857a).mo1895k());
                return;
            case 23:
                C1067a.m2504b(this.f1452b, iM1391c, this.f1451a.m1488h().m1376b((C0883y) abstractC0857a));
                return;
            case 24:
                C1067a.m2504b(this.f1452b, iM1391c, this.f1451a.m1491k().m1381b((C0884z) abstractC0857a));
                return;
            case 25:
                C1067a.m2504b(this.f1452b, iM1391c, this.f1451a.m1493m().m1514b((C0870l) abstractC0857a));
                return;
            case 26:
                C1067a.m2504b(this.f1452b, iM1391c, this.f1451a.m1494n().m1331b((C0880v) abstractC0857a));
                return;
            case 27:
                C1067a.m2504b(this.f1452b, iM1391c, this.f1451a.m1493m().m1514b(((C0869k) abstractC0857a).m1888i()));
                return;
            case 28:
                this.f1452b.mo569d(iM1391c);
                m1393a((C0862d) abstractC0857a, false);
                return;
            case 29:
                this.f1452b.mo569d(iM1391c);
                m1392a(((C0861c) abstractC0857a).m1873a(), false);
                return;
            case 30:
                this.f1452b.mo569d(iM1391c);
                return;
            case 31:
                this.f1452b.mo569d(iM1391c | (((C0865g) abstractC0857a).mo1894j() << 5));
                return;
        }
    }

    /* JADX INFO: renamed from: c */
    private static int m1391c(AbstractC0857a abstractC0857a) {
        if (abstractC0857a instanceof C0866h) {
            return 0;
        }
        if (abstractC0857a instanceof C0882x) {
            return 2;
        }
        if (abstractC0857a instanceof C0867i) {
            return 3;
        }
        if (abstractC0857a instanceof C0872n) {
            return 4;
        }
        if (abstractC0857a instanceof C0878t) {
            return 6;
        }
        if (abstractC0857a instanceof C0871m) {
            return 16;
        }
        if (abstractC0857a instanceof C0868j) {
            return 17;
        }
        if (abstractC0857a instanceof C0883y) {
            return 23;
        }
        if (abstractC0857a instanceof C0884z) {
            return 24;
        }
        if (abstractC0857a instanceof C0870l) {
            return 25;
        }
        if (abstractC0857a instanceof C0880v) {
            return 26;
        }
        if (abstractC0857a instanceof C0869k) {
            return 27;
        }
        if (abstractC0857a instanceof C0862d) {
            return 28;
        }
        if (abstractC0857a instanceof C0861c) {
            return 29;
        }
        if (abstractC0857a instanceof C0874p) {
            return 30;
        }
        if (abstractC0857a instanceof C0865g) {
            return 31;
        }
        throw new RuntimeException("Shouldn't happen");
    }

    /* JADX INFO: renamed from: a */
    public final void m1392a(C0822a c0822a, boolean z) {
        int i;
        boolean z2 = z && this.f1452b.m2281b();
        C0709ay c0709ayM1488h = this.f1451a.m1488h();
        C0712ba c0712baM1491k = this.f1451a.m1491k();
        C0884z c0884zM1701b = c0822a.m1701b();
        int iM1381b = c0712baM1491k.m1381b(c0884zM1701b);
        if (z2) {
            this.f1452b.m2277a("  type_idx: " + C1067a.m2556t(iM1381b) + " // " + c0884zM1701b.mo919d());
        }
        this.f1452b.m2286e(c0712baM1491k.m1381b(c0822a.m1701b()));
        Collection<C0826e> collectionM1704f = c0822a.m1704f();
        int size = collectionM1704f.size();
        if (z2) {
            this.f1452b.m2277a("  size: " + C1067a.m2556t(size));
        }
        this.f1452b.m2286e(size);
        int i2 = 0;
        for (C0826e c0826e : collectionM1704f) {
            C0883y c0883yM1717a = c0826e.m1717a();
            int iM1376b = c0709ayM1488h.m1376b(c0883yM1717a);
            AbstractC0857a abstractC0857aM1718b = c0826e.m1718b();
            if (z2) {
                this.f1452b.m2272a(0, "  elements[" + i2 + "]:");
                i = i2 + 1;
                this.f1452b.m2277a("    name_idx: " + C1067a.m2556t(iM1376b) + " // " + c0883yM1717a.mo919d());
            } else {
                i = i2;
            }
            this.f1452b.m2286e(iM1376b);
            if (z2) {
                this.f1452b.m2277a("    value: " + m1387a(abstractC0857aM1718b));
            }
            m1390b(abstractC0857aM1718b);
            i2 = i;
        }
        if (z2) {
            this.f1452b.m2284d();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1393a(C0862d c0862d, boolean z) {
        boolean z2 = z && this.f1452b.m2281b();
        C0863e c0863eM1874a = c0862d.m1874a();
        int iD_ = c0863eM1874a.m2239d_();
        if (z2) {
            this.f1452b.m2277a("  size: " + C1067a.m2556t(iD_));
        }
        this.f1452b.m2286e(iD_);
        for (int i = 0; i < iD_; i++) {
            AbstractC0857a abstractC0857aM1876a = c0863eM1874a.m1876a(i);
            if (z2) {
                this.f1452b.m2277a("  [" + Integer.toHexString(i) + "] " + m1387a(abstractC0857aM1876a));
            }
            m1390b(abstractC0857aM1876a);
        }
        if (z2) {
            this.f1452b.m2284d();
        }
    }
}
