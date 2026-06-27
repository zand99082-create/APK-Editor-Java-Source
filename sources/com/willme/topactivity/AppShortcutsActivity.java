package com.willme.topactivity;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(24)
public class AppShortcutsActivity extends Activity {
    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!MainActivity.m4137a(this) || !Settings.canDrawOverlays(this)) {
            C1719a.m4154a(this, true);
            startActivity(new Intent(this, (Class<?>) MainActivity.class));
            finish();
            return;
        }
        boolean z = !C1719a.m4155a(this);
        C1719a.m4154a(this, z);
        if (z) {
            C1720b.m4161a(this, getPackageName() + "\n" + getClass().getName());
            NotificationActionReceiver.m4142a((Context) this, false);
            startService(new Intent(this, (Class<?>) WatchingService.class));
        } else {
            C1720b.m4162b(this);
            NotificationActionReceiver.m4142a((Context) this, true);
        }
        sendBroadcast(new Intent("com.willme.topactivity.ACTION_STATE_CHANGED"));
        finish();
    }
}
