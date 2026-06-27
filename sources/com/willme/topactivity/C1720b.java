package com.willme.topactivity;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.gmail.heagoo.apkeditor.pro.R;

/* JADX INFO: renamed from: com.willme.topactivity.b */
/* JADX INFO: loaded from: classes2.dex */
public class C1720b {

    /* JADX INFO: renamed from: a */
    private static WindowManager.LayoutParams f5155a;

    /* JADX INFO: renamed from: b */
    private static WindowManager f5156b;

    /* JADX INFO: renamed from: c */
    private static View f5157c;

    /* JADX INFO: renamed from: a */
    public static void m4160a(Context context) {
        f5156b = (WindowManager) context.getApplicationContext().getSystemService("window");
        f5155a = new WindowManager.LayoutParams(-2, -2, Build.VERSION.SDK_INT <= 24 ? 2005 : Build.VERSION.SDK_INT < 26 ? 2002 : 2038, 24, -3);
        f5155a.gravity = 51;
        f5157c = LayoutInflater.from(context).inflate(R.layout.window_tasks, (ViewGroup) null);
    }

    /* JADX INFO: renamed from: a */
    public static void m4161a(Context context, String str) {
        if (f5156b == null) {
            m4160a(context);
        }
        ((TextView) f5157c.findViewById(R.id.teks)).setText(str);
        try {
            f5156b.addView(f5157c, f5155a);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (Build.VERSION.SDK_INT >= 24) {
            QuickSettingTileService.m4144a(context);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m4162b(Context context) {
        try {
            f5156b.removeView(f5157c);
        } catch (Exception e) {
        }
        if (Build.VERSION.SDK_INT >= 24) {
            QuickSettingTileService.m4144a(context);
        }
    }
}
