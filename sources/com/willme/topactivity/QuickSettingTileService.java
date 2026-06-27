package com.willme.topactivity;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.provider.Settings;
import android.service.quicksettings.TileService;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(24)
public class QuickSettingTileService extends TileService {

    /* JADX INFO: renamed from: a */
    private C1717a f5143a;

    /* JADX INFO: renamed from: com.willme.topactivity.QuickSettingTileService$a */
    class C1717a extends BroadcastReceiver {
        C1717a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            QuickSettingTileService.this.m4143a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m4143a() {
        if (MainActivity.m4137a(this) && Settings.canDrawOverlays(this)) {
            getQsTile().setState(C1719a.m4155a(this) ? 2 : 1);
        } else {
            getQsTile().setState(1);
        }
        getQsTile().updateTile();
    }

    /* JADX INFO: renamed from: a */
    public static void m4144a(Context context) {
        TileService.requestListeningState(context.getApplicationContext(), new ComponentName(context, (Class<?>) QuickSettingTileService.class));
        context.sendBroadcast(new Intent("com.willme.topactivity.ACTION.UPDATE_TITLE"));
    }

    @Override // android.service.quicksettings.TileService
    public void onClick() {
        if (!MainActivity.m4137a(this) || !Settings.canDrawOverlays(this)) {
            Intent intent = new Intent(this, (Class<?>) MainActivity.class);
            intent.putExtra("from_qs_tile", true);
            startActivityAndCollapse(intent);
            return;
        }
        C1719a.m4154a(this, !C1719a.m4155a(this));
        if (C1719a.m4155a(this)) {
            C1720b.m4161a(this, null);
            NotificationActionReceiver.m4142a((Context) this, false);
            startService(new Intent(this, (Class<?>) WatchingService.class));
        } else {
            C1720b.m4162b(this);
            NotificationActionReceiver.m4142a((Context) this, true);
        }
        sendBroadcast(new Intent("com.willme.topactivity.ACTION_STATE_CHANGED"));
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f5143a = new C1717a();
    }

    @Override // android.service.quicksettings.TileService
    public void onStartListening() {
        registerReceiver(this.f5143a, new IntentFilter("com.willme.topactivity.ACTION.UPDATE_TITLE"));
        super.onStartListening();
        m4143a();
    }

    @Override // android.service.quicksettings.TileService
    public void onStopListening() {
        unregisterReceiver(this.f5143a);
        super.onStopListening();
    }

    @Override // android.service.quicksettings.TileService
    public void onTileAdded() {
        C1719a.m4156b(this, true);
        sendBroadcast(new Intent("com.willme.topactivity.ACTION_STATE_CHANGED"));
    }

    @Override // android.service.quicksettings.TileService
    public void onTileRemoved() {
        super.onTileRemoved();
        C1719a.m4156b(this, false);
        sendBroadcast(new Intent("com.willme.topactivity.ACTION_STATE_CHANGED"));
    }
}
