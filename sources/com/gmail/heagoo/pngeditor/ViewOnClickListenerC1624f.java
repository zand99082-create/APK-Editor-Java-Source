package com.gmail.heagoo.pngeditor;

import android.view.View;

/* JADX INFO: renamed from: com.gmail.heagoo.pngeditor.f */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnClickListenerC1624f implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ PngEditActivity f4924a;

    ViewOnClickListenerC1624f(PngEditActivity pngEditActivity) {
        this.f4924a = pngEditActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f4924a.f4910w.dismiss();
    }
}
