package com.gmail.heagoo.apkeditor;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.gmail.heagoo.apkeditor.pro.R;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.dz */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnClickListenerC1230dz implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ DialogC1228dx f3577a;

    ViewOnClickListenerC1230dz(DialogC1228dx dialogC1228dx) {
        this.f3577a = dialogC1228dx;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String string = ((Activity) this.f3577a.f3572a.get()).getString(R.string.select_folder);
        new DialogC1197cn((Context) this.f3577a.f3572a.get(), new C1262ea(this), null, null, string, true, false, false, null).show();
        this.f3577a.dismiss();
    }
}
