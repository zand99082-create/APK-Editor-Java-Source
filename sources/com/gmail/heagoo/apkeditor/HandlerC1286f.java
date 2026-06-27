package com.gmail.heagoo.apkeditor;

import android.os.Handler;
import android.os.Message;
import android.widget.Toast;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.f */
/* JADX INFO: loaded from: classes.dex */
final class HandlerC1286f extends Handler {

    /* JADX INFO: renamed from: a */
    private WeakReference f3739a;

    public HandlerC1286f(ApkComposeActivity apkComposeActivity) {
        this.f3739a = new WeakReference(apkComposeActivity);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        ApkComposeActivity apkComposeActivity = (ApkComposeActivity) this.f3739a.get();
        if (apkComposeActivity != null) {
            switch (message.what) {
                case 1:
                    apkComposeActivity.m2599b();
                    return;
                case 2:
                    apkComposeActivity.m2598a(true);
                    return;
                case 3:
                    apkComposeActivity.m2598a(false);
                    return;
                case 4:
                    Toast.makeText(apkComposeActivity, (CharSequence) null, 1).show();
                    return;
                case 5:
                    if (!ApkComposeActivity.m2589e(apkComposeActivity).m1055a() && System.currentTimeMillis() - apkComposeActivity.f2850u < 10000) {
                        sendEmptyMessageDelayed(5, 300L);
                        return;
                    }
                    break;
                case 6:
                    break;
                default:
                    return;
            }
            apkComposeActivity.f2845p.setVisibility(0);
        }
    }
}
