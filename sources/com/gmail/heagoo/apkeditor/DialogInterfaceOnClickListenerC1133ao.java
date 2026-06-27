package com.gmail.heagoo.apkeditor;

import android.content.DialogInterface;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.ao */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC1133ao implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ ApkInfoActivity f3343a;

    DialogInterfaceOnClickListenerC1133ao(ApkInfoActivity apkInfoActivity) {
        this.f3343a = apkInfoActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        ApkInfoActivity apkInfoActivity = this.f3343a;
        new DialogC1284ey(apkInfoActivity, new C1134ap(apkInfoActivity), -1).show();
    }
}
