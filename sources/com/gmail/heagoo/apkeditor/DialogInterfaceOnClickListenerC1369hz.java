package com.gmail.heagoo.apkeditor;

import android.content.DialogInterface;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.hz */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC1369hz implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ TextEditNormalActivity f3999a;

    DialogInterfaceOnClickListenerC1369hz(TextEditNormalActivity textEditNormalActivity) {
        this.f3999a = textEditNormalActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f3999a.finish();
    }
}
