package com.gmail.heagoo.pngeditor;

import android.content.DialogInterface;

/* JADX INFO: renamed from: com.gmail.heagoo.pngeditor.d */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC1622d implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ PngEditActivity f4922a;

    DialogInterfaceOnClickListenerC1622d(PngEditActivity pngEditActivity) {
        this.f4922a = pngEditActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f4922a.f4894g.setImageBitmap(this.f4922a.f4905r);
        this.f4922a.m3967c();
    }
}
