package com.p046a.p049b.p058c.p060b;

import com.p046a.p049b.p066f.p069c.C0884z;

/* JADX INFO: renamed from: com.a.b.c.b.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0662e implements Comparable {

    /* JADX INFO: renamed from: a */
    private final C0884z f1102a;

    /* JADX INFO: renamed from: b */
    private final int f1103b;

    public C0662e(C0884z c0884z, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("handler < 0");
        }
        if (c0884z == null) {
            throw new NullPointerException("exceptionType == null");
        }
        this.f1103b = i;
        this.f1102a = c0884z;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C0662e c0662e) {
        if (this.f1103b < c0662e.f1103b) {
            return -1;
        }
        if (this.f1103b > c0662e.f1103b) {
            return 1;
        }
        return this.f1102a.compareTo(c0662e.f1102a);
    }

    /* JADX INFO: renamed from: a */
    public final C0884z m1188a() {
        return this.f1102a;
    }

    /* JADX INFO: renamed from: b */
    public final int m1189b() {
        return this.f1103b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0662e) && compareTo((C0662e) obj) == 0;
    }

    public final int hashCode() {
        return (this.f1103b * 31) + this.f1102a.hashCode();
    }
}
