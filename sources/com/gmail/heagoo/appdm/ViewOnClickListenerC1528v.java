package com.gmail.heagoo.appdm;

import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: renamed from: com.gmail.heagoo.appdm.v */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnClickListenerC1528v implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ PrefOverallActivity f4589a;

    ViewOnClickListenerC1528v(PrefOverallActivity prefOverallActivity) {
        this.f4589a = prefOverallActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f4589a.f4456b = 0;
        this.f4589a.m3687c();
        this.f4589a.f4473s.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, this.f4589a.f4478x, (Drawable) null, (Drawable) null);
        this.f4589a.f4474t.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, this.f4589a.f4479y, (Drawable) null, (Drawable) null);
        this.f4589a.f4475u.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, this.f4589a.f4441A, (Drawable) null, (Drawable) null);
        this.f4589a.f4476v.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, this.f4589a.f4443C, (Drawable) null, (Drawable) null);
    }
}
