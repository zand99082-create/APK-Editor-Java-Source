package com.gmail.heagoo.apkeditor;

import android.view.View;
import p000a.p001a.p003b.p004a.p005a.C0027x;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.ay */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnClickListenerC1142ay implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ String f3359a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ ViewOnClickListenerC1139av f3360b;

    ViewOnClickListenerC1142ay(ViewOnClickListenerC1139av viewOnClickListenerC1139av, String str) {
        this.f3360b = viewOnClickListenerC1139av;
        this.f3359a = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        try {
            C0027x.m34b(this.f3360b.f3354a.f2914a, this.f3359a, "/sdcard/axml");
        } catch (Exception e) {
        }
    }
}
