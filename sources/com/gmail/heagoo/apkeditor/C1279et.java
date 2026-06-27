package com.gmail.heagoo.apkeditor;

import android.widget.Toast;
import com.gmail.heagoo.apkeditor.util.C1483x;
import com.gmail.heagoo.common.C1552a;
import com.gmail.heagoo.common.C1553b;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.et */
/* JADX INFO: loaded from: classes.dex */
final class C1279et implements InterfaceC1291fa {

    /* JADX INFO: renamed from: a */
    private String f3712a;

    /* JADX INFO: renamed from: b */
    private String f3713b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ OdexPatchActivity f3714c;

    C1279et(OdexPatchActivity odexPatchActivity) {
        this.f3714c = odexPatchActivity;
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1291fa
    /* JADX INFO: renamed from: a */
    public final void mo2792a() throws Exception {
        new C1552a();
        C1553b c1553bM3750a = C1552a.m3750a(this.f3714c, this.f3714c.f3059b);
        if (c1553bM3750a == null) {
            return;
        }
        C1483x c1483x = new C1483x(c1553bM3750a.f4630b);
        c1483x.m3641a(this.f3714c, this.f3714c.f3059b);
        this.f3713b = c1483x.f4405b;
        if (c1483x.f4404a != null) {
            this.f3712a = c1483x.f4404a;
            throw new Exception(this.f3712a);
        }
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1291fa
    /* JADX INFO: renamed from: b */
    public final void mo2793b() {
        if (this.f3712a == null) {
            Toast.makeText(this.f3714c, "Patched to " + this.f3713b, 1).show();
        }
    }
}
