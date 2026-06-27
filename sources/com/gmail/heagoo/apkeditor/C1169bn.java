package com.gmail.heagoo.apkeditor;

import java.util.Comparator;
import java.util.Locale;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.bn */
/* JADX INFO: loaded from: classes.dex */
final class C1169bn implements Comparator {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Locale f3432a;

    C1169bn(C1167bl c1167bl, Locale locale) {
        this.f3432a = locale;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((C1166bk) obj).f3425c.toLowerCase(this.f3432a).compareTo(((C1166bk) obj2).f3425c.toLowerCase(this.f3432a));
    }
}
