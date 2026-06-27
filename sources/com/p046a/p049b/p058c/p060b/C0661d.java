package com.p046a.p049b.p058c.p060b;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p066f.p069c.C0884z;
import com.p046a.p049b.p073h.C0959g;

/* JADX INFO: renamed from: com.a.b.c.b.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0661d extends C0959g implements Comparable {

    /* JADX INFO: renamed from: a */
    public static final C0661d f1101a = new C0661d(0);

    public C0661d(int i) {
        super(i);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C0661d c0661d) {
        if (this == c0661d) {
            return 0;
        }
        int iD_ = m2239d_();
        int iD_2 = c0661d.m2239d_();
        int iMin = Math.min(iD_, iD_2);
        for (int i = 0; i < iMin; i++) {
            int iCompareTo = m1183a(i).compareTo(c0661d.m1183a(i));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        if (iD_ < iD_2) {
            return -1;
        }
        return iD_ > iD_2 ? 1 : 0;
    }

    /* JADX INFO: renamed from: a */
    public final C0662e m1183a(int i) {
        return (C0662e) m2240e(i);
    }

    /* JADX INFO: renamed from: a */
    public final String m1184a(String str, String str2) {
        StringBuilder sb = new StringBuilder(100);
        int iD_ = m2239d_();
        sb.append(str);
        sb.append(str2);
        sb.append("catch ");
        for (int i = 0; i < iD_; i++) {
            C0662e c0662eM1183a = m1183a(i);
            if (i != 0) {
                sb.append(",\n");
                sb.append(str);
                sb.append("  ");
            }
            if (i == iD_ - 1 && m1186e()) {
                sb.append("<any>");
            } else {
                sb.append(c0662eM1183a.m1188a().mo919d());
            }
            sb.append(" -> ");
            sb.append(C1067a.m2559w(c0662eM1183a.m1189b()));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public final void m1185a(int i, C0884z c0884z, int i2) {
        m2237a(i, new C0662e(c0884z, i2));
    }

    @Override // com.p046a.p049b.p073h.C0959g, com.p046a.p049b.p073h.InterfaceC0971s
    /* JADX INFO: renamed from: d */
    public final String mo919d() {
        return m1184a("", "");
    }

    /* JADX INFO: renamed from: e */
    public final boolean m1186e() {
        int iD_ = m2239d_();
        if (iD_ == 0) {
            return false;
        }
        return m1183a(iD_ - 1).m1188a().equals(C0884z.f2270a);
    }
}
