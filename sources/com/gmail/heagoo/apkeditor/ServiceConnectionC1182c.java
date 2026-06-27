package com.gmail.heagoo.apkeditor;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.gmail.heagoo.apkeditor.util.C1463d;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.c */
/* JADX INFO: loaded from: classes.dex */
final class ServiceConnectionC1182c implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ ApkComposeActivity f3458a;

    ServiceConnectionC1182c(ApkComposeActivity apkComposeActivity) {
        this.f3458a = apkComposeActivity;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        boolean z = false;
        this.f3458a.f2825A = (BinderC1401k) iBinder;
        if (this.f3458a.f2829E != null && "com.gmail.heagoo.action.apkcompose".equals(this.f3458a.f2829E)) {
            if (!this.f3458a.f2825A.m3454b()) {
                this.f3458a.f2825A.m3453a();
            }
            this.f3458a.f2845p.setVisibility(0);
        }
        BinderC1401k binderC1401k = this.f3458a.f2825A;
        ApkComposeActivity apkComposeActivity = this.f3458a;
        binderC1401k.f4067a.f2869n = new WeakReference(apkComposeActivity);
        synchronized (binderC1401k.f4067a.f2868m) {
            if (binderC1401k.f4067a.f2868m.f4060a) {
                if (binderC1401k.f4067a.f2868m.f4061b) {
                    apkComposeActivity.mo2595a();
                } else {
                    apkComposeActivity.mo2597a(binderC1401k.f4067a.f2868m.f4062c);
                }
            } else if (binderC1401k.f4067a.f2868m.f4063d != null) {
                apkComposeActivity.mo2596a(binderC1401k.f4067a.f2868m.f4063d);
            }
        }
        BinderC1401k binderC1401k2 = this.f3458a.f2825A;
        HashMap map = new HashMap();
        map.put("srcApkPath", binderC1401k2.f4067a.f2857b);
        map.put("targetApkPath", binderC1401k2.f4067a.f2866k);
        map.put("decodeRootPath", binderC1401k2.f4067a.f2856a);
        if (binderC1401k2.f4067a.f2861f != null && !binderC1401k2.f4067a.f2861f.isEmpty()) {
            z = true;
        }
        map.put("codeModified", Boolean.valueOf(z));
        map.put("signAPK", Boolean.valueOf(binderC1401k2.f4067a.f2876u));
        this.f3458a.f2830a = (String) map.get("srcApkPath");
        this.f3458a.f2851v = (String) map.get("targetApkPath");
        this.f3458a.f2853x = (String) map.get("decodeRootPath");
        this.f3458a.f2854y = ((Boolean) map.get("codeModified")).booleanValue();
        this.f3458a.f2855z = ((Boolean) map.get("signAPK")).booleanValue();
        this.f3458a.f2826B = new C1463d(this.f3458a.f2853x);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
