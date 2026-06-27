package com.p046a.p049b.p050a.p054d;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p050a.p055e.AbstractC0588a;
import com.p046a.p049b.p050a.p055e.C0596i;
import com.p046a.p049b.p050a.p055e.C0598k;
import com.p046a.p049b.p050a.p055e.InterfaceC0597j;

/* JADX INFO: renamed from: com.a.b.a.d.c */
/* JADX INFO: loaded from: classes.dex */
final class C0574c {

    /* JADX INFO: renamed from: a */
    private final C0582k f944a;

    /* JADX INFO: renamed from: b */
    private final int f945b;

    /* JADX INFO: renamed from: c */
    private final int f946c;

    /* JADX INFO: renamed from: d */
    private final C0573b f947d;

    /* JADX INFO: renamed from: e */
    private final C0598k f948e;

    /* JADX INFO: renamed from: f */
    private int f949f;

    /* JADX INFO: renamed from: g */
    private InterfaceC0597j f950g;

    public C0574c(C0582k c0582k, int i, int i2, C0573b c0573b) {
        if (c0582k == null) {
            throw new NullPointerException("cf == null");
        }
        if (c0573b == null) {
            throw new NullPointerException("attributeFactory == null");
        }
        int iM2228f = c0582k.m1007b().m2228f(i2);
        this.f944a = c0582k;
        this.f945b = i;
        this.f946c = i2;
        this.f947d = c0573b;
        this.f948e = new C0598k(iM2228f);
        this.f949f = -1;
    }

    /* JADX INFO: renamed from: c */
    private void m984c() {
        if (this.f949f < 0) {
            int iD_ = this.f948e.m2239d_();
            int i = this.f946c + 2;
            if (this.f950g != null) {
                new StringBuilder("attributes_count: ").append(C1067a.m2558v(iD_));
            }
            int i2 = i;
            int i3 = 0;
            while (i3 < iD_) {
                try {
                    if (this.f950g != null) {
                        new StringBuilder("\nattributes[").append(i3).append("]:\n");
                    }
                    AbstractC0588a abstractC0588aM982a = this.f947d.m982a(this.f944a, this.f945b, i2, this.f950g);
                    int iMo705a = abstractC0588aM982a.mo705a() + i2;
                    this.f948e.m1058a(i3, abstractC0588aM982a);
                    if (this.f950g != null) {
                        new StringBuilder("end attributes[").append(i3).append("]\n");
                    }
                    i3++;
                    i2 = iMo705a;
                } catch (C0596i e) {
                    e.m573a("...while parsing attributes[" + i3 + "]");
                    throw e;
                } catch (RuntimeException e2) {
                    C0596i c0596i = new C0596i(e2);
                    c0596i.m573a("...while parsing attributes[" + i3 + "]");
                    throw c0596i;
                }
            }
            this.f949f = i2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m985a() {
        m984c();
        return this.f949f;
    }

    /* JADX INFO: renamed from: a */
    public final void m986a(InterfaceC0597j interfaceC0597j) {
        this.f950g = interfaceC0597j;
    }

    /* JADX INFO: renamed from: b */
    public final C0598k m987b() {
        m984c();
        return this.f948e;
    }
}
