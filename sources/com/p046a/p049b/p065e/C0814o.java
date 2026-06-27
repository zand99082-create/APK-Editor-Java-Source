package com.p046a.p049b.p065e;

import com.p046a.p047a.C0503t;
import com.p046a.p049b.p063d.C0741a;
import com.p046a.p049b.p063d.p064a.AbstractC0774f;
import com.p046a.p049b.p063d.p064a.C0765aw;

/* JADX INFO: renamed from: com.a.b.e.o */
/* JADX INFO: loaded from: classes.dex */
final class C0814o {

    /* JADX INFO: renamed from: a */
    private final C0812m f1924a;

    /* JADX INFO: renamed from: b */
    private final C0741a f1925b = new C0741a();

    /* JADX INFO: renamed from: c */
    private AbstractC0774f[] f1926c;

    /* JADX INFO: renamed from: d */
    private int f1927d;

    public C0814o(C0812m c0812m) {
        byte b2 = 0;
        this.f1924a = c0812m;
        this.f1925b.m1515a(new C0816q(this, b2));
        this.f1925b.m1517b(new C0818s(this, b2));
        this.f1925b.m1518c(new C0819t(this, b2));
        this.f1925b.m1519d(new C0815p(this, b2));
        this.f1925b.m1520e(new C0817r(this, b2));
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ void m1688a(boolean z, int i) {
        if (!z && i > 65535) {
            throw new C0503t("Cannot merge new index " + i + " into a non-jumbo instruction!");
        }
    }

    /* JADX INFO: renamed from: b */
    static /* synthetic */ int m1690b(C0814o c0814o) {
        int i = c0814o.f1927d;
        c0814o.f1927d = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: a */
    public final short[] m1692a(short[] sArr) {
        AbstractC0774f[] abstractC0774fArrM1553a = AbstractC0774f.m1553a(sArr);
        int length = abstractC0774fArrM1553a.length;
        this.f1926c = new AbstractC0774f[length];
        this.f1927d = 0;
        this.f1925b.m1516a(abstractC0774fArrM1553a);
        C0765aw c0765aw = new C0765aw(length);
        for (AbstractC0774f abstractC0774f : this.f1926c) {
            if (abstractC0774f != null) {
                abstractC0774f.m1556a(c0765aw);
            }
        }
        return c0765aw.m1543c();
    }
}
