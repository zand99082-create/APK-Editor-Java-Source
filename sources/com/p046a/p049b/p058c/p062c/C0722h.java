package com.p046a.p049b.p058c.p062c;

import com.gmail.heagoo.p084a.p089c.C1067a;
import com.p046a.p049b.p058c.p060b.C0661d;
import com.p046a.p049b.p058c.p060b.C0662e;
import com.p046a.p049b.p058c.p060b.C0663f;
import com.p046a.p049b.p058c.p060b.C0664g;
import com.p046a.p049b.p058c.p060b.C0667j;
import com.p046a.p049b.p073h.C0970r;
import java.io.PrintWriter;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.a.b.c.c.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0722h {

    /* JADX INFO: renamed from: a */
    private final C0667j f1470a;

    /* JADX INFO: renamed from: b */
    private C0663f f1471b = null;

    /* JADX INFO: renamed from: c */
    private byte[] f1472c = null;

    /* JADX INFO: renamed from: d */
    private int f1473d = 0;

    /* JADX INFO: renamed from: e */
    private TreeMap f1474e = null;

    public C0722h(C0667j c0667j) {
        this.f1470a = c0667j;
    }

    /* JADX INFO: renamed from: a */
    private static void m1413a(C0661d c0661d, int i, int i2, String str, PrintWriter printWriter, C0970r c0970r) {
        String strM1184a = c0661d.m1184a(str, C1067a.m2558v(i) + ": ");
        if (printWriter != null) {
            printWriter.println(strM1184a);
        }
        c0970r.m2272a(i2, strM1184a);
    }

    /* JADX INFO: renamed from: a */
    private void m1414a(String str, PrintWriter printWriter, C0970r c0970r) {
        int i = 0;
        m1415c();
        boolean z = c0970r != null;
        int i2 = z ? 6 : 0;
        int i3 = z ? 2 : 0;
        int iD_ = this.f1471b.m2239d_();
        String str2 = str + "  ";
        if (z) {
            c0970r.m2272a(0, str + "tries:");
        } else {
            printWriter.println(str + "tries:");
        }
        for (int i4 = 0; i4 < iD_; i4++) {
            C0664g c0664gM1190a = this.f1471b.m1190a(i4);
            C0661d c0661dM1195c = c0664gM1190a.m1195c();
            String str3 = str2 + "try " + C1067a.m2559w(c0664gM1190a.m1192a()) + ".." + C1067a.m2559w(c0664gM1190a.m1194b());
            String strM1184a = c0661dM1195c.m1184a(str2, "");
            if (z) {
                c0970r.m2272a(i2, str3);
                c0970r.m2272a(i3, strM1184a);
            } else {
                printWriter.println(str3);
                printWriter.println(strM1184a);
            }
        }
        if (z) {
            c0970r.m2272a(0, str + "handlers:");
            c0970r.m2272a(this.f1473d, str2 + "size: " + C1067a.m2558v(this.f1474e.size()));
            C0661d c0661d = null;
            for (Map.Entry entry : this.f1474e.entrySet()) {
                C0661d c0661d2 = (C0661d) entry.getKey();
                int iIntValue = ((Integer) entry.getValue()).intValue();
                if (c0661d != null) {
                    m1413a(c0661d, i, iIntValue - i, str2, printWriter, c0970r);
                }
                c0661d = c0661d2;
                i = iIntValue;
            }
            m1413a(c0661d, i, this.f1472c.length - i, str2, printWriter, c0970r);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m1415c() {
        if (this.f1471b == null) {
            this.f1471b = this.f1470a.m1210g();
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m1416a() {
        m1415c();
        return this.f1471b.m2239d_();
    }

    /* JADX INFO: renamed from: a */
    public final void m1417a(C0732r c0732r) {
        int i;
        m1415c();
        C0712ba c0712baM1491k = c0732r.m1491k();
        int iD_ = this.f1471b.m2239d_();
        this.f1474e = new TreeMap();
        for (int i2 = 0; i2 < iD_; i2++) {
            this.f1474e.put(this.f1471b.m1190a(i2).m1195c(), null);
        }
        if (this.f1474e.size() > 65535) {
            throw new UnsupportedOperationException("too many catch handlers");
        }
        C0970r c0970r = new C0970r();
        this.f1473d = c0970r.m2286e(this.f1474e.size());
        for (Map.Entry entry : this.f1474e.entrySet()) {
            C0661d c0661d = (C0661d) entry.getKey();
            int iD_2 = c0661d.m2239d_();
            boolean zM1186e = c0661d.m1186e();
            entry.setValue(Integer.valueOf(c0970r.m2270a()));
            if (zM1186e) {
                c0970r.m2291h(-(iD_2 - 1));
                i = iD_2 - 1;
            } else {
                c0970r.m2291h(iD_2);
                i = iD_2;
            }
            for (int i3 = 0; i3 < i; i3++) {
                C0662e c0662eM1183a = c0661d.m1183a(i3);
                c0970r.m2286e(c0712baM1491k.m1381b(c0662eM1183a.m1188a()));
                c0970r.m2286e(c0662eM1183a.m1189b());
            }
            if (zM1186e) {
                c0970r.m2286e(c0661d.m1183a(i).m1189b());
            }
        }
        this.f1472c = c0970r.m2290g();
    }

    /* JADX INFO: renamed from: a */
    public final void m1418a(C0970r c0970r) {
        m1415c();
        if (c0970r.m2281b()) {
            m1414a("  ", null, c0970r);
        }
        int iD_ = this.f1471b.m2239d_();
        for (int i = 0; i < iD_; i++) {
            C0664g c0664gM1190a = this.f1471b.m1190a(i);
            int iM1192a = c0664gM1190a.m1192a();
            int iM1194b = c0664gM1190a.m1194b();
            int i2 = iM1194b - iM1192a;
            if (i2 >= 65536) {
                throw new UnsupportedOperationException("bogus exception range: " + C1067a.m2556t(iM1192a) + ".." + C1067a.m2556t(iM1194b));
            }
            c0970r.m2282c(iM1192a);
            c0970r.m2280b(i2);
            c0970r.m2280b(((Integer) this.f1474e.get(c0664gM1190a.m1195c())).intValue());
        }
        c0970r.m2278a(this.f1472c);
    }

    /* JADX INFO: renamed from: a */
    public final void m1419a(PrintWriter printWriter, String str) {
        m1414a(str, printWriter, null);
    }

    /* JADX INFO: renamed from: b */
    public final int m1420b() {
        return (m1416a() << 3) + this.f1472c.length;
    }
}
