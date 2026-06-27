package com.gmail.heagoo.neweditor;

import android.widget.SlidingDrawer;

/* JADX INFO: renamed from: com.gmail.heagoo.neweditor.i */
/* JADX INFO: loaded from: classes.dex */
final class C1598i implements SlidingDrawer.OnDrawerCloseListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ EditorActivity f4837a;

    C1598i(EditorActivity editorActivity) {
        this.f4837a = editorActivity;
    }

    @Override // android.widget.SlidingDrawer.OnDrawerCloseListener
    public final void onDrawerClosed() {
        EditorActivity.m3846j(this.f4837a);
    }
}
