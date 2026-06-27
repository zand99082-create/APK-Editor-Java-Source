package com.gmail.heagoo.apkeditor.util;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.util.n */
/* JADX INFO: loaded from: classes.dex */
final class C1473n {

    /* JADX INFO: renamed from: a */
    String f4373a;

    /* JADX INFO: renamed from: b */
    String f4374b;

    /* JADX INFO: renamed from: c */
    String f4375c;

    /* JADX INFO: renamed from: d */
    String f4376d;

    /* JADX INFO: renamed from: e */
    String f4377e;

    /* JADX INFO: renamed from: f */
    private String f4378f;

    private C1473n(String str) {
        String[] strArrSplit = str.split("/");
        int length = strArrSplit.length;
        this.f4375c = strArrSplit[length - 1];
        this.f4378f = strArrSplit[length - 2];
        int iIndexOf = this.f4378f.indexOf(45);
        if (iIndexOf != -1) {
            this.f4373a = this.f4378f.substring(0, iIndexOf);
        } else {
            this.f4373a = this.f4378f;
        }
        int iLastIndexOf = this.f4375c.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            this.f4374b = this.f4375c.substring(0, iLastIndexOf);
        } else {
            this.f4374b = this.f4375c;
        }
    }

    /* synthetic */ C1473n(String str, byte b2) {
        this(str);
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ void m3617a(C1473n c1473n, int i) {
        StringBuilder sb = new StringBuilder();
        int iLastIndexOf = c1473n.f4375c.lastIndexOf(46);
        String strSubstring = iLastIndexOf != -1 ? c1473n.f4375c.endsWith(".9.png") ? ".9.png" : c1473n.f4375c.substring(iLastIndexOf) : "";
        for (int i2 = 0; i2 < c1473n.f4375c.length() - strSubstring.length(); i2++) {
            char cCharAt = c1473n.f4375c.charAt(i2);
            if (Character.isLowerCase(cCharAt)) {
                sb.append(cCharAt);
            } else if (Character.isUpperCase(cCharAt)) {
                sb.append((char) ((cCharAt - 'A') + 97));
            } else if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            } else if (cCharAt == '_' || cCharAt == '.') {
                sb.append(cCharAt);
            }
        }
        sb.append("_r" + i);
        c1473n.f4377e = sb.toString();
        if (c1473n.f4377e.length() == c1473n.f4374b.length()) {
            c1473n.f4377e += "_";
        }
        sb.append(strSubstring);
        c1473n.f4376d = sb.toString();
    }
}
