package com.p046a.p049b.p058c.p062c;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p066f.p069c.AbstractC0857a;
import com.p046a.p049b.p066f.p069c.AbstractC0877s;
import com.p046a.p049b.p066f.p069c.C0862d;
import com.p046a.p049b.p066f.p069c.C0863e;
import com.p046a.p049b.p066f.p069c.C0884z;
import com.p046a.p049b.p073h.C0970r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: com.a.b.c.c.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0723i extends AbstractC0700ap {

    /* JADX INFO: renamed from: a */
    private final C0884z f1475a;

    /* JADX INFO: renamed from: b */
    private final ArrayList f1476b;

    /* JADX INFO: renamed from: c */
    private final HashMap f1477c;

    /* JADX INFO: renamed from: d */
    private final ArrayList f1478d;

    /* JADX INFO: renamed from: e */
    private final ArrayList f1479e;

    /* JADX INFO: renamed from: f */
    private final ArrayList f1480f;

    /* JADX INFO: renamed from: g */
    private C0862d f1481g;

    /* JADX INFO: renamed from: h */
    private byte[] f1482h;

    public C0723i(C0884z c0884z) {
        super(1, -1);
        if (c0884z == null) {
            throw new NullPointerException("thisClass == null");
        }
        this.f1475a = c0884z;
        this.f1476b = new ArrayList(20);
        this.f1477c = new HashMap(40);
        this.f1478d = new ArrayList(20);
        this.f1479e = new ArrayList(20);
        this.f1480f = new ArrayList(20);
        this.f1481g = null;
    }

    /* JADX INFO: renamed from: a */
    private static void m1421a(C0732r c0732r, C0970r c0970r, String str, ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return;
        }
        if (c0970r.m2281b()) {
            c0970r.m2272a(0, "  " + str + ":");
        }
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            int iMo1500a = ((AbstractC0735u) arrayList.get(i2)).mo1500a(c0732r, c0970r, i, i2);
            i2++;
            i = iMo1500a;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m1422a(C0970r c0970r, String str, int i) {
        if (c0970r.m2281b()) {
            c0970r.m2277a(String.format("  %-21s %08x", str + "_size:", Integer.valueOf(i)));
        }
        c0970r.m2286e(i);
    }

    /* JADX INFO: renamed from: b */
    private void m1423b(C0732r c0732r, C0970r c0970r) {
        boolean zM2281b = c0970r.m2281b();
        if (zM2281b) {
            c0970r.m2272a(0, m1347h() + " class data for " + this.f1475a.mo919d());
        }
        m1422a(c0970r, "static_fields", this.f1476b.size());
        m1422a(c0970r, "instance_fields", this.f1478d.size());
        m1422a(c0970r, "direct_methods", this.f1479e.size());
        m1422a(c0970r, "virtual_methods", this.f1480f.size());
        m1421a(c0732r, c0970r, "static_fields", this.f1476b);
        m1421a(c0732r, c0970r, "instance_fields", this.f1478d);
        m1421a(c0732r, c0970r, "direct_methods", this.f1479e);
        m1421a(c0732r, c0970r, "virtual_methods", this.f1480f);
        if (zM2281b) {
            c0970r.m2284d();
        }
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0688ad
    /* JADX INFO: renamed from: a */
    public final EnumC0689ae mo1302a() {
        return EnumC0689ae.f1388l;
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0700ap
    /* JADX INFO: renamed from: a */
    protected final void mo1303a(AbstractC0704at abstractC0704at, int i) {
        C0970r c0970r = new C0970r();
        m1423b(abstractC0704at.m1361e(), c0970r);
        this.f1482h = c0970r.m2290g();
        m1342a(this.f1482h.length);
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0688ad
    /* JADX INFO: renamed from: a */
    public final void mo1304a(C0732r c0732r) {
        if (!this.f1476b.isEmpty()) {
            m1430e();
            Iterator it = this.f1476b.iterator();
            while (it.hasNext()) {
                ((C0734t) it.next()).m1502a(c0732r);
            }
        }
        if (!this.f1478d.isEmpty()) {
            Collections.sort(this.f1478d);
            Iterator it2 = this.f1478d.iterator();
            while (it2.hasNext()) {
                ((C0734t) it2.next()).m1502a(c0732r);
            }
        }
        if (!this.f1479e.isEmpty()) {
            Collections.sort(this.f1479e);
            Iterator it3 = this.f1479e.iterator();
            while (it3.hasNext()) {
                ((C0736v) it3.next()).m1506a(c0732r);
            }
        }
        if (this.f1480f.isEmpty()) {
            return;
        }
        Collections.sort(this.f1480f);
        Iterator it4 = this.f1480f.iterator();
        while (it4.hasNext()) {
            ((C0736v) it4.next()).m1506a(c0732r);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1424a(C0734t c0734t) {
        if (c0734t == null) {
            throw new NullPointerException("field == null");
        }
        this.f1478d.add(c0734t);
    }

    /* JADX INFO: renamed from: a */
    public final void m1425a(C0734t c0734t, AbstractC0857a abstractC0857a) {
        if (c0734t == null) {
            throw new NullPointerException("field == null");
        }
        if (this.f1481g != null) {
            throw new UnsupportedOperationException("static fields already sorted");
        }
        this.f1476b.add(c0734t);
        this.f1477c.put(c0734t, abstractC0857a);
    }

    /* JADX INFO: renamed from: a */
    public final void m1426a(C0736v c0736v) {
        if (c0736v == null) {
            throw new NullPointerException("method == null");
        }
        this.f1479e.add(c0736v);
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0700ap
    /* JADX INFO: renamed from: a_ */
    public final void mo1306a_(C0732r c0732r, C0970r c0970r) {
        if (c0970r.m2281b()) {
            m1423b(c0732r, c0970r);
        } else {
            c0970r.m2278a(this.f1482h);
        }
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0700ap
    /* JADX INFO: renamed from: b */
    public final String mo1307b() {
        return toString();
    }

    /* JADX INFO: renamed from: b */
    public final void m1427b(C0736v c0736v) {
        if (c0736v == null) {
            throw new NullPointerException("method == null");
        }
        this.f1480f.add(c0736v);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m1428c() {
        return this.f1476b.isEmpty() && this.f1478d.isEmpty() && this.f1479e.isEmpty() && this.f1480f.isEmpty();
    }

    /* JADX INFO: renamed from: d */
    public final ArrayList m1429d() {
        ArrayList arrayList = new ArrayList(this.f1479e.size() + this.f1480f.size());
        arrayList.addAll(this.f1479e);
        arrayList.addAll(this.f1480f);
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public final C0862d m1430e() {
        C0862d c0862d;
        if (this.f1481g == null && this.f1476b.size() != 0) {
            Collections.sort(this.f1476b);
            int size = this.f1476b.size();
            while (size > 0) {
                AbstractC0857a abstractC0857a = (AbstractC0857a) this.f1477c.get((C0734t) this.f1476b.get(size - 1));
                if (!(abstractC0857a instanceof AbstractC0877s)) {
                    if (abstractC0857a != null) {
                        break;
                    }
                    size--;
                } else {
                    if (((AbstractC0877s) abstractC0857a).mo1895k() != 0) {
                        break;
                    }
                    size--;
                }
            }
            if (size == 0) {
                c0862d = null;
            } else {
                C0863e c0863e = new C0863e(size);
                for (int i = 0; i < size; i++) {
                    C0734t c0734t = (C0734t) this.f1476b.get(i);
                    AbstractC0857a abstractC0857aM2447a = (AbstractC0857a) this.f1477c.get(c0734t);
                    if (abstractC0857aM2447a == null) {
                        abstractC0857aM2447a = C1067a.m2447a(c0734t.m1501a().mo925a());
                    }
                    c0863e.m1877a(i, abstractC0857aM2447a);
                }
                c0863e.mo811b_();
                c0862d = new C0862d(c0863e);
            }
            this.f1481g = c0862d;
        }
        return this.f1481g;
    }
}
