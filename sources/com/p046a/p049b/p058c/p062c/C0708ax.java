package com.p046a.p049b.p058c.p062c;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p066f.p069c.C0883y;
import com.p046a.p049b.p073h.C0970r;

/* JADX INFO: renamed from: com.a.b.c.c.ax */
/* JADX INFO: loaded from: classes.dex */
public final class C0708ax extends AbstractC0687ac implements Comparable {

    /* JADX INFO: renamed from: a */
    private final C0883y f1443a;

    /* JADX INFO: renamed from: b */
    private C0707aw f1444b;

    public C0708ax(C0883y c0883y) {
        if (c0883y == null) {
            throw new NullPointerException("value == null");
        }
        this.f1443a = c0883y;
        this.f1444b = null;
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0688ad
    /* JADX INFO: renamed from: a */
    public final EnumC0689ae mo1302a() {
        return EnumC0689ae.f1378b;
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0688ad
    /* JADX INFO: renamed from: a */
    public final void mo1304a(C0732r c0732r) {
        if (this.f1444b == null) {
            C0696al c0696alM1484d = c0732r.m1484d();
            this.f1444b = new C0707aw(this.f1443a);
            c0696alM1484d.m1333a((AbstractC0700ap) this.f1444b);
        }
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0688ad
    /* JADX INFO: renamed from: a */
    public final void mo1315a(C0732r c0732r, C0970r c0970r) {
        String str;
        int iF = this.f1444b.m1345f();
        if (c0970r.m2281b()) {
            StringBuilder sbAppend = new StringBuilder().append(m1314j()).append(' ');
            String strMo919d = this.f1443a.mo919d();
            if (strMo919d.length() <= 98) {
                str = "";
            } else {
                strMo919d = strMo919d.substring(0, 95);
                str = "...";
            }
            c0970r.m2272a(0, sbAppend.append("\"" + strMo919d + str + '\"').toString());
            c0970r.m2272a(4, "  string_data_off: " + C1067a.m2556t(iF));
        }
        c0970r.m2282c(iF);
    }

    /* JADX INFO: renamed from: c */
    public final C0883y m1373c() {
        return this.f1443a;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f1443a.compareTo(((C0708ax) obj).f1443a);
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0688ad
    /* JADX INFO: renamed from: e_ */
    public final int mo1316e_() {
        return 4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0708ax) {
            return this.f1443a.equals(((C0708ax) obj).f1443a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1443a.hashCode();
    }
}
