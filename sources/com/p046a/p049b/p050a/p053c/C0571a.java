package com.p046a.p049b.p050a.p053c;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p050a.p055e.C0596i;
import com.p046a.p049b.p050a.p055e.InterfaceC0597j;
import com.p046a.p049b.p066f.p069c.AbstractC0857a;
import com.p046a.p049b.p066f.p069c.C0858aa;
import com.p046a.p049b.p066f.p069c.C0868j;
import com.p046a.p049b.p066f.p069c.C0870l;
import com.p046a.p049b.p066f.p069c.C0871m;
import com.p046a.p049b.p066f.p069c.C0872n;
import com.p046a.p049b.p066f.p069c.C0873o;
import com.p046a.p049b.p066f.p069c.C0878t;
import com.p046a.p049b.p066f.p069c.C0880v;
import com.p046a.p049b.p066f.p069c.C0881w;
import com.p046a.p049b.p066f.p069c.C0883y;
import com.p046a.p049b.p066f.p069c.C0884z;
import com.p046a.p049b.p066f.p070d.C0887c;
import com.p046a.p049b.p073h.C0955c;
import java.util.BitSet;

/* JADX INFO: renamed from: com.a.b.a.c.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0571a {

    /* JADX INFO: renamed from: a */
    private final C0955c f934a;

    /* JADX INFO: renamed from: b */
    private final C0858aa f935b;

    /* JADX INFO: renamed from: c */
    private final int[] f936c;

    /* JADX INFO: renamed from: d */
    private int f937d;

    /* JADX INFO: renamed from: e */
    private InterfaceC0597j f938e;

    public C0571a(C0955c c0955c) {
        int iM2228f = c0955c.m2228f(8);
        this.f934a = c0955c;
        this.f935b = new C0858aa(iM2228f);
        this.f936c = new int[iM2228f];
        this.f937d = -1;
    }

    /* JADX INFO: renamed from: a */
    private AbstractC0857a m966a(int i, BitSet bitSet) {
        AbstractC0857a abstractC0857aMo1872c = this.f935b.mo1872c(i);
        if (abstractC0857aMo1872c == null) {
            int i2 = this.f936c[i];
            try {
                int iM2227e = this.f934a.m2227e(i2);
                switch (iM2227e) {
                    case 1:
                        abstractC0857aMo1872c = m967a(i2);
                        bitSet.set(i);
                        break;
                    case 2:
                    case 13:
                    case 14:
                    case 17:
                    default:
                        throw new C0596i("unknown tag byte: " + C1067a.m2560x(iM2227e));
                    case 3:
                        abstractC0857aMo1872c = C0872n.m1891a(this.f934a.m2225c(i2 + 1));
                        break;
                    case 4:
                        abstractC0857aMo1872c = C0871m.m1890a(this.f934a.m2225c(i2 + 1));
                        break;
                    case 5:
                        abstractC0857aMo1872c = C0878t.m1897a(this.f934a.m2226d(i2 + 1));
                        break;
                    case 6:
                        abstractC0857aMo1872c = C0868j.m1887a(this.f934a.m2226d(i2 + 1));
                        break;
                    case 7:
                        abstractC0857aMo1872c = new C0884z(C0887c.m1944c(((C0883y) m966a(this.f934a.m2228f(i2 + 1), bitSet)).m1911j()));
                        break;
                    case 8:
                        abstractC0857aMo1872c = m966a(this.f934a.m2228f(i2 + 1), bitSet);
                        break;
                    case 9:
                        abstractC0857aMo1872c = new C0870l((C0884z) m966a(this.f934a.m2228f(i2 + 1), bitSet), (C0881w) m966a(this.f934a.m2228f(i2 + 3), bitSet));
                        break;
                    case 10:
                        abstractC0857aMo1872c = new C0880v((C0884z) m966a(this.f934a.m2228f(i2 + 1), bitSet), (C0881w) m966a(this.f934a.m2228f(i2 + 3), bitSet));
                        break;
                    case 11:
                        abstractC0857aMo1872c = new C0873o((C0884z) m966a(this.f934a.m2228f(i2 + 1), bitSet), (C0881w) m966a(this.f934a.m2228f(i2 + 3), bitSet));
                        break;
                    case 12:
                        abstractC0857aMo1872c = new C0881w((C0883y) m966a(this.f934a.m2228f(i2 + 1), bitSet), (C0883y) m966a(this.f934a.m2228f(i2 + 3), bitSet));
                        break;
                    case 15:
                        throw new C0596i("MethodHandle not supported");
                    case 16:
                        throw new C0596i("MethodType not supported");
                    case 18:
                        throw new C0596i("InvokeDynamic not supported");
                }
                this.f935b.m1870a(i, abstractC0857aMo1872c);
            } catch (C0596i e) {
                e.m573a("...while parsing cst " + C1067a.m2558v(i) + " at offset " + C1067a.m2556t(i2));
                throw e;
            } catch (RuntimeException e2) {
                C0596i c0596i = new C0596i(e2);
                c0596i.m573a("...while parsing cst " + C1067a.m2558v(i) + " at offset " + C1067a.m2556t(i2));
                throw c0596i;
            }
        }
        return abstractC0857aMo1872c;
    }

    /* JADX INFO: renamed from: a */
    private C0883y m967a(int i) {
        int i2 = i + 3;
        try {
            return new C0883y(this.f934a.m2221a(i2, this.f934a.m2228f(i + 1) + i2));
        } catch (IllegalArgumentException e) {
            throw new C0596i(e);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m968c() {
        if (this.f937d < 0) {
            m969d();
            if (this.f938e != null) {
                new StringBuilder("constant_pool_count: ").append(C1067a.m2558v(this.f936c.length));
            }
            BitSet bitSet = new BitSet(this.f936c.length);
            for (int i = 1; i < this.f936c.length; i++) {
                if (this.f936c[i] != 0 && this.f935b.mo1872c(i) == null) {
                    m966a(i, bitSet);
                }
            }
            if (this.f938e != null) {
                for (int i2 = 1; i2 < this.f936c.length; i2++) {
                    AbstractC0857a abstractC0857aMo1872c = this.f935b.mo1872c(i2);
                    if (abstractC0857aMo1872c != null) {
                        if (bitSet.get(i2)) {
                            new StringBuilder().append(C1067a.m2558v(i2)).append(": utf8{\"").append(abstractC0857aMo1872c.mo919d()).append("\"}");
                        } else {
                            new StringBuilder().append(C1067a.m2558v(i2)).append(": ").append(abstractC0857aMo1872c.toString());
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private void m969d() {
        int i;
        int iM2228f = 10;
        int i2 = 1;
        while (i2 < this.f936c.length) {
            this.f936c[i2] = iM2228f;
            int iM2227e = this.f934a.m2227e(iM2228f);
            switch (iM2227e) {
                case 1:
                    try {
                        iM2228f += this.f934a.m2228f(iM2228f + 1) + 3;
                        i = 1;
                    } catch (C0596i e) {
                        e.m573a("...while preparsing cst " + C1067a.m2558v(i2) + " at offset " + C1067a.m2556t(iM2228f));
                        throw e;
                    }
                    break;
                case 2:
                case 13:
                case 14:
                case 17:
                default:
                    throw new C0596i("unknown tag byte: " + C1067a.m2560x(iM2227e));
                case 3:
                case 4:
                case 9:
                case 10:
                case 11:
                case 12:
                    iM2228f += 5;
                    i = 1;
                    break;
                case 5:
                case 6:
                    i = 2;
                    iM2228f += 9;
                    break;
                case 7:
                case 8:
                    iM2228f += 3;
                    i = 1;
                    break;
                case 15:
                    throw new C0596i("MethodHandle not supported");
                case 16:
                    throw new C0596i("MethodType not supported");
                case 18:
                    throw new C0596i("InvokeDynamic not supported");
            }
            i2 += i;
        }
        this.f937d = iM2228f;
    }

    /* JADX INFO: renamed from: a */
    public final int m970a() {
        m968c();
        return this.f937d;
    }

    /* JADX INFO: renamed from: a */
    public final void m971a(InterfaceC0597j interfaceC0597j) {
        this.f938e = interfaceC0597j;
    }

    /* JADX INFO: renamed from: b */
    public final C0858aa m972b() {
        m968c();
        return this.f935b;
    }
}
