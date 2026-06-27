package com.p046a.p047a;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p047a.p048a.InterfaceC0480b;
import com.p046a.p047a.p048a.InterfaceC0481c;
import java.io.UTFDataFormatException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.a.a.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0498o implements InterfaceC0480b, InterfaceC0481c {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0492i f730a;

    /* JADX INFO: renamed from: b */
    private final String f731b;

    /* JADX INFO: renamed from: c */
    private final ByteBuffer f732c;

    /* JADX INFO: renamed from: d */
    private final int f733d;

    private C0498o(C0492i c0492i, String str, ByteBuffer byteBuffer) {
        this.f730a = c0492i;
        this.f731b = str;
        this.f732c = byteBuffer;
        this.f733d = byteBuffer.position();
    }

    /* synthetic */ C0498o(C0492i c0492i, String str, ByteBuffer byteBuffer, byte b2) {
        this(c0492i, str, byteBuffer);
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ C0485b m633a(C0498o c0498o) {
        return new C0485b(c0498o.m636j(C1067a.m2494b(c0498o)), c0498o.m636j(C1067a.m2494b(c0498o)), c0498o.m637k(C1067a.m2494b(c0498o)), c0498o.m637k(C1067a.m2494b(c0498o)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cf, code lost:
    
        r8[r10] = new com.p046a.p047a.C0491h(r13, r14, r2);
        r10 = r10 + 1;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ C0489f m634b(C0498o c0498o) {
        C0491h[] c0491hArr;
        C0490g[] c0490gArr;
        int iM639o = c0498o.m639o();
        int iM639o2 = c0498o.m639o();
        int iM639o3 = c0498o.m639o();
        int iM639o4 = c0498o.m639o();
        int i = c0498o.f732c.getInt();
        short[] sArrM635i = c0498o.m635i(c0498o.f732c.getInt());
        if (iM639o4 > 0) {
            if (sArrM635i.length % 2 == 1) {
                c0498o.f732c.getShort();
            }
            C0498o c0498oM616a = c0498o.f730a.m616a(c0498o.f732c.position());
            c0498o.m650c(iM639o4 << 3);
            int iPosition = c0498o.f732c.position();
            int iM2494b = C1067a.m2494b(c0498o);
            c0490gArr = new C0490g[iM2494b];
            for (int i2 = 0; i2 < iM2494b; i2++) {
                int iPosition2 = c0498o.f732c.position() - iPosition;
                int iM2433a = C1067a.m2433a(c0498o);
                int iAbs = Math.abs(iM2433a);
                int[] iArr = new int[iAbs];
                int[] iArr2 = new int[iAbs];
                for (int i3 = 0; i3 < iAbs; i3++) {
                    iArr[i3] = C1067a.m2494b(c0498o);
                    iArr2[i3] = C1067a.m2494b(c0498o);
                }
                c0490gArr[i2] = new C0490g(iArr, iArr2, iM2433a <= 0 ? C1067a.m2494b(c0498o) : -1, iPosition2);
            }
            c0491hArr = new C0491h[iM639o4];
            int i4 = 0;
            while (i4 < iM639o4) {
                int i5 = c0498oM616a.f732c.getInt();
                int iM639o5 = c0498oM616a.m639o();
                int iM639o6 = c0498oM616a.m639o();
                int i6 = 0;
                while (i6 < c0490gArr.length) {
                    if (c0490gArr[i6].f706a == iM639o6) {
                        break;
                    }
                    i6++;
                }
                throw new IllegalArgumentException();
            }
        }
        c0491hArr = new C0491h[0];
        c0490gArr = new C0490g[0];
        return new C0489f(iM639o, iM639o2, iM639o3, i, sArrM635i, c0491hArr, c0490gArr);
    }

    /* JADX INFO: renamed from: i */
    private short[] m635i(int i) {
        if (i == 0) {
            return C0492i.f713a;
        }
        short[] sArr = new short[i];
        for (int i2 = 0; i2 < i; i2++) {
            sArr[i2] = this.f732c.getShort();
        }
        return sArr;
    }

    /* JADX INFO: renamed from: j */
    private C0486c[] m636j(int i) {
        C0486c[] c0486cArr = new C0486c[i];
        int iM2494b = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iM2494b += C1067a.m2494b(this);
            c0486cArr[i2] = new C0486c(iM2494b, C1067a.m2494b(this));
        }
        return c0486cArr;
    }

    /* JADX INFO: renamed from: k */
    private C0487d[] m637k(int i) {
        C0487d[] c0487dArr = new C0487d[i];
        int iM2494b = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iM2494b += C1067a.m2494b(this);
            c0487dArr[i2] = new C0487d(iM2494b, C1067a.m2494b(this), C1067a.m2494b(this));
        }
        return c0487dArr;
    }

    /* JADX INFO: renamed from: l */
    private byte[] m638l(int i) {
        byte[] bArr = new byte[this.f732c.position() - i];
        this.f732c.position(i);
        this.f732c.get(bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: o */
    private int m639o() {
        return this.f732c.getShort() & 65535;
    }

    /* JADX INFO: renamed from: a */
    public final int m640a() {
        return this.f732c.position();
    }

    /* JADX INFO: renamed from: a */
    public final void m641a(C0484ab c0484ab) {
        short[] sArrM575a = c0484ab.m575a();
        m654f(sArrM575a.length);
        for (short s : sArrM575a) {
            m643a(s);
        }
        m662l();
    }

    /* JADX INFO: renamed from: a */
    public final void m642a(String str) {
        try {
            m656g(str.length());
            m644a(C1067a.m2535f(str));
            mo569d(0);
        } catch (UTFDataFormatException e) {
            throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m643a(short s) {
        this.f732c.putShort(s);
    }

    /* JADX INFO: renamed from: a */
    public final void m644a(byte[] bArr) {
        this.f732c.put(bArr);
    }

    /* JADX INFO: renamed from: a */
    public final void m645a(short[] sArr) {
        for (short s : sArr) {
            m643a(s);
        }
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m646a(int i) {
        byte[] bArr = new byte[i];
        this.f732c.get(bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: b */
    public final int m647b() {
        return this.f732c.getInt();
    }

    /* JADX INFO: renamed from: b */
    public final void m648b(int i) {
        m656g(i + 1);
    }

    /* JADX INFO: renamed from: c */
    public final short m649c() {
        return this.f732c.getShort();
    }

    /* JADX INFO: renamed from: c */
    public final void m650c(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        this.f732c.position(this.f732c.position() + i);
    }

    @Override // com.p046a.p047a.p048a.InterfaceC0480b
    /* JADX INFO: renamed from: d */
    public final byte mo568d() {
        return this.f732c.get();
    }

    @Override // com.p046a.p047a.p048a.InterfaceC0481c
    /* JADX INFO: renamed from: d */
    public final void mo569d(int i) {
        this.f732c.put((byte) i);
    }

    /* JADX INFO: renamed from: e */
    public final C0484ab m651e() {
        short[] sArrM635i = m635i(this.f732c.getInt());
        this.f732c.position((this.f732c.position() + 3) & (-4));
        return new C0484ab(this.f730a, sArrM635i);
    }

    /* JADX INFO: renamed from: e */
    public final void m652e(int i) {
        short s = (short) i;
        if (i != (65535 & s)) {
            throw new IllegalArgumentException("Expected an unsigned short: " + i);
        }
        m643a(s);
    }

    /* JADX INFO: renamed from: f */
    public final String m653f() {
        int i = this.f732c.getInt();
        int iPosition = this.f732c.position();
        int iLimit = this.f732c.limit();
        this.f732c.position(i);
        this.f732c.limit(this.f732c.capacity());
        try {
            try {
                int iM2494b = C1067a.m2494b(this);
                String strM2458a = C1067a.m2458a(this, new char[iM2494b]);
                if (strM2458a.length() != iM2494b) {
                    throw new C0502s("Declared length " + iM2494b + " doesn't match decoded length of " + strM2458a.length());
                }
                return strM2458a;
            } catch (UTFDataFormatException e) {
                throw new C0502s(e);
            }
        } finally {
            this.f732c.position(iPosition);
            this.f732c.limit(iLimit);
        }
        this.f732c.position(iPosition);
        this.f732c.limit(iLimit);
    }

    /* JADX INFO: renamed from: f */
    public final void m654f(int i) {
        this.f732c.putInt(i);
    }

    /* JADX INFO: renamed from: g */
    public final C0506w m655g() {
        return new C0506w(this.f730a, m639o(), m639o(), this.f732c.getInt());
    }

    /* JADX INFO: renamed from: g */
    public final void m656g(int i) {
        try {
            C1067a.m2469a((InterfaceC0481c) this, i);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new C0502s("Section limit " + this.f732c.limit() + " exceeded by " + this.f731b);
        }
    }

    /* JADX INFO: renamed from: h */
    public final C0507x m657h() {
        return new C0507x(this.f730a, m639o(), m639o(), this.f732c.getInt());
    }

    /* JADX INFO: renamed from: h */
    public final void m658h(int i) {
        try {
            C1067a.m2503b((InterfaceC0481c) this, i);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new C0502s("Section limit " + this.f732c.limit() + " exceeded by " + this.f731b);
        }
    }

    /* JADX INFO: renamed from: i */
    public final C0508y m659i() {
        return new C0508y(this.f730a, this.f732c.getInt(), this.f732c.getInt(), this.f732c.getInt());
    }

    /* JADX INFO: renamed from: j */
    public final C0478a m660j() {
        byte b2 = this.f732c.get();
        int iPosition = this.f732c.position();
        new C0505v(this, 29).m689t();
        return new C0478a(this.f730a, b2, new C0504u(m638l(iPosition)));
    }

    /* JADX INFO: renamed from: k */
    public final C0504u m661k() {
        int iPosition = this.f732c.position();
        new C0505v(this, 28).m689t();
        return new C0504u(m638l(iPosition));
    }

    /* JADX INFO: renamed from: l */
    public final void m662l() {
        while ((this.f732c.position() & 3) != 0) {
            this.f732c.put((byte) 0);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m663m() {
        if ((this.f732c.position() & 3) != 0) {
            throw new IllegalStateException("Not four byte aligned!");
        }
    }

    /* JADX INFO: renamed from: n */
    public final int m664n() {
        return this.f732c.position() - this.f733d;
    }
}
