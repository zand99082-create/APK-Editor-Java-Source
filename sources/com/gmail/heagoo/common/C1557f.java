package com.gmail.heagoo.common;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;

/* JADX INFO: renamed from: com.gmail.heagoo.common.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1557f {

    /* JADX INFO: renamed from: a */
    private static int f4636a = 0;

    /* JADX INFO: renamed from: b */
    private static int f4637b = 0;

    /* JADX INFO: renamed from: a */
    public static int m3763a(Activity activity) {
        if (f4636a <= 0) {
            m3766c(activity);
        }
        return f4636a;
    }

    /* JADX INFO: renamed from: a */
    public static int m3764a(Context context, float f) {
        return (int) ((context.getResources().getDisplayMetrics().density * f) + 0.5f);
    }

    /* JADX INFO: renamed from: b */
    public static int m3765b(Activity activity) {
        if (f4637b <= 0) {
            m3766c(activity);
        }
        return f4637b;
    }

    /* JADX INFO: renamed from: c */
    private static void m3766c(Activity activity) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        f4636a = displayMetrics.widthPixels;
        f4637b = displayMetrics.heightPixels;
    }
}
