package com.gmail.heagoo.sqliteutil;

import com.github.megatronking.stringfog.xor.StringFogImpl;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* JADX INFO: renamed from: com.gmail.heagoo.sqliteutil.d */
/* JADX INFO: loaded from: classes.dex */
final class C1633d extends Thread {

    /* JADX INFO: renamed from: a */
    private InputStream f4996a;

    /* JADX INFO: renamed from: b */
    private String[] f4997b;

    /* JADX INFO: renamed from: c */
    private int f4998c;

    public C1633d(InputStream inputStream, String[] strArr, int i) {
        this.f4996a = inputStream;
        this.f4997b = strArr;
        this.f4998c = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m4030a() {
        interrupt();
        try {
            this.f4996a.close();
        } catch (IOException e) {
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        int i;
        char[] cArr = new char[128];
        StringBuilder sb = new StringBuilder();
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(this.f4996a, StringFogImpl.CHARSET_NAME_UTF_8);
            do {
                i = inputStreamReader.read(cArr, 0, 128);
                if (i > 0) {
                    sb.append(cArr, 0, i);
                }
            } while (i >= 0);
        } catch (Exception e) {
        }
        this.f4997b[this.f4998c] = sb.toString();
    }
}
