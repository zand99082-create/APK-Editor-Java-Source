package com.gmail.heagoo.apkeditor;

import android.content.DialogInterface;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.dl */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnShowListenerC1219dl implements DialogInterface.OnShowListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C1218dk f3557a;

    DialogInterfaceOnShowListenerC1219dl(C1218dk c1218dk) {
        this.f3557a = c1218dk;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        this.f3557a.f3556e.getButton(-1).setOnClickListener(new ViewOnClickListenerC1220dm(this));
    }
}
