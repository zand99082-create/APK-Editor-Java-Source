package com.p046a.p047a;

import com.gmail.heagoo.p084a.p089c.C1067a;

/* JADX INFO: renamed from: com.a.a.y */
/* JADX INFO: loaded from: classes.dex */
public final class C0508y implements Comparable {

    /* JADX INFO: renamed from: a */
    private final C0492i f750a;

    /* JADX INFO: renamed from: b */
    private final int f751b;

    /* JADX INFO: renamed from: c */
    private final int f752c;

    /* JADX INFO: renamed from: d */
    private final int f753d;

    public C0508y(C0492i c0492i, int i, int i2, int i3) {
        this.f750a = c0492i;
        this.f751b = i;
        this.f752c = i2;
        this.f753d = i3;
    }

    /* JADX INFO: renamed from: a */
    public final int m698a() {
        return this.f751b;
    }

    /* JADX INFO: renamed from: a */
    public final void m699a(C0498o c0498o) {
        c0498o.m654f(this.f751b);
        c0498o.m654f(this.f752c);
        c0498o.m654f(this.f753d);
    }

    /* JADX INFO: renamed from: b */
    public final int m700b() {
        return this.f752c;
    }

    /* JADX INFO: renamed from: c */
    public final int m701c() {
        return this.f753d;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        C0508y c0508y = (C0508y) obj;
        return this.f752c != c0508y.f752c ? C1067a.m2432a(this.f752c, c0508y.f752c) : C1067a.m2432a(this.f753d, c0508y.f753d);
    }

    public final String toString() {
        return this.f750a == null ? this.f751b + " " + this.f752c + " " + this.f753d : ((String) this.f750a.m625e().get(this.f751b)) + ": " + ((String) this.f750a.m627g().get(this.f752c)) + " " + this.f750a.m621b(this.f753d);
    }
}
