package com.gmail.heagoo.apkeditor;

import android.content.DialogInterface;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.ct */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC1203ct implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ String f3518a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ DialogC1197cn f3519b;

    DialogInterfaceOnClickListenerC1203ct(DialogC1197cn dialogC1197cn, String str) {
        this.f3519b = dialogC1197cn;
        this.f3518a = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f3519b.f3510i.mo2764a(this.f3518a, this.f3519b.f3503b, this.f3519b.f3509h.isChecked());
        this.f3519b.m3116b(this.f3518a);
        this.f3519b.dismiss();
    }
}
