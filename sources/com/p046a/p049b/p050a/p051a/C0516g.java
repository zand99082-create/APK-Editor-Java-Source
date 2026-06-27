package com.p046a.p049b.p050a.p051a;

import com.p046a.p049b.p050a.p055e.AbstractC0588a;
import com.p046a.p049b.p073h.C0969q;

/* JADX INFO: renamed from: com.a.b.a.a.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0516g extends AbstractC0588a {

    /* JADX INFO: renamed from: a */
    private final C0530u f791a;

    public C0516g(C0530u c0530u) {
        super("InnerClasses");
        try {
            if (c0530u.m2264c_()) {
                throw new C0969q("innerClasses.isMutable()");
            }
            this.f791a = c0530u;
        } catch (NullPointerException e) {
            throw new NullPointerException("innerClasses == null");
        }
    }

    @Override // com.p046a.p049b.p050a.p055e.AbstractC0588a
    /* JADX INFO: renamed from: a */
    public final int mo705a() {
        return (this.f791a.m2239d_() << 3) + 8;
    }

    /* JADX INFO: renamed from: b */
    public final C0530u m716b() {
        return this.f791a;
    }
}
