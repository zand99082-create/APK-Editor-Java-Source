package com.p046a.p047a;

import java.util.AbstractList;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.a.a.n */
/* JADX INFO: loaded from: classes.dex */
final class C0497n extends AbstractList implements RandomAccess {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C0492i f729a;

    private C0497n(C0492i c0492i) {
        this.f729a = c0492i;
    }

    /* synthetic */ C0497n(C0492i c0492i, byte b2) {
        this(c0492i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        C0492i.m612b(i, this.f729a.f715c.f757d.f674b);
        return this.f729a.m616a(this.f729a.f715c.f757d.f675c + (i * 12)).m659i();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f729a.f715c.f757d.f674b;
    }
}
