package com.gmail.heagoo.apkeditor;

import android.os.Handler;
import android.os.Message;
import android.widget.EditText;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.hx */
/* JADX INFO: loaded from: classes.dex */
final class HandlerC1367hx extends Handler {

    /* JADX INFO: renamed from: a */
    private int f3994a;

    /* JADX INFO: renamed from: b */
    private int f3995b;

    /* JADX INFO: renamed from: c */
    private int f3996c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ C1366hw f3997d;

    HandlerC1367hx(C1366hw c1366hw) {
        this.f3997d = c1366hw;
    }

    /* JADX INFO: renamed from: a */
    public final void m3441a(int i, int i2, int i3) {
        this.f3994a = i;
        this.f3995b = i2;
        this.f3996c = i3;
        sendEmptyMessageDelayed(1000, 100L);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1000:
                EditText editTextM3434d = this.f3997d.m3434d(this.f3994a);
                if (editTextM3434d != null) {
                    editTextM3434d.requestFocus();
                    editTextM3434d.setSelection(this.f3995b, this.f3996c);
                }
                break;
        }
    }
}
