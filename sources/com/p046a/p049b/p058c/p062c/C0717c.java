package com.p046a.p049b.p058c.p062c;

import java.util.Comparator;

/* JADX INFO: renamed from: com.a.b.c.c.c */
/* JADX INFO: loaded from: classes.dex */
final class C0717c implements Comparator {
    private C0717c() {
    }

    /* synthetic */ C0717c(byte b2) {
        this();
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int i = ((C0684a) obj).f1372c.m1313i();
        int i2 = ((C0684a) obj2).f1372c.m1313i();
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }
}
