package com.gmail.heagoo.apkeditor;

import android.widget.Toast;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.p084a.p089c.C1067a;
import java.io.File;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.t */
/* JADX INFO: loaded from: classes.dex */
final class C1454t implements InterfaceC1291fa {

    /* JADX INFO: renamed from: a */
    private String f4286a = null;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ String f4287b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ String f4288c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ ApkInfoActivity f4289d;

    C1454t(ApkInfoActivity apkInfoActivity, String str, String str2) {
        this.f4289d = apkInfoActivity;
        this.f4287b = str;
        this.f4288c = str2;
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1291fa
    /* JADX INFO: renamed from: a */
    public final void mo2792a() throws Throwable {
        File file = new File(this.f4287b);
        String name = file.getName();
        File file2 = new File(new File(this.f4288c), name);
        if (file2.exists()) {
            this.f4286a = String.format(this.f4289d.getString(R.string.file_already_exist), name);
        } else {
            file2.mkdir();
            C1067a.m2476a(file2, file);
        }
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1291fa
    /* JADX INFO: renamed from: b */
    public final void mo2793b() {
        if (this.f4286a != null) {
            Toast.makeText(this.f4289d, this.f4286a, 1).show();
        } else {
            this.f4289d.f2949e.m3301a();
        }
    }
}
