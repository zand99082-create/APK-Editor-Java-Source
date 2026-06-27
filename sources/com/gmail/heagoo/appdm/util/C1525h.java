package com.gmail.heagoo.appdm.util;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: renamed from: com.gmail.heagoo.appdm.util.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1525h {

    /* JADX INFO: renamed from: a */
    private static String[] f4585a = {"com.gmail.heagoo.pmaster.pro", "com.gmail.heagoo.apkpermremover.pro", "com.gmail.heagoo.apkeditor.pro", "com.gmail.heagoo.autorun.pro"};

    /* JADX INFO: renamed from: a */
    public static boolean m3722a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        for (int i = 0; i < f4585a.length; i++) {
            if (m3723a(packageManager, f4585a[i])) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m3723a(PackageManager packageManager, String str) {
        try {
            packageManager.getApplicationInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }
}
