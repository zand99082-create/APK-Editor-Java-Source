package com.p046a.p049b.p058c.p062c;

import com.p046a.p047a.p048a.C0482d;
import com.p046a.p049b.p058c.p060b.C0646ab;
import com.p046a.p049b.p058c.p060b.C0667j;
import com.p046a.p049b.p058c.p060b.C0670m;
import com.p046a.p049b.p058c.p060b.C0676s;
import com.p046a.p049b.p066f.p069c.C0880v;
import com.p046a.p049b.p073h.C0970r;
import java.io.PrintWriter;

/* JADX INFO: renamed from: com.a.b.c.c.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0731q extends AbstractC0700ap {

    /* JADX INFO: renamed from: a */
    private final C0667j f1515a;

    /* JADX INFO: renamed from: b */
    private byte[] f1516b;

    /* JADX INFO: renamed from: c */
    private final boolean f1517c;

    /* JADX INFO: renamed from: d */
    private final C0880v f1518d;

    public C0731q(C0667j c0667j, boolean z, C0880v c0880v) {
        super(1, -1);
        if (c0667j == null) {
            throw new NullPointerException("code == null");
        }
        this.f1515a = c0667j;
        this.f1517c = z;
        this.f1518d = c0880v;
    }

    /* JADX INFO: renamed from: a */
    private byte[] m1471a(C0732r c0732r, String str, PrintWriter printWriter, C0970r c0970r, boolean z) {
        C0646ab c0646abM1211h = this.f1515a.m1211h();
        C0676s c0676sM1212i = this.f1515a.m1212i();
        C0670m c0670mM1209f = this.f1515a.m1209f();
        C0728n c0728n = new C0728n(c0646abM1211h, c0676sM1212i, c0732r, c0670mM1209f.m1233e(), c0670mM1209f.m1234f(), this.f1517c, this.f1518d);
        return (printWriter == null && c0970r == null) ? c0728n.m1469a() : c0728n.m1470a(str, printWriter, c0970r, z);
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0688ad
    /* JADX INFO: renamed from: a */
    public final EnumC0689ae mo1302a() {
        return EnumC0689ae.f1391o;
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0700ap
    /* JADX INFO: renamed from: a */
    protected final void mo1303a(AbstractC0704at abstractC0704at, int i) {
        try {
            this.f1516b = m1471a(abstractC0704at.m1361e(), null, null, null, false);
            m1342a(this.f1516b.length);
        } catch (RuntimeException e) {
            throw C0482d.m570a(e, "...while placing debug info for " + this.f1518d.mo919d());
        }
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0688ad
    /* JADX INFO: renamed from: a */
    public final void mo1304a(C0732r c0732r) {
    }

    /* JADX INFO: renamed from: a */
    public final void m1472a(C0732r c0732r, C0970r c0970r, String str) {
        m1471a(c0732r, str, null, c0970r, false);
    }

    /* JADX INFO: renamed from: a */
    public final void m1473a(PrintWriter printWriter, String str) {
        m1471a(null, str, printWriter, null, false);
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0700ap
    /* JADX INFO: renamed from: a_ */
    protected final void mo1306a_(C0732r c0732r, C0970r c0970r) {
        if (c0970r.m2281b()) {
            c0970r.m2277a(m1347h() + " debug info");
            m1471a(c0732r, null, null, c0970r, true);
        }
        c0970r.m2278a(this.f1516b);
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0700ap
    /* JADX INFO: renamed from: b */
    public final String mo1307b() {
        throw new RuntimeException("unsupported");
    }
}
