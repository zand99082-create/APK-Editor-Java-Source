package com.gmail.heagoo.apkeditor;

import android.widget.Toast;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.p084a.p089c.C1067a;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.iv */
/* JADX INFO: loaded from: classes.dex */
final class C1392iv implements InterfaceC1291fa {

    /* JADX INFO: renamed from: a */
    private String f4038a;

    /* JADX INFO: renamed from: b */
    private boolean f4039b = false;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ String f4040c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ String f4041d;

    /* JADX INFO: renamed from: e */
    private /* synthetic */ UserAppActivity f4042e;

    C1392iv(UserAppActivity userAppActivity, String str, String str2) {
        this.f4042e = userAppActivity;
        this.f4040c = str;
        this.f4041d = str2;
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1291fa
    /* JADX INFO: renamed from: a */
    public final void mo2792a() throws Throwable {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream = null;
        this.f4038a = C1067a.m2525d(this.f4042e, "backup") + this.f4040c + ".apk";
        try {
            FileInputStream fileInputStream2 = new FileInputStream(this.f4041d);
            try {
                fileOutputStream = new FileOutputStream(this.f4038a);
            } catch (Throwable th) {
                th = th;
                fileOutputStream = null;
                fileInputStream = fileInputStream2;
            }
            try {
                C1067a.m2506b(fileInputStream2, fileOutputStream);
                this.f4039b = true;
                C1067a.m2474a((Closeable) fileInputStream2);
                C1067a.m2474a(fileOutputStream);
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                C1067a.m2474a((Closeable) fileInputStream);
                C1067a.m2474a(fileOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1291fa
    /* JADX INFO: renamed from: b */
    public final void mo2793b() {
        if (this.f4039b) {
            Toast.makeText(this.f4042e, String.format(this.f4042e.getString(R.string.apk_saved_tip), this.f4038a), 1).show();
        }
    }
}
