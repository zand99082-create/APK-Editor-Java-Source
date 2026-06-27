package com.p046a.p049b.p058c.p060b;

import com.p046a.p049b.p066f.p068b.AbstractC0839i;
import com.p046a.p049b.p066f.p068b.C0827a;
import com.p046a.p049b.p066f.p068b.C0828aa;
import com.p046a.p049b.p066f.p068b.C0829ab;
import com.p046a.p049b.p066f.p068b.C0830ac;
import com.p046a.p049b.p066f.p068b.C0838h;
import com.p046a.p049b.p066f.p068b.C0846p;
import com.p046a.p049b.p066f.p068b.C0847q;
import com.p046a.p049b.p066f.p068b.C0848r;
import com.p046a.p049b.p066f.p068b.C0850t;
import com.p046a.p049b.p066f.p068b.C0853w;
import com.p046a.p049b.p066f.p068b.C0856z;
import com.p046a.p049b.p066f.p068b.InterfaceC0841k;
import com.p046a.p049b.p066f.p069c.AbstractC0857a;
import com.p046a.p049b.p066f.p069c.C0872n;
import com.p046a.p049b.p073h.C0962j;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.a.b.c.b.ah */
/* JADX INFO: loaded from: classes.dex */
class C0652ah implements InterfaceC0841k {

    /* JADX INFO: renamed from: a */
    private final C0683z f1086a;

    /* JADX INFO: renamed from: b */
    private C0827a f1087b;

    /* JADX INFO: renamed from: c */
    private C0665h f1088c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ C0649ae f1089d;

    public C0652ah(C0649ae c0649ae, C0683z c0683z) {
        this.f1089d = c0649ae;
        this.f1086a = c0683z;
    }

    /* JADX INFO: renamed from: a */
    private C0848r m1157a() {
        int iM1721d = this.f1087b.m1721d();
        if (iM1721d < 0) {
            return null;
        }
        AbstractC0839i abstractC0839iM1759a = this.f1089d.f1072a.m1844a().m1740b(iM1721d).m1719b().m1759a(0);
        if (abstractC0839iM1759a.m1752f().m1836a() == 56) {
            return abstractC0839iM1759a.m1754h();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    private void m1158b(AbstractC0669l abstractC0669l) {
        this.f1086a.m1298b(abstractC0669l);
    }

    /* JADX INFO: renamed from: a */
    protected final void m1159a(AbstractC0669l abstractC0669l) {
        this.f1086a.m1297a(abstractC0669l);
    }

    /* JADX INFO: renamed from: a */
    public final void m1160a(C0827a c0827a, C0665h c0665h) {
        this.f1087b = c0827a;
        this.f1088c = c0665h;
    }

    @Override // com.p046a.p049b.p066f.p068b.InterfaceC0841k
    /* JADX INFO: renamed from: a */
    public void mo1153a(C0828aa c0828aa) {
        C0856z c0856zG = c0828aa.m1753g();
        C0962j c0962jM1733c = c0828aa.m1733c();
        C0962j c0962jM1720c = this.f1087b.m1720c();
        int iM2247b = c0962jM1733c.m2247b();
        int iM2247b2 = c0962jM1720c.m2247b();
        int iM1721d = this.f1087b.m1721d();
        if (iM2247b != iM2247b2 - 1 || iM1721d != c0962jM1720c.m2248b(iM2247b)) {
            throw new RuntimeException("shouldn't happen");
        }
        C0665h[] c0665hArr = new C0665h[iM2247b];
        for (int i = 0; i < iM2247b; i++) {
            c0665hArr[i] = this.f1089d.f1075d.m1178a(c0962jM1720c.m2248b(i));
        }
        C0665h c0665h = new C0665h(c0856zG);
        C0665h c0665h2 = new C0665h(this.f1088c.m1224i(), true);
        C0655ak c0655ak = new C0655ak(c0856zG, c0665h2, c0962jM1733c, c0665hArr);
        AbstractC0669l c0656al = new C0656al(c0655ak.m1170c() ? C0672o.f1137I : C0672o.f1138J, c0856zG, C0649ae.m1146b(c0828aa, c0828aa.m1754h()), c0665h);
        m1159a(c0665h2);
        m1159a(c0656al);
        m1158b(new C0682y(c0856zG));
        m1158b(c0665h);
        m1158b(c0655ak);
    }

    @Override // com.p046a.p049b.p066f.p068b.InterfaceC0841k
    /* JADX INFO: renamed from: a */
    public void mo1154a(C0829ab c0829ab) {
        C0856z c0856zG = c0829ab.m1753g();
        C0671n c0671nM1140a = C0648ad.m1140a(c0829ab);
        C0853w c0853wF = c0829ab.m1752f();
        AbstractC0857a abstractC0857aG_ = c0829ab.m1748g_();
        if (c0853wF.m1839d() != 6) {
            throw new RuntimeException("shouldn't happen");
        }
        m1159a(this.f1088c);
        if (c0853wF.m1840e()) {
            m1159a(new C0666i(c0671nM1140a, c0856zG, c0829ab.m1756j(), abstractC0857aG_));
            return;
        }
        C0848r c0848rM1157a = m1157a();
        C0850t c0850tM1146b = C0649ae.m1146b(c0829ab, c0848rM1157a);
        if ((c0671nM1140a.m1239d() || c0853wF.m1836a() == 43) != (c0848rM1157a != null)) {
            throw new RuntimeException("Insn with result/move-result-pseudo mismatch " + c0829ab);
        }
        m1159a((c0853wF.m1836a() != 41 || c0671nM1140a.m1236a() == 35) ? new C0666i(c0671nM1140a, c0856zG, c0850tM1146b, abstractC0857aG_) : new C0653ai(c0671nM1140a, c0856zG, c0850tM1146b));
    }

    @Override // com.p046a.p049b.p066f.p068b.InterfaceC0841k
    /* JADX INFO: renamed from: a */
    public void mo1155a(C0830ac c0830ac) {
        C0856z c0856zG = c0830ac.m1753g();
        C0671n c0671nM1140a = C0648ad.m1140a(c0830ac);
        if (c0830ac.m1752f().m1839d() != 6) {
            throw new RuntimeException("shouldn't happen");
        }
        C0848r c0848rM1157a = m1157a();
        if (c0671nM1140a.m1239d() != (c0848rM1157a != null)) {
            throw new RuntimeException("Insn with result/move-result-pseudo mismatch" + c0830ac);
        }
        m1159a(this.f1088c);
        m1159a(new C0653ai(c0671nM1140a, c0856zG, C0649ae.m1146b(c0830ac, c0848rM1157a)));
    }

    @Override // com.p046a.p049b.p066f.p068b.InterfaceC0841k
    /* JADX INFO: renamed from: a */
    public final void mo1161a(C0838h c0838h) {
        C0856z c0856zG = c0838h.m1753g();
        AbstractC0857a abstractC0857aM1750e = c0838h.m1750e();
        ArrayList arrayListM1749c = c0838h.m1749c();
        if (c0838h.m1752f().m1839d() != 1) {
            throw new RuntimeException("shouldn't happen");
        }
        C0665h c0665h = new C0665h(c0856zG);
        AbstractC0669l c0619a = new C0619a(c0856zG, this.f1088c, arrayListM1749c, abstractC0857aM1750e);
        AbstractC0669l c0656al = new C0656al(C0672o.f1134F, c0856zG, C0649ae.m1146b(c0838h, c0838h.m1754h()), c0665h);
        m1159a(this.f1088c);
        m1159a(c0656al);
        m1158b(new C0682y(c0856zG));
        m1158b(c0665h);
        m1158b(c0619a);
    }

    @Override // com.p046a.p049b.p066f.p068b.InterfaceC0841k
    /* JADX INFO: renamed from: a */
    public void mo1151a(C0846p c0846p) {
        C0856z c0856zG = c0846p.m1753g();
        C0671n c0671nM1140a = C0648ad.m1140a(c0846p);
        C0853w c0853wF = c0846p.m1752f();
        int iM1836a = c0853wF.m1836a();
        if (c0853wF.m1839d() != 1) {
            throw new RuntimeException("shouldn't happen");
        }
        if (iM1836a != 3) {
            m1159a(new C0666i(c0671nM1140a, c0856zG, C0649ae.m1146b(c0846p, c0846p.m1754h()), c0846p.m1748g_()));
        } else {
            if (this.f1089d.f1081j) {
                return;
            }
            C0848r c0848rH = c0846p.m1754h();
            m1159a(new C0653ai(c0671nM1140a, c0856zG, C0850t.m1809a(c0848rH, C0848r.m1778a(((C0872n) c0846p.m1748g_()).mo1894j() + (this.f1089d.f1078g - this.f1089d.f1080i), c0848rH.mo925a()))));
        }
    }

    @Override // com.p046a.p049b.p066f.p068b.InterfaceC0841k
    /* JADX INFO: renamed from: a */
    public void mo1156a(C0847q c0847q) {
        AbstractC0669l c0656al;
        C0853w c0853wF = c0847q.m1752f();
        if (c0853wF.m1836a() == 54 || c0853wF.m1836a() == 56) {
            return;
        }
        C0856z c0856zG = c0847q.m1753g();
        C0671n c0671nM1140a = C0648ad.m1140a(c0847q);
        switch (c0853wF.m1839d()) {
            case 1:
            case 2:
            case 6:
                c0656al = new C0653ai(c0671nM1140a, c0856zG, C0649ae.m1146b(c0847q, c0847q.m1754h()));
                break;
            case 3:
                return;
            case 4:
                c0656al = new C0656al(c0671nM1140a, c0856zG, C0649ae.m1146b(c0847q, c0847q.m1754h()), this.f1089d.f1075d.m1178a(this.f1087b.m1720c().m2248b(1)));
                break;
            case 5:
            default:
                throw new RuntimeException("shouldn't happen");
        }
        m1159a(c0656al);
    }
}
