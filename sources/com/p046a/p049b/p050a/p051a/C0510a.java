package com.p046a.p049b.p050a.p051a;

import com.p046a.p049b.p050a.p055e.AbstractC0588a;
import com.p046a.p049b.p066f.p069c.AbstractC0857a;

/* JADX INFO: renamed from: com.a.b.a.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0510a extends AbstractC0588a {

    /* JADX INFO: renamed from: a */
    private final AbstractC0857a f780a;

    /* JADX INFO: renamed from: b */
    private final int f781b;

    public C0510a(AbstractC0857a abstractC0857a, int i) {
        super("AnnotationDefault");
        if (abstractC0857a == null) {
            throw new NullPointerException("value == null");
        }
        this.f780a = abstractC0857a;
        this.f781b = i;
    }

    @Override // com.p046a.p049b.p050a.p055e.AbstractC0588a
    /* JADX INFO: renamed from: a */
    public final int mo705a() {
        return this.f781b + 6;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC0857a m706b() {
        return this.f780a;
    }
}
