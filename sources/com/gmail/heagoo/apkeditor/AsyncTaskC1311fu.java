package com.gmail.heagoo.apkeditor;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import java.io.File;
import java.util.List;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.fu */
/* JADX INFO: loaded from: classes.dex */
final class AsyncTaskC1311fu extends AsyncTask {

    /* JADX INFO: renamed from: a */
    private String f3825a;

    /* JADX INFO: renamed from: b */
    private List f3826b;

    /* JADX INFO: renamed from: c */
    private String f3827c;

    /* JADX INFO: renamed from: d */
    private String f3828d;

    /* JADX INFO: renamed from: e */
    private /* synthetic */ DialogC1305fo f3829e;

    @SuppressLint({"DefaultLocale"})
    public AsyncTaskC1311fu(DialogC1305fo dialogC1305fo, String str, List list, String str2) {
        this.f3829e = dialogC1305fo;
        this.f3825a = str;
        this.f3826b = list;
        this.f3827c = str2;
        this.f3828d = str2.toLowerCase();
    }

    /* JADX INFO: renamed from: a */
    private void m3345a(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    m3345a(file2);
                } else if (m3346a(file2.getName())) {
                    this.f3829e.f3818p.add(file2.getPath());
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m3346a(String str) {
        return this.f3829e.f3817o ? str.contains(this.f3827c) : str.toLowerCase().contains(this.f3828d);
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        File file = new File(this.f3825a);
        for (String str : this.f3826b) {
            File file2 = new File(file, str);
            if (file2.exists()) {
                if (file2.isDirectory()) {
                    m3345a(file2);
                } else if (m3346a(str)) {
                    this.f3829e.f3818p.add(file2.getPath());
                }
            }
        }
        return this.f3829e.f3818p;
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Object obj) {
        DialogC1305fo.m3341c(this.f3829e);
    }
}
