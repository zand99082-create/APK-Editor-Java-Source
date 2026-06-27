package com.p046a.p049b.p058c.p062c;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p047a.p048a.C0482d;
import com.p046a.p049b.p058c.p060b.C0667j;
import com.p046a.p049b.p058c.p060b.C0670m;
import com.p046a.p049b.p066f.p069c.AbstractC0857a;
import com.p046a.p049b.p066f.p069c.C0880v;
import com.p046a.p049b.p066f.p070d.C0886b;
import com.p046a.p049b.p066f.p070d.C0887c;
import com.p046a.p049b.p066f.p070d.InterfaceC0889e;
import com.p046a.p049b.p073h.C0970r;
import jadx.core.codegen.CodeWriter;
import java.io.PrintWriter;
import java.util.Iterator;

/* JADX INFO: renamed from: com.a.b.c.c.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0726l extends AbstractC0700ap {

    /* JADX INFO: renamed from: a */
    private final C0880v f1493a;

    /* JADX INFO: renamed from: b */
    private final C0667j f1494b;

    /* JADX INFO: renamed from: c */
    private C0722h f1495c;

    /* JADX INFO: renamed from: d */
    private final boolean f1496d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC0889e f1497e;

    /* JADX INFO: renamed from: f */
    private C0731q f1498f;

    public C0726l(C0880v c0880v, C0667j c0667j, boolean z, InterfaceC0889e interfaceC0889e) {
        super(4, -1);
        if (c0880v == null) {
            throw new NullPointerException("ref == null");
        }
        if (c0667j == null) {
            throw new NullPointerException("code == null");
        }
        if (interfaceC0889e == null) {
            throw new NullPointerException("throwsList == null");
        }
        this.f1493a = c0880v;
        this.f1494b = c0667j;
        this.f1496d = z;
        this.f1497e = interfaceC0889e;
        this.f1495c = null;
        this.f1498f = null;
    }

    /* JADX INFO: renamed from: c */
    private int m1450c() {
        return this.f1493a.m1879b(this.f1496d);
    }

    /* JADX INFO: renamed from: d */
    private int m1451d() {
        return this.f1494b.m1209f().m1235g();
    }

    /* JADX INFO: renamed from: e */
    private int m1452e() {
        return this.f1494b.m1209f().m1234f();
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0688ad
    /* JADX INFO: renamed from: a */
    public final EnumC0689ae mo1302a() {
        return EnumC0689ae.f1389m;
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0700ap
    /* JADX INFO: renamed from: a */
    protected final void mo1303a(AbstractC0704at abstractC0704at, int i) {
        int iM1420b;
        C0732r c0732rM1361e = abstractC0704at.m1361e();
        this.f1494b.m1203a(new C0727m(this, c0732rM1361e));
        if (this.f1495c != null) {
            this.f1495c.m1417a(c0732rM1361e);
            iM1420b = this.f1495c.m1420b();
        } else {
            iM1420b = 0;
        }
        int iM1233e = this.f1494b.m1209f().m1233e();
        if ((iM1233e & 1) != 0) {
            iM1233e++;
        }
        m1342a(iM1420b + (iM1233e << 1) + 16);
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0688ad
    /* JADX INFO: renamed from: a */
    public final void mo1304a(C0732r c0732r) {
        C0696al c0696alM1495o = c0732r.m1495o();
        C0712ba c0712baM1491k = c0732r.m1491k();
        if (this.f1494b.m1204a() || this.f1494b.m1205b()) {
            this.f1498f = new C0731q(this.f1494b, this.f1496d, this.f1493a);
            c0696alM1495o.m1333a((AbstractC0700ap) this.f1498f);
        }
        if (this.f1494b.m1206c()) {
            Iterator it = this.f1494b.m1207d().iterator();
            while (it.hasNext()) {
                c0712baM1491k.m1380a((C0887c) it.next());
            }
            this.f1495c = new C0722h(this.f1494b);
        }
        Iterator it2 = this.f1494b.m1208e().iterator();
        while (it2.hasNext()) {
            c0732r.m1478a((AbstractC0857a) it2.next());
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1453a(PrintWriter printWriter, String str, boolean z) {
        printWriter.println(this.f1493a.mo919d() + ":");
        C0670m c0670mM1209f = this.f1494b.m1209f();
        printWriter.println("regs: " + C1067a.m2558v(m1452e()) + "; ins: " + C1067a.m2558v(m1450c()) + "; outs: " + C1067a.m2558v(m1451d()));
        c0670mM1209f.m1232a(printWriter, str, z);
        String str2 = str + "  ";
        if (this.f1495c != null) {
            printWriter.print(str);
            printWriter.println("catches");
            this.f1495c.m1419a(printWriter, str2);
        }
        if (this.f1498f != null) {
            printWriter.print(str);
            printWriter.println("debug info");
            this.f1498f.m1473a(printWriter, str2);
        }
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0700ap
    /* JADX INFO: renamed from: a_ */
    protected final void mo1306a_(C0732r c0732r, C0970r c0970r) {
        boolean zM2281b = c0970r.m2281b();
        int iM1452e = m1452e();
        int iM1451d = m1451d();
        int iM1450c = m1450c();
        int iM1233e = this.f1494b.m1209f().m1233e();
        boolean z = (iM1233e & 1) != 0;
        int iM1416a = this.f1495c == null ? 0 : this.f1495c.m1416a();
        int iF = this.f1498f == null ? 0 : this.f1498f.m1345f();
        if (zM2281b) {
            c0970r.m2272a(0, m1347h() + ' ' + this.f1493a.mo919d());
            c0970r.m2272a(2, "  registers_size: " + C1067a.m2558v(iM1452e));
            c0970r.m2272a(2, "  ins_size:       " + C1067a.m2558v(iM1450c));
            c0970r.m2272a(2, "  outs_size:      " + C1067a.m2558v(iM1451d));
            c0970r.m2272a(2, "  tries_size:     " + C1067a.m2558v(iM1416a));
            c0970r.m2272a(4, "  debug_off:      " + C1067a.m2556t(iF));
            c0970r.m2272a(4, "  insns_size:     " + C1067a.m2556t(iM1233e));
            if (this.f1497e.mo1021d_() != 0) {
                c0970r.m2272a(0, "  throws " + C0886b.m1932a(this.f1497e));
            }
        }
        c0970r.m2280b(iM1452e);
        c0970r.m2280b(iM1450c);
        c0970r.m2280b(iM1451d);
        c0970r.m2280b(iM1416a);
        c0970r.m2282c(iF);
        c0970r.m2282c(iM1233e);
        try {
            this.f1494b.m1209f().m1231a(c0970r);
            if (this.f1495c != null) {
                if (z) {
                    if (zM2281b) {
                        c0970r.m2272a(2, "  padding: 0");
                    }
                    c0970r.m2280b(0);
                }
                this.f1495c.m1418a(c0970r);
            }
            if (!zM2281b || this.f1498f == null) {
                return;
            }
            c0970r.m2272a(0, "  debug info");
            this.f1498f.m1472a(c0732r, c0970r, CodeWriter.INDENT);
        } catch (RuntimeException e) {
            throw C0482d.m570a(e, "...while writing instructions for " + this.f1493a.mo919d());
        }
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0700ap
    /* JADX INFO: renamed from: b */
    public final String mo1307b() {
        return this.f1493a.mo919d();
    }

    public final String toString() {
        return "CodeItem{" + mo1307b() + "}";
    }
}
