package com.gmail.heagoo.apkeditor.util;

import android.content.Context;
import com.gmail.heagoo.apkeditor.p090a.InterfaceC1108d;
import com.gmail.heagoo.apkeditor.p090a.InterfaceC1110f;
import com.gmail.heagoo.apkeditor.p090a.p091a.C1093l;
import com.gmail.heagoo.apkeditor.p090a.p091a.C1094m;
import com.gmail.heagoo.apkeditor.p090a.p091a.C1100s;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.util.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1462c implements InterfaceC1108d {

    /* JADX INFO: renamed from: a */
    private String f4340a;

    /* JADX INFO: renamed from: b */
    private Map f4341b;

    public C1462c(String str, Map map) {
        this.f4340a = str.endsWith("/") ? str : str + "/";
        this.f4341b = map;
    }

    /* JADX INFO: renamed from: a */
    private static void m3579a(C1093l c1093l) {
        if (c1093l != null) {
            try {
                c1093l.m2947b();
            } catch (IOException e) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m3580a(ZipFile zipFile) {
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (IOException e) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m3581a(InputStream inputStream, String str, Map map) throws Throwable {
        C1093l c1093l;
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            map2.put(entry.getValue(), entry.getKey());
        }
        C1094m c1094m = new C1094m(inputStream);
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(str, "rw");
            randomAccessFile.setLength(0L);
            c1093l = new C1093l(randomAccessFile);
            try {
                int iM2949a = c1094m.m2949a();
                int iM2949a2 = c1094m.m2949a();
                c1093l.m2942a(iM2949a);
                c1093l.m2942a(iM2949a2);
                C1100s c1100s = new C1100s();
                c1100s.m2976a(c1094m);
                int iM2980c = c1100s.m2980c();
                for (int i = 0; i < iM2980c; i++) {
                    String str2 = (String) map2.get(c1100s.m2978b(i));
                    if (str2 != null) {
                        c1100s.m2974a(i, str2);
                    }
                }
                int i2 = c1100s.f3218a;
                c1100s.m2975a(c1093l);
                int i3 = c1100s.f3218a;
                byte[] bArr = new byte[4096];
                while (true) {
                    int iM2953b = c1094m.m2953b(bArr, 0, 4096);
                    if (iM2953b == -1) {
                        c1093l.m2943a(4, c1093l.m2941a());
                        m3579a(c1093l);
                        return false;
                    }
                    c1093l.m2945a(bArr, 0, iM2953b);
                }
            } catch (Throwable th) {
                th = th;
                m3579a(c1093l);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c1093l = null;
        }
    }

    @Override // com.gmail.heagoo.apkeditor.p090a.InterfaceC1108d
    /* JADX INFO: renamed from: a */
    public final void mo2954a(Context context, String str, Map map, InterfaceC1110f interfaceC1110f) throws Throwable {
        ZipFile zipFile = null;
        try {
            ZipFile zipFile2 = new ZipFile(str);
            try {
                for (Map.Entry entry : this.f4341b.entrySet()) {
                    String str2 = (String) entry.getKey();
                    Map map2 = (Map) entry.getValue();
                    if (str2.startsWith(this.f4340a)) {
                        String strSubstring = str2.substring(this.f4340a.length());
                        InputStream inputStream = zipFile2.getInputStream(zipFile2.getEntry(strSubstring));
                        String str3 = str2 + ".bin";
                        m3581a(inputStream, str3, map2);
                        map.put(strSubstring, str3);
                        inputStream.close();
                    }
                }
                zipFile2.close();
                m3580a(zipFile2);
            } catch (Throwable th) {
                th = th;
                zipFile = zipFile2;
                m3580a(zipFile);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
