package com.gmail.heagoo.sqliteutil;

/* JADX INFO: renamed from: com.gmail.heagoo.sqliteutil.b */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1631b implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1627a f4991a;

    RunnableC1631b(C1627a c1627a) {
        this.f4991a = c1627a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4991a.f4970l.clearAnimation();
        this.f4991a.f4970l.layout(C1627a.m4012b(this.f4991a).left, C1627a.m4012b(this.f4991a).top, C1627a.m4012b(this.f4991a).right, C1627a.m4012b(this.f4991a).bottom);
        C1627a.m4012b(this.f4991a).setEmpty();
    }
}
