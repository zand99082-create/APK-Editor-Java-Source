package com.gmail.heagoo.apkeditor;

import android.content.DialogInterface;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.ih */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC1378ih implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ int f4013a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ TextEditNormalActivity f4014b;

    DialogInterfaceOnClickListenerC1378ih(TextEditNormalActivity textEditNormalActivity, int i) {
        this.f4014b = textEditNormalActivity;
        this.f4013a = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f4014b.f3914e += this.f4013a;
        new AsyncTaskC1386ip(this.f4014b, (byte) 0).execute(new Void[0]);
    }
}
