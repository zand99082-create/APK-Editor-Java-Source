package com.p046a.p049b.p066f.p067a;

import com.p046a.p049b.p066f.p069c.C0883y;
import com.p046a.p049b.p066f.p069c.C0884z;
import com.p046a.p049b.p073h.C0968p;
import com.p046a.p049b.p073h.InterfaceC0971s;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.a.b.f.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0822a extends C0968p implements InterfaceC0971s, Comparable {

    /* JADX INFO: renamed from: a */
    private final C0884z f1937a;

    /* JADX INFO: renamed from: b */
    private final EnumC0823b f1938b;

    /* JADX INFO: renamed from: c */
    private final TreeMap f1939c;

    public C0822a(C0884z c0884z, EnumC0823b enumC0823b) {
        if (c0884z == null) {
            throw new NullPointerException("type == null");
        }
        if (enumC0823b == null) {
            throw new NullPointerException("visibility == null");
        }
        this.f1937a = c0884z;
        this.f1938b = enumC0823b;
        this.f1939c = new TreeMap();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C0822a c0822a) {
        int iA = this.f1937a.compareTo(c0822a.f1937a);
        if (iA != 0) {
            return iA;
        }
        int iCompareTo = this.f1938b.compareTo(c0822a.f1938b);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        Iterator it = this.f1939c.values().iterator();
        Iterator it2 = c0822a.f1939c.values().iterator();
        while (it.hasNext() && it2.hasNext()) {
            int iCompareTo2 = ((C0826e) it.next()).compareTo((C0826e) it2.next());
            if (iCompareTo2 != 0) {
                return iCompareTo2;
            }
        }
        if (it.hasNext()) {
            return 1;
        }
        return it2.hasNext() ? -1 : 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m1700a(C0826e c0826e) {
        m2266l();
        this.f1939c.put(c0826e.m1717a(), c0826e);
    }

    /* JADX INFO: renamed from: b */
    public final C0884z m1701b() {
        return this.f1937a;
    }

    /* JADX INFO: renamed from: b */
    public final void m1702b(C0826e c0826e) {
        m2266l();
        if (c0826e == null) {
            throw new NullPointerException("pair == null");
        }
        C0883y c0883yM1717a = c0826e.m1717a();
        if (this.f1939c.get(c0883yM1717a) != null) {
            throw new IllegalArgumentException("name already added: " + c0883yM1717a);
        }
        this.f1939c.put(c0883yM1717a, c0826e);
    }

    @Override // com.p046a.p049b.p073h.InterfaceC0971s
    /* JADX INFO: renamed from: d */
    public final String mo919d() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1938b.mo919d());
        sb.append("-annotation ");
        sb.append(this.f1937a.mo919d());
        sb.append(" {");
        boolean z = true;
        for (C0826e c0826e : this.f1939c.values()) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(c0826e.m1717a().mo919d());
            sb.append(": ");
            sb.append(c0826e.m1718b().mo919d());
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: e */
    public final EnumC0823b m1703e() {
        return this.f1938b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0822a)) {
            return false;
        }
        C0822a c0822a = (C0822a) obj;
        if (this.f1937a.equals(c0822a.f1937a) && this.f1938b == c0822a.f1938b) {
            return this.f1939c.equals(c0822a.f1939c);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final Collection m1704f() {
        return Collections.unmodifiableCollection(this.f1939c.values());
    }

    public final int hashCode() {
        return (((this.f1937a.hashCode() * 31) + this.f1939c.hashCode()) * 31) + this.f1938b.hashCode();
    }

    public final String toString() {
        return mo919d();
    }
}
