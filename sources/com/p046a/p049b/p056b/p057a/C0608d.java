package com.p046a.p049b.p056b.p057a;

import com.p046a.p049b.p056b.C0614b;

/* JADX INFO: renamed from: com.a.b.b.a.d */
/* JADX INFO: loaded from: classes.dex */
final class C0608d {

    /* JADX INFO: renamed from: a */
    private final String[] f1005a;

    /* JADX INFO: renamed from: b */
    private int f1006b = 0;

    /* JADX INFO: renamed from: c */
    private String f1007c;

    /* JADX INFO: renamed from: d */
    private String f1008d;

    public C0608d(String[] strArr) {
        this.f1005a = strArr;
    }

    /* JADX INFO: renamed from: a */
    public final String m1084a() {
        return this.f1007c;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1085a(String str) {
        boolean z = false;
        int length = str.length();
        if (length <= 0 || str.charAt(length - 1) != '=') {
            return this.f1007c.equals(str);
        }
        if (this.f1007c.startsWith(str)) {
            this.f1008d = this.f1007c.substring(length);
            return true;
        }
        String strSubstring = str.substring(0, length - 1);
        if (!this.f1007c.equals(strSubstring)) {
            return false;
        }
        if (this.f1006b < this.f1005a.length) {
            this.f1007c = this.f1005a[this.f1006b];
            this.f1006b++;
            z = true;
        }
        if (z) {
            this.f1008d = this.f1007c;
            return true;
        }
        System.err.println("Missing value after parameter " + strSubstring);
        throw new C0614b();
    }

    /* JADX INFO: renamed from: b */
    public final String m1086b() {
        return this.f1008d;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m1087c() {
        if (this.f1006b >= this.f1005a.length) {
            return false;
        }
        this.f1007c = this.f1005a[this.f1006b];
        if (this.f1007c.equals("--") || !this.f1007c.startsWith("--")) {
            return false;
        }
        this.f1006b++;
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final String[] m1088d() {
        int length = this.f1005a.length - this.f1006b;
        String[] strArr = new String[length];
        if (length > 0) {
            System.arraycopy(this.f1005a, this.f1006b, strArr, 0, length);
        }
        return strArr;
    }
}
