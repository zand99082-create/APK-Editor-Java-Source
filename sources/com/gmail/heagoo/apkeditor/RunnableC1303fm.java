package com.gmail.heagoo.apkeditor;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.fm */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1303fm implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ ViewOnClickListenerC1302fl f3802a;

    RunnableC1303fm(ViewOnClickListenerC1302fl viewOnClickListenerC1302fl) {
        this.f3802a = viewOnClickListenerC1302fl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3802a.f3800d.fullScroll(66);
    }
}
