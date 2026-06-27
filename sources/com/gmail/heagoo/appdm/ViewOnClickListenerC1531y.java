package com.gmail.heagoo.appdm;

import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: renamed from: com.gmail.heagoo.appdm.y */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnClickListenerC1531y implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ PrefOverallActivity f4592a;

    ViewOnClickListenerC1531y(PrefOverallActivity prefOverallActivity) {
        this.f4592a = prefOverallActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f4592a.f4456b = 3;
        this.f4592a.m3690f();
        this.f4592a.f4473s.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, this.f4592a.f4477w, (Drawable) null, (Drawable) null);
        this.f4592a.f4474t.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, this.f4592a.f4479y, (Drawable) null, (Drawable) null);
        this.f4592a.f4475u.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, this.f4592a.f4441A, (Drawable) null, (Drawable) null);
        this.f4592a.f4476v.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, this.f4592a.f4444D, (Drawable) null, (Drawable) null);
    }
}
