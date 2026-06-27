package com.gmail.heagoo.httpserver;

import android.os.Binder;

/* JADX INFO: renamed from: com.gmail.heagoo.httpserver.d */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC1578d extends Binder {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ HttpService f4677a;

    public BinderC1578d(HttpService httpService) {
        this.f4677a = httpService;
    }

    /* JADX INFO: renamed from: a */
    public final String m3815a() {
        if (this.f4677a.f4670c == null || !this.f4677a.f4670c.m344d()) {
            return null;
        }
        return this.f4677a.f4670c.m3812a();
    }
}
