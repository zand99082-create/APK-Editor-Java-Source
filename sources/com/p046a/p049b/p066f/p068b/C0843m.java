package com.p046a.p049b.p066f.p068b;

import com.p046a.p049b.p066f.p069c.C0883y;

/* JADX INFO: renamed from: com.a.b.f.b.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0843m implements Comparable {

    /* JADX INFO: renamed from: a */
    private final C0883y f1985a;

    /* JADX INFO: renamed from: b */
    private final C0883y f1986b;

    private C0843m(C0883y c0883y, C0883y c0883y2) {
        this.f1985a = c0883y;
        this.f1986b = c0883y2;
    }

    /* JADX INFO: renamed from: a */
    public static C0843m m1764a(C0883y c0883y, C0883y c0883y2) {
        if (c0883y == null && c0883y2 == null) {
            return null;
        }
        return new C0843m(c0883y, c0883y2);
    }

    /* JADX INFO: renamed from: b */
    private static int m1765b(C0883y c0883y, C0883y c0883y2) {
        if (c0883y == c0883y2) {
            return 0;
        }
        if (c0883y == null) {
            return -1;
        }
        if (c0883y2 == null) {
            return 1;
        }
        return c0883y.compareTo(c0883y2);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C0843m c0843m) {
        int iM1765b = m1765b(this.f1985a, c0843m.f1985a);
        return iM1765b != 0 ? iM1765b : m1765b(this.f1986b, c0843m.f1986b);
    }

    /* JADX INFO: renamed from: a */
    public final C0883y m1767a() {
        return this.f1985a;
    }

    /* JADX INFO: renamed from: b */
    public final C0883y m1768b() {
        return this.f1986b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0843m) && compareTo((C0843m) obj) == 0;
    }

    public final int hashCode() {
        return ((this.f1985a == null ? 0 : this.f1985a.hashCode()) * 31) + (this.f1986b != null ? this.f1986b.hashCode() : 0);
    }

    public final String toString() {
        if (this.f1985a != null && this.f1986b == null) {
            return this.f1985a.m1910i();
        }
        if (this.f1985a == null && this.f1986b == null) {
            return "";
        }
        return "[" + (this.f1985a == null ? "" : this.f1985a.m1910i()) + "|" + (this.f1986b == null ? "" : this.f1986b.m1910i());
    }
}
