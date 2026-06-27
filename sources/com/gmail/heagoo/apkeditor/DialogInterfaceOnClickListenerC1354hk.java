package com.gmail.heagoo.apkeditor;

import android.content.DialogInterface;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.hk */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC1354hk implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f3960a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ TextEditBigActivity f3961b;

    DialogInterfaceOnClickListenerC1354hk(TextEditBigActivity textEditBigActivity, int i) {
        this.f3961b = textEditBigActivity;
        this.f3960a = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f3961b.m2834a(new C1355hl(this));
    }
}
