package com.gmail.heagoo.apkeditor;

import android.content.DialogInterface;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.ii */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC1379ii implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f4015a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ TextEditNormalActivity f4016b;

    DialogInterfaceOnClickListenerC1379ii(TextEditNormalActivity textEditNormalActivity, int i) {
        this.f4016b = textEditNormalActivity;
        this.f4015a = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f4016b.m2858a(new C1380ij(this));
    }
}
