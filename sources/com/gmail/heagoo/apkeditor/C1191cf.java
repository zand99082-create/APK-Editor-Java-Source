package com.gmail.heagoo.apkeditor;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.cf */
/* JADX INFO: loaded from: classes.dex */
final class C1191cf extends Thread {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ DialogC1190ce f3490a;

    C1191cf(DialogC1190ce dialogC1190ce) {
        this.f3490a = dialogC1190ce;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws Throwable {
        try {
            for (C1192cg c1192cg : this.f3490a.f3479a) {
                if (c1192cg.f3493c) {
                    this.f3490a.m3105a(c1192cg);
                } else {
                    this.f3490a.m3107b(c1192cg);
                }
            }
            this.f3490a.f3484f.sendEmptyMessage(0);
        } catch (Exception e) {
            this.f3490a.f3484f.m3108a(e.getMessage());
            this.f3490a.f3484f.sendEmptyMessage(1);
        }
    }
}
