package com.p046a.p047a;

/* JADX INFO: renamed from: com.a.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0478a implements Comparable {

    /* JADX INFO: renamed from: a */
    private final C0492i f667a;

    /* JADX INFO: renamed from: b */
    private final byte f668b;

    /* JADX INFO: renamed from: c */
    private final C0504u f669c;

    public C0478a(C0492i c0492i, byte b2, C0504u c0504u) {
        this.f667a = c0492i;
        this.f668b = b2;
        this.f669c = c0504u;
    }

    /* JADX INFO: renamed from: c */
    private int m564c() {
        C0505v c0505vM567b = m567b();
        c0505vM567b.m672c();
        return c0505vM567b.m673d();
    }

    /* JADX INFO: renamed from: a */
    public final byte m565a() {
        return this.f668b;
    }

    /* JADX INFO: renamed from: a */
    public final void m566a(C0498o c0498o) {
        c0498o.mo569d(this.f668b);
        this.f669c.m668a(c0498o);
    }

    /* JADX INFO: renamed from: b */
    public final C0505v m567b() {
        return new C0505v(this.f669c, 29);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.f669c.compareTo(((C0478a) obj).f669c);
    }

    public final String toString() {
        return this.f667a == null ? ((int) this.f668b) + " " + m564c() : ((int) this.f668b) + " " + ((String) this.f667a.m627g().get(m564c()));
    }
}
