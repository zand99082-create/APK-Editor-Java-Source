package com.gmail.heagoo.appdm;

import android.widget.Toast;
import com.gmail.heagoo.apkeditor.InterfaceC1291fa;
import com.gmail.heagoo.p084a.p089c.C1068ax;

/* JADX INFO: renamed from: com.gmail.heagoo.appdm.t */
/* JADX INFO: loaded from: classes.dex */
final class C1518t implements InterfaceC1291fa {

    /* JADX INFO: renamed from: a */
    private String f4560a = null;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ String f4561b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ PrefOverallActivity f4562c;

    C1518t(PrefOverallActivity prefOverallActivity, String str) {
        this.f4562c = prefOverallActivity;
        this.f4561b = str;
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1291fa
    /* JADX INFO: renamed from: a */
    public final void mo2792a() {
        this.f4560a = PrefOverallActivity.m3656a(this.f4562c, this.f4561b);
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1291fa
    /* JADX INFO: renamed from: b */
    public final void mo2793b() {
        if (this.f4560a != null) {
            C1068ax.b_011(this.f4562c, this.f4560a);
        } else {
            Toast.makeText(this.f4562c, "Failed to open the file.", 0).show();
        }
    }
}
