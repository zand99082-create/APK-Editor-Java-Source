package com.p046a.p049b.p050a.p052b;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p047a.p048a.C0482d;
import com.p046a.p049b.p066f.p068b.C0848r;
import com.p046a.p049b.p066f.p070d.C0887c;
import com.p046a.p049b.p066f.p070d.InterfaceC0888d;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.a.b.a.b.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0564t extends AbstractC0563s {

    /* JADX INFO: renamed from: a */
    private final C0566v f913a;

    /* JADX INFO: renamed from: b */
    private final ArrayList f914b;

    public C0564t(int i) {
        super(i != 0);
        this.f913a = new C0566v(i);
        this.f914b = new ArrayList();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private C0564t(C0564t c0564t) {
        super(c0564t.f913a.m924f() > 0);
        this.f913a = c0564t.f913a.mo905a();
        this.f914b = new ArrayList(c0564t.f914b.size());
        int size = c0564t.f914b.size();
        for (int i = 0; i < size; i++) {
            AbstractC0563s abstractC0563s = (AbstractC0563s) c0564t.f914b.get(i);
            if (abstractC0563s == null) {
                this.f914b.add(null);
            } else {
                this.f914b.add(abstractC0563s.mo905a());
            }
        }
    }

    private C0564t(C0566v c0566v, ArrayList arrayList) {
        super(c0566v.m924f() > 0);
        this.f913a = c0566v;
        this.f914b = arrayList;
    }

    /* JADX INFO: renamed from: a */
    private C0564t m914a(C0564t c0564t) {
        AbstractC0563s abstractC0563sMo906a;
        C0566v c0566vM920a = this.f913a.m920a(c0564t.f913a);
        int size = this.f914b.size();
        int size2 = c0564t.f914b.size();
        int iMax = Math.max(size, size2);
        ArrayList arrayList = new ArrayList(iMax);
        int i = 0;
        boolean z = false;
        while (i < iMax) {
            AbstractC0563s abstractC0563s = i < size ? (AbstractC0563s) this.f914b.get(i) : null;
            AbstractC0563s abstractC0563s2 = i < size2 ? (AbstractC0563s) c0564t.f914b.get(i) : null;
            if (abstractC0563s == abstractC0563s2) {
                abstractC0563sMo906a = abstractC0563s;
            } else if (abstractC0563s == null) {
                abstractC0563sMo906a = abstractC0563s2;
            } else if (abstractC0563s2 == null) {
                abstractC0563sMo906a = abstractC0563s;
            } else {
                try {
                    abstractC0563sMo906a = abstractC0563s.mo906a(abstractC0563s2);
                } catch (C0541ah e) {
                    e.m573a("Merging locals set for caller block " + C1067a.m2558v(i));
                    abstractC0563sMo906a = null;
                }
            }
            boolean z2 = z || abstractC0563s != abstractC0563sMo906a;
            arrayList.add(abstractC0563sMo906a);
            i++;
            z = z2;
        }
        return (this.f913a != c0566vM920a || z) ? new C0564t(c0566vM920a, arrayList) : this;
    }

    /* JADX INFO: renamed from: a */
    private C0564t m915a(C0566v c0566v) {
        C0566v c0566vM920a = this.f913a.m920a(c0566v.mo913b());
        ArrayList arrayList = new ArrayList(this.f914b.size());
        int size = this.f914b.size();
        int i = 0;
        boolean z = false;
        while (i < size) {
            AbstractC0563s abstractC0563s = (AbstractC0563s) this.f914b.get(i);
            AbstractC0563s abstractC0563sMo906a = null;
            if (abstractC0563s != null) {
                try {
                    abstractC0563sMo906a = abstractC0563s.mo906a(c0566v);
                } catch (C0541ah e) {
                    e.m573a("Merging one locals against caller block " + C1067a.m2558v(i));
                }
            }
            boolean z2 = z || abstractC0563s != abstractC0563sMo906a;
            arrayList.add(abstractC0563sMo906a);
            i++;
            z = z2;
        }
        return (this.f913a != c0566vM920a || z) ? new C0564t(c0566vM920a, arrayList) : this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.p046a.p049b.p050a.p052b.AbstractC0563s
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0564t mo906a(AbstractC0563s abstractC0563s) {
        try {
            C0564t c0564tM914a = abstractC0563s instanceof C0564t ? m914a((C0564t) abstractC0563s) : m915a((C0566v) abstractC0563s);
            c0564tM914a.mo811b_();
            return c0564tM914a;
        } catch (C0541ah e) {
            e.m573a("underlay locals:");
            mo910a(e);
            e.m573a("overlay locals:");
            abstractC0563s.mo910a(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: c */
    private AbstractC0563s m917c(int i) {
        if (i >= this.f914b.size()) {
            return null;
        }
        return (AbstractC0563s) this.f914b.get(i);
    }

    @Override // com.p046a.p049b.p050a.p052b.AbstractC0563s
    /* JADX INFO: renamed from: a */
    public final AbstractC0563s mo905a() {
        return new C0564t(this);
    }

    @Override // com.p046a.p049b.p050a.p052b.AbstractC0563s
    /* JADX INFO: renamed from: a */
    public final C0564t mo907a(AbstractC0563s abstractC0563s, int i) {
        AbstractC0563s abstractC0563sM917c = m917c(i);
        C0566v c0566vM920a = this.f913a.m920a(abstractC0563s.mo913b());
        AbstractC0563s abstractC0563sMo906a = abstractC0563sM917c == abstractC0563s ? abstractC0563sM917c : abstractC0563sM917c == null ? abstractC0563s : abstractC0563sM917c.mo906a(abstractC0563s);
        if (abstractC0563sMo906a == abstractC0563sM917c && c0566vM920a == this.f913a) {
            return this;
        }
        int size = this.f914b.size();
        int iMax = Math.max(i + 1, size);
        ArrayList arrayList = new ArrayList(iMax);
        int i2 = 0;
        C0566v c0566v = null;
        while (i2 < iMax) {
            AbstractC0563s abstractC0563s2 = i2 == i ? abstractC0563sMo906a : i2 < size ? (AbstractC0563s) this.f914b.get(i2) : null;
            C0566v c0566vMo913b = abstractC0563s2 != null ? c0566v == null ? abstractC0563s2.mo913b() : c0566v.m920a(abstractC0563s2.mo913b()) : c0566v;
            arrayList.add(abstractC0563s2);
            i2++;
            c0566v = c0566vMo913b;
        }
        C0564t c0564t = new C0564t(c0566v, arrayList);
        c0564t.mo811b_();
        return c0564t;
    }

    @Override // com.p046a.p049b.p050a.p052b.AbstractC0563s
    /* JADX INFO: renamed from: a */
    public final InterfaceC0888d mo908a(int i) {
        return this.f913a.mo908a(i);
    }

    @Override // com.p046a.p049b.p050a.p052b.AbstractC0563s
    /* JADX INFO: renamed from: a */
    public final void mo909a(int i, InterfaceC0888d interfaceC0888d) {
        m2266l();
        this.f913a.mo909a(i, interfaceC0888d);
        for (AbstractC0563s abstractC0563s : this.f914b) {
            if (abstractC0563s != null) {
                abstractC0563s.mo909a(i, interfaceC0888d);
            }
        }
    }

    @Override // com.p046a.p049b.p050a.p052b.AbstractC0563s
    /* JADX INFO: renamed from: a */
    public final void mo910a(C0482d c0482d) {
        c0482d.m573a("(locals array set; primary)");
        this.f913a.mo910a(c0482d);
        int size = this.f914b.size();
        for (int i = 0; i < size; i++) {
            AbstractC0563s abstractC0563s = (AbstractC0563s) this.f914b.get(i);
            if (abstractC0563s != null) {
                c0482d.m573a("(locals array set: primary for caller " + C1067a.m2558v(i) + ')');
                abstractC0563s.mo913b().mo910a(c0482d);
            }
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
        if (this.f913a.m924f() == 0) {
            return;
        }
        m2266l();
        this.f913a.mo912a(c0887c);
        for (AbstractC0563s abstractC0563s : this.f914b) {
            if (abstractC0563s != null) {
                abstractC0563s.mo912a(c0887c);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC0563s m918b(int i) {
        return m917c(i);
    }

    @Override // com.p046a.p049b.p050a.p052b.AbstractC0563s
    /* JADX INFO: renamed from: b */
    protected final C0566v mo913b() {
        return this.f913a;
    }

    @Override // com.p046a.p049b.p073h.C0968p
    /* JADX INFO: renamed from: b_ */
    public final void mo811b_() {
        this.f913a.mo811b_();
        for (AbstractC0563s abstractC0563s : this.f914b) {
            if (abstractC0563s != null) {
                abstractC0563s.mo811b_();
            }
        }
        super.mo811b_();
    }

    @Override // com.p046a.p049b.p073h.InterfaceC0971s
    /* JADX INFO: renamed from: d */
    public final String mo919d() {
        StringBuilder sb = new StringBuilder();
        sb.append("(locals array set; primary)\n");
        sb.append(this.f913a.mo919d());
        sb.append('\n');
        int size = this.f914b.size();
        for (int i = 0; i < size; i++) {
            AbstractC0563s abstractC0563s = (AbstractC0563s) this.f914b.get(i);
            if (abstractC0563s != null) {
                sb.append("(locals array set: primary for caller " + C1067a.m2558v(i) + ")\n");
                sb.append(abstractC0563s.mo913b().mo919d());
                sb.append('\n');
            }
        }
        return sb.toString();
    }
}
