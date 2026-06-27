package com.rull.mod;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Process;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.gmail.heagoo.apkeditor.gzd;
import com.gmail.heagoo.apkeditor.pro.R;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Objects;
import p000a.p001a.p003b.p004a.C0037k;

/* JADX INFO: loaded from: classes.dex */
public class Preference extends PreferenceActivity implements Preference.OnPreferenceClickListener {
    public static SharedPreferences deltasettings;
    MenuItem alertdialogku;
    private View bundle;
    PreferenceManager manager;
    MenuItem rulls;
    Menu rullss;

    public static void Restart() {
        Process.killProcess(Process.myPid());
    }

    public int getID(String str, String str2) {
        return getBaseContext().getResources().getIdentifier(str, str2, getBaseContext().getPackageName());
    }

    public static void CreateFolder() {
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            for (int i = 0; i <= 2; i++) {
                if (i == 0) {
                    new File(new StringBuffer().append(externalStorageDirectory).append("/ApkEditor").toString()).mkdir();
                } else if (i == 1) {
                    new File(new StringBuffer().append(externalStorageDirectory).append("/ApkEditor/backup").toString()).mkdir();
                }
            }
        } catch (Exception e) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00fd  */
    @SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String getPath(Context context, Uri uri) throws URISyntaxException {
        String[] strArr;
        String str;
        Uri uriWithAppendedId;
        String string = null;
        int i = Build.VERSION.SDK_INT;
        String str2 = (String) null;
        String[] strArr2 = (String[]) null;
        if (!DocumentsContract.isDocumentUri(context.getApplicationContext(), uri)) {
            strArr = strArr2;
            str = str2;
            uriWithAppendedId = uri;
        } else {
            if (isExternalStorageDocument(uri)) {
                return new StringBuffer().append(new StringBuffer().append(Environment.getExternalStorageDirectory()).append("/").toString()).append(DocumentsContract.getDocumentId(uri).split(":")[1]).toString();
            }
            if (isDownloadsDocument(uri)) {
                strArr = strArr2;
                str = str2;
                uriWithAppendedId = ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(DocumentsContract.getDocumentId(uri)).longValue());
            } else if (isMediaDocument(uri)) {
                String[] strArrSplit = DocumentsContract.getDocumentId(uri).split(":");
                String str3 = strArrSplit[0];
                if ("image".equals(str3)) {
                    uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                } else if ("video".equals(str3)) {
                    uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                } else if ("audio".equals(str3)) {
                    uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                }
                strArr = new String[]{strArrSplit[1]};
                str = "_id=?";
                uriWithAppendedId = uri;
            }
        }
        if (!gzd.COLUMN_CONTENT.equalsIgnoreCase(uriWithAppendedId.getScheme())) {
            if ("file".equalsIgnoreCase(uriWithAppendedId.getScheme())) {
                return uriWithAppendedId.getPath();
            }
            return (String) null;
        }
        try {
            Cursor cursorQuery = context.getContentResolver().query(uriWithAppendedId, new String[]{"_data"}, str, strArr, (String) null);
            int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_data");
            if (cursorQuery.moveToFirst()) {
                string = cursorQuery.getString(columnIndexOrThrow);
            } else {
                string = (String) null;
            }
            return string;
        } catch (Exception e) {
            return string;
        }
    }

    public static boolean isDownloadsDocument(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    public static boolean isExternalStorageDocument(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    public static boolean isMediaDocument(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    public final void copyFile(String str, String str2, boolean z) {
        try {
            File file = new File(str);
            if (z && !new File(str2).exists()) {
                CreateFolder();
            }
            File file2 = new File(str2);
            FileInputStream fileInputStream = new FileInputStream(file);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            byte[] bArr = new byte[1024];
            while (true) {
                int i = fileInputStream.read(bArr);
                if (i <= 0) {
                    fileInputStream.close();
                    fileOutputStream.close();
                    Toast.makeText(this, "Succes", 0).show();
                    return;
                }
                fileOutputStream.write(bArr, 0, i);
            }
        } catch (FileNotFoundException e) {
            Toast.makeText(this, e.getLocalizedMessage(), 1).show();
        } catch (IOException e2) {
            Toast.makeText(this, e2.getLocalizedMessage(), 1).show();
        }
    }

    @Override // android.preference.PreferenceActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            String path = (String) null;
            try {
                path = getPath(this, intent.getData());
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
            Toast.makeText(this, new File(path).getAbsolutePath(), 1).show();
            try {
                copyFile(path, new File(Environment.getDataDirectory(), new StringBuffer().append(new StringBuffer().append("data/").append(getPackageName()).toString()).append("/shared_prefs/com.gmail.heagoo.apkeditor.pro_preferences.xml").toString()).getAbsolutePath(), false);
            } catch (Exception e2) {
                Toast.makeText(this, e2.getMessage(), 1).show();
            }
        }
    }

    @Override // android.preference.PreferenceActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        setTheme(C0037k.m91md(C0037k.m89a(this)));
        super.onCreate(bundle);
        deltasettings = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        addPreferencesFromResource(getID("rull", "xml"));
        ActionBar actionBar = getActionBar();
        this.bundle = getLayoutInflater().inflate(R.layout.mtrl_toolbar, (ViewGroup) null);
        ActionBar.LayoutParams layoutParams = new ActionBar.LayoutParams(-2, -1, 17);
        ((TextView) this.bundle.findViewById(android.R.id.title)).setText(R.string.additional_setting);
        actionBar.setCustomView(this.bundle, layoutParams);
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(true);
        this.manager = getPreferenceManager();
        ((android.preference.Preference) Objects.requireNonNull(this.manager.findPreference("save_temp"))).setOnPreferenceClickListener(this);
        ((android.preference.Preference) Objects.requireNonNull(this.manager.findPreference("load_pref_file"))).setOnPreferenceClickListener(this);
        ((android.preference.Preference) Objects.requireNonNull(this.manager.findPreference("clear_pref_file"))).setOnPreferenceClickListener(this);
    }

    public int rulls(String str, String str2) {
        return getBaseContext().getResources().getIdentifier(str, str2, getBaseContext().getPackageName());
    }

    @Override // android.preference.Preference.OnPreferenceClickListener
    public boolean onPreferenceClick(android.preference.Preference preference) {
        if (!preference.getKey().equals("save_temp")) {
            if (preference.getKey().equals("load_pref_file")) {
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.setType("*/*");
                startActivityForResult(intent, 0);
                return true;
            }
            if (!preference.getKey().equals("clear_pref_file")) {
                return false;
            }
            this.manager.getSharedPreferences().edit().clear().apply();
            Toast.makeText(this, "Reset!", 1).show();
            return true;
        }
        CreateFolder();
        copyFile(new File(Environment.getDataDirectory(), new StringBuffer().append(new StringBuffer().append("data/").append(getPackageName()).toString()).append("/shared_prefs/com.gmail.heagoo.apkeditor.pro_preferences.xml").toString()).getAbsolutePath(), new File(new StringBuffer().append(Environment.getExternalStorageDirectory().getAbsolutePath()).append("/ApkEditor/backup").toString(), "setting.backup").getAbsolutePath(), true);
        return true;
    }
}
