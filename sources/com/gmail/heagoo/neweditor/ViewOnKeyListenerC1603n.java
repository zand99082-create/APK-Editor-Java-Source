package com.gmail.heagoo.neweditor;

import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: renamed from: com.gmail.heagoo.neweditor.n */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnKeyListenerC1603n implements View.OnKeyListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ EditorActivity f4842a;

    ViewOnKeyListenerC1603n(EditorActivity editorActivity) {
        this.f4842a = editorActivity;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (this.f4842a.f4736y.getVisibility() == 0 && keyEvent.getAction() == 1 && i == 4) {
            this.f4842a.f4736y.close();
            return true;
        }
        EditorActivity.m3848l(this.f4842a);
        return false;
    }
}
