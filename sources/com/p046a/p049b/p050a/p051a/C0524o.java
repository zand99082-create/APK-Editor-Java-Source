package com.p046a.p049b.p050a.p051a;

import com.p046a.p049b.p050a.p055e.AbstractC0588a;
import com.p046a.p049b.p066f.p069c.C0883y;

/* JADX INFO: renamed from: com.a.b.a.a.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0524o extends AbstractC0588a {

    /* JADX INFO: renamed from: a */
    private final C0883y f793a;

    public C0524o(C0883y c0883y) {
        super("Signature");
        if (c0883y == null) {
            throw new NullPointerException("signature == null");
        }
        this.f793a = c0883y;
    }

    @Override // com.p046a.p049b.p050a.p055e.AbstractC0588a
    /* JADX INFO: renamed from: a */
    public final int mo705a() {
        return 8;
    }

    /* JADX INFO: renamed from: b */
    public final C0883y m718b() {
        return this.f793a;
    }
}
