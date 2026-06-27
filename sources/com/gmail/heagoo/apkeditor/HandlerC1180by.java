package com.gmail.heagoo.apkeditor;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.by */
/* JADX INFO: loaded from: classes.dex */
final class HandlerC1180by extends Handler {

    /* JADX INFO: renamed from: a */
    private WeakReference f3456a;

    /* JADX INFO: renamed from: b */
    private String f3457b;

    HandlerC1180by(CommonEditActivity commonEditActivity) {
        this.f3456a = new WeakReference(commonEditActivity);
    }

    /* JADX INFO: renamed from: a */
    final void m3083a(String str) {
        this.f3457b = str;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        CommonEditActivity commonEditActivity = (CommonEditActivity) this.f3456a.get();
        if (commonEditActivity == null) {
        }
        switch (message.what) {
            case 0:
                commonEditActivity.m2763a((String) null);
                break;
            case 1:
                commonEditActivity.m2763a(this.f3457b);
                break;
        }
    }
}
