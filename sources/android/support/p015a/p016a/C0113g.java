package android.support.p015a.p016a;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.support.p015a.p016a.C0120n;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: android.support.a.a.g */
/* JADX INFO: loaded from: classes2.dex */
@TargetApi(9)
public class C0113g {

    /* JADX INFO: renamed from: a */
    private static Method f325a;

    /* JADX INFO: renamed from: android.support.a.a.g$a */
    public static abstract class a {

        /* JADX INFO: renamed from: android.support.a.a.g$a$a, reason: collision with other inner class name */
        public interface InterfaceC1982a {
        }

        /* JADX INFO: renamed from: a */
        public abstract int mo241a();

        /* JADX INFO: renamed from: b */
        public abstract CharSequence mo242b();

        /* JADX INFO: renamed from: c */
        public abstract PendingIntent mo243c();

        /* JADX INFO: renamed from: d */
        public abstract Bundle mo244d();

        /* JADX INFO: renamed from: e */
        public abstract boolean mo245e();

        /* JADX INFO: renamed from: g */
        public abstract C0120n.a[] mo247g();
    }

    /* JADX INFO: renamed from: a */
    public static Notification m275a(Notification notification, Context context, CharSequence charSequence, CharSequence charSequence2, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        if (f325a == null) {
            try {
                f325a = Notification.class.getMethod("setLatestEventInfo", Context.class, CharSequence.class, CharSequence.class, PendingIntent.class);
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            f325a.invoke(notification, context, charSequence, charSequence2, pendingIntent);
            notification.fullScreenIntent = pendingIntent2;
            return notification;
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }
}
