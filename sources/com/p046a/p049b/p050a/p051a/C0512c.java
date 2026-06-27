package com.p046a.p049b.p050a.p051a;

import com.p046a.p049b.p050a.p055e.AbstractC0588a;
import com.p046a.p049b.p066f.p069c.AbstractC0859ab;
import com.p046a.p049b.p066f.p069c.C0868j;
import com.p046a.p049b.p066f.p069c.C0871m;
import com.p046a.p049b.p066f.p069c.C0872n;
import com.p046a.p049b.p066f.p069c.C0878t;
import com.p046a.p049b.p066f.p069c.C0883y;

/* JADX INFO: renamed from: com.a.b.a.a.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0512c extends AbstractC0588a {

    /* JADX INFO: renamed from: a */
    private final AbstractC0859ab f787a;

    public C0512c(AbstractC0859ab abstractC0859ab) {
        super("ConstantValue");
        if ((abstractC0859ab instanceof C0883y) || (abstractC0859ab instanceof C0872n) || (abstractC0859ab instanceof C0878t) || (abstractC0859ab instanceof C0871m) || (abstractC0859ab instanceof C0868j)) {
            this.f787a = abstractC0859ab;
        } else {
            if (abstractC0859ab != null) {
                throw new IllegalArgumentException("bad type for constantValue");
            }
            throw new NullPointerException("constantValue == null");
        }
    }

    @Override // com.p046a.p049b.p050a.p055e.AbstractC0588a
    /* JADX INFO: renamed from: a */
    public final int mo705a() {
        return 8;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC0859ab m712b() {
        return this.f787a;
    }
}
