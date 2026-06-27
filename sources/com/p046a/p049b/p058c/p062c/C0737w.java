package com.p046a.p049b.p058c.p062c;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p066f.p069c.C0870l;
import com.p046a.p049b.p073h.C0970r;
import com.p046a.p049b.p073h.InterfaceC0971s;
import jadx.core.codegen.CodeWriter;

/* JADX INFO: renamed from: com.a.b.c.c.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0737w implements InterfaceC0971s, Comparable {

    /* JADX INFO: renamed from: a */
    private final C0870l f1542a;

    /* JADX INFO: renamed from: b */
    private C0718d f1543b;

    public C0737w(C0870l c0870l, C0718d c0718d) {
        if (c0870l == null) {
            throw new NullPointerException("field == null");
        }
        this.f1542a = c0870l;
        this.f1543b = c0718d;
    }

    /* JADX INFO: renamed from: a */
    public final void m1509a(C0732r c0732r) {
        C0739y c0739yM1493m = c0732r.m1493m();
        C0696al c0696alM1485e = c0732r.m1485e();
        c0739yM1493m.m1512a(this.f1542a);
        this.f1543b = (C0718d) c0696alM1485e.m1336b(this.f1543b);
    }

    /* JADX INFO: renamed from: a */
    public final void m1510a(C0732r c0732r, C0970r c0970r) {
        int iM1514b = c0732r.m1493m().m1514b(this.f1542a);
        int iF = this.f1543b.m1345f();
        if (c0970r.m2281b()) {
            c0970r.m2272a(0, CodeWriter.INDENT + this.f1542a.mo919d());
            c0970r.m2272a(4, "      field_idx:       " + C1067a.m2556t(iM1514b));
            c0970r.m2272a(4, "      annotations_off: " + C1067a.m2556t(iF));
        }
        c0970r.m2282c(iM1514b);
        c0970r.m2282c(iF);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.f1542a.compareTo(((C0737w) obj).f1542a);
    }

    @Override // com.p046a.p049b.p073h.InterfaceC0971s
    /* JADX INFO: renamed from: d */
    public final String mo919d() {
        return this.f1542a.mo919d() + ": " + this.f1543b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0737w) {
            return this.f1542a.equals(((C0737w) obj).f1542a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1542a.hashCode();
    }
}
