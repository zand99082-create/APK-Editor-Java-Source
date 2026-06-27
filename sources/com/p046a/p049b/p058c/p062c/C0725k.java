package com.p046a.p049b.p058c.p062c;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p066f.p069c.AbstractC0857a;
import com.p046a.p049b.p066f.p069c.C0884z;
import com.p046a.p049b.p066f.p070d.C0887c;
import com.p046a.p049b.p066f.p070d.InterfaceC0889e;
import com.p046a.p049b.p073h.C0970r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.a.b.c.c.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0725k extends AbstractC0714bc {

    /* JADX INFO: renamed from: a */
    private final TreeMap f1491a;

    /* JADX INFO: renamed from: b */
    private ArrayList f1492b;

    public C0725k(C0732r c0732r) {
        super("class_defs", c0732r, 4);
        this.f1491a = new TreeMap();
        this.f1492b = null;
    }

    /* JADX INFO: renamed from: a */
    private int m1446a(C0887c c0887c, int i, int i2) {
        C0724j c0724j = (C0724j) this.f1491a.get(c0887c);
        if (c0724j == null || c0724j.m1312h()) {
            return i;
        }
        if (i2 < 0) {
            throw new RuntimeException("class circularity with " + c0887c);
        }
        int i3 = i2 - 1;
        C0884z c0884zM1442d = c0724j.m1442d();
        if (c0884zM1442d != null) {
            i = m1446a(c0884zM1442d.m1917i(), i, i3);
        }
        InterfaceC0889e interfaceC0889eM1443e = c0724j.m1443e();
        int iMo1021d_ = interfaceC0889eM1443e.mo1021d_();
        for (int i4 = 0; i4 < iMo1021d_; i4++) {
            i = m1446a(interfaceC0889eM1443e.mo1018a(i4), i, i3);
        }
        c0724j.m1311a(i);
        this.f1492b.add(c0724j);
        return i + 1;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC0687ac m1447a(AbstractC0857a abstractC0857a) {
        m1365i();
        AbstractC0687ac abstractC0687ac = (AbstractC0687ac) this.f1491a.get(((C0884z) abstractC0857a).m1917i());
        if (abstractC0687ac == null) {
            throw new IllegalArgumentException("not found");
        }
        return abstractC0687ac;
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0704at
    /* JADX INFO: renamed from: a */
    public final Collection mo1308a() {
        return this.f1492b != null ? this.f1492b : this.f1491a.values();
    }

    /* JADX INFO: renamed from: a */
    public final void m1448a(C0724j c0724j) {
        try {
            C0887c c0887cM1917i = c0724j.m1441c().m1917i();
            m1366j();
            if (this.f1491a.get(c0887cM1917i) != null) {
                throw new IllegalArgumentException("already added: " + c0887cM1917i);
            }
            this.f1491a.put(c0887cM1917i, c0724j);
        } catch (NullPointerException e) {
            throw new NullPointerException("clazz == null");
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1449a(C0970r c0970r) {
        m1365i();
        int size = this.f1491a.size();
        int iG = size == 0 ? 0 : m1363g();
        if (c0970r.m2281b()) {
            c0970r.m2272a(4, "class_defs_size: " + C1067a.m2556t(size));
            c0970r.m2272a(4, "class_defs_off:  " + C1067a.m2556t(iG));
        }
        c0970r.m2282c(size);
        c0970r.m2282c(iG);
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0714bc
    /* JADX INFO: renamed from: b */
    protected final void mo1309b() {
        int size = this.f1491a.size();
        int iM1446a = 0;
        this.f1492b = new ArrayList(size);
        Iterator it = this.f1491a.keySet().iterator();
        while (true) {
            int i = iM1446a;
            if (!it.hasNext()) {
                return;
            } else {
                iM1446a = m1446a((C0887c) it.next(), i, size - i);
            }
        }
    }
}
