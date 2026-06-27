package com.rull.mod;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import p000a.p001a.p003b.p004a.C0037k;

/* JADX INFO: loaded from: classes.dex */
public class SplashActivity extends Activity {

    /* JADX INFO: renamed from: d */
    SharedPreferences f5053d;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        setTheme(C0037k.mdNoActionBar(C0037k.m89a(this)));
        super.onCreate(bundle);
        this.f5053d = PreferenceManager.getDefaultSharedPreferences(this);
        setContentView(MasrullID("activity_splash", "layout"));
        new Handler().postDelayed(new Runnable(this) { // from class: com.rull.mod.SplashActivity.100000000
            private final SplashActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.this$0.startActivity(new Intent(this.this$0, Class.forName("com.gmail.heagoo.apkeditor.MainActivity")));
                    this.this$0.finish();
                } catch (ClassNotFoundException e) {
                }
            }
        }, 900);
    }

    public int MasrullID(String str, String str2) {
        return getBaseContext().getResources().getIdentifier(str, str2, getBaseContext().getPackageName());
    }
}
