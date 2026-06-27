package com.p046a.p049b.p063d.p064a;

/* JADX INFO: renamed from: com.a.b.d.a.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0775g extends AbstractC0774f {

    /* JADX INFO: renamed from: a */
    private final Object f1573a;

    /* JADX INFO: renamed from: b */
    private final int f1574b;

    /* JADX INFO: renamed from: c */
    private final int f1575c;

    private C0775g(EnumC0778j enumC0778j, int i, Object obj, int i2, int i3) {
        super(enumC0778j, i, 0, 0, 0, 0L);
        this.f1573a = obj;
        this.f1574b = i2;
        this.f1575c = i3;
    }

    public C0775g(EnumC0778j enumC0778j, int i, byte[] bArr) {
        this(enumC0778j, i, bArr, bArr.length, 1);
    }

    public C0775g(EnumC0778j enumC0778j, int i, int[] iArr) {
        this(enumC0778j, i, iArr, iArr.length, 4);
    }

    public C0775g(EnumC0778j enumC0778j, int i, long[] jArr) {
        this(enumC0778j, i, jArr, jArr.length, 8);
    }

    public C0775g(EnumC0778j enumC0778j, int i, short[] sArr) {
        this(enumC0778j, i, sArr, sArr.length, 2);
    }

    @Override // com.p046a.p049b.p063d.p064a.AbstractC0774f
    /* JADX INFO: renamed from: d */
    public final AbstractC0774f mo1525d(int i) {
        throw new UnsupportedOperationException("no index in instruction");
    }

    @Override // com.p046a.p049b.p063d.p064a.AbstractC0774f
    /* JADX INFO: renamed from: m */
    public final int mo1526m() {
        return 0;
    }

    /* JADX INFO: renamed from: u */
    public final short m1574u() {
        return (short) this.f1575c;
    }

    /* JADX INFO: renamed from: v */
    public final int m1575v() {
        return this.f1574b;
    }

    /* JADX INFO: renamed from: w */
    public final Object m1576w() {
        return this.f1573a;
    }
}
