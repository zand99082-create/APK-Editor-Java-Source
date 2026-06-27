package com.gmail.heagoo.neweditor;

import android.widget.SlidingDrawer;

/* JADX INFO: renamed from: com.gmail.heagoo.neweditor.h */
/* JADX INFO: loaded from: classes.dex */
final class C1597h implements SlidingDrawer.OnDrawerOpenListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ EditorActivity f4836a;

    C1597h(EditorActivity editorActivity) {
        this.f4836a = editorActivity;
    }

    @Override // android.widget.SlidingDrawer.OnDrawerOpenListener
    public final void onDrawerOpened() {
        EditorActivity.m3845i(this.f4836a);
    }
}
