package com.gmail.heagoo.apkeditor;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.w */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1487w implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ boolean f4419a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ ApkInfoActivity f4420b;

    RunnableC1487w(ApkInfoActivity apkInfoActivity, boolean z) {
        this.f4420b = apkInfoActivity;
        this.f4419a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f4419a) {
            this.f4420b.m2683s();
            this.f4420b.m2690a();
        }
        this.f4420b.m2688x();
        this.f4420b.f2907S.setVisibility(0);
        if (ApkInfoActivity.m2673j(this.f4420b)) {
            this.f4420b.f2908U.setVisibility(0);
        } else {
            this.f4420b.f2908U.setVisibility(8);
        }
        this.f4420b.f2909V.setVisibility(0);
    }
}
