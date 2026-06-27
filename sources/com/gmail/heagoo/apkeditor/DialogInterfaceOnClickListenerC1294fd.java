package com.gmail.heagoo.apkeditor;

import android.content.DialogInterface;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.fd */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC1294fd implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1293fc f3766a;

    DialogInterfaceOnClickListenerC1294fd(C1293fc c1293fc) {
        this.f3766a = c1293fc;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        ((ApkInfoActivity) this.f3766a.f3749a).m2708b(this.f3766a.f3752d.isChecked());
    }
}
