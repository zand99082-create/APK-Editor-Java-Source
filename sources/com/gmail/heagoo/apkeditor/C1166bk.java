package com.gmail.heagoo.apkeditor;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import java.io.File;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.bk */
/* JADX INFO: loaded from: classes.dex */
public final class C1166bk {

    /* JADX INFO: renamed from: a */
    public ApplicationInfo f3423a;

    /* JADX INFO: renamed from: b */
    public String f3424b;

    /* JADX INFO: renamed from: c */
    public String f3425c;

    /* JADX INFO: renamed from: d */
    public long f3426d;

    /* JADX INFO: renamed from: a */
    public static C1166bk m3077a(PackageManager packageManager, ApplicationInfo applicationInfo) {
        C1166bk c1166bk = new C1166bk();
        c1166bk.f3423a = applicationInfo;
        c1166bk.f3425c = (String) applicationInfo.loadLabel(packageManager);
        c1166bk.f3424b = applicationInfo.packageName;
        try {
            c1166bk.f3426d = packageManager.getPackageInfo(applicationInfo.packageName, 0).lastUpdateTime;
            new File(applicationInfo.sourceDir).length();
        } catch (Throwable th) {
            c1166bk.f3426d = 0L;
        }
        return c1166bk;
    }
}
