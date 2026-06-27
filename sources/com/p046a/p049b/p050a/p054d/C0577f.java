package com.p046a.p049b.p050a.p054d;

import java.io.File;
import java.util.Comparator;

/* JADX INFO: renamed from: com.a.b.a.d.f */
/* JADX INFO: loaded from: classes.dex */
final class C0577f implements Comparator {
    C0577f(C0575d c0575d) {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((File) obj).getName().replace('$', '0').replace("package-info", "").compareTo(((File) obj2).getName().replace('$', '0').replace("package-info", ""));
    }
}
