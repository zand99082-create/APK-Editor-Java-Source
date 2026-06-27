package com.p046a.p049b.p058c.p062c;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p066f.p069c.AbstractC0857a;
import com.p046a.p049b.p066f.p069c.C0883y;
import com.p046a.p049b.p073h.C0970r;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.a.b.c.c.ay */
/* JADX INFO: loaded from: classes.dex */
public final class C0709ay extends AbstractC0714bc {

    /* JADX INFO: renamed from: a */
    private final TreeMap f1445a;

    public C0709ay(C0732r c0732r) {
        super("string_ids", c0732r, 4);
        this.f1445a = new TreeMap();
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC0687ac m1374a(AbstractC0857a abstractC0857a) {
        if (abstractC0857a == null) {
            throw new NullPointerException("cst == null");
        }
        m1365i();
        AbstractC0687ac abstractC0687ac = (AbstractC0687ac) this.f1445a.get((C0883y) abstractC0857a);
        if (abstractC0687ac == null) {
            throw new IllegalArgumentException("not found");
        }
        return abstractC0687ac;
    }

    /* JADX INFO: renamed from: a */
    public final C0708ax m1375a(C0883y c0883y) {
        C0708ax c0708ax = new C0708ax(c0883y);
        m1366j();
        C0883y c0883yM1373c = c0708ax.m1373c();
        C0708ax c0708ax2 = (C0708ax) this.f1445a.get(c0883yM1373c);
        if (c0708ax2 != null) {
            return c0708ax2;
        }
        this.f1445a.put(c0883yM1373c, c0708ax);
        return c0708ax;
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0704at
    /* JADX INFO: renamed from: a */
    public final Collection mo1308a() {
        return this.f1445a.values();
    }

    /* JADX INFO: renamed from: b */
    public final int m1376b(C0883y c0883y) {
        if (c0883y == null) {
            throw new NullPointerException("string == null");
        }
        m1365i();
        C0708ax c0708ax = (C0708ax) this.f1445a.get(c0883y);
        if (c0708ax == null) {
            throw new IllegalArgumentException("not found");
        }
        return c0708ax.m1313i();
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0714bc
    /* JADX INFO: renamed from: b */
    protected final void mo1309b() {
        int i = 0;
        Iterator it = this.f1445a.values().iterator();
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return;
            }
            ((C0708ax) it.next()).m1311a(i2);
            i = i2 + 1;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1377b(C0970r c0970r) {
        m1365i();
        int size = this.f1445a.size();
        int iG = size == 0 ? 0 : m1363g();
        if (c0970r.m2281b()) {
            c0970r.m2272a(4, "string_ids_size: " + C1067a.m2556t(size));
            c0970r.m2272a(4, "string_ids_off:  " + C1067a.m2556t(iG));
        }
        c0970r.m2282c(size);
        c0970r.m2282c(iG);
    }
}
