package p019b.p022fn.p034b.p035a.p036a.p037a.p038b;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: b.fn.b.a.a.a.b.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0452c {
    /* JADX INFO: renamed from: a */
    public static float m505a(float f) {
        return (f * Resources.getSystem().getDisplayMetrics().density) + 0.5f;
    }

    /* JADX INFO: renamed from: a */
    public static Drawable m506a(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        PackageInfo packageArchiveInfo = packageManager.getPackageArchiveInfo(str, 0);
        if (packageArchiveInfo == null) {
            return null;
        }
        ApplicationInfo applicationInfo = packageArchiveInfo.applicationInfo;
        applicationInfo.sourceDir = str;
        applicationInfo.publicSourceDir = str;
        return applicationInfo.loadIcon(packageManager);
    }
}
