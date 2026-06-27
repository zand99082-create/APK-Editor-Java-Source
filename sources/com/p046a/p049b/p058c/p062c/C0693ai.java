package com.p046a.p049b.p058c.p062c;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p066f.p067a.C0824c;
import com.p046a.p049b.p066f.p069c.AbstractC0864f;
import com.p046a.p049b.p066f.p069c.C0880v;
import com.p046a.p049b.p073h.C0970r;
import com.p046a.p049b.p073h.InterfaceC0971s;
import jadx.core.codegen.CodeWriter;

/* JADX INFO: renamed from: com.a.b.c.c.ai */
/* JADX INFO: loaded from: classes.dex */
public final class C0693ai implements InterfaceC0971s, Comparable {

    /* JADX INFO: renamed from: a */
    private final C0880v f1407a;

    /* JADX INFO: renamed from: b */
    private C0718d f1408b;

    public C0693ai(C0880v c0880v, C0718d c0718d) {
        if (c0880v == null) {
            throw new NullPointerException("method == null");
        }
        this.f1407a = c0880v;
        this.f1408b = c0718d;
    }

    /* JADX INFO: renamed from: a */
    public final C0880v m1324a() {
        return this.f1407a;
    }

    /* JADX INFO: renamed from: a */
    public final void m1325a(C0732r c0732r) {
        C0695ak c0695akM1494n = c0732r.m1494n();
        C0696al c0696alM1485e = c0732r.m1485e();
        c0695akM1494n.m1329a((AbstractC0864f) this.f1407a);
        this.f1408b = (C0718d) c0696alM1485e.m1336b(this.f1408b);
    }

    /* JADX INFO: renamed from: a */
    public final void m1326a(C0732r c0732r, C0970r c0970r) {
        int iM1331b = c0732r.m1494n().m1331b(this.f1407a);
        int iF = this.f1408b.m1345f();
        if (c0970r.m2281b()) {
            c0970r.m2272a(0, CodeWriter.INDENT + this.f1407a.mo919d());
            c0970r.m2272a(4, "      method_idx:      " + C1067a.m2556t(iM1331b));
            c0970r.m2272a(4, "      annotations_off: " + C1067a.m2556t(iF));
        }
        c0970r.m2282c(iM1331b);
        c0970r.m2282c(iF);
    }

    /* JADX INFO: renamed from: b */
    public final C0824c m1327b() {
        return this.f1408b.m1395c();
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.f1407a.compareTo(((C0693ai) obj).f1407a);
    }

    @Override // com.p046a.p049b.p073h.InterfaceC0971s
    /* JADX INFO: renamed from: d */
    public final String mo919d() {
        return this.f1407a.mo919d() + ": " + this.f1408b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0693ai) {
            return this.f1407a.equals(((C0693ai) obj).f1407a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1407a.hashCode();
    }
}
