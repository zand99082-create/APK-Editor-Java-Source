package com.gmail.heagoo.apkeditor.p096e;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.e.ad */
/* JADX INFO: loaded from: classes.dex */
public final class C1236ad {

    /* JADX INFO: renamed from: a */
    public String f3590a;

    /* JADX INFO: renamed from: b */
    public String f3591b;

    /* JADX INFO: renamed from: c */
    public int f3592c;

    private C1236ad(String str, String str2, int i) {
        this.f3590a = str;
        this.f3591b = str2;
        this.f3592c = i;
    }

    /* JADX INFO: renamed from: a */
    public static C1236ad m3156a(String str) {
        int iM3157b;
        String strSubstring;
        String strSubstring2;
        int i;
        int iIndexOf;
        int i2;
        int iIndexOf2;
        int i3;
        int iIndexOf3;
        int iIndexOf4 = str.indexOf("type=\"");
        if (iIndexOf4 == -1 || (iIndexOf = str.indexOf("\" ", (i = iIndexOf4 + 6))) == -1) {
            iM3157b = -1;
            strSubstring = null;
            strSubstring2 = null;
        } else {
            strSubstring2 = str.substring(i, iIndexOf);
            int iIndexOf5 = str.indexOf("name=\"");
            if (iIndexOf5 == -1 || (iIndexOf2 = str.indexOf("\" ", (i2 = iIndexOf5 + 6))) == -1) {
                iM3157b = -1;
                strSubstring = null;
            } else {
                strSubstring = str.substring(i2, iIndexOf2);
                int iIndexOf6 = str.indexOf("id=\"");
                iM3157b = (iIndexOf6 == -1 || (iIndexOf3 = str.indexOf("\" ", (i3 = iIndexOf6 + 4))) == -1) ? -1 : m3157b(str.substring(i3, iIndexOf3));
            }
        }
        if (strSubstring2 == null || strSubstring == null || iM3157b == -1) {
            return null;
        }
        return new C1236ad(strSubstring2, strSubstring, iM3157b);
    }

    /* JADX INFO: renamed from: b */
    public static int m3157b(String str) {
        if (str.length() != 10) {
            return 0;
        }
        int i = 2;
        int i2 = 0;
        while (i < 10) {
            int i3 = i2 << 4;
            char cCharAt = str.charAt(i);
            i++;
            i2 = i3 | ((cCharAt < '0' || cCharAt > '9') ? (cCharAt < 'a' || cCharAt > 'f') ? (cCharAt < 'A' || cCharAt > 'F') ? 0 : (cCharAt - 'A') + 10 : (cCharAt - 'a') + 10 : cCharAt - '0');
        }
        return i2;
    }

    public final String toString() {
        return String.format("<public type=\"%s\" name=\"%s\" id=\"0x%s\" />", this.f3590a, this.f3591b, Integer.toHexString(this.f3592c));
    }
}
