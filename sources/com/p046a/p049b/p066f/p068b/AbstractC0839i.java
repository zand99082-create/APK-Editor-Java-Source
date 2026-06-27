package com.p046a.p049b.p066f.p068b;

import com.p046a.p049b.p066f.p070d.C0886b;
import com.p046a.p049b.p066f.p070d.C0887c;
import com.p046a.p049b.p066f.p070d.InterfaceC0889e;
import com.p046a.p049b.p073h.InterfaceC0971s;

/* JADX INFO: renamed from: com.a.b.f.b.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0839i implements InterfaceC0971s {

    /* JADX INFO: renamed from: a */
    private final C0853w f1981a;

    /* JADX INFO: renamed from: b */
    private final C0856z f1982b;

    /* JADX INFO: renamed from: c */
    private final C0848r f1983c;

    /* JADX INFO: renamed from: d */
    private final C0850t f1984d;

    public AbstractC0839i(C0853w c0853w, C0856z c0856z, C0848r c0848r, C0850t c0850t) {
        if (c0853w == null) {
            throw new NullPointerException("opcode == null");
        }
        if (c0856z == null) {
            throw new NullPointerException("position == null");
        }
        if (c0850t == null) {
            throw new NullPointerException("sources == null");
        }
        this.f1981a = c0853w;
        this.f1982b = c0856z;
        this.f1983c = c0848r;
        this.f1984d = c0850t;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m1751a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* JADX INFO: renamed from: a */
    public abstract AbstractC0839i mo1727a(C0848r c0848r, C0850t c0850t);

    /* JADX INFO: renamed from: a */
    public abstract AbstractC0839i mo1728a(C0887c c0887c);

    /* JADX INFO: renamed from: a */
    public String mo1729a() {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo1730a(InterfaceC0841k interfaceC0841k);

    /* JADX INFO: renamed from: a */
    public boolean mo1731a(AbstractC0839i abstractC0839i) {
        return this.f1981a == abstractC0839i.f1981a && this.f1982b.equals(abstractC0839i.f1982b) && getClass() == abstractC0839i.getClass() && m1751a(this.f1983c, abstractC0839i.f1983c) && m1751a(this.f1984d, abstractC0839i.f1984d) && C0886b.m1933a(mo1732b(), abstractC0839i.mo1732b());
    }

    /* JADX INFO: renamed from: b */
    public abstract InterfaceC0889e mo1732b();

    @Override // com.p046a.p049b.p073h.InterfaceC0971s
    /* JADX INFO: renamed from: d */
    public final String mo919d() {
        String strMo1729a = mo1729a();
        StringBuffer stringBuffer = new StringBuffer(80);
        stringBuffer.append(this.f1982b);
        stringBuffer.append(": ");
        stringBuffer.append(this.f1981a.m1842g());
        if (strMo1729a != null) {
            stringBuffer.append("(");
            stringBuffer.append(strMo1729a);
            stringBuffer.append(")");
        }
        if (this.f1983c == null) {
            stringBuffer.append(" .");
        } else {
            stringBuffer.append(" ");
            stringBuffer.append(this.f1983c.mo919d());
        }
        stringBuffer.append(" <-");
        int iD_ = this.f1984d.m2239d_();
        if (iD_ == 0) {
            stringBuffer.append(" .");
        } else {
            for (int i = 0; i < iD_; i++) {
                stringBuffer.append(" ");
                stringBuffer.append(this.f1984d.m1815b(i).mo919d());
            }
        }
        return stringBuffer.toString();
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    /* JADX INFO: renamed from: f */
    public final C0853w m1752f() {
        return this.f1981a;
    }

    /* JADX INFO: renamed from: g */
    public final C0856z m1753g() {
        return this.f1982b;
    }

    /* JADX INFO: renamed from: h */
    public final C0848r m1754h() {
        return this.f1983c;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    /* JADX INFO: renamed from: i */
    public final C0848r m1755i() {
        C0848r c0848rM1815b = this.f1981a.m1836a() == 54 ? this.f1984d.m1815b(0) : this.f1983c;
        if (c0848rM1815b == null || c0848rM1815b.m1797i() == null) {
            return null;
        }
        return c0848rM1815b;
    }

    /* JADX INFO: renamed from: j */
    public final C0850t m1756j() {
        return this.f1984d;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m1757k() {
        return this.f1981a.m1843h();
    }

    /* JADX INFO: renamed from: l */
    public AbstractC0839i mo1758l() {
        return this;
    }

    public String toString() {
        String strMo1729a = mo1729a();
        StringBuffer stringBuffer = new StringBuffer(80);
        stringBuffer.append("Insn{");
        stringBuffer.append(this.f1982b);
        stringBuffer.append(' ');
        stringBuffer.append(this.f1981a);
        if (strMo1729a != null) {
            stringBuffer.append(' ');
            stringBuffer.append(strMo1729a);
        }
        stringBuffer.append(" :: ");
        if (this.f1983c != null) {
            stringBuffer.append(this.f1983c);
            stringBuffer.append(" <- ");
        }
        stringBuffer.append(this.f1984d);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
