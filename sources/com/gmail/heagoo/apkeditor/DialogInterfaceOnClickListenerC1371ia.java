package com.gmail.heagoo.apkeditor;

import android.content.DialogInterface;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.ia */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC1371ia implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ TextEditNormalActivity f4002a;

    DialogInterfaceOnClickListenerC1371ia(TextEditNormalActivity textEditNormalActivity) {
        this.f4002a = textEditNormalActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f4002a.m2858a(new C1372ib(this));
    }
}
