package com.gmail.heagoo.apkeditor;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.bt */
/* JADX INFO: loaded from: classes.dex */
final class C1175bt extends Thread {

    /* JADX INFO: renamed from: a */
    String f3441a;

    /* JADX INFO: renamed from: b */
    private WeakReference f3442b;

    public C1175bt(AxmlEditActivity axmlEditActivity) {
        this.f3442b = new WeakReference(axmlEditActivity);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws Throwable {
        AxmlEditActivity axmlEditActivity = (AxmlEditActivity) this.f3442b.get();
        if (axmlEditActivity != null) {
            try {
                AxmlEditActivity.m2742a(axmlEditActivity);
                axmlEditActivity.f2989f.sendEmptyMessage(0);
            } catch (Exception e) {
                e.printStackTrace();
                this.f3441a = e.getMessage();
                axmlEditActivity.f2989f.sendEmptyMessage(1);
            }
        }
    }
}
