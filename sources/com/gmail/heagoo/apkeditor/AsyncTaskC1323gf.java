package com.gmail.heagoo.apkeditor;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.gf */
/* JADX INFO: loaded from: classes.dex */
final class AsyncTaskC1323gf extends AsyncTask {

    /* JADX INFO: renamed from: a */
    private String f3861a;

    /* JADX INFO: renamed from: b */
    private List f3862b;

    /* JADX INFO: renamed from: c */
    private String f3863c;

    /* JADX INFO: renamed from: d */
    private String f3864d;

    /* JADX INFO: renamed from: e */
    private boolean f3865e;

    /* JADX INFO: renamed from: f */
    private /* synthetic */ DialogC1312fv f3866f;

    @SuppressLint({"DefaultLocale"})
    public AsyncTaskC1323gf(DialogC1312fv dialogC1312fv, String str, List list, String str2, boolean z) {
        this.f3866f = dialogC1312fv;
        this.f3861a = str;
        this.f3862b = list;
        this.f3863c = str2;
        this.f3864d = str2.toLowerCase();
        this.f3865e = z;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|(4:45|3|44|4)|(1:(1:(2:7|(2:47|9)(1:12))(0)))(2:(1:(2:15|(2:48|17)(1:13))(0))|11)|42|10|11|(1:(0))) */
    @SuppressLint({"DefaultLocale"})
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m3362a(File file) throws Throwable {
        BufferedReader bufferedReader;
        String line;
        boolean z = false;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            try {
                line = bufferedReader.readLine();
            } catch (Exception e) {
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e2) {
                    }
                }
            } catch (Throwable th) {
                th = th;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e3) {
                    }
                }
                throw th;
            }
        } catch (Exception e4) {
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
        }
        if (!this.f3865e) {
            while (true) {
                if (line != null) {
                    if (line.toLowerCase().contains(this.f3864d)) {
                        z = true;
                        break;
                    }
                    line = bufferedReader.readLine();
                }
            }
            return z;
        }
        while (true) {
            if (line != null) {
                if (line.contains(this.f3863c)) {
                    z = true;
                    break;
                }
                line = bufferedReader.readLine();
            }
        }
        bufferedReader.close();
        return z;
    }

    /* JADX INFO: renamed from: b */
    private void m3363b(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    m3363b(file2);
                } else if (m3364c(file2) && m3362a(file2)) {
                    this.f3866f.f3840k.add(file2.getPath());
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private static boolean m3364c(File file) {
        String name = file.getName();
        return name.endsWith(".xml") || name.endsWith(".smali") || name.endsWith(".txt");
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        File file = new File(this.f3861a);
        Iterator it = this.f3862b.iterator();
        while (it.hasNext()) {
            File file2 = new File(file, (String) it.next());
            if (file2.exists()) {
                if (file2.isDirectory()) {
                    m3363b(file2);
                } else if (m3364c(file2) && m3362a(file2)) {
                    this.f3866f.f3840k.add(file2.getPath());
                }
            }
        }
        return this.f3866f.f3840k;
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Object obj) {
        DialogC1312fv.m3349b(this.f3866f);
    }
}
