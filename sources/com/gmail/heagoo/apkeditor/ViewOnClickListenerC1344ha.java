package com.gmail.heagoo.apkeditor;

import android.view.View;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.ha */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnClickListenerC1344ha implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ AbstractActivityC1341gy f3940a;

    ViewOnClickListenerC1344ha(AbstractActivityC1341gy abstractActivityC1341gy) {
        this.f3940a = abstractActivityC1341gy;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f3940a.mo2852c(((Integer) view.getTag()).intValue());
    }
}
