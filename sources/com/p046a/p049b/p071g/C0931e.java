package com.p046a.p049b.p071g;

import com.p046a.p049b.p066f.p068b.C0848r;
import com.p046a.p049b.p066f.p068b.C0850t;
import com.p046a.p049b.p066f.p068b.C0854x;
import com.p046a.p049b.p073h.C0953a;
import com.p046a.p049b.p073h.C0966n;
import com.p046a.p049b.p073h.InterfaceC0961i;
import com.p046a.p049b.p073h.InterfaceC0963k;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: com.a.b.g.e */
/* JADX INFO: loaded from: classes.dex */
public class C0931e {

    /* JADX INFO: renamed from: a */
    private final C0920an f2495a;

    /* JADX INFO: renamed from: b */
    private final int f2496b;

    /* JADX INFO: renamed from: c */
    private final BitSet f2497c;

    /* JADX INFO: renamed from: d */
    private final ArrayList[] f2498d;

    private C0931e(C0920an c0920an) {
        this.f2495a = c0920an;
        this.f2496b = c0920an.m2123g();
        this.f2497c = new BitSet(this.f2496b);
        this.f2498d = this.f2495a.m2130n();
    }

    /* JADX INFO: renamed from: a */
    public static C0920an m2153a(C0854x c0854x, int i, boolean z) {
        C0920an c0920anM2095a = C0920an.m2095a(c0854x, i, z);
        ArrayList arrayListM2126j = c0920anM2095a.m2126j();
        for (int size = arrayListM2126j.size() - 1; size >= 0; size--) {
            C0915ai c0915ai = (C0915ai) arrayListM2126j.get(size);
            if (c0915ai.m2071g().cardinality() > 1 && c0915ai.m2072h().cardinality() > 1) {
                c0915ai.m2079o();
            }
        }
        ArrayList arrayListM2126j2 = c0920anM2095a.m2126j();
        for (int size2 = arrayListM2126j2.size() - 1; size2 >= 0; size2--) {
            C0915ai c0915ai2 = (C0915ai) arrayListM2126j2.get(size2);
            if (!c0915ai2.m2081q() && c0915ai2.m2071g().cardinality() > 1 && ((AbstractC0918al) c0915ai2.m2063c().get(0)).mo2092i()) {
                BitSet bitSet = (BitSet) c0915ai2.m2071g().clone();
                for (int iNextSetBit = bitSet.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSet.nextSetBit(iNextSetBit + 1)) {
                    ((C0915ai) arrayListM2126j2.get(iNextSetBit)).m2059b(c0915ai2).m2063c().add(0, ((AbstractC0918al) c0915ai2.m2063c().get(0)).clone());
                }
                c0915ai2.m2063c().remove(0);
            }
        }
        ArrayList arrayListM2126j3 = c0920anM2095a.m2126j();
        for (int size3 = arrayListM2126j3.size() - 1; size3 >= 0; size3--) {
            C0915ai c0915ai3 = (C0915ai) arrayListM2126j3.get(size3);
            BitSet bitSet2 = (BitSet) c0915ai3.m2072h().clone();
            for (int iNextSetBit2 = bitSet2.nextSetBit(0); iNextSetBit2 >= 0; iNextSetBit2 = bitSet2.nextSetBit(iNextSetBit2 + 1)) {
                C0915ai c0915ai4 = (C0915ai) arrayListM2126j3.get(iNextSetBit2);
                AbstractC0918al abstractC0918al = (AbstractC0918al) c0915ai3.m2063c().get(r0.size() - 1);
                if ((abstractC0918al.m2093n() != null || abstractC0918al.mo2018a().m2239d_() > 0) && c0915ai4.m2071g().cardinality() > 1) {
                    c0915ai3.m2059b(c0915ai4);
                }
            }
        }
        m2157a(c0920anM2095a, C0947u.m2191a(c0920anM2095a), 0);
        new RunnableC0923aq(c0920anM2095a).run();
        c0920anM2095a.m2102a();
        return c0920anM2095a;
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC0963k m2154a(int i) {
        return i <= 3072 ? new C0953a(i) : new C0966n();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: a */
    public static void m2155a(C0920an c0920an) {
        C0931e c0931e = new C0931e(c0920an);
        HashSet hashSet = new HashSet();
        c0931e.f2495a.m2128l();
        for (C0915ai c0915ai : c0931e.f2495a.m2126j()) {
            if (!c0915ai.m2082r()) {
                for (int i = 0; i < c0915ai.m2063c().size(); i++) {
                    AbstractC0918al abstractC0918al = (AbstractC0918al) c0915ai.m2063c().get(i);
                    C0850t c0850tMo2018a = abstractC0918al.mo2018a();
                    int iD_ = c0850tMo2018a.m2239d_();
                    if (iD_ != 0) {
                        hashSet.add(abstractC0918al);
                    }
                    for (int i2 = 0; i2 < iD_; i2++) {
                        c0931e.f2498d[c0850tMo2018a.m1815b(i2).m1795g()].remove(abstractC0918al);
                    }
                    C0848r c0848rM2093n = abstractC0918al.m2093n();
                    if (c0848rM2093n != null) {
                        for (AbstractC0918al abstractC0918al2 : c0931e.f2498d[c0848rM2093n.m1795g()]) {
                            if (abstractC0918al2 instanceof C0909ac) {
                                ((C0909ac) abstractC0918al2).m2020a(c0848rM2093n);
                            }
                        }
                    }
                }
            }
        }
        c0931e.f2495a.m2110a(hashSet);
        HashSet hashSet2 = new HashSet();
        c0931e.f2495a.m2109a(new C0932f(c0931e.f2497c));
        while (true) {
            int iNextSetBit = c0931e.f2497c.nextSetBit(0);
            if (iNextSetBit < 0) {
                c0931e.f2495a.m2110a(hashSet2);
                return;
            }
            c0931e.f2497c.clear(iNextSetBit);
            if (c0931e.f2498d[iNextSetBit].size() == 0 || c0931e.m2158a(iNextSetBit, (BitSet) null)) {
                AbstractC0918al abstractC0918alM2117c = c0931e.f2495a.m2117c(iNextSetBit);
                if (!hashSet2.contains(abstractC0918alM2117c)) {
                    C0850t c0850tMo2018a2 = abstractC0918alM2117c.mo2018a();
                    int iD_2 = c0850tMo2018a2.m2239d_();
                    for (int i3 = 0; i3 < iD_2; i3++) {
                        C0848r c0848rM1815b = c0850tMo2018a2.m1815b(i3);
                        c0931e.f2498d[c0848rM1815b.m1795g()].remove(abstractC0918alM2117c);
                        if (!m2161b(c0931e.f2495a.m2117c(c0848rM1815b.m1795g()))) {
                            c0931e.f2497c.set(c0848rM1815b.m1795g());
                        }
                    }
                    hashSet2.add(abstractC0918alM2117c);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2156a(C0920an c0920an, int i) {
        m2157a(c0920an, C0947u.m2191a(c0920an), i);
        new RunnableC0923aq(c0920an, i).run();
    }

    /* JADX INFO: renamed from: a */
    private static void m2157a(C0920an c0920an, C0948v c0948v, int i) {
        ArrayList arrayListM2126j = c0920an.m2126j();
        int size = arrayListM2126j.size();
        int iM2123g = c0920an.m2123g() - i;
        C0934h[] c0934hArrM2162a = new C0933g(c0920an).m2162a();
        BitSet[] bitSetArr = new BitSet[iM2123g];
        BitSet[] bitSetArr2 = new BitSet[iM2123g];
        for (int i2 = 0; i2 < iM2123g; i2++) {
            bitSetArr[i2] = new BitSet(size);
            bitSetArr2[i2] = new BitSet(size);
        }
        int size2 = arrayListM2126j.size();
        for (int i3 = 0; i3 < size2; i3++) {
            Iterator it = ((C0915ai) arrayListM2126j.get(i3)).m2063c().iterator();
            while (it.hasNext()) {
                C0848r c0848rM2093n = ((AbstractC0918al) it.next()).m2093n();
                if (c0848rM2093n != null && c0848rM2093n.m1795g() - i >= 0) {
                    bitSetArr[c0848rM2093n.m1795g() - i].set(i3);
                }
            }
        }
        for (int i4 = 0; i4 < iM2123g; i4++) {
            BitSet bitSet = (BitSet) bitSetArr[i4].clone();
            while (true) {
                int iNextSetBit = bitSet.nextSetBit(0);
                if (iNextSetBit >= 0) {
                    bitSet.clear(iNextSetBit);
                    InterfaceC0961i interfaceC0961iMo2208b = c0934hArrM2162a[iNextSetBit].f2504a.mo2208b();
                    while (interfaceC0961iMo2208b.mo2210a()) {
                        int iMo2211b = interfaceC0961iMo2208b.mo2211b();
                        if (!bitSetArr2[i4].get(iMo2211b)) {
                            bitSetArr2[i4].set(iMo2211b);
                            int i5 = i4 + i;
                            C0848r c0848rM1824a = c0948v.m2194a(iMo2211b).m1824a(i5);
                            if (c0848rM1824a == null) {
                                ((C0915ai) arrayListM2126j.get(iMo2211b)).m2051a(i5);
                            } else {
                                ((C0915ai) arrayListM2126j.get(iMo2211b)).m2054a(c0848rM1824a);
                            }
                            if (!bitSetArr[i4].get(iMo2211b)) {
                                bitSet.set(iMo2211b);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m2158a(int i, BitSet bitSet) {
        if (bitSet != null && bitSet.get(i)) {
            return true;
        }
        Iterator it = this.f2498d[i].iterator();
        while (it.hasNext()) {
            if (m2161b((AbstractC0918al) it.next())) {
                return false;
            }
        }
        if (bitSet == null) {
            bitSet = new BitSet(this.f2496b);
        }
        bitSet.set(i);
        Iterator it2 = this.f2498d[i].iterator();
        while (it2.hasNext()) {
            C0848r c0848rM2093n = ((AbstractC0918al) it2.next()).m2093n();
            if (c0848rM2093n == null || !m2158a(c0848rM2093n.m1795g(), bitSet)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    static InterfaceC0963k m2160b(int i) {
        return i <= 3072 ? new C0953a(i) : new C0966n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static boolean m2161b(AbstractC0918al abstractC0918al) {
        if (abstractC0918al == null) {
            return true;
        }
        return abstractC0918al.mo2032l();
    }
}
