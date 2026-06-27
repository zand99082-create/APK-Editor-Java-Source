package com.p046a.p047a;

import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: com.a.a.j */
/* JADX INFO: loaded from: classes.dex */
final class C0493j implements Iterable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C0492i f723a;

    private C0493j(C0492i c0492i) {
        this.f723a = c0492i;
    }

    /* synthetic */ C0493j(C0492i c0492i, byte b2) {
        this(c0492i);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return !this.f723a.f715c.f760g.m574a() ? Collections.emptySet().iterator() : new C0494k(this.f723a, (byte) 0);
    }
}
