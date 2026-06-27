package com.p046a.p049b.p058c.p060b;

import com.p046a.p049b.p066f.p068b.C0850t;
import com.p046a.p049b.p066f.p068b.C0856z;
import com.p046a.p049b.p073h.C0970r;

/* JADX INFO: renamed from: com.a.b.c.b.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0673p extends AbstractC0669l {
    public AbstractC0673p(C0671n c0671n, C0856z c0856z, C0850t c0850t) {
        super(c0671n, c0856z, c0850t);
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0669l
    /* JADX INFO: renamed from: a */
    public final int mo1102a() {
        return m1223h().m1238c().mo1107a();
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0669l
    /* JADX INFO: renamed from: a */
    protected final String mo1104a(boolean z) {
        AbstractC0675r abstractC0675rM1238c = m1223h().m1238c();
        String strM1240e = m1223h().m1240e();
        String strMo1108a = abstractC0675rM1238c.mo1108a(this);
        String strMo1109a = abstractC0675rM1238c.mo1109a(this, z);
        StringBuilder sb = new StringBuilder(100);
        sb.append(strM1240e);
        if (strMo1108a.length() != 0) {
            sb.append(' ');
            sb.append(strMo1108a);
        }
        if (strMo1109a.length() != 0) {
            sb.append(" // ");
            sb.append(strMo1109a);
        }
        return sb.toString();
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0669l
    /* JADX INFO: renamed from: a */
    public final void mo1105a(C0970r c0970r) {
        m1223h().m1238c().mo1110a(c0970r, this);
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0669l
    /* JADX INFO: renamed from: d */
    public final AbstractC0669l mo1176d(int i) {
        return mo1103a(m1225j().m1818d(i));
    }
}
