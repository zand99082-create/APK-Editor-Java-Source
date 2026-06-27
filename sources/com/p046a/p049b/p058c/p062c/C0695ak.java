package com.p046a.p049b.p058c.p062c;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p066f.p069c.AbstractC0857a;
import com.p046a.p049b.p066f.p069c.AbstractC0864f;
import com.p046a.p049b.p073h.C0970r;
import java.util.Collection;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.a.b.c.c.ak */
/* JADX INFO: loaded from: classes.dex */
public final class C0695ak extends AbstractC0692ah {

    /* JADX INFO: renamed from: a */
    private final TreeMap f1409a;

    public C0695ak(C0732r c0732r) {
        super("method_ids", c0732r);
        this.f1409a = new TreeMap();
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC0687ac m1328a(AbstractC0857a abstractC0857a) {
        if (abstractC0857a == null) {
            throw new NullPointerException("cst == null");
        }
        m1365i();
        AbstractC0687ac abstractC0687ac = (AbstractC0687ac) this.f1409a.get((AbstractC0864f) abstractC0857a);
        if (abstractC0687ac == null) {
            throw new IllegalArgumentException("not found");
        }
        return abstractC0687ac;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized C0694aj m1329a(AbstractC0864f abstractC0864f) {
        C0694aj c0694aj;
        if (abstractC0864f == null) {
            throw new NullPointerException("method == null");
        }
        m1366j();
        c0694aj = (C0694aj) this.f1409a.get(abstractC0864f);
        if (c0694aj == null) {
            c0694aj = new C0694aj(abstractC0864f);
            this.f1409a.put(abstractC0864f, c0694aj);
        }
        return c0694aj;
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0704at
    /* JADX INFO: renamed from: a */
    public final Collection mo1308a() {
        return this.f1409a.values();
    }

    /* JADX INFO: renamed from: a */
    public final void m1330a(C0970r c0970r) {
        m1365i();
        int size = this.f1409a.size();
        int iG = size == 0 ? 0 : m1363g();
        if (c0970r.m2281b()) {
            c0970r.m2272a(4, "method_ids_size: " + C1067a.m2556t(size));
            c0970r.m2272a(4, "method_ids_off:  " + C1067a.m2556t(iG));
        }
        c0970r.m2282c(size);
        c0970r.m2282c(iG);
    }

    /* JADX INFO: renamed from: b */
    public final int m1331b(AbstractC0864f abstractC0864f) {
        if (abstractC0864f == null) {
            throw new NullPointerException("ref == null");
        }
        m1365i();
        C0694aj c0694aj = (C0694aj) this.f1409a.get(abstractC0864f);
        if (c0694aj == null) {
            throw new IllegalArgumentException("not found");
        }
        return c0694aj.m1313i();
    }
}
