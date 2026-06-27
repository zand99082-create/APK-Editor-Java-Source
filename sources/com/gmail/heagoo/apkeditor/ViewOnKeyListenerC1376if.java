package com.gmail.heagoo.apkeditor;

import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.if */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnKeyListenerC1376if implements View.OnKeyListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ TextEditNormalActivity f4007a;

    ViewOnKeyListenerC1376if(TextEditNormalActivity textEditNormalActivity) {
        this.f4007a = textEditNormalActivity;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (this.f4007a.f3099G.getVisibility() == 0 && keyEvent.getAction() == 1 && i == 4) {
            this.f4007a.f3099G.close();
            return true;
        }
        this.f4007a.m2877g();
        return false;
    }
}
