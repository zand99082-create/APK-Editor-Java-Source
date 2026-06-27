package com.gmail.heagoo.pngeditor;

import android.content.DialogInterface;

/* JADX INFO: renamed from: com.gmail.heagoo.pngeditor.c */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC1621c implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ PngEditActivity f4921a;

    DialogInterfaceOnClickListenerC1621c(PngEditActivity pngEditActivity) {
        this.f4921a = pngEditActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f4921a.m3965b();
        this.f4921a.finish();
    }
}
