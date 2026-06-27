package com.gmail.heagoo.apkeditor.installer;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class ApkInstaller {
    public static void installApplication(Context context, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(uriFromFile(context, new File(str)), "application/vnd.android.package-archive");
        intent.addFlags(268435456);
        intent.addFlags(1);
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            Log.e("ApkInstaller", "Error in opening the file!");
        }
    }

    private static Uri uriFromFile(Context context, File file) {
        return Build.VERSION.SDK_INT >= 24 ? FileProvider.getUriForFile(context, "com.gmail.heagoo.apkeditor.pro.fileprovider", file) : Uri.fromFile(file);
    }
}
