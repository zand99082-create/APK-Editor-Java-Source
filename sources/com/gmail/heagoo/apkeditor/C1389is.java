package com.gmail.heagoo.apkeditor;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.is */
/* JADX INFO: loaded from: classes.dex */
final class C1389is extends Thread {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ UserAppActivity f4034a;

    C1389is(UserAppActivity userAppActivity) {
        this.f4034a = userAppActivity;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ArrayList arrayList = new ArrayList();
        this.f4034a.m2911b(arrayList);
        this.f4034a.f3145d.m3449a(arrayList);
        this.f4034a.f3145d.sendEmptyMessage(0);
    }
}
