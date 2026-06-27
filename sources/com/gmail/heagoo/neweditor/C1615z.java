package com.gmail.heagoo.neweditor;

import java.text.CharacterIterator;

/* JADX INFO: renamed from: com.gmail.heagoo.neweditor.z */
/* JADX INFO: loaded from: classes.dex */
public final class C1615z implements CharSequence, Cloneable, CharacterIterator {

    /* JADX INFO: renamed from: a */
    public char[] f4884a;

    /* JADX INFO: renamed from: b */
    public int f4885b;

    /* JADX INFO: renamed from: c */
    public int f4886c;

    /* JADX INFO: renamed from: d */
    private int f4887d;

    public C1615z() {
        this(null, 0, 0);
    }

    private C1615z(char[] cArr, int i, int i2) {
        this.f4884a = null;
        this.f4886c = 0;
        this.f4885b = 0;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        if (i < 0 || i >= this.f4885b) {
            throw new StringIndexOutOfBoundsException(i);
        }
        return this.f4884a[this.f4886c + i];
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        if (this.f4885b == 0 || this.f4887d >= this.f4886c + this.f4885b) {
            return (char) 65535;
        }
        return this.f4884a[this.f4887d];
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.f4887d = this.f4886c;
        if (this.f4885b != 0) {
            return this.f4884a[this.f4887d];
        }
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return this.f4886c;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f4886c + this.f4885b;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f4887d;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        this.f4887d = this.f4886c + this.f4885b;
        if (this.f4885b == 0) {
            return (char) 65535;
        }
        this.f4887d--;
        return this.f4884a[this.f4887d];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f4885b;
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        this.f4887d++;
        int i = this.f4886c + this.f4885b;
        if (this.f4887d < i) {
            return current();
        }
        this.f4887d = i;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        if (this.f4887d == this.f4886c) {
            return (char) 65535;
        }
        this.f4887d--;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i) {
        int i2 = this.f4886c + this.f4885b;
        if (i < this.f4886c || i > i2) {
            throw new IllegalArgumentException("bad position: " + i);
        }
        this.f4887d = i;
        if (this.f4887d == i2 || this.f4885b == 0) {
            return (char) 65535;
        }
        return this.f4884a[this.f4887d];
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        if (i < 0) {
            throw new StringIndexOutOfBoundsException(i);
        }
        if (i2 > this.f4885b) {
            throw new StringIndexOutOfBoundsException(i2);
        }
        if (i > i2) {
            throw new StringIndexOutOfBoundsException(i2 - i);
        }
        C1615z c1615z = new C1615z();
        c1615z.f4884a = this.f4884a;
        c1615z.f4886c = this.f4886c + i;
        c1615z.f4885b = i2 - i;
        return c1615z;
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f4884a != null ? new String(this.f4884a, this.f4886c, this.f4885b) : new String();
    }
}
