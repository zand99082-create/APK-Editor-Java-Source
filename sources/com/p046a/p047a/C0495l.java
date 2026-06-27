package com.p046a.p047a;

import java.util.AbstractList;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.a.a.l */
/* JADX INFO: loaded from: classes.dex */
final class C0495l extends AbstractList implements RandomAccess {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C0492i f727a;

    private C0495l(C0492i c0492i) {
        this.f727a = c0492i;
    }

    /* synthetic */ C0495l(C0492i c0492i, byte b2) {
        this(c0492i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        C0492i.m612b(i, this.f727a.f715c.f758e.f674b);
        return this.f727a.m616a(this.f727a.f715c.f758e.f675c + (i * 8)).m655g();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f727a.f715c.f758e.f674b;
    }
}
