package com.p046a.p049b.p066f.p068b;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p073h.C0962j;
import com.p046a.p049b.p073h.InterfaceC0964l;

/* JADX INFO: renamed from: com.a.b.f.b.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0827a implements InterfaceC0964l {

    /* JADX INFO: renamed from: a */
    private final int f1951a;

    /* JADX INFO: renamed from: b */
    private final C0842l f1952b;

    /* JADX INFO: renamed from: c */
    private final C0962j f1953c;

    /* JADX INFO: renamed from: d */
    private final int f1954d;

    public C0827a(int i, C0842l c0842l, C0962j c0962j, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("label < 0");
        }
        try {
            c0842l.m2267m();
            int iD_ = c0842l.m2239d_();
            if (iD_ == 0) {
                throw new IllegalArgumentException("insns.size() == 0");
            }
            for (int i3 = iD_ - 2; i3 >= 0; i3--) {
                if (c0842l.m1759a(i3).m1752f().m1839d() != 1) {
                    throw new IllegalArgumentException("insns[" + i3 + "] is a branch or can throw");
                }
            }
            if (c0842l.m1759a(iD_ - 1).m1752f().m1839d() == 1) {
                throw new IllegalArgumentException("insns does not end with a branch or throwing instruction");
            }
            try {
                c0962j.m2267m();
                if (i2 < -1) {
                    throw new IllegalArgumentException("primarySuccessor < -1");
                }
                if (i2 >= 0 && !c0962j.m2260h(i2)) {
                    throw new IllegalArgumentException("primarySuccessor " + i2 + " not in successors " + c0962j);
                }
                this.f1951a = i;
                this.f1952b = c0842l;
                this.f1953c = c0962j;
                this.f1954d = i2;
            } catch (NullPointerException e) {
                throw new NullPointerException("successors == null");
            }
        } catch (NullPointerException e2) {
            throw new NullPointerException("insns == null");
        }
    }

    @Override // com.p046a.p049b.p073h.InterfaceC0964l
    /* JADX INFO: renamed from: a */
    public final int mo821a() {
        return this.f1951a;
    }

    /* JADX INFO: renamed from: b */
    public final C0842l m1719b() {
        return this.f1952b;
    }

    /* JADX INFO: renamed from: c */
    public final C0962j m1720c() {
        return this.f1953c;
    }

    /* JADX INFO: renamed from: d */
    public final int m1721d() {
        return this.f1954d;
    }

    /* JADX INFO: renamed from: e */
    public final int m1722e() {
        if (this.f1953c.m2247b() != 2) {
            throw new UnsupportedOperationException("block doesn't have exactly two successors");
        }
        int iM2248b = this.f1953c.m2248b(0);
        return iM2248b == this.f1954d ? this.f1953c.m2248b(1) : iM2248b;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC0839i m1723f() {
        return this.f1952b.m1759a(0);
    }

    /* JADX INFO: renamed from: g */
    public final AbstractC0839i m1724g() {
        return this.f1952b.m1763e();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m1725h() {
        return this.f1952b.m1763e().m1757k();
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m1726i() {
        return this.f1952b.m1763e().mo1732b().mo1021d_() != 0;
    }

    public final String toString() {
        return "{" + C1067a.m2558v(this.f1951a) + '}';
    }
}
