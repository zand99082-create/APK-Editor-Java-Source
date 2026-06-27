package com.gmail.heagoo.apkeditor;

import android.content.DialogInterface;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.ho */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC1358ho implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ TextEditBigActivity f3966a;

    DialogInterfaceOnClickListenerC1358ho(TextEditBigActivity textEditBigActivity) {
        this.f3966a = textEditBigActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f3966a.m2834a(new C1359hp(this));
    }
}
