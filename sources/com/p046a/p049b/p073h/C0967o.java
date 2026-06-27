package com.p046a.p049b.p073h;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.a.b.h.o */
/* JADX INFO: loaded from: classes.dex */
final class C0967o implements InterfaceC0961i {

    /* JADX INFO: renamed from: a */
    private int f2583a = 0;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C0966n f2584b;

    C0967o(C0966n c0966n) {
        this.f2584b = c0966n;
    }

    @Override // com.p046a.p049b.p073h.InterfaceC0961i
    /* JADX INFO: renamed from: a */
    public final boolean mo2210a() {
        return this.f2583a < this.f2584b.f2582a.m2247b();
    }

    @Override // com.p046a.p049b.p073h.InterfaceC0961i
    /* JADX INFO: renamed from: b */
    public final int mo2211b() {
        if (!mo2210a()) {
            throw new NoSuchElementException();
        }
        C0962j c0962j = this.f2584b.f2582a;
        int i = this.f2583a;
        this.f2583a = i + 1;
        return c0962j.m2248b(i);
    }
}
