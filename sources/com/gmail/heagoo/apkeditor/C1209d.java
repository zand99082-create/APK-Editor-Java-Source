package com.gmail.heagoo.apkeditor;

import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.apkeditor.util.C1483x;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.d */
/* JADX INFO: loaded from: classes.dex */
class C1209d implements InterfaceC1291fa {

    /* JADX INFO: renamed from: a */
    private String f3525a = null;

    /* JADX INFO: renamed from: b */
    private String f3526b = null;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ ApkComposeActivity f3527c;

    C1209d(ApkComposeActivity apkComposeActivity) {
        this.f3527c = apkComposeActivity;
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1291fa
    /* JADX INFO: renamed from: a */
    public final void mo2792a() throws Exception {
        C1483x c1483x = new C1483x(this.f3527c.f2852w);
        c1483x.m3641a(this.f3527c, this.f3527c.f2851v);
        this.f3526b = c1483x.f4405b;
        if (c1483x.f4404a != null) {
            this.f3525a = c1483x.f4404a;
            throw new Exception(this.f3525a);
        }
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1291fa
    /* JADX INFO: renamed from: b */
    public final void mo2793b() {
        if (this.f3525a != null) {
            this.f3527c.f2841l.setText(this.f3525a);
            return;
        }
        ApkComposeActivity.m2586c(this.f3527c, true);
        this.f3527c.f2841l.setText(String.format(this.f3527c.getString(R.string.patch_code_cache_done), this.f3526b));
        this.f3527c.f2842m.setText(R.string.launch);
    }
}
