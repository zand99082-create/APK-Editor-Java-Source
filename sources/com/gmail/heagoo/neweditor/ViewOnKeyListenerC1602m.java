package com.gmail.heagoo.neweditor;

import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: renamed from: com.gmail.heagoo.neweditor.m */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnKeyListenerC1602m implements View.OnKeyListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ EditorActivity f4841a;

    ViewOnKeyListenerC1602m(EditorActivity editorActivity) {
        this.f4841a = editorActivity;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 66) {
            this.f4841a.m3837c(true);
            return true;
        }
        if (this.f4841a.f4736y.getVisibility() == 0 && keyEvent.getAction() == 1 && i == 4) {
            this.f4841a.f4736y.close();
            return true;
        }
        EditorActivity.m3848l(this.f4841a);
        return false;
    }
}
