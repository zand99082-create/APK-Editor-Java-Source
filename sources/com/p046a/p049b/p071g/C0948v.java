package com.p046a.p049b.p071g;

import com.p046a.p049b.p066f.p068b.C0848r;
import com.p046a.p049b.p066f.p068b.C0852v;
import com.p046a.p049b.p073h.C0968p;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: com.a.b.g.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0948v extends C0968p {

    /* JADX INFO: renamed from: a */
    private final int f2546a;

    /* JADX INFO: renamed from: b */
    private final C0852v f2547b;

    /* JADX INFO: renamed from: c */
    private final C0852v[] f2548c;

    /* JADX INFO: renamed from: d */
    private final HashMap f2549d;

    public C0948v(C0920an c0920an) {
        if (c0920an == null) {
            throw new NullPointerException("method == null");
        }
        ArrayList arrayListM2126j = c0920an.m2126j();
        this.f2546a = c0920an.m2123g();
        this.f2547b = new C0852v(this.f2546a);
        this.f2548c = new C0852v[arrayListM2126j.size()];
        this.f2549d = new HashMap();
        this.f2547b.mo811b_();
    }

    /* JADX INFO: renamed from: b */
    private void m2192b(int i, C0852v c0852v) {
        m2266l();
        if (c0852v == null) {
            throw new NullPointerException("specs == null");
        }
        try {
            this.f2548c[i] = c0852v;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IllegalArgumentException("bogus index");
        }
    }

    /* JADX INFO: renamed from: c */
    private C0852v m2193c(int i) {
        try {
            return this.f2548c[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IllegalArgumentException("bogus index");
        }
    }

    /* JADX INFO: renamed from: a */
    public final C0852v m2194a(int i) {
        C0852v c0852vM2193c = m2193c(i);
        return c0852vM2193c != null ? c0852vM2193c : this.f2547b;
    }

    /* JADX INFO: renamed from: a */
    public final void m2195a(AbstractC0918al abstractC0918al, C0848r c0848r) {
        m2266l();
        if (abstractC0918al == null) {
            throw new NullPointerException("insn == null");
        }
        if (c0848r == null) {
            throw new NullPointerException("spec == null");
        }
        this.f2549d.put(abstractC0918al, c0848r);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m2196a(int i, C0852v c0852v) {
        C0852v c0852vM2193c = m2193c(i);
        if (c0852vM2193c == null) {
            m2192b(i, c0852v);
            return true;
        }
        C0852v c0852vM1835e = c0852vM2193c.m1835e();
        c0852vM1835e.m1828a(c0852v, true);
        if (c0852vM2193c.equals(c0852vM1835e)) {
            return false;
        }
        c0852vM1835e.mo811b_();
        m2192b(i, c0852vM1835e);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final C0852v m2197b(int i) {
        C0852v c0852vM2193c = m2193c(i);
        return c0852vM2193c != null ? c0852vM2193c.m1835e() : new C0852v(this.f2546a);
    }
}
