package com.gmail.heagoo.apkeditor.p096e;

import android.content.res.AssetFileDescriptor;
import com.gmail.heagoo.apkeditor.ApkInfoActivity;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.common.C1570s;
import com.gmail.heagoo.p084a.p089c.C1067a;
import java.io.Closeable;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.e.i */
/* JADX INFO: loaded from: classes.dex */
final class C1244i extends AbstractC1242g {

    /* JADX INFO: renamed from: b */
    private String f3608b;

    /* JADX INFO: renamed from: c */
    private String f3609c;

    /* JADX INFO: renamed from: d */
    private boolean f3610d;

    C1244i() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.gmail.heagoo.apkeditor.p096e.AbstractC1242g
    /* JADX INFO: renamed from: a */
    public final String mo3186a(ApkInfoActivity apkInfoActivity, ZipFile zipFile, InterfaceC1237b interfaceC1237b) throws Throwable {
        InputStream inputStream;
        FileOutputStream fileOutputStream;
        AssetFileDescriptor assetFileDescriptor = 0;
        assetFileDescriptor = 0;
        ZipEntry entry = zipFile.getEntry(this.f3608b);
        try {
            if (entry == null) {
                interfaceC1237b.mo3162a(R.string.patch_error_no_entry, this.f3608b);
            } else {
                try {
                    inputStream = zipFile.getInputStream(entry);
                } catch (Exception e) {
                    e = e;
                    fileOutputStream = null;
                    inputStream = null;
                } catch (Throwable th) {
                    th = th;
                    inputStream = null;
                }
                try {
                    if (this.f3610d) {
                        String str = C1067a.m2525d(apkInfoActivity, "tmp") + C1570s.m3787a(6);
                        fileOutputStream = new FileOutputStream(str);
                        try {
                            C1067a.m2506b(inputStream, fileOutputStream);
                            fileOutputStream.close();
                            m3188a(apkInfoActivity, str, (InterfaceC1232a) null, interfaceC1237b);
                        } catch (Exception e2) {
                            e = e2;
                            interfaceC1237b.mo3162a(R.string.general_error, e.getMessage());
                            m3181a(inputStream);
                            m3181a(fileOutputStream);
                        }
                    } else {
                        apkInfoActivity.m2724j().m3299a(apkInfoActivity.m2722i() + "/" + this.f3609c, inputStream);
                    }
                    m3181a(inputStream);
                    m3181a((Closeable) null);
                } catch (Exception e3) {
                    e = e3;
                    fileOutputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    m3181a(inputStream);
                    m3181a(assetFileDescriptor);
                    throw th;
                }
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            assetFileDescriptor = 1;
        }
    }

    @Override // com.gmail.heagoo.apkeditor.p096e.AbstractC1242g
    /* JADX INFO: renamed from: a */
    public final void mo3189a(C1238c c1238c, InterfaceC1237b interfaceC1237b) {
        this.f3603a = c1238c.m3170a();
        String line = c1238c.readLine();
        while (line != null) {
            String strTrim = line.trim();
            if ("[/ADD_FILES]".equals(strTrim)) {
                break;
            }
            if (super.m3192a(strTrim, c1238c)) {
                line = c1238c.readLine();
            } else {
                if ("SOURCE:".equals(strTrim)) {
                    this.f3608b = c1238c.readLine().trim();
                } else if ("TARGET:".equals(strTrim)) {
                    this.f3609c = c1238c.readLine().trim();
                } else if ("EXTRACT:".equals(strTrim)) {
                    this.f3610d = Boolean.valueOf(c1238c.readLine().trim()).booleanValue();
                } else {
                    interfaceC1237b.mo3162a(R.string.patch_error_cannot_parse, Integer.valueOf(c1238c.m3170a()), strTrim);
                }
                line = c1238c.readLine();
            }
        }
        if (this.f3609c == null || !this.f3609c.endsWith("/")) {
            return;
        }
        this.f3609c = this.f3609c.substring(0, this.f3609c.length() - 1);
    }

    @Override // com.gmail.heagoo.apkeditor.p096e.AbstractC1242g
    /* JADX INFO: renamed from: a */
    public final boolean mo3190a() {
        return AbstractC1242g.m3184c(this.f3609c);
    }

    @Override // com.gmail.heagoo.apkeditor.p096e.AbstractC1242g
    /* JADX INFO: renamed from: a */
    public final boolean mo3191a(InterfaceC1237b interfaceC1237b) {
        if (this.f3608b == null) {
            interfaceC1237b.mo3162a(R.string.patch_error_no_source_file, new Object[0]);
            return false;
        }
        if (this.f3609c != null) {
            return true;
        }
        interfaceC1237b.mo3162a(R.string.patch_error_no_target_file, new Object[0]);
        return false;
    }
}
