package com.gmail.heagoo.apkeditor;

import android.content.Context;
import android.view.View;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.eb */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnClickListenerC1263eb implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ DialogC1228dx f3661a;

    ViewOnClickListenerC1263eb(DialogC1228dx dialogC1228dx) {
        this.f3661a = dialogC1228dx;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (!DialogC1228dx.m3145f(this.f3661a)) {
            C1224dt.m3132a((Context) this.f3661a.f3572a.get());
        } else {
            new DialogC1197cn((Context) this.f3661a.f3572a.get(), new C1264ec(this), ".xml", this.f3661a.f3573b, null, false, false, true, null).show();
            this.f3661a.dismiss();
        }
    }
}
