package com.gmail.heagoo.apkeditor;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.ch */
/* JADX INFO: loaded from: classes.dex */
final class HandlerC1193ch extends Handler {

    /* JADX INFO: renamed from: a */
    private WeakReference f3494a;

    /* JADX INFO: renamed from: b */
    private String f3495b;

    public HandlerC1193ch(DialogC1190ce dialogC1190ce) {
        this.f3494a = new WeakReference(dialogC1190ce);
    }

    /* JADX INFO: renamed from: a */
    public final void m3108a(String str) {
        this.f3495b = str;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        DialogC1190ce dialogC1190ce = (DialogC1190ce) this.f3494a.get();
        if (dialogC1190ce == null) {
        }
        switch (message.what) {
            case 0:
                dialogC1190ce.m3104a();
                break;
            case 1:
                dialogC1190ce.m3106a(this.f3495b);
                break;
        }
    }
}
