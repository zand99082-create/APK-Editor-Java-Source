package com.p046a.p049b.p066f.p069c;

import android.support.v4.app.FrameMetricsAggregator;
import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p066f.p070d.C0887c;

/* JADX INFO: renamed from: com.a.b.f.c.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0872n extends AbstractC0875q {

    /* JADX INFO: renamed from: h */
    private static final C0872n[] f2255h = new C0872n[FrameMetricsAggregator.EVERY_DURATION];

    /* JADX INFO: renamed from: a */
    public static final C0872n f2248a = m1891a(-1);

    /* JADX INFO: renamed from: b */
    public static final C0872n f2249b = m1891a(0);

    /* JADX INFO: renamed from: c */
    public static final C0872n f2250c = m1891a(1);

    /* JADX INFO: renamed from: d */
    public static final C0872n f2251d = m1891a(2);

    /* JADX INFO: renamed from: e */
    public static final C0872n f2252e = m1891a(3);

    /* JADX INFO: renamed from: f */
    public static final C0872n f2253f = m1891a(4);

    /* JADX INFO: renamed from: g */
    public static final C0872n f2254g = m1891a(5);

    private C0872n(int i) {
        super(i);
    }

    /* JADX INFO: renamed from: a */
    public static C0872n m1891a(int i) {
        int i2 = (Integer.MAX_VALUE & i) % FrameMetricsAggregator.EVERY_DURATION;
        C0872n c0872n = f2255h[i2];
        if (c0872n != null && c0872n.mo1894j() == i) {
            return c0872n;
        }
        C0872n c0872n2 = new C0872n(i);
        f2255h[i2] = c0872n2;
        return c0872n2;
    }

    @Override // com.p046a.p049b.p066f.p070d.InterfaceC0888d
    /* JADX INFO: renamed from: a */
    public final C0887c mo925a() {
        return C0887c.f2347f;
    }

    @Override // com.p046a.p049b.p073h.InterfaceC0971s
    /* JADX INFO: renamed from: d */
    public final String mo919d() {
        return Integer.toString(mo1894j());
    }

    @Override // com.p046a.p049b.p066f.p069c.AbstractC0857a
    /* JADX INFO: renamed from: h */
    public final String mo1866h() {
        return "int";
    }

    public final String toString() {
        int iJ = mo1894j();
        return "int{0x" + C1067a.m2556t(iJ) + " / " + iJ + '}';
    }
}
