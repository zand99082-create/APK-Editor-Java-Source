package com.p046a.p049b.p050a.p054d;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p050a.p055e.C0596i;
import com.p046a.p049b.p050a.p055e.C0598k;
import com.p046a.p049b.p050a.p055e.InterfaceC0589b;
import com.p046a.p049b.p050a.p055e.InterfaceC0593f;
import com.p046a.p049b.p050a.p055e.InterfaceC0597j;
import com.p046a.p049b.p066f.p069c.C0881w;
import com.p046a.p049b.p066f.p069c.C0883y;
import com.p046a.p049b.p066f.p069c.C0884z;
import com.p046a.p049b.p066f.p069c.InterfaceC0860b;
import com.p046a.p049b.p073h.C0955c;

/* JADX INFO: renamed from: com.a.b.a.d.n */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0585n {

    /* JADX INFO: renamed from: a */
    private final C0582k f974a;

    /* JADX INFO: renamed from: b */
    private final C0884z f975b;

    /* JADX INFO: renamed from: c */
    private final int f976c;

    /* JADX INFO: renamed from: d */
    private final C0573b f977d;

    /* JADX INFO: renamed from: e */
    private int f978e;

    /* JADX INFO: renamed from: f */
    private InterfaceC0597j f979f;

    public AbstractC0585n(C0582k c0582k, C0884z c0884z, int i, C0573b c0573b) {
        if (c0582k == null) {
            throw new NullPointerException("cf == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("offset < 0");
        }
        if (c0573b == null) {
            throw new NullPointerException("attributeFactory == null");
        }
        this.f974a = c0582k;
        this.f975b = c0884z;
        this.f976c = i;
        this.f977d = c0573b;
        this.f978e = -1;
    }

    /* JADX INFO: renamed from: a */
    protected abstract InterfaceC0593f mo1022a(int i, int i2, C0881w c0881w, InterfaceC0589b interfaceC0589b);

    /* JADX INFO: renamed from: a */
    protected abstract String mo1024a(int i);

    /* JADX INFO: renamed from: a */
    public final void m1027a(InterfaceC0597j interfaceC0597j) {
        this.f979f = interfaceC0597j;
    }

    /* JADX INFO: renamed from: b */
    protected abstract String mo1025b();

    /* JADX INFO: renamed from: c */
    protected abstract int mo1026c();

    /* JADX INFO: renamed from: d */
    public final int m1028d() {
        m1029e();
        return this.f978e;
    }

    /* JADX INFO: renamed from: e */
    protected final void m1029e() {
        if (this.f978e < 0) {
            int iMo1026c = mo1026c();
            int iM1030f = m1030f();
            int i = this.f976c + 2;
            C0955c c0955cM1007b = this.f974a.m1007b();
            InterfaceC0860b interfaceC0860bM1012g = this.f974a.m1012g();
            if (this.f979f != null) {
                new StringBuilder().append(mo1025b()).append("s_count: ").append(C1067a.m2558v(iM1030f));
            }
            int iM985a = i;
            for (int i2 = 0; i2 < iM1030f; i2++) {
                try {
                    int iM2228f = c0955cM1007b.m2228f(iM985a);
                    int iM2228f2 = c0955cM1007b.m2228f(iM985a + 2);
                    int iM2228f3 = c0955cM1007b.m2228f(iM985a + 4);
                    C0883y c0883y = (C0883y) interfaceC0860bM1012g.mo1869a(iM2228f2);
                    C0883y c0883y2 = (C0883y) interfaceC0860bM1012g.mo1869a(iM2228f3);
                    if (this.f979f != null) {
                        c0883y.m1911j();
                        c0883y2.m1911j();
                        new StringBuilder("\n").append(mo1025b()).append("s[").append(i2).append("]:\n");
                        new StringBuilder("access_flags: ").append(mo1024a(iM2228f));
                        new StringBuilder("name: ").append(c0883y.mo919d());
                        new StringBuilder("descriptor: ").append(c0883y2.mo919d());
                    }
                    C0574c c0574c = new C0574c(this.f974a, iMo1026c, iM985a + 6, this.f977d);
                    c0574c.m986a(this.f979f);
                    iM985a = c0574c.m985a();
                    C0598k c0598kM987b = c0574c.m987b();
                    c0598kM987b.mo811b_();
                    mo1022a(i2, iM2228f, new C0881w(c0883y, c0883y2), c0598kM987b);
                    if (this.f979f != null) {
                        new StringBuilder("end ").append(mo1025b()).append("s[").append(i2).append("]\n");
                        c0883y.m1911j();
                        c0883y2.m1911j();
                    }
                } catch (C0596i e) {
                    e.m573a("...while parsing " + mo1025b() + "s[" + i2 + "]");
                    throw e;
                } catch (RuntimeException e2) {
                    C0596i c0596i = new C0596i(e2);
                    c0596i.m573a("...while parsing " + mo1025b() + "s[" + i2 + "]");
                    throw c0596i;
                }
            }
            this.f978e = iM985a;
        }
    }

    /* JADX INFO: renamed from: f */
    protected final int m1030f() {
        return this.f974a.m1007b().m2228f(this.f976c);
    }

    /* JADX INFO: renamed from: g */
    protected final C0884z m1031g() {
        return this.f975b;
    }
}
