package com.gmail.heagoo.apkeditor.p098se;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.se.z */
/* JADX INFO: loaded from: classes.dex */
public final class C1453z {

    /* JADX INFO: renamed from: f */
    private static final String[] f4280f = {"res/drawable", "res/mipmap"};

    /* JADX INFO: renamed from: a */
    List f4281a = new ArrayList();

    /* JADX INFO: renamed from: b */
    HashMap f4282b = new HashMap();

    /* JADX INFO: renamed from: c */
    Map f4283c = new HashMap();

    /* JADX INFO: renamed from: d */
    List f4284d = new ArrayList();

    /* JADX INFO: renamed from: e */
    private String f4285e;

    public C1453z(String str) {
        this.f4285e = str;
    }

    /* JADX INFO: renamed from: a */
    private void m3551a(String str, String str2, boolean z) {
        List arrayList = (List) this.f4283c.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f4283c.put(str, arrayList);
        }
        if (!z) {
            arrayList.add(new C1452y(str2, false));
        } else if (this.f4283c.get(str + str2 + "/") == null) {
            arrayList.add(new C1452y(str2, true));
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m3552a(ZipFile zipFile) {
        try {
            zipFile.close();
        } catch (IOException e) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3553a(String str) {
        String[] strArr = {".wav", ".mp2", ".mp3", ".ogg", ".aac", ".mpg", ".mpeg", ".mid", ".midi", ".smf", ".jet", ".rtttl", ".imy", ".xmf", ".mp4", ".m4a", ".m4v", ".3gp", ".3gpp", ".3g2", ".3gpp2", ".amr", ".awb", ".wma", ".wmv"};
        for (int i = 0; i < 25; i++) {
            if (str.endsWith(strArr[i])) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    private static boolean m3554b(String str) {
        String[] strArr = f4280f;
        for (int i = 0; i < 2; i++) {
            if (str.startsWith(strArr[i])) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final void m3555a() throws Throwable {
        ZipFile zipFile;
        try {
            zipFile = new ZipFile(this.f4285e);
            try {
                try {
                    Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                    while (enumerationEntries.hasMoreElements()) {
                        ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                        String name = zipEntryNextElement.getName();
                        if (!zipEntryNextElement.isDirectory()) {
                            String[] strArrSplit = name.split("/");
                            String str = "/";
                            for (int i = 0; i < strArrSplit.length - 1; i++) {
                                String str2 = strArrSplit[i];
                                m3551a(str, str2, true);
                                str = str + str2 + "/";
                            }
                            m3551a(str, strArrSplit[strArrSplit.length - 1], false);
                            if (m3554b(name)) {
                                int iIndexOf = name.indexOf(47, 11);
                                if (iIndexOf != -1 && name.indexOf(47, iIndexOf + 1) == -1 && (name.endsWith(".png") || name.endsWith(".jpg") || name.endsWith(".jpeg") || name.endsWith("bmp"))) {
                                    int iLastIndexOf = name.lastIndexOf(47);
                                    String strSubstring = iLastIndexOf != -1 ? name.substring(iLastIndexOf + 1) : name;
                                    int length = (name.length() - strSubstring.length()) - 1;
                                    String strSubstring2 = length > 0 ? name.substring(0, length) : "";
                                    C1434g c1434g = (C1434g) this.f4282b.get(strSubstring);
                                    if (c1434g == null) {
                                        this.f4281a.add(strSubstring);
                                        this.f4282b.put(strSubstring, new C1434g(strSubstring, strSubstring2));
                                    } else {
                                        c1434g.m3536a(strSubstring2);
                                    }
                                }
                            } else if (m3553a(name)) {
                                this.f4284d.add(name);
                            }
                        }
                    }
                    m3552a(zipFile);
                } catch (Exception e) {
                    e = e;
                    e.printStackTrace();
                    m3552a(zipFile);
                }
            } catch (Throwable th) {
                th = th;
                m3552a(zipFile);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            zipFile = null;
        } catch (Throwable th2) {
            th = th2;
            zipFile = null;
            m3552a(zipFile);
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m3556b() {
        return this.f4285e;
    }
}
