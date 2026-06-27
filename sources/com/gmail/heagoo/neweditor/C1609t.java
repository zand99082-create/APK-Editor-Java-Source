package com.gmail.heagoo.neweditor;

import com.gmail.heagoo.p084a.p089c.C1067a;

/* JADX INFO: renamed from: com.gmail.heagoo.neweditor.t */
/* JADX INFO: loaded from: classes.dex */
public final class C1609t {

    /* JADX INFO: renamed from: a */
    private boolean f4849a;

    /* JADX INFO: renamed from: b */
    private C1610u[] f4850b;

    /* JADX INFO: renamed from: c */
    private int f4851c;

    /* JADX INFO: renamed from: d */
    private StringBuilder f4852d;

    public C1609t(boolean z) {
        this(z, 52);
        this.f4849a = z;
        this.f4852d = new StringBuilder();
    }

    private C1609t(boolean z, int i) {
        this.f4851c = 52;
        this.f4849a = z;
        this.f4850b = new C1610u[52];
    }

    /* JADX INFO: renamed from: a */
    public final byte m3917a(C1615z c1615z, int i, int i2) {
        if (i2 == 0) {
            return (byte) 0;
        }
        C1610u c1610u = this.f4850b[(Character.toUpperCase(c1615z.f4884a[i]) + Character.toUpperCase(c1615z.f4884a[(i + i2) - 1])) % this.f4851c];
        while (c1610u != null) {
            if (i2 != c1610u.f4854b.length) {
                c1610u = c1610u.f4855c;
            } else {
                if (C1067a.m2488a(this.f4849a, c1615z, i, c1610u.f4854b)) {
                    return c1610u.f4853a;
                }
                c1610u = c1610u.f4855c;
            }
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: a */
    public final String m3918a() {
        return this.f4852d.toString();
    }

    /* JADX INFO: renamed from: a */
    public final void m3919a(String str, byte b2) {
        char[] charArray = str.toCharArray();
        int upperCase = (Character.toUpperCase(charArray[0]) + Character.toUpperCase(charArray[charArray.length - 1])) % this.f4851c;
        for (char c : charArray) {
            if (!Character.isLetterOrDigit(c)) {
                for (int i = 0; i < this.f4852d.length() && this.f4852d.charAt(i) != c; i++) {
                }
                this.f4852d.append(c);
            }
        }
        this.f4850b[upperCase] = new C1610u(charArray, b2, this.f4850b[upperCase]);
    }
}
