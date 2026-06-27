package android.support.p015a.p016a;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.p015a.p016a.C0113g;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: android.support.a.a.e */
/* JADX INFO: loaded from: classes2.dex */
@TargetApi(21)
class C0111e {

    /* JADX INFO: renamed from: android.support.a.a.e$a */
    public static class a implements InterfaceC0107a, InterfaceC0108b {

        /* JADX INFO: renamed from: a */
        private Notification.Builder f319a;

        /* JADX INFO: renamed from: b */
        private Bundle f320b;

        /* JADX INFO: renamed from: c */
        private RemoteViews f321c;

        /* JADX INFO: renamed from: d */
        private RemoteViews f322d;

        /* JADX INFO: renamed from: e */
        private RemoteViews f323e;

        public a(Context context, Notification notification, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RemoteViews remoteViews, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, CharSequence charSequence4, boolean z4, String str, ArrayList<String> arrayList, Bundle bundle, int i5, int i6, Notification notification2, String str2, boolean z5, String str3, RemoteViews remoteViews2, RemoteViews remoteViews3, RemoteViews remoteViews4) {
            this.f319a = new Notification.Builder(context).setWhen(notification.when).setShowWhen(z2).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteViews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(charSequence).setContentText(charSequence2).setSubText(charSequence4).setContentInfo(charSequence3).setContentIntent(pendingIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(pendingIntent2, (notification.flags & 128) != 0).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(z3).setPriority(i4).setProgress(i2, i3, z).setLocalOnly(z4).setGroup(str2).setGroupSummary(z5).setSortKey(str3).setCategory(str).setColor(i5).setVisibility(i6).setPublicVersion(notification2);
            this.f320b = new Bundle();
            if (bundle != null) {
                this.f320b.putAll(bundle);
            }
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                this.f319a.addPerson(it.next());
            }
            this.f321c = remoteViews2;
            this.f322d = remoteViews3;
            this.f323e = remoteViews4;
        }

        @Override // android.support.p015a.p016a.InterfaceC0108b
        /* JADX INFO: renamed from: a */
        public Notification.Builder mo236a() {
            return this.f319a;
        }

        @Override // android.support.p015a.p016a.InterfaceC0107a
        /* JADX INFO: renamed from: a */
        public void mo235a(C0113g.a aVar) {
            C0110d.m273a(this.f319a, aVar);
        }

        @Override // android.support.p015a.p016a.InterfaceC0108b
        /* JADX INFO: renamed from: b */
        public Notification mo237b() {
            this.f319a.setExtras(this.f320b);
            Notification notificationBuild = this.f319a.build();
            if (this.f321c != null) {
                notificationBuild.contentView = this.f321c;
            }
            if (this.f322d != null) {
                notificationBuild.bigContentView = this.f322d;
            }
            if (this.f323e != null) {
                notificationBuild.headsUpContentView = this.f323e;
            }
            return notificationBuild;
        }
    }
}
