package com.p046a.p049b.p050a.p054d;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p050a.p055e.C0602o;
import com.p046a.p049b.p050a.p055e.C0603p;
import com.p046a.p049b.p050a.p055e.InterfaceC0589b;
import com.p046a.p049b.p050a.p055e.InterfaceC0593f;
import com.p046a.p049b.p050a.p055e.InterfaceC0594g;
import com.p046a.p049b.p066f.p069c.C0881w;
import com.p046a.p049b.p066f.p069c.C0884z;

/* JADX INFO: renamed from: com.a.b.a.d.o */
/* JADX INFO: loaded from: classes.dex */
final class C0586o extends AbstractC0585n {

    /* JADX INFO: renamed from: a */
    private final C0603p f980a;

    public C0586o(C0582k c0582k, C0884z c0884z, int i, C0573b c0573b) {
        super(c0582k, c0884z, i, c0573b);
        this.f980a = new C0603p(m1030f());
    }

    @Override // com.p046a.p049b.p050a.p054d.AbstractC0585n
    /* JADX INFO: renamed from: a */
    protected final InterfaceC0593f mo1022a(int i, int i2, C0881w c0881w, InterfaceC0589b interfaceC0589b) {
        C0602o c0602o = new C0602o(m1031g(), i2, c0881w, interfaceC0589b);
        this.f980a.m1060a(i, (InterfaceC0594g) c0602o);
        return c0602o;
    }

    /* JADX INFO: renamed from: a */
    public final C0603p m1032a() {
        m1029e();
        return this.f980a;
    }

    @Override // com.p046a.p049b.p050a.p054d.AbstractC0585n
    /* JADX INFO: renamed from: a */
    protected final String mo1024a(int i) {
        return C1067a.m2543j(i);
    }

    @Override // com.p046a.p049b.p050a.p054d.AbstractC0585n
    /* JADX INFO: renamed from: b */
    protected final String mo1025b() {
        return "method";
    }

    @Override // com.p046a.p049b.p050a.p054d.AbstractC0585n
    /* JADX INFO: renamed from: c */
    protected final int mo1026c() {
        return 2;
    }
}
