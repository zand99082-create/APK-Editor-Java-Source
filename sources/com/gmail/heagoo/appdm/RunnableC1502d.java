package com.gmail.heagoo.appdm;

import android.app.Activity;
import android.widget.Toast;

/* JADX INFO: renamed from: com.gmail.heagoo.appdm.d */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1502d implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Activity f4514a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ String f4515b;

    RunnableC1502d(DialogC1491a dialogC1491a, Activity activity, String str) {
        this.f4514a = activity;
        this.f4515b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Toast.makeText(this.f4514a, this.f4515b, 0).show();
    }
}
