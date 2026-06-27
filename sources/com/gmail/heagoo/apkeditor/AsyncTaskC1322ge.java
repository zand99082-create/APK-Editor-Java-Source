package com.gmail.heagoo.apkeditor;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.ge */
/* JADX INFO: loaded from: classes.dex */
final class AsyncTaskC1322ge extends AsyncTask {

    /* JADX INFO: renamed from: a */
    private String f3857a;

    /* JADX INFO: renamed from: b */
    private String f3858b;

    /* JADX INFO: renamed from: c */
    private int f3859c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ DialogC1312fv f3860d;

    public AsyncTaskC1322ge(DialogC1312fv dialogC1312fv, String str, String str2, int i) {
        this.f3860d = dialogC1312fv;
        this.f3857a = str;
        this.f3858b = str2;
        this.f3859c = i;
    }

    @SuppressLint({"DefaultLocale"})
    /* JADX INFO: renamed from: a */
    private C1388ir m3361a() throws Throwable {
        BufferedReader bufferedReader;
        ArrayList arrayList;
        C1388ir c1388ir = new C1388ir();
        c1388ir.f4032a = this.f3857a;
        String lowerCase = this.f3858b.toLowerCase();
        BufferedReader bufferedReader2 = null;
        try {
            arrayList = new ArrayList();
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(this.f3857a)));
        } catch (Exception e) {
            bufferedReader = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            int i = 1;
            for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                int iIndexOf = this.f3860d.f3839j ? line.indexOf(this.f3858b) : line.toLowerCase().indexOf(lowerCase);
                if (iIndexOf != -1) {
                    arrayList.add(new C1269eh(i, iIndexOf, line));
                }
                i++;
            }
            c1388ir.f4033b = arrayList;
            try {
                bufferedReader.close();
            } catch (IOException e2) {
            }
        } catch (Exception e3) {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e4) {
                }
            }
        } catch (Throwable th2) {
            bufferedReader2 = bufferedReader;
            th = th2;
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (IOException e5) {
                }
            }
            throw th;
        }
        return c1388ir;
    }

    @Override // android.os.AsyncTask
    @SuppressLint({"DefaultLocale"})
    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m3361a();
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Object obj) {
        C1388ir c1388ir = (C1388ir) obj;
        if (c1388ir.f4033b != null) {
            this.f3860d.f3833d.m3237a(c1388ir.f4032a, c1388ir.f4033b);
        }
        this.f3860d.f3832c.expandGroup(this.f3859c);
    }
}
