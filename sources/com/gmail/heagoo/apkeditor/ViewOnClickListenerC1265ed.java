package com.gmail.heagoo.apkeditor;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.gmail.heagoo.p084a.p089c.C1067a;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.ed */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnClickListenerC1265ed implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ DialogC1228dx f3663a;

    ViewOnClickListenerC1265ed(DialogC1228dx dialogC1228dx) {
        this.f3663a = dialogC1228dx;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (!DialogC1228dx.m3145f(this.f3663a)) {
            C1224dt.m3132a((Context) this.f3663a.f3572a.get());
            return;
        }
        ((Activity) this.f3663a.f3572a.get()).startActivityForResult(C1067a.m2439a(((Activity) this.f3663a.f3572a.get()).getApplicationContext(), this.f3663a.f3573b, (String) null), 2);
        this.f3663a.dismiss();
    }
}
