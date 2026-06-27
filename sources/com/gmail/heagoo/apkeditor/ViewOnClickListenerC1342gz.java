package com.gmail.heagoo.apkeditor;

import android.view.View;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.gz */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnClickListenerC1342gz implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ AbstractActivityC1341gy f3935a;

    ViewOnClickListenerC1342gz(AbstractActivityC1341gy abstractActivityC1341gy) {
        this.f3935a = abstractActivityC1341gy;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f3935a.f3933x.getVisibility() == 0) {
            this.f3935a.f3932w.setVisibility(0);
            this.f3935a.f3933x.setVisibility(4);
        } else {
            this.f3935a.f3933x.setVisibility(0);
            this.f3935a.f3932w.setVisibility(4);
        }
    }
}
