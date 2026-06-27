package com.p046a.p049b.p058c.p062c;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p066f.p067a.C0822a;
import com.p046a.p049b.p066f.p067a.C0824c;
import com.p046a.p049b.p073h.C0970r;
import jadx.core.codegen.CodeWriter;
import java.util.Iterator;

/* JADX INFO: renamed from: com.a.b.c.c.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0718d extends AbstractC0700ap {

    /* JADX INFO: renamed from: a */
    private final C0824c f1453a;

    /* JADX INFO: renamed from: b */
    private final C0684a[] f1454b;

    public C0718d(C0824c c0824c, C0732r c0732r) {
        super(4, m1394a(c0824c));
        this.f1453a = c0824c;
        this.f1454b = new C0684a[c0824c.m1711b()];
        int i = 0;
        Iterator it = c0824c.m1712d().iterator();
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return;
            }
            this.f1454b[i2] = new C0684a((C0822a) it.next(), c0732r);
            i = i2 + 1;
        }
    }

    /* JADX INFO: renamed from: a */
    private static int m1394a(C0824c c0824c) {
        try {
            return (c0824c.m1711b() << 2) + 4;
        } catch (NullPointerException e) {
            throw new NullPointerException("list == null");
        }
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0700ap
    /* JADX INFO: renamed from: a */
    protected final int mo1301a(AbstractC0700ap abstractC0700ap) {
        return this.f1453a.compareTo(((C0718d) abstractC0700ap).f1453a);
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0688ad
    /* JADX INFO: renamed from: a */
    public final EnumC0689ae mo1302a() {
        return EnumC0689ae.f1387k;
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0700ap
    /* JADX INFO: renamed from: a */
    protected final void mo1303a(AbstractC0704at abstractC0704at, int i) {
        C0684a.m1300a(this.f1454b);
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0688ad
    /* JADX INFO: renamed from: a */
    public final void mo1304a(C0732r c0732r) {
        C0696al c0696alM1495o = c0732r.m1495o();
        int length = this.f1454b.length;
        for (int i = 0; i < length; i++) {
            this.f1454b[i] = (C0684a) c0696alM1495o.m1336b(this.f1454b[i]);
        }
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0700ap
    /* JADX INFO: renamed from: a_ */
    protected final void mo1306a_(C0732r c0732r, C0970r c0970r) {
        boolean zM2281b = c0970r.m2281b();
        int length = this.f1454b.length;
        if (zM2281b) {
            c0970r.m2272a(0, m1347h() + " annotation set");
            c0970r.m2272a(4, "  size: " + C1067a.m2556t(length));
        }
        c0970r.m2282c(length);
        for (int i = 0; i < length; i++) {
            int iF = this.f1454b[i].m1345f();
            if (zM2281b) {
                c0970r.m2272a(4, "  entries[" + Integer.toHexString(i) + "]: " + C1067a.m2556t(iF));
                this.f1454b[i].m1305a(c0970r, CodeWriter.INDENT);
            }
            c0970r.m2282c(iF);
        }
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0700ap
    /* JADX INFO: renamed from: b */
    public final String mo1307b() {
        return this.f1453a.toString();
    }

    /* JADX INFO: renamed from: c */
    public final C0824c m1395c() {
        return this.f1453a;
    }

    public final int hashCode() {
        return this.f1453a.hashCode();
    }
}
