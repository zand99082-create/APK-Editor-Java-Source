package com.gmail.heagoo.appdm;

import com.gmail.heagoo.appdm.util.C1524f;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.gmail.heagoo.appdm.ag */
/* JADX INFO: loaded from: classes.dex */
final class C1498ag extends Thread {

    /* JADX INFO: renamed from: a */
    private String f4505a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C1495ad f4506b;

    public C1498ag(C1495ad c1495ad, String str) {
        this.f4506b = c1495ad;
        this.f4505a = str;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        List listM3708a = this.f4506b.m3708a(this.f4505a);
        if (listM3708a != null) {
            Collections.sort(listM3708a, new C1524f());
            this.f4506b.m3710a(this.f4505a, listM3708a);
        }
    }
}
