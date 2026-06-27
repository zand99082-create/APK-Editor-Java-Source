package com.p046a.p049b.p071g;

import java.util.Comparator;

/* JADX INFO: renamed from: com.a.b.g.aj */
/* JADX INFO: loaded from: classes.dex */
public final class C0916aj implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int i = ((C0915ai) obj).f2448f;
        int i2 = ((C0915ai) obj2).f2448f;
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }
}
