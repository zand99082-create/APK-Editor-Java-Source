package com.p046a.p049b.p050a.p051a;

import com.p046a.p049b.p050a.p055e.AbstractC0588a;
import com.p046a.p049b.p066f.p069c.C0881w;
import com.p046a.p049b.p066f.p069c.C0884z;

/* JADX INFO: renamed from: com.a.b.a.a.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0514e extends AbstractC0588a {

    /* JADX INFO: renamed from: a */
    private final C0884z f788a;

    /* JADX INFO: renamed from: b */
    private final C0881w f789b;

    public C0514e(C0884z c0884z, C0881w c0881w) {
        super("EnclosingMethod");
        if (c0884z == null) {
            throw new NullPointerException("type == null");
        }
        this.f788a = c0884z;
        this.f789b = c0881w;
    }

    @Override // com.p046a.p049b.p050a.p055e.AbstractC0588a
    /* JADX INFO: renamed from: a */
    public final int mo705a() {
        return 10;
    }

    /* JADX INFO: renamed from: b */
    public final C0884z m713b() {
        return this.f788a;
    }

    /* JADX INFO: renamed from: c */
    public final C0881w m714c() {
        return this.f789b;
    }
}
