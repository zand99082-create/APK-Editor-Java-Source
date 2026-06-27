package com.p046a.p047a;

import java.util.AbstractList;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.a.a.q */
/* JADX INFO: loaded from: classes.dex */
final class C0500q extends AbstractList implements RandomAccess {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C0492i f735a;

    private C0500q(C0492i c0492i) {
        this.f735a = c0492i;
    }

    /* synthetic */ C0500q(C0492i c0492i, byte b2) {
        this(c0492i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(this.f735a.m623c(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f735a.f715c.f756c.f674b;
    }
}
