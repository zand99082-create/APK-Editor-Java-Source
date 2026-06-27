package com.gmail.heagoo.neweditor;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.gmail.heagoo.neweditor.ag */
/* JADX INFO: loaded from: classes.dex */
public final class C1588ag {

    /* JADX INFO: renamed from: f */
    private static final Map f4769f = new HashMap();

    /* JADX INFO: renamed from: a */
    public C1588ag f4770a;

    /* JADX INFO: renamed from: b */
    public C1612w f4771b;

    /* JADX INFO: renamed from: c */
    public C1613x f4772c;

    /* JADX INFO: renamed from: d */
    public char[] f4773d;

    /* JADX INFO: renamed from: e */
    public C1612w f4774e;

    public C1588ag() {
    }

    public C1588ag(C1613x c1613x, C1588ag c1588ag) {
        this.f4772c = c1613x;
        this.f4770a = c1588ag == null ? null : (C1588ag) c1588ag.clone();
        if (c1613x.m3933a() != null) {
            this.f4774e = this.f4772c.m3953i();
        } else {
            this.f4774e = c1588ag.f4774e;
        }
    }

    /* JADX INFO: renamed from: a */
    public final C1588ag m3882a() {
        C1588ag c1588ag = (C1588ag) f4769f.get(this);
        if (c1588ag != null) {
            return c1588ag;
        }
        f4769f.put(this, this);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final void m3883a(C1612w c1612w) {
        this.f4771b = c1612w;
        if (c1612w != null && c1612w.f4860e != null) {
            this.f4774e = c1612w.f4860e;
            return;
        }
        if (this.f4772c != null && this.f4772c.m3933a() != null) {
            this.f4774e = this.f4772c.m3953i();
        } else if (this.f4770a != null) {
            this.f4774e = this.f4770a.f4774e;
        } else {
            this.f4774e = null;
        }
    }

    public final Object clone() {
        C1588ag c1588ag = new C1588ag();
        c1588ag.f4771b = this.f4771b;
        c1588ag.f4772c = this.f4772c;
        c1588ag.f4770a = this.f4770a == null ? null : (C1588ag) this.f4770a.clone();
        c1588ag.f4773d = this.f4773d;
        c1588ag.f4774e = this.f4774e;
        return c1588ag;
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof C1588ag)) {
            return false;
        }
        C1588ag c1588ag = (C1588ag) obj;
        if (c1588ag.f4771b != this.f4771b || c1588ag.f4772c != this.f4772c || !C1583ab.m3869a(this.f4770a, c1588ag.f4770a)) {
            return false;
        }
        char[] cArr = this.f4773d;
        char[] cArr2 = c1588ag.f4773d;
        if (cArr == null) {
            z = cArr2 == null;
        } else if (cArr2 != null && cArr.length == cArr2.length) {
            int i = 0;
            while (true) {
                if (i >= cArr.length) {
                    z = true;
                    break;
                }
                if (cArr[i] != cArr2[i]) {
                    z = false;
                    break;
                }
                i++;
            }
        } else {
            z = false;
        }
        return z;
    }

    public final int hashCode() {
        if (this.f4771b != null) {
            return this.f4771b.hashCode();
        }
        if (this.f4772c != null) {
            return this.f4772c.hashCode();
        }
        return 0;
    }
}
