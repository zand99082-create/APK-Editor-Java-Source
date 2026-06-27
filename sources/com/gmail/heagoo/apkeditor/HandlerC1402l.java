package com.gmail.heagoo.apkeditor;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.l */
/* JADX INFO: loaded from: classes.dex */
final class HandlerC1402l extends Handler {

    /* JADX INFO: renamed from: a */
    private String f4068a;

    /* JADX INFO: renamed from: b */
    private String f4069b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ ApkComposeService f4070c;

    private HandlerC1402l(ApkComposeService apkComposeService) {
        this.f4070c = apkComposeService;
    }

    /* synthetic */ HandlerC1402l(ApkComposeService apkComposeService, byte b2) {
        this(apkComposeService);
    }

    /* JADX INFO: renamed from: a */
    public final void m3455a(String str, String str2) {
        this.f4068a = str;
        this.f4069b = str2;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (message.what) {
            case 0:
                if (this.f4068a != null) {
                    this.f4070c.f2872q.setContentTitle(this.f4068a);
                }
                if (this.f4069b != null) {
                    this.f4070c.f2872q.setContentText(this.f4069b);
                }
                if (this.f4070c.f2873r) {
                    this.f4070c.f2871p.notify(8001, this.f4070c.f2872q.build());
                } else {
                    this.f4070c.startForeground(8001, this.f4070c.f2872q.build());
                    this.f4070c.f2873r = true;
                }
                this.f4070c.f2877v = System.currentTimeMillis();
                break;
        }
    }
}
