package com.gmail.heagoo.apkeditor.p097f;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import p000a.p001a.p003b.p006b.InterfaceC0055m;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.f.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1290d implements InterfaceC0055m {

    /* JADX INFO: renamed from: a */
    private Map f3747a = new HashMap();

    public C1290d(String str, String str2) throws Throwable {
        String[] strArrSplit = str2.split("\\.");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        for (String str3 : strArrSplit) {
            sb.append(str3);
            sb.append("/");
        }
        File[] fileArrListFiles = new File(sb.toString()).listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (file.getName().startsWith("R$")) {
                m3271a(file);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m3271a(File file) throws Throwable {
        BufferedReader bufferedReader;
        int iIndexOf;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            try {
                try {
                    for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                        if (line.startsWith(".field ") && (iIndexOf = line.indexOf(":I")) != -1) {
                            try {
                                this.f3747a.put(Integer.valueOf(Integer.parseInt(line.substring(iIndexOf + 7), 16)), line.substring(line.lastIndexOf(" ", iIndexOf) + 1, iIndexOf));
                            } catch (Exception e) {
                            }
                        }
                    }
                    try {
                        bufferedReader.close();
                    } catch (IOException e2) {
                    }
                } catch (Exception e3) {
                    e = e3;
                    e.printStackTrace();
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e4) {
                        }
                    }
                }
            } catch (Throwable th) {
                th = th;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e5) {
                    }
                }
                throw th;
            }
        } catch (Exception e6) {
            e = e6;
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
            if (bufferedReader != null) {
            }
            throw th;
        }
    }

    @Override // p000a.p001a.p003b.p006b.InterfaceC0055m
    /* JADX INFO: renamed from: a */
    public final String mo144a(int i) {
        return (String) this.f3747a.get(Integer.valueOf(i));
    }
}
