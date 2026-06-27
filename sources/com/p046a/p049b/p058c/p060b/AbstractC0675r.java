package com.p046a.p049b.p058c.p060b;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p066f.p068b.C0850t;
import com.p046a.p049b.p066f.p069c.AbstractC0857a;
import com.p046a.p049b.p066f.p069c.AbstractC0876r;
import com.p046a.p049b.p066f.p069c.AbstractC0877s;
import com.p046a.p049b.p066f.p069c.C0874p;
import com.p046a.p049b.p066f.p069c.C0883y;
import com.p046a.p049b.p073h.C0970r;
import java.util.BitSet;

/* JADX INFO: renamed from: com.a.b.c.b.r */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0675r {
    /* JADX INFO: renamed from: a */
    protected static String m1248a(C0850t c0850t) {
        int iD_ = c0850t.m2239d_();
        StringBuffer stringBuffer = new StringBuffer((iD_ * 5) + 2);
        stringBuffer.append('{');
        for (int i = 0; i < iD_; i++) {
            if (i != 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(c0850t.m1815b(i).m1801m());
        }
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: a */
    protected static String m1249a(AbstractC0877s abstractC0877s) {
        StringBuffer stringBuffer = new StringBuffer(100);
        stringBuffer.append('#');
        if (abstractC0877s instanceof C0874p) {
            stringBuffer.append("null");
        } else {
            stringBuffer.append(abstractC0877s.mo1866h());
            stringBuffer.append(' ');
            stringBuffer.append(abstractC0877s.mo919d());
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: a */
    protected static String m1250a(AbstractC0877s abstractC0877s, int i) {
        StringBuffer stringBuffer = new StringBuffer(20);
        stringBuffer.append("#");
        long jMo1895k = abstractC0877s instanceof AbstractC0876r ? ((AbstractC0876r) abstractC0877s).mo1895k() : abstractC0877s.mo1894j();
        switch (i) {
            case 4:
                stringBuffer.append(C1067a.m2561y((int) jMo1895k));
                break;
            case 8:
                stringBuffer.append(C1067a.m2560x((int) jMo1895k));
                break;
            case 16:
                stringBuffer.append(C1067a.m2558v((int) jMo1895k));
                break;
            case 32:
                stringBuffer.append(C1067a.m2556t((int) jMo1895k));
                break;
            case 64:
                stringBuffer.append(C1067a.m2455a(jMo1895k));
                break;
            default:
                throw new RuntimeException("shouldn't happen");
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: a */
    protected static short m1251a(int i, int i2) {
        if ((i & 255) != i) {
            throw new IllegalArgumentException("low out of range 0..255");
        }
        if ((i2 & 255) != i2) {
            throw new IllegalArgumentException("high out of range 0..255");
        }
        return (short) ((i2 << 8) | i);
    }

    /* JADX INFO: renamed from: a */
    protected static short m1252a(AbstractC0669l abstractC0669l, int i) {
        if ((i & 255) != i) {
            throw new IllegalArgumentException("arg out of range 0..255");
        }
        int iM1236a = abstractC0669l.m1223h().m1236a();
        if ((iM1236a & 255) != iM1236a) {
            throw new IllegalArgumentException("opcode out of range 0..255");
        }
        return (short) (iM1236a | (i << 8));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, short] */
    /* JADX INFO: renamed from: a */
    protected static void m1253a(C0970r c0970r, short s, int i) {
        m1256a(c0970r, s, (short) i, i >> 16);
    }

    /* JADX INFO: renamed from: a */
    protected static void m1254a(C0970r c0970r, short s, long j) {
        c0970r.m2280b(s);
        c0970r.m2280b((short) j);
        c0970r.m2280b((short) (j >> 16));
        c0970r.m2280b((short) (j >> 32));
        c0970r.m2280b((short) (j >> 48));
    }

    /* JADX INFO: renamed from: a */
    protected static void m1255a(C0970r c0970r, short s, short s2) {
        c0970r.m2280b(s);
        c0970r.m2280b(s2);
    }

    /* JADX INFO: renamed from: a */
    protected static void m1256a(C0970r c0970r, short s, short s2, short s3) {
        c0970r.m2280b(s);
        c0970r.m2280b(s2);
        c0970r.m2280b(s3);
    }

    /* JADX INFO: renamed from: a */
    protected static boolean m1257a(int i) {
        return i == (i & 15);
    }

    /* JADX INFO: renamed from: b */
    protected static int m1258b(int i, int i2) {
        if ((i & 15) != i) {
            throw new IllegalArgumentException("low out of range 0..15");
        }
        if ((i2 & 15) != i2) {
            throw new IllegalArgumentException("high out of range 0..15");
        }
        return (i2 << 4) | i;
    }

    /* JADX INFO: renamed from: b */
    protected static boolean m1259b(int i) {
        return ((byte) i) == i;
    }

    /* JADX INFO: renamed from: c */
    protected static boolean m1260c(int i) {
        return i == (i & 255);
    }

    /* JADX INFO: renamed from: d */
    protected static String m1261d(AbstractC0669l abstractC0669l) {
        int iM1173d = ((C0656al) abstractC0669l).m1173d();
        return iM1173d == ((char) iM1173d) ? C1067a.m2558v(iM1173d) : C1067a.m2556t(iM1173d);
    }

    /* JADX INFO: renamed from: d */
    protected static boolean m1262d(int i) {
        return ((short) i) == i;
    }

    /* JADX INFO: renamed from: e */
    protected static String m1263e(AbstractC0669l abstractC0669l) {
        int iM1174e = ((C0656al) abstractC0669l).m1174e();
        return iM1174e == ((short) iM1174e) ? C1067a.m2430A(iM1174e) : C1067a.m2562z(iM1174e);
    }

    /* JADX INFO: renamed from: e */
    protected static boolean m1264e(int i) {
        return i == (65535 & i);
    }

    /* JADX INFO: renamed from: f */
    protected static String m1265f(AbstractC0669l abstractC0669l) {
        AbstractC0857a abstractC0857aM1199c = ((C0666i) abstractC0669l).m1199c();
        return abstractC0857aM1199c instanceof C0883y ? ((C0883y) abstractC0857aM1199c).m1910i() : abstractC0857aM1199c.mo919d();
    }

    /* JADX INFO: renamed from: g */
    protected static String m1266g(AbstractC0669l abstractC0669l) {
        C0666i c0666i = (C0666i) abstractC0669l;
        if (!c0666i.m1201e()) {
            return "";
        }
        StringBuilder sb = new StringBuilder(20);
        int iM1200d = c0666i.m1200d();
        sb.append(c0666i.m1199c().mo1866h());
        sb.append('@');
        if (iM1200d < 65536) {
            sb.append(C1067a.m2558v(iM1200d));
        } else {
            sb.append(C1067a.m2556t(iM1200d));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo1107a();

    /* JADX INFO: renamed from: a */
    public abstract String mo1108a(AbstractC0669l abstractC0669l);

    /* JADX INFO: renamed from: a */
    public abstract String mo1109a(AbstractC0669l abstractC0669l, boolean z);

    /* JADX INFO: renamed from: a */
    public abstract void mo1110a(C0970r c0970r, AbstractC0669l abstractC0669l);

    /* JADX INFO: renamed from: a */
    public boolean mo1111a(C0656al c0656al) {
        return false;
    }

    /* JADX INFO: renamed from: b */
    public abstract boolean mo1112b(AbstractC0669l abstractC0669l);

    /* JADX INFO: renamed from: c */
    public BitSet mo1113c(AbstractC0669l abstractC0669l) {
        return new BitSet();
    }
}
