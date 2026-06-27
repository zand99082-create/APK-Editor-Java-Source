package com.gmail.heagoo.appdm;

import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: renamed from: com.gmail.heagoo.appdm.x */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnClickListenerC1530x implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ PrefOverallActivity f4591a;

    ViewOnClickListenerC1530x(PrefOverallActivity prefOverallActivity) {
        this.f4591a = prefOverallActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f4591a.f4456b = 2;
        this.f4591a.m3689e();
        this.f4591a.f4473s.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, this.f4591a.f4477w, (Drawable) null, (Drawable) null);
        this.f4591a.f4474t.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, this.f4591a.f4479y, (Drawable) null, (Drawable) null);
        this.f4591a.f4475u.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, this.f4591a.f4442B, (Drawable) null, (Drawable) null);
        this.f4591a.f4476v.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, this.f4591a.f4443C, (Drawable) null, (Drawable) null);
    }
}
