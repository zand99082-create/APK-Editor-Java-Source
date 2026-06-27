package com.gmail.heagoo.appdm;

import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: renamed from: com.gmail.heagoo.appdm.w */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnClickListenerC1529w implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ PrefOverallActivity f4590a;

    ViewOnClickListenerC1529w(PrefOverallActivity prefOverallActivity) {
        this.f4590a = prefOverallActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f4590a.f4456b = 1;
        this.f4590a.m3688d();
        this.f4590a.f4473s.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, this.f4590a.f4477w, (Drawable) null, (Drawable) null);
        this.f4590a.f4474t.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, this.f4590a.f4480z, (Drawable) null, (Drawable) null);
        this.f4590a.f4475u.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, this.f4590a.f4441A, (Drawable) null, (Drawable) null);
        this.f4590a.f4476v.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, this.f4590a.f4443C, (Drawable) null, (Drawable) null);
    }
}
