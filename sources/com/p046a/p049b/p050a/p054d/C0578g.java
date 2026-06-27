package com.p046a.p049b.p050a.p054d;

import java.util.Comparator;
import java.util.zip.ZipEntry;

/* JADX INFO: renamed from: com.a.b.a.d.g */
/* JADX INFO: loaded from: classes.dex */
final class C0578g implements Comparator {
    C0578g(C0575d c0575d) {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((ZipEntry) obj).getName().replace('$', '0').replace("package-info", "").compareTo(((ZipEntry) obj2).getName().replace('$', '0').replace("package-info", ""));
    }
}
