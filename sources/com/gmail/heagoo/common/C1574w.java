package com.gmail.heagoo.common;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.gmail.heagoo.common.w */
/* JADX INFO: loaded from: classes.dex */
public final class C1574w {

    /* JADX INFO: renamed from: a */
    private List f4667a = new ArrayList();

    public C1574w(String str) throws Throwable {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(str));
            try {
                for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                    this.f4667a.add(line);
                }
                bufferedReader.close();
            } catch (Throwable th) {
                th = th;
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final List m3798a() {
        return this.f4667a;
    }

    /* JADX INFO: renamed from: b */
    public final String m3799b() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f4667a.size()) {
                return sb.toString();
            }
            sb.append((String) this.f4667a.get(i2));
            if (i2 != this.f4667a.size() - 1) {
                sb.append("\n");
            }
            i = i2 + 1;
        }
    }
}
