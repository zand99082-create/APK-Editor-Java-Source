package com.p046a.p049b.p058c.p062c;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p058c.p060b.C0667j;
import com.p046a.p049b.p066f.p069c.AbstractC0864f;
import com.p046a.p049b.p066f.p069c.C0880v;
import com.p046a.p049b.p066f.p069c.C0883y;
import com.p046a.p049b.p066f.p070d.InterfaceC0889e;
import com.p046a.p049b.p073h.C0970r;
import java.io.PrintWriter;

/* JADX INFO: renamed from: com.a.b.c.c.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0736v extends AbstractC0735u implements Comparable {

    /* JADX INFO: renamed from: a */
    private final C0880v f1540a;

    /* JADX INFO: renamed from: b */
    private final C0726l f1541b;

    public C0736v(C0880v c0880v, int i, C0667j c0667j, InterfaceC0889e interfaceC0889e) {
        super(i);
        this.f1540a = c0880v;
        if (c0667j == null) {
            this.f1541b = null;
        } else {
            this.f1541b = new C0726l(c0880v, c0667j, (i & 8) != 0, interfaceC0889e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C0736v c0736v) {
        return this.f1540a.compareTo(c0736v.f1540a);
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0735u
    /* JADX INFO: renamed from: a */
    public final int mo1500a(C0732r c0732r, C0970r c0970r, int i, int i2) {
        int iM1331b = c0732r.m1494n().m1331b(this.f1540a);
        int i3 = iM1331b - i;
        int iB = m1503b();
        int iM1341b = AbstractC0700ap.m1341b(this.f1541b);
        if ((iM1341b != 0) != ((iB & 1280) == 0)) {
            throw new UnsupportedOperationException("code vs. access_flags mismatch");
        }
        if (c0970r.m2281b()) {
            c0970r.m2272a(0, String.format("  [%x] %s", Integer.valueOf(i2), this.f1540a.mo919d()));
            c0970r.m2272a(C1067a.m2523d(i3), "    method_idx:   " + C1067a.m2556t(iM1331b));
            c0970r.m2272a(C1067a.m2523d(iB), "    access_flags: " + C1067a.m2543j(iB));
            c0970r.m2272a(C1067a.m2523d(iM1341b), "    code_off:     " + C1067a.m2556t(iM1341b));
        }
        c0970r.m2286e(i3);
        c0970r.m2286e(iB);
        c0970r.m2286e(iM1341b);
        return iM1331b;
    }

    /* JADX INFO: renamed from: a */
    public final C0883y m1505a() {
        return this.f1540a.m1899l().m1900a();
    }

    /* JADX INFO: renamed from: a */
    public final void m1506a(C0732r c0732r) {
        C0695ak c0695akM1494n = c0732r.m1494n();
        C0696al c0696alM1485e = c0732r.m1485e();
        c0695akM1494n.m1329a((AbstractC0864f) this.f1540a);
        if (this.f1541b != null) {
            c0696alM1485e.m1333a((AbstractC0700ap) this.f1541b);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1507a(PrintWriter printWriter, boolean z) {
        if (this.f1541b == null) {
            printWriter.println(this.f1540a.mo919d() + ": abstract or native");
        } else {
            this.f1541b.m1453a(printWriter, "  ", z);
        }
    }

    /* JADX INFO: renamed from: c */
    public final C0880v m1508c() {
        return this.f1540a;
    }

    @Override // com.p046a.p049b.p073h.InterfaceC0971s
    /* JADX INFO: renamed from: d */
    public final String mo919d() {
        return this.f1540a.mo919d();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0736v) && compareTo((C0736v) obj) == 0;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer(100);
        stringBuffer.append(getClass().getName());
        stringBuffer.append('{');
        stringBuffer.append(C1067a.m2558v(m1503b()));
        stringBuffer.append(' ');
        stringBuffer.append(this.f1540a);
        if (this.f1541b != null) {
            stringBuffer.append(' ');
            stringBuffer.append(this.f1541b);
        }
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
