package com.p046a.p049b.p066f.p068b;

import com.p046a.p049b.p066f.p070d.InterfaceC0888d;

/* JADX INFO: renamed from: com.a.b.f.b.s */
/* JADX INFO: loaded from: classes.dex */
final class C0849s {

    /* JADX INFO: renamed from: a */
    private int f2000a;

    /* JADX INFO: renamed from: b */
    private InterfaceC0888d f2001b;

    /* JADX INFO: renamed from: c */
    private C0843m f2002c;

    private C0849s() {
    }

    /* synthetic */ C0849s(byte b2) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public final C0848r m1806a() {
        return new C0848r(this.f2000a, this.f2001b, this.f2002c, (byte) 0);
    }

    /* JADX INFO: renamed from: a */
    public final void m1807a(int i, InterfaceC0888d interfaceC0888d, C0843m c0843m) {
        this.f2000a = i;
        this.f2001b = interfaceC0888d;
        this.f2002c = c0843m;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0848r) {
            return ((C0848r) obj).m1785e(this.f2000a, this.f2001b, this.f2002c);
        }
        return false;
    }

    public final int hashCode() {
        return C0848r.m1786f(this.f2000a, this.f2001b, this.f2002c);
    }
}
