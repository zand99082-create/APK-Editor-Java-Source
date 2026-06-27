package com.gmail.heagoo.httpserver;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.gmail.heagoo.p084a.p089c.C1067a;

/* JADX INFO: loaded from: classes.dex */
public class HttpService extends Service {

    /* JADX INFO: renamed from: a */
    private String f4668a;

    /* JADX INFO: renamed from: b */
    private String f4669b;

    /* JADX INFO: renamed from: c */
    private C1576b f4670c = null;

    /* JADX INFO: renamed from: d */
    private BinderC1578d f4671d = new BinderC1578d(this);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f4671d;
    }

    @Override // android.app.Service
    public void onDestroy() {
        if (this.f4670c != null && this.f4670c.m344d()) {
            this.f4670c.m345e();
        }
        super.onDestroy();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null) {
            return super.onStartCommand(intent, i, i2);
        }
        this.f4669b = C1067a.m2457a(intent, "projectDirectory");
        this.f4668a = C1067a.m2457a(intent, "httpDirectory");
        if (this.f4670c != null) {
            try {
                if (!this.f4670c.m344d()) {
                    int i3 = 0;
                    while (true) {
                        int i4 = i3;
                        if (i4 >= 5) {
                            break;
                        }
                        try {
                            this.f4670c.m3813a(i4);
                            break;
                        } catch (Exception e) {
                            e.printStackTrace();
                            i3 = i4 + 1;
                        }
                    }
                }
            } catch (Exception e2) {
                this.f4670c.m345e();
            }
        } else if (this.f4668a != null && this.f4669b != null) {
            this.f4670c = new C1576b(this.f4668a, this.f4669b);
            if (!this.f4670c.m344d()) {
            }
        }
        return 1;
    }
}
