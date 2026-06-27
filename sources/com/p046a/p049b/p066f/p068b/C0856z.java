package com.p046a.p049b.p066f.p068b;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p066f.p069c.C0883y;

/* JADX INFO: renamed from: com.a.b.f.b.z */
/* JADX INFO: loaded from: classes.dex */
public final class C0856z {

    /* JADX INFO: renamed from: a */
    public static final C0856z f2229a = new C0856z(null, -1, -1);

    /* JADX INFO: renamed from: b */
    private final C0883y f2230b;

    /* JADX INFO: renamed from: c */
    private final int f2231c;

    /* JADX INFO: renamed from: d */
    private final int f2232d;

    public C0856z(C0883y c0883y, int i, int i2) {
        if (i < -1) {
            throw new IllegalArgumentException("address < -1");
        }
        if (i2 < -1) {
            throw new IllegalArgumentException("line < -1");
        }
        this.f2230b = c0883y;
        this.f2231c = i;
        this.f2232d = i2;
    }

    /* JADX INFO: renamed from: a */
    public final int m1861a() {
        return this.f2232d;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1862a(C0856z c0856z) {
        return this.f2232d == c0856z.f2232d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0856z)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C0856z c0856z = (C0856z) obj;
        if (this.f2231c == c0856z.f2231c) {
            return this.f2232d == c0856z.f2232d && (this.f2230b == c0856z.f2230b || (this.f2230b != null && this.f2230b.equals(c0856z.f2230b)));
        }
        return false;
    }

    public final int hashCode() {
        return this.f2230b.hashCode() + this.f2231c + this.f2232d;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer(50);
        if (this.f2230b != null) {
            stringBuffer.append(this.f2230b.mo919d());
            stringBuffer.append(":");
        }
        if (this.f2232d >= 0) {
            stringBuffer.append(this.f2232d);
        }
        stringBuffer.append('@');
        if (this.f2231c < 0) {
            stringBuffer.append("????");
        } else {
            stringBuffer.append(C1067a.m2558v(this.f2231c));
        }
        return stringBuffer.toString();
    }
}
