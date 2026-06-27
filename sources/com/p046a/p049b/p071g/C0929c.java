package com.p046a.p049b.p071g;

import com.p046a.p049b.p066f.p069c.AbstractC0857a;
import java.util.Comparator;
import java.util.HashMap;

/* JADX INFO: renamed from: com.a.b.g.c */
/* JADX INFO: loaded from: classes.dex */
final class C0929c implements Comparator {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ HashMap f2491a;

    C0929c(C0928b c0928b, HashMap map) {
        this.f2491a = map;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        AbstractC0857a abstractC0857a = (AbstractC0857a) obj;
        AbstractC0857a abstractC0857a2 = (AbstractC0857a) obj2;
        int iIntValue = ((Integer) this.f2491a.get(abstractC0857a2)).intValue() - ((Integer) this.f2491a.get(abstractC0857a)).intValue();
        return iIntValue == 0 ? abstractC0857a.compareTo(abstractC0857a2) : iIntValue;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        return obj == this;
    }
}
