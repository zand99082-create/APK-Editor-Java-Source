package com.gmail.heagoo.apkeditor;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.bs */
/* JADX INFO: loaded from: classes.dex */
final class HandlerC1174bs extends Handler {

    /* JADX INFO: renamed from: a */
    private WeakReference f3440a;

    public HandlerC1174bs(AxmlEditActivity axmlEditActivity) {
        this.f3440a = new WeakReference(axmlEditActivity);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        AxmlEditActivity axmlEditActivity = (AxmlEditActivity) this.f3440a.get();
        if (axmlEditActivity == null) {
        }
        switch (message.what) {
            case 0:
                axmlEditActivity.m2749a(true);
                break;
            case 1:
                axmlEditActivity.m2749a(false);
                break;
        }
    }
}
