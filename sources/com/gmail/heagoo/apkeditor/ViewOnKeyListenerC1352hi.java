package com.gmail.heagoo.apkeditor;

import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.hi */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnKeyListenerC1352hi implements View.OnKeyListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ TextEditBigActivity f3957a;

    ViewOnKeyListenerC1352hi(TextEditBigActivity textEditBigActivity) {
        this.f3957a = textEditBigActivity;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (this.f3957a.f3076n.getVisibility() == 0 && keyEvent.getAction() == 1 && i == 4) {
            this.f3957a.f3076n.close();
            return true;
        }
        this.f3957a.m2843e();
        return false;
    }
}
