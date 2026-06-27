package com.gmail.heagoo.apkeditor.p096e;

import com.gmail.heagoo.apkeditor.ApkInfoActivity;
import com.gmail.heagoo.apkeditor.pro.R;
import com.gmail.heagoo.p084a.p089c.C1067a;
import dalvik.system.DexClassLoader;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.e.k */
/* JADX INFO: loaded from: classes.dex */
final class C1246k extends AbstractC1242g {

    /* JADX INFO: renamed from: b */
    private String f3611b;

    /* JADX INFO: renamed from: c */
    private String f3612c;

    /* JADX INFO: renamed from: d */
    private String f3613d;

    /* JADX INFO: renamed from: e */
    private String f3614e;

    /* JADX INFO: renamed from: f */
    private boolean f3615f = false;

    /* JADX INFO: renamed from: g */
    private int f3616g = 1;

    /* JADX INFO: renamed from: h */
    private List f3617h = new ArrayList();

    C1246k() {
        this.f3617h.add("[/EXECUTE_DEX]");
        this.f3617h.add("SCRIPT:");
        this.f3617h.add("INTERFACE_VERSION:");
        this.f3617h.add("SMALI_NEEDED:");
        this.f3617h.add("MAIN_CLASS:");
        this.f3617h.add("ENTRANCE:");
        this.f3617h.add("PARAM:");
    }

    /* JADX INFO: renamed from: a */
    private static String m3195a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @Override // com.gmail.heagoo.apkeditor.p096e.AbstractC1242g
    /* JADX INFO: renamed from: a */
    public final String mo3186a(ApkInfoActivity apkInfoActivity, ZipFile zipFile, InterfaceC1237b interfaceC1237b) throws Throwable {
        BufferedInputStream bufferedInputStream;
        BufferedOutputStream bufferedOutputStream;
        String str;
        Throwable targetException;
        BufferedOutputStream bufferedOutputStream2 = null;
        if (this.f3616g != 1) {
            interfaceC1237b.mo3162a(R.string.general_error, "Unsupported interface version: " + this.f3616g);
        } else {
            File dir = apkInfoActivity.getDir("outdex", 0);
            ZipEntry entry = zipFile.getEntry(this.f3611b);
            if (entry == null) {
                interfaceC1237b.mo3162a(R.string.general_error, "Cannot find '" + this.f3611b + "' inside the patch.");
            } else {
                try {
                    str = C1067a.m2525d(apkInfoActivity, "tmp") + "script.dex";
                    bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str));
                } catch (Exception e) {
                    bufferedOutputStream = null;
                    bufferedInputStream = null;
                } catch (Throwable th) {
                    th = th;
                    bufferedInputStream = null;
                }
                try {
                    bufferedInputStream = new BufferedInputStream(zipFile.getInputStream(entry));
                    try {
                        try {
                            C1067a.m2506b(bufferedInputStream, bufferedOutputStream);
                            m3181a(bufferedInputStream);
                            m3181a(bufferedOutputStream);
                            try {
                                Class clsLoadClass = new DexClassLoader(str, dir.getAbsolutePath(), null, apkInfoActivity.getClassLoader()).loadClass(this.f3612c);
                                clsLoadClass.getMethod(this.f3613d, String.class, String.class, String.class, String.class).invoke(clsLoadClass.newInstance(), apkInfoActivity.m2726l(), zipFile.getName(), apkInfoActivity.m2722i(), this.f3614e);
                            } catch (Throwable th2) {
                                if (!(th2 instanceof InvocationTargetException) || (targetException = ((InvocationTargetException) th2).getTargetException()) == null) {
                                    interfaceC1237b.mo3162a(R.string.general_error, m3195a(th2));
                                } else {
                                    interfaceC1237b.mo3162a(R.string.general_error, m3195a(targetException));
                                }
                            }
                        } catch (Exception e2) {
                            interfaceC1237b.mo3162a(R.string.general_error, "Cannot extract '" + this.f3611b + "' to SD card.");
                            m3181a(bufferedInputStream);
                            m3181a(bufferedOutputStream);
                        }
                    } catch (Throwable th3) {
                        bufferedOutputStream2 = bufferedOutputStream;
                        th = th3;
                        m3181a(bufferedInputStream);
                        m3181a(bufferedOutputStream2);
                        throw th;
                    }
                } catch (Exception e3) {
                    bufferedInputStream = null;
                } catch (Throwable th4) {
                    bufferedInputStream = null;
                    bufferedOutputStream2 = bufferedOutputStream;
                    th = th4;
                    m3181a(bufferedInputStream);
                    m3181a(bufferedOutputStream2);
                    throw th;
                }
            }
        }
        return null;
    }

    @Override // com.gmail.heagoo.apkeditor.p096e.AbstractC1242g
    /* JADX INFO: renamed from: a */
    public final void mo3189a(C1238c c1238c, InterfaceC1237b interfaceC1237b) {
        this.f3603a = c1238c.m3170a();
        String line = c1238c.readLine();
        while (line != null) {
            String strTrim = line.trim();
            if ("[/EXECUTE_DEX]".equals(strTrim)) {
                return;
            }
            if (super.m3192a(strTrim, c1238c)) {
                line = c1238c.readLine();
            } else {
                if ("SCRIPT:".equals(strTrim)) {
                    this.f3611b = c1238c.readLine().trim();
                } else if ("MAIN_CLASS:".equals(strTrim)) {
                    this.f3612c = c1238c.readLine().trim();
                } else if ("ENTRANCE:".equals(strTrim)) {
                    this.f3613d = c1238c.readLine().trim();
                } else if ("PARAM:".equals(strTrim)) {
                    ArrayList arrayList = new ArrayList();
                    String strA = m3179a((BufferedReader) c1238c, (List) arrayList, true, this.f3617h);
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < arrayList.size(); i++) {
                        sb.append((String) arrayList.get(i));
                        if (i != arrayList.size() - 1) {
                            sb.append('\n');
                        }
                    }
                    this.f3614e = sb.toString();
                    line = strA;
                } else if ("SMALI_NEEDED:".equals(strTrim)) {
                    this.f3615f = Boolean.valueOf(c1238c.readLine().trim()).booleanValue();
                } else if ("INTERFACE_VERSION:".equals(strTrim)) {
                    this.f3616g = Integer.valueOf(c1238c.readLine().trim()).intValue();
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
        return this.f3615f;
    }

    @Override // com.gmail.heagoo.apkeditor.p096e.AbstractC1242g
    /* JADX INFO: renamed from: a */
    public final boolean mo3191a(InterfaceC1237b interfaceC1237b) {
        if (this.f3611b == null) {
            interfaceC1237b.mo3162a(R.string.patch_error_no_script_name, new Object[0]);
            return false;
        }
        if (this.f3612c == null) {
            interfaceC1237b.mo3162a(R.string.patch_error_no_main_class, new Object[0]);
            return false;
        }
        if (this.f3613d != null) {
            return true;
        }
        interfaceC1237b.mo3162a(R.string.patch_error_no_entrance_func, new Object[0]);
        return false;
    }
}
