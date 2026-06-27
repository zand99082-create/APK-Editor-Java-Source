package com.gmail.heagoo.pngeditor;

import android.content.DialogInterface;

/* JADX INFO: renamed from: com.gmail.heagoo.pngeditor.b */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC1620b implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ PngEditActivity f4920a;

    DialogInterfaceOnClickListenerC1620b(PngEditActivity pngEditActivity) {
        this.f4920a = pngEditActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f4920a.finish();
    }
}
