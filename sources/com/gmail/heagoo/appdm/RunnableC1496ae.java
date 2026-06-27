package com.gmail.heagoo.appdm;

import android.content.Context;
import android.widget.Toast;

/* JADX INFO: renamed from: com.gmail.heagoo.appdm.ae */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1496ae implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ String f4500a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C1495ad f4501b;

    RunnableC1496ae(C1495ad c1495ad, String str) {
        this.f4501b = c1495ad;
        this.f4500a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Toast.makeText((Context) this.f4501b.f4493a.get(), this.f4500a, 0).show();
    }
}
