package com.gmail.heagoo.apkeditor.p094c;

import com.gmail.heagoo.apkeditor.TextEditNormalActivity;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.c.b */
/* JADX INFO: loaded from: classes.dex */
final class C1184b extends Thread {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ String f3467a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ DialogC1183a f3468b;

    C1184b(DialogC1183a dialogC1183a, String str) {
        this.f3468b = dialogC1183a;
        this.f3467a = str;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (TextEditNormalActivity.m3393e(this.f3467a) ? this.f3468b.m3092a(this.f3467a) : TextEditNormalActivity.m3388c(this.f3467a) ? this.f3468b.m3094b(this.f3467a) : false) {
            this.f3468b.f3465g.sendEmptyMessage(0);
        }
    }
}
