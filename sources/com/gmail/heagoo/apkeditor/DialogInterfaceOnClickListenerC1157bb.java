package com.gmail.heagoo.apkeditor;

import android.content.DialogInterface;
import android.widget.Toast;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.p084a.p089c.C1067a;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.bb */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC1157bb implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ String f3398a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ ViewOnClickListenerC1139av f3399b;

    DialogInterfaceOnClickListenerC1157bb(ViewOnClickListenerC1139av viewOnClickListenerC1139av, String str) {
        this.f3399b = viewOnClickListenerC1139av;
        this.f3398a = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        ApkInfoExActivity apkInfoExActivity = this.f3399b.f3354a;
        C1067a.m2519c(apkInfoExActivity, this.f3398a);
        Toast.makeText(apkInfoExActivity, String.format(apkInfoExActivity.getString(R.string.copied_to_clipboard), this.f3398a), 0).show();
    }
}
