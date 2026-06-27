package com.gmail.heagoo.common;

import com.github.megatronking.stringfog.xor.StringFogImpl;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* JADX INFO: renamed from: com.gmail.heagoo.common.d */
/* JADX INFO: loaded from: classes.dex */
final class C1555d extends Thread {

    /* JADX INFO: renamed from: a */
    private InputStream f4633a;

    /* JADX INFO: renamed from: b */
    private String[] f4634b;

    /* JADX INFO: renamed from: c */
    private int f4635c;

    public C1555d(InputStream inputStream, String[] strArr, int i) {
        this.f4633a = inputStream;
        this.f4634b = strArr;
        this.f4635c = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m3761a() {
        interrupt();
        try {
            this.f4633a.close();
        } catch (IOException e) {
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        int i;
        char[] cArr = new char[128];
        StringBuilder sb = new StringBuilder();
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(this.f4633a, StringFogImpl.CHARSET_NAME_UTF_8);
            do {
                i = inputStreamReader.read(cArr, 0, 128);
                if (i > 0) {
                    sb.append(cArr, 0, i);
                }
            } while (i >= 0);
        } catch (Exception e) {
        }
        this.f4634b[this.f4635c] = sb.toString();
    }
}
