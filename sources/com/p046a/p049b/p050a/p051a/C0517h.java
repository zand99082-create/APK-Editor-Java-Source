package com.p046a.p049b.p050a.p051a;

import com.p046a.p049b.p050a.p052b.C0559o;
import com.p046a.p049b.p050a.p055e.AbstractC0588a;
import com.p046a.p049b.p073h.C0969q;

/* JADX INFO: renamed from: com.a.b.a.a.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0517h extends AbstractC0588a {

    /* JADX INFO: renamed from: a */
    private final C0559o f792a;

    public C0517h(C0559o c0559o) {
        super("LineNumberTable");
        try {
            if (c0559o.m2264c_()) {
                throw new C0969q("lineNumbers.isMutable()");
            }
            this.f792a = c0559o;
        } catch (NullPointerException e) {
            throw new NullPointerException("lineNumbers == null");
        }
    }

    @Override // com.p046a.p049b.p050a.p055e.AbstractC0588a
    /* JADX INFO: renamed from: a */
    public final int mo705a() {
        return (this.f792a.m2239d_() * 4) + 8;
    }

    /* JADX INFO: renamed from: b */
    public final C0559o m717b() {
        return this.f792a;
    }
}
