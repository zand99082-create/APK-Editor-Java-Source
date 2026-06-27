package com.gmail.heagoo.apkeditor;

import android.widget.SlidingDrawer;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.hf */
/* JADX INFO: loaded from: classes.dex */
final class C1349hf implements SlidingDrawer.OnDrawerOpenListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ TextEditBigActivity f3954a;

    C1349hf(TextEditBigActivity textEditBigActivity) {
        this.f3954a = textEditBigActivity;
    }

    @Override // android.widget.SlidingDrawer.OnDrawerOpenListener
    public final void onDrawerOpened() {
        TextEditBigActivity.m2846g(this.f3954a);
    }
}
