package com.p046a.p049b.p058c.p062c;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p047a.C0503t;
import com.p046a.p049b.p056b.p057a.C0605a;
import com.p046a.p049b.p066f.p069c.AbstractC0857a;
import com.p046a.p049b.p066f.p069c.C0884z;
import com.p046a.p049b.p066f.p070d.C0887c;
import com.p046a.p049b.p073h.C0970r;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.a.b.c.c.ba */
/* JADX INFO: loaded from: classes.dex */
public final class C0712ba extends AbstractC0714bc {

    /* JADX INFO: renamed from: a */
    private final TreeMap f1447a;

    public C0712ba(C0732r c0732r) {
        super("type_ids", c0732r, 4);
        this.f1447a = new TreeMap();
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC0687ac m1378a(AbstractC0857a abstractC0857a) {
        if (abstractC0857a == null) {
            throw new NullPointerException("cst == null");
        }
        m1365i();
        AbstractC0687ac abstractC0687ac = (AbstractC0687ac) this.f1447a.get(((C0884z) abstractC0857a).m1917i());
        if (abstractC0687ac == null) {
            throw new IllegalArgumentException("not found: " + abstractC0857a);
        }
        return abstractC0687ac;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized C0710az m1379a(C0884z c0884z) {
        C0710az c0710az;
        if (c0884z == null) {
            throw new NullPointerException("type == null");
        }
        m1366j();
        C0887c c0887cM1917i = c0884z.m1917i();
        c0710az = (C0710az) this.f1447a.get(c0887cM1917i);
        if (c0710az == null) {
            c0710az = new C0710az(c0884z);
            this.f1447a.put(c0887cM1917i, c0710az);
        }
        return c0710az;
    }

    /* JADX INFO: renamed from: a */
    public final C0710az m1380a(C0887c c0887c) {
        if (c0887c == null) {
            throw new NullPointerException("type == null");
        }
        m1366j();
        C0710az c0710az = (C0710az) this.f1447a.get(c0887c);
        if (c0710az != null) {
            return c0710az;
        }
        C0710az c0710az2 = new C0710az(new C0884z(c0887c));
        this.f1447a.put(c0887c, c0710az2);
        return c0710az2;
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0704at
    /* JADX INFO: renamed from: a */
    public final Collection mo1308a() {
        return this.f1447a.values();
    }

    /* JADX INFO: renamed from: b */
    public final int m1381b(C0884z c0884z) {
        if (c0884z == null) {
            throw new NullPointerException("type == null");
        }
        return m1382b(c0884z.m1917i());
    }

    /* JADX INFO: renamed from: b */
    public final int m1382b(C0887c c0887c) {
        if (c0887c == null) {
            throw new NullPointerException("type == null");
        }
        m1365i();
        C0710az c0710az = (C0710az) this.f1447a.get(c0887c);
        if (c0710az == null) {
            throw new IllegalArgumentException("not found: " + c0887c);
        }
        return c0710az.m1313i();
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0714bc
    /* JADX INFO: renamed from: b */
    protected final void mo1309b() {
        int i = 0;
        Iterator it = this.f1447a.values().iterator();
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return;
            }
            ((C0710az) it.next()).m1311a(i2);
            i = i2 + 1;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1383b(C0970r c0970r) {
        m1365i();
        int size = this.f1447a.size();
        int iG = size == 0 ? 0 : m1363g();
        if (size > 65536) {
            throw new C0503t("Too many type references: " + size + "; max is 65536.\n" + C0605a.m1062a());
        }
        if (c0970r.m2281b()) {
            c0970r.m2272a(4, "type_ids_size:   " + C1067a.m2556t(size));
            c0970r.m2272a(4, "type_ids_off:    " + C1067a.m2556t(iG));
        }
        c0970r.m2282c(size);
        c0970r.m2282c(iG);
    }
}
