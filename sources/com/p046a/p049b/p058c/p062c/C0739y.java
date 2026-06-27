package com.p046a.p049b.p058c.p062c;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p066f.p069c.AbstractC0857a;
import com.p046a.p049b.p066f.p069c.C0870l;
import com.p046a.p049b.p073h.C0970r;
import java.util.Collection;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.a.b.c.c.y */
/* JADX INFO: loaded from: classes.dex */
public final class C0739y extends AbstractC0692ah {

    /* JADX INFO: renamed from: a */
    private final TreeMap f1544a;

    public C0739y(C0732r c0732r) {
        super("field_ids", c0732r);
        this.f1544a = new TreeMap();
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC0687ac m1511a(AbstractC0857a abstractC0857a) {
        if (abstractC0857a == null) {
            throw new NullPointerException("cst == null");
        }
        m1365i();
        AbstractC0687ac abstractC0687ac = (AbstractC0687ac) this.f1544a.get((C0870l) abstractC0857a);
        if (abstractC0687ac == null) {
            throw new IllegalArgumentException("not found");
        }
        return abstractC0687ac;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized C0738x m1512a(C0870l c0870l) {
        C0738x c0738x;
        if (c0870l == null) {
            throw new NullPointerException("field == null");
        }
        m1366j();
        c0738x = (C0738x) this.f1544a.get(c0870l);
        if (c0738x == null) {
            c0738x = new C0738x(c0870l);
            this.f1544a.put(c0870l, c0738x);
        }
        return c0738x;
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0704at
    /* JADX INFO: renamed from: a */
    public final Collection mo1308a() {
        return this.f1544a.values();
    }

    /* JADX INFO: renamed from: a */
    public final void m1513a(C0970r c0970r) {
        m1365i();
        int size = this.f1544a.size();
        int iG = size == 0 ? 0 : m1363g();
        if (c0970r.m2281b()) {
            c0970r.m2272a(4, "field_ids_size:  " + C1067a.m2556t(size));
            c0970r.m2272a(4, "field_ids_off:   " + C1067a.m2556t(iG));
        }
        c0970r.m2282c(size);
        c0970r.m2282c(iG);
    }

    /* JADX INFO: renamed from: b */
    public final int m1514b(C0870l c0870l) {
        if (c0870l == null) {
            throw new NullPointerException("ref == null");
        }
        m1365i();
        C0738x c0738x = (C0738x) this.f1544a.get(c0870l);
        if (c0738x == null) {
            throw new IllegalArgumentException("not found");
        }
        return c0738x.m1313i();
    }
}
