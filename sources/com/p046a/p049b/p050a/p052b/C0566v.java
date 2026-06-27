package com.p046a.p049b.p050a.p052b;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p047a.p048a.C0482d;
import com.p046a.p049b.p066f.p068b.C0848r;
import com.p046a.p049b.p066f.p070d.C0887c;
import com.p046a.p049b.p066f.p070d.InterfaceC0888d;

/* JADX INFO: renamed from: com.a.b.a.b.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0566v extends AbstractC0563s {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0888d[] f915a;

    public C0566v(int i) {
        super(i != 0);
        this.f915a = new InterfaceC0888d[i];
    }

    @Override // com.p046a.p049b.p050a.p052b.AbstractC0563s
    /* JADX INFO: renamed from: a */
    public final AbstractC0563s mo906a(AbstractC0563s abstractC0563s) {
        return abstractC0563s instanceof C0566v ? m920a((C0566v) abstractC0563s) : abstractC0563s.mo906a(this);
    }

    @Override // com.p046a.p049b.p050a.p052b.AbstractC0563s
    /* JADX INFO: renamed from: a */
    public final C0564t mo907a(AbstractC0563s abstractC0563s, int i) {
        return new C0564t(this.f915a.length).mo907a(abstractC0563s, i);
    }

    /* JADX INFO: renamed from: a */
    public final C0566v m920a(C0566v c0566v) {
        try {
            return C1067a.m2446a(this, c0566v);
        } catch (C0541ah e) {
            e.m573a("underlay locals:");
            mo910a(e);
            e.m573a("overlay locals:");
            c0566v.mo910a(e);
            throw e;
        }
    }

    @Override // com.p046a.p049b.p050a.p052b.AbstractC0563s
    /* JADX INFO: renamed from: a */
    public final InterfaceC0888d mo908a(int i) {
        InterfaceC0888d interfaceC0888d = this.f915a[i];
        if (interfaceC0888d == null) {
            throw new C0541ah("local " + C1067a.m2558v(i) + ": invalid");
        }
        return interfaceC0888d;
    }

    @Override // com.p046a.p049b.p050a.p052b.AbstractC0563s
    /* JADX INFO: renamed from: a */
    public final void mo909a(int i, InterfaceC0888d interfaceC0888d) {
        InterfaceC0888d interfaceC0888d2;
        m2266l();
        try {
            InterfaceC0888d interfaceC0888dMo926b = interfaceC0888d.mo926b();
            if (i < 0) {
                throw new IndexOutOfBoundsException("idx < 0");
            }
            if (interfaceC0888dMo926b.mo925a().m1951k()) {
                this.f915a[i + 1] = null;
            }
            this.f915a[i] = interfaceC0888dMo926b;
            if (i == 0 || (interfaceC0888d2 = this.f915a[i - 1]) == null || !interfaceC0888d2.mo925a().m1951k()) {
                return;
            }
            this.f915a[i - 1] = null;
        } catch (NullPointerException e) {
            throw new NullPointerException("type == null");
        }
    }

    @Override // com.p046a.p049b.p050a.p052b.AbstractC0563s
    /* JADX INFO: renamed from: a */
    public final void mo910a(C0482d c0482d) {
        for (int i = 0; i < this.f915a.length; i++) {
            InterfaceC0888d interfaceC0888d = this.f915a[i];
            c0482d.m573a("locals[" + C1067a.m2558v(i) + "]: " + (interfaceC0888d == null ? "<invalid>" : interfaceC0888d.toString()));
        }
    }

    @Override // com.p046a.p049b.p050a.p052b.AbstractC0563s
    /* JADX INFO: renamed from: a */
    public final void mo911a(C0848r c0848r) {
        mo909a(c0848r.m1795g(), c0848r);
    }

    @Override // com.p046a.p049b.p050a.p052b.AbstractC0563s
    /* JADX INFO: renamed from: a */
    public final void mo912a(C0887c c0887c) {
        int length = this.f915a.length;
        if (length == 0) {
            return;
        }
        m2266l();
        C0887c c0887cM1957q = c0887c.m1957q();
        for (int i = 0; i < length; i++) {
            if (this.f915a[i] == c0887c) {
                this.f915a[i] = c0887cM1957q;
            }
        }
    }

    @Override // com.p046a.p049b.p050a.p052b.AbstractC0563s
    /* JADX INFO: renamed from: b */
    protected final C0566v mo913b() {
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final void m921b(int i) {
        m2266l();
        this.f915a[i] = null;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC0888d m922c(int i) {
        return this.f915a[i];
    }

    @Override // com.p046a.p049b.p073h.InterfaceC0971s
    /* JADX INFO: renamed from: d */
    public final String mo919d() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.f915a.length; i++) {
            InterfaceC0888d interfaceC0888d = this.f915a[i];
            sb.append("locals[" + C1067a.m2558v(i) + "]: " + (interfaceC0888d == null ? "<invalid>" : interfaceC0888d.toString()) + "\n");
        }
        return sb.toString();
    }

    @Override // com.p046a.p049b.p050a.p052b.AbstractC0563s
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final C0566v mo905a() {
        C0566v c0566v = new C0566v(this.f915a.length);
        System.arraycopy(this.f915a, 0, c0566v.f915a, 0, this.f915a.length);
        return c0566v;
    }

    /* JADX INFO: renamed from: f */
    public final int m924f() {
        return this.f915a.length;
    }
}
