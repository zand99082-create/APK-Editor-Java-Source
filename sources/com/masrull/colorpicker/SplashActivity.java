package com.masrull.colorpicker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.gmail.heagoo.apkeditor.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public class SplashActivity extends Activity {
    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(MasrullID("activity_splash", "layout"));
        new Handler().postDelayed(new Runnable() { // from class: com.masrull.colorpicker.SplashActivity.1
            @Override // java.lang.Runnable
            public void run() {
                SplashActivity.this.startActivity(new Intent(SplashActivity.this, (Class<?>) MainActivity.class));
                SplashActivity.this.finish();
            }
        }, 5000L);
    }

    public int MasrullID(String str, String str2) {
        return getBaseContext().getResources().getIdentifier(str, str2, getBaseContext().getPackageName());
    }
}
