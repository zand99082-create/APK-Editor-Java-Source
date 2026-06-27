package com.p046a.p049b.p066f.p067a;

import com.p046a.p049b.p066f.p069c.C0884z;
import com.p046a.p049b.p073h.C0968p;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.a.b.f.a.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0824c extends C0968p implements Comparable {

    /* JADX INFO: renamed from: a */
    public static final C0824c f1946a;

    /* JADX INFO: renamed from: b */
    private final TreeMap f1947b = new TreeMap();

    static {
        C0824c c0824c = new C0824c();
        f1946a = c0824c;
        c0824c.mo811b_();
    }

    /* JADX INFO: renamed from: a */
    public static C0824c m1706a(C0824c c0824c, C0822a c0822a) {
        C0824c c0824c2 = new C0824c();
        c0824c2.m1708b(c0824c);
        c0824c2.m1710a(c0822a);
        c0824c2.mo811b_();
        return c0824c2;
    }

    /* JADX INFO: renamed from: a */
    public static C0824c m1707a(C0824c c0824c, C0824c c0824c2) {
        C0824c c0824c3 = new C0824c();
        c0824c3.m1708b(c0824c);
        c0824c3.m1708b(c0824c2);
        c0824c3.mo811b_();
        return c0824c3;
    }

    /* JADX INFO: renamed from: b */
    private void m1708b(C0824c c0824c) {
        m2266l();
        if (c0824c == null) {
            throw new NullPointerException("toAdd == null");
        }
        Iterator it = c0824c.f1947b.values().iterator();
        while (it.hasNext()) {
            m1710a((C0822a) it.next());
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C0824c c0824c) {
        Iterator it = this.f1947b.values().iterator();
        Iterator it2 = c0824c.f1947b.values().iterator();
        while (it.hasNext() && it2.hasNext()) {
            int iCompareTo = ((C0822a) it.next()).compareTo((C0822a) it2.next());
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        if (it.hasNext()) {
            return 1;
        }
        return it2.hasNext() ? -1 : 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m1710a(C0822a c0822a) {
        m2266l();
        if (c0822a == null) {
            throw new NullPointerException("annotation == null");
        }
        C0884z c0884zM1701b = c0822a.m1701b();
        if (this.f1947b.containsKey(c0884zM1701b)) {
            throw new IllegalArgumentException("duplicate type: " + c0884zM1701b.mo919d());
        }
        this.f1947b.put(c0884zM1701b, c0822a);
    }

    /* JADX INFO: renamed from: b */
    public final int m1711b() {
        return this.f1947b.size();
    }

    /* JADX INFO: renamed from: d */
    public final Collection m1712d() {
        return Collections.unmodifiableCollection(this.f1947b.values());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0824c) {
            return this.f1947b.equals(((C0824c) obj).f1947b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1947b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("annotations{");
        boolean z = true;
        for (C0822a c0822a : this.f1947b.values()) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(c0822a.mo919d());
        }
        sb.append("}");
        return sb.toString();
    }
}
