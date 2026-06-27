package com.p046a.p049b.p058c.p060b;

import com.p046a.p049b.p066f.p068b.C0850t;
import com.p046a.p049b.p066f.p068b.C0856z;

/* JADX INFO: renamed from: com.a.b.c.b.al */
/* JADX INFO: loaded from: classes.dex */
public final class C0656al extends AbstractC0673p {

    /* JADX INFO: renamed from: a */
    private C0665h f1097a;

    public C0656al(C0671n c0671n, C0856z c0856z, C0850t c0850t, C0665h c0665h) {
        super(c0671n, c0856z, c0850t);
        if (c0665h == null) {
            throw new NullPointerException("target == null");
        }
        this.f1097a = c0665h;
    }

    /* JADX INFO: renamed from: a */
    public final C0656al m1171a(C0665h c0665h) {
        return new C0656al(m1223h().m1242g(), m1224i(), m1225j(), c0665h);
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0669l
    /* JADX INFO: renamed from: a */
    public final AbstractC0669l mo1162a(C0671n c0671n) {
        return new C0656al(c0671n, m1224i(), m1225j(), this.f1097a);
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0669l
    /* JADX INFO: renamed from: a */
    public final AbstractC0669l mo1103a(C0850t c0850t) {
        return new C0656al(m1223h(), m1224i(), c0850t, this.f1097a);
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0669l
    /* JADX INFO: renamed from: b */
    protected final String mo1106b() {
        return this.f1097a == null ? "????" : this.f1097a.m1227l();
    }

    /* JADX INFO: renamed from: c */
    public final C0665h m1172c() {
        return this.f1097a;
    }

    /* JADX INFO: renamed from: d */
    public final int m1173d() {
        return this.f1097a.m1222g();
    }

    /* JADX INFO: renamed from: e */
    public final int m1174e() {
        return this.f1097a.m1222g() - m1222g();
    }

    /* JADX INFO: renamed from: n */
    public final boolean m1175n() {
        return m1221f() && this.f1097a.m1221f();
    }
}
