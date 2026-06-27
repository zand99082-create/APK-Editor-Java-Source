package com.p046a.p049b.p065e;

import com.p046a.p047a.C0492i;

/* JADX INFO: renamed from: com.a.b.e.k */
/* JADX INFO: loaded from: classes.dex */
final class C0810k implements Comparable {

    /* JADX INFO: renamed from: a */
    final C0492i f1893a;

    /* JADX INFO: renamed from: b */
    final Comparable f1894b;

    /* JADX INFO: renamed from: c */
    final int f1895c;

    /* JADX INFO: renamed from: d */
    final int f1896d;

    C0810k(AbstractC0809j abstractC0809j, C0492i c0492i, C0812m c0812m, Comparable comparable, int i, int i2) {
        this.f1893a = c0492i;
        this.f1894b = comparable;
        this.f1895c = i;
        this.f1896d = i2;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C0810k c0810k) {
        return this.f1894b.compareTo(c0810k.f1894b);
    }
}
