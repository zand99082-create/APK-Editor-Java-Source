package com.gmail.heagoo.apkeditor;

import android.os.Handler;
import android.os.Message;
import android.view.View;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.hu */
/* JADX INFO: loaded from: classes.dex */
final class HandlerC1364hu extends Handler {

    /* JADX INFO: renamed from: a */
    View f3988a;

    HandlerC1364hu(C1362hs c1362hs) {
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (message.what) {
            case 0:
                this.f3988a.requestFocus();
                break;
        }
    }
}
