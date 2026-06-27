package com.p046a.p049b.p050a.p052b;

/* JADX INFO: renamed from: com.a.b.a.b.ac */
/* JADX INFO: loaded from: classes.dex */
final class C0536ac extends C0537ad {

    /* JADX INFO: renamed from: b */
    private int f823b;

    C0536ac(C0568x c0568x) {
        super(c0568x.f920d);
        this.f823b = c0568x.f920d + c0568x.f917a.m856l().m2239d_();
    }

    @Override // com.p046a.p049b.p050a.p052b.C0537ad
    /* JADX INFO: renamed from: a */
    final int mo766a() {
        if (this.f824a >= this.f823b) {
            throw new IndexOutOfBoundsException();
        }
        int i = this.f824a;
        this.f824a = i + 1;
        return i;
    }
}
