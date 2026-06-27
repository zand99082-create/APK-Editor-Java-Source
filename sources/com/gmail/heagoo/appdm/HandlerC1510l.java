package com.gmail.heagoo.appdm;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.widget.Toast;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.gmail.heagoo.appdm.l */
/* JADX INFO: loaded from: classes.dex */
final class HandlerC1510l extends Handler {

    /* JADX INFO: renamed from: a */
    private WeakReference f4545a;

    /* JADX INFO: renamed from: b */
    private String f4546b;

    public HandlerC1510l(PrefDetailActivity prefDetailActivity) {
        this.f4545a = new WeakReference(prefDetailActivity);
    }

    /* JADX INFO: renamed from: a */
    public final void m3713a(String str) {
        this.f4546b = str;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (message.what) {
            case 0:
                PrefDetailActivity prefDetailActivity = (PrefDetailActivity) this.f4545a.get();
                if (prefDetailActivity != null) {
                    PrefDetailActivity.m3646a(prefDetailActivity);
                }
                break;
            case 1:
                Toast.makeText((Context) this.f4545a.get(), "Error: " + this.f4546b, 1).show();
                break;
        }
    }
}
