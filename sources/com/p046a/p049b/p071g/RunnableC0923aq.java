package com.p046a.p049b.p071g;

import com.p046a.p049b.p066f.p068b.C0843m;
import com.p046a.p049b.p066f.p068b.C0848r;
import com.p046a.p049b.p066f.p070d.C0887c;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.a.b.g.aq */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0923aq implements Runnable {

    /* JADX INFO: renamed from: a */
    private final C0920an f2473a;

    /* JADX INFO: renamed from: b */
    private int f2474b;

    /* JADX INFO: renamed from: c */
    private final int f2475c;

    /* JADX INFO: renamed from: d */
    private int f2476d;

    /* JADX INFO: renamed from: e */
    private final C0848r[][] f2477e;

    /* JADX INFO: renamed from: f */
    private final ArrayList f2478f;

    public RunnableC0923aq(C0920an c0920an) {
        this.f2475c = c0920an.m2123g();
        this.f2473a = c0920an;
        this.f2474b = this.f2475c;
        this.f2476d = 0;
        this.f2477e = new C0848r[c0920an.m2126j().size()][];
        this.f2478f = new ArrayList();
        C0848r[] c0848rArr = new C0848r[this.f2475c];
        for (int i = 0; i < this.f2475c; i++) {
            c0848rArr[i] = C0848r.m1778a(i, C0887c.f2350i);
        }
        this.f2477e[c0920an.m2116c()] = c0848rArr;
    }

    public RunnableC0923aq(C0920an c0920an, int i) {
        this(c0920an);
        this.f2476d = i;
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ C0843m m2134a(RunnableC0923aq runnableC0923aq, int i) {
        if (i < runnableC0923aq.f2478f.size()) {
            return (C0843m) runnableC0923aq.f2478f.get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ void m2135a(RunnableC0923aq runnableC0923aq, C0848r c0848r) {
        int iM1795g = c0848r.m1795g();
        C0843m c0843mM1797i = c0848r.m1797i();
        runnableC0923aq.f2478f.ensureCapacity(iM1795g + 1);
        while (runnableC0923aq.f2478f.size() <= iM1795g) {
            runnableC0923aq.f2478f.add(null);
        }
        runnableC0923aq.f2478f.set(iM1795g, c0843mM1797i);
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ boolean m2136a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ C0848r[] m2137a(C0848r[] c0848rArr) {
        C0848r[] c0848rArr2 = new C0848r[c0848rArr.length];
        System.arraycopy(c0848rArr, 0, c0848rArr2, 0, c0848rArr.length);
        return c0848rArr2;
    }

    /* JADX INFO: renamed from: b */
    static /* synthetic */ boolean m2140b(RunnableC0923aq runnableC0923aq, int i) {
        return i < runnableC0923aq.f2476d;
    }

    /* JADX INFO: renamed from: c */
    static /* synthetic */ boolean m2142c(RunnableC0923aq runnableC0923aq, int i) {
        return i < runnableC0923aq.f2475c;
    }

    /* JADX INFO: renamed from: d */
    static /* synthetic */ int m2143d(RunnableC0923aq runnableC0923aq) {
        int i = runnableC0923aq.f2474b;
        runnableC0923aq.f2474b = i + 1;
        return i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2473a.m2104a(new C0924ar(this));
        this.f2473a.m2121e(this.f2474b);
        this.f2473a.m2129m();
    }
}
