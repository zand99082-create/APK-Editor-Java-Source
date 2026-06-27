package com.p046a.p047a;

import com.gmail.heagoo.p084a.p089c.C1067a;
import jadx.core.deobf.Deobfuscator;

/* JADX INFO: renamed from: com.a.a.x */
/* JADX INFO: loaded from: classes.dex */
public final class C0507x implements Comparable {

    /* JADX INFO: renamed from: a */
    private final C0492i f746a;

    /* JADX INFO: renamed from: b */
    private final int f747b;

    /* JADX INFO: renamed from: c */
    private final int f748c;

    /* JADX INFO: renamed from: d */
    private final int f749d;

    public C0507x(C0492i c0492i, int i, int i2, int i3) {
        this.f746a = c0492i;
        this.f747b = i;
        this.f748c = i2;
        this.f749d = i3;
    }

    /* JADX INFO: renamed from: a */
    public final int m694a() {
        return this.f747b;
    }

    /* JADX INFO: renamed from: a */
    public final void m695a(C0498o c0498o) {
        c0498o.m652e(this.f747b);
        c0498o.m652e(this.f748c);
        c0498o.m654f(this.f749d);
    }

    /* JADX INFO: renamed from: b */
    public final int m696b() {
        return this.f748c;
    }

    /* JADX INFO: renamed from: c */
    public final int m697c() {
        return this.f749d;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        C0507x c0507x = (C0507x) obj;
        return this.f747b != c0507x.f747b ? C1067a.m2432a(this.f747b, c0507x.f747b) : this.f749d != c0507x.f749d ? C1067a.m2432a(this.f749d, c0507x.f749d) : C1067a.m2432a(this.f748c, c0507x.f748c);
    }

    public final String toString() {
        return this.f746a == null ? this.f747b + " " + this.f748c + " " + this.f749d : ((String) this.f746a.m627g().get(this.f747b)) + Deobfuscator.CLASS_NAME_SEPARATOR + ((String) this.f746a.m625e().get(this.f749d)) + this.f746a.m621b(((C0508y) this.f746a.m628h().get(this.f748c)).m701c());
    }
}
