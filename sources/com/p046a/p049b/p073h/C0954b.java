package com.p046a.p049b.p073h;

import com.gmail.heagoo.p084a.p089c.C1067a;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.a.b.h.b */
/* JADX INFO: loaded from: classes.dex */
final class C0954b implements InterfaceC0961i {

    /* JADX INFO: renamed from: a */
    private int f2559a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C0953a f2560b;

    C0954b(C0953a c0953a) {
        this.f2560b = c0953a;
        this.f2559a = C1067a.m2524d(this.f2560b.f2558a, 0);
    }

    @Override // com.p046a.p049b.p073h.InterfaceC0961i
    /* JADX INFO: renamed from: a */
    public final boolean mo2210a() {
        return this.f2559a >= 0;
    }

    @Override // com.p046a.p049b.p073h.InterfaceC0961i
    /* JADX INFO: renamed from: b */
    public final int mo2211b() {
        if (!mo2210a()) {
            throw new NoSuchElementException();
        }
        int i = this.f2559a;
        this.f2559a = C1067a.m2524d(this.f2560b.f2558a, this.f2559a + 1);
        return i;
    }
}
