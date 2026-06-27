package com.gmail.heagoo.apkeditor.util;

import android.app.Activity;
import com.gmail.heagoo.common.C1570s;
import com.gmail.heagoo.common.DialogC1567p;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.util.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1463d {

    /* JADX INFO: renamed from: b */
    private String f4343b;

    /* JADX INFO: renamed from: c */
    private String f4344c;

    /* JADX INFO: renamed from: d */
    private AbstractC1465f f4345d;

    /* JADX INFO: renamed from: e */
    private int f4346e = -1;

    /* JADX INFO: renamed from: f */
    private Map f4347f = new HashMap();

    /* JADX INFO: renamed from: a */
    Map f4342a = new HashMap();

    public C1463d(String str) {
        this.f4343b = str;
    }

    /* JADX INFO: renamed from: a */
    protected static void m3583a(BufferedWriter bufferedWriter) {
        if (bufferedWriter != null) {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m3584b(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (Character.isDigit(cCharAt) || ((cCharAt >= 'a' && cCharAt <= 'z') || ((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == '_' || cCharAt == '.'))) {
                sb.append(cCharAt);
            } else {
                sb.append(C1570s.m3787a(4));
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public final void m3585a(Activity activity) {
        if (this.f4345d != null) {
            new DialogC1567p(activity, new C1464e(this, activity), -1).show();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3586a(String str) {
        this.f4344c = str;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m3587a() {
        if (this.f4344c == null) {
            return false;
        }
        this.f4345d = new C1472m(this.f4343b, this.f4344c);
        if (this.f4345d.mo3601a()) {
            this.f4346e = 0;
            return true;
        }
        this.f4345d = new C1477r(this.f4343b, this.f4344c);
        if (this.f4345d.mo3601a()) {
            this.f4346e = 1;
            return true;
        }
        this.f4345d = new C1467h(this.f4343b, this.f4344c);
        if (this.f4345d.mo3601a()) {
            this.f4346e = 2;
            return true;
        }
        this.f4345d = new C1474o(this.f4343b, this.f4344c);
        if (this.f4345d.mo3601a()) {
            this.f4346e = 3;
            return true;
        }
        this.f4345d = new C1471l(this.f4343b, this.f4344c);
        if (!this.f4345d.mo3601a()) {
            return false;
        }
        this.f4346e = 4;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final int m3588b() {
        return this.f4346e;
    }

    /* JADX INFO: renamed from: c */
    public final Map m3589c() {
        return this.f4342a;
    }
}
