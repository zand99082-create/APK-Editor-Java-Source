package com.gmail.heagoo.apkeditor;

import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.ie */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnKeyListenerC1375ie implements View.OnKeyListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ TextEditNormalActivity f4006a;

    ViewOnKeyListenerC1375ie(TextEditNormalActivity textEditNormalActivity) {
        this.f4006a = textEditNormalActivity;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 66) {
            this.f4006a.m2864b(true);
            return true;
        }
        if (this.f4006a.f3099G.getVisibility() == 0 && keyEvent.getAction() == 1 && i == 4) {
            this.f4006a.f3099G.close();
            return true;
        }
        this.f4006a.m2877g();
        return false;
    }
}
