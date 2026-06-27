package p000a.p014d;

import java.io.Serializable;

/* JADX INFO: renamed from: a.d.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0085e implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Object f229a;

    /* JADX INFO: renamed from: b */
    public Object f230b;

    public C0085e(Object obj, Object obj2) {
        this.f229a = obj;
        this.f230b = obj2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0085e c0085e = (C0085e) obj;
        if (this.f229a == c0085e.f229a || (this.f229a != null && this.f229a.equals(c0085e.f229a))) {
            return this.f230b == c0085e.f230b || (this.f230b != null && this.f230b.equals(c0085e.f230b));
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f229a != null ? this.f229a.hashCode() : 0) + 213) * 71) + (this.f230b != null ? this.f230b.hashCode() : 0);
    }
}
