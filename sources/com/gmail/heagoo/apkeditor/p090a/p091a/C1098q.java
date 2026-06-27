package com.gmail.heagoo.apkeditor.p090a.p091a;

import android.content.Context;
import com.gmail.heagoo.apkeditor.p090a.InterfaceC1108d;
import com.gmail.heagoo.apkeditor.p090a.InterfaceC1110f;
import com.gmail.heagoo.p084a.p089c.C1067a;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.Enumeration;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.a.a.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1098q implements InterfaceC1108d, Serializable {

    /* JADX INFO: renamed from: a */
    private String f3211a;

    /* JADX INFO: renamed from: b */
    private String f3212b;

    public C1098q(String str, String str2) {
        this.f3211a = str;
        this.f3212b = str2;
    }

    /* JADX INFO: renamed from: a */
    private static void m2962a(ZipFile zipFile) {
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (Throwable th) {
            }
        }
    }

    @Override // com.gmail.heagoo.apkeditor.p090a.InterfaceC1108d
    /* JADX INFO: renamed from: a */
    public final void mo2954a(Context context, String str, Map map, InterfaceC1110f interfaceC1110f) throws Throwable {
        ZipFile zipFile;
        String strM2525d = C1067a.m2525d(context, "tmp");
        try {
            try {
                zipFile = new ZipFile(str);
                try {
                    Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                    while (enumerationEntries.hasMoreElements()) {
                        ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                        if (!zipEntryNextElement.isDirectory()) {
                            String name = zipEntryNextElement.getName();
                            if (name.endsWith(".xml") && name.startsWith("res/layout")) {
                                InputStream inputStream = zipFile.getInputStream(zipEntryNextElement);
                                String strM2927a = new C1084c(inputStream, strM2525d).m2927a(this.f3211a, this.f3212b);
                                if (strM2927a != null) {
                                    map.put(name, strM2927a);
                                }
                                inputStream.close();
                            }
                        }
                    }
                    m2962a(zipFile);
                } catch (IOException e) {
                    e = e;
                    e.printStackTrace();
                    m2962a(zipFile);
                }
            } catch (Throwable th) {
                th = th;
                m2962a(null);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            zipFile = null;
        } catch (Throwable th2) {
            th = th2;
            m2962a(null);
            throw th;
        }
    }
}
