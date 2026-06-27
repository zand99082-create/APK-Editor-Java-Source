package com.gmail.heagoo.apkeditor;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.Toast;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.common.C1554c;
import com.gmail.heagoo.common.C1570s;
import java.io.File;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.bu */
/* JADX INFO: loaded from: classes.dex */
final class C1176bu implements InterfaceC1291fa {

    /* JADX INFO: renamed from: a */
    private String f3443a;

    /* JADX INFO: renamed from: b */
    private String f3444b;

    /* JADX INFO: renamed from: c */
    private String f3445c;

    /* JADX INFO: renamed from: d */
    private String f3446d;

    /* JADX INFO: renamed from: e */
    private String f3447e;

    /* JADX INFO: renamed from: f */
    private String f3448f;

    /* JADX INFO: renamed from: g */
    private boolean f3449g = false;

    /* JADX INFO: renamed from: h */
    private /* synthetic */ AxmlEditActivity f3450h;

    public C1176bu(AxmlEditActivity axmlEditActivity, String str, String str2) {
        this.f3450h = axmlEditActivity;
        this.f3443a = str;
        this.f3444b = str + ".bin";
        this.f3446d = str2;
        this.f3445c = str + C1570s.m3787a(6);
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1291fa
    /* JADX INFO: renamed from: a */
    public final void mo2792a() {
        String strM2744c = AxmlEditActivity.m2744c(this.f3450h);
        C1554c c1554c = new C1554c();
        c1554c.m3756a((Object) ((strM2744c + "aapt2") + " z -I " + (strM2744c + "android.jar") + " " + this.f3443a + " " + this.f3445c + " " + this.f3450h.m2741a()), (String[]) null, (Integer) 5000, false);
        this.f3447e = c1554c.mo3755a();
        this.f3448f = c1554c.mo3759b();
        File file = new File(this.f3445c);
        if (file.exists()) {
            this.f3449g = true;
            if (file.renameTo(new File(this.f3444b))) {
                return;
            }
            file.delete();
        }
    }

    @Override // com.gmail.heagoo.apkeditor.InterfaceC1291fa
    /* JADX INFO: renamed from: b */
    public final void mo2793b() {
        if (this.f3449g && new File(this.f3444b).exists()) {
            Toast.makeText(this.f3450h, String.format(this.f3450h.getString(R.string.entry_modified), this.f3446d), 0).show();
            this.f3450h.f2988e.m3548c(this.f3446d, this.f3444b);
            this.f3450h.f2992i.setVisibility(0);
        } else {
            String str = this.f3447e;
            if (this.f3448f != null && !this.f3448f.equals("")) {
                str = this.f3448f;
            }
            new AlertDialog.Builder(this.f3450h).setTitle(R.string.error).setMessage(str).setPositiveButton(android.R.string.ok, (DialogInterface.OnClickListener) null).show();
        }
    }
}
