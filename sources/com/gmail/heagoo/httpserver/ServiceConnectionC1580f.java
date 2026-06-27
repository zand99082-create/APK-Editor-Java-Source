package com.gmail.heagoo.httpserver;

import android.app.Activity;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.gmail.heagoo.httpserver.f */
/* JADX INFO: loaded from: classes.dex */
final class ServiceConnectionC1580f implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    private WeakReference f4680a;

    /* JADX INFO: renamed from: b */
    private BinderC1578d f4681b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ C1579e f4682c;

    ServiceConnectionC1580f(C1579e c1579e, Activity activity) {
        this.f4682c = c1579e;
        this.f4680a = new WeakReference(activity);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f4681b = (BinderC1578d) iBinder;
        synchronized (this.f4682c.f4679b) {
            this.f4682c.f4679b.add(this);
        }
        String strM3815a = this.f4681b.m3815a();
        C1579e c1579e = this.f4682c;
        C1579e.m3820b((Activity) this.f4680a.get(), strM3815a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
