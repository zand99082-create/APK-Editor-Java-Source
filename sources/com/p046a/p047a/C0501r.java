package com.p046a.p047a;

import java.util.AbstractList;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.a.a.r */
/* JADX INFO: loaded from: classes.dex */
final class C0501r extends AbstractList implements RandomAccess {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C0492i f736a;

    private C0501r(C0492i c0492i) {
        this.f736a = c0492i;
    }

    /* synthetic */ C0501r(C0492i c0492i, byte b2) {
        this(c0492i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return this.f736a.f717e.get(this.f736a.m623c(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f736a.f715c.f756c.f674b;
    }
}
