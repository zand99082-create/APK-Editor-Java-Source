package com.p046a.p049b.p058c.p062c;

import com.p046a.p049b.p066f.p067a.C0822a;
import com.p046a.p049b.p066f.p067a.C0826e;
import com.p046a.p049b.p066f.p067a.EnumC0823b;
import com.p046a.p049b.p066f.p069c.AbstractC0857a;
import com.p046a.p049b.p066f.p069c.C0861c;
import com.p046a.p049b.p066f.p069c.C0862d;
import com.p046a.p049b.p066f.p069c.C0863e;
import com.p046a.p049b.p066f.p069c.C0872n;
import com.p046a.p049b.p066f.p069c.C0874p;
import com.p046a.p049b.p066f.p069c.C0880v;
import com.p046a.p049b.p066f.p069c.C0883y;
import com.p046a.p049b.p066f.p069c.C0884z;
import com.p046a.p049b.p066f.p070d.C0887c;
import com.p046a.p049b.p066f.p070d.InterfaceC0889e;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.a.b.c.c.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0720f {

    /* JADX INFO: renamed from: a */
    private static final C0884z f1456a = C0884z.m1916b(C0887c.m1941a("Ldalvik/annotation/AnnotationDefault;"));

    /* JADX INFO: renamed from: b */
    private static final C0884z f1457b = C0884z.m1916b(C0887c.m1941a("Ldalvik/annotation/EnclosingClass;"));

    /* JADX INFO: renamed from: c */
    private static final C0884z f1458c = C0884z.m1916b(C0887c.m1941a("Ldalvik/annotation/EnclosingMethod;"));

    /* JADX INFO: renamed from: d */
    private static final C0884z f1459d = C0884z.m1916b(C0887c.m1941a("Ldalvik/annotation/InnerClass;"));

    /* JADX INFO: renamed from: e */
    private static final C0884z f1460e = C0884z.m1916b(C0887c.m1941a("Ldalvik/annotation/MemberClasses;"));

    /* JADX INFO: renamed from: f */
    private static final C0884z f1461f = C0884z.m1916b(C0887c.m1941a("Ldalvik/annotation/Signature;"));

    /* JADX INFO: renamed from: g */
    private static final C0884z f1462g = C0884z.m1916b(C0887c.m1941a("Ldalvik/annotation/Throws;"));

    /* JADX INFO: renamed from: h */
    private static final C0883y f1463h = new C0883y("accessFlags");

    /* JADX INFO: renamed from: i */
    private static final C0883y f1464i = new C0883y("name");

    /* JADX INFO: renamed from: j */
    private static final C0883y f1465j = new C0883y("value");

    /* JADX INFO: renamed from: a */
    public static C0822a m1396a(C0822a c0822a) {
        C0822a c0822a2 = new C0822a(f1456a, EnumC0823b.SYSTEM);
        c0822a2.m1700a(new C0826e(f1465j, new C0861c(c0822a)));
        c0822a2.mo811b_();
        return c0822a2;
    }

    /* JADX INFO: renamed from: a */
    public static C0822a m1397a(C0880v c0880v) {
        C0822a c0822a = new C0822a(f1458c, EnumC0823b.SYSTEM);
        c0822a.m1700a(new C0826e(f1465j, c0880v));
        c0822a.mo811b_();
        return c0822a;
    }

    /* JADX INFO: renamed from: a */
    public static C0822a m1398a(C0883y c0883y) {
        C0822a c0822a = new C0822a(f1461f, EnumC0823b.SYSTEM);
        String strM1911j = c0883y.m1911j();
        int length = strM1911j.length();
        ArrayList arrayList = new ArrayList(20);
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            if (strM1911j.charAt(i) == 'L') {
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    char cCharAt = strM1911j.charAt(i2);
                    if (cCharAt == ';') {
                        i2++;
                        break;
                    }
                    if (cCharAt != '<') {
                        i2++;
                    }
                }
            } else {
                while (i2 < length && strM1911j.charAt(i2) != 'L') {
                    i2++;
                }
            }
            arrayList.add(strM1911j.substring(i, i2));
            i = i2;
        }
        int size = arrayList.size();
        C0863e c0863e = new C0863e(size);
        for (int i3 = 0; i3 < size; i3++) {
            c0863e.m1877a(i3, (AbstractC0857a) new C0883y((String) arrayList.get(i3)));
        }
        c0863e.mo811b_();
        c0822a.m1700a(new C0826e(f1465j, new C0862d(c0863e)));
        c0822a.mo811b_();
        return c0822a;
    }

    /* JADX INFO: renamed from: a */
    public static C0822a m1399a(C0883y c0883y, int i) {
        C0822a c0822a = new C0822a(f1459d, EnumC0823b.SYSTEM);
        AbstractC0857a abstractC0857a = c0883y;
        if (c0883y == null) {
            abstractC0857a = C0874p.f2257a;
        }
        c0822a.m1700a(new C0826e(f1464i, abstractC0857a));
        c0822a.m1700a(new C0826e(f1463h, C0872n.m1891a(i)));
        c0822a.mo811b_();
        return c0822a;
    }

    /* JADX INFO: renamed from: a */
    public static C0822a m1400a(C0884z c0884z) {
        C0822a c0822a = new C0822a(f1457b, EnumC0823b.SYSTEM);
        c0822a.m1700a(new C0826e(f1465j, c0884z));
        c0822a.mo811b_();
        return c0822a;
    }

    /* JADX INFO: renamed from: a */
    public static C0822a m1401a(InterfaceC0889e interfaceC0889e) {
        C0862d c0862dM1403c = m1403c(interfaceC0889e);
        C0822a c0822a = new C0822a(f1460e, EnumC0823b.SYSTEM);
        c0822a.m1700a(new C0826e(f1465j, c0862dM1403c));
        c0822a.mo811b_();
        return c0822a;
    }

    /* JADX INFO: renamed from: b */
    public static C0822a m1402b(InterfaceC0889e interfaceC0889e) {
        C0862d c0862dM1403c = m1403c(interfaceC0889e);
        C0822a c0822a = new C0822a(f1462g, EnumC0823b.SYSTEM);
        c0822a.m1700a(new C0826e(f1465j, c0862dM1403c));
        c0822a.mo811b_();
        return c0822a;
    }

    /* JADX INFO: renamed from: c */
    private static C0862d m1403c(InterfaceC0889e interfaceC0889e) {
        int iMo1021d_ = interfaceC0889e.mo1021d_();
        C0863e c0863e = new C0863e(iMo1021d_);
        for (int i = 0; i < iMo1021d_; i++) {
            c0863e.m1877a(i, (AbstractC0857a) C0884z.m1916b(interfaceC0889e.mo1018a(i)));
        }
        c0863e.mo811b_();
        return new C0862d(c0863e);
    }
}
