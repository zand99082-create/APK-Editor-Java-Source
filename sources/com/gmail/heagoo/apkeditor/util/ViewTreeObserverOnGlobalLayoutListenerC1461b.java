package com.gmail.heagoo.apkeditor.util;

import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.util.b */
/* JADX INFO: loaded from: classes.dex */
final class ViewTreeObserverOnGlobalLayoutListenerC1461b implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1459a f4339a;

    ViewTreeObserverOnGlobalLayoutListenerC1461b(C1459a c1459a) {
        this.f4339a = c1459a;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        C1459a.m3573a(this.f4339a);
    }
}
