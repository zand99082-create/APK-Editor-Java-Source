package com.gmail.heagoo.common;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.gmail.heagoo.common.r */
/* JADX INFO: loaded from: classes.dex */
final class C1569r extends Thread {

    /* JADX INFO: renamed from: a */
    private WeakReference f4656a;

    public C1569r(DialogC1567p dialogC1567p) {
        this.f4656a = new WeakReference(dialogC1567p);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        String message = null;
        DialogC1567p dialogC1567p = (DialogC1567p) this.f4656a.get();
        if (dialogC1567p != null) {
            try {
                dialogC1567p.f4652b.mo2792a();
            } catch (Exception e) {
                message = e.getMessage();
            }
            dialogC1567p.m3785a(message);
        }
    }
}
