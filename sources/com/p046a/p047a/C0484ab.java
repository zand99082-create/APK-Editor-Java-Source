package com.p046a.p047a;

import com.gmail.heagoo.p084a.p089c.C1067a;
import java.io.Serializable;

/* JADX INFO: renamed from: com.a.a.ab */
/* JADX INFO: loaded from: classes.dex */
public final class C0484ab implements Comparable {

    /* JADX INFO: renamed from: a */
    public static final C0484ab f677a = new C0484ab(null, C0492i.f713a);

    /* JADX INFO: renamed from: b */
    private final C0492i f678b;

    /* JADX INFO: renamed from: c */
    private final short[] f679c;

    public C0484ab(C0492i c0492i, short[] sArr) {
        this.f678b = c0492i;
        this.f679c = sArr;
    }

    /* JADX INFO: renamed from: a */
    public final short[] m575a() {
        return this.f679c;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        C0484ab c0484ab = (C0484ab) obj;
        for (int i = 0; i < this.f679c.length && i < c0484ab.f679c.length; i++) {
            if (this.f679c[i] != c0484ab.f679c[i]) {
                return C1067a.m2436a(this.f679c[i], c0484ab.f679c[i]);
            }
        }
        return C1067a.m2432a(this.f679c.length, c0484ab.f679c.length);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        int length = this.f679c.length;
        for (int i = 0; i < length; i++) {
            sb.append(this.f678b != null ? (Serializable) this.f678b.m627g().get(this.f679c[i]) : Short.valueOf(this.f679c[i]));
        }
        sb.append(")");
        return sb.toString();
    }
}
