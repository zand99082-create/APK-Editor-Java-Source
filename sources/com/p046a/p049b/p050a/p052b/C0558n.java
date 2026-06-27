package com.p046a.p049b.p050a.p052b;

import com.p046a.p047a.p048a.C0482d;
import com.p046a.p049b.p066f.p069c.C0884z;
import com.p046a.p049b.p066f.p070d.C0886b;
import com.p046a.p049b.p066f.p070d.C0887c;
import com.p046a.p049b.p073h.C0962j;

/* JADX INFO: renamed from: com.a.b.a.b.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0558n {

    /* JADX INFO: renamed from: a */
    private final AbstractC0563s f900a;

    /* JADX INFO: renamed from: b */
    private final C0557m f901b;

    /* JADX INFO: renamed from: c */
    private final C0962j f902c;

    public C0558n(int i, int i2) {
        this(new C0566v(i), new C0557m(i2));
    }

    private C0558n(AbstractC0563s abstractC0563s, C0557m c0557m) {
        this(abstractC0563s, c0557m, C0962j.f2577a);
    }

    private C0558n(AbstractC0563s abstractC0563s, C0557m c0557m, C0962j c0962j) {
        if (abstractC0563s == null) {
            throw new NullPointerException("locals == null");
        }
        if (c0557m == null) {
            throw new NullPointerException("stack == null");
        }
        c0962j.m2267m();
        this.f900a = abstractC0563s;
        this.f901b = c0557m;
        this.f902c = c0962j;
    }

    /* JADX INFO: renamed from: a */
    public final C0558n m873a() {
        return new C0558n(this.f900a.mo905a(), this.f901b.m860a(), this.f902c);
    }

    /* JADX INFO: renamed from: a */
    public final C0558n m874a(int i, int i2) {
        AbstractC0563s abstractC0563sM918b = this.f900a instanceof C0564t ? ((C0564t) this.f900a).m918b(i2) : null;
        try {
            C0962j c0962jM2257f = this.f902c.m2257f();
            if (c0962jM2257f.m2254e() != i) {
                throw new RuntimeException("returning from invalid subroutine");
            }
            c0962jM2257f.mo811b_();
            if (abstractC0563sM918b == null) {
                return null;
            }
            return new C0558n(abstractC0563sM918b, this.f901b, c0962jM2257f);
        } catch (IndexOutOfBoundsException e) {
            throw new RuntimeException("returning from invalid subroutine");
        } catch (NullPointerException e2) {
            throw new NullPointerException("can't return from non-subroutine");
        }
    }

    /* JADX INFO: renamed from: a */
    public final C0558n m875a(C0558n c0558n) {
        C0962j c0962j;
        AbstractC0563s abstractC0563sMo906a = this.f900a.mo906a(c0558n.f900a);
        C0557m c0557mM861a = this.f901b.m861a(c0558n.f901b);
        C0962j c0962j2 = c0558n.f902c;
        if (this.f902c.equals(c0962j2)) {
            c0962j = this.f902c;
        } else {
            c0962j = new C0962j();
            int iM2247b = this.f902c.m2247b();
            int iM2247b2 = c0962j2.m2247b();
            for (int i = 0; i < iM2247b && i < iM2247b2 && this.f902c.m2248b(i) == c0962j2.m2248b(i); i++) {
                c0962j.m2250c(i);
            }
            c0962j.mo811b_();
        }
        if (abstractC0563sMo906a instanceof C0564t) {
            abstractC0563sMo906a = (C0564t) abstractC0563sMo906a;
            if (c0962j.m2247b() == 0) {
                abstractC0563sMo906a = abstractC0563sMo906a.mo913b();
            }
        }
        return (abstractC0563sMo906a == this.f900a && c0557mM861a == this.f901b && this.f902c == c0962j) ? this : new C0558n(abstractC0563sMo906a, c0557mM861a, c0962j);
    }

    /* JADX INFO: renamed from: a */
    public final C0558n m876a(C0558n c0558n, int i, int i2) {
        C0962j c0962j;
        C0564t c0564tMo907a = this.f900a.mo907a(c0558n.f900a, i2);
        C0557m c0557mM861a = this.f901b.m861a(c0558n.f901b);
        C0962j c0962jM2257f = c0558n.f902c.m2257f();
        c0962jM2257f.m2250c(i);
        c0962jM2257f.mo811b_();
        if (c0564tMo907a == this.f900a && c0557mM861a == this.f901b && this.f902c.equals(c0962jM2257f)) {
            return this;
        }
        if (this.f902c.equals(c0962jM2257f)) {
            c0962j = this.f902c;
        } else {
            if (this.f902c.m2247b() > c0962jM2257f.m2247b()) {
                c0962j = this.f902c;
            } else {
                c0962jM2257f = this.f902c;
                c0962j = c0962jM2257f;
            }
            int iM2247b = c0962j.m2247b();
            int iM2247b2 = c0962jM2257f.m2247b();
            for (int i3 = iM2247b2 - 1; i3 >= 0; i3--) {
                if (c0962jM2257f.m2248b(i3) != c0962j.m2248b((iM2247b - iM2247b2) + i3)) {
                    throw new RuntimeException("Incompatible merged subroutines");
                }
            }
        }
        return new C0558n(c0564tMo907a, c0557mM861a, c0962j);
    }

    /* JADX INFO: renamed from: a */
    public final C0558n m877a(C0884z c0884z) {
        C0557m c0557mM860a = this.f901b.m860a();
        c0557mM860a.m870c();
        c0557mM860a.m866a(c0884z);
        return new C0558n(this.f900a, c0557mM860a, this.f902c);
    }

    /* JADX INFO: renamed from: a */
    public final void m878a(C0482d c0482d) {
        this.f900a.mo910a(c0482d);
        this.f901b.m864a(c0482d);
    }

    /* JADX INFO: renamed from: a */
    public final void m879a(C0886b c0886b) {
        int iD_ = c0886b.m2239d_();
        int iM1949i = 0;
        for (int i = 0; i < iD_; i++) {
            C0887c c0887cM1938b = c0886b.m1938b(i);
            this.f900a.mo909a(iM1949i, c0887cM1938b);
            iM1949i += c0887cM1938b.m1949i();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m880a(C0887c c0887c) {
        this.f900a.mo912a(c0887c);
        this.f901b.m865a(c0887c);
    }

    /* JADX INFO: renamed from: b */
    public final C0558n m881b(int i, int i2) {
        this.f902c.m2257f().m2250c(i);
        return new C0558n(this.f900a.mo913b(), this.f901b, C0962j.m2244a(i)).m876a(this, i, i2);
    }

    /* JADX INFO: renamed from: b */
    public final void m882b() {
        this.f900a.mo811b_();
        this.f901b.mo811b_();
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC0563s m883c() {
        return this.f900a;
    }

    /* JADX INFO: renamed from: d */
    public final C0557m m884d() {
        return this.f901b;
    }

    /* JADX INFO: renamed from: e */
    public final C0962j m885e() {
        return this.f902c;
    }
}
