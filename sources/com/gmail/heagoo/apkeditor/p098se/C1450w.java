package com.gmail.heagoo.apkeditor.p098se;

import java.util.Comparator;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.se.w */
/* JADX INFO: loaded from: classes.dex */
final class C1450w implements Comparator {
    C1450w(ViewOnClickListenerC1448u viewOnClickListenerC1448u) {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        C1452y c1452y = (C1452y) obj;
        C1452y c1452y2 = (C1452y) obj2;
        if (c1452y.f4279b) {
            if (!c1452y2.f4279b) {
                return -1;
            }
        } else if (c1452y2.f4279b) {
            return 1;
        }
        return c1452y.f4278a.compareTo(c1452y2.f4278a);
    }
}
