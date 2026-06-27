package com.masrull.listview;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.masrull.p104a.Global;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class Prefs {
    public static void checkForNullKey(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
    }

    public static void clear() {
        getEditor().clear().commit();
    }

    public static void clearPriv() {
        getEditorPriv().clear().commit();
    }

    public static boolean getBoolean(String str) {
        return getPreferences().getBoolean(str, false);
    }

    public static boolean getBoolean(String str, boolean z) {
        return getPreferences().getBoolean(str, z);
    }

    public static boolean getBooleanPriv(String str) {
        return getPreferencesPriv().getBoolean(str, false);
    }

    public static boolean getBooleanPriv(String str, boolean z) {
        return getPreferencesPriv().getBoolean(str, z);
    }

    public static boolean getDefaultBoolean(Context context, String str) {
        return context.getSharedPreferences(getDefaultPrefName(), 0).getBoolean(str, false);
    }

    public static int getDefaultInt(Context context, String str, int i) {
        return context.getSharedPreferences(getDefaultPrefName(), 0).getInt(str, i);
    }

    public static String getDefaultPrefName() {
        return "com.gmail.heagoo.apkeditor.pro_preferences";
    }

    public static SharedPreferences.Editor getEditor() {
        return getPreferences().edit();
    }

    public static SharedPreferences.Editor getEditorPriv() {
        return getPreferencesPriv().edit();
    }

    public static float getFloat(String str, float f) {
        return getPreferences().getFloat(str, f);
    }

    public static float getFloatPriv(String str, float f) {
        return getPreferencesPriv().getFloat(str, f);
    }

    public static int getInt(String str, int i) {
        return getPreferences().getInt(str, i);
    }

    public static int getIntPriv(String str, int i) {
        return getPreferencesPriv().getInt(str, i);
    }

    public static ArrayList<Integer> getListInt(String str) {
        ArrayList arrayList = new ArrayList(Arrays.asList(TextUtils.split(getPreferences().getString(str, ""), ",")));
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(Integer.parseInt((String) it.next())));
        }
        return arrayList2;
    }

    public static ArrayList<String> getListString(String str) {
        return new ArrayList<>(Arrays.asList(TextUtils.split(getPreferences().getString(str, ""), ",")));
    }

    public static SharedPreferences getPreferences() {
        return PreferenceManager.getDefaultSharedPreferences(Global.getContext());
    }

    public static SharedPreferences getPreferencesPriv() {
        return PreferenceManager.getDefaultSharedPreferences(Global.getContext());
    }

    public static String getRECENT() {
        return "recent_color";
    }

    public static String getString(String str, String str2) {
        return getPreferences().getString(str, str2);
    }

    public static String getStringPriv(String str) {
        return getPreferencesPriv().getString(str, "");
    }

    public static String getStringPriv(String str, String str2) {
        return getPreferencesPriv().getString(str, str2);
    }

    public static void putBoolean(String str, boolean z) {
        getEditor().putBoolean(str, z).apply();
    }

    public static void putBooleanPriv(String str, boolean z) {
        getEditorPriv().putBoolean(str, z).apply();
    }

    public static void putInt(String str, int i) {
        getEditor().putInt(str, i).apply();
    }

    public static void putIntPriv(String str, int i) {
        getEditorPriv().putInt(str, i).apply();
    }

    public static void putListInt(String str, ArrayList<Integer> arrayList) {
        checkForNullKey(str);
        getPreferences().edit().putString(str, TextUtils.join(",", (Integer[]) arrayList.toArray(new Integer[arrayList.size()]))).apply();
    }

    public static void putListString(String str, ArrayList<String> arrayList) {
        checkForNullKey(str);
        getPreferences().edit().putString(str, TextUtils.join(",", (String[]) arrayList.toArray(new String[arrayList.size()]))).apply();
    }

    public static void putString(String str, String str2) {
        getEditor().putString(str, str2).apply();
    }

    public static void putStringPriv(String str, String str2) {
        getEditorPriv().putString(str, str2).apply();
    }

    public static void remove(String str) {
        getEditor().remove(str).apply();
    }

    public static void removePriv(String str) {
        getEditorPriv().remove(str).apply();
    }

    public static void resetPrefs(String str, String str2) {
        SharedPreferences.Editor editorEdit = Global.getContext().getSharedPreferences(str, 0).edit();
        editorEdit.remove(str2);
        editorEdit.apply();
    }
}
