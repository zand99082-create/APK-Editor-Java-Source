package com.p046a.p049b.p063d;

import com.p046a.p049b.p063d.p064a.AbstractC0774f;

/* JADX INFO: renamed from: com.a.b.d.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0741a {

    /* JADX INFO: renamed from: a */
    private InterfaceC0796c f1545a = null;

    /* JADX INFO: renamed from: b */
    private InterfaceC0796c f1546b = null;

    /* JADX INFO: renamed from: c */
    private InterfaceC0796c f1547c = null;

    /* JADX INFO: renamed from: d */
    private InterfaceC0796c f1548d = null;

    /* JADX INFO: renamed from: e */
    private InterfaceC0796c f1549e = null;

    /* JADX INFO: renamed from: a */
    public final void m1515a(InterfaceC0796c interfaceC0796c) {
        this.f1545a = interfaceC0796c;
        this.f1546b = interfaceC0796c;
        this.f1547c = interfaceC0796c;
        this.f1548d = interfaceC0796c;
        this.f1549e = interfaceC0796c;
    }

    /* JADX INFO: renamed from: a */
    public final void m1516a(AbstractC0774f[] abstractC0774fArr) {
        for (AbstractC0774f abstractC0774f : abstractC0774fArr) {
            if (abstractC0774f != null) {
                InterfaceC0796c interfaceC0796c = null;
                switch (C0795b.f1619a[C0798e.m1602c(abstractC0774f.m1557b()) - 1]) {
                    case 1:
                        interfaceC0796c = this.f1546b;
                        break;
                    case 2:
                        interfaceC0796c = this.f1547c;
                        break;
                    case 3:
                        interfaceC0796c = this.f1548d;
                        break;
                    case 4:
                        interfaceC0796c = this.f1549e;
                        break;
                }
                if (interfaceC0796c == null) {
                    interfaceC0796c = this.f1545a;
                }
                if (interfaceC0796c != null) {
                    interfaceC0796c.mo1597a(abstractC0774f);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1517b(InterfaceC0796c interfaceC0796c) {
        this.f1546b = interfaceC0796c;
    }

    /* JADX INFO: renamed from: c */
    public final void m1518c(InterfaceC0796c interfaceC0796c) {
        this.f1547c = interfaceC0796c;
    }

    /* JADX INFO: renamed from: d */
    public final void m1519d(InterfaceC0796c interfaceC0796c) {
        this.f1548d = interfaceC0796c;
    }

    /* JADX INFO: renamed from: e */
    public final void m1520e(InterfaceC0796c interfaceC0796c) {
        this.f1549e = interfaceC0796c;
    }
}
