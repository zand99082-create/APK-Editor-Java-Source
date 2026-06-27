package com.gmail.heagoo.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Environment;
import android.text.InputFilter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

/* JADX INFO: renamed from: com.gmail.heagoo.common.a */
/* JADX INFO: loaded from: classes.dex */
public class C1552a {
    /* JADX INFO: renamed from: a */
    public static InputFilter m3749a() {
        return new C1565n();
    }

    /* JADX INFO: renamed from: a */
    public static C1553b m3750a(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        PackageInfo packageArchiveInfo = packageManager.getPackageArchiveInfo(str, 0);
        if (packageArchiveInfo == null) {
            return null;
        }
        C1553b c1553b = new C1553b();
        packageArchiveInfo.applicationInfo.sourceDir = str;
        packageArchiveInfo.applicationInfo.publicSourceDir = str;
        c1553b.f4629a = packageArchiveInfo.applicationInfo.loadLabel(packageManager).toString();
        c1553b.f4630b = packageArchiveInfo.packageName;
        c1553b.f4631c = packageArchiveInfo.applicationInfo.loadIcon(packageManager);
        return c1553b;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|2|(1:4)(1:33)|5|(1:9)(1:34)|10|(3:89|11|12)|(4:100|13|(2:15|(4:105|21|(3:107|23|(3:111|25|132)(3:108|35|(3:117|37|(1:130)(3:115|47|(4:116|49|50|125)(1:131)))(3:109|51|(3:118|53|(4:119|55|50|125)(1:124))(1:123))))(1:122)|120)(2:121|120))(1:106)|32)|64|(1:67)|94|68|32|(1:(0))) */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0157 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List m3751b() throws Throwable {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        BufferedReader bufferedReader3;
        HashSet hashSet;
        int i;
        int i2;
        ArrayList arrayList = new ArrayList();
        String path = Environment.getExternalStorageDirectory().getPath();
        boolean z = !Environment.isExternalStorageRemovable();
        String externalStorageState = Environment.getExternalStorageState();
        boolean z2 = externalStorageState.equals("mounted") || externalStorageState.equals("mounted_ro");
        boolean zEquals = Environment.getExternalStorageState().equals("mounted_ro");
        try {
            try {
                hashSet = new HashSet();
                bufferedReader2 = new BufferedReader(new FileReader("/proc/mounts"));
                i = 1;
            } catch (Throwable th) {
                th = th;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e) {
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException e2) {
            e = e2;
            bufferedReader3 = null;
        } catch (IOException e3) {
            e = e3;
            bufferedReader2 = null;
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
            if (bufferedReader != null) {
            }
            throw th;
        }
        while (true) {
            try {
                String line = bufferedReader2.readLine();
                if (line == null) {
                    break;
                }
                if (line.contains("vfat") || line.contains("/mnt") || line.contains("/storage")) {
                    StringTokenizer stringTokenizer = new StringTokenizer(line, " ");
                    stringTokenizer.nextToken();
                    String strNextToken = stringTokenizer.nextToken();
                    if (!hashSet.contains(strNextToken)) {
                        stringTokenizer.nextToken();
                        boolean zContains = Arrays.asList(stringTokenizer.nextToken().split(",")).contains("ro");
                        if (strNextToken.equals(path)) {
                            hashSet.add(path);
                            arrayList.add(0, new C1573v(path, z, zContains, false, -1));
                        } else if (line.contains("/dev/block/vold")) {
                            if (!line.contains("/mnt/secure") && !line.contains("/mnt/asec") && !line.contains("/mnt/obb") && !line.contains("/dev/mapper") && !line.contains("tmpfs")) {
                                hashSet.add(strNextToken);
                                if (new File(strNextToken).canRead()) {
                                    i2 = i + 1;
                                    arrayList.add(new C1573v(strNextToken, false, zContains, true, i));
                                    i = i2;
                                }
                            }
                        } else if (line.contains("/dev/fuse")) {
                            hashSet.add(strNextToken);
                            if (new File(strNextToken).canRead()) {
                                i2 = i + 1;
                                arrayList.add(new C1573v(strNextToken, false, zContains, false, i));
                                i = i2;
                            }
                        }
                    }
                }
            } catch (FileNotFoundException e4) {
                e = e4;
                bufferedReader3 = bufferedReader2;
                try {
                    e.printStackTrace();
                    if (bufferedReader3 != null) {
                        try {
                            bufferedReader3.close();
                        } catch (IOException e5) {
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bufferedReader = bufferedReader3;
                    if (bufferedReader != null) {
                    }
                    throw th;
                }
            } catch (IOException e6) {
                e = e6;
                e.printStackTrace();
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException e7) {
                    }
                }
            }
            return arrayList;
        }
        if (!hashSet.contains(path) && z2) {
            arrayList.add(0, new C1573v(path, z, zEquals, false, -1));
        }
        bufferedReader2.close();
        return arrayList;
    }
}
