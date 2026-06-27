package com.willme.topactivity;

import android.content.Context;
import android.preference.PreferenceManager;

/* JADX INFO: renamed from: com.willme.topactivity.a */
/* JADX INFO: loaded from: classes2.dex */
public class C1719a {
    /* JADX INFO: renamed from: a */
    public static void m4154a(Context context, boolean z) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("is_show_window", z).apply();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m4155a(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("is_show_window", true);
    }

    /* JADX INFO: renamed from: b */
    public static void m4156b(Context context, boolean z) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("has_qs_tile_added", z).apply();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m4157b(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("has_qs_tile_added", false);
    }

    /* JADX INFO: renamed from: c */
    public static void m4158c(Context context, boolean z) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("is_noti_toggle_enabled", z).apply();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m4159c(Context context) {
        if (m4157b(context)) {
            return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("is_noti_toggle_enabled", true);
        }
        return true;
    }
}
