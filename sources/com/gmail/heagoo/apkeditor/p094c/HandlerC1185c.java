package com.gmail.heagoo.apkeditor.p094c;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.c.c */
/* JADX INFO: loaded from: classes.dex */
final class HandlerC1185c extends Handler {

    /* JADX INFO: renamed from: a */
    private WeakReference f3469a;

    HandlerC1185c(DialogC1183a dialogC1183a) {
        this.f3469a = new WeakReference(dialogC1183a);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (message.what) {
            case 0:
                if (this.f3469a.get() != null) {
                    ((DialogC1183a) this.f3469a.get()).m3089a(-1);
                }
                break;
        }
    }
}
