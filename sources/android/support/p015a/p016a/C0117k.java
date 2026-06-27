package android.support.p015a.p016a;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.p015a.p016a.C0113g;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationCompatExtras;
import android.support.v4.app.NotificationManagerCompat;
import android.util.SparseArray;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: android.support.a.a.k */
/* JADX INFO: loaded from: classes2.dex */
@TargetApi(19)
class C0117k {

    /* JADX INFO: renamed from: android.support.a.a.k$a */
    public static class a implements InterfaceC0107a, InterfaceC0108b {

        /* JADX INFO: renamed from: a */
        private Notification.Builder f336a;

        /* JADX INFO: renamed from: b */
        private Bundle f337b;

        /* JADX INFO: renamed from: c */
        private List<Bundle> f338c = new ArrayList();

        /* JADX INFO: renamed from: d */
        private RemoteViews f339d;

        /* JADX INFO: renamed from: e */
        private RemoteViews f340e;

        public a(Context context, Notification notification, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RemoteViews remoteViews, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, CharSequence charSequence4, boolean z4, ArrayList<String> arrayList, Bundle bundle, String str, boolean z5, String str2, RemoteViews remoteViews2, RemoteViews remoteViews3) {
            this.f336a = new Notification.Builder(context).setWhen(notification.when).setShowWhen(z2).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteViews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(charSequence).setContentText(charSequence2).setSubText(charSequence4).setContentInfo(charSequence3).setContentIntent(pendingIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(pendingIntent2, (notification.flags & 128) != 0).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(z3).setPriority(i4).setProgress(i2, i3, z);
            this.f337b = new Bundle();
            if (bundle != null) {
                this.f337b.putAll(bundle);
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                this.f337b.putStringArray(NotificationCompat.EXTRA_PEOPLE, (String[]) arrayList.toArray(new String[arrayList.size()]));
            }
            if (z4) {
                this.f337b.putBoolean(NotificationCompatExtras.EXTRA_LOCAL_ONLY, true);
            }
            if (str != null) {
                this.f337b.putString(NotificationCompatExtras.EXTRA_GROUP_KEY, str);
                if (z5) {
                    this.f337b.putBoolean(NotificationCompatExtras.EXTRA_GROUP_SUMMARY, true);
                } else {
                    this.f337b.putBoolean(NotificationManagerCompat.EXTRA_USE_SIDE_CHANNEL, true);
                }
            }
            if (str2 != null) {
                this.f337b.putString(NotificationCompatExtras.EXTRA_SORT_KEY, str2);
            }
            this.f339d = remoteViews2;
            this.f340e = remoteViews3;
        }

        @Override // android.support.p015a.p016a.InterfaceC0108b
        /* JADX INFO: renamed from: a */
        public Notification.Builder mo236a() {
            return this.f336a;
        }

        @Override // android.support.p015a.p016a.InterfaceC0107a
        /* JADX INFO: renamed from: a */
        public void mo235a(C0113g.a aVar) {
            this.f338c.add(C0116j.m277a(this.f336a, aVar));
        }

        @Override // android.support.p015a.p016a.InterfaceC0108b
        /* JADX INFO: renamed from: b */
        public Notification mo237b() {
            SparseArray<Bundle> sparseArrayM279a = C0116j.m279a(this.f338c);
            if (sparseArrayM279a != null) {
                this.f337b.putSparseParcelableArray(NotificationCompatExtras.EXTRA_ACTION_EXTRAS, sparseArrayM279a);
            }
            this.f336a.setExtras(this.f337b);
            Notification notificationBuild = this.f336a.build();
            if (this.f339d != null) {
                notificationBuild.contentView = this.f339d;
            }
            if (this.f340e != null) {
                notificationBuild.bigContentView = this.f340e;
            }
            return notificationBuild;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m283a(Notification notification) {
        return notification.extras;
    }
}
