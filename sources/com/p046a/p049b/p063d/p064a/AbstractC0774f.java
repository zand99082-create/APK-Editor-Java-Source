package com.p046a.p049b.p063d.p064a;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p047a.C0502s;
import com.p046a.p049b.p063d.C0798e;
import java.io.EOFException;

/* JADX INFO: renamed from: com.a.b.d.a.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0774f {

    /* JADX INFO: renamed from: a */
    private final EnumC0778j f1567a;

    /* JADX INFO: renamed from: b */
    private final int f1568b;

    /* JADX INFO: renamed from: c */
    private final int f1569c;

    /* JADX INFO: renamed from: d */
    private final int f1570d;

    /* JADX INFO: renamed from: e */
    private final int f1571e;

    /* JADX INFO: renamed from: f */
    private final long f1572f;

    public AbstractC0774f(EnumC0778j enumC0778j, int i, int i2, int i3, int i4, long j) {
        if (enumC0778j == null) {
            throw new NullPointerException("format == null");
        }
        if (!C1067a.m2532e(i)) {
            throw new IllegalArgumentException("invalid opcode");
        }
        this.f1567a = enumC0778j;
        this.f1568b = i;
        this.f1569c = i2;
        this.f1570d = i3;
        this.f1571e = i4;
        this.f1572f = j;
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC0774f m1552a(InterfaceC0772d interfaceC0772d) {
        int iMo1530c = interfaceC0772d.mo1530c();
        return C0798e.m1601b(C1067a.m2533f(iMo1530c)).mo1523a(iMo1530c, interfaceC0772d);
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC0774f[] m1553a(short[] sArr) {
        AbstractC0774f[] abstractC0774fArr = new AbstractC0774f[sArr.length];
        C0764av c0764av = new C0764av(sArr);
        while (c0764av.m1533f()) {
            try {
                abstractC0774fArr[c0764av.mo1548a()] = m1552a(c0764av);
            } catch (EOFException e) {
                throw new C0502s(e);
            }
        }
        return abstractC0774fArr;
    }

    /* JADX INFO: renamed from: a */
    public final int m1554a(int i) {
        return this.f1571e - i;
    }

    /* JADX INFO: renamed from: a */
    public final EnumC0778j m1555a() {
        return this.f1567a;
    }

    /* JADX INFO: renamed from: a */
    public final void m1556a(InterfaceC0773e interfaceC0773e) {
        this.f1567a.mo1524a(this, interfaceC0773e);
    }

    /* JADX INFO: renamed from: b */
    public final int m1557b() {
        return this.f1568b;
    }

    /* JADX INFO: renamed from: b */
    public final short m1558b(int i) {
        int i2 = this.f1571e - i;
        if (i2 != ((short) i2)) {
            throw new C0502s("Target out of range: " + C1067a.m2562z(i2));
        }
        return (short) i2;
    }

    /* JADX INFO: renamed from: c */
    public final int m1559c(int i) {
        int i2 = this.f1571e - i;
        if (i2 != ((byte) i2)) {
            throw new C0502s("Target out of range: " + C1067a.m2562z(i2));
        }
        return i2 & 255;
    }

    /* JADX INFO: renamed from: c */
    public final short m1560c() {
        return (short) this.f1568b;
    }

    /* JADX INFO: renamed from: d */
    public final int m1561d() {
        return this.f1569c;
    }

    /* JADX INFO: renamed from: d */
    public abstract AbstractC0774f mo1525d(int i);

    /* JADX INFO: renamed from: e */
    public final short m1562e() {
        return (short) this.f1569c;
    }

    /* JADX INFO: renamed from: f */
    public final int m1563f() {
        return this.f1570d;
    }

    /* JADX INFO: renamed from: g */
    public final int m1564g() {
        return this.f1571e;
    }

    /* JADX INFO: renamed from: h */
    public final long m1565h() {
        return this.f1572f;
    }

    /* JADX INFO: renamed from: i */
    public final int m1566i() {
        if (this.f1572f != ((int) this.f1572f)) {
            throw new C0502s("Literal out of range: " + C1067a.m2455a(this.f1572f));
        }
        return (int) this.f1572f;
    }

    /* JADX INFO: renamed from: j */
    public final short m1567j() {
        if (this.f1572f != ((short) this.f1572f)) {
            throw new C0502s("Literal out of range: " + C1067a.m2455a(this.f1572f));
        }
        return (short) this.f1572f;
    }

    /* JADX INFO: renamed from: k */
    public final int m1568k() {
        if (this.f1572f != ((byte) this.f1572f)) {
            throw new C0502s("Literal out of range: " + C1067a.m2455a(this.f1572f));
        }
        return ((int) this.f1572f) & 255;
    }

    /* JADX INFO: renamed from: l */
    public final int m1569l() {
        if (this.f1572f < -8 || this.f1572f > 7) {
            throw new C0502s("Literal out of range: " + C1067a.m2455a(this.f1572f));
        }
        return ((int) this.f1572f) & 15;
    }

    /* JADX INFO: renamed from: m */
    public abstract int mo1526m();

    /* JADX INFO: renamed from: n */
    public int mo1527n() {
        return 0;
    }

    /* JADX INFO: renamed from: o */
    public int mo1546o() {
        return 0;
    }

    /* JADX INFO: renamed from: p */
    public int mo1547p() {
        return 0;
    }

    /* JADX INFO: renamed from: q */
    public int mo1570q() {
        return 0;
    }

    /* JADX INFO: renamed from: r */
    public int mo1571r() {
        return 0;
    }

    /* JADX INFO: renamed from: s */
    public final short m1572s() {
        int iMo1527n = mo1527n();
        if (((-65536) & iMo1527n) != 0) {
            throw new C0502s("Register A out of range: " + C1067a.m2455a(iMo1527n));
        }
        return (short) iMo1527n;
    }

    /* JADX INFO: renamed from: t */
    public final short m1573t() {
        int iMo1546o = mo1546o();
        if (((-65536) & iMo1546o) != 0) {
            throw new C0502s("Register B out of range: " + C1067a.m2455a(iMo1546o));
        }
        return (short) iMo1546o;
    }
}
