package com.p046a.p047a;

/* JADX INFO: renamed from: com.a.a.aa */
/* JADX INFO: loaded from: classes.dex */
public final class C0483aa implements Comparable {

    /* JADX INFO: renamed from: a */
    public final short f673a;

    /* JADX INFO: renamed from: b */
    public int f674b = 0;

    /* JADX INFO: renamed from: c */
    public int f675c = -1;

    /* JADX INFO: renamed from: d */
    public int f676d = 0;

    public C0483aa(int i) {
        this.f673a = (short) i;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m574a() {
        return this.f674b > 0;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C0483aa c0483aa = (C0483aa) obj;
        if (this.f675c != c0483aa.f675c) {
            return this.f675c < c0483aa.f675c ? -1 : 1;
        }
        return 0;
    }

    public final String toString() {
        return String.format("Section[type=%#x,off=%#x,size=%#x]", Short.valueOf(this.f673a), Integer.valueOf(this.f675c), Integer.valueOf(this.f674b));
    }
}
