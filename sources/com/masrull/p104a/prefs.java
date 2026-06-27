package com.masrull.p104a;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* JADX INFO: loaded from: classes.dex */
public class prefs {
    public static void clear() {
        getEditor().clear().commit();
    }

    public static boolean getBoolean(String str, boolean z) {
        return getPreferences().getBoolean(str, z);
    }

    public static SharedPreferences.Editor getEditor() {
        return getPreferences().edit();
    }

    public static float getFloat(String str, float f) {
        return getPreferences().getFloat(str, f);
    }

    public static int getInt(String str, int i) {
        return getPreferences().getInt(str, i);
    }

    public static SharedPreferences getPreferences() {
        return PreferenceManager.getDefaultSharedPreferences(Global.getContext());
    }

    public static String getString(String str, String str2) {
        return getPreferences().getString(str, str2);
    }

    public static void putBoolean(String str, boolean z) {
        getEditor().putBoolean(str, z).apply();
    }

    public static void putInt(String str, int i) {
        getEditor().putInt(str, i).apply();
    }

    public static void putString(String str, String str2) {
        getEditor().putString(str, str2).apply();
    }

    public static void remove(String str) {
        getEditor().remove(str).apply();
    }
}
