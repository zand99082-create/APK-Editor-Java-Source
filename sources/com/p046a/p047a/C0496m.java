package com.p046a.p047a;

import java.util.AbstractList;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.a.a.m */
/* JADX INFO: loaded from: classes.dex */
final class C0496m extends AbstractList implements RandomAccess {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C0492i f728a;

    private C0496m(C0492i c0492i) {
        this.f728a = c0492i;
    }

    /* synthetic */ C0496m(C0492i c0492i, byte b2) {
        this(c0492i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        C0492i.m612b(i, this.f728a.f715c.f759f.f674b);
        return this.f728a.m616a(this.f728a.f715c.f759f.f675c + (i * 8)).m657h();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f728a.f715c.f759f.f674b;
    }
}
