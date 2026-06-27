package com.gmail.heagoo.apkeditor.util;

import android.content.Context;
import com.android.apksig.apk.ApkUtils;
import com.gmail.heagoo.apkeditor.gzd;
import com.gmail.heagoo.common.C1574w;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.util.f */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1465f {

    /* JADX INFO: renamed from: a */
    protected String f4350a;

    /* JADX INFO: renamed from: b */
    protected String f4351b;

    /* JADX INFO: renamed from: c */
    HashSet f4352c = new HashSet();

    /* JADX INFO: renamed from: d */
    int f4353d = 0;

    AbstractC1465f(String str, String str2) {
        this.f4350a = str;
        if (!str.endsWith("/")) {
            this.f4350a += "/";
        }
        this.f4351b = str2;
    }

    /* JADX INFO: renamed from: a */
    private static String m3590a(File file, List list) {
        String name = file.getName();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1484y c1484y = (C1484y) it.next();
            if (name.startsWith(c1484y.f4411b)) {
                String strSubstring = name.substring(c1484y.f4411b.length());
                if (strSubstring.equals("")) {
                    return c1484y.f4412c + strSubstring;
                }
                if ((strSubstring.charAt(0) != '.' || strSubstring.indexOf(46, 1) != -1) && !strSubstring.equals(".9.png")) {
                }
                return c1484y.f4412c + strSubstring;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private static String m3591a(String str, String str2, Map map) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = Pattern.compile(str2).matcher(str);
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String str3 = (String) map.get(matcher.group(1));
            if (str3 != null) {
                arrayList.add(new C1466g(matcher.start(1), matcher.end(1), str3));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return m3596b(str, arrayList);
    }

    /* JADX INFO: renamed from: a */
    protected static void m3592a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3593a(String str, String str2) throws Throwable {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream(str);
            try {
                try {
                    fileOutputStream.write(str2.getBytes());
                    this.f4352c.add(str);
                    m3592a(fileOutputStream);
                } catch (IOException e) {
                    e = e;
                    e.printStackTrace();
                    m3592a(fileOutputStream);
                }
            } catch (Throwable th) {
                th = th;
                m3592a(fileOutputStream);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            fileOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
            m3592a(fileOutputStream);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00ae  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m3594a(File file, Map map) throws Throwable {
        String strM3596b;
        boolean z;
        String str;
        char cCharAt;
        try {
            String strM3799b = new C1574w(file.getPath()).m3799b();
            int iIndexOf = strM3799b.indexOf(64, 0);
            if (iIndexOf != -1) {
                ArrayList arrayList = new ArrayList();
                int iIndexOf2 = iIndexOf;
                while (iIndexOf2 != -1) {
                    int i = iIndexOf2 + 1;
                    while (i < strM3799b.length()) {
                        char cCharAt2 = strM3799b.charAt(i);
                        if (cCharAt2 == '/') {
                            z = true;
                            break;
                        }
                        if (cCharAt2 == '\"' || cCharAt2 == '<' || cCharAt2 == '\n') {
                            break;
                        }
                        i++;
                    }
                    z = false;
                    if (z) {
                        String strSubstring = strM3799b.substring(iIndexOf2 + 1, i);
                        int i2 = i + 1;
                        while (i2 < strM3799b.length() && (cCharAt = strM3799b.charAt(i2)) != '\"' && cCharAt != '<' && cCharAt != '\n') {
                            i2++;
                        }
                        Map map2 = (Map) map.get(strSubstring);
                        if (map2 != null && (str = (String) map2.get(strM3799b.substring(i + 1, i2))) != null) {
                            arrayList.add(new C1466g(i + 1, i2, str));
                        }
                        iIndexOf2 = strM3799b.indexOf(64, i2);
                    } else {
                        iIndexOf2 = strM3799b.indexOf(64, i);
                    }
                }
                strM3596b = !arrayList.isEmpty() ? m3596b(strM3799b, arrayList) : null;
            }
            boolean z2 = strM3596b != null;
            if (!z2) {
                return z2;
            }
            m3593a(file.getPath(), strM3596b);
            return z2;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m3595a(String str) {
        String[] strArr = {"bools.xml", "colors.xml", "dimens.xml", "ids.xml", "integers.xml", "public.xml", "strings.xml"};
        for (int i = 0; i < 7; i++) {
            if (strArr[i].equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    private static String m3596b(String str, List list) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        Iterator it = list.iterator();
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                sb.append(str.substring(i2));
                return sb.toString();
            }
            C1466g c1466g = (C1466g) it.next();
            sb.append(str.substring(i2, c1466g.f4354a));
            sb.append(c1466g.f4356c);
            i = c1466g.f4355b;
        }
    }

    /* JADX INFO: renamed from: b */
    private void m3597b(List list) throws Throwable {
        File file;
        File[] fileArrListFiles = new File(this.f4350a + "res").listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory() && file2.getName().startsWith("values")) {
                    file = new File(file2, "styles.xml");
                    if (!file.exists()) {
                        file = null;
                    }
                } else {
                    file = null;
                }
                if (file != null) {
                    String path = file.getPath();
                    try {
                        String strM3799b = new C1574w(path).m3799b();
                        Iterator it = list.iterator();
                        String str = strM3799b;
                        boolean z = false;
                        while (it.hasNext()) {
                            C1484y c1484y = (C1484y) it.next();
                            int length = str.length();
                            String strReplace = str.replace("item name=\"" + c1484y.f4411b + "\"", "item name=\"" + c1484y.f4412c + "\"");
                            z = strReplace.length() != length ? true : z;
                            str = strReplace;
                        }
                        if (z) {
                            m3593a(path, str);
                        }
                    } catch (IOException e) {
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    protected final int m3598a(List list) {
        File[] fileArrListFiles = new File(this.f4350a + "res").listFiles();
        if (fileArrListFiles == null) {
            return 0;
        }
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1484y c1484y = (C1484y) it.next();
            Map map2 = (Map) map.get(c1484y.f4410a);
            if (map2 == null) {
                map2 = new HashMap();
                map.put(c1484y.f4410a, map2);
            }
            map2.put(c1484y.f4411b, c1484y.f4412c);
        }
        int i = 0;
        for (File file : fileArrListFiles) {
            String name = file.getName();
            if (!name.startsWith("raw")) {
                boolean zEquals = "values".equals(name);
                File[] fileArrListFiles2 = file.listFiles();
                if (fileArrListFiles2 != null) {
                    for (File file2 : fileArrListFiles2) {
                        if (file2.isFile()) {
                            String name2 = file2.getName();
                            if (name2.endsWith(".xml") && ((!zEquals || !m3595a(name2)) && m3594a(file2, map))) {
                                i++;
                            }
                        }
                    }
                }
            }
        }
        File file3 = new File(this.f4350a + ApkUtils.ANDROID_MANIFEST_ZIP_ENTRY_NAME);
        return (file3.exists() && m3594a(file3, map)) ? i + 1 : i;
    }

    /* JADX INFO: renamed from: a */
    public abstract String mo3599a(Context context);

    /* JADX INFO: renamed from: a */
    protected final void m3600a(String str, List list) throws Throwable {
        File[] fileArrListFiles;
        File file;
        String strM3591a;
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1484y c1484y = (C1484y) it.next();
            map.put(c1484y.f4411b, c1484y.f4412c);
        }
        String str2 = "plurals".equals(str) ? "plurals.xml" : str + "s.xml";
        File[] fileArrListFiles2 = new File(this.f4350a + "res").listFiles();
        if (fileArrListFiles2 != null) {
            for (File file2 : fileArrListFiles2) {
                if (file2.isDirectory() && file2.getName().startsWith("values")) {
                    File file3 = new File(file2, str2);
                    file = !file3.exists() ? null : file3;
                } else {
                    file = null;
                }
                if (file != null) {
                    try {
                        String strM3799b = new C1574w(file.getPath()).m3799b();
                        if (gzd.COLUMN_ID.equals(str)) {
                            strM3591a = m3591a(strM3799b, "name=\"(.*?)\"", map);
                        } else if ("drawable".equals(str) || "dimen".equals(str) || "color".equals(str)) {
                            String strM3591a2 = m3591a(strM3799b, "@" + str + "/(.*?)<", map);
                            if (strM3591a2 != null) {
                                strM3799b = strM3591a2;
                            }
                            strM3591a = m3591a(strM3799b, "name=\"(.*?)\"", map);
                        } else {
                            strM3591a = m3591a(strM3799b, str + " name=\"(.*?)\"", map);
                        }
                        if (strM3591a != null) {
                            m3593a(file.getPath(), strM3591a);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        if ("attr".equals(str)) {
            m3597b(list);
            return;
        }
        File[] fileArrListFiles3 = new File(this.f4350a + "res").listFiles();
        if (fileArrListFiles3 != null) {
            for (File file4 : fileArrListFiles3) {
                if (!file4.isFile()) {
                    String name = file4.getName();
                    if ((name.startsWith(str) || name.startsWith(str + "-")) && (fileArrListFiles = file4.listFiles()) != null) {
                        for (File file5 : fileArrListFiles) {
                            String strM3590a = m3590a(file5, list);
                            if (strM3590a != null) {
                                file5.renameTo(new File(file4, strM3590a));
                                this.f4353d++;
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo3601a();

    /* JADX INFO: renamed from: b */
    public abstract void mo3602b();

    /* JADX INFO: renamed from: c */
    public abstract boolean mo3603c();

    /* JADX INFO: renamed from: d */
    public abstract Map mo3604d();
}
