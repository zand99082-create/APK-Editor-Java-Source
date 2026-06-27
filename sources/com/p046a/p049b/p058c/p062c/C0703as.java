package com.p046a.p049b.p058c.p062c;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p066f.p070d.C0885a;
import com.p046a.p049b.p073h.C0970r;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.a.b.c.c.as */
/* JADX INFO: loaded from: classes.dex */
public final class C0703as extends AbstractC0714bc {

    /* JADX INFO: renamed from: a */
    private final TreeMap f1430a;

    public C0703as(C0732r c0732r) {
        super("proto_ids", c0732r, 4);
        this.f1430a = new TreeMap();
    }

    /* JADX INFO: renamed from: a */
    public final C0702ar m1354a(C0885a c0885a) {
        if (c0885a == null) {
            throw new NullPointerException("prototype == null");
        }
        m1366j();
        C0702ar c0702ar = (C0702ar) this.f1430a.get(c0885a);
        if (c0702ar != null) {
            return c0702ar;
        }
        C0702ar c0702ar2 = new C0702ar(c0885a);
        this.f1430a.put(c0885a, c0702ar2);
        return c0702ar2;
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0704at
    /* JADX INFO: renamed from: a */
    public final Collection mo1308a() {
        return this.f1430a.values();
    }

    /* JADX INFO: renamed from: b */
    public final int m1355b(C0885a c0885a) {
        if (c0885a == null) {
            throw new NullPointerException("prototype == null");
        }
        m1365i();
        C0702ar c0702ar = (C0702ar) this.f1430a.get(c0885a);
        if (c0702ar == null) {
            throw new IllegalArgumentException("not found");
        }
        return c0702ar.m1313i();
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0714bc
    /* JADX INFO: renamed from: b */
    protected final void mo1309b() {
        int i = 0;
        Iterator it = this.f1430a.values().iterator();
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return;
            }
            ((C0702ar) it.next()).m1311a(i2);
            i = i2 + 1;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1356b(C0970r c0970r) {
        m1365i();
        int size = this.f1430a.size();
        int iG = size == 0 ? 0 : m1363g();
        if (size > 65536) {
            throw new UnsupportedOperationException("too many proto ids");
        }
        if (c0970r.m2281b()) {
            c0970r.m2272a(4, "proto_ids_size:  " + C1067a.m2556t(size));
            c0970r.m2272a(4, "proto_ids_off:   " + C1067a.m2556t(iG));
        }
        c0970r.m2282c(size);
        c0970r.m2282c(iG);
    }
}
