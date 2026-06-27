package com.p046a.p049b.p050a.p054d;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p050a.p051a.C0532w;
import com.p046a.p049b.p050a.p055e.AbstractC0588a;
import com.p046a.p049b.p050a.p055e.C0596i;
import com.p046a.p049b.p050a.p055e.InterfaceC0597j;
import com.p046a.p049b.p066f.p069c.C0883y;
import com.p046a.p049b.p066f.p069c.InterfaceC0860b;
import com.p046a.p049b.p073h.C0955c;

/* JADX INFO: renamed from: com.a.b.a.d.b */
/* JADX INFO: loaded from: classes.dex */
public class C0573b {
    /* JADX INFO: renamed from: a */
    public final AbstractC0588a m982a(C0582k c0582k, int i, int i2, InterfaceC0597j interfaceC0597j) {
        if (c0582k == null) {
            throw new NullPointerException("cf == null");
        }
        if (i < 0 || i >= 4) {
            throw new IllegalArgumentException("bad context");
        }
        C0883y c0883y = null;
        try {
            C0955c c0955cM1007b = c0582k.m1007b();
            InterfaceC0860b interfaceC0860bM1012g = c0582k.m1012g();
            int iM2228f = c0955cM1007b.m2228f(i2);
            int iM2225c = c0955cM1007b.m2225c(i2 + 2);
            c0883y = (C0883y) interfaceC0860bM1012g.mo1869a(iM2228f);
            if (interfaceC0597j != null) {
                new StringBuilder("name: ").append(c0883y.mo919d());
                new StringBuilder("length: ").append(C1067a.m2556t(iM2225c));
            }
            return mo983a(c0582k, i, c0883y.m1911j(), i2 + 6, iM2225c, interfaceC0597j);
        } catch (C0596i e) {
            e.m573a("...while parsing " + (c0883y != null ? c0883y.mo919d() + " " : "") + "attribute at offset " + C1067a.m2556t(i2));
            throw e;
        }
    }

    /* JADX INFO: renamed from: a */
    protected AbstractC0588a mo983a(C0582k c0582k, int i, String str, int i2, int i3, InterfaceC0597j interfaceC0597j) {
        return new C0532w(str, c0582k.m1007b(), i2, i3, c0582k.m1012g());
    }
}
