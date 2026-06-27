package com.p046a.p049b.p071g.p072a;

import com.p046a.p049b.p066f.p068b.C0855y;
import com.p046a.p049b.p071g.AbstractC0918al;
import com.p046a.p049b.p071g.C0915ai;
import com.p046a.p049b.p071g.InterfaceC0917ak;
import java.util.ArrayList;
import java.util.BitSet;

/* JADX INFO: renamed from: com.a.b.g.a.o */
/* JADX INFO: loaded from: classes.dex */
final class C0905o implements InterfaceC0917ak {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ ArrayList f2416a;

    C0905o(C0904n c0904n, ArrayList arrayList) {
        this.f2416a = arrayList;
    }

    @Override // com.p046a.p049b.p071g.InterfaceC0917ak
    /* JADX INFO: renamed from: a */
    public final void mo2010a(C0915ai c0915ai, C0915ai c0915ai2) {
        ArrayList arrayListM2063c = c0915ai.m2063c();
        if (arrayListM2063c.size() == 1 && ((AbstractC0918al) arrayListM2063c.get(0)).mo2027c() == C0855y.f2221s) {
            BitSet bitSet = (BitSet) c0915ai.m2071g().clone();
            for (int iNextSetBit = bitSet.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSet.nextSetBit(iNextSetBit + 1)) {
                ((C0915ai) this.f2416a.get(iNextSetBit)).m2052a(c0915ai.m2068e(), c0915ai.m2074j());
            }
        }
    }
}
