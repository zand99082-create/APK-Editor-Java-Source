package com.gmail.heagoo.common;

import com.github.megatronking.stringfog.xor.StringFogImpl;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* JADX INFO: renamed from: com.gmail.heagoo.common.u */
/* JADX INFO: loaded from: classes.dex */
final class C1572u extends Thread {

    /* JADX INFO: renamed from: a */
    private InputStream f4661a;

    /* JADX INFO: renamed from: b */
    private String[] f4662b;

    /* JADX INFO: renamed from: c */
    private int f4663c;

    public C1572u(InputStream inputStream, String[] strArr, int i) {
        this.f4661a = inputStream;
        this.f4662b = strArr;
        this.f4663c = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m3797a() {
        interrupt();
        try {
            this.f4661a.close();
        } catch (IOException e) {
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        int i;
        char[] cArr = new char[128];
        StringBuilder sb = new StringBuilder();
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(this.f4661a, StringFogImpl.CHARSET_NAME_UTF_8);
            do {
                i = inputStreamReader.read(cArr, 0, 128);
                if (i > 0) {
                    sb.append(cArr, 0, i);
                }
            } while (i >= 0);
        } catch (Exception e) {
        }
        this.f4662b[this.f4663c] = sb.toString();
    }
}
