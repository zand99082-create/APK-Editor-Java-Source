package com.gmail.heagoo.apkeditor.p096e;

import com.gmail.heagoo.apkeditor.ApkInfoActivity;
import com.gmail.heagoo.apkeditor.pro.R;
import java.util.List;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.e.m */
/* JADX INFO: loaded from: classes.dex */
final class C1248m extends AbstractC1242g {

    /* JADX INFO: renamed from: b */
    private String f3620b;

    C1248m() {
    }

    @Override // com.gmail.heagoo.apkeditor.p096e.AbstractC1242g
    /* JADX INFO: renamed from: a */
    public final String mo3186a(ApkInfoActivity apkInfoActivity, ZipFile zipFile, InterfaceC1237b interfaceC1237b) {
        return this.f3620b;
    }

    @Override // com.gmail.heagoo.apkeditor.p096e.AbstractC1242g
    /* JADX INFO: renamed from: a */
    public final void mo3189a(C1238c c1238c, InterfaceC1237b interfaceC1237b) {
        this.f3603a = c1238c.m3170a();
        String line = c1238c.readLine();
        while (line != null) {
            String strTrim = line.trim();
            if ("[/GOTO]".equals(strTrim)) {
                return;
            }
            if (super.m3192a(strTrim, c1238c)) {
                line = c1238c.readLine();
            } else {
                if ("GOTO:".equals(strTrim)) {
                    this.f3620b = c1238c.readLine().trim();
                } else {
                    interfaceC1237b.mo3162a(R.string.patch_error_cannot_parse, Integer.valueOf(c1238c.m3170a()), strTrim);
                }
                line = c1238c.readLine();
            }
        }
    }

    @Override // com.gmail.heagoo.apkeditor.p096e.AbstractC1242g
    /* JADX INFO: renamed from: a */
    public final boolean mo3190a() {
        return false;
    }

    @Override // com.gmail.heagoo.apkeditor.p096e.AbstractC1242g
    /* JADX INFO: renamed from: a */
    public final boolean mo3191a(InterfaceC1237b interfaceC1237b) {
        if (this.f3620b == null) {
            interfaceC1237b.mo3162a(R.string.patch_error_no_goto_target, new Object[0]);
            return false;
        }
        List listMo3169f = interfaceC1237b.mo3169f();
        if (listMo3169f != null && listMo3169f.contains(this.f3620b)) {
            return true;
        }
        interfaceC1237b.mo3162a(R.string.patch_error_goto_target_notfound, this.f3620b);
        return false;
    }
}
