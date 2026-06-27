package com.gmail.heagoo.apkeditor;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.CheckBox;
import com.gmail.heagoo.p084a.p089c.C1067a;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.e */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC1231e implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ CheckBox f3578a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ ApkComposeActivity f3579b;

    DialogInterfaceOnClickListenerC1231e(ApkComposeActivity apkComposeActivity, CheckBox checkBox) {
        this.f3579b = apkComposeActivity;
        this.f3578a = checkBox;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.f3579b.f2825A != null && this.f3579b.f2825A.m3454b()) {
            this.f3579b.finish();
        }
        if (this.f3578a.isChecked()) {
            C1067a.m2502b((Context) this.f3579b, "donot_show_compose_tip", true);
        }
    }
}
