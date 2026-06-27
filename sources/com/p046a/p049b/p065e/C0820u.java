package com.p046a.p049b.p065e;

import com.p046a.p047a.C0488e;
import com.p046a.p047a.C0492i;
import java.util.Comparator;

/* JADX INFO: renamed from: com.a.b.e.u */
/* JADX INFO: loaded from: classes.dex */
final class C0820u {

    /* JADX INFO: renamed from: a */
    public static final Comparator f1933a = new C0821v();

    /* JADX INFO: renamed from: b */
    private final C0492i f1934b;

    /* JADX INFO: renamed from: c */
    private C0488e f1935c;

    /* JADX INFO: renamed from: d */
    private int f1936d = -1;

    public C0820u(C0492i c0492i, C0488e c0488e) {
        this.f1934b = c0492i;
        this.f1935c = c0488e;
    }

    /* JADX INFO: renamed from: a */
    public final C0492i m1694a() {
        return this.f1934b;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1695a(C0820u[] c0820uArr) {
        int iMax;
        if (this.f1935c.m587c() == -1) {
            iMax = 0;
        } else {
            C0820u c0820u = c0820uArr[this.f1935c.m587c()];
            if (c0820u == null) {
                iMax = 1;
            } else {
                if (c0820u.f1936d == -1) {
                    return false;
                }
                iMax = c0820u.f1936d;
            }
        }
        for (short s : this.f1935c.m589e()) {
            C0820u c0820u2 = c0820uArr[s];
            if (c0820u2 == null) {
                iMax = Math.max(iMax, 1);
            } else {
                if (c0820u2.f1936d == -1) {
                    return false;
                }
                iMax = Math.max(iMax, c0820u2.f1936d);
            }
        }
        this.f1936d = iMax + 1;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final C0488e m1696b() {
        return this.f1935c;
    }

    /* JADX INFO: renamed from: c */
    public final int m1697c() {
        return this.f1935c.m586b();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m1698d() {
        return this.f1936d != -1;
    }
}
