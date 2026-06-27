package com.p046a.p049b.p050a.p052b;

import com.p046a.p049b.p066f.p070d.C0887c;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.a.b.a.b.aa */
/* JADX INFO: loaded from: classes.dex */
final class C0534aa {

    /* JADX INFO: renamed from: a */
    private final Map f819a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C0568x f820b;

    private C0534aa(C0568x c0568x) {
        this.f820b = c0568x;
        this.f819a = new HashMap();
    }

    /* synthetic */ C0534aa(C0568x c0568x, byte b2) {
        this(c0568x);
    }

    /* JADX INFO: renamed from: a */
    final C0535ab m762a(C0887c c0887c) {
        C0535ab c0535ab = (C0535ab) this.f819a.get(c0887c);
        if (c0535ab != null) {
            return c0535ab;
        }
        C0535ab c0535ab2 = new C0535ab(c0887c, this.f820b.f930n.mo766a());
        this.f819a.put(c0887c, c0535ab2);
        return c0535ab2;
    }

    /* JADX INFO: renamed from: a */
    final Collection m763a() {
        return this.f819a.values();
    }
}
