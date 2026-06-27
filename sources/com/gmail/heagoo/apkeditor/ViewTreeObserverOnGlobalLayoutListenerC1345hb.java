package com.gmail.heagoo.apkeditor;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import com.gmail.heagoo.neweditor.InterfaceC1608s;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.hb */
/* JADX INFO: loaded from: classes.dex */
final class ViewTreeObserverOnGlobalLayoutListenerC1345hb implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ View f3941a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ InterfaceC1608s f3942b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ AbstractActivityC1341gy f3943c;

    ViewTreeObserverOnGlobalLayoutListenerC1345hb(AbstractActivityC1341gy abstractActivityC1341gy, View view, InterfaceC1608s interfaceC1608s) {
        this.f3943c = abstractActivityC1341gy;
        this.f3941a = view;
        this.f3942b = interfaceC1608s;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Rect rect = new Rect();
        this.f3941a.getWindowVisibleDisplayFrame(rect);
        int height = this.f3941a.getRootView().getHeight();
        int i = height - rect.bottom;
        this.f3943c.f3928s = ((double) i) > ((double) height) * 0.15d;
        this.f3942b.mo3565a(this.f3943c.f3928s);
        AbstractActivityC1341gy.m3386b(this.f3943c, this.f3943c.f3928s);
    }
}
