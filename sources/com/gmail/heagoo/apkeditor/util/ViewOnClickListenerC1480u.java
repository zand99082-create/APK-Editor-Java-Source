package com.gmail.heagoo.apkeditor.util;

import android.view.View;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.util.u */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnClickListenerC1480u implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ int f4395a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C1479t f4396b;

    ViewOnClickListenerC1480u(C1479t c1479t, int i) {
        this.f4396b = c1479t;
        this.f4395a = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        for (int i = 0; i < this.f4396b.f4393c.size(); i++) {
            if (i == this.f4395a) {
                ((C1481v) this.f4396b.f4393c.get(i)).f4398b = true;
            } else {
                ((C1481v) this.f4396b.f4393c.get(i)).f4398b = false;
            }
        }
        this.f4396b.f4391a.getDialog().dismiss();
    }
}
