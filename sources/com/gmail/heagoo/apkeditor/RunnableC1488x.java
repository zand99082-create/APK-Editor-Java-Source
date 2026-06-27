package com.gmail.heagoo.apkeditor;

import android.widget.Toast;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.x */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1488x implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ String f4421a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ ApkInfoActivity f4422b;

    RunnableC1488x(ApkInfoActivity apkInfoActivity, String str) {
        this.f4422b = apkInfoActivity;
        this.f4421a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Toast.makeText(this.f4422b, this.f4421a, 1).show();
    }
}
