package com.gmail.heagoo.apkeditor;

import android.content.DialogInterface;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.aa */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC1116aa implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ ApkInfoActivity f3318a;

    DialogInterfaceOnClickListenerC1116aa(ApkInfoActivity apkInfoActivity) {
        this.f3318a = apkInfoActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.f3318a.f2910W != null && this.f3318a.f2910W.isAlive()) {
            this.f3318a.f2910W.m3075b();
            ApkInfoActivity.m2637a(this.f3318a, (C1162bg) null);
        }
        this.f3318a.finish();
    }
}
