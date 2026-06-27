package android.support.p015a.p016a;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.p015a.p016a.C0113g;
import android.support.v4.app.NotificationCompatExtras;
import android.support.v4.app.NotificationCompatJellybean;
import android.support.v4.app.NotificationManagerCompat;
import android.util.Log;
import android.util.SparseArray;
import android.widget.RemoteViews;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: android.support.a.a.j */
/* JADX INFO: loaded from: classes2.dex */
@TargetApi(16)
class C0116j {

    /* JADX INFO: renamed from: b */
    private static Field f328b;

    /* JADX INFO: renamed from: c */
    private static boolean f329c;

    /* JADX INFO: renamed from: a */
    private static final Object f327a = new Object();

    /* JADX INFO: renamed from: d */
    private static final Object f330d = new Object();

    /* JADX INFO: renamed from: android.support.a.a.j$a */
    public static class a implements InterfaceC0107a, InterfaceC0108b {

        /* JADX INFO: renamed from: a */
        private Notification.Builder f331a;

        /* JADX INFO: renamed from: b */
        private final Bundle f332b;

        /* JADX INFO: renamed from: c */
        private List<Bundle> f333c = new ArrayList();

        /* JADX INFO: renamed from: d */
        private RemoteViews f334d;

        /* JADX INFO: renamed from: e */
        private RemoteViews f335e;

        public a(Context context, Notification notification, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RemoteViews remoteViews, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap, int i2, int i3, boolean z, boolean z2, int i4, CharSequence charSequence4, boolean z3, Bundle bundle, String str, boolean z4, String str2, RemoteViews remoteViews2, RemoteViews remoteViews3) {
            this.f331a = new Notification.Builder(context).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteViews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(charSequence).setContentText(charSequence2).setSubText(charSequence4).setContentInfo(charSequence3).setContentIntent(pendingIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(pendingIntent2, (notification.flags & 128) != 0).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(z2).setPriority(i4).setProgress(i2, i3, z);
            this.f332b = new Bundle();
            if (bundle != null) {
                this.f332b.putAll(bundle);
            }
            if (z3) {
                this.f332b.putBoolean(NotificationCompatExtras.EXTRA_LOCAL_ONLY, true);
            }
            if (str != null) {
                this.f332b.putString(NotificationCompatExtras.EXTRA_GROUP_KEY, str);
                if (z4) {
                    this.f332b.putBoolean(NotificationCompatExtras.EXTRA_GROUP_SUMMARY, true);
                } else {
                    this.f332b.putBoolean(NotificationManagerCompat.EXTRA_USE_SIDE_CHANNEL, true);
                }
            }
            if (str2 != null) {
                this.f332b.putString(NotificationCompatExtras.EXTRA_SORT_KEY, str2);
            }
            this.f334d = remoteViews2;
            this.f335e = remoteViews3;
        }

        @Override // android.support.p015a.p016a.InterfaceC0108b
        /* JADX INFO: renamed from: a */
        public Notification.Builder mo236a() {
            return this.f331a;
        }

        @Override // android.support.p015a.p016a.InterfaceC0107a
        /* JADX INFO: renamed from: a */
        public void mo235a(C0113g.a aVar) {
            this.f333c.add(C0116j.m277a(this.f331a, aVar));
        }

        @Override // android.support.p015a.p016a.InterfaceC0108b
        /* JADX INFO: renamed from: b */
        public Notification mo237b() {
            Notification notificationBuild = this.f331a.build();
            Bundle bundleM278a = C0116j.m278a(notificationBuild);
            Bundle bundle = new Bundle(this.f332b);
            for (String str : this.f332b.keySet()) {
                if (bundleM278a.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            bundleM278a.putAll(bundle);
            SparseArray<Bundle> sparseArrayM279a = C0116j.m279a(this.f333c);
            if (sparseArrayM279a != null) {
                C0116j.m278a(notificationBuild).putSparseParcelableArray(NotificationCompatExtras.EXTRA_ACTION_EXTRAS, sparseArrayM279a);
            }
            if (this.f334d != null) {
                notificationBuild.contentView = this.f334d;
            }
            if (this.f335e != null) {
                notificationBuild.bigContentView = this.f335e;
            }
            return notificationBuild;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m277a(Notification.Builder builder, C0113g.a aVar) {
        builder.addAction(aVar.mo241a(), aVar.mo242b(), aVar.mo243c());
        Bundle bundle = new Bundle(aVar.mo244d());
        if (aVar.mo247g() != null) {
            bundle.putParcelableArray(NotificationCompatExtras.EXTRA_REMOTE_INPUTS, C0121o.m291a(aVar.mo247g()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.mo245e());
        return bundle;
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m278a(Notification notification) {
        synchronized (f327a) {
            if (f329c) {
                return null;
            }
            try {
                if (f328b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e(NotificationCompatJellybean.TAG, "Notification.extras field is not of type Bundle");
                        f329c = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f328b = declaredField;
                }
                Bundle bundle = (Bundle) f328b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f328b.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e) {
                Log.e(NotificationCompatJellybean.TAG, "Unable to access notification extras", e);
                f329c = true;
                return null;
            } catch (NoSuchFieldException e2) {
                Log.e(NotificationCompatJellybean.TAG, "Unable to access notification extras", e2);
                f329c = true;
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static SparseArray<Bundle> m279a(List<Bundle> list) {
        SparseArray<Bundle> sparseArray = null;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Bundle bundle = list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    /* JADX INFO: renamed from: a */
    public static void m280a(InterfaceC0108b interfaceC0108b, CharSequence charSequence, boolean z, CharSequence charSequence2, Bitmap bitmap, Bitmap bitmap2, boolean z2) {
        Notification.BigPictureStyle bigPictureStyleBigPicture = new Notification.BigPictureStyle(interfaceC0108b.mo236a()).setBigContentTitle(charSequence).bigPicture(bitmap);
        if (z2) {
            bigPictureStyleBigPicture.bigLargeIcon(bitmap2);
        }
        if (z) {
            bigPictureStyleBigPicture.setSummaryText(charSequence2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m281a(InterfaceC0108b interfaceC0108b, CharSequence charSequence, boolean z, CharSequence charSequence2, CharSequence charSequence3) {
        Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(interfaceC0108b.mo236a()).setBigContentTitle(charSequence).bigText(charSequence3);
        if (z) {
            bigTextStyleBigText.setSummaryText(charSequence2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m282a(InterfaceC0108b interfaceC0108b, CharSequence charSequence, boolean z, CharSequence charSequence2, ArrayList<CharSequence> arrayList) {
        Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(interfaceC0108b.mo236a()).setBigContentTitle(charSequence);
        if (z) {
            bigContentTitle.setSummaryText(charSequence2);
        }
        Iterator<CharSequence> it = arrayList.iterator();
        while (it.hasNext()) {
            bigContentTitle.addLine(it.next());
        }
    }
}
