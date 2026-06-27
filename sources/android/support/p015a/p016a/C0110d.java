package android.support.p015a.p016a;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.p015a.p016a.C0113g;
import android.support.v4.app.NotificationCompat;
import android.widget.RemoteViews;
import java.util.ArrayList;

/* JADX INFO: renamed from: android.support.a.a.d */
/* JADX INFO: loaded from: classes2.dex */
@TargetApi(20)
class C0110d {

    /* JADX INFO: renamed from: android.support.a.a.d$a */
    public static class a implements InterfaceC0107a, InterfaceC0108b {

        /* JADX INFO: renamed from: a */
        private Notification.Builder f315a;

        /* JADX INFO: renamed from: b */
        private Bundle f316b;

        /* JADX INFO: renamed from: c */
        private RemoteViews f317c;

        /* JADX INFO: renamed from: d */
        private RemoteViews f318d;

        public a(Context context, Notification notification, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RemoteViews remoteViews, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, CharSequence charSequence4, boolean z4, ArrayList<String> arrayList, Bundle bundle, String str, boolean z5, String str2, RemoteViews remoteViews2, RemoteViews remoteViews3) {
            this.f315a = new Notification.Builder(context).setWhen(notification.when).setShowWhen(z2).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteViews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(charSequence).setContentText(charSequence2).setSubText(charSequence4).setContentInfo(charSequence3).setContentIntent(pendingIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(pendingIntent2, (notification.flags & 128) != 0).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(z3).setPriority(i4).setProgress(i2, i3, z).setLocalOnly(z4).setGroup(str).setGroupSummary(z5).setSortKey(str2);
            this.f316b = new Bundle();
            if (bundle != null) {
                this.f316b.putAll(bundle);
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                this.f316b.putStringArray(NotificationCompat.EXTRA_PEOPLE, (String[]) arrayList.toArray(new String[arrayList.size()]));
            }
            this.f317c = remoteViews2;
            this.f318d = remoteViews3;
        }

        @Override // android.support.p015a.p016a.InterfaceC0108b
        /* JADX INFO: renamed from: a */
        public Notification.Builder mo236a() {
            return this.f315a;
        }

        @Override // android.support.p015a.p016a.InterfaceC0107a
        /* JADX INFO: renamed from: a */
        public void mo235a(C0113g.a aVar) {
            C0110d.m273a(this.f315a, aVar);
        }

        @Override // android.support.p015a.p016a.InterfaceC0108b
        /* JADX INFO: renamed from: b */
        public Notification mo237b() {
            this.f315a.setExtras(this.f316b);
            Notification notificationBuild = this.f315a.build();
            if (this.f317c != null) {
                notificationBuild.contentView = this.f317c;
            }
            if (this.f318d != null) {
                notificationBuild.bigContentView = this.f318d;
            }
            return notificationBuild;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m273a(Notification.Builder builder, C0113g.a aVar) {
        Notification.Action.Builder builder2 = new Notification.Action.Builder(aVar.mo241a(), aVar.mo242b(), aVar.mo243c());
        if (aVar.mo247g() != null) {
            for (RemoteInput remoteInput : C0119m.m289a(aVar.mo247g())) {
                builder2.addRemoteInput(remoteInput);
            }
        }
        Bundle bundle = aVar.mo244d() != null ? new Bundle(aVar.mo244d()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.mo245e());
        builder2.addExtras(bundle);
        builder.addAction(builder2.build());
    }
}
