package com.gmail.heagoo.apkeditor.p097f;

import android.content.Context;
import android.os.AsyncTask;
import com.gmail.heagoo.p084a.p089c.C1067a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.f.a */
/* JADX INFO: loaded from: classes.dex */
public final class AsyncTaskC1287a extends AsyncTask {

    /* JADX INFO: renamed from: a */
    private Context f3740a;

    /* JADX INFO: renamed from: b */
    private InterfaceC1288b f3741b;

    /* JADX INFO: renamed from: c */
    private String f3742c;

    /* JADX INFO: renamed from: d */
    private String f3743d;

    /* JADX INFO: renamed from: e */
    private List f3744e = new ArrayList();

    /* JADX INFO: renamed from: f */
    private String f3745f;

    /* JADX INFO: renamed from: g */
    private String f3746g;

    public AsyncTaskC1287a(Context context, String str, String str2, InterfaceC1288b interfaceC1288b) {
        this.f3740a = context;
        this.f3741b = interfaceC1288b;
        this.f3743d = str;
        this.f3742c = str2;
    }

    /* JADX INFO: renamed from: a */
    private void m3264a(ZipFile zipFile, ZipEntry zipEntry, String str) throws Throwable {
        FileOutputStream fileOutputStream;
        InputStream inputStream = null;
        try {
            InputStream inputStream2 = zipFile.getInputStream(zipEntry);
            try {
                fileOutputStream = new FileOutputStream(str);
            } catch (Throwable th) {
                th = th;
                fileOutputStream = null;
                inputStream = inputStream2;
            }
            try {
                C1067a.m2506b(inputStream2, fileOutputStream);
                this.f3744e.add(str);
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (Exception e) {
                    }
                }
                try {
                    fileOutputStream.close();
                } catch (Exception e2) {
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream = inputStream2;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Exception e3) {
                    }
                }
                if (fileOutputStream == null) {
                    throw th;
                }
                try {
                    fileOutputStream.close();
                    throw th;
                } catch (Exception e4) {
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m3265b() throws Throwable {
        ZipFile zipFile;
        String strM2525d = C1067a.m2525d(this.f3740a, "tmp");
        try {
            zipFile = new ZipFile(this.f3743d);
            try {
                try {
                    Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                    while (enumerationEntries.hasMoreElements()) {
                        ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                        String name = zipEntryNextElement.getName();
                        if (name.endsWith(".dex") && !name.contains("/")) {
                            m3264a(zipFile, zipEntryNextElement, strM2525d + name);
                        }
                    }
                    try {
                        zipFile.close();
                    } catch (Exception e) {
                    }
                } catch (IOException e2) {
                    e = e2;
                    e.printStackTrace();
                    if (zipFile != null) {
                        try {
                            zipFile.close();
                        } catch (Exception e3) {
                        }
                    }
                }
            } catch (Throwable th) {
                th = th;
                if (zipFile != null) {
                    try {
                        zipFile.close();
                    } catch (Exception e4) {
                    }
                }
                throw th;
            }
        } catch (IOException e5) {
            e = e5;
            zipFile = null;
        } catch (Throwable th2) {
            th = th2;
            zipFile = null;
            if (zipFile != null) {
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    private Boolean m3266c() throws Throwable {
        try {
            m3265b();
            m3268e();
            m3267d();
            return true;
        } catch (Exception e) {
            this.f3745f = e.getMessage();
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    private void m3267d() {
        Iterator it = this.f3744e.iterator();
        while (it.hasNext()) {
            new File((String) it.next()).delete();
        }
    }

    /* JADX INFO: renamed from: e */
    private void m3268e() {
        for (String str : this.f3744e) {
            Object objM2453a = C1067a.m2453a("com.gmail.heagoo.apkeditor.pro.DexDecoder", new Class[]{String.class}, new Object[]{str});
            String str2 = !str.endsWith("/classes.dex") ? this.f3742c + "/smali_" + str.substring(str.lastIndexOf("/") + 1, str.length() - 4) : this.f3742c + "/smali";
            File file = new File(str2);
            if (file.exists()) {
                file.mkdir();
            }
            C1067a.m2451a("com.gmail.heagoo.apkeditor.pro.DexDecoder", "dex2smali", objM2453a, new Class[]{String.class}, new Object[]{str2});
            if (this.f3746g == null) {
                this.f3746g = (String) C1067a.m2451a("com.gmail.heagoo.apkeditor.pro.DexDecoder", "getWarning", objM2453a, null, null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3269a() throws Throwable {
        ZipFile zipFile;
        String strM2525d = C1067a.m2525d(this.f3740a, "tmp");
        try {
            zipFile = new ZipFile(this.f3743d);
            try {
                try {
                    m3264a(zipFile, zipFile.getEntry("classes.dex"), strM2525d + "classes.dex");
                    try {
                        zipFile.close();
                    } catch (Exception e) {
                    }
                } catch (IOException e2) {
                    e = e2;
                    e.printStackTrace();
                    if (zipFile != null) {
                        try {
                            zipFile.close();
                        } catch (Exception e3) {
                        }
                    }
                }
            } catch (Throwable th) {
                th = th;
                if (zipFile != null) {
                    try {
                        zipFile.close();
                    } catch (Exception e4) {
                    }
                }
                throw th;
            }
        } catch (IOException e5) {
            e = e5;
            zipFile = null;
        } catch (Throwable th2) {
            th = th2;
            zipFile = null;
            if (zipFile != null) {
            }
            throw th;
        }
        m3268e();
        m3267d();
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m3266c();
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Object obj) {
        Boolean bool = (Boolean) obj;
        if (this.f3741b != null) {
            if (bool.booleanValue()) {
                this.f3741b.mo2702a(true, null, this.f3746g);
            } else {
                this.f3741b.mo2702a(false, this.f3745f, null);
            }
        }
    }

    @Override // android.os.AsyncTask
    protected final void onPreExecute() {
        if (this.f3741b != null) {
            this.f3741b.mo2720h();
        }
    }
}
