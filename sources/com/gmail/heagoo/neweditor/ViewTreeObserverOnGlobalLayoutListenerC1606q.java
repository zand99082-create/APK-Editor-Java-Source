package com.gmail.heagoo.neweditor;

import android.graphics.Rect;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: com.gmail.heagoo.neweditor.q */
/* JADX INFO: loaded from: classes.dex */
final class ViewTreeObserverOnGlobalLayoutListenerC1606q implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Rect f4845a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C1594e f4846b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ C1605p f4847c;

    ViewTreeObserverOnGlobalLayoutListenerC1606q(C1605p c1605p, Rect rect, C1594e c1594e) {
        this.f4847c = c1605p;
        this.f4845a = rect;
        this.f4846b = c1594e;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f4847c.f4844a.f4716a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        if (this.f4847c.f4844a.f4716a.getLocalVisibleRect(this.f4845a)) {
            this.f4847c.m3913a(this.f4846b, this.f4845a);
        }
    }
}
