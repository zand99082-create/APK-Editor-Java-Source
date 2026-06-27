package com.gmail.heagoo.apkeditor;

import android.content.DialogInterface;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.hj */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC1353hj implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ int f3958a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ TextEditBigActivity f3959b;

    DialogInterfaceOnClickListenerC1353hj(TextEditBigActivity textEditBigActivity, int i) {
        this.f3959b = textEditBigActivity;
        this.f3958a = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f3959b.f3914e += this.f3958a;
        new AsyncTaskC1361hr(this.f3959b, (byte) 0).execute(new Void[0]);
    }
}
