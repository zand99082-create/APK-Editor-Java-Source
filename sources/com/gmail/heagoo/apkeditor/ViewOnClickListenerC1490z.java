package com.gmail.heagoo.apkeditor;

import android.view.View;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.z */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnClickListenerC1490z implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ ApkInfoActivity f4424a;

    ViewOnClickListenerC1490z(ApkInfoActivity apkInfoActivity) {
        this.f4424a = apkInfoActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        new DialogC1144b(this.f4424a).show();
    }
}
