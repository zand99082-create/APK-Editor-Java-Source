package com.p046a.p049b.p058c.p060b;

import com.p046a.p049b.p066f.p068b.C0827a;
import com.p046a.p049b.p066f.p068b.C0833c;
import com.p046a.p049b.p066f.p068b.C0854x;
import com.p046a.p049b.p066f.p069c.C0884z;
import com.p046a.p049b.p066f.p070d.C0887c;
import com.p046a.p049b.p066f.p070d.InterfaceC0889e;
import com.p046a.p049b.p073h.C0962j;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: com.a.b.c.b.aj */
/* JADX INFO: loaded from: classes.dex */
public final class C0654aj implements InterfaceC0660c {

    /* JADX INFO: renamed from: a */
    private final C0854x f1090a;

    /* JADX INFO: renamed from: b */
    private final int[] f1091b;

    /* JADX INFO: renamed from: c */
    private final C0659b f1092c;

    public C0654aj(C0854x c0854x, int[] iArr, C0659b c0659b) {
        if (c0854x == null) {
            throw new NullPointerException("method == null");
        }
        if (iArr == null) {
            throw new NullPointerException("order == null");
        }
        if (c0659b == null) {
            throw new NullPointerException("addresses == null");
        }
        this.f1090a = c0854x;
        this.f1091b = iArr;
        this.f1092c = c0659b;
    }

    /* JADX INFO: renamed from: a */
    private static C0661d m1163a(C0827a c0827a, C0659b c0659b) {
        C0962j c0962jM1720c = c0827a.m1720c();
        int iM2247b = c0962jM1720c.m2247b();
        int iM1721d = c0827a.m1721d();
        InterfaceC0889e interfaceC0889eMo1732b = c0827a.m1724g().mo1732b();
        int iMo1021d_ = interfaceC0889eMo1732b.mo1021d_();
        if (iMo1021d_ == 0) {
            return C0661d.f1101a;
        }
        if ((iM1721d == -1 && iM2247b != iMo1021d_) || (iM1721d != -1 && (iM2247b != iMo1021d_ + 1 || iM1721d != c0962jM1720c.m2248b(iMo1021d_)))) {
            throw new RuntimeException("shouldn't happen: weird successors list");
        }
        int i = 0;
        while (true) {
            if (i >= iMo1021d_) {
                break;
            }
            if (interfaceC0889eMo1732b.mo1018a(i).equals(C0887c.f2355n)) {
                iMo1021d_ = i + 1;
                break;
            }
            i++;
        }
        C0661d c0661d = new C0661d(iMo1021d_);
        for (int i2 = 0; i2 < iMo1021d_; i2++) {
            c0661d.m1185a(i2, new C0884z(interfaceC0889eMo1732b.mo1018a(i2)), c0659b.m1178a(c0962jM1720c.m2248b(i2)).m1222g());
        }
        c0661d.mo811b_();
        return c0661d;
    }

    /* JADX INFO: renamed from: a */
    private static C0664g m1164a(C0827a c0827a, C0827a c0827a2, C0661d c0661d, C0659b c0659b) {
        return new C0664g(c0659b.m1180b(c0827a).m1222g(), c0659b.m1181c(c0827a2).m1222g(), c0661d);
    }

    @Override // com.p046a.p049b.p058c.p060b.InterfaceC0660c
    /* JADX INFO: renamed from: a */
    public final C0663f mo1165a() {
        C0827a c0827a;
        C0661d c0661d;
        C0827a c0827a2 = null;
        C0854x c0854x = this.f1090a;
        int[] iArr = this.f1091b;
        C0659b c0659b = this.f1092c;
        int length = iArr.length;
        C0833c c0833cM1844a = c0854x.m1844a();
        ArrayList arrayList = new ArrayList(length);
        C0661d c0661d2 = C0661d.f1101a;
        int i = 0;
        C0827a c0827a3 = null;
        while (i < length) {
            C0827a c0827aM1740b = c0833cM1844a.m1740b(iArr[i]);
            if (c0827aM1740b.m1725h()) {
                C0661d c0661dM1163a = m1163a(c0827aM1740b, c0659b);
                if (c0661d2.m2239d_() == 0) {
                    c0827a = c0827aM1740b;
                    c0661d = c0661dM1163a;
                } else {
                    if (c0661d2.equals(c0661dM1163a)) {
                        if (c0827a3 == null) {
                            throw new NullPointerException("start == null");
                        }
                        if (c0827aM1740b == null) {
                            throw new NullPointerException("end == null");
                        }
                        if (c0659b.m1181c(c0827aM1740b).m1222g() - c0659b.m1180b(c0827a3).m1222g() <= 65535) {
                            c0827a = c0827a3;
                            c0661d = c0661d2;
                        }
                    }
                    if (c0661d2.m2239d_() != 0) {
                        arrayList.add(m1164a(c0827a3, c0827a2, c0661d2, c0659b));
                    }
                    c0827a = c0827aM1740b;
                    c0661d = c0661dM1163a;
                }
            } else {
                c0827aM1740b = c0827a2;
                c0827a = c0827a3;
                c0661d = c0661d2;
            }
            i++;
            c0661d2 = c0661d;
            c0827a3 = c0827a;
            c0827a2 = c0827aM1740b;
        }
        if (c0661d2.m2239d_() != 0) {
            arrayList.add(m1164a(c0827a3, c0827a2, c0661d2, c0659b));
        }
        int size = arrayList.size();
        if (size == 0) {
            return C0663f.f1104a;
        }
        C0663f c0663f = new C0663f(size);
        for (int i2 = 0; i2 < size; i2++) {
            c0663f.m1191a(i2, (C0664g) arrayList.get(i2));
        }
        c0663f.mo811b_();
        return c0663f;
    }

    @Override // com.p046a.p049b.p058c.p060b.InterfaceC0660c
    /* JADX INFO: renamed from: b */
    public final boolean mo1166b() {
        C0833c c0833cM1844a = this.f1090a.m1844a();
        int iD_ = c0833cM1844a.m2239d_();
        for (int i = 0; i < iD_; i++) {
            if (c0833cM1844a.m1737a(i).m1724g().mo1732b().mo1021d_() != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p046a.p049b.p058c.p060b.InterfaceC0660c
    /* JADX INFO: renamed from: c */
    public final HashSet mo1167c() {
        HashSet hashSet = new HashSet(20);
        C0833c c0833cM1844a = this.f1090a.m1844a();
        int iD_ = c0833cM1844a.m2239d_();
        for (int i = 0; i < iD_; i++) {
            InterfaceC0889e interfaceC0889eMo1732b = c0833cM1844a.m1737a(i).m1724g().mo1732b();
            int iMo1021d_ = interfaceC0889eMo1732b.mo1021d_();
            for (int i2 = 0; i2 < iMo1021d_; i2++) {
                hashSet.add(interfaceC0889eMo1732b.mo1018a(i2));
            }
        }
        return hashSet;
    }
}
