package com.p046a.p049b.p058c.p062c;

import com.p046a.p047a.p048a.C0482d;
import com.p046a.p049b.p058c.C0615a;
import com.p046a.p049b.p066f.p069c.AbstractC0857a;
import com.p046a.p049b.p066f.p069c.AbstractC0864f;
import com.p046a.p049b.p066f.p069c.C0869k;
import com.p046a.p049b.p066f.p069c.C0870l;
import com.p046a.p049b.p066f.p069c.C0883y;
import com.p046a.p049b.p066f.p069c.C0884z;
import com.p046a.p049b.p066f.p070d.C0887c;
import com.p046a.p049b.p073h.C0970r;
import java.io.Writer;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.zip.Adler32;

/* JADX INFO: renamed from: com.a.b.c.c.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0732r {

    /* JADX INFO: renamed from: a */
    private C0615a f1519a;

    /* JADX INFO: renamed from: n */
    private final C0685aa f1532n = new C0685aa(this);

    /* JADX INFO: renamed from: c */
    private final C0696al f1521c = new C0696al(null, this, 4, C0699ao.f1416a);

    /* JADX INFO: renamed from: b */
    private final C0696al f1520b = new C0696al("word_data", this, 4, C0699ao.f1417b);

    /* JADX INFO: renamed from: e */
    private final C0696al f1523e = new C0696al("string_data", this, 1, C0699ao.f1418c);

    /* JADX INFO: renamed from: l */
    private final C0696al f1530l = new C0696al(null, this, 1, C0699ao.f1416a);

    /* JADX INFO: renamed from: m */
    private final C0696al f1531m = new C0696al("byte_data", this, 1, C0699ao.f1417b);

    /* JADX INFO: renamed from: f */
    private final C0709ay f1524f = new C0709ay(this);

    /* JADX INFO: renamed from: g */
    private final C0712ba f1525g = new C0712ba(this);

    /* JADX INFO: renamed from: h */
    private final C0703as f1526h = new C0703as(this);

    /* JADX INFO: renamed from: i */
    private final C0739y f1527i = new C0739y(this);

    /* JADX INFO: renamed from: j */
    private final C0695ak f1528j = new C0695ak(this);

    /* JADX INFO: renamed from: k */
    private final C0725k f1529k = new C0725k(this);

    /* JADX INFO: renamed from: d */
    private final C0696al f1522d = new C0696al("map", this, 4, C0699ao.f1416a);

    /* JADX INFO: renamed from: o */
    private final AbstractC0704at[] f1533o = {this.f1532n, this.f1524f, this.f1525g, this.f1526h, this.f1527i, this.f1528j, this.f1529k, this.f1520b, this.f1521c, this.f1523e, this.f1531m, this.f1530l, this.f1522d};

    /* JADX INFO: renamed from: p */
    private int f1534p = -1;

    /* JADX INFO: renamed from: q */
    private int f1535q = 79;

    public C0732r(C0615a c0615a) {
        this.f1519a = c0615a;
    }

    /* JADX INFO: renamed from: a */
    private C0970r m1474a(boolean z, boolean z2) {
        this.f1529k.m1364h();
        this.f1530l.m1364h();
        this.f1520b.m1364h();
        this.f1531m.m1364h();
        this.f1528j.m1364h();
        this.f1527i.m1364h();
        this.f1526h.m1364h();
        this.f1521c.m1364h();
        this.f1525g.m1364h();
        this.f1524f.m1364h();
        this.f1523e.m1364h();
        this.f1532n.m1364h();
        int i = 0;
        int iMo1339f_ = 0;
        while (i < 13) {
            AbstractC0704at abstractC0704at = this.f1533o[i];
            int iM1358b = abstractC0704at.m1358b(iMo1339f_);
            if (iM1358b < iMo1339f_) {
                throw new RuntimeException("bogus placement for section " + i);
            }
            try {
                if (abstractC0704at == this.f1522d) {
                    C0690af.m1319a(this.f1533o, this.f1522d);
                    this.f1522d.m1364h();
                }
                if (abstractC0704at instanceof C0696al) {
                    ((C0696al) abstractC0704at).m1338d();
                }
                i++;
                iMo1339f_ = iM1358b + abstractC0704at.mo1339f_();
            } catch (RuntimeException e) {
                throw C0482d.m570a(e, "...while writing section " + i);
            }
        }
        this.f1534p = iMo1339f_;
        byte[] bArr = new byte[this.f1534p];
        C0970r c0970r = new C0970r(bArr);
        if (z) {
            c0970r.m2273a(this.f1535q, z2);
        }
        for (int i2 = 0; i2 < 13; i2++) {
            try {
                AbstractC0704at abstractC0704at2 = this.f1533o[i2];
                int iM1363g = abstractC0704at2.m1363g() - c0970r.m2270a();
                if (iM1363g < 0) {
                    throw new C0482d("excess write of " + (-iM1363g));
                }
                c0970r.m2287f(abstractC0704at2.m1363g() - c0970r.m2270a());
                abstractC0704at2.m1360c(c0970r);
            } catch (RuntimeException e2) {
                C0482d c0482d = e2 instanceof C0482d ? (C0482d) e2 : new C0482d(e2);
                c0482d.m573a("...while writing section " + i2);
                throw c0482d;
            }
        }
        if (c0970r.m2270a() != this.f1534p) {
            throw new RuntimeException("foreshortened write");
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bArr, 32, bArr.length - 32);
            try {
                int iDigest = messageDigest.digest(bArr, 12, 20);
                if (iDigest != 20) {
                    throw new RuntimeException("unexpected digest write: " + iDigest + " bytes");
                }
                Adler32 adler32 = new Adler32();
                adler32.update(bArr, 12, bArr.length - 12);
                int value = (int) adler32.getValue();
                bArr[8] = (byte) value;
                bArr[9] = (byte) (value >> 8);
                bArr[10] = (byte) (value >> 16);
                bArr[11] = value >> 24;
                if (z) {
                    this.f1520b.m1334a(c0970r, EnumC0689ae.f1389m, "\nmethod code index:\n\n");
                    m1498r().m1369a(c0970r);
                    c0970r.m2292h();
                }
                return c0970r;
            } catch (DigestException e3) {
                throw new RuntimeException(e3);
            }
        } catch (NoSuchAlgorithmException e4) {
            throw new RuntimeException(e4);
        }
    }

    /* JADX INFO: renamed from: a */
    public final C0724j m1475a(String str) {
        try {
            return (C0724j) this.f1529k.m1447a(new C0884z(C0887c.m1944c(str)));
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1476a(int i) {
        if (i < 40) {
            throw new IllegalArgumentException("dumpWidth < 40");
        }
        this.f1535q = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m1477a(C0724j c0724j) {
        this.f1529k.m1448a(c0724j);
    }

    /* JADX INFO: renamed from: a */
    final void m1478a(AbstractC0857a abstractC0857a) {
        if (abstractC0857a instanceof C0883y) {
            this.f1524f.m1375a((C0883y) abstractC0857a);
            return;
        }
        if (abstractC0857a instanceof C0884z) {
            this.f1525g.m1379a((C0884z) abstractC0857a);
            return;
        }
        if (abstractC0857a instanceof AbstractC0864f) {
            this.f1528j.m1329a((AbstractC0864f) abstractC0857a);
            return;
        }
        if (abstractC0857a instanceof C0870l) {
            this.f1527i.m1512a((C0870l) abstractC0857a);
        } else if (abstractC0857a instanceof C0869k) {
            this.f1527i.m1512a(((C0869k) abstractC0857a).m1888i());
        } else if (abstractC0857a == null) {
            throw new NullPointerException("cst == null");
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1479a() {
        return this.f1529k.mo1308a().isEmpty();
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m1480a(Writer writer, boolean z) {
        boolean z2 = writer != null;
        C0970r c0970rM1474a = m1474a(z2, z);
        if (z2) {
            c0970rM1474a.m2276a(writer);
        }
        return c0970rM1474a.m2288f();
    }

    /* JADX INFO: renamed from: b */
    public final C0615a m1481b() {
        return this.f1519a;
    }

    /* JADX INFO: renamed from: b */
    final AbstractC0687ac m1482b(AbstractC0857a abstractC0857a) {
        if (abstractC0857a instanceof C0883y) {
            return this.f1524f.m1374a(abstractC0857a);
        }
        if (abstractC0857a instanceof C0884z) {
            return this.f1525g.m1378a(abstractC0857a);
        }
        if (abstractC0857a instanceof AbstractC0864f) {
            return this.f1528j.m1328a(abstractC0857a);
        }
        if (abstractC0857a instanceof C0870l) {
            return this.f1527i.m1511a(abstractC0857a);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final int m1483c() {
        if (this.f1534p < 0) {
            throw new RuntimeException("file size not yet known");
        }
        return this.f1534p;
    }

    /* JADX INFO: renamed from: d */
    final C0696al m1484d() {
        return this.f1523e;
    }

    /* JADX INFO: renamed from: e */
    final C0696al m1485e() {
        return this.f1520b;
    }

    /* JADX INFO: renamed from: f */
    final C0696al m1486f() {
        return this.f1521c;
    }

    /* JADX INFO: renamed from: g */
    final C0696al m1487g() {
        return this.f1522d;
    }

    /* JADX INFO: renamed from: h */
    final C0709ay m1488h() {
        return this.f1524f;
    }

    /* JADX INFO: renamed from: i */
    public final C0725k m1489i() {
        return this.f1529k;
    }

    /* JADX INFO: renamed from: j */
    final C0696al m1490j() {
        return this.f1530l;
    }

    /* JADX INFO: renamed from: k */
    public final C0712ba m1491k() {
        return this.f1525g;
    }

    /* JADX INFO: renamed from: l */
    final C0703as m1492l() {
        return this.f1526h;
    }

    /* JADX INFO: renamed from: m */
    public final C0739y m1493m() {
        return this.f1527i;
    }

    /* JADX INFO: renamed from: n */
    public final C0695ak m1494n() {
        return this.f1528j;
    }

    /* JADX INFO: renamed from: o */
    final C0696al m1495o() {
        return this.f1531m;
    }

    /* JADX INFO: renamed from: p */
    final AbstractC0704at m1496p() {
        return this.f1520b;
    }

    /* JADX INFO: renamed from: q */
    final AbstractC0704at m1497q() {
        return this.f1522d;
    }

    /* JADX INFO: renamed from: r */
    public final C0705au m1498r() {
        C0705au c0705au = new C0705au();
        AbstractC0704at[] abstractC0704atArr = this.f1533o;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= 13) {
                return c0705au;
            }
            Iterator it = abstractC0704atArr[i2].mo1308a().iterator();
            while (it.hasNext()) {
                c0705au.m1368a((AbstractC0688ad) it.next());
            }
            i = i2 + 1;
        }
    }
}
