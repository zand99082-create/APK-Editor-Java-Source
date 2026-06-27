package com.p046a.p049b.p058c.p060b;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p066f.p068b.C0848r;
import com.p046a.p049b.p066f.p068b.C0850t;
import com.p046a.p049b.p066f.p068b.C0856z;
import com.p046a.p049b.p071g.AbstractC0913ag;
import com.p046a.p049b.p073h.C0970r;
import com.p046a.p049b.p073h.C0972t;
import java.util.BitSet;

/* JADX INFO: renamed from: com.a.b.c.b.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0669l {

    /* JADX INFO: renamed from: a */
    private int f1119a;

    /* JADX INFO: renamed from: b */
    private final C0671n f1120b;

    /* JADX INFO: renamed from: c */
    private final C0856z f1121c;

    /* JADX INFO: renamed from: d */
    private final C0850t f1122d;

    public AbstractC0669l(C0671n c0671n, C0856z c0856z, C0850t c0850t) {
        if (c0671n == null) {
            throw new NullPointerException("opcode == null");
        }
        if (c0856z == null) {
            throw new NullPointerException("position == null");
        }
        if (c0850t == null) {
            throw new NullPointerException("registers == null");
        }
        this.f1119a = -1;
        this.f1120b = c0671n;
        this.f1121c = c0856z;
        this.f1122d = c0850t;
    }

    /* JADX INFO: renamed from: a */
    public static C0653ai m1213a(C0856z c0856z, C0848r c0848r, C0848r c0848r2) {
        boolean z = c0848r.m1799k() == 1;
        boolean zM1954n = c0848r.mo925a().m1954n();
        int iM1795g = c0848r.m1795g();
        return new C0653ai((c0848r2.m1795g() | iM1795g) < 16 ? zM1954n ? C0672o.f1331i : z ? C0672o.f1261c : C0672o.f1328f : iM1795g < 256 ? zM1954n ? C0672o.f1332j : z ? C0672o.f1314d : C0672o.f1329g : zM1954n ? C0672o.f1333k : z ? C0672o.f1327e : C0672o.f1330h, c0856z, C0850t.m1809a(c0848r, c0848r2));
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo1102a();

    /* JADX INFO: renamed from: a */
    public final int m1214a(BitSet bitSet) {
        boolean zM1239d = this.f1120b.m1239d();
        int iD_ = this.f1122d.m2239d_();
        int iM1799k = (!zM1239d || bitSet.get(0)) ? 0 : this.f1122d.m1815b(0).m1799k();
        int iM1799k2 = 0;
        for (int i = zM1239d ? 1 : 0; i < iD_; i++) {
            if (!bitSet.get(i)) {
                iM1799k2 += this.f1122d.m1815b(i).m1799k();
            }
        }
        return Math.max(iM1799k2, iM1799k);
    }

    /* JADX INFO: renamed from: a */
    public abstract AbstractC0669l mo1162a(C0671n c0671n);

    /* JADX INFO: renamed from: a */
    public abstract AbstractC0669l mo1103a(C0850t c0850t);

    /* JADX INFO: renamed from: a */
    public AbstractC0669l mo1215a(AbstractC0913ag abstractC0913ag) {
        return mo1103a(abstractC0913ag.m2036a(this.f1122d));
    }

    /* JADX INFO: renamed from: a */
    public final String m1216a(String str, int i, boolean z) {
        String strMo1104a = mo1104a(z);
        if (strMo1104a == null) {
            return null;
        }
        String str2 = str + m1227l() + ": ";
        int length = str2.length();
        return C0972t.m2293a(str2, length, "", strMo1104a, i == 0 ? strMo1104a.length() : i - length);
    }

    /* JADX INFO: renamed from: a */
    protected abstract String mo1104a(boolean z);

    /* JADX INFO: renamed from: a */
    public abstract void mo1105a(C0970r c0970r);

    /* JADX INFO: renamed from: b */
    public final AbstractC0669l m1217b(BitSet bitSet) {
        C0850t c0850t = this.f1122d;
        boolean z = bitSet.get(0);
        if (this.f1120b.m1239d()) {
            bitSet.set(0);
        }
        C0850t c0850tM1813a = c0850t.m1813a(bitSet);
        if (this.f1120b.m1239d()) {
            bitSet.set(0, z);
        }
        if (c0850tM1813a.m2239d_() == 0) {
            return null;
        }
        return new C0674q(this.f1121c, c0850tM1813a);
    }

    /* JADX INFO: renamed from: b */
    protected abstract String mo1106b();

    /* JADX INFO: renamed from: c */
    public final AbstractC0669l m1218c(BitSet bitSet) {
        if (!this.f1120b.m1239d() || bitSet.get(0)) {
            return null;
        }
        C0848r c0848rM1815b = this.f1122d.m1815b(0);
        return m1213a(this.f1121c, c0848rM1815b, c0848rM1815b.m1787a(0));
    }

    /* JADX INFO: renamed from: c */
    public final void m1219c(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("address < 0");
        }
        this.f1119a = i;
    }

    /* JADX INFO: renamed from: d */
    public abstract AbstractC0669l mo1176d(int i);

    /* JADX INFO: renamed from: d */
    public final AbstractC0669l m1220d(BitSet bitSet) {
        return mo1103a(this.f1122d.m1812a(0, this.f1120b.m1239d(), bitSet));
    }

    /* JADX INFO: renamed from: f */
    public final boolean m1221f() {
        return this.f1119a >= 0;
    }

    /* JADX INFO: renamed from: g */
    public final int m1222g() {
        if (this.f1119a < 0) {
            throw new RuntimeException("address not yet known");
        }
        return this.f1119a;
    }

    /* JADX INFO: renamed from: h */
    public final C0671n m1223h() {
        return this.f1120b;
    }

    /* JADX INFO: renamed from: i */
    public final C0856z m1224i() {
        return this.f1121c;
    }

    /* JADX INFO: renamed from: j */
    public final C0850t m1225j() {
        return this.f1122d;
    }

    /* JADX INFO: renamed from: k */
    public final AbstractC0669l m1226k() {
        return mo1103a(this.f1122d.m1812a(0, this.f1120b.m1239d(), (BitSet) null));
    }

    /* JADX INFO: renamed from: l */
    public final String m1227l() {
        return this.f1119a != -1 ? String.format("%04x", Integer.valueOf(this.f1119a)) : C1067a.m2556t(System.identityHashCode(this));
    }

    /* JADX INFO: renamed from: m */
    public final int m1228m() {
        return m1222g() + mo1102a();
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer(100);
        stringBuffer.append(m1227l());
        stringBuffer.append(' ');
        stringBuffer.append(this.f1121c);
        stringBuffer.append(": ");
        stringBuffer.append(this.f1120b.m1240e());
        boolean z = false;
        if (this.f1122d.m2239d_() != 0) {
            stringBuffer.append(this.f1122d.m2238b(" ", ", ", null));
            z = true;
        }
        String strMo1106b = mo1106b();
        if (strMo1106b != null) {
            if (z) {
                stringBuffer.append(',');
            }
            stringBuffer.append(' ');
            stringBuffer.append(strMo1106b);
        }
        return stringBuffer.toString();
    }
}
