package com.gmail.heagoo.apkeditor.p098se;

import android.os.Handler;
import android.os.Message;
import android.support.v7.appcompat.C0327R;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.se.b */
/* JADX INFO: loaded from: classes.dex */
final class HandlerC1429b extends Handler {

    /* JADX INFO: renamed from: a */
    private WeakReference f4212a;

    /* JADX INFO: renamed from: b */
    private String f4213b;

    HandlerC1429b(ApkCreateActivity apkCreateActivity) {
        this.f4212a = new WeakReference(apkCreateActivity);
    }

    /* JADX INFO: renamed from: a */
    final void m3525a(String str) {
        this.f4213b = str;
        sendEmptyMessage(100);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        super.handleMessage(message);
        ApkCreateActivity apkCreateActivity = (ApkCreateActivity) this.f4212a.get();
        switch (message.what) {
            case 0:
                if (apkCreateActivity != null) {
                    apkCreateActivity.m3508a(true);
                }
                break;
            case 1:
                if (apkCreateActivity != null) {
                    apkCreateActivity.m3508a(false);
                }
                break;
            case C0327R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 100 */:
                if (apkCreateActivity != null) {
                    apkCreateActivity.f4169p.setText(this.f4213b);
                }
                break;
        }
    }
}
