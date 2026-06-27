package com.p046a.p047a;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.a.a.k */
/* JADX INFO: loaded from: classes.dex */
final class C0494k implements Iterator {

    /* JADX INFO: renamed from: a */
    private final C0498o f724a;

    /* JADX INFO: renamed from: b */
    private int f725b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ C0492i f726c;

    private C0494k(C0492i c0492i) {
        this.f726c = c0492i;
        this.f724a = this.f726c.m616a(this.f726c.f715c.f760g.f675c);
        this.f725b = 0;
    }

    /* synthetic */ C0494k(C0492i c0492i, byte b2) {
        this(c0492i);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f725b < this.f726c.f715c.f760g.f674b;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f725b++;
        C0498o c0498o = this.f724a;
        return new C0488e(c0498o.f730a, c0498o.m640a(), c0498o.m647b(), c0498o.m647b(), c0498o.m647b(), c0498o.m647b(), c0498o.m647b(), c0498o.m647b(), c0498o.m647b(), c0498o.m647b());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
