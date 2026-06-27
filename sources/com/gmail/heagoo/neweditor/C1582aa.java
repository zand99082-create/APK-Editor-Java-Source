package com.gmail.heagoo.neweditor;

import java.io.Serializable;

/* JADX INFO: renamed from: com.gmail.heagoo.neweditor.aa */
/* JADX INFO: loaded from: classes.dex */
public final class C1582aa implements Serializable, CharSequence {

    /* JADX INFO: renamed from: a */
    private int f4752a;

    /* JADX INFO: renamed from: b */
    private int f4753b;

    /* JADX INFO: renamed from: c */
    private C1615z f4754c;

    public C1582aa(C1615z c1615z) {
        this(c1615z, 0, c1615z.f4885b);
    }

    public C1582aa(C1615z c1615z, int i, int i2) {
        this.f4753b = i;
        this.f4752a = i2;
        this.f4754c = c1615z;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f4754c.f4884a[this.f4754c.f4886c + this.f4753b + i];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f4752a;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new C1582aa(this.f4754c, this.f4753b + i, i2 - i);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return new String(this.f4754c.f4884a, this.f4753b + this.f4754c.f4886c, this.f4752a);
    }
}
