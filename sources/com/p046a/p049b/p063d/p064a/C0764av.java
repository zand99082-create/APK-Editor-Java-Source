package com.p046a.p049b.p063d.p064a;

import java.io.EOFException;

/* JADX INFO: renamed from: com.a.b.d.a.av */
/* JADX INFO: loaded from: classes.dex */
public final class C0764av extends AbstractC0769b implements InterfaceC0772d {

    /* JADX INFO: renamed from: a */
    private final short[] f1556a;

    public C0764av(short[] sArr) {
        if (sArr == null) {
            throw new NullPointerException("array == null");
        }
        this.f1556a = sArr;
    }

    @Override // com.p046a.p049b.p063d.p064a.InterfaceC0772d
    /* JADX INFO: renamed from: c */
    public final int mo1530c() throws EOFException {
        try {
            short s = this.f1556a[mo1548a()];
            m1549a(1);
            return s & 65535;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new EOFException();
        }
    }

    @Override // com.p046a.p049b.p063d.p064a.InterfaceC0772d
    /* JADX INFO: renamed from: d */
    public final int mo1531d() {
        return mo1530c() | (mo1530c() << 16);
    }

    @Override // com.p046a.p049b.p063d.p064a.InterfaceC0772d
    /* JADX INFO: renamed from: e */
    public final long mo1532e() {
        return ((long) mo1530c()) | (((long) mo1530c()) << 16) | (((long) mo1530c()) << 32) | (((long) mo1530c()) << 48);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m1533f() {
        return mo1548a() < this.f1556a.length;
    }
}
