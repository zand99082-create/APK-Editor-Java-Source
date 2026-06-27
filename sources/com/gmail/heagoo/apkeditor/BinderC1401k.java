package com.gmail.heagoo.apkeditor;

import android.app.NotificationManager;
import android.os.Binder;
import android.util.Log;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.k */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC1401k extends Binder {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ApkComposeService f4067a;

    public BinderC1401k(ApkComposeService apkComposeService) {
        this.f4067a = apkComposeService;
    }

    /* JADX INFO: renamed from: a */
    public final void m3453a() {
        if (this.f4067a.f2871p != null) {
            this.f4067a.f2871p.cancel(8001);
            if (this.f4067a.f2873r) {
                this.f4067a.stopForeground(true);
                this.f4067a.f2873r = false;
            }
            ApkComposeService.m2602a(this.f4067a, (NotificationManager) null);
            Log.e("DEBUG", "notification hided.");
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m3454b() {
        return this.f4067a.f2867l != null && this.f4067a.f2867l.isAlive();
    }
}
