package com.p046a.p049b.p058c.p062c;

import com.p046a.p047a.p048a.C0482d;
import com.p046a.p049b.p073h.C0970r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.a.b.c.c.al */
/* JADX INFO: loaded from: classes.dex */
public final class C0696al extends AbstractC0704at {

    /* JADX INFO: renamed from: a */
    private static final Comparator f1410a = new C0697am();

    /* JADX INFO: renamed from: b */
    private final ArrayList f1411b;

    /* JADX INFO: renamed from: c */
    private final HashMap f1412c;

    /* JADX INFO: renamed from: d */
    private final int f1413d;

    /* JADX INFO: renamed from: e */
    private int f1414e;

    public C0696al(String str, C0732r c0732r, int i, int i2) {
        super(str, c0732r, i);
        this.f1411b = new ArrayList(100);
        this.f1412c = new HashMap(100);
        this.f1413d = i2;
        this.f1414e = -1;
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0704at
    /* JADX INFO: renamed from: a */
    public final int mo1332a(AbstractC0688ad abstractC0688ad) {
        return ((AbstractC0700ap) abstractC0688ad).m1345f();
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0704at
    /* JADX INFO: renamed from: a */
    public final Collection mo1308a() {
        return this.f1411b;
    }

    /* JADX INFO: renamed from: a */
    public final void m1333a(AbstractC0700ap abstractC0700ap) {
        m1366j();
        try {
            if (abstractC0700ap.m1346g() > m1362f()) {
                throw new IllegalArgumentException("incompatible item alignment");
            }
            this.f1411b.add(abstractC0700ap);
        } catch (NullPointerException e) {
            throw new NullPointerException("item == null");
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1334a(C0970r c0970r, EnumC0689ae enumC0689ae, String str) {
        m1365i();
        TreeMap treeMap = new TreeMap();
        for (AbstractC0700ap abstractC0700ap : this.f1411b) {
            if (abstractC0700ap.mo1302a() == enumC0689ae) {
                treeMap.put(abstractC0700ap.mo1307b(), abstractC0700ap);
            }
        }
        if (treeMap.size() == 0) {
            return;
        }
        c0970r.m2272a(0, str);
        for (Map.Entry entry : treeMap.entrySet()) {
            c0970r.m2272a(0, ((AbstractC0700ap) entry.getValue()).m1347h() + ' ' + ((String) entry.getKey()) + '\n');
        }
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0704at
    /* JADX INFO: renamed from: a_ */
    protected final void mo1335a_(C0970r c0970r) {
        boolean zM2281b = c0970r.m2281b();
        C0732r c0732rE = m1361e();
        int iMo1316e_ = 0;
        boolean z = true;
        for (AbstractC0700ap abstractC0700ap : this.f1411b) {
            if (zM2281b) {
                if (z) {
                    z = false;
                } else {
                    c0970r.m2272a(0, "\n");
                }
            }
            int iM1346g = abstractC0700ap.m1346g() - 1;
            int i = (iM1346g ^ (-1)) & (iMo1316e_ + iM1346g);
            if (iMo1316e_ != i) {
                c0970r.m2287f(i - iMo1316e_);
                iMo1316e_ = i;
            }
            abstractC0700ap.mo1315a(c0732rE, c0970r);
            iMo1316e_ = abstractC0700ap.mo1316e_() + iMo1316e_;
        }
        if (iMo1316e_ != this.f1414e) {
            throw new RuntimeException("output size mismatch");
        }
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC0700ap m1336b(AbstractC0700ap abstractC0700ap) {
        m1366j();
        AbstractC0700ap abstractC0700ap2 = (AbstractC0700ap) this.f1412c.get(abstractC0700ap);
        if (abstractC0700ap2 != null) {
            return abstractC0700ap2;
        }
        m1333a(abstractC0700ap);
        this.f1412c.put(abstractC0700ap, abstractC0700ap);
        return abstractC0700ap;
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0704at
    /* JADX INFO: renamed from: c */
    protected final void mo1337c() {
        C0732r c0732rE = m1361e();
        int i = 0;
        while (true) {
            int size = this.f1411b.size();
            if (i >= size) {
                return;
            }
            int i2 = i;
            while (i2 < size) {
                ((AbstractC0700ap) this.f1411b.get(i2)).mo1304a(c0732rE);
                i2++;
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m1338d() {
        m1365i();
        switch (C0698an.f1415a[this.f1413d - 1]) {
            case 1:
                Collections.sort(this.f1411b);
                break;
            case 2:
                Collections.sort(this.f1411b, f1410a);
                break;
        }
        int size = this.f1411b.size();
        int iMo1316e_ = 0;
        for (int i = 0; i < size; i++) {
            AbstractC0700ap abstractC0700ap = (AbstractC0700ap) this.f1411b.get(i);
            try {
                int iM1343b = abstractC0700ap.m1343b(this, iMo1316e_);
                if (iM1343b < iMo1316e_) {
                    throw new RuntimeException("bogus place() result for " + abstractC0700ap);
                }
                iMo1316e_ = iM1343b + abstractC0700ap.mo1316e_();
            } catch (RuntimeException e) {
                throw C0482d.m570a(e, "...while placing " + abstractC0700ap);
            }
        }
        this.f1414e = iMo1316e_;
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0704at
    /* JADX INFO: renamed from: f_ */
    public final int mo1339f_() {
        m1365i();
        return this.f1414e;
    }
}
