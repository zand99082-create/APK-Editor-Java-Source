package com.gmail.heagoo.apkeditor.p096e;

import android.util.Log;
import com.gmail.heagoo.apkeditor.ApkInfoActivity;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.e.t */
/* JADX INFO: loaded from: classes.dex */
final class C1255t implements InterfaceC1232a {

    /* JADX INFO: renamed from: a */
    private String f3646a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C1254s f3647b;

    C1255t(C1254s c1254s, String str) {
        this.f3647b = c1254s;
        this.f3646a = str;
    }

    /* JADX INFO: renamed from: a */
    private String m3214a(String str) {
        boolean z = false;
        String strReplace = str;
        for (int iIndexOf = str.indexOf("0x7f"); iIndexOf != -1 && iIndexOf + 10 <= strReplace.length(); iIndexOf = strReplace.indexOf("0x7f", iIndexOf + 10)) {
            String strSubstring = strReplace.substring(iIndexOf, iIndexOf + 10);
            int i = this.f3647b.f3645c.get(C1236ad.m3157b(strSubstring));
            if (i != 0) {
                strReplace = strReplace.replace(strSubstring, "0x" + Integer.toHexString(i));
                z = true;
            } else {
                Log.e("DEBUG", "Cannot find id " + strSubstring);
            }
        }
        return (z && strReplace.trim().startsWith("const/high16 v")) ? strReplace.replace("const/high16 v", "const v") : strReplace;
    }

    /* JADX INFO: renamed from: a */
    private List m3215a(ZipFile zipFile, ZipEntry zipEntry) throws Throwable {
        BufferedReader bufferedReader;
        ArrayList arrayList = new ArrayList();
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(zipFile.getInputStream(zipEntry)));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        C1254s.m3181a(bufferedReader);
                        return arrayList;
                    }
                    arrayList.add(line);
                } catch (Throwable th) {
                    th = th;
                    C1254s.m3181a(bufferedReader);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3216a(String str, ZipFile zipFile, ZipEntry zipEntry) throws Throwable {
        List listM3215a = m3215a(zipFile, zipEntry);
        BufferedWriter bufferedWriter = null;
        try {
            File parentFile = new File(str).getParentFile();
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(str)));
            int i = 0;
            while (true) {
                try {
                    int i2 = i;
                    if (i2 >= listM3215a.size()) {
                        C1254s.m3181a(bufferedWriter2);
                        return;
                    } else {
                        bufferedWriter2.write(m3214a((String) listM3215a.get(i2)));
                        bufferedWriter2.write(10);
                        i = i2 + 1;
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    C1254s.m3181a(bufferedWriter);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: b */
    private void m3217b(String str, ZipFile zipFile, ZipEntry zipEntry) throws Throwable {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(zipFile.getInputStream(zipEntry)));
        } catch (Throwable th) {
            th = th;
            bufferedReader = null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    this.f3647b.m3213b(str, arrayList);
                    C1254s.m3181a(bufferedReader);
                    return;
                } else {
                    String strTrim = line.trim();
                    if (!strTrim.startsWith("<?xml") && !strTrim.startsWith("<resources>") && !strTrim.startsWith("</resources>")) {
                        arrayList.add(strTrim);
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            C1254s.m3181a(bufferedReader);
            throw th;
        }
    }

    @Override // com.gmail.heagoo.apkeditor.p096e.InterfaceC1232a
    /* JADX INFO: renamed from: a */
    public final boolean mo3146a(ApkInfoActivity apkInfoActivity, ZipFile zipFile, ZipEntry zipEntry) throws Throwable {
        int iIndexOf;
        String name = zipEntry.getName();
        String str = this.f3646a + "/" + name;
        if ("res/values/public.xml".equals(name)) {
            return true;
        }
        if (this.f3647b.f3645c != null && name.endsWith(".smali") && ((name.startsWith("smali/") || name.startsWith("smali_")) && (iIndexOf = name.indexOf(47)) != -1)) {
            m3216a(str, zipFile, zipEntry);
            apkInfoActivity.m2724j().m3314c(name.substring(0, iIndexOf + 1) + "a.smali", str);
            return true;
        }
        File file = new File(str);
        if (!file.exists()) {
            if (name.startsWith("res/")) {
                file.getParentFile().mkdirs();
            }
            return false;
        }
        if (name.endsWith(".xml")) {
            String[] strArrSplit = name.split("/");
            if (strArrSplit.length == 3 && strArrSplit[0].equals("res") && (strArrSplit[1].equals("values") || strArrSplit[1].startsWith("values-"))) {
                m3217b(str, zipFile, zipEntry);
                return true;
            }
        }
        return false;
    }
}
