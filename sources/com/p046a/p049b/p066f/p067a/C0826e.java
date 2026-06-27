package com.p046a.p049b.p066f.p067a;

import com.p046a.p049b.p066f.p069c.AbstractC0857a;
import com.p046a.p049b.p066f.p069c.C0883y;

/* JADX INFO: renamed from: com.a.b.f.a.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0826e implements Comparable {

    /* JADX INFO: renamed from: a */
    private final C0883y f1949a;

    /* JADX INFO: renamed from: b */
    private final AbstractC0857a f1950b;

    public C0826e(C0883y c0883y, AbstractC0857a abstractC0857a) {
        if (c0883y == null) {
            throw new NullPointerException("name == null");
        }
        if (abstractC0857a == null) {
            throw new NullPointerException("value == null");
        }
        this.f1949a = c0883y;
        this.f1950b = abstractC0857a;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C0826e c0826e) {
        int iA = this.f1949a.compareTo(c0826e.f1949a);
        return iA != 0 ? iA : this.f1950b.compareTo(c0826e.f1950b);
    }

    /* JADX INFO: renamed from: a */
    public final C0883y m1717a() {
        return this.f1949a;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC0857a m1718b() {
        return this.f1950b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0826e)) {
            return false;
        }
        C0826e c0826e = (C0826e) obj;
        return this.f1949a.equals(c0826e.f1949a) && this.f1950b.equals(c0826e.f1950b);
    }

    public final int hashCode() {
        return (this.f1949a.hashCode() * 31) + this.f1950b.hashCode();
    }

    public final String toString() {
        return this.f1949a.mo919d() + ":" + this.f1950b;
    }
}
