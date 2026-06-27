package com.p046a.p049b.p050a.p054d;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p050a.p051a.C0525p;
import com.p046a.p049b.p050a.p053c.C0571a;
import com.p046a.p049b.p050a.p055e.AbstractC0588a;
import com.p046a.p049b.p050a.p055e.C0596i;
import com.p046a.p049b.p050a.p055e.C0598k;
import com.p046a.p049b.p050a.p055e.InterfaceC0589b;
import com.p046a.p049b.p050a.p055e.InterfaceC0590c;
import com.p046a.p049b.p050a.p055e.InterfaceC0592e;
import com.p046a.p049b.p050a.p055e.InterfaceC0595h;
import com.p046a.p049b.p050a.p055e.InterfaceC0597j;
import com.p046a.p049b.p066f.p069c.C0858aa;
import com.p046a.p049b.p066f.p069c.C0883y;
import com.p046a.p049b.p066f.p069c.C0884z;
import com.p046a.p049b.p066f.p069c.InterfaceC0860b;
import com.p046a.p049b.p066f.p070d.C0886b;
import com.p046a.p049b.p066f.p070d.InterfaceC0889e;
import com.p046a.p049b.p073h.C0955c;
import jadx.core.deobf.Deobfuscator;

/* JADX INFO: renamed from: com.a.b.a.d.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0582k implements InterfaceC0590c {

    /* JADX INFO: renamed from: a */
    private final String f958a;

    /* JADX INFO: renamed from: b */
    private final C0955c f959b;

    /* JADX INFO: renamed from: c */
    private final boolean f960c;

    /* JADX INFO: renamed from: d */
    private C0858aa f961d;

    /* JADX INFO: renamed from: e */
    private int f962e;

    /* JADX INFO: renamed from: f */
    private C0884z f963f;

    /* JADX INFO: renamed from: g */
    private C0884z f964g;

    /* JADX INFO: renamed from: h */
    private InterfaceC0889e f965h;

    /* JADX INFO: renamed from: i */
    private InterfaceC0592e f966i;

    /* JADX INFO: renamed from: j */
    private InterfaceC0595h f967j;

    /* JADX INFO: renamed from: k */
    private C0598k f968k;

    /* JADX INFO: renamed from: l */
    private C0573b f969l;

    private C0582k(C0955c c0955c, String str, boolean z) {
        if (str == null) {
            throw new NullPointerException("filePath == null");
        }
        this.f958a = str;
        this.f959b = c0955c;
        this.f960c = z;
        this.f962e = -1;
    }

    public C0582k(byte[] bArr, String str, boolean z) {
        this(new C0955c(bArr), str, z);
    }

    /* JADX INFO: renamed from: a */
    public static String m997a(Object obj) {
        return obj == null ? "(none)" : obj.toString();
    }

    /* JADX INFO: renamed from: m */
    private int m998m() {
        return this.f959b.m2225c(0);
    }

    /* JADX INFO: renamed from: n */
    private int m999n() {
        return this.f959b.m2228f(4);
    }

    /* JADX INFO: renamed from: o */
    private int m1000o() {
        return this.f959b.m2228f(6);
    }

    /* JADX INFO: renamed from: p */
    private void m1001p() {
        if (this.f962e == -1) {
            m1003r();
        }
    }

    /* JADX INFO: renamed from: q */
    private void m1002q() {
        if (this.f968k == null) {
            m1003r();
        }
    }

    /* JADX INFO: renamed from: r */
    private void m1003r() {
        boolean z = true;
        try {
            if (this.f959b.m2219a() < 10) {
                throw new C0596i("severely truncated class file");
            }
            if (this.f960c) {
                int iM998m = m998m();
                int iM999n = m999n();
                int iM1000o = m1000o();
                if (iM998m != -889275714 || iM999n < 0 || (iM1000o != 51 ? iM1000o >= 51 || iM1000o < 45 : iM999n > 0)) {
                    z = false;
                }
                if (!z) {
                    throw new C0596i("bad class file magic (" + C1067a.m2556t(m998m()) + ") or version (" + C1067a.m2558v(m1000o()) + Deobfuscator.CLASS_NAME_SEPARATOR + C1067a.m2558v(m999n()) + ")");
                }
            }
            C0571a c0571a = new C0571a(this.f959b);
            c0571a.m971a((InterfaceC0597j) null);
            this.f961d = c0571a.m972b();
            this.f961d.mo811b_();
            int iM970a = c0571a.m970a();
            int iM2228f = this.f959b.m2228f(iM970a);
            this.f963f = (C0884z) this.f961d.mo1869a(this.f959b.m2228f(iM970a + 2));
            this.f964g = (C0884z) this.f961d.mo1871b(this.f959b.m2228f(iM970a + 4));
            int iM2228f2 = this.f959b.m2228f(iM970a + 6);
            int i = iM970a + 8;
            this.f965h = m1004a(i, iM2228f2);
            int i2 = (iM2228f2 << 1) + i;
            if (this.f960c) {
                String strM1948h = this.f963f.m1917i().m1948h();
                if (!this.f958a.endsWith(".class") || !this.f958a.startsWith(strM1948h) || this.f958a.length() != strM1948h.length() + 6) {
                    throw new C0596i("class name (" + strM1948h + ") does not match path (" + this.f958a + ")");
                }
            }
            this.f962e = iM2228f;
            C0584m c0584m = new C0584m(this, this.f963f, i2, this.f969l);
            c0584m.m1027a((InterfaceC0597j) null);
            this.f966i = c0584m.m1023a();
            C0586o c0586o = new C0586o(this, this.f963f, c0584m.m1028d(), this.f969l);
            c0586o.m1027a((InterfaceC0597j) null);
            this.f967j = c0586o.m1032a();
            C0574c c0574c = new C0574c(this, 0, c0586o.m1028d(), this.f969l);
            c0574c.m986a(null);
            this.f968k = c0574c.m987b();
            this.f968k.mo811b_();
            int iM985a = c0574c.m985a();
            if (iM985a != this.f959b.m2219a()) {
                throw new C0596i("extra bytes at end of class file, at offset " + C1067a.m2556t(iM985a));
            }
        } catch (C0596i e) {
            e.m573a("...while parsing " + this.f958a);
            throw e;
        } catch (RuntimeException e2) {
            C0596i c0596i = new C0596i(e2);
            c0596i.m573a("...while parsing " + this.f958a);
            throw c0596i;
        }
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC0889e m1004a(int i, int i2) {
        if (i2 == 0) {
            return C0886b.f2306a;
        }
        if (this.f961d == null) {
            throw new IllegalStateException("pool not yet initialized");
        }
        return new C0583l(this.f959b, i, i2, this.f961d, null);
    }

    /* JADX INFO: renamed from: a */
    public final String m1005a() {
        return this.f958a;
    }

    /* JADX INFO: renamed from: a */
    public final void m1006a(C0573b c0573b) {
        if (c0573b == null) {
            throw new NullPointerException("attributeFactory == null");
        }
        this.f969l = c0573b;
    }

    /* JADX INFO: renamed from: b */
    public final C0955c m1007b() {
        return this.f959b;
    }

    /* JADX INFO: renamed from: c */
    public final int m1008c() {
        m1001p();
        return m998m();
    }

    @Override // com.p046a.p049b.p050a.p055e.InterfaceC0590c
    /* JADX INFO: renamed from: d */
    public final int mo1009d() {
        m1001p();
        return this.f962e;
    }

    /* JADX INFO: renamed from: e */
    public final C0884z m1010e() {
        m1001p();
        return this.f963f;
    }

    /* JADX INFO: renamed from: f */
    public final C0884z m1011f() {
        m1001p();
        return this.f964g;
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC0860b m1012g() {
        m1001p();
        return this.f961d;
    }

    /* JADX INFO: renamed from: h */
    public final InterfaceC0889e m1013h() {
        m1001p();
        return this.f965h;
    }

    /* JADX INFO: renamed from: i */
    public final InterfaceC0592e m1014i() {
        m1002q();
        return this.f966i;
    }

    /* JADX INFO: renamed from: j */
    public final InterfaceC0595h m1015j() {
        m1002q();
        return this.f967j;
    }

    /* JADX INFO: renamed from: k */
    public final InterfaceC0589b m1016k() {
        m1002q();
        return this.f968k;
    }

    @Override // com.p046a.p049b.p050a.p055e.InterfaceC0590c
    /* JADX INFO: renamed from: l */
    public final C0883y mo1017l() {
        AbstractC0588a abstractC0588aMo1047a = m1016k().mo1047a("SourceFile");
        if (abstractC0588aMo1047a instanceof C0525p) {
            return ((C0525p) abstractC0588aMo1047a).m719b();
        }
        return null;
    }
}
