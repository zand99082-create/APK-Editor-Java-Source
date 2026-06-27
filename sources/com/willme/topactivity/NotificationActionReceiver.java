package com.willme.topactivity;

import android.app.ActivityManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.p015a.p016a.C0109c;
import com.gmail.heagoo.apkeditor.pro.R;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class NotificationActionReceiver extends BroadcastReceiver {
    /* JADX INFO: renamed from: a */
    public static PendingIntent m4140a(Context context, int i) {
        Intent intent = new Intent("com.willme.topactivity.ACTION_NOTIFICATION_RECEIVER");
        intent.setPackage("com.willme.topactivity");
        intent.putExtra("command", i);
        return PendingIntent.getBroadcast(context, i, intent, 0);
    }

    /* JADX INFO: renamed from: a */
    public static void m4141a(Context context) {
        ((NotificationManager) context.getSystemService("notification")).cancel(1);
    }

    /* JADX INFO: renamed from: a */
    public static void m4142a(Context context, boolean z) {
        if (C1719a.m4159c(context)) {
            PendingIntent activity = PendingIntent.getActivity(context, 0, new Intent(context, (Class<?>) MainActivity.class), 0);
            C0109c.d dVarM255a = new C0109c.d(context).m254a(context.getString(R.string.is_running, context.getString(R.string.abc_action_bar_home_description))).m251a(R.drawable.ic_notification).m257b(context.getString(R.string.touch_to_open)).m256b(-1960480).m259c(-1).m255a(!z);
            if (z) {
                dVarM255a.m252a(R.drawable.ic_noti_action_resume, context.getString(R.string.noti_action_resume), m4140a(context, 1));
            } else {
                dVarM255a.m252a(R.drawable.ic_noti_action_pause, context.getString(R.string.noti_action_pause), m4140a(context, 0));
            }
            dVarM255a.m252a(R.drawable.ic_noti_action_stop, context.getString(R.string.noti_action_stop), m4140a(context, 2)).m253a(activity);
            ((NotificationManager) context.getSystemService("notification")).notify(1, dVarM255a.m250a());
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        switch (intent.getIntExtra("command", -1)) {
            case 0:
                m4142a(context, true);
                C1720b.m4162b(context);
                C1719a.m4154a(context, false);
                break;
            case 1:
                m4142a(context, false);
                C1719a.m4154a(context, true);
                if (!(Build.VERSION.SDK_INT >= 21)) {
                    List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) context.getSystemService("activity")).getRunningTasks(1);
                    C1720b.m4161a(context, runningTasks.get(0).topActivity.getPackageName() + "\n" + runningTasks.get(0).topActivity.getClassName());
                } else {
                    C1720b.m4161a(context, null);
                    context.startService(new Intent(context, (Class<?>) WatchingService.class));
                }
                break;
            case 2:
                C1720b.m4162b(context);
                C1719a.m4154a(context, false);
                m4141a(context);
                break;
        }
        context.sendBroadcast(new Intent("com.willme.topactivity.ACTION.UPDATE_TITLE"));
    }
}
