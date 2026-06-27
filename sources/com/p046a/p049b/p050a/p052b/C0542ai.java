package com.p046a.p049b.p050a.p052b;

import com.p046a.p049b.p066f.p070d.C0887c;

/* JADX INFO: renamed from: com.a.b.a.b.ai */
/* JADX INFO: loaded from: classes.dex */
public final class C0542ai {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0565u f854a;

    /* JADX INFO: renamed from: b */
    private final C0552h f855b;

    /* JADX INFO: renamed from: c */
    private final C0561q f856c;

    /* JADX INFO: renamed from: d */
    private final C0543aj f857d;

    public C0542ai(InterfaceC0565u interfaceC0565u, C0556l c0556l) {
        if (interfaceC0565u == null) {
            throw new NullPointerException("machine == null");
        }
        if (c0556l == null) {
            throw new NullPointerException("method == null");
        }
        this.f854a = interfaceC0565u;
        this.f855b = c0556l.m855k();
        this.f856c = c0556l.m857m();
        this.f857d = new C0543aj(this);
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ C0541ah m790a() {
        return new C0541ah("stack mismatch: illegal top-of-stack for opcode");
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ C0887c m792a(C0887c c0887c, C0887c c0887c2) {
        if (c0887c2 != C0887c.f2351j) {
            if (c0887c == C0887c.f2355n && c0887c2.m1955o() && c0887c2.m1959s().m1954n()) {
                return c0887c2;
            }
            if (c0887c == C0887c.f2343b && c0887c2 == C0887c.f2332A) {
                return C0887c.f2332A;
            }
        }
        return c0887c.m1958r();
    }

    /* JADX INFO: renamed from: a */
    public final void m794a(C0547c c0547c, C0558n c0558n) {
        int iM823c = c0547c.m823c();
        this.f857d.m805a(c0558n);
        try {
            int iM822b = c0547c.m822b();
            while (iM822b < iM823c) {
                int iM839a = this.f855b.m839a(iM822b, this.f857d);
                this.f857d.mo797a(iM822b);
                iM822b += iM839a;
            }
        } catch (C0541ah e) {
            c0558n.m878a(e);
            throw e;
        }
    }
}
