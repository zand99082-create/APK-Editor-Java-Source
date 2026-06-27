package com.gmail.heagoo.apkeditor.p098se;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.se.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1434g {

    /* JADX INFO: renamed from: a */
    public List f4228a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public String f4229b;

    /* JADX INFO: renamed from: c */
    public String f4230c;

    public C1434g(String str, String str2) {
        this.f4228a.add(str2);
        this.f4230c = str2;
    }

    /* JADX INFO: renamed from: b */
    private static int m3534b(String str) {
        if (str.endsWith("-hdpi")) {
            return 4;
        }
        if (str.endsWith("-xhdpi")) {
            return 5;
        }
        if (str.endsWith("-xxhdpi")) {
            return 6;
        }
        if (str.endsWith("-mdpi")) {
            return 2;
        }
        if (str.endsWith("-ldpi")) {
            return 1;
        }
        if (str.endsWith("-xxxhdpi")) {
            return 7;
        }
        return str.endsWith("-tvdpi") ? 3 : 2;
    }

    /* JADX INFO: renamed from: a */
    public final String m3535a() {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = this.f4228a.iterator();
        while (it.hasNext()) {
            stringBuffer.append((String) it.next());
            stringBuffer.append("\n");
        }
        stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: a */
    public final void m3536a(String str) {
        this.f4228a.add(str);
        if (m3534b(str) > m3534b(this.f4230c)) {
            this.f4230c = str;
        }
    }
}
