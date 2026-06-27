package com.p046a.p047a;

import com.gmail.heagoo.p084a.p089c.C1067a;
import jadx.core.deobf.Deobfuscator;

/* JADX INFO: renamed from: com.a.a.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0506w implements Comparable {

    /* JADX INFO: renamed from: a */
    private final C0492i f742a;

    /* JADX INFO: renamed from: b */
    private final int f743b;

    /* JADX INFO: renamed from: c */
    private final int f744c;

    /* JADX INFO: renamed from: d */
    private final int f745d;

    public C0506w(C0492i c0492i, int i, int i2, int i3) {
        this.f742a = c0492i;
        this.f743b = i;
        this.f744c = i2;
        this.f745d = i3;
    }

    /* JADX INFO: renamed from: a */
    public final int m690a() {
        return this.f743b;
    }

    /* JADX INFO: renamed from: a */
    public final void m691a(C0498o c0498o) {
        c0498o.m652e(this.f743b);
        c0498o.m652e(this.f744c);
        c0498o.m654f(this.f745d);
    }

    /* JADX INFO: renamed from: b */
    public final int m692b() {
        return this.f744c;
    }

    /* JADX INFO: renamed from: c */
    public final int m693c() {
        return this.f745d;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        C0506w c0506w = (C0506w) obj;
        return this.f743b != c0506w.f743b ? C1067a.m2432a(this.f743b, c0506w.f743b) : this.f745d != c0506w.f745d ? C1067a.m2432a(this.f745d, c0506w.f745d) : C1067a.m2432a(this.f744c, c0506w.f744c);
    }

    public final String toString() {
        return this.f742a == null ? this.f743b + " " + this.f744c + " " + this.f745d : ((String) this.f742a.m627g().get(this.f744c)) + Deobfuscator.CLASS_NAME_SEPARATOR + ((String) this.f742a.m625e().get(this.f745d));
    }
}
