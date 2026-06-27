package com.gmail.heagoo.apkeditor;

import android.view.View;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.y */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnClickListenerC1489y implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ ApkInfoActivity f4423a;

    ViewOnClickListenerC1489y(ApkInfoActivity apkInfoActivity) {
        this.f4423a = apkInfoActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        new DialogC1215dh(this.f4423a, null, null).show();
    }
}
