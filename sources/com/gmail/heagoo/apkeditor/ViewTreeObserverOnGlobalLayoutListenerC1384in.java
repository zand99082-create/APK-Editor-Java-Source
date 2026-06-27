package com.gmail.heagoo.apkeditor;

import android.graphics.Rect;
import android.view.ViewTreeObserver;
import com.gmail.heagoo.neweditor.C1594e;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.in */
/* JADX INFO: loaded from: classes.dex */
final class ViewTreeObserverOnGlobalLayoutListenerC1384in implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Rect f4023a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C1594e f4024b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ C1383im f4025c;

    ViewTreeObserverOnGlobalLayoutListenerC1384in(C1383im c1383im, Rect rect, C1594e c1594e) {
        this.f4025c = c1383im;
        this.f4023a = rect;
        this.f4024b = c1594e;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f4025c.f4022a.f3129l.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        if (this.f4025c.f4022a.f3129l.getLocalVisibleRect(this.f4023a)) {
            this.f4025c.m3444a(this.f4024b, this.f4023a);
        }
    }
}
