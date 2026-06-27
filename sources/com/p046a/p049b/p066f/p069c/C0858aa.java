package com.p046a.p049b.p066f.p069c;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p047a.p048a.C0482d;
import com.p046a.p049b.p073h.C0968p;

/* JADX INFO: renamed from: com.a.b.f.c.aa */
/* JADX INFO: loaded from: classes.dex */
public final class C0858aa extends C0968p implements InterfaceC0860b {

    /* JADX INFO: renamed from: a */
    private final AbstractC0857a[] f2233a;

    public C0858aa(int i) {
        super(i > 1);
        if (i <= 0) {
            throw new IllegalArgumentException("size < 1");
        }
        this.f2233a = new AbstractC0857a[i];
    }

    /* JADX INFO: renamed from: d */
    private static AbstractC0857a m1867d(int i) {
        throw new C0482d("invalid constant pool index " + C1067a.m2558v(i));
    }

    @Override // com.p046a.p049b.p066f.p069c.InterfaceC0860b
    /* JADX INFO: renamed from: a */
    public final int mo1868a() {
        return this.f2233a.length;
    }

    @Override // com.p046a.p049b.p066f.p069c.InterfaceC0860b
    /* JADX INFO: renamed from: a */
    public final AbstractC0857a mo1869a(int i) {
        try {
            AbstractC0857a abstractC0857a = this.f2233a[i];
            if (abstractC0857a != null) {
                return abstractC0857a;
            }
            m1867d(i);
            return abstractC0857a;
        } catch (IndexOutOfBoundsException e) {
            return m1867d(i);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1870a(int i, AbstractC0857a abstractC0857a) {
        AbstractC0857a abstractC0857a2;
        m2266l();
        boolean z = abstractC0857a != null && abstractC0857a.mo1865g();
        if (i <= 0) {
            throw new IllegalArgumentException("n < 1");
        }
        if (z) {
            if (i == this.f2233a.length - 1) {
                throw new IllegalArgumentException("(n == size - 1) && cst.isCategory2()");
            }
            this.f2233a[i + 1] = null;
        }
        if (abstractC0857a != null && this.f2233a[i] == null && (abstractC0857a2 = this.f2233a[i - 1]) != null && abstractC0857a2.mo1865g()) {
            this.f2233a[i - 1] = null;
        }
        this.f2233a[i] = abstractC0857a;
    }

    @Override // com.p046a.p049b.p066f.p069c.InterfaceC0860b
    /* JADX INFO: renamed from: b */
    public final AbstractC0857a mo1871b(int i) {
        if (i == 0) {
            return null;
        }
        return mo1869a(i);
    }

    @Override // com.p046a.p049b.p066f.p069c.InterfaceC0860b
    /* JADX INFO: renamed from: c */
    public final AbstractC0857a mo1872c(int i) {
        try {
            return this.f2233a[i];
        } catch (IndexOutOfBoundsException e) {
            return m1867d(i);
        }
    }
}
