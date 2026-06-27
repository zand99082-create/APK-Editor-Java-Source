package com.p046a.p049b.p066f.p068b;

import com.p046a.p049b.p066f.p070d.C0887c;
import com.p046a.p049b.p066f.p070d.InterfaceC0889e;
import com.p046a.p049b.p073h.C0959g;
import java.util.BitSet;

/* JADX INFO: renamed from: com.a.b.f.b.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0850t extends C0959g implements InterfaceC0889e {

    /* JADX INFO: renamed from: a */
    public static final C0850t f2003a = new C0850t(0);

    public C0850t(int i) {
        super(i);
    }

    /* JADX INFO: renamed from: a */
    public static C0850t m1808a(C0848r c0848r) {
        C0850t c0850t = new C0850t(1);
        c0850t.m2237a(0, (Object) c0848r);
        return c0850t;
    }

    /* JADX INFO: renamed from: a */
    public static C0850t m1809a(C0848r c0848r, C0848r c0848r2) {
        C0850t c0850t = new C0850t(2);
        c0850t.m2237a(0, (Object) c0848r);
        c0850t.m2237a(1, (Object) c0848r2);
        return c0850t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final C0850t m1812a(int i, boolean z, BitSet bitSet) {
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        int iD_ = m2239d_();
        if (iD_ == 0) {
            return this;
        }
        C0851u c0851u = new C0851u(this, bitSet, objArr2 == true ? 1 : 0, z, objArr == true ? 1 : 0);
        for (int i2 = 0; i2 < iD_; i2++) {
            C0851u.m1823a(c0851u, i2);
        }
        return C0851u.m1822a(c0851u);
    }

    /* JADX INFO: renamed from: a */
    public final C0850t m1813a(BitSet bitSet) {
        int iD_ = m2239d_() - bitSet.cardinality();
        if (iD_ == 0) {
            return f2003a;
        }
        C0850t c0850t = new C0850t(iD_);
        int i = 0;
        for (int i2 = 0; i2 < m2239d_(); i2++) {
            if (!bitSet.get(i2)) {
                c0850t.m2237a(i, m2240e(i2));
                i++;
            }
        }
        if (m2265k()) {
            c0850t.mo811b_();
        }
        return c0850t;
    }

    @Override // com.p046a.p049b.p066f.p070d.InterfaceC0889e
    /* JADX INFO: renamed from: a */
    public final C0887c mo1018a(int i) {
        return m1815b(i).mo925a().mo925a();
    }

    @Override // com.p046a.p049b.p066f.p070d.InterfaceC0889e
    /* JADX INFO: renamed from: a */
    public final InterfaceC0889e mo1019a(C0887c c0887c) {
        throw new UnsupportedOperationException("unsupported");
    }

    /* JADX INFO: renamed from: a */
    public final void m1814a(int i, C0848r c0848r) {
        m2237a(i, (Object) c0848r);
    }

    /* JADX INFO: renamed from: b */
    public final C0848r m1815b(int i) {
        return (C0848r) m2240e(i);
    }

    /* JADX INFO: renamed from: b */
    public final C0850t m1816b(C0848r c0848r) {
        int iD_ = m2239d_();
        C0850t c0850t = new C0850t(iD_ + 1);
        for (int i = 0; i < iD_; i++) {
            c0850t.m2237a(i + 1, m2240e(i));
        }
        c0850t.m2237a(0, (Object) c0848r);
        if (m2265k()) {
            c0850t.mo811b_();
        }
        return c0850t;
    }

    /* JADX INFO: renamed from: c */
    public final int m1817c(int i) {
        int iD_ = m2239d_();
        for (int i2 = 0; i2 < iD_; i2++) {
            if (m1815b(i2).m1795g() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public final C0850t m1818d(int i) {
        int iD_ = m2239d_();
        if (iD_ == 0) {
            return this;
        }
        C0850t c0850t = new C0850t(iD_);
        for (int i2 = 0; i2 < iD_; i2++) {
            C0848r c0848r = (C0848r) m2240e(i2);
            if (c0848r != null) {
                c0850t.m2237a(i2, (Object) c0848r.m1792b(i));
            }
        }
        if (m2265k()) {
            c0850t.mo811b_();
        }
        return c0850t;
    }

    /* JADX INFO: renamed from: e */
    public final int m1819e() {
        int iD_ = m2239d_();
        int iM1949i = 0;
        for (int i = 0; i < iD_; i++) {
            iM1949i += mo1018a(i).m1949i();
        }
        return iM1949i;
    }

    /* JADX INFO: renamed from: f */
    public final C0850t m1820f() {
        int iD_ = m2239d_() - 1;
        if (iD_ == 0) {
            return f2003a;
        }
        C0850t c0850t = new C0850t(iD_);
        for (int i = 0; i < iD_; i++) {
            c0850t.m2237a(i, m2240e(i + 1));
        }
        if (!m2265k()) {
            return c0850t;
        }
        c0850t.mo811b_();
        return c0850t;
    }

    /* JADX INFO: renamed from: g */
    public final C0850t m1821g() {
        int iD_ = m2239d_() - 1;
        if (iD_ == 0) {
            return f2003a;
        }
        C0850t c0850t = new C0850t(iD_);
        for (int i = 0; i < iD_; i++) {
            c0850t.m2237a(i, m2240e(i));
        }
        if (!m2265k()) {
            return c0850t;
        }
        c0850t.mo811b_();
        return c0850t;
    }
}
