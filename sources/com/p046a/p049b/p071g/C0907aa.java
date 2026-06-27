package com.p046a.p049b.p071g;

import com.p046a.p049b.p066f.p068b.C0854x;
import com.p046a.p049b.p066f.p068b.InterfaceC0831ad;
import com.p046a.p049b.p071g.p072a.C0904n;
import java.util.EnumSet;

/* JADX INFO: renamed from: com.a.b.g.aa */
/* JADX INFO: loaded from: classes.dex */
public final class C0907aa {

    /* JADX INFO: renamed from: a */
    private static boolean f2418a = true;

    /* JADX INFO: renamed from: b */
    private static InterfaceC0831ad f2419b;

    /* JADX INFO: renamed from: a */
    public static C0854x m2012a(C0854x c0854x, int i, boolean z, boolean z2, InterfaceC0831ad interfaceC0831ad) {
        EnumSet enumSetAllOf = EnumSet.allOf(EnumC0908ab.class);
        f2418a = z2;
        f2419b = interfaceC0831ad;
        C0920an c0920anM2153a = C0931e.m2153a(c0854x, i, z);
        m2013a(c0920anM2153a, enumSetAllOf);
        C0854x c0854xM2009a = C0904n.m2009a(c0920anM2153a, false);
        if (c0854xM2009a.m1844a().m1741e() <= 16) {
            return c0854xM2009a;
        }
        C0920an c0920anM2153a2 = C0931e.m2153a(c0854x, i, z);
        EnumSet enumSetClone = enumSetAllOf.clone();
        enumSetClone.remove(EnumC0908ab.f2423d);
        m2013a(c0920anM2153a2, enumSetClone);
        return C0904n.m2009a(c0920anM2153a2, true);
    }

    /* JADX INFO: renamed from: a */
    private static void m2013a(C0920an c0920an, EnumSet enumSet) {
        boolean z = false;
        boolean z2 = true;
        if (enumSet.contains(EnumC0908ab.f2420a)) {
            C0949w.m2200a(c0920an);
        }
        if (enumSet.contains(EnumC0908ab.f2421b)) {
            C0914ah.m2042a(c0920an);
            C0931e.m2155a(c0920an);
            z2 = false;
        }
        if (enumSet.contains(EnumC0908ab.f2422c)) {
            C0945s.m2186a(c0920an);
            C0931e.m2155a(c0920an);
            z2 = false;
        }
        enumSet.remove(EnumC0908ab.f2424e);
        if (enumSet.contains(EnumC0908ab.f2424e)) {
            C0938l.m2176a(c0920an);
            C0931e.m2155a(c0920an);
            z2 = false;
        }
        if (enumSet.contains(EnumC0908ab.f2423d)) {
            C0928b.m2151a(c0920an);
            C0931e.m2155a(c0920an);
        } else {
            z = z2;
        }
        if (z) {
            C0931e.m2155a(c0920an);
        }
        C0912af.m2034a(c0920an);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m2014a() {
        return f2418a;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC0831ad m2015b() {
        return f2419b;
    }
}
