package com.p046a.p049b.p050a.p052b;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p066f.p068b.C0843m;
import com.p046a.p049b.p066f.p068b.C0848r;
import com.p046a.p049b.p066f.p069c.AbstractC0857a;
import com.p046a.p049b.p066f.p070d.C0885a;
import com.p046a.p049b.p066f.p070d.C0886b;
import com.p046a.p049b.p066f.p070d.C0887c;
import com.p046a.p049b.p066f.p070d.InterfaceC0888d;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.a.b.a.b.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0533a implements InterfaceC0565u {

    /* JADX INFO: renamed from: a */
    private final C0885a f805a;

    /* JADX INFO: renamed from: b */
    private InterfaceC0888d[] f806b;

    /* JADX INFO: renamed from: c */
    private int f807c;

    /* JADX INFO: renamed from: d */
    private C0887c f808d;

    /* JADX INFO: renamed from: e */
    private int f809e;

    /* JADX INFO: renamed from: f */
    private AbstractC0857a f810f;

    /* JADX INFO: renamed from: g */
    private int f811g;

    /* JADX INFO: renamed from: h */
    private C0544ak f812h;

    /* JADX INFO: renamed from: i */
    private ArrayList f813i;

    /* JADX INFO: renamed from: j */
    private int f814j;

    /* JADX INFO: renamed from: k */
    private boolean f815k;

    /* JADX INFO: renamed from: l */
    private C0848r f816l;

    /* JADX INFO: renamed from: m */
    private InterfaceC0888d[] f817m;

    /* JADX INFO: renamed from: n */
    private int f818n;

    public AbstractC0533a(C0885a c0885a) {
        if (c0885a == null) {
            throw new NullPointerException("prototype == null");
        }
        this.f805a = c0885a;
        this.f806b = new InterfaceC0888d[10];
        this.f817m = new InterfaceC0888d[6];
        mo746b();
    }

    /* JADX INFO: renamed from: a */
    public static void m729a(InterfaceC0888d interfaceC0888d, InterfaceC0888d interfaceC0888d2) {
        throw new C0541ah("local variable type mismatch: attempt to set or access a value of type " + interfaceC0888d.mo919d() + " using a local variable of type " + interfaceC0888d2.mo919d() + ". This is symptomatic of .class transformation tools that ignore local variable information.");
    }

    @Override // com.p046a.p049b.p050a.p052b.InterfaceC0565u
    /* JADX INFO: renamed from: a */
    public final C0885a mo730a() {
        return this.f805a;
    }

    @Override // com.p046a.p049b.p050a.p052b.InterfaceC0565u
    /* JADX INFO: renamed from: a */
    public final void mo731a(int i) {
        this.f809e = i;
    }

    @Override // com.p046a.p049b.p050a.p052b.InterfaceC0565u
    /* JADX INFO: renamed from: a */
    public final void mo732a(int i, C0887c c0887c, C0843m c0843m) {
        this.f816l = C0848r.m1782b(i, c0887c, c0843m);
    }

    @Override // com.p046a.p049b.p050a.p052b.InterfaceC0565u
    /* JADX INFO: renamed from: a */
    public final void mo733a(C0544ak c0544ak) {
        if (c0544ak == null) {
            throw new NullPointerException("cases == null");
        }
        this.f812h = c0544ak;
    }

    /* JADX INFO: renamed from: a */
    protected final void m734a(C0558n c0558n) {
        if (this.f818n < 0) {
            throw new C0541ah("results never set");
        }
        if (this.f818n == 0) {
            return;
        }
        if (this.f816l != null) {
            c0558n.m883c().mo911a(m745b(false));
            return;
        }
        C0557m c0557mM884d = c0558n.m884d();
        for (int i = 0; i < this.f818n; i++) {
            if (this.f815k) {
                c0557mM884d.m871d();
            }
            c0557mM884d.m866a(this.f817m[i]);
        }
    }

    @Override // com.p046a.p049b.p050a.p052b.InterfaceC0565u
    /* JADX INFO: renamed from: a */
    public final void mo735a(C0558n c0558n, int i) {
        C0557m c0557mM884d = c0558n.m884d();
        mo746b();
        if (i > this.f806b.length) {
            this.f806b = new InterfaceC0888d[i + 10];
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            this.f806b[i2] = c0557mM884d.m872e();
        }
        this.f807c = i;
    }

    @Override // com.p046a.p049b.p050a.p052b.InterfaceC0565u
    /* JADX INFO: renamed from: a */
    public final void mo736a(C0558n c0558n, C0885a c0885a) {
        C0886b c0886bM1927b = c0885a.m1927b();
        int iD_ = c0886bM1927b.m2239d_();
        mo735a(c0558n, iD_);
        for (int i = 0; i < iD_; i++) {
            if (!C1067a.m2510b(c0886bM1927b.mo1018a(i), this.f806b[i])) {
                throw new C0541ah("at stack depth " + ((iD_ - 1) - i) + ", expected type " + c0886bM1927b.mo1018a(i).mo919d() + " but found " + this.f806b[i].mo925a().mo919d());
            }
        }
    }

    @Override // com.p046a.p049b.p050a.p052b.InterfaceC0565u
    /* JADX INFO: renamed from: a */
    public final void mo737a(C0558n c0558n, C0887c c0887c) {
        mo735a(c0558n, 1);
        if (!C1067a.m2510b(c0887c, this.f806b[0])) {
            throw new C0541ah("expected type " + c0887c.mo919d() + " but found " + this.f806b[0].mo925a().mo919d());
        }
    }

    @Override // com.p046a.p049b.p050a.p052b.InterfaceC0565u
    /* JADX INFO: renamed from: a */
    public final void mo738a(C0558n c0558n, C0887c c0887c, C0887c c0887c2) {
        mo735a(c0558n, 2);
        if (!C1067a.m2510b(c0887c, this.f806b[0])) {
            throw new C0541ah("expected type " + c0887c.mo919d() + " but found " + this.f806b[0].mo925a().mo919d());
        }
        if (!C1067a.m2510b(c0887c2, this.f806b[1])) {
            throw new C0541ah("expected type " + c0887c2.mo919d() + " but found " + this.f806b[1].mo925a().mo919d());
        }
    }

    @Override // com.p046a.p049b.p050a.p052b.InterfaceC0565u
    /* JADX INFO: renamed from: a */
    public final void mo739a(C0558n c0558n, C0887c c0887c, C0887c c0887c2, C0887c c0887c3) {
        mo735a(c0558n, 3);
        if (!C1067a.m2510b(c0887c, this.f806b[0])) {
            throw new C0541ah("expected type " + c0887c.mo919d() + " but found " + this.f806b[0].mo925a().mo919d());
        }
        if (!C1067a.m2510b(c0887c2, this.f806b[1])) {
            throw new C0541ah("expected type " + c0887c2.mo919d() + " but found " + this.f806b[1].mo925a().mo919d());
        }
        if (!C1067a.m2510b(c0887c3, this.f806b[2])) {
            throw new C0541ah("expected type " + c0887c3.mo919d() + " but found " + this.f806b[2].mo925a().mo919d());
        }
    }

    @Override // com.p046a.p049b.p050a.p052b.InterfaceC0565u
    /* JADX INFO: renamed from: a */
    public final void mo740a(AbstractC0857a abstractC0857a) {
        if (abstractC0857a == null) {
            throw new NullPointerException("cst == null");
        }
        this.f810f = abstractC0857a;
    }

    @Override // com.p046a.p049b.p050a.p052b.InterfaceC0565u
    /* JADX INFO: renamed from: a */
    public final void mo741a(C0887c c0887c) {
        this.f808d = c0887c;
    }

    /* JADX INFO: renamed from: a */
    protected final void m742a(InterfaceC0888d interfaceC0888d) {
        if (interfaceC0888d == null) {
            throw new NullPointerException("result == null");
        }
        this.f817m[0] = interfaceC0888d;
        this.f818n = 1;
    }

    @Override // com.p046a.p049b.p050a.p052b.InterfaceC0565u
    /* JADX INFO: renamed from: a */
    public final void mo743a(ArrayList arrayList) {
        this.f813i = arrayList;
    }

    @Override // com.p046a.p049b.p050a.p052b.InterfaceC0565u
    /* JADX INFO: renamed from: a */
    public final void mo744a(boolean z) {
        this.f815k = z;
    }

    /* JADX INFO: renamed from: b */
    protected final C0848r m745b(boolean z) {
        if (this.f816l == null) {
            return null;
        }
        if (this.f818n != 1) {
            throw new C0541ah("local target with " + (this.f818n == 0 ? "no" : "multiple") + " results");
        }
        InterfaceC0888d interfaceC0888d = this.f817m[0];
        C0887c c0887cMo925a = interfaceC0888d.mo925a();
        C0887c c0887cMo925a2 = this.f816l.mo925a();
        if (c0887cMo925a == c0887cMo925a2) {
            return z ? this.f816l.m1790a(interfaceC0888d) : this.f816l;
        }
        if (!C1067a.m2510b(c0887cMo925a2, c0887cMo925a)) {
            m729a(c0887cMo925a, c0887cMo925a2);
            return null;
        }
        if (c0887cMo925a2 == C0887c.f2355n) {
            this.f816l = this.f816l.m1790a(interfaceC0888d);
        }
        return this.f816l;
    }

    @Override // com.p046a.p049b.p050a.p052b.InterfaceC0565u
    /* JADX INFO: renamed from: b */
    public final void mo746b() {
        this.f807c = 0;
        this.f808d = null;
        this.f809e = 0;
        this.f810f = null;
        this.f811g = 0;
        this.f812h = null;
        this.f813i = null;
        this.f814j = -1;
        this.f815k = false;
        this.f816l = null;
        this.f818n = -1;
    }

    @Override // com.p046a.p049b.p050a.p052b.InterfaceC0565u
    /* JADX INFO: renamed from: b */
    public final void mo747b(int i) {
        this.f811g = i;
    }

    @Override // com.p046a.p049b.p050a.p052b.InterfaceC0565u
    /* JADX INFO: renamed from: b */
    public final void mo748b(C0558n c0558n, int i) {
        mo746b();
        this.f806b[0] = c0558n.m883c().mo908a(i);
        this.f807c = 1;
        this.f814j = i;
    }

    /* JADX INFO: renamed from: b */
    protected final void m749b(InterfaceC0888d interfaceC0888d) {
        if (interfaceC0888d == null) {
            throw new NullPointerException("result == null");
        }
        this.f817m[this.f818n] = interfaceC0888d;
        this.f818n++;
    }

    /* JADX INFO: renamed from: c */
    protected final int m750c() {
        return this.f807c;
    }

    /* JADX INFO: renamed from: c */
    protected final InterfaceC0888d m751c(int i) {
        if (i >= this.f807c) {
            throw new IllegalArgumentException("n >= argCount");
        }
        try {
            return this.f806b[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IllegalArgumentException("n < 0");
        }
    }

    /* JADX INFO: renamed from: d */
    protected final C0887c m752d() {
        return this.f808d;
    }

    /* JADX INFO: renamed from: d */
    protected final InterfaceC0888d m753d(int i) {
        if (this.f818n <= 0) {
            throw new IllegalArgumentException("n >= resultCount");
        }
        try {
            return this.f817m[0];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IllegalArgumentException("n < 0");
        }
    }

    /* JADX INFO: renamed from: e */
    protected final int m754e() {
        return this.f809e;
    }

    /* JADX INFO: renamed from: f */
    protected final AbstractC0857a m755f() {
        return this.f810f;
    }

    /* JADX INFO: renamed from: g */
    protected final int m756g() {
        return this.f811g;
    }

    /* JADX INFO: renamed from: h */
    protected final C0544ak m757h() {
        return this.f812h;
    }

    /* JADX INFO: renamed from: i */
    protected final ArrayList m758i() {
        return this.f813i;
    }

    /* JADX INFO: renamed from: j */
    protected final int m759j() {
        return this.f814j;
    }

    /* JADX INFO: renamed from: k */
    protected final void m760k() {
        this.f818n = 0;
    }

    /* JADX INFO: renamed from: l */
    protected final int m761l() {
        if (this.f818n < 0) {
            throw new C0541ah("results never set");
        }
        return this.f818n;
    }
}
