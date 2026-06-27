package com.p046a.p049b.p063d.p064a;

import java.util.HashMap;

/* JADX INFO: renamed from: com.a.b.d.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0742a {

    /* JADX INFO: renamed from: a */
    private final HashMap f1550a = new HashMap();

    /* JADX INFO: renamed from: a */
    public final int m1521a(int i) {
        Integer num = (Integer) this.f1550a.get(Integer.valueOf(i));
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    /* JADX INFO: renamed from: a */
    public final void m1522a(int i, int i2) {
        this.f1550a.put(Integer.valueOf(i), Integer.valueOf(i2));
    }
}
