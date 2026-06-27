package com.p046a.p049b.p058c.p062c;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p066f.p069c.C0870l;
import com.p046a.p049b.p073h.C0970r;

/* JADX INFO: renamed from: com.a.b.c.c.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0734t extends AbstractC0735u implements Comparable {

    /* JADX INFO: renamed from: a */
    private final C0870l f1538a;

    public C0734t(C0870l c0870l, int i) {
        super(i);
        this.f1538a = c0870l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C0734t c0734t) {
        return this.f1538a.compareTo(c0734t.f1538a);
    }

    @Override // com.p046a.p049b.p058c.p062c.AbstractC0735u
    /* JADX INFO: renamed from: a */
    public final int mo1500a(C0732r c0732r, C0970r c0970r, int i, int i2) {
        int iM1514b = c0732r.m1493m().m1514b(this.f1538a);
        int i3 = iM1514b - i;
        int iB = m1503b();
        if (c0970r.m2281b()) {
            c0970r.m2272a(0, String.format("  [%x] %s", Integer.valueOf(i2), this.f1538a.mo919d()));
            c0970r.m2272a(C1067a.m2523d(i3), "    field_idx:    " + C1067a.m2556t(iM1514b));
            c0970r.m2272a(C1067a.m2523d(iB), "    access_flags: " + C1067a.m2540i(iB));
        }
        c0970r.m2286e(i3);
        c0970r.m2286e(iB);
        return iM1514b;
    }

    /* JADX INFO: renamed from: a */
    public final C0870l m1501a() {
        return this.f1538a;
    }

    /* JADX INFO: renamed from: a */
    public final void m1502a(C0732r c0732r) {
        c0732r.m1493m().m1512a(this.f1538a);
    }

    @Override // com.p046a.p049b.p073h.InterfaceC0971s
    /* JADX INFO: renamed from: d */
    public final String mo919d() {
        return this.f1538a.mo919d();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0734t) && compareTo((C0734t) obj) == 0;
    }

    public final int hashCode() {
        return this.f1538a.hashCode();
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer(100);
        stringBuffer.append(getClass().getName());
        stringBuffer.append('{');
        stringBuffer.append(C1067a.m2558v(m1503b()));
        stringBuffer.append(' ');
        stringBuffer.append(this.f1538a);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
