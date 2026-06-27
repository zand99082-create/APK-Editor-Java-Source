package com.gmail.heagoo.appdm.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Environment;
import android.support.v4.media.session.PlaybackStateCompat;
import java.io.File;

/* JADX INFO: renamed from: com.gmail.heagoo.appdm.util.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1526i {

    /* JADX INFO: renamed from: a */
    private static String f4586a = null;

    @SuppressLint({"DefaultLocale"})
    /* JADX INFO: renamed from: a */
    public static String m3724a(long j) {
        return j >= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED ? String.format("%.2f M", Float.valueOf(((j * 1.0f) / 1024.0f) / 1024.0f)) : j >= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID ? String.format("%.2f K", Float.valueOf((j * 1.0f) / 1024.0f)) : j + " B";
    }

    /* JADX INFO: renamed from: a */
    public static String m3725a(Context context) {
        m3728c(context);
        String str = Environment.getExternalStorageDirectory().getPath() + "/" + f4586a + "/backups";
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3726a() {
        return Environment.getExternalStorageState().equals("mounted");
    }

    /* JADX INFO: renamed from: b */
    public static String m3727b(Context context) {
        m3728c(context);
        String str = Environment.getExternalStorageDirectory().getPath() + "/" + f4586a + "/temp";
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str;
    }

    /* JADX INFO: renamed from: c */
    private static void m3728c(Context context) {
        if (f4586a != null) {
            return;
        }
        try {
            f4586a = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString("heagoo.sdcard_folder");
        } catch (PackageManager.NameNotFoundException e) {
        }
    }
}
