package com.gmail.heagoo.apkeditor;

import android.content.DialogInterface;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.dg */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC1214dg implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ ViewOnClickListenerC1213df f3536a;

    DialogInterfaceOnClickListenerC1214dg(ViewOnClickListenerC1213df viewOnClickListenerC1213df) {
        this.f3536a = viewOnClickListenerC1213df;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f3536a.m3123a();
    }
}
