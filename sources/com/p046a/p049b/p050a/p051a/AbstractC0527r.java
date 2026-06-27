package com.p046a.p049b.p050a.p051a;

import com.p046a.p049b.p050a.p055e.AbstractC0588a;
import com.p046a.p049b.p066f.p067a.C0824c;
import com.p046a.p049b.p073h.C0969q;

/* JADX INFO: renamed from: com.a.b.a.a.r */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0527r extends AbstractC0588a {

    /* JADX INFO: renamed from: a */
    private final C0824c f795a;

    /* JADX INFO: renamed from: b */
    private final int f796b;

    public AbstractC0527r(String str, C0824c c0824c, int i) {
        super(str);
        try {
            if (c0824c.m2264c_()) {
                throw new C0969q("annotations.isMutable()");
            }
            this.f795a = c0824c;
            this.f796b = i;
        } catch (NullPointerException e) {
            throw new NullPointerException("annotations == null");
        }
    }

    @Override // com.p046a.p049b.p050a.p055e.AbstractC0588a
    /* JADX INFO: renamed from: a */
    public final int mo705a() {
        return this.f796b + 6;
    }

    /* JADX INFO: renamed from: b */
    public final C0824c m720b() {
        return this.f795a;
    }
}
