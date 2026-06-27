package com.gmail.heagoo.apkeditor;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.ez */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1285ez implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ String f3737a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ DialogC1284ey f3738b;

    RunnableC1285ez(DialogC1284ey dialogC1284ey, String str) {
        this.f3738b = dialogC1284ey;
        this.f3737a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3738b.f3735b.mo2793b();
        if (this.f3737a != null) {
            this.f3738b.m3263b("Failed: " + this.f3737a);
        } else {
            this.f3738b.m3261a(this.f3738b.f3736c);
        }
        if (this.f3738b.isShowing()) {
            this.f3738b.m3258a();
        }
    }
}
