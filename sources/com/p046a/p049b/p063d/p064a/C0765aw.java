package com.p046a.p049b.p063d.p064a;

/* JADX INFO: renamed from: com.a.b.d.a.aw */
/* JADX INFO: loaded from: classes.dex */
public final class C0765aw extends AbstractC0769b implements InterfaceC0773e {

    /* JADX INFO: renamed from: a */
    private final short[] f1557a;

    public C0765aw(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("maxSize < 0");
        }
        this.f1557a = new short[i];
    }

    @Override // com.p046a.p049b.p063d.p064a.InterfaceC0773e
    /* JADX INFO: renamed from: a */
    public final void mo1534a(short s) {
        this.f1557a[mo1548a()] = s;
        m1549a(1);
    }

    @Override // com.p046a.p049b.p063d.p064a.InterfaceC0773e
    /* JADX INFO: renamed from: a */
    public final void mo1535a(short s, short s2) {
        mo1534a(s);
        mo1534a(s2);
    }

    @Override // com.p046a.p049b.p063d.p064a.InterfaceC0773e
    /* JADX INFO: renamed from: a */
    public final void mo1536a(short s, short s2, short s3) {
        mo1534a(s);
        mo1534a(s2);
        mo1534a(s3);
    }

    @Override // com.p046a.p049b.p063d.p064a.InterfaceC0773e
    /* JADX INFO: renamed from: a */
    public final void mo1537a(short s, short s2, short s3, short s4, short s5) {
        mo1534a(s);
        mo1534a(s2);
        mo1534a(s3);
        mo1534a(s4);
        mo1534a(s5);
    }

    @Override // com.p046a.p049b.p063d.p064a.InterfaceC0773e
    /* JADX INFO: renamed from: a */
    public final void mo1538a(byte[] bArr) {
        boolean z = true;
        int i = 0;
        for (byte b2 : bArr) {
            if (z) {
                i = b2 & 255;
                z = false;
            } else {
                int i2 = (b2 << 8) | i;
                mo1534a((short) i2);
                i = i2;
                z = true;
            }
        }
        if (z) {
            return;
        }
        mo1534a((short) i);
    }

    @Override // com.p046a.p049b.p063d.p064a.InterfaceC0773e
    /* JADX INFO: renamed from: a */
    public final void mo1539a(int[] iArr) {
        for (int i : iArr) {
            mo1542a_(i);
        }
    }

    @Override // com.p046a.p049b.p063d.p064a.InterfaceC0773e
    /* JADX INFO: renamed from: a */
    public final void mo1540a(long[] jArr) {
        for (long j : jArr) {
            mo1534a((short) j);
            mo1534a((short) (r2 >> 16));
            mo1534a((short) (r2 >> 32));
            mo1534a((short) (r2 >> 48));
        }
    }

    @Override // com.p046a.p049b.p063d.p064a.InterfaceC0773e
    /* JADX INFO: renamed from: a */
    public final void mo1541a(short[] sArr) {
        for (short s : sArr) {
            mo1534a(s);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int, short] */
    @Override // com.p046a.p049b.p063d.p064a.InterfaceC0773e
    /* JADX INFO: renamed from: a_ */
    public final void mo1542a_(int i) {
        mo1534a((short) i);
        mo1534a((short) (i >> 16));
    }

    /* JADX INFO: renamed from: c */
    public final short[] m1543c() {
        int iA = mo1548a();
        if (iA == this.f1557a.length) {
            return this.f1557a;
        }
        short[] sArr = new short[iA];
        System.arraycopy(this.f1557a, 0, sArr, 0, iA);
        return sArr;
    }
}
