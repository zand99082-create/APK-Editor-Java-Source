package com.gmail.heagoo.common;

import com.gmail.heagoo.p084a.p089c.C1067a;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.gmail.heagoo.common.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1559h {

    /* JADX INFO: renamed from: a */
    private static final char[] f4643a = {'\"', '/', '\\', ':', '*', '?', '<', '>', '|'};

    /* JADX INFO: renamed from: a */
    public static long m3768a(File[] fileArr) {
        long j = 0;
        int i = 0;
        while (i < 2) {
            long jM3775b = m3775b(fileArr[i]);
            if (jM3775b <= j) {
                jM3775b = j;
            }
            i++;
            j = jM3775b;
        }
        return j;
    }

    /* JADX INFO: renamed from: a */
    public static String m3769a(String str) {
        if (str == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (m3774a(cCharAt)) {
                sb.append('_');
                z = true;
            } else {
                sb.append(cCharAt);
            }
        }
        return z ? sb.toString() : str;
    }

    /* JADX INFO: renamed from: a */
    public static void m3770a(File file) {
        File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                m3770a(file2);
            }
        }
        file.delete();
    }

    /* JADX INFO: renamed from: a */
    public static void m3771a(File file, File file2) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
                try {
                    C1067a.m2506b(bufferedInputStream2, bufferedOutputStream);
                    bufferedInputStream2.close();
                    bufferedOutputStream.close();
                } catch (Throwable th) {
                    th = th;
                    bufferedInputStream = bufferedInputStream2;
                    if (bufferedInputStream != null) {
                        bufferedInputStream.close();
                    }
                    if (bufferedOutputStream != null) {
                        bufferedOutputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedOutputStream = null;
                bufferedInputStream = bufferedInputStream2;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedOutputStream = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m3772a(String str, String str2) throws Throwable {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(str);
            try {
                fileOutputStream = new FileOutputStream(str2);
            } catch (Throwable th) {
                th = th;
                fileOutputStream = null;
                fileInputStream2 = fileInputStream;
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
        try {
            C1067a.m2506b(fileInputStream, fileOutputStream);
            fileInputStream.close();
            fileOutputStream.close();
        } catch (Throwable th3) {
            th = th3;
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0038 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m3773a(String str, List list) {
        BufferedWriter bufferedWriter;
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                bufferedWriter = new BufferedWriter(new FileWriter(str));
                try {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        bufferedWriter.write((String) it.next());
                        bufferedWriter.write("\n");
                    }
                    try {
                        bufferedWriter.close();
                    } catch (IOException e) {
                    }
                } catch (IOException e2) {
                    e = e2;
                    e.printStackTrace();
                    if (bufferedWriter != null) {
                        try {
                            bufferedWriter.close();
                        } catch (IOException e3) {
                        }
                    }
                }
            } catch (Throwable th) {
                th = th;
                if (0 != 0) {
                    try {
                        bufferedWriter2.close();
                    } catch (IOException e4) {
                    }
                }
                throw th;
            }
        } catch (IOException e5) {
            e = e5;
            bufferedWriter = null;
        } catch (Throwable th2) {
            th = th2;
            if (0 != 0) {
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m3774a(char c) {
        char[] cArr = f4643a;
        for (int i = 0; i < 9; i++) {
            if (c == cArr[i]) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static long m3775b(File file) {
        long jLastModified = file.lastModified();
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                long jM3775b = m3775b(file2);
                if (jM3775b > jLastModified) {
                    jLastModified = jM3775b;
                }
            }
        }
        return jLastModified;
    }
}
