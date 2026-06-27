package com.p046a.p049b.p058c.p060b;

import java.util.HashSet;

/* JADX INFO: renamed from: com.a.b.c.b.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0667j {

    /* JADX INFO: renamed from: a */
    private final int f1112a;

    /* JADX INFO: renamed from: b */
    private C0645aa f1113b;

    /* JADX INFO: renamed from: c */
    private InterfaceC0660c f1114c;

    /* JADX INFO: renamed from: d */
    private C0663f f1115d;

    /* JADX INFO: renamed from: e */
    private C0646ab f1116e;

    /* JADX INFO: renamed from: f */
    private C0676s f1117f;

    /* JADX INFO: renamed from: g */
    private C0670m f1118g;

    public C0667j(int i, C0645aa c0645aa, InterfaceC0660c interfaceC0660c) {
        if (c0645aa == null) {
            throw new NullPointerException("unprocessedInsns == null");
        }
        this.f1112a = i;
        this.f1113b = c0645aa;
        this.f1114c = interfaceC0660c;
        this.f1115d = null;
        this.f1116e = null;
        this.f1117f = null;
        this.f1118g = null;
    }

    /* JADX INFO: renamed from: j */
    private void m1202j() {
        if (this.f1118g != null) {
            return;
        }
        this.f1118g = this.f1113b.m1135d();
        this.f1116e = C0646ab.m1136a(this.f1118g, this.f1112a);
        this.f1117f = C0676s.m1267a(this.f1118g);
        this.f1115d = this.f1114c.mo1165a();
        this.f1113b = null;
        this.f1114c = null;
    }

    /* JADX INFO: renamed from: a */
    public final void m1203a(InterfaceC0668k interfaceC0668k) {
        this.f1113b.m1130a(interfaceC0668k);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1204a() {
        return this.f1112a != 1 && this.f1113b.m1132a();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1205b() {
        return this.f1113b.m1133b();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m1206c() {
        return this.f1114c.mo1166b();
    }

    /* JADX INFO: renamed from: d */
    public final HashSet m1207d() {
        return this.f1114c.mo1167c();
    }

    /* JADX INFO: renamed from: e */
    public final HashSet m1208e() {
        return this.f1113b.m1134c();
    }

    /* JADX INFO: renamed from: f */
    public final C0670m m1209f() {
        m1202j();
        return this.f1118g;
    }

    /* JADX INFO: renamed from: g */
    public final C0663f m1210g() {
        m1202j();
        return this.f1115d;
    }

    /* JADX INFO: renamed from: h */
    public final C0646ab m1211h() {
        m1202j();
        return this.f1116e;
    }

    /* JADX INFO: renamed from: i */
    public final C0676s m1212i() {
        m1202j();
        return this.f1117f;
    }
}
