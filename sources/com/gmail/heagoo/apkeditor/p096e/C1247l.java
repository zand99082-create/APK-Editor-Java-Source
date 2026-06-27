package com.gmail.heagoo.apkeditor.p096e;

import com.gmail.heagoo.apkeditor.ApkInfoActivity;
import com.gmail.heagoo.apkeditor.pro.R;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.e.l */
/* JADX INFO: loaded from: classes.dex */
final class C1247l extends AbstractC1242g {

    /* JADX INFO: renamed from: b */
    private List f3618b = new ArrayList();

    /* JADX INFO: renamed from: c */
    private List f3619c = new ArrayList();

    C1247l() {
        this.f3619c.add("[/FUNCTION_REPLACE]");
        this.f3619c.add("TARGET:");
        this.f3619c.add("FUNCTION:");
        this.f3619c.add("REPLACE:");
    }

    @Override // com.gmail.heagoo.apkeditor.p096e.AbstractC1242g
    /* JADX INFO: renamed from: a */
    public final String mo3186a(ApkInfoActivity apkInfoActivity, ZipFile zipFile, InterfaceC1237b interfaceC1237b) {
        interfaceC1237b.mo3162a(R.string.general_error, "Not supported yet.");
        return null;
    }

    @Override // com.gmail.heagoo.apkeditor.p096e.AbstractC1242g
    /* JADX INFO: renamed from: a */
    public final void mo3189a(C1238c c1238c, InterfaceC1237b interfaceC1237b) {
        this.f3603a = c1238c.m3170a();
        String line = c1238c.readLine();
        while (line != null) {
            String strTrim = line.trim();
            if ("[/FUNCTION_REPLACE]".equals(strTrim)) {
                return;
            }
            if (super.m3192a(strTrim, c1238c)) {
                line = c1238c.readLine();
            } else {
                if ("TARGET:".equals(strTrim)) {
                    c1238c.readLine().trim();
                } else if ("FUNCTION:".equals(strTrim)) {
                    c1238c.readLine().trim();
                } else if ("REPLACE:".equals(strTrim)) {
                    line = m3179a((BufferedReader) c1238c, this.f3618b, false, this.f3619c);
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
        return false;
    }
}
