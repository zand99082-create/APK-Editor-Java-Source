package com.p046a.p049b.p063d.p064a;

/* JADX INFO: renamed from: com.a.b.d.a.ax */
/* JADX INFO: loaded from: classes.dex */
public final class C0766ax extends AbstractC0774f {

    /* JADX INFO: renamed from: a */
    private final int[] f1558a;

    /* JADX INFO: renamed from: b */
    private final int[] f1559b;

    public C0766ax(EnumC0778j enumC0778j, int i, int[] iArr, int[] iArr2) {
        super(enumC0778j, i, 0, 0, 0, 0L);
        if (iArr.length != iArr2.length) {
            throw new IllegalArgumentException("keys/targets length mismatch");
        }
        this.f1558a = iArr;
        this.f1559b = iArr2;
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
    public final int[] m1544u() {
        return this.f1558a;
    }

    /* JADX INFO: renamed from: v */
    public final int[] m1545v() {
        return this.f1559b;
    }
}
