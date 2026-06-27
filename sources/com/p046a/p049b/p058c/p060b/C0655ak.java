package com.p046a.p049b.p058c.p060b;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p066f.p068b.C0850t;
import com.p046a.p049b.p066f.p068b.C0856z;
import com.p046a.p049b.p073h.C0962j;
import com.p046a.p049b.p073h.C0970r;

/* JADX INFO: renamed from: com.a.b.c.b.ak */
/* JADX INFO: loaded from: classes.dex */
public final class C0655ak extends AbstractC0657am {

    /* JADX INFO: renamed from: a */
    private final C0665h f1093a;

    /* JADX INFO: renamed from: b */
    private final C0962j f1094b;

    /* JADX INFO: renamed from: c */
    private final C0665h[] f1095c;

    /* JADX INFO: renamed from: d */
    private final boolean f1096d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0655ak(C0856z c0856z, C0665h c0665h, C0962j c0962j, C0665h[] c0665hArr) {
        super(c0856z, C0850t.f2003a);
        boolean z = true;
        if (c0665h == null) {
            throw new NullPointerException("user == null");
        }
        if (c0962j == null) {
            throw new NullPointerException("cases == null");
        }
        if (c0665hArr == null) {
            throw new NullPointerException("targets == null");
        }
        int iM2247b = c0962j.m2247b();
        if (iM2247b != c0665hArr.length) {
            throw new IllegalArgumentException("cases / targets mismatch");
        }
        if (iM2247b > 65535) {
            throw new IllegalArgumentException("too many cases");
        }
        this.f1093a = c0665h;
        this.f1094b = c0962j;
        this.f1095c = c0665hArr;
        if (c0962j.m2247b() >= 2) {
            long jM1168a = m1168a(c0962j);
            long jM1169b = m1169b(c0962j);
            if (jM1168a < 0 || jM1168a > (jM1169b * 5) / 4) {
                z = false;
            }
        }
        this.f1096d = z;
    }

    /* JADX INFO: renamed from: a */
    private static long m1168a(C0962j c0962j) {
        long jM2248b = (((((long) c0962j.m2248b(c0962j.m2247b() - 1)) - ((long) c0962j.m2248b(0))) + 1) << 1) + 4;
        if (jM2248b <= 2147483647L) {
            return jM2248b;
        }
        return -1L;
    }

    /* JADX INFO: renamed from: b */
    private static long m1169b(C0962j c0962j) {
        return (((long) c0962j.m2247b()) << 2) + 2;
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0669l
    /* JADX INFO: renamed from: a */
    public final int mo1102a() {
        return this.f1096d ? (int) m1168a(this.f1094b) : (int) m1169b(this.f1094b);
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0669l
    /* JADX INFO: renamed from: a */
    public final AbstractC0669l mo1103a(C0850t c0850t) {
        return new C0655ak(m1224i(), this.f1093a, this.f1094b, this.f1095c);
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0669l
    /* JADX INFO: renamed from: a */
    protected final String mo1104a(boolean z) {
        int iG = this.f1093a.m1222g();
        StringBuffer stringBuffer = new StringBuffer(100);
        int length = this.f1095c.length;
        stringBuffer.append(this.f1096d ? "packed" : "sparse");
        stringBuffer.append("-switch-payload // for switch @ ");
        stringBuffer.append(C1067a.m2558v(iG));
        for (int i = 0; i < length; i++) {
            int iG2 = this.f1095c[i].m1222g();
            stringBuffer.append("\n  ");
            stringBuffer.append(this.f1094b.m2248b(i));
            stringBuffer.append(": ");
            stringBuffer.append(C1067a.m2556t(iG2));
            stringBuffer.append(" // ");
            stringBuffer.append(C1067a.m2562z(iG2 - iG));
        }
        return stringBuffer.toString();
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0669l
    /* JADX INFO: renamed from: a */
    public final void mo1105a(C0970r c0970r) {
        int iG;
        int i = 0;
        int iG2 = this.f1093a.m1222g();
        int iMo1107a = C0672o.f1137I.m1238c().mo1107a();
        int length = this.f1095c.length;
        if (!this.f1096d) {
            c0970r.m2280b(512);
            c0970r.m2280b(length);
            for (int i2 = 0; i2 < length; i2++) {
                c0970r.m2282c(this.f1094b.m2248b(i2));
            }
            while (i < length) {
                c0970r.m2282c(this.f1095c[i].m1222g() - iG2);
                i++;
            }
            return;
        }
        int iM2248b = length == 0 ? 0 : this.f1094b.m2248b(0);
        int iM2248b2 = ((length == 0 ? 0 : this.f1094b.m2248b(length - 1)) - iM2248b) + 1;
        c0970r.m2280b(256);
        c0970r.m2280b(iM2248b2);
        c0970r.m2282c(iM2248b);
        for (int i3 = 0; i3 < iM2248b2; i3++) {
            if (this.f1094b.m2248b(i) > iM2248b + i3) {
                iG = iMo1107a;
            } else {
                iG = this.f1095c[i].m1222g() - iG2;
                i++;
            }
            c0970r.m2282c(iG);
        }
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0669l
    /* JADX INFO: renamed from: b */
    protected final String mo1106b() {
        StringBuffer stringBuffer = new StringBuffer(100);
        int length = this.f1095c.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append("\n    ");
            stringBuffer.append(this.f1094b.m2248b(i));
            stringBuffer.append(": ");
            stringBuffer.append(this.f1095c[i]);
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m1170c() {
        return this.f1096d;
    }
}
