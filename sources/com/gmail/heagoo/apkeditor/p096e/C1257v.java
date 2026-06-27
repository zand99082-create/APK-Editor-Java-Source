package com.gmail.heagoo.apkeditor.p096e;

import com.gmail.heagoo.apkeditor.ApkInfoActivity;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.p084a.p089c.C1067a;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.e.v */
/* JADX INFO: loaded from: classes.dex */
final class C1257v extends AbstractC1242g {

    /* JADX INFO: renamed from: b */
    private List f3649b = new ArrayList();

    C1257v() {
    }

    /* JADX INFO: renamed from: d */
    private String m3218d(String str) throws Throwable {
        BufferedInputStream bufferedInputStream;
        ZipFile zipFile;
        ByteArrayOutputStream byteArrayOutputStream;
        BufferedInputStream bufferedInputStream2;
        ByteArrayOutputStream byteArrayOutputStream2;
        ByteArrayOutputStream byteArrayOutputStream3 = null;
        try {
            zipFile = new ZipFile(str);
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                while (enumerationEntries.hasMoreElements()) {
                    ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                    if (!zipEntryNextElement.isDirectory()) {
                        String name = zipEntryNextElement.getName();
                        if (name.endsWith(".RSA") || name.endsWith(".rsa") || name.endsWith(".DSA") || name.endsWith(".dsa")) {
                            bufferedInputStream = new BufferedInputStream(zipFile.getInputStream(zipEntryNextElement));
                            try {
                                byteArrayOutputStream2 = new ByteArrayOutputStream();
                                try {
                                    C1067a.m2506b(bufferedInputStream, byteArrayOutputStream2);
                                    break;
                                } catch (IOException e) {
                                    bufferedInputStream2 = bufferedInputStream;
                                    byteArrayOutputStream = byteArrayOutputStream2;
                                    e = e;
                                    try {
                                        e.printStackTrace();
                                        m3181a(bufferedInputStream2);
                                        m3181a(byteArrayOutputStream);
                                        m3182a(zipFile);
                                        byteArrayOutputStream2 = byteArrayOutputStream;
                                    } catch (Throwable th) {
                                        th = th;
                                        byteArrayOutputStream3 = byteArrayOutputStream;
                                        bufferedInputStream = bufferedInputStream2;
                                        m3181a(bufferedInputStream);
                                        m3181a(byteArrayOutputStream3);
                                        m3182a(zipFile);
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    byteArrayOutputStream3 = byteArrayOutputStream2;
                                    th = th2;
                                    m3181a(bufferedInputStream);
                                    m3181a(byteArrayOutputStream3);
                                    m3182a(zipFile);
                                    throw th;
                                }
                            } catch (IOException e2) {
                                e = e2;
                                bufferedInputStream2 = bufferedInputStream;
                                byteArrayOutputStream = null;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                    }
                }
                byteArrayOutputStream2 = null;
                bufferedInputStream = null;
                m3181a(bufferedInputStream);
                m3181a(byteArrayOutputStream2);
                m3182a(zipFile);
            } catch (IOException e3) {
                e = e3;
                byteArrayOutputStream = null;
                bufferedInputStream2 = null;
            } catch (Throwable th4) {
                th = th4;
                bufferedInputStream = null;
            }
        } catch (IOException e4) {
            e = e4;
            byteArrayOutputStream = null;
            bufferedInputStream2 = null;
            zipFile = null;
        } catch (Throwable th5) {
            th = th5;
            bufferedInputStream = null;
            zipFile = null;
        }
        if (byteArrayOutputStream2 != null) {
            return C1067a.m2517c(byteArrayOutputStream2.toByteArray());
        }
        return null;
    }

    @Override // com.gmail.heagoo.apkeditor.p096e.AbstractC1242g
    /* JADX INFO: renamed from: a */
    public final String mo3186a(ApkInfoActivity apkInfoActivity, ZipFile zipFile, InterfaceC1237b interfaceC1237b) throws Throwable {
        String strM3218d = m3218d(apkInfoActivity.m2726l());
        String str = apkInfoActivity.m2727m().f4630b;
        String str2 = interfaceC1237b.mo3165b() + "/" + ((String) this.f3649b.get(0));
        try {
            C1067a.m2507b(str2, m3187a(str2).replace("%PACKAGE_NAME%", str).replace("%RSA_DATA%", strM3218d));
            return null;
        } catch (Exception e) {
            interfaceC1237b.mo3162a(R.string.patch_error_write_to, str2);
            return null;
        }
    }

    @Override // com.gmail.heagoo.apkeditor.p096e.AbstractC1242g
    /* JADX INFO: renamed from: a */
    public final void mo3189a(C1238c c1238c, InterfaceC1237b interfaceC1237b) {
        this.f3603a = c1238c.m3170a();
        String line = c1238c.readLine();
        while (line != null) {
            String strTrim = line.trim();
            if ("[/SIGNATURE_REVISE]".equals(strTrim)) {
                return;
            }
            if (super.m3192a(strTrim, c1238c)) {
                line = c1238c.readLine();
            } else {
                if ("TARGET:".equals(strTrim)) {
                    this.f3649b.add(c1238c.readLine().trim());
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
        return true;
    }

    @Override // com.gmail.heagoo.apkeditor.p096e.AbstractC1242g
    /* JADX INFO: renamed from: a */
    public final boolean mo3191a(InterfaceC1237b interfaceC1237b) {
        return !this.f3649b.isEmpty();
    }
}
