package android.support.p015a.p016a;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.p015a.p016a.C0113g;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: android.support.a.a.f */
/* JADX INFO: loaded from: classes2.dex */
@TargetApi(24)
class C0112f {

    /* JADX INFO: renamed from: android.support.a.a.f$a */
    public static class a implements InterfaceC0107a, InterfaceC0108b {

        /* JADX INFO: renamed from: a */
        private Notification.Builder f324a;

        public a(Context context, Notification notification, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RemoteViews remoteViews, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, CharSequence charSequence4, boolean z4, String str, ArrayList<String> arrayList, Bundle bundle, int i5, int i6, Notification notification2, String str2, boolean z5, String str3, CharSequence[] charSequenceArr, RemoteViews remoteViews2, RemoteViews remoteViews3, RemoteViews remoteViews4) {
            this.f324a = new Notification.Builder(context).setWhen(notification.when).setShowWhen(z2).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteViews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(charSequence).setContentText(charSequence2).setSubText(charSequence4).setContentInfo(charSequence3).setContentIntent(pendingIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(pendingIntent2, (notification.flags & 128) != 0).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(z3).setPriority(i4).setProgress(i2, i3, z).setLocalOnly(z4).setExtras(bundle).setGroup(str2).setGroupSummary(z5).setSortKey(str3).setCategory(str).setColor(i5).setVisibility(i6).setPublicVersion(notification2).setRemoteInputHistory(charSequenceArr);
            if (remoteViews2 != null) {
                this.f324a.setCustomContentView(remoteViews2);
            }
            if (remoteViews3 != null) {
                this.f324a.setCustomBigContentView(remoteViews3);
            }
            if (remoteViews4 != null) {
                this.f324a.setCustomHeadsUpContentView(remoteViews4);
            }
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                this.f324a.addPerson(it.next());
            }
        }

        @Override // android.support.p015a.p016a.InterfaceC0108b
        /* JADX INFO: renamed from: a */
        public Notification.Builder mo236a() {
            return this.f324a;
        }

        @Override // android.support.p015a.p016a.InterfaceC0107a
        /* JADX INFO: renamed from: a */
        public void mo235a(C0113g.a aVar) {
            Notification.Action.Builder builder = new Notification.Action.Builder(aVar.mo241a(), aVar.mo242b(), aVar.mo243c());
            if (aVar.mo247g() != null) {
                for (RemoteInput remoteInput : C0119m.m289a(aVar.mo247g())) {
                    builder.addRemoteInput(remoteInput);
                }
            }
            Bundle bundle = aVar.mo244d() != null ? new Bundle(aVar.mo244d()) : new Bundle();
            bundle.putBoolean("android.support.allowGeneratedReplies", aVar.mo245e());
            builder.addExtras(bundle);
            builder.setAllowGeneratedReplies(aVar.mo245e());
            this.f324a.addAction(builder.build());
        }

        @Override // android.support.p015a.p016a.InterfaceC0108b
        /* JADX INFO: renamed from: b */
        public Notification mo237b() {
            return this.f324a.build();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m274a(InterfaceC0108b interfaceC0108b, CharSequence charSequence, CharSequence charSequence2, List<CharSequence> list, List<Long> list2, List<CharSequence> list3, List<String> list4, List<Uri> list5) {
        Notification.MessagingStyle conversationTitle = new Notification.MessagingStyle(charSequence).setConversationTitle(charSequence2);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= list.size()) {
                conversationTitle.setBuilder(interfaceC0108b.mo236a());
                return;
            }
            Notification.MessagingStyle.Message message = new Notification.MessagingStyle.Message(list.get(i2), list2.get(i2).longValue(), list3.get(i2));
            if (list4.get(i2) != null) {
                message.setData(list4.get(i2), list5.get(i2));
            }
            conversationTitle.addMessage(message);
            i = i2 + 1;
        }
    }
}
