package com.gmail.heagoo.apkeditor;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.dy */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnClickListenerC1229dy implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ DialogC1228dx f3576a;

    ViewOnClickListenerC1229dy(DialogC1228dx dialogC1228dx) {
        this.f3576a = dialogC1228dx;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String strMo2689a = this.f3576a.f3575d.mo2689a(this.f3576a.f3574c);
        if (strMo2689a == null) {
            this.f3576a.dismiss();
        } else {
            if (strMo2689a.equals("")) {
                return;
            }
            Toast.makeText((Context) this.f3576a.f3572a.get(), strMo2689a, 0).show();
        }
    }
}
