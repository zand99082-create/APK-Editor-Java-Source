package com.gmail.heagoo.apkeditor.p096e;

import com.gmail.heagoo.apkeditor.ApkInfoActivity;
import com.gmail.heagoo.apkeditor.pro.R;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.e.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1242g {

    /* JADX INFO: renamed from: a */
    protected int f3603a;

    /* JADX INFO: renamed from: b */
    private String f3604b;

    /* JADX INFO: renamed from: a */
    public static String m3178a(InterfaceC1237b interfaceC1237b, String str) {
        int i;
        int i2 = 0;
        ArrayList arrayList = new ArrayList();
        int iIndexOf = str.indexOf("${", 0);
        while (iIndexOf != -1) {
            int i3 = iIndexOf + 2;
            int iIndexOf2 = str.indexOf("}", i3);
            if (iIndexOf2 == -1) {
                break;
            }
            String strMo3159a = interfaceC1237b.mo3159a(str.substring(i3, iIndexOf2));
            if (strMo3159a != null) {
                arrayList.add(new C1243h(i3 - 2, iIndexOf2 + 1, strMo3159a));
            }
            iIndexOf = str.indexOf("${", iIndexOf2);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (true) {
            i = i2;
            if (!it.hasNext()) {
                break;
            }
            C1243h c1243h = (C1243h) it.next();
            int i4 = c1243h.f3605a;
            if (i4 > i) {
                sb.append(str.substring(i, i4));
            }
            sb.append(c1243h.f3607c);
            i2 = c1243h.f3606b;
        }
        if (i < str.length()) {
            sb.append(str.substring(i));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    static String m3179a(BufferedReader bufferedReader, List list, boolean z, List list2) throws IOException {
        String line = bufferedReader.readLine();
        while (line != null) {
            if (z) {
                line = line.trim();
            }
            if (list2.contains(line)) {
                break;
            }
            list.add(line);
            line = bufferedReader.readLine();
        }
        return line;
    }

    /* JADX INFO: renamed from: a */
    protected static void m3180a(InterfaceC1237b interfaceC1237b, List list) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= list.size()) {
                return;
            }
            String strM3178a = m3178a(interfaceC1237b, (String) list.get(i2));
            if (strM3178a != null) {
                list.set(i2, strM3178a);
            }
            i = i2 + 1;
        }
    }

    /* JADX INFO: renamed from: a */
    protected static void m3181a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    protected static void m3182a(ZipFile zipFile) {
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (IOException e) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m3183a(ApkInfoActivity apkInfoActivity, ZipFile zipFile, ZipEntry zipEntry, String str, InterfaceC1237b interfaceC1237b) {
        InputStream inputStream;
        boolean z = false;
        String str2 = str + "/" + zipEntry.getName();
        String strM3185d = m3185d(str2);
        while (!apkInfoActivity.m2724j().m3321e(strM3185d)) {
            strM3185d = m3185d(strM3185d);
        }
        String[] strArrSplit = str2.substring(strM3185d.length() + 1).split("/");
        if (strArrSplit.length > 1) {
            String str3 = strM3185d;
            for (int i = 0; i < strArrSplit.length - 1; i++) {
                try {
                    apkInfoActivity.m2724j().m3305a(str3, strArrSplit[i], false);
                    str3 = str3 + "/" + strArrSplit[i];
                } catch (Exception e) {
                    interfaceC1237b.mo3162a(R.string.failed_create_dir, e.getMessage());
                }
            }
            inputStream = null;
            try {
                try {
                    inputStream = zipFile.getInputStream(zipEntry);
                    apkInfoActivity.m2724j().m3299a(str2, inputStream);
                    m3181a(inputStream);
                    z = true;
                } catch (Exception e2) {
                    interfaceC1237b.mo3162a(R.string.general_error, e2.getMessage());
                    m3181a(inputStream);
                }
            } catch (Throwable th) {
                m3181a(inputStream);
                throw th;
            }
        } else {
            inputStream = null;
            inputStream = zipFile.getInputStream(zipEntry);
            apkInfoActivity.m2724j().m3299a(str2, inputStream);
            m3181a(inputStream);
            z = true;
        }
        return z;
    }

    /* JADX INFO: renamed from: c */
    static boolean m3184c(String str) {
        int iLastIndexOf;
        if (str == null || (iLastIndexOf = str.lastIndexOf(47)) == -1) {
            return false;
        }
        String strSubstring = str.substring(0, iLastIndexOf);
        return "smali".equals(strSubstring) || strSubstring.startsWith("smali_");
    }

    /* JADX INFO: renamed from: d */
    private static String m3185d(String str) {
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf > 0) {
            return str.substring(0, iLastIndexOf);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public abstract String mo3186a(ApkInfoActivity apkInfoActivity, ZipFile zipFile, InterfaceC1237b interfaceC1237b);

    /* JADX INFO: renamed from: a */
    final String m3187a(String str) {
        File file = new File(str);
        StringBuilder sb = new StringBuilder(((int) file.length()) + 32);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        try {
            String line = bufferedReader.readLine();
            if (line != null) {
                sb.append(line);
            }
            while (true) {
                String line2 = bufferedReader.readLine();
                if (line2 == null) {
                    return sb.toString();
                }
                sb.append("\n");
                sb.append(line2);
            }
        } finally {
            m3181a(bufferedReader);
        }
    }

    /* JADX INFO: renamed from: a */
    final void m3188a(ApkInfoActivity apkInfoActivity, String str, InterfaceC1232a interfaceC1232a, InterfaceC1237b interfaceC1237b) throws Throwable {
        ZipFile zipFile;
        String strM2722i = apkInfoActivity.m2722i();
        try {
            zipFile = new ZipFile(str);
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                while (enumerationEntries.hasMoreElements()) {
                    ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                    if (!zipEntryNextElement.isDirectory()) {
                        if (!(interfaceC1232a != null ? interfaceC1232a.mo3146a(apkInfoActivity, zipFile, zipEntryNextElement) : false)) {
                            m3183a(apkInfoActivity, zipFile, zipEntryNextElement, strM2722i, interfaceC1237b);
                        }
                    }
                }
                zipFile.close();
            } catch (Throwable th) {
                th = th;
                if (zipFile != null) {
                    try {
                        zipFile.close();
                    } catch (IOException e) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            zipFile = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo3189a(C1238c c1238c, InterfaceC1237b interfaceC1237b);

    /* JADX INFO: renamed from: a */
    public abstract boolean mo3190a();

    /* JADX INFO: renamed from: a */
    public abstract boolean mo3191a(InterfaceC1237b interfaceC1237b);

    /* JADX INFO: renamed from: a */
    final boolean m3192a(String str, C1238c c1238c) {
        if (!"NAME:".equals(str)) {
            return false;
        }
        this.f3604b = c1238c.readLine();
        if (this.f3604b != null) {
            this.f3604b = this.f3604b.trim();
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final String m3193b() {
        return this.f3604b;
    }

    /* JADX INFO: renamed from: b */
    final List m3194b(String str) {
        ArrayList arrayList = new ArrayList();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(str)));
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return arrayList;
                }
                if (!"".equals(line.trim())) {
                    arrayList.add(line);
                }
            } finally {
                m3181a(bufferedReader);
            }
        }
    }
}
