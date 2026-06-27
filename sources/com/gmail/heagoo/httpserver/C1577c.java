package com.gmail.heagoo.httpserver;

import java.net.UnknownHostException;

/* JADX INFO: renamed from: com.gmail.heagoo.httpserver.c */
/* JADX INFO: loaded from: classes.dex */
final class C1577c extends Thread {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ String[] f4676a;

    C1577c(C1576b c1576b, String[] strArr) {
        this.f4676a = strArr;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            this.f4676a[0] = C1576b.m3811m().getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        synchronized (this) {
            notify();
        }
    }
}
