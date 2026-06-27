package com.gmail.heagoo.apkeditor;

import android.view.View;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.ee */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnClickListenerC1266ee implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ DialogC1228dx f3664a;

    ViewOnClickListenerC1266ee(DialogC1228dx dialogC1228dx) {
        this.f3664a = dialogC1228dx;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f3664a.dismiss();
    }
}
