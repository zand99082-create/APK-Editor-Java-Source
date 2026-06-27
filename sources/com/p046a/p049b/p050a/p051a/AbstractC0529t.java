package com.p046a.p049b.p050a.p051a;

import com.p046a.p049b.p050a.p055e.AbstractC0588a;
import com.p046a.p049b.p066f.p067a.C0825d;
import com.p046a.p049b.p073h.C0969q;

/* JADX INFO: renamed from: com.a.b.a.a.t */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0529t extends AbstractC0588a {

    /* JADX INFO: renamed from: a */
    private final C0825d f798a;

    /* JADX INFO: renamed from: b */
    private final int f799b;

    public AbstractC0529t(String str, C0825d c0825d, int i) {
        super(str);
        try {
            if (c0825d.m2264c_()) {
                throw new C0969q("parameterAnnotations.isMutable()");
            }
            this.f798a = c0825d;
            this.f799b = i;
        } catch (NullPointerException e) {
            throw new NullPointerException("parameterAnnotations == null");
        }
    }

    @Override // com.p046a.p049b.p050a.p055e.AbstractC0588a
    /* JADX INFO: renamed from: a */
    public final int mo705a() {
        return this.f799b + 6;
    }

    /* JADX INFO: renamed from: b */
    public final C0825d m722b() {
        return this.f798a;
    }
}
