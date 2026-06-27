package com.tilks.arsc.main;

import android.app.IntentService;
import android.app.PendingIntent;
import android.content.Intent;
import java.io.File;
import p019b.p022fn.p040c.p041a.p044e.C0473a;
import p019b.p022fn.p040c.p041a.p044e.C0474b;

/* JADX INFO: loaded from: classes.dex */
public class MergeService extends IntentService {
    public MergeService() {
        super("MergeService");
    }

    @Override // android.app.IntentService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        String stringExtra = intent.getStringExtra("keyPast");
        String stringExtra2 = intent.getStringExtra("keyKey");
        String stringExtra3 = intent.getStringExtra("zip");
        boolean booleanExtra = intent.getBooleanExtra("signEnable", true);
        boolean booleanExtra2 = intent.getBooleanExtra("moduleEnable", false);
        boolean booleanExtra3 = intent.getBooleanExtra("languageEnable", false);
        boolean booleanExtra4 = intent.getBooleanExtra("extractNativeLibsEnable", false);
        boolean booleanExtra5 = intent.getBooleanExtra("mismatchingPackagesEnable", false);
        String stringExtra4 = intent.getStringExtra("languageCode");
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pendingIntent");
        File file = new File(stringExtra3);
        String absolutePath = file.getAbsolutePath();
        String strSubstring = absolutePath.substring(0, absolutePath.lastIndexOf(File.separator));
        try {
            if (booleanExtra3) {
                new C0474b(file, stringExtra3, strSubstring, booleanExtra, stringExtra, stringExtra2, stringExtra4.getBytes(), pendingIntent, this).m552a();
            } else {
                new C0473a(file, stringExtra3, strSubstring, booleanExtra, stringExtra, stringExtra2, booleanExtra2, booleanExtra5, booleanExtra4, pendingIntent, this).m551a();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
