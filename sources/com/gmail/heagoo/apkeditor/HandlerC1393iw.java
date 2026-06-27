package com.gmail.heagoo.apkeditor;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.iw */
/* JADX INFO: loaded from: classes.dex */
final class HandlerC1393iw extends Handler {

    /* JADX INFO: renamed from: a */
    private WeakReference f4043a;

    /* JADX INFO: renamed from: b */
    private List f4044b;

    public HandlerC1393iw(UserAppActivity userAppActivity) {
        this.f4043a = new WeakReference(userAppActivity);
    }

    /* JADX INFO: renamed from: a */
    public final void m3449a(List list) {
        this.f4044b = list;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        UserAppActivity userAppActivity = (UserAppActivity) this.f4043a.get();
        if (userAppActivity == null) {
        }
        switch (message.what) {
            case 0:
                userAppActivity.f3146e.clear();
                userAppActivity.f3146e.addAll(this.f4044b);
                userAppActivity.m2910a(this.f4044b);
                break;
        }
    }
}
