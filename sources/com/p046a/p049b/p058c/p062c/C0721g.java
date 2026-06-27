package com.p046a.p049b.p058c.p062c;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p066f.p067a.C0824c;
import com.p046a.p049b.p066f.p067a.C0825d;
import com.p046a.p049b.p066f.p069c.C0870l;
import com.p046a.p049b.p066f.p069c.C0880v;
import com.p046a.p049b.p073h.C0970r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: com.a.b.c.c.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0721g extends AbstractC0700ap {

    /* JADX INFO: renamed from: a */
    private C0718d f1466a;

    /* JADX INFO: renamed from: b */
    private ArrayList f1467b;

    /* JADX INFO: renamed from: c */
    private ArrayList f1468c;

    /* JADX INFO: renamed from: d */
    private ArrayList f1469d;

    public C0721g() {
        super(4, -1);
        this.f1466a = null;
        this.f1467b = null;
        this.f1468c = null;
        this.f1469d = null;
    }

    /* JADX INFO: renamed from: a */
    private static int m1404a(ArrayList arrayList) {
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0700ap
    /* JADX INFO: renamed from: a */
    public final int mo1301a(AbstractC0700ap abstractC0700ap) {
        if (m1412d()) {
            return this.f1466a.compareTo(((C0721g) abstractC0700ap).f1466a);
        }
        throw new UnsupportedOperationException("uninternable instance");
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0688ad
    /* JADX INFO: renamed from: a */
    public final EnumC0689ae mo1302a() {
        return EnumC0689ae.f1394r;
    }

    /* JADX INFO: renamed from: a */
    public final C0824c m1405a(C0880v c0880v) {
        if (this.f1468c == null) {
            return null;
        }
        for (C0693ai c0693ai : this.f1468c) {
            if (c0693ai.m1324a().equals(c0880v)) {
                return c0693ai.m1327b();
            }
        }
        return null;
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0700ap
    /* JADX INFO: renamed from: a */
    protected final void mo1303a(AbstractC0704at abstractC0704at, int i) {
        m1342a((((m1404a(this.f1467b) + m1404a(this.f1468c)) + m1404a(this.f1469d)) << 3) + 16);
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0688ad
    /* JADX INFO: renamed from: a */
    public final void mo1304a(C0732r c0732r) {
        C0696al c0696alM1485e = c0732r.m1485e();
        if (this.f1466a != null) {
            this.f1466a = (C0718d) c0696alM1485e.m1336b(this.f1466a);
        }
        if (this.f1467b != null) {
            Iterator it = this.f1467b.iterator();
            while (it.hasNext()) {
                ((C0737w) it.next()).m1509a(c0732r);
            }
        }
        if (this.f1468c != null) {
            Iterator it2 = this.f1468c.iterator();
            while (it2.hasNext()) {
                ((C0693ai) it2.next()).m1325a(c0732r);
            }
        }
        if (this.f1469d != null) {
            Iterator it3 = this.f1469d.iterator();
            while (it3.hasNext()) {
                ((C0701aq) it3.next()).m1349a(c0732r);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1406a(C0824c c0824c, C0732r c0732r) {
        if (c0824c == null) {
            throw new NullPointerException("annotations == null");
        }
        if (this.f1466a != null) {
            throw new UnsupportedOperationException("class annotations already set");
        }
        this.f1466a = new C0718d(c0824c, c0732r);
    }

    /* JADX INFO: renamed from: a */
    public final void m1407a(C0870l c0870l, C0824c c0824c, C0732r c0732r) {
        if (this.f1467b == null) {
            this.f1467b = new ArrayList();
        }
        this.f1467b.add(new C0737w(c0870l, new C0718d(c0824c, c0732r)));
    }

    /* JADX INFO: renamed from: a */
    public final void m1408a(C0880v c0880v, C0824c c0824c, C0732r c0732r) {
        if (this.f1468c == null) {
            this.f1468c = new ArrayList();
        }
        this.f1468c.add(new C0693ai(c0880v, new C0718d(c0824c, c0732r)));
    }

    /* JADX INFO: renamed from: a */
    public final void m1409a(C0880v c0880v, C0825d c0825d, C0732r c0732r) {
        if (this.f1469d == null) {
            this.f1469d = new ArrayList();
        }
        this.f1469d.add(new C0701aq(c0880v, c0825d, c0732r));
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0700ap
    /* JADX INFO: renamed from: a_ */
    protected final void mo1306a_(C0732r c0732r, C0970r c0970r) {
        boolean zM2281b = c0970r.m2281b();
        int iM1341b = AbstractC0700ap.m1341b(this.f1466a);
        int iM1404a = m1404a(this.f1467b);
        int iM1404a2 = m1404a(this.f1468c);
        int iM1404a3 = m1404a(this.f1469d);
        if (zM2281b) {
            c0970r.m2272a(0, m1347h() + " annotations directory");
            c0970r.m2272a(4, "  class_annotations_off: " + C1067a.m2556t(iM1341b));
            c0970r.m2272a(4, "  fields_size:           " + C1067a.m2556t(iM1404a));
            c0970r.m2272a(4, "  methods_size:          " + C1067a.m2556t(iM1404a2));
            c0970r.m2272a(4, "  parameters_size:       " + C1067a.m2556t(iM1404a3));
        }
        c0970r.m2282c(iM1341b);
        c0970r.m2282c(iM1404a);
        c0970r.m2282c(iM1404a2);
        c0970r.m2282c(iM1404a3);
        if (iM1404a != 0) {
            Collections.sort(this.f1467b);
            if (zM2281b) {
                c0970r.m2272a(0, "  fields:");
            }
            Iterator it = this.f1467b.iterator();
            while (it.hasNext()) {
                ((C0737w) it.next()).m1510a(c0732r, c0970r);
            }
        }
        if (iM1404a2 != 0) {
            Collections.sort(this.f1468c);
            if (zM2281b) {
                c0970r.m2272a(0, "  methods:");
            }
            Iterator it2 = this.f1468c.iterator();
            while (it2.hasNext()) {
                ((C0693ai) it2.next()).m1326a(c0732r, c0970r);
            }
        }
        if (iM1404a3 != 0) {
            Collections.sort(this.f1469d);
            if (zM2281b) {
                c0970r.m2272a(0, "  parameters:");
            }
            Iterator it3 = this.f1469d.iterator();
            while (it3.hasNext()) {
                ((C0701aq) it3.next()).m1350a(c0732r, c0970r);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final C0825d m1410b(C0880v c0880v) {
        if (this.f1469d == null) {
            return null;
        }
        for (C0701aq c0701aq : this.f1469d) {
            if (c0701aq.m1348a().equals(c0880v)) {
                return c0701aq.m1351b();
            }
        }
        return null;
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0700ap
    /* JADX INFO: renamed from: b */
    public final String mo1307b() {
        throw new RuntimeException("unsupported");
    }

    /* JADX INFO: renamed from: c */
    public final boolean m1411c() {
        return this.f1466a == null && this.f1467b == null && this.f1468c == null && this.f1469d == null;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m1412d() {
        return this.f1466a != null && this.f1467b == null && this.f1468c == null && this.f1469d == null;
    }

    public final int hashCode() {
        if (this.f1466a == null) {
            return 0;
        }
        return this.f1466a.hashCode();
    }
}
