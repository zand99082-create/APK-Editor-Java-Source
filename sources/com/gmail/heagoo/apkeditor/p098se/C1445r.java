package com.gmail.heagoo.apkeditor.p098se;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.se.r */
/* JADX INFO: loaded from: classes.dex */
final class C1445r extends Thread {

    /* JADX INFO: renamed from: a */
    String f4250a;

    /* JADX INFO: renamed from: b */
    private WeakReference f4251b;

    public C1445r(SimpleEditActivity simpleEditActivity) {
        this.f4251b = new WeakReference(simpleEditActivity);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws Throwable {
        SimpleEditActivity simpleEditActivity = (SimpleEditActivity) this.f4251b.get();
        if (simpleEditActivity != null) {
            try {
                SimpleEditActivity.m3510a(simpleEditActivity);
                simpleEditActivity.f4188h.sendEmptyMessage(0);
            } catch (Exception e) {
                e.printStackTrace();
                this.f4250a = e.getMessage();
                simpleEditActivity.f4188h.sendEmptyMessage(1);
            }
        }
    }
}
