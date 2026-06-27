package com.gmail.heagoo.apkeditor;

import android.content.DialogInterface;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.ba */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC1156ba implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ String f3396a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ ViewOnClickListenerC1143az f3397b;

    DialogInterfaceOnClickListenerC1156ba(ViewOnClickListenerC1143az viewOnClickListenerC1143az, String str) {
        this.f3397b = viewOnClickListenerC1143az;
        this.f3396a = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f3397b.f3365e.m3030a(this.f3397b.f3362b, this.f3397b.f3361a, this.f3397b.f3363c, this.f3396a, this.f3397b.f3364d);
    }
}
