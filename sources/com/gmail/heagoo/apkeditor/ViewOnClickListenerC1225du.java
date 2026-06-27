package com.gmail.heagoo.apkeditor;

import android.view.View;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.du */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnClickListenerC1225du implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1217dj f3567a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C1224dt f3568b;

    ViewOnClickListenerC1225du(C1224dt c1224dt, C1217dj c1217dj) {
        this.f3568b = c1224dt;
        this.f3567a = c1217dj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1224dt.m3133a(this.f3568b, this.f3567a);
    }
}
