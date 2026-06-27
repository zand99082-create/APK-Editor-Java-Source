package android.support.p015a.p016a;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.RemoteViews;

/* JADX INFO: renamed from: android.support.a.a.i */
/* JADX INFO: loaded from: classes2.dex */
@TargetApi(14)
class C0115i {

    /* JADX INFO: renamed from: android.support.a.a.i$a */
    public static class a implements InterfaceC0108b {

        /* JADX INFO: renamed from: a */
        private Notification.Builder f326a;

        public a(Context context, Notification notification, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RemoteViews remoteViews, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap, int i2, int i3, boolean z) {
            this.f326a = new Notification.Builder(context).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteViews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(charSequence).setContentText(charSequence2).setContentInfo(charSequence3).setContentIntent(pendingIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(pendingIntent2, (notification.flags & 128) != 0).setLargeIcon(bitmap).setNumber(i).setProgress(i2, i3, z);
        }

        @Override // android.support.p015a.p016a.InterfaceC0108b
        /* JADX INFO: renamed from: a */
        public Notification.Builder mo236a() {
            return this.f326a;
        }

        @Override // android.support.p015a.p016a.InterfaceC0108b
        /* JADX INFO: renamed from: b */
        public Notification mo237b() {
            return this.f326a.getNotification();
        }
    }
}
