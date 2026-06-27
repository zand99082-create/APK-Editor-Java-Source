package com.gmail.heagoo.apkeditor.util;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.util.k */
/* JADX INFO: loaded from: classes.dex */
final class C1470k {

    /* JADX INFO: renamed from: a */
    String f4364a;

    /* JADX INFO: renamed from: b */
    List f4365b;

    /* JADX INFO: renamed from: c */
    private List f4366c;

    private C1470k(String str, String str2, int i, String str3, String str4) {
        this.f4365b = new ArrayList();
        this.f4366c = new ArrayList();
        this.f4364a = str2.startsWith("/") ? str2 : str + str2;
        this.f4365b.add(new C1469j(i > 0 ? i - 1 : 0, str3, str4, (byte) 0));
    }

    /* synthetic */ C1470k(String str, String str2, int i, String str3, String str4, byte b2) {
        this(str, str2, i, str3, str4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public C1468i m3608a(int i) {
        for (C1468i c1468i : this.f4366c) {
            if (c1468i.f4360a == i) {
                return c1468i;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m3610a() {
        for (C1469j c1469j : this.f4365b) {
            C1468i c1468iM3608a = m3608a(c1469j.f4362a);
            if (c1468iM3608a == null) {
                c1468iM3608a = new C1468i(c1469j.f4362a, (byte) 0);
                this.f4366c.add(c1468iM3608a);
            }
            c1468iM3608a.f4361b.add(c1469j.f4363b);
        }
    }
}
