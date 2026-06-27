package com.p046a.p049b.p058c.p060b;

import com.p046a.p047a.p048a.C0482d;
import com.p046a.p049b.p066f.p069c.AbstractC0857a;
import com.p046a.p049b.p066f.p069c.AbstractC0864f;
import com.p046a.p049b.p073h.C0959g;
import com.p046a.p049b.p073h.C0960h;
import com.p046a.p049b.p073h.C0970r;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.a.b.c.b.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0670m extends C0959g {

    /* JADX INFO: renamed from: a */
    private final int f1123a;

    private C0670m(int i, int i2) {
        super(i);
        this.f1123a = i2;
    }

    /* JADX INFO: renamed from: a */
    public static C0670m m1229a(ArrayList arrayList, int i) {
        int size = arrayList.size();
        C0670m c0670m = new C0670m(size, i);
        for (int i2 = 0; i2 < size; i2++) {
            c0670m.m2237a(i2, (AbstractC0669l) arrayList.get(i2));
        }
        c0670m.mo811b_();
        return c0670m;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC0669l m1230a(int i) {
        return (AbstractC0669l) m2240e(i);
    }

    /* JADX INFO: renamed from: a */
    public final void m1231a(C0970r c0970r) {
        int iM2270a = c0970r.m2270a();
        int iD_ = m2239d_();
        if (c0970r.m2281b()) {
            boolean zM2283c = c0970r.m2283c();
            for (int i = 0; i < iD_; i++) {
                AbstractC0669l abstractC0669l = (AbstractC0669l) m2240e(i);
                int iMo1102a = abstractC0669l.mo1102a() << 1;
                String strM1216a = (iMo1102a != 0 || zM2283c) ? abstractC0669l.m1216a("  ", c0970r.m2285e(), true) : null;
                if (strM1216a != null) {
                    c0970r.m2272a(iMo1102a, strM1216a);
                } else if (iMo1102a != 0) {
                    c0970r.m2272a(iMo1102a, "");
                }
            }
        }
        for (int i2 = 0; i2 < iD_; i2++) {
            AbstractC0669l abstractC0669l2 = (AbstractC0669l) m2240e(i2);
            try {
                abstractC0669l2.mo1105a(c0970r);
            } catch (RuntimeException e) {
                throw C0482d.m570a(e, "...while writing " + abstractC0669l2);
            }
        }
        int iM2270a2 = (c0970r.m2270a() - iM2270a) / 2;
        if (iM2270a2 != m1233e()) {
            throw new RuntimeException("write length mismatch; expected " + m1233e() + " but actually wrote " + iM2270a2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1232a(Writer writer, String str, boolean z) {
        C0960h c0960h = new C0960h(writer, 0, str);
        int iD_ = m2239d_();
        for (int i = 0; i < iD_; i++) {
            try {
                AbstractC0669l abstractC0669l = (AbstractC0669l) m2240e(i);
                String strM1216a = (abstractC0669l.mo1102a() != 0 || z) ? abstractC0669l.m1216a("", 0, z) : null;
                if (strM1216a != null) {
                    c0960h.write(strM1216a);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        c0960h.flush();
    }

    /* JADX INFO: renamed from: e */
    public final int m1233e() {
        int iD_ = m2239d_();
        if (iD_ == 0) {
            return 0;
        }
        return m1230a(iD_ - 1).m1228m();
    }

    /* JADX INFO: renamed from: f */
    public final int m1234f() {
        return this.f1123a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m1235g() {
        int iM1879b;
        int iD_ = m2239d_();
        int i = 0;
        int i2 = 0;
        while (i < iD_) {
            AbstractC0669l abstractC0669l = (AbstractC0669l) m2240e(i);
            if (abstractC0669l instanceof C0666i) {
                AbstractC0857a abstractC0857aM1199c = ((C0666i) abstractC0669l).m1199c();
                if (abstractC0857aM1199c instanceof AbstractC0864f) {
                    iM1879b = ((AbstractC0864f) abstractC0857aM1199c).m1879b(abstractC0669l.m1223h().m1237b() == 113);
                    if (iM1879b > i2) {
                    }
                } else {
                    iM1879b = i2;
                }
            }
            i++;
            i2 = iM1879b;
        }
        return i2;
    }
}
