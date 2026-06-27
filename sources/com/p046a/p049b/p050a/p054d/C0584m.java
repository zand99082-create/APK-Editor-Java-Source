package com.p046a.p049b.p050a.p054d;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p050a.p055e.C0599l;
import com.p046a.p049b.p050a.p055e.C0600m;
import com.p046a.p049b.p050a.p055e.InterfaceC0589b;
import com.p046a.p049b.p050a.p055e.InterfaceC0591d;
import com.p046a.p049b.p050a.p055e.InterfaceC0593f;
import com.p046a.p049b.p066f.p069c.C0881w;
import com.p046a.p049b.p066f.p069c.C0884z;

/* JADX INFO: renamed from: com.a.b.a.d.m */
/* JADX INFO: loaded from: classes.dex */
final class C0584m extends AbstractC0585n {

    /* JADX INFO: renamed from: a */
    private final C0600m f973a;

    public C0584m(C0582k c0582k, C0884z c0884z, int i, C0573b c0573b) {
        super(c0582k, c0884z, i, c0573b);
        this.f973a = new C0600m(m1030f());
    }

    @Override // com.p046a.p049b.p050a.p054d.AbstractC0585n
    /* JADX INFO: renamed from: a */
    protected final InterfaceC0593f mo1022a(int i, int i2, C0881w c0881w, InterfaceC0589b interfaceC0589b) {
        C0599l c0599l = new C0599l(m1031g(), i2, c0881w, interfaceC0589b);
        this.f973a.m1059a(i, (InterfaceC0591d) c0599l);
        return c0599l;
    }

    /* JADX INFO: renamed from: a */
    public final C0600m m1023a() {
        m1029e();
        return this.f973a;
    }

    @Override // com.p046a.p049b.p050a.p054d.AbstractC0585n
    /* JADX INFO: renamed from: a */
    protected final String mo1024a(int i) {
        return C1067a.m2540i(i);
    }

    @Override // com.p046a.p049b.p050a.p054d.AbstractC0585n
    /* JADX INFO: renamed from: b */
    protected final String mo1025b() {
        return "field";
    }

    @Override // com.p046a.p049b.p050a.p054d.AbstractC0585n
    /* JADX INFO: renamed from: c */
    protected final int mo1026c() {
        return 1;
    }
}
