package com.p046a.p047a;

import com.p046a.p047a.p048a.C0479a;
import com.p046a.p047a.p048a.InterfaceC0480b;

/* JADX INFO: renamed from: com.a.a.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0504u implements Comparable {

    /* JADX INFO: renamed from: a */
    private final byte[] f737a;

    public C0504u(byte[] bArr) {
        this.f737a = bArr;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C0504u c0504u) {
        int iMin = Math.min(this.f737a.length, c0504u.f737a.length);
        for (int i = 0; i < iMin; i++) {
            if (this.f737a[i] != c0504u.f737a[i]) {
                return (this.f737a[i] & 255) - (c0504u.f737a[i] & 255);
            }
        }
        return this.f737a.length - c0504u.f737a.length;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC0480b m667a() {
        return new C0479a(this.f737a);
    }

    /* JADX INFO: renamed from: a */
    public final void m668a(C0498o c0498o) {
        c0498o.m644a(this.f737a);
    }

    public final String toString() {
        return Integer.toHexString(this.f737a[0] & 255) + "...(" + this.f737a.length + ")";
    }
}
