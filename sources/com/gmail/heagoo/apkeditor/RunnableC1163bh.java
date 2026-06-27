package com.gmail.heagoo.apkeditor;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.bh */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1163bh implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ String f3418a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ ApkSearchActivity f3419b;

    RunnableC1163bh(ApkSearchActivity apkSearchActivity, String str) {
        this.f3419b = apkSearchActivity;
        this.f3418a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3419b.f2982d.add(this.f3418a);
        this.f3419b.m2734a(this.f3419b.f2982d.size());
        C1158bc c1158bc = this.f3419b.f2985g;
        c1158bc.f3400a.add(this.f3418a);
        c1158bc.notifyDataSetChanged();
    }
}
