package com.gmail.heagoo.apkeditor.p098se;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.se.p */
/* JADX INFO: loaded from: classes.dex */
final class HandlerC1443p extends Handler {

    /* JADX INFO: renamed from: a */
    private WeakReference f4247a;

    public HandlerC1443p(SimpleEditActivity simpleEditActivity) {
        this.f4247a = new WeakReference(simpleEditActivity);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        SimpleEditActivity simpleEditActivity = (SimpleEditActivity) this.f4247a.get();
        if (simpleEditActivity == null) {
        }
        switch (message.what) {
            case 0:
                simpleEditActivity.m3516a(true);
                break;
            case 1:
                simpleEditActivity.m3516a(false);
                break;
        }
    }
}
