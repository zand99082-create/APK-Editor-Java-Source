package com.gmail.heagoo.apkeditor;

import android.app.Activity;
import android.os.AsyncTask;
import android.view.View;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.gs */
/* JADX INFO: loaded from: classes.dex */
final class AsyncTaskC1335gs extends AsyncTask {

    /* JADX INFO: renamed from: a */
    private WeakReference f3886a;

    /* JADX INFO: renamed from: b */
    private String f3887b;

    /* JADX INFO: renamed from: c */
    private String f3888c;

    /* JADX INFO: renamed from: d */
    private View f3889d;

    /* JADX INFO: renamed from: e */
    private List f3890e = new ArrayList();

    /* JADX INFO: renamed from: f */
    private int f3891f;

    /* JADX INFO: renamed from: g */
    private /* synthetic */ C1332gp f3892g;

    AsyncTaskC1335gs(C1332gp c1332gp, Activity activity, String str, String str2, View view) {
        this.f3892g = c1332gp;
        this.f3891f = -1;
        this.f3886a = new WeakReference(activity);
        this.f3887b = str;
        this.f3888c = str2;
        this.f3889d = view;
        if (str.endsWith(".smali")) {
            this.f3891f = 0;
        } else if (str.endsWith(".java")) {
            this.f3891f = 1;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: a */
    private Boolean m3375a() {
        int i = 0;
        BufferedReader bufferedReader = new BufferedReader(new StringReader(this.f3888c));
        try {
            switch (this.f3891f) {
                case 0:
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line != null) {
                            if (line.startsWith(".method ")) {
                                this.f3890e.add(new C1331go(i, line.substring(8)));
                            }
                            i++;
                        }
                        break;
                    }
                    break;
                case 1:
                    while (true) {
                        int i2 = i;
                        String line2 = bufferedReader.readLine();
                        if (line2 != null) {
                            String strTrim = line2.trim();
                            if (strTrim.length() > 6 && strTrim.charAt(0) == 'p' && (strTrim.charAt(1) == 'u' || strTrim.charAt(1) == 'r')) {
                                Matcher matcher = Pattern.compile("(public|protected|private|static|\\s) +[\\w\\<\\>\\[\\]]+\\s+(\\w+) *\\([^\\)]*\\) *(\\{?|[^;])").matcher(strTrim);
                                if (matcher.matches()) {
                                    String strGroup = matcher.group(0);
                                    if (strGroup.endsWith("{")) {
                                        strGroup = strGroup.substring(0, strGroup.length() - 1).trim();
                                    }
                                    this.f3890e.add(new C1331go(i2, strGroup));
                                }
                            }
                            i = i2 + 1;
                        }
                        break;
                    }
                    break;
            }
            return null;
        } catch (IOException e) {
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m3375a();
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Object obj) {
        C1332gp.m3370a(this.f3892g, (Activity) this.f3886a.get(), this.f3887b, this.f3890e);
        this.f3892g.m3374a(this.f3889d);
    }
}
