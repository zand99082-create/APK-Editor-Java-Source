package com.p046a.p047a;

import java.util.AbstractList;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.a.a.p */
/* JADX INFO: loaded from: classes.dex */
final class C0499p extends AbstractList implements RandomAccess {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C0492i f734a;

    private C0499p(C0492i c0492i) {
        this.f734a = c0492i;
    }

    /* synthetic */ C0499p(C0492i c0492i, byte b2) {
        this(c0492i);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String get(int i) {
        C0492i.m612b(i, this.f734a.f715c.f755b.f674b);
        return this.f734a.m616a(this.f734a.f715c.f755b.f675c + (i << 2)).m653f();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f734a.f715c.f755b.f674b;
    }
}
