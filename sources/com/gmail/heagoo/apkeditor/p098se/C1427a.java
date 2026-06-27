package com.gmail.heagoo.apkeditor.p098se;

import com.gmail.heagoo.apkeditor.ApkInfoActivity;
import com.gmail.heagoo.apkeditor.SettingActivity;
import com.gmail.heagoo.apkeditor.p090a.InterfaceC1108d;
import com.gmail.heagoo.apkeditor.p090a.InterfaceC1110f;
import com.gmail.heagoo.apkeditor.p090a.p091a.C1101t;
import com.gmail.heagoo.apkeditor.p093b.C1149e;
import com.gmail.heagoo.p084a.p089c.C1067a;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.se.a */
/* JADX INFO: loaded from: classes.dex */
final class C1427a extends Thread {

    /* JADX INFO: renamed from: a */
    private WeakReference f4206a;

    /* JADX INFO: renamed from: b */
    private String f4207b;

    /* JADX INFO: renamed from: c */
    private String f4208c;

    C1427a(ApkCreateActivity apkCreateActivity) {
        this.f4206a = new WeakReference(apkCreateActivity);
    }

    /* JADX INFO: renamed from: a */
    private static void m3518a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m3519a(ZipFile zipFile) {
        try {
            zipFile.close();
        } catch (IOException e) {
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m3520a() {
        return this.f4208c;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x00ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        InputStream inputStream;
        ZipFile zipFile;
        String str;
        ZipFile zipFile2 = null;
        ApkCreateActivity apkCreateActivity = (ApkCreateActivity) this.f4206a.get();
        try {
            if (apkCreateActivity.f4179z != null) {
                Iterator it = apkCreateActivity.f4179z.iterator();
                while (it.hasNext()) {
                    ((InterfaceC1108d) it.next()).mo2954a(apkCreateActivity, apkCreateActivity.f4155b, apkCreateActivity.f4158e, (InterfaceC1110f) this.f4206a.get());
                }
            }
            if (apkCreateActivity.f4159f != null) {
                String str2 = apkCreateActivity.f4176w + ".dex";
                new C1149e(apkCreateActivity.f4155b).m3061a(apkCreateActivity.f4159f, str2);
                apkCreateActivity.f4158e.put("classes.dex", str2);
            }
            if (apkCreateActivity.f4160g != null) {
                try {
                    ApkCreateActivity apkCreateActivity2 = (ApkCreateActivity) this.f4206a.get();
                    zipFile = new ZipFile(apkCreateActivity2.f4155b);
                    try {
                        inputStream = zipFile.getInputStream(zipFile.getEntry("resources.arsc"));
                        try {
                            String str3 = apkCreateActivity2.f4176w + ".arsc";
                            C1101t c1101t = new C1101t(inputStream, str3);
                            if (apkCreateActivity2.f4160g != null) {
                                c1101t.m2983a(apkCreateActivity2.f4160g);
                            }
                            if (apkCreateActivity2.f4162i != null || apkCreateActivity2.f4160g != null) {
                                c1101t.m2984a(apkCreateActivity2.f4161h, apkCreateActivity2.f4162i, apkCreateActivity2.f4175v.f4630b, apkCreateActivity2.f4160g);
                            }
                            c1101t.m2982a();
                            apkCreateActivity2.f4158e.put("resources.arsc", str3);
                            m3518a(inputStream);
                            m3519a(zipFile);
                        } catch (Exception e) {
                            e = e;
                            zipFile2 = zipFile;
                            try {
                                e.printStackTrace();
                                m3518a(inputStream);
                                m3519a(zipFile2);
                            } catch (Throwable th) {
                                th = th;
                                zipFile = zipFile2;
                                m3518a(inputStream);
                                m3519a(zipFile);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            m3518a(inputStream);
                            m3519a(zipFile);
                            throw th;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        inputStream = null;
                        zipFile2 = zipFile;
                    } catch (Throwable th3) {
                        th = th3;
                        inputStream = null;
                    }
                } catch (Exception e3) {
                    e = e3;
                    inputStream = null;
                } catch (Throwable th4) {
                    th = th4;
                    inputStream = null;
                    zipFile = null;
                }
            } else {
                if ((apkCreateActivity.f4161h == null || apkCreateActivity.f4162i == null || apkCreateActivity.f4161h.equals(apkCreateActivity.f4162i)) ? false : true) {
                }
            }
            ApkCreateActivity.m3502g(apkCreateActivity);
            switch (SettingActivity.m2809d(apkCreateActivity)) {
                case 0:
                    str = apkCreateActivity.f4156c + "_signed";
                    break;
                case 1:
                default:
                    str = "gen_signed";
                    break;
                case 2:
                    str = apkCreateActivity.f4175v.f4629a + "_signed";
                    break;
            }
            String str4 = apkCreateActivity.f4155b;
            this.f4207b = ApkInfoActivity.m2642a(str4, apkCreateActivity.f4176w, str);
            Map map = apkCreateActivity.f4158e;
            HashMap map2 = new HashMap();
            map2.putAll(map);
            C1067a.m2467a(apkCreateActivity, str4, this.f4207b, map2, (Map<String, String>) null, (Set<String>) null);
            apkCreateActivity.f4154a.sendEmptyMessage(0);
        } catch (Throwable th5) {
            String simpleName = th5.getClass().getSimpleName();
            String message = th5.getMessage();
            if (message == null) {
                this.f4208c = simpleName;
            } else {
                this.f4208c = simpleName + ": " + message;
            }
            apkCreateActivity.f4154a.sendEmptyMessage(1);
            th5.printStackTrace();
        }
    }
}
