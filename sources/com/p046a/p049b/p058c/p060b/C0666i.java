package com.p046a.p049b.p058c.p060b;

import com.p046a.p049b.p066f.p068b.C0850t;
import com.p046a.p049b.p066f.p068b.C0856z;
import com.p046a.p049b.p066f.p069c.AbstractC0857a;

/* JADX INFO: renamed from: com.a.b.c.b.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0666i extends AbstractC0673p {

    /* JADX INFO: renamed from: a */
    private final AbstractC0857a f1109a;

    /* JADX INFO: renamed from: b */
    private int f1110b;

    /* JADX INFO: renamed from: c */
    private int f1111c;

    public C0666i(C0671n c0671n, C0856z c0856z, C0850t c0850t, AbstractC0857a abstractC0857a) {
        super(c0671n, c0856z, c0850t);
        if (abstractC0857a == null) {
            throw new NullPointerException("constant == null");
        }
        this.f1109a = abstractC0857a;
        this.f1110b = -1;
        this.f1111c = -1;
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0669l
    /* JADX INFO: renamed from: a */
    public final AbstractC0669l mo1162a(C0671n c0671n) {
        C0666i c0666i = new C0666i(c0671n, m1224i(), m1225j(), this.f1109a);
        if (this.f1110b >= 0) {
            c0666i.m1197a(this.f1110b);
        }
        if (this.f1111c >= 0) {
            c0666i.m1198b(this.f1111c);
        }
        return c0666i;
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0669l
    /* JADX INFO: renamed from: a */
    public final AbstractC0669l mo1103a(C0850t c0850t) {
        C0666i c0666i = new C0666i(m1223h(), m1224i(), c0850t, this.f1109a);
        if (this.f1110b >= 0) {
            c0666i.m1197a(this.f1110b);
        }
        if (this.f1111c >= 0) {
            c0666i.m1198b(this.f1111c);
        }
        return c0666i;
    }

    /* JADX INFO: renamed from: a */
    public final void m1197a(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("index < 0");
        }
        if (this.f1110b >= 0) {
            throw new RuntimeException("index already set");
        }
        this.f1110b = i;
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0669l
    /* JADX INFO: renamed from: b */
    protected final String mo1106b() {
        return this.f1109a.mo919d();
    }

    /* JADX INFO: renamed from: b */
    public final void m1198b(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("index < 0");
        }
        if (this.f1111c >= 0) {
            throw new RuntimeException("class index already set");
        }
        this.f1111c = i;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC0857a m1199c() {
        return this.f1109a;
    }

    /* JADX INFO: renamed from: d */
    public final int m1200d() {
        if (this.f1110b < 0) {
            throw new RuntimeException("index not yet set for " + this.f1109a);
        }
        return this.f1110b;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m1201e() {
        return this.f1110b >= 0;
    }
}
