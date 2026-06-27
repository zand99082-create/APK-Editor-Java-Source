package com.gmail.heagoo.apkeditor;

import android.widget.SlidingDrawer;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.hg */
/* JADX INFO: loaded from: classes.dex */
final class C1350hg implements SlidingDrawer.OnDrawerCloseListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ TextEditBigActivity f3955a;

    C1350hg(TextEditBigActivity textEditBigActivity) {
        this.f3955a = textEditBigActivity;
    }

    @Override // android.widget.SlidingDrawer.OnDrawerCloseListener
    public final void onDrawerClosed() {
        TextEditBigActivity.m2847h(this.f3955a);
    }
}
