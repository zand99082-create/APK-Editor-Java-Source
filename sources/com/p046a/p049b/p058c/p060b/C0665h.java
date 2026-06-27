package com.p046a.p049b.p058c.p060b;

import com.p046a.p049b.p066f.p068b.C0850t;
import com.p046a.p049b.p066f.p068b.C0856z;

/* JADX INFO: renamed from: com.a.b.c.b.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0665h extends AbstractC0658an {

    /* JADX INFO: renamed from: a */
    private final boolean f1108a;

    public C0665h(C0856z c0856z) {
        this(c0856z, false);
    }

    public C0665h(C0856z c0856z, boolean z) {
        super(c0856z);
        this.f1108a = z;
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0669l
    /* JADX INFO: renamed from: a */
    public final AbstractC0669l mo1103a(C0850t c0850t) {
        return new C0665h(m1224i());
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0669l
    /* JADX INFO: renamed from: a */
    protected final String mo1104a(boolean z) {
        return "code-address";
    }

    @Override // com.p046a.p049b.p058c.p060b.AbstractC0669l
    /* JADX INFO: renamed from: b */
    protected final String mo1106b() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m1196c() {
        return this.f1108a;
    }
}
