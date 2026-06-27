package com.p046a.p049b.p058c.p062c;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p066f.p067a.C0825d;
import com.p046a.p049b.p066f.p069c.AbstractC0864f;
import com.p046a.p049b.p066f.p069c.C0880v;
import com.p046a.p049b.p073h.C0970r;
import com.p046a.p049b.p073h.InterfaceC0971s;
import jadx.core.codegen.CodeWriter;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.a.b.c.c.aq */
/* JADX INFO: loaded from: classes.dex */
public final class C0701aq implements InterfaceC0971s, Comparable {

    /* JADX INFO: renamed from: a */
    private final C0880v f1424a;

    /* JADX INFO: renamed from: b */
    private final C0825d f1425b;

    /* JADX INFO: renamed from: c */
    private final C0715bd f1426c;

    public C0701aq(C0880v c0880v, C0825d c0825d, C0732r c0732r) {
        if (c0880v == null) {
            throw new NullPointerException("method == null");
        }
        if (c0825d == null) {
            throw new NullPointerException("annotationsList == null");
        }
        this.f1424a = c0880v;
        this.f1425b = c0825d;
        int iD_ = c0825d.m2239d_();
        ArrayList arrayList = new ArrayList(iD_);
        for (int i = 0; i < iD_; i++) {
            arrayList.add(new C0719e(new C0718d(c0825d.m1714a(i), c0732r)));
        }
        this.f1426c = new C0715bd(EnumC0689ae.f1386j, arrayList);
    }

    /* JADX INFO: renamed from: a */
    public final C0880v m1348a() {
        return this.f1424a;
    }

    /* JADX INFO: renamed from: a */
    public final void m1349a(C0732r c0732r) {
        C0695ak c0695akM1494n = c0732r.m1494n();
        C0696al c0696alM1485e = c0732r.m1485e();
        c0695akM1494n.m1329a((AbstractC0864f) this.f1424a);
        c0696alM1485e.m1333a((AbstractC0700ap) this.f1426c);
    }

    /* JADX INFO: renamed from: a */
    public final void m1350a(C0732r c0732r, C0970r c0970r) {
        int iM1331b = c0732r.m1494n().m1331b(this.f1424a);
        int iF = this.f1426c.m1345f();
        if (c0970r.m2281b()) {
            c0970r.m2272a(0, CodeWriter.INDENT + this.f1424a.mo919d());
            c0970r.m2272a(4, "      method_idx:      " + C1067a.m2556t(iM1331b));
            c0970r.m2272a(4, "      annotations_off: " + C1067a.m2556t(iF));
        }
        c0970r.m2282c(iM1331b);
        c0970r.m2282c(iF);
    }

    /* JADX INFO: renamed from: b */
    public final C0825d m1351b() {
        return this.f1425b;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.f1424a.compareTo(((C0701aq) obj).f1424a);
    }

    @Override // com.p046a.p049b.p073h.InterfaceC0971s
    /* JADX INFO: renamed from: d */
    public final String mo919d() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1424a.mo919d());
        sb.append(": ");
        boolean z = true;
        for (C0719e c0719e : this.f1426c.m1386c()) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(c0719e.mo1307b());
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0701aq) {
            return this.f1424a.equals(((C0701aq) obj).f1424a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1424a.hashCode();
    }
}
