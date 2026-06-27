package com.gmail.heagoo.apkeditor;

import jadx.core.codegen.CodeWriter;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.dj */
/* JADX INFO: loaded from: classes.dex */
final class C1217dj {

    /* JADX INFO: renamed from: a */
    int f3544a;

    /* JADX INFO: renamed from: b */
    String f3545b;

    /* JADX INFO: renamed from: c */
    int f3546c;

    /* JADX INFO: renamed from: d */
    int f3547d;

    /* JADX INFO: renamed from: e */
    int f3548e;

    /* JADX INFO: renamed from: f */
    boolean f3549f = false;

    /* JADX INFO: renamed from: g */
    boolean f3550g = false;

    /* JADX INFO: renamed from: h */
    private String f3551h;

    C1217dj(int i, String str, String str2) {
        this.f3544a = i;
        this.f3545b = str;
        while (this.f3545b.startsWith(str2)) {
            this.f3546c++;
            this.f3545b = this.f3545b.substring(str2.length());
        }
        while (this.f3545b.startsWith(CodeWriter.INDENT)) {
            this.f3546c++;
            this.f3545b = this.f3545b.substring(4);
        }
        this.f3545b = this.f3545b.trim();
        this.f3547d = -1;
        this.f3548e = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005c A[PHI: r0
      0x005c: PHI (r0v5 int) = (r0v3 int), (r0v21 int) binds: [B:14:0x0025, B:9:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final String m3127a() {
        int iIndexOf;
        int i;
        if (this.f3551h != null) {
            return this.f3551h;
        }
        String str = this.f3545b;
        if (this.f3544a != this.f3547d) {
            iIndexOf = str.indexOf("</");
            i = iIndexOf != -1 ? iIndexOf + 2 : iIndexOf;
        } else {
            iIndexOf = str.indexOf("<");
            if (iIndexOf != -1) {
                i = iIndexOf + 1;
            }
        }
        if (i == -1) {
            return null;
        }
        int iIndexOf2 = str.indexOf(" ");
        if (iIndexOf2 == -1) {
            if (this.f3547d == this.f3548e) {
                iIndexOf2 = str.indexOf("/>");
                if (iIndexOf2 != -1) {
                    iIndexOf2--;
                }
            } else {
                iIndexOf2 = str.indexOf(">");
            }
        }
        String strTrim = (iIndexOf2 != -1 ? str.substring(i, iIndexOf2) : str.substring(i)).trim();
        this.f3551h = strTrim;
        return strTrim;
    }
}
