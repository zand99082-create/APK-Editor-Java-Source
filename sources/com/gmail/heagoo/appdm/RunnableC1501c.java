package com.gmail.heagoo.appdm;

/* JADX INFO: renamed from: com.gmail.heagoo.appdm.c */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1501c implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ DialogC1491a f4513a;

    RunnableC1501c(DialogC1491a dialogC1491a) {
        this.f4513a = dialogC1491a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4513a.cancel();
    }
}
