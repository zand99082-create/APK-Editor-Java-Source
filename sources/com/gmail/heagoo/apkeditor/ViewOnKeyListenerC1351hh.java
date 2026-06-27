package com.gmail.heagoo.apkeditor;

import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.hh */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnKeyListenerC1351hh implements View.OnKeyListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ TextEditBigActivity f3956a;

    ViewOnKeyListenerC1351hh(TextEditBigActivity textEditBigActivity) {
        this.f3956a = textEditBigActivity;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 66) {
            this.f3956a.m2836a(true);
            return true;
        }
        if (this.f3956a.f3076n.getVisibility() == 0 && keyEvent.getAction() == 1 && i == 4) {
            this.f3956a.f3076n.close();
            return true;
        }
        this.f3956a.m2843e();
        return false;
    }
}
