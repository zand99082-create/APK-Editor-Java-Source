package com.gmail.heagoo.apkeditor;

import android.widget.SlidingDrawer;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.hy */
/* JADX INFO: loaded from: classes.dex */
final class C1368hy implements SlidingDrawer.OnDrawerOpenListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ TextEditNormalActivity f3998a;

    C1368hy(TextEditNormalActivity textEditNormalActivity) {
        this.f3998a = textEditNormalActivity;
    }

    @Override // android.widget.SlidingDrawer.OnDrawerOpenListener
    public final void onDrawerOpened() {
        TextEditNormalActivity.m2885n(this.f3998a);
    }
}
