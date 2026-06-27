package com.p046a.p047a;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p047a.p048a.InterfaceC0480b;

/* JADX INFO: renamed from: com.a.a.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0505v {

    /* JADX INFO: renamed from: a */
    private InterfaceC0480b f738a;

    /* JADX INFO: renamed from: b */
    private int f739b;

    /* JADX INFO: renamed from: c */
    private int f740c;

    /* JADX INFO: renamed from: d */
    private int f741d;

    public C0505v(InterfaceC0480b interfaceC0480b, int i) {
        this.f739b = -1;
        this.f738a = interfaceC0480b;
        this.f739b = i;
    }

    public C0505v(C0504u c0504u, int i) {
        this(c0504u.m667a(), i);
    }

    /* JADX INFO: renamed from: a */
    private void m669a(int i) {
        if (m670a() != i) {
            throw new IllegalStateException(String.format("Expected %x but was %x", Integer.valueOf(i), Integer.valueOf(m670a())));
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m670a() {
        if (this.f739b == -1) {
            int iMo568d = this.f738a.mo568d() & 255;
            this.f739b = iMo568d & 31;
            this.f741d = (iMo568d & 224) >> 5;
        }
        return this.f739b;
    }

    /* JADX INFO: renamed from: b */
    public final int m671b() {
        m669a(28);
        this.f739b = -1;
        return C1067a.m2494b(this.f738a);
    }

    /* JADX INFO: renamed from: c */
    public final int m672c() {
        m669a(29);
        this.f739b = -1;
        this.f740c = C1067a.m2494b(this.f738a);
        return C1067a.m2494b(this.f738a);
    }

    /* JADX INFO: renamed from: d */
    public final int m673d() {
        return this.f740c;
    }

    /* JADX INFO: renamed from: e */
    public final int m674e() {
        return C1067a.m2494b(this.f738a);
    }

    /* JADX INFO: renamed from: f */
    public final byte m675f() {
        m669a(0);
        this.f739b = -1;
        return (byte) C1067a.m2434a(this.f738a, this.f741d);
    }

    /* JADX INFO: renamed from: g */
    public final short m676g() {
        m669a(2);
        this.f739b = -1;
        return (short) C1067a.m2434a(this.f738a, this.f741d);
    }

    /* JADX INFO: renamed from: h */
    public final char m677h() {
        m669a(3);
        this.f739b = -1;
        return (char) C1067a.m2435a(this.f738a, this.f741d, false);
    }

    /* JADX INFO: renamed from: i */
    public final int m678i() {
        m669a(4);
        this.f739b = -1;
        return C1067a.m2434a(this.f738a, this.f741d);
    }

    /* JADX INFO: renamed from: j */
    public final long m679j() {
        m669a(6);
        this.f739b = -1;
        return C1067a.m2496b(this.f738a, this.f741d);
    }

    /* JADX INFO: renamed from: k */
    public final float m680k() {
        m669a(16);
        this.f739b = -1;
        return Float.intBitsToFloat(C1067a.m2435a(this.f738a, this.f741d, true));
    }

    /* JADX INFO: renamed from: l */
    public final double m681l() {
        m669a(17);
        this.f739b = -1;
        return Double.longBitsToDouble(C1067a.m2497b(this.f738a, this.f741d, true));
    }

    /* JADX INFO: renamed from: m */
    public final int m682m() {
        m669a(23);
        this.f739b = -1;
        return C1067a.m2435a(this.f738a, this.f741d, false);
    }

    /* JADX INFO: renamed from: n */
    public final int m683n() {
        m669a(24);
        this.f739b = -1;
        return C1067a.m2435a(this.f738a, this.f741d, false);
    }

    /* JADX INFO: renamed from: o */
    public final int m684o() {
        m669a(25);
        this.f739b = -1;
        return C1067a.m2435a(this.f738a, this.f741d, false);
    }

    /* JADX INFO: renamed from: p */
    public final int m685p() {
        m669a(27);
        this.f739b = -1;
        return C1067a.m2435a(this.f738a, this.f741d, false);
    }

    /* JADX INFO: renamed from: q */
    public final int m686q() {
        m669a(26);
        this.f739b = -1;
        return C1067a.m2435a(this.f738a, this.f741d, false);
    }

    /* JADX INFO: renamed from: r */
    public final void m687r() {
        m669a(30);
        this.f739b = -1;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m688s() {
        m669a(31);
        this.f739b = -1;
        return this.f741d != 0;
    }

    /* JADX INFO: renamed from: t */
    public final void m689t() {
        int i = 0;
        switch (m670a()) {
            case 0:
                m675f();
                return;
            case 1:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            default:
                throw new C0502s("Unexpected type: " + Integer.toHexString(this.f739b));
            case 2:
                m676g();
                return;
            case 3:
                m677h();
                return;
            case 4:
                m678i();
                return;
            case 6:
                m679j();
                return;
            case 16:
                m680k();
                return;
            case 17:
                m681l();
                return;
            case 23:
                m682m();
                return;
            case 24:
                m683n();
                return;
            case 25:
                m684o();
                return;
            case 26:
                m686q();
                return;
            case 27:
                m685p();
                return;
            case 28:
                int iM671b = m671b();
                while (i < iM671b) {
                    m689t();
                    i++;
                }
                return;
            case 29:
                int iM672c = m672c();
                while (i < iM672c) {
                    C1067a.m2494b(this.f738a);
                    m689t();
                    i++;
                }
                return;
            case 30:
                m687r();
                return;
            case 31:
                m688s();
                return;
        }
    }
}
