package com.gmail.heagoo.apkeditor.util;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.util.p */
/* JADX INFO: loaded from: classes.dex */
final class C1475p {

    /* JADX INFO: renamed from: a */
    String f4380a;

    /* JADX INFO: renamed from: b */
    List f4381b;

    private C1475p(String str, String str2, int i, String str3) {
        this.f4380a = str2;
        if (!this.f4380a.startsWith("/")) {
            this.f4380a = str + this.f4380a;
        }
        this.f4381b = new ArrayList();
        this.f4381b.add(new C1476q(this, i, str3, (byte) 0));
    }

    /* synthetic */ C1475p(String str, String str2, int i, String str3, byte b2) {
        this(str, str2, i, str3);
    }
}
