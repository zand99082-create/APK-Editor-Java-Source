package com.p078b.p079a;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: com.b.a.c */
/* JADX INFO: loaded from: classes.dex */
final class HandlerC1010c extends Handler {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1008a f2626a;

    HandlerC1010c(C1008a c1008a) {
        this.f2626a = c1008a;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (message.what) {
            case 0:
                int iM2305a = this.f2626a.m2305a();
                if (iM2305a != this.f2626a.f2623i) {
                    C1008a.m2302a(this.f2626a, iM2305a);
                }
                this.f2626a.f2616b.setBackgroundColor(iM2305a);
                if (C1008a.m2304c(this.f2626a) != null) {
                    C1008a.m2304c(this.f2626a).mo2307a(iM2305a);
                }
                break;
        }
    }
}
