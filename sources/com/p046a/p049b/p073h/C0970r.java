package com.p046a.p049b.p073h;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p047a.p048a.C0482d;
import com.p046a.p047a.p048a.InterfaceC0481c;
import java.io.Writer;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.a.b.h.r */
/* JADX INFO: loaded from: classes.dex */
public class C0970r implements InterfaceC0481c {

    /* JADX INFO: renamed from: a */
    private final boolean f2586a;

    /* JADX INFO: renamed from: b */
    private byte[] f2587b;

    /* JADX INFO: renamed from: c */
    private int f2588c;

    /* JADX INFO: renamed from: d */
    private boolean f2589d;

    /* JADX INFO: renamed from: e */
    private ArrayList f2590e;

    /* JADX INFO: renamed from: f */
    private int f2591f;

    /* JADX INFO: renamed from: g */
    private int f2592g;

    public C0970r() {
        this(1000);
    }

    public C0970r(int i) {
        this(new byte[i], true);
    }

    public C0970r(byte[] bArr) {
        this(bArr, false);
    }

    private C0970r(byte[] bArr, boolean z) {
        if (bArr == null) {
            throw new NullPointerException("data == null");
        }
        this.f2586a = z;
        this.f2587b = bArr;
        this.f2588c = 0;
        this.f2589d = false;
        this.f2590e = null;
        this.f2591f = 0;
        this.f2592g = 0;
    }

    /* JADX INFO: renamed from: i */
    private static void m2268i() {
        throw new IndexOutOfBoundsException("attempt to write past the end");
    }

    /* JADX INFO: renamed from: i */
    private void m2269i(int i) {
        if (this.f2587b.length < i) {
            byte[] bArr = new byte[(i << 1) + 1000];
            System.arraycopy(this.f2587b, 0, bArr, 0, this.f2588c);
            this.f2587b = bArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public int m2270a() {
        return this.f2588c;
    }

    /* JADX INFO: renamed from: a */
    public void m2271a(int i) {
        if (this.f2588c != i) {
            throw new C0482d("expected cursor " + i + "; actual value: " + this.f2588c);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2272a(int i, String str) {
        if (this.f2590e == null) {
            return;
        }
        m2284d();
        int size = this.f2590e.size();
        int iM2231b = size == 0 ? 0 : ((C0958f) this.f2590e.get(size - 1)).m2231b();
        if (iM2231b <= this.f2588c) {
            iM2231b = this.f2588c;
        }
        this.f2590e.add(new C0958f(iM2231b, iM2231b + i, str));
    }

    /* JADX INFO: renamed from: a */
    public void m2273a(int i, boolean z) {
        if (this.f2590e != null || this.f2588c != 0) {
            throw new RuntimeException("cannot enable annotations");
        }
        if (i < 40) {
            throw new IllegalArgumentException("annotationWidth < 40");
        }
        int i2 = (((i - 7) / 15) + 1) & (-2);
        int i3 = i2 >= 6 ? i2 > 10 ? 10 : i2 : 6;
        this.f2590e = new ArrayList(1000);
        this.f2591f = i;
        this.f2592g = i3;
        this.f2589d = z;
    }

    /* JADX INFO: renamed from: a */
    public void m2274a(long j) {
        int i = this.f2588c;
        int i2 = i + 8;
        if (this.f2586a) {
            m2269i(i2);
        } else if (i2 > this.f2587b.length) {
            m2268i();
            return;
        }
        int i3 = (int) j;
        this.f2587b[i] = (byte) i3;
        this.f2587b[i + 1] = (byte) (i3 >> 8);
        this.f2587b[i + 2] = (byte) (i3 >> 16);
        this.f2587b[i + 3] = i3 >> 24;
        int i4 = (int) (j >> 32);
        this.f2587b[i + 4] = (byte) i4;
        this.f2587b[i + 5] = (byte) (i4 >> 8);
        this.f2587b[i + 6] = (byte) (i4 >> 16);
        this.f2587b[i + 7] = i4 >> 24;
        this.f2588c = i2;
    }

    /* JADX INFO: renamed from: a */
    public void m2275a(C0955c c0955c) {
        int iM2219a = c0955c.m2219a();
        int i = this.f2588c;
        int i2 = iM2219a + i;
        if (this.f2586a) {
            m2269i(i2);
        } else if (i2 > this.f2587b.length) {
            m2268i();
            return;
        }
        c0955c.m2222a(this.f2587b, i);
        this.f2588c = i2;
    }

    /* JADX INFO: renamed from: a */
    public void m2276a(Writer writer) {
        String strM2233c;
        C0972t c0972t = new C0972t(writer, (this.f2591f - r1) - 1, m2285e(), "|");
        Writer writerM2296a = c0972t.m2296a();
        Writer writerM2297b = c0972t.m2297b();
        int size = this.f2590e.size();
        int i = 0;
        int i2 = 0;
        while (i2 < this.f2588c && i < size) {
            C0958f c0958f = (C0958f) this.f2590e.get(i);
            int iM2229a = c0958f.m2229a();
            if (i2 < iM2229a) {
                strM2233c = "";
            } else {
                int iM2231b = c0958f.m2231b();
                i++;
                strM2233c = c0958f.m2233c();
                iM2229a = iM2231b;
                i2 = iM2229a;
            }
            writerM2296a.write(C1067a.m2463a(this.f2587b, i2, iM2229a - i2, i2, this.f2592g, 6));
            writerM2297b.write(strM2233c);
            c0972t.m2298c();
            i2 = iM2229a;
        }
        if (i2 < this.f2588c) {
            writerM2296a.write(C1067a.m2463a(this.f2587b, i2, this.f2588c - i2, i2, this.f2592g, 6));
        }
        while (i < size) {
            writerM2297b.write(((C0958f) this.f2590e.get(i)).m2233c());
            i++;
        }
        c0972t.m2298c();
    }

    /* JADX INFO: renamed from: a */
    public void m2277a(String str) {
        if (this.f2590e == null) {
            return;
        }
        m2284d();
        this.f2590e.add(new C0958f(this.f2588c, str));
    }

    /* JADX INFO: renamed from: a */
    public void m2278a(byte[] bArr) {
        m2279a(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: a */
    public void m2279a(byte[] bArr, int i, int i2) {
        int i3 = this.f2588c;
        int i4 = i3 + i2;
        int i5 = i2 + 0;
        if ((i2 | 0 | i4) < 0 || i5 > bArr.length) {
            throw new IndexOutOfBoundsException("bytes.length " + bArr.length + "; 0..!" + i4);
        }
        if (this.f2586a) {
            m2269i(i4);
        } else if (i4 > this.f2587b.length) {
            m2268i();
            return;
        }
        System.arraycopy(bArr, 0, this.f2587b, i3, i2);
        this.f2588c = i4;
    }

    /* JADX INFO: renamed from: b */
    public void m2280b(int i) {
        int i2 = this.f2588c;
        int i3 = i2 + 2;
        if (this.f2586a) {
            m2269i(i3);
        } else if (i3 > this.f2587b.length) {
            m2268i();
            return;
        }
        this.f2587b[i2] = (byte) i;
        this.f2587b[i2 + 1] = (byte) (i >> 8);
        this.f2588c = i3;
    }

    /* JADX INFO: renamed from: b */
    public boolean m2281b() {
        return this.f2590e != null;
    }

    /* JADX INFO: renamed from: c */
    public void m2282c(int i) {
        int i2 = this.f2588c;
        int i3 = i2 + 4;
        if (this.f2586a) {
            m2269i(i3);
        } else if (i3 > this.f2587b.length) {
            m2268i();
            return;
        }
        this.f2587b[i2] = (byte) i;
        this.f2587b[i2 + 1] = (byte) (i >> 8);
        this.f2587b[i2 + 2] = (byte) (i >> 16);
        this.f2587b[i2 + 3] = i >> 24;
        this.f2588c = i3;
    }

    /* JADX INFO: renamed from: c */
    public boolean m2283c() {
        return this.f2589d;
    }

    /* JADX INFO: renamed from: d */
    public void m2284d() {
        int size;
        if (this.f2590e == null || (size = this.f2590e.size()) == 0) {
            return;
        }
        ((C0958f) this.f2590e.get(size - 1)).m2230a(this.f2588c);
    }

    @Override // com.p046a.p047a.p048a.InterfaceC0481c
    /* JADX INFO: renamed from: d */
    public void mo569d(int i) {
        int i2 = this.f2588c;
        int i3 = i2 + 1;
        if (this.f2586a) {
            m2269i(i3);
        } else if (i3 > this.f2587b.length) {
            m2268i();
            return;
        }
        this.f2587b[i2] = (byte) i;
        this.f2588c = i3;
    }

    /* JADX INFO: renamed from: e */
    public int m2285e() {
        return this.f2591f - (((this.f2592g << 1) + 8) + (this.f2592g / 2));
    }

    /* JADX INFO: renamed from: e */
    public int m2286e(int i) {
        if (this.f2586a) {
            m2269i(this.f2588c + 5);
        }
        int i2 = this.f2588c;
        C1067a.m2469a(this, i);
        return this.f2588c - i2;
    }

    /* JADX INFO: renamed from: f */
    public void m2287f(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("count < 0");
        }
        int i2 = this.f2588c + i;
        if (this.f2586a) {
            m2269i(i2);
        } else if (i2 > this.f2587b.length) {
            m2268i();
            return;
        }
        this.f2588c = i2;
    }

    /* JADX INFO: renamed from: f */
    public byte[] m2288f() {
        return this.f2587b;
    }

    /* JADX INFO: renamed from: g */
    public void m2289g(int i) {
        int i2 = i - 1;
        if (i < 0 || (i2 & i) != 0) {
            throw new IllegalArgumentException("bogus alignment");
        }
        int i3 = (i2 ^ (-1)) & (this.f2588c + i2);
        if (this.f2586a) {
            m2269i(i3);
        } else if (i3 > this.f2587b.length) {
            m2268i();
            return;
        }
        this.f2588c = i3;
    }

    /* JADX INFO: renamed from: g */
    public byte[] m2290g() {
        byte[] bArr = new byte[this.f2588c];
        System.arraycopy(this.f2587b, 0, bArr, 0, this.f2588c);
        return bArr;
    }

    /* JADX INFO: renamed from: h */
    public int m2291h(int i) {
        if (this.f2586a) {
            m2269i(this.f2588c + 5);
        }
        int i2 = this.f2588c;
        C1067a.m2503b(this, i);
        return this.f2588c - i2;
    }

    /* JADX INFO: renamed from: h */
    public void m2292h() {
        m2284d();
        if (this.f2590e != null) {
            for (int size = this.f2590e.size(); size > 0; size--) {
                C0958f c0958f = (C0958f) this.f2590e.get(size - 1);
                if (c0958f.m2229a() <= this.f2588c) {
                    if (c0958f.m2231b() > this.f2588c) {
                        c0958f.m2232b(this.f2588c);
                        return;
                    }
                    return;
                }
                this.f2590e.remove(size - 1);
            }
        }
    }
}
