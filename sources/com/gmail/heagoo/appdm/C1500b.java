package com.gmail.heagoo.appdm;

import com.gmail.heagoo.p084a.p089c.C1068ax;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: com.gmail.heagoo.appdm.b */
/* JADX INFO: loaded from: classes.dex */
final class C1500b extends Thread {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ String f4510a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ String f4511b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ DialogC1491a f4512c;

    C1500b(DialogC1491a dialogC1491a, String str, String str2) {
        this.f4512c = dialogC1491a;
        this.f4510a = str;
        this.f4511b = str2;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            C1068ax.a_003(new FileInputStream(this.f4510a), new FileOutputStream(this.f4511b));
            this.f4512c.m3696b();
        } catch (IOException e) {
            this.f4512c.m3695a(e.getMessage());
        }
    }
}
