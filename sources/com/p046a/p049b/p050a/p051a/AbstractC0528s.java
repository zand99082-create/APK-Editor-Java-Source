package com.p046a.p049b.p050a.p051a;

import com.p046a.p049b.p050a.p052b.C0561q;
import com.p046a.p049b.p050a.p055e.AbstractC0588a;
import com.p046a.p049b.p073h.C0969q;

/* JADX INFO: renamed from: com.a.b.a.a.s */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0528s extends AbstractC0588a {

    /* JADX INFO: renamed from: a */
    private final C0561q f797a;

    public AbstractC0528s(String str, C0561q c0561q) {
        super(str);
        try {
            if (c0561q.m2264c_()) {
                throw new C0969q("localVariables.isMutable()");
            }
            this.f797a = c0561q;
        } catch (NullPointerException e) {
            throw new NullPointerException("localVariables == null");
        }
    }

    @Override // com.p046a.p049b.p050a.p055e.AbstractC0588a
    /* JADX INFO: renamed from: a */
    public final int mo705a() {
        return (this.f797a.m2239d_() * 10) + 8;
    }

    /* JADX INFO: renamed from: b */
    public final C0561q m721b() {
        return this.f797a;
    }
}
