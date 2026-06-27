package com.p046a.p049b.p050a.p052b;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p047a.p048a.C0482d;
import com.p046a.p049b.p066f.p070d.C0887c;
import com.p046a.p049b.p066f.p070d.InterfaceC0888d;
import com.p046a.p049b.p073h.C0968p;

/* JADX INFO: renamed from: com.a.b.a.b.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0557m extends C0968p {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0888d[] f897a;

    /* JADX INFO: renamed from: b */
    private final boolean[] f898b;

    /* JADX INFO: renamed from: c */
    private int f899c;

    public C0557m(int i) {
        super(i != 0);
        this.f897a = new InterfaceC0888d[i];
        this.f898b = new boolean[i];
        this.f899c = 0;
    }

    /* JADX INFO: renamed from: a */
    private static InterfaceC0888d m858a(String str) {
        throw new C0541ah("stack: " + str);
    }

    /* JADX INFO: renamed from: b */
    private static String m859b(InterfaceC0888d interfaceC0888d) {
        return interfaceC0888d == null ? "<invalid>" : interfaceC0888d.toString();
    }

    /* JADX INFO: renamed from: a */
    public final C0557m m860a() {
        C0557m c0557m = new C0557m(this.f897a.length);
        System.arraycopy(this.f897a, 0, c0557m.f897a, 0, this.f897a.length);
        System.arraycopy(this.f898b, 0, c0557m.f898b, 0, this.f898b.length);
        c0557m.f899c = this.f899c;
        return c0557m;
    }

    /* JADX INFO: renamed from: a */
    public final C0557m m861a(C0557m c0557m) {
        try {
            return C1067a.m2445a(this, c0557m);
        } catch (C0541ah e) {
            e.m573a("underlay stack:");
            m864a(e);
            e.m573a("overlay stack:");
            c0557m.m864a(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC0888d m862a(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("n < 0");
        }
        return i >= this.f899c ? m858a("underflow") : this.f897a[(this.f899c - i) - 1];
    }

    /* JADX INFO: renamed from: a */
    public final void m863a(int i, InterfaceC0888d interfaceC0888d) {
        m2266l();
        try {
            InterfaceC0888d interfaceC0888dMo926b = interfaceC0888d.mo926b();
            int i2 = (this.f899c - i) - 1;
            InterfaceC0888d interfaceC0888d2 = this.f897a[i2];
            if (interfaceC0888d2 == null || interfaceC0888d2.mo925a().m1949i() != interfaceC0888dMo926b.mo925a().m1949i()) {
                m858a("incompatible substitution: " + m859b(interfaceC0888d2) + " -> " + m859b(interfaceC0888dMo926b));
            }
            this.f897a[i2] = interfaceC0888dMo926b;
        } catch (NullPointerException e) {
            throw new NullPointerException("type == null");
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m864a(C0482d c0482d) {
        int i = this.f899c - 1;
        int i2 = 0;
        while (i2 <= i) {
            c0482d.m573a("stack[" + (i2 == i ? "top0" : C1067a.m2558v(i - i2)) + "]: " + m859b(this.f897a[i2]));
            i2++;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m865a(C0887c c0887c) {
        if (this.f899c == 0) {
            return;
        }
        m2266l();
        C0887c c0887cM1957q = c0887c.m1957q();
        for (int i = 0; i < this.f899c; i++) {
            if (this.f897a[i] == c0887c) {
                this.f897a[i] = c0887cM1957q;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m866a(InterfaceC0888d interfaceC0888d) {
        m2266l();
        try {
            InterfaceC0888d interfaceC0888dMo926b = interfaceC0888d.mo926b();
            int iM1949i = interfaceC0888dMo926b.mo925a().m1949i();
            if (this.f899c + iM1949i > this.f897a.length) {
                m858a("overflow");
                return;
            }
            if (iM1949i == 2) {
                this.f897a[this.f899c] = null;
                this.f899c++;
            }
            this.f897a[this.f899c] = interfaceC0888dMo926b;
            this.f899c++;
        } catch (NullPointerException e) {
            throw new NullPointerException("type == null");
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m867b() {
        return this.f899c;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m868b(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("n < 0");
        }
        if (i >= this.f899c) {
            throw new C0541ah("stack: underflow");
        }
        return this.f898b[(this.f899c - i) - 1];
    }

    /* JADX INFO: renamed from: c */
    public final C0887c m869c(int i) {
        return m862a(i).mo925a();
    }

    /* JADX INFO: renamed from: c */
    public final void m870c() {
        m2266l();
        for (int i = 0; i < this.f899c; i++) {
            this.f897a[i] = null;
            this.f898b[i] = false;
        }
        this.f899c = 0;
    }

    /* JADX INFO: renamed from: d */
    public final void m871d() {
        m2266l();
        this.f898b[this.f899c] = true;
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC0888d m872e() {
        m2266l();
        InterfaceC0888d interfaceC0888dM862a = m862a(0);
        this.f897a[this.f899c - 1] = null;
        this.f898b[this.f899c - 1] = false;
        this.f899c -= interfaceC0888dM862a.mo925a().m1949i();
        return interfaceC0888dM862a;
    }
}
