package com.gmail.heagoo.apkeditor;

import android.widget.SlidingDrawer;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.ic */
/* JADX INFO: loaded from: classes.dex */
final class C1373ic implements SlidingDrawer.OnDrawerCloseListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ TextEditNormalActivity f4004a;

    C1373ic(TextEditNormalActivity textEditNormalActivity) {
        this.f4004a = textEditNormalActivity;
    }

    @Override // android.widget.SlidingDrawer.OnDrawerCloseListener
    public final void onDrawerClosed() {
        TextEditNormalActivity.m2886o(this.f4004a);
    }
}
