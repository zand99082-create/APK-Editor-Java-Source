package com.gmail.heagoo.apkeditor;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.fb */
/* JADX INFO: loaded from: classes.dex */
final class C1292fb extends Thread {

    /* JADX INFO: renamed from: a */
    private WeakReference f3748a;

    public C1292fb(DialogC1284ey dialogC1284ey) {
        this.f3748a = new WeakReference(dialogC1284ey);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        String message = null;
        DialogC1284ey dialogC1284ey = (DialogC1284ey) this.f3748a.get();
        if (dialogC1284ey != null) {
            try {
                dialogC1284ey.f3735b.mo2792a();
            } catch (Exception e) {
                message = e.getMessage();
            }
            dialogC1284ey.m3262a(message);
        }
    }
}
