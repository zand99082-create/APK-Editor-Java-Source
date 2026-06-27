package com.gmail.heagoo.apkeditor;

import android.content.DialogInterface;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.fw */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC1313fw implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ String f3842a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ DialogC1312fv f3843b;

    DialogInterfaceOnClickListenerC1313fw(DialogC1312fv dialogC1312fv, String str) {
        this.f3843b = dialogC1312fv;
        this.f3842a = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (!"".equals(this.f3842a.trim())) {
            this.f3843b.f3841l.m3026a(this.f3842a);
        }
        this.f3843b.m3357a(this.f3842a);
    }
}
