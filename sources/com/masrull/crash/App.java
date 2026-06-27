package com.masrull.crash;

import android.app.Application;
import cat.ereza.customactivityoncrash.config.CaocConfig;

/* JADX INFO: loaded from: classes.dex */
public class App extends Application {
    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        CaocConfig.Builder.create().apply();
    }
}
