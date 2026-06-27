package com.p046a.p049b.p066f.p068b;

import com.p046a.p049b.p073h.C0968p;
import java.util.HashMap;

/* JADX INFO: renamed from: com.a.b.f.b.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0845o extends C0968p {

    /* JADX INFO: renamed from: a */
    private final int f1991a;

    /* JADX INFO: renamed from: b */
    private final C0852v f1992b;

    /* JADX INFO: renamed from: c */
    private final C0852v[] f1993c;

    /* JADX INFO: renamed from: d */
    private final HashMap f1994d;

    public C0845o(C0854x c0854x) {
        if (c0854x == null) {
            throw new NullPointerException("method == null");
        }
        C0833c c0833cM1844a = c0854x.m1844a();
        int iJ = c0833cM1844a.m2263j();
        this.f1991a = c0833cM1844a.m1741e();
        this.f1992b = new C0852v(this.f1991a);
        this.f1993c = new C0852v[iJ];
        this.f1994d = new HashMap(c0833cM1844a.m1742f());
        this.f1992b.mo811b_();
    }

    /* JADX INFO: renamed from: b */
    private void m1770b(int i, C0852v c0852v) {
        m2266l();
        if (c0852v == null) {
            throw new NullPointerException("specs == null");
        }
        try {
            this.f1993c[i] = c0852v;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IllegalArgumentException("bogus label");
        }
    }

    /* JADX INFO: renamed from: c */
    private C0852v m1771c(int i) {
        try {
            return this.f1993c[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IllegalArgumentException("bogus label");
        }
    }

    /* JADX INFO: renamed from: a */
    public final C0848r m1772a(AbstractC0839i abstractC0839i) {
        return (C0848r) this.f1994d.get(abstractC0839i);
    }

    /* JADX INFO: renamed from: a */
    public final C0852v m1773a(int i) {
        C0852v c0852vM1771c = m1771c(i);
        return c0852vM1771c != null ? c0852vM1771c : this.f1992b;
    }

    /* JADX INFO: renamed from: a */
    public final void m1774a(AbstractC0839i abstractC0839i, C0848r c0848r) {
        m2266l();
        if (abstractC0839i == null) {
            throw new NullPointerException("insn == null");
        }
        if (c0848r == null) {
            throw new NullPointerException("spec == null");
        }
        this.f1994d.put(abstractC0839i, c0848r);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1775a(int i, C0852v c0852v) {
        C0852v c0852vM1771c = m1771c(i);
        if (c0852vM1771c == null) {
            m1770b(i, c0852v);
            return true;
        }
        C0852v c0852vM1835e = c0852vM1771c.m1835e();
        if (c0852vM1771c.m1833d() != 0) {
            c0852vM1835e.m1828a(c0852v, true);
        } else {
            c0852vM1835e = c0852v.m1835e();
        }
        if (c0852vM1771c.equals(c0852vM1835e)) {
            return false;
        }
        c0852vM1835e.mo811b_();
        m1770b(i, c0852vM1835e);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final int m1776b() {
        return this.f1994d.size();
    }

    /* JADX INFO: renamed from: b */
    public final C0852v m1777b(int i) {
        C0852v c0852vM1771c = m1771c(i);
        return c0852vM1771c != null ? c0852vM1771c.m1835e() : new C0852v(this.f1991a);
    }
}
