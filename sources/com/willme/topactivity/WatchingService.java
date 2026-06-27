package com.willme.topactivity;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.app.usage.UsageEvents;
import android.app.usage.UsageStatsManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.SystemClock;
import android.support.v4.app.NotificationCompat;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes2.dex */
public class WatchingService extends Service {

    /* JADX INFO: renamed from: a */
    public static boolean f5145a = false;

    /* JADX INFO: renamed from: c */
    private ActivityManager f5147c;

    /* JADX INFO: renamed from: d */
    private Object f5148d;

    /* JADX INFO: renamed from: f */
    private Timer f5150f;

    /* JADX INFO: renamed from: b */
    private Handler f5146b = new Handler();

    /* JADX INFO: renamed from: e */
    private String f5149e = null;

    /* JADX INFO: renamed from: g */
    private final int f5151g = 1;

    /* JADX INFO: renamed from: h */
    private boolean f5152h = true;

    /* JADX INFO: renamed from: com.willme.topactivity.WatchingService$a */
    class C1718a extends TimerTask {
        C1718a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (!C1719a.m4155a(WatchingService.this)) {
                WatchingService.this.f5150f.cancel();
                WatchingService.this.stopSelf();
            }
            String strM4146a = WatchingService.this.m4146a();
            if (strM4146a != null) {
                if (!strM4146a.equals(WatchingService.this.f5149e) || WatchingService.this.f5152h) {
                    WatchingService.this.f5152h = false;
                    WatchingService.this.f5149e = strM4146a;
                    if (C1719a.m4155a(WatchingService.this)) {
                        WatchingService.this.f5146b.post(new Runnable() { // from class: com.willme.topactivity.WatchingService.a.1
                            @Override // java.lang.Runnable
                            public void run() {
                                C1720b.m4161a(WatchingService.this, WatchingService.this.f5149e);
                            }
                        });
                    } else {
                        WatchingService.this.stopSelf();
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public String m4146a() {
        if (Build.VERSION.SDK_INT < 21) {
            List<ActivityManager.RunningTaskInfo> runningTasks = this.f5147c.getRunningTasks(1);
            return runningTasks.get(0).topActivity.getPackageName() + "\n" + runningTasks.get(0).topActivity.getClassName();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        UsageEvents usageEventsQueryEvents = ((UsageStatsManager) this.f5148d).queryEvents(jCurrentTimeMillis - ((long) (this.f5152h ? 600000 : 60000)), jCurrentTimeMillis);
        String className = null;
        String packageName = null;
        while (usageEventsQueryEvents.hasNextEvent()) {
            UsageEvents.Event event = new UsageEvents.Event();
            usageEventsQueryEvents.getNextEvent(event);
            switch (event.getEventType()) {
                case 1:
                    packageName = event.getPackageName();
                    className = event.getClassName();
                    break;
                case 2:
                    if (event.getPackageName().equals(packageName)) {
                        packageName = null;
                    }
                    break;
            }
        }
        if (packageName != null) {
            return packageName + "\n" + className;
        }
        return null;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        f5145a = true;
        this.f5147c = (ActivityManager) getSystemService("activity");
        if (Build.VERSION.SDK_INT >= 21) {
            this.f5148d = getSystemService("usagestats");
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        f5145a = false;
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (this.f5150f == null) {
            this.f5150f = new Timer();
            this.f5150f.scheduleAtFixedRate(new C1718a(), 0L, 500L);
        }
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.Service
    @TargetApi(14)
    public void onTaskRemoved(Intent intent) {
        Intent intent2 = new Intent(getApplicationContext(), getClass());
        intent2.setPackage(getPackageName());
        ((AlarmManager) getApplicationContext().getSystemService(NotificationCompat.CATEGORY_ALARM)).set(3, SystemClock.elapsedRealtime() + 500, PendingIntent.getService(getApplicationContext(), 1, intent2, 1073741824));
        super.onTaskRemoved(intent);
    }
}
