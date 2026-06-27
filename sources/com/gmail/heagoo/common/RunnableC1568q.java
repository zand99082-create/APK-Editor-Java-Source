package com.gmail.heagoo.common;

/* JADX INFO: renamed from: com.gmail.heagoo.common.q */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1568q implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ String f4654a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ DialogC1567p f4655b;

    RunnableC1568q(DialogC1567p dialogC1567p, String str) {
        this.f4655b = dialogC1567p;
        this.f4654a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4655b.f4652b.mo2793b();
        if (this.f4654a != null) {
            this.f4655b.m3786b("Failed: " + this.f4654a);
        } else if (this.f4655b.f4653c > 0) {
            this.f4655b.m3784a(this.f4655b.f4653c);
        }
        this.f4655b.dismiss();
    }
}
