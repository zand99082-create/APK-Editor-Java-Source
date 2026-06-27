package com.p046a.p049b.p071g;

import com.p046a.p049b.p066f.p068b.C0848r;
import com.p046a.p049b.p066f.p068b.C0850t;
import com.p046a.p049b.p071g.p072a.C0899i;
import com.p046a.p049b.p073h.C0953a;
import com.p046a.p049b.p073h.InterfaceC0963k;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.a.b.g.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0944r extends C0890a {

    /* JADX INFO: renamed from: a */
    private final ArrayList f2537a;

    /* JADX INFO: renamed from: b */
    private final C0899i f2538b;

    public C0944r(C0899i c0899i, int i) {
        super(i);
        this.f2537a = new ArrayList();
        this.f2538b = c0899i;
    }

    /* JADX INFO: renamed from: a */
    private void m2182a(int i, int i2) {
        this.f2537a.ensureCapacity(i + 1);
        while (i >= this.f2537a.size()) {
            this.f2537a.add(new C0953a(i + 1));
        }
        this.f2538b.m2000a(i2, (InterfaceC0963k) this.f2537a.get(i));
    }

    /* JADX INFO: renamed from: b */
    private boolean m2183b(int i, int i2, int i3) {
        InterfaceC0963k interfaceC0963k;
        if (i2 < this.f2537a.size() && (interfaceC0963k = (InterfaceC0963k) this.f2537a.get(i2)) != null) {
            return i3 == 1 ? interfaceC0963k.mo2209b(i) : interfaceC0963k.mo2209b(i) || m2183b(i, i2 + 1, i3 + (-1));
        }
        return false;
    }

    @Override // com.p046a.p049b.p071g.C0890a
    /* JADX INFO: renamed from: a */
    public final void mo1963a(int i, int i2, int i3) {
        super.mo1963a(i, i2, i3);
        m2182a(i2, i);
        if (i3 == 2) {
            m2182a(i2 + 1, i);
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m2184a(C0848r c0848r, int i) {
        return m2183b(c0848r.m1795g(), i, c0848r.m1799k());
    }

    /* JADX INFO: renamed from: a */
    public final boolean m2185a(C0850t c0850t, int i, int i2) {
        int iD_ = c0850t.m2239d_();
        for (int i3 = 0; i3 < iD_; i3++) {
            C0848r c0848rM1815b = c0850t.m1815b(i3);
            int iA = m1961a(c0848rM1815b.m1795g());
            if (iA == i || ((c0848rM1815b.m1799k() == 2 && iA + 1 == i) || (i2 == 2 && iA == i + 1))) {
                return true;
            }
        }
        return false;
    }
}
