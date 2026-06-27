package com.p046a.p049b.p050a.p054d;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p050a.p051a.C0510a;
import com.p046a.p049b.p050a.p051a.C0511b;
import com.p046a.p049b.p050a.p051a.C0512c;
import com.p046a.p049b.p050a.p051a.C0513d;
import com.p046a.p049b.p050a.p051a.C0514e;
import com.p046a.p049b.p050a.p051a.C0515f;
import com.p046a.p049b.p050a.p051a.C0516g;
import com.p046a.p049b.p050a.p051a.C0517h;
import com.p046a.p049b.p050a.p051a.C0518i;
import com.p046a.p049b.p050a.p051a.C0519j;
import com.p046a.p049b.p050a.p051a.C0520k;
import com.p046a.p049b.p050a.p051a.C0521l;
import com.p046a.p049b.p050a.p051a.C0522m;
import com.p046a.p049b.p050a.p051a.C0523n;
import com.p046a.p049b.p050a.p051a.C0524o;
import com.p046a.p049b.p050a.p051a.C0525p;
import com.p046a.p049b.p050a.p051a.C0526q;
import com.p046a.p049b.p050a.p051a.C0530u;
import com.p046a.p049b.p050a.p052b.C0549e;
import com.p046a.p049b.p050a.p052b.C0552h;
import com.p046a.p049b.p050a.p052b.C0559o;
import com.p046a.p049b.p050a.p052b.C0561q;
import com.p046a.p049b.p050a.p055e.AbstractC0588a;
import com.p046a.p049b.p050a.p055e.C0596i;
import com.p046a.p049b.p050a.p055e.C0598k;
import com.p046a.p049b.p050a.p055e.InterfaceC0597j;
import com.p046a.p049b.p066f.p067a.EnumC0823b;
import com.p046a.p049b.p066f.p069c.AbstractC0859ab;
import com.p046a.p049b.p066f.p069c.C0881w;
import com.p046a.p049b.p066f.p069c.C0883y;
import com.p046a.p049b.p066f.p069c.C0884z;
import com.p046a.p049b.p066f.p069c.InterfaceC0860b;
import com.p046a.p049b.p073h.C0955c;
import com.p046a.p049b.p073h.C0956d;
import java.io.IOException;

/* JADX INFO: renamed from: com.a.b.a.d.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0587p extends C0573b {

    /* JADX INFO: renamed from: a */
    public static final C0587p f981a = new C0587p();

    /* JADX INFO: renamed from: a */
    private static C0561q m1033a(C0955c c0955c, InterfaceC0860b interfaceC0860b, InterfaceC0597j interfaceC0597j, int i, boolean z) {
        C0883y c0883y;
        C0883y c0883y2;
        if (c0955c.m2219a() != i * 10) {
            m1039c((i * 10) + 2);
        }
        C0956d c0956dM2224b = c0955c.m2224b();
        C0561q c0561q = new C0561q(i);
        for (int i2 = 0; i2 < i; i2++) {
            try {
                int unsignedShort = c0956dM2224b.readUnsignedShort();
                int unsignedShort2 = c0956dM2224b.readUnsignedShort();
                int unsignedShort3 = c0956dM2224b.readUnsignedShort();
                int unsignedShort4 = c0956dM2224b.readUnsignedShort();
                int unsignedShort5 = c0956dM2224b.readUnsignedShort();
                C0883y c0883y3 = (C0883y) interfaceC0860b.mo1869a(unsignedShort3);
                C0883y c0883y4 = (C0883y) interfaceC0860b.mo1869a(unsignedShort4);
                if (z) {
                    c0883y = c0883y4;
                    c0883y2 = null;
                } else {
                    c0883y = null;
                    c0883y2 = c0883y4;
                }
                c0561q.m898a(i2, unsignedShort, unsignedShort2, c0883y3, c0883y2, c0883y, unsignedShort5);
                if (interfaceC0597j != null) {
                    new StringBuilder().append(C1067a.m2558v(unsignedShort)).append("..").append(C1067a.m2558v(unsignedShort + unsignedShort2)).append(" ").append(C1067a.m2558v(unsignedShort5)).append(" ").append(c0883y3.mo919d()).append(" ").append(c0883y4.mo919d());
                }
            } catch (IOException e) {
                throw new RuntimeException("shouldn't happen", e);
            }
        }
        c0561q.mo811b_();
        return c0561q;
    }

    /* JADX INFO: renamed from: a */
    private static AbstractC0588a m1034a() {
        throw new C0596i("severely truncated attribute");
    }

    /* JADX INFO: renamed from: a */
    private static AbstractC0588a m1035a(int i) {
        return i != 0 ? m1039c(0) : new C0513d();
    }

    /* JADX INFO: renamed from: b */
    private static AbstractC0588a m1036b() {
        throw new C0596i("truncated attribute");
    }

    /* JADX INFO: renamed from: b */
    private static AbstractC0588a m1037b(int i) {
        return i != 0 ? m1039c(0) : new C0526q();
    }

    /* JADX INFO: renamed from: b */
    private AbstractC0588a m1038b(C0582k c0582k, int i, int i2, InterfaceC0597j interfaceC0597j) {
        if (i2 < 12) {
            return m1034a();
        }
        C0955c c0955cM1007b = c0582k.m1007b();
        InterfaceC0860b interfaceC0860bM1012g = c0582k.m1012g();
        int iM2228f = c0955cM1007b.m2228f(i);
        int iM2228f2 = c0955cM1007b.m2228f(i + 2);
        int iM2225c = c0955cM1007b.m2225c(i + 4);
        if (interfaceC0597j != null) {
            new StringBuilder("max_stack: ").append(C1067a.m2558v(iM2228f));
            new StringBuilder("max_locals: ").append(C1067a.m2558v(iM2228f2));
            new StringBuilder("code_length: ").append(C1067a.m2556t(iM2225c));
        }
        int i3 = i + 8;
        int i4 = i2 - 8;
        if (i4 < iM2225c + 4) {
            return m1036b();
        }
        int i5 = i3 + iM2225c;
        int i6 = i4 - iM2225c;
        C0552h c0552h = new C0552h(c0955cM1007b.m2221a(i3, iM2225c + i3), interfaceC0860bM1012g);
        if (interfaceC0597j != null) {
            c0552h.m841a(new C0581j(c0552h.m840a(), interfaceC0597j));
        }
        int iM2228f3 = c0955cM1007b.m2228f(i5);
        C0549e c0549e = iM2228f3 == 0 ? C0549e.f877a : new C0549e(iM2228f3);
        if (interfaceC0597j != null) {
            new StringBuilder("exception_table_length: ").append(C1067a.m2558v(iM2228f3));
        }
        int i7 = i5 + 2;
        int i8 = i6 - 2;
        if (i8 < (iM2228f3 << 3) + 2) {
            return m1036b();
        }
        int i9 = 0;
        int i10 = i8;
        int i11 = i7;
        while (i9 < iM2228f3) {
            int iM2228f4 = c0955cM1007b.m2228f(i11);
            int iM2228f5 = c0955cM1007b.m2228f(i11 + 2);
            int iM2228f6 = c0955cM1007b.m2228f(i11 + 4);
            C0884z c0884z = (C0884z) interfaceC0860bM1012g.mo1871b(c0955cM1007b.m2228f(i11 + 6));
            c0549e.m829a(i9, iM2228f4, iM2228f5, iM2228f6, c0884z);
            if (interfaceC0597j != null) {
                new StringBuilder().append(C1067a.m2558v(iM2228f4)).append("..").append(C1067a.m2558v(iM2228f5)).append(" -> ").append(C1067a.m2558v(iM2228f6)).append(" ").append(c0884z == null ? "<any>" : c0884z.mo919d());
            }
            i9++;
            i10 -= 8;
            i11 += 8;
        }
        c0549e.mo811b_();
        C0574c c0574c = new C0574c(c0582k, 3, i11, this);
        c0574c.m986a(interfaceC0597j);
        C0598k c0598kM987b = c0574c.m987b();
        c0598kM987b.mo811b_();
        int iM985a = c0574c.m985a() - i11;
        return iM985a != i10 ? m1039c((i11 - i) + iM985a) : new C0511b(iM2228f, iM2228f2, c0552h, c0549e, c0598kM987b);
    }

    /* JADX INFO: renamed from: c */
    private static AbstractC0588a m1039c(int i) {
        throw new C0596i("bad attribute length; expected length " + C1067a.m2556t(i));
    }

    /* JADX INFO: renamed from: c */
    private static AbstractC0588a m1040c(C0582k c0582k, int i, int i2, InterfaceC0597j interfaceC0597j) {
        if (i2 < 2) {
            return m1034a();
        }
        C0955c c0955cM1007b = c0582k.m1007b();
        InterfaceC0860b interfaceC0860bM1012g = c0582k.m1012g();
        int iM2228f = c0955cM1007b.m2228f(i);
        if (interfaceC0597j != null) {
            new StringBuilder("number_of_classes: ").append(C1067a.m2558v(iM2228f));
        }
        int i3 = i + 2;
        if (i2 - 2 != (iM2228f << 3)) {
            m1039c((iM2228f << 3) + 2);
        }
        C0530u c0530u = new C0530u(iM2228f);
        int i4 = 0;
        int i5 = i3;
        while (i4 < iM2228f) {
            int iM2228f2 = c0955cM1007b.m2228f(i5);
            int iM2228f3 = c0955cM1007b.m2228f(i5 + 2);
            int iM2228f4 = c0955cM1007b.m2228f(i5 + 4);
            int iM2228f5 = c0955cM1007b.m2228f(i5 + 6);
            C0884z c0884z = (C0884z) interfaceC0860bM1012g.mo1869a(iM2228f2);
            C0884z c0884z2 = (C0884z) interfaceC0860bM1012g.mo1871b(iM2228f3);
            C0883y c0883y = (C0883y) interfaceC0860bM1012g.mo1871b(iM2228f4);
            c0530u.m724a(i4, c0884z, c0884z2, c0883y, iM2228f5);
            if (interfaceC0597j != null) {
                new StringBuilder("inner_class: ").append(C0582k.m997a(c0884z));
                new StringBuilder("  outer_class: ").append(C0582k.m997a(c0884z2));
                new StringBuilder("  name: ").append(C0582k.m997a(c0883y));
                new StringBuilder("  access_flags: ").append(C1067a.m2538h(iM2228f5));
            }
            i4++;
            i5 += 8;
        }
        c0530u.mo811b_();
        return new C0516g(c0530u);
    }

    /* JADX INFO: renamed from: d */
    private static AbstractC0588a m1041d(C0582k c0582k, int i, int i2, InterfaceC0597j interfaceC0597j) {
        if (i2 < 2) {
            return m1034a();
        }
        C0955c c0955cM1007b = c0582k.m1007b();
        int iM2228f = c0955cM1007b.m2228f(i);
        if (interfaceC0597j != null) {
            new StringBuilder("line_number_table_length: ").append(C1067a.m2558v(iM2228f));
        }
        int i3 = i + 2;
        if (i2 - 2 != (iM2228f << 2)) {
            m1039c((iM2228f << 2) + 2);
        }
        C0559o c0559o = new C0559o(iM2228f);
        for (int i4 = 0; i4 < iM2228f; i4++) {
            int iM2228f2 = c0955cM1007b.m2228f(i3);
            int iM2228f3 = c0955cM1007b.m2228f(i3 + 2);
            c0559o.m890a(i4, iM2228f2, iM2228f3);
            if (interfaceC0597j != null) {
                new StringBuilder().append(C1067a.m2558v(iM2228f2)).append(" ").append(iM2228f3);
            }
            i3 += 4;
        }
        c0559o.mo811b_();
        return new C0517h(c0559o);
    }

    /* JADX INFO: renamed from: e */
    private static AbstractC0588a m1042e(C0582k c0582k, int i, int i2, InterfaceC0597j interfaceC0597j) {
        if (i2 < 2) {
            m1034a();
        }
        return new C0520k(new C0572a(c0582k, i, i2, interfaceC0597j).m981b(EnumC0823b.BUILD), i2);
    }

    /* JADX INFO: renamed from: f */
    private static AbstractC0588a m1043f(C0582k c0582k, int i, int i2, InterfaceC0597j interfaceC0597j) {
        if (i2 < 2) {
            m1034a();
        }
        return new C0522m(new C0572a(c0582k, i, i2, interfaceC0597j).m981b(EnumC0823b.RUNTIME), i2);
    }

    /* JADX INFO: renamed from: g */
    private static AbstractC0588a m1044g(C0582k c0582k, int i, int i2, InterfaceC0597j interfaceC0597j) {
        if (i2 != 2) {
            m1039c(2);
        }
        C0883y c0883y = (C0883y) c0582k.m1012g().mo1869a(c0582k.m1007b().m2228f(i));
        C0524o c0524o = new C0524o(c0883y);
        if (interfaceC0597j != null) {
            new StringBuilder("signature: ").append(c0883y);
        }
        return c0524o;
    }

    @Override // com.p046a.p049b.p050a.p054d.C0573b
    /* JADX INFO: renamed from: a */
    protected final AbstractC0588a mo983a(C0582k c0582k, int i, String str, int i2, int i3, InterfaceC0597j interfaceC0597j) {
        switch (i) {
            case 0:
                if (str == "Deprecated") {
                    return m1035a(i3);
                }
                if (str == "EnclosingMethod") {
                    if (i3 != 4) {
                        m1039c(4);
                    }
                    C0955c c0955cM1007b = c0582k.m1007b();
                    InterfaceC0860b interfaceC0860bM1012g = c0582k.m1012g();
                    C0884z c0884z = (C0884z) interfaceC0860bM1012g.mo1869a(c0955cM1007b.m2228f(i2));
                    C0881w c0881w = (C0881w) interfaceC0860bM1012g.mo1871b(c0955cM1007b.m2228f(i2 + 2));
                    C0514e c0514e = new C0514e(c0884z, c0881w);
                    if (interfaceC0597j != null) {
                        new StringBuilder("class: ").append(c0884z);
                        new StringBuilder("method: ").append(C0582k.m997a(c0881w));
                    }
                    return c0514e;
                }
                if (str == "InnerClasses") {
                    return m1040c(c0582k, i2, i3, interfaceC0597j);
                }
                if (str == "RuntimeInvisibleAnnotations") {
                    return m1042e(c0582k, i2, i3, interfaceC0597j);
                }
                if (str == "RuntimeVisibleAnnotations") {
                    return m1043f(c0582k, i2, i3, interfaceC0597j);
                }
                if (str == "Synthetic") {
                    return m1037b(i3);
                }
                if (str == "Signature") {
                    return m1044g(c0582k, i2, i3, interfaceC0597j);
                }
                if (str == "SourceFile") {
                    if (i3 != 2) {
                        m1039c(2);
                    }
                    C0883y c0883y = (C0883y) c0582k.m1012g().mo1869a(c0582k.m1007b().m2228f(i2));
                    C0525p c0525p = new C0525p(c0883y);
                    if (interfaceC0597j != null) {
                        new StringBuilder("source: ").append(c0883y);
                    }
                    return c0525p;
                }
                break;
            case 1:
                if (str == "ConstantValue") {
                    if (i3 != 2) {
                        return m1039c(2);
                    }
                    AbstractC0859ab abstractC0859ab = (AbstractC0859ab) c0582k.m1012g().mo1869a(c0582k.m1007b().m2228f(i2));
                    C0512c c0512c = new C0512c(abstractC0859ab);
                    if (interfaceC0597j != null) {
                        new StringBuilder("value: ").append(abstractC0859ab);
                    }
                    return c0512c;
                }
                if (str == "Deprecated") {
                    return m1035a(i3);
                }
                if (str == "RuntimeInvisibleAnnotations") {
                    return m1042e(c0582k, i2, i3, interfaceC0597j);
                }
                if (str == "RuntimeVisibleAnnotations") {
                    return m1043f(c0582k, i2, i3, interfaceC0597j);
                }
                if (str == "Signature") {
                    return m1044g(c0582k, i2, i3, interfaceC0597j);
                }
                if (str == "Synthetic") {
                    return m1037b(i3);
                }
                break;
            case 2:
                if (str == "AnnotationDefault") {
                    if (i3 < 2) {
                        m1034a();
                    }
                    return new C0510a(new C0572a(c0582k, i2, i3, interfaceC0597j).m980a(), i3);
                }
                if (str == "Code") {
                    return m1038b(c0582k, i2, i3, interfaceC0597j);
                }
                if (str == "Deprecated") {
                    return m1035a(i3);
                }
                if (str == "Exceptions") {
                    if (i3 < 2) {
                        return m1034a();
                    }
                    int iM2228f = c0582k.m1007b().m2228f(i2);
                    if (interfaceC0597j != null) {
                        new StringBuilder("number_of_exceptions: ").append(C1067a.m2558v(iM2228f));
                    }
                    int i4 = i2 + 2;
                    if (i3 - 2 != (iM2228f << 1)) {
                        m1039c((iM2228f << 1) + 2);
                    }
                    return new C0515f(c0582k.m1004a(i4, iM2228f));
                }
                if (str == "RuntimeInvisibleAnnotations") {
                    return m1042e(c0582k, i2, i3, interfaceC0597j);
                }
                if (str == "RuntimeVisibleAnnotations") {
                    return m1043f(c0582k, i2, i3, interfaceC0597j);
                }
                if (str == "RuntimeInvisibleParameterAnnotations") {
                    if (i3 < 2) {
                        m1034a();
                    }
                    return new C0521l(new C0572a(c0582k, i2, i3, interfaceC0597j).m979a(EnumC0823b.BUILD), i3);
                }
                if (str == "RuntimeVisibleParameterAnnotations") {
                    if (i3 < 2) {
                        m1034a();
                    }
                    return new C0523n(new C0572a(c0582k, i2, i3, interfaceC0597j).m979a(EnumC0823b.RUNTIME), i3);
                }
                if (str == "Signature") {
                    return m1044g(c0582k, i2, i3, interfaceC0597j);
                }
                if (str == "Synthetic") {
                    return m1037b(i3);
                }
                break;
            case 3:
                if (str == "LineNumberTable") {
                    return m1041d(c0582k, i2, i3, interfaceC0597j);
                }
                if (str == "LocalVariableTable") {
                    if (i3 < 2) {
                        return m1034a();
                    }
                    C0955c c0955cM1007b2 = c0582k.m1007b();
                    int iM2228f2 = c0955cM1007b2.m2228f(i2);
                    if (interfaceC0597j != null) {
                        new StringBuilder("local_variable_table_length: ").append(C1067a.m2558v(iM2228f2));
                    }
                    return new C0518i(m1033a(c0955cM1007b2.m2221a(i2 + 2, i2 + i3), c0582k.m1012g(), interfaceC0597j, iM2228f2, false));
                }
                if (str == "LocalVariableTypeTable") {
                    if (i3 < 2) {
                        return m1034a();
                    }
                    C0955c c0955cM1007b3 = c0582k.m1007b();
                    int iM2228f3 = c0955cM1007b3.m2228f(i2);
                    if (interfaceC0597j != null) {
                        new StringBuilder("local_variable_type_table_length: ").append(C1067a.m2558v(iM2228f3));
                    }
                    return new C0519j(m1033a(c0955cM1007b3.m2221a(i2 + 2, i2 + i3), c0582k.m1012g(), interfaceC0597j, iM2228f3, true));
                }
                break;
        }
        return super.mo983a(c0582k, i, str, i2, i3, interfaceC0597j);
    }
}
