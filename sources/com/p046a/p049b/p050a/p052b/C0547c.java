package com.p046a.p049b.p050a.p052b;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p073h.C0962j;
import com.p046a.p049b.p073h.InterfaceC0964l;

/* JADX INFO: renamed from: com.a.b.a.b.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0547c implements InterfaceC0964l {

    /* JADX INFO: renamed from: a */
    private final int f872a;

    /* JADX INFO: renamed from: b */
    private final int f873b;

    /* JADX INFO: renamed from: c */
    private final int f874c;

    /* JADX INFO: renamed from: d */
    private final C0962j f875d;

    /* JADX INFO: renamed from: e */
    private final C0549e f876e;

    public C0547c(int i, int i2, int i3, C0962j c0962j, C0549e c0549e) {
        if (i < 0) {
            throw new IllegalArgumentException("label < 0");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("start < 0");
        }
        if (i3 <= i2) {
            throw new IllegalArgumentException("end <= start");
        }
        if (c0962j == null) {
            throw new NullPointerException("targets == null");
        }
        int iM2247b = c0962j.m2247b();
        for (int i4 = 0; i4 < iM2247b; i4++) {
            if (c0962j.m2248b(i4) < 0) {
                throw new IllegalArgumentException("successors[" + i4 + "] == " + c0962j.m2248b(i4));
            }
        }
        if (c0549e == null) {
            throw new NullPointerException("catches == null");
        }
        this.f872a = i;
        this.f873b = i2;
        this.f874c = i3;
        this.f875d = c0962j;
        this.f876e = c0549e;
    }

    @Override // com.p046a.p049b.p073h.InterfaceC0964l
    /* JADX INFO: renamed from: a */
    public final int mo821a() {
        return this.f872a;
    }

    /* JADX INFO: renamed from: b */
    public final int m822b() {
        return this.f873b;
    }

    /* JADX INFO: renamed from: c */
    public final int m823c() {
        return this.f874c;
    }

    /* JADX INFO: renamed from: d */
    public final C0962j m824d() {
        return this.f875d;
    }

    /* JADX INFO: renamed from: e */
    public final C0549e m825e() {
        return this.f876e;
    }

    public final String toString() {
        return "{" + C1067a.m2558v(this.f872a) + ": " + C1067a.m2558v(this.f873b) + ".." + C1067a.m2558v(this.f874c) + '}';
    }
}
