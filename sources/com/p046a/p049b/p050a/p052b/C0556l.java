package com.p046a.p049b.p050a.p052b;

import com.p046a.p049b.p050a.p051a.C0511b;
import com.p046a.p049b.p050a.p051a.C0517h;
import com.p046a.p049b.p050a.p051a.C0518i;
import com.p046a.p049b.p050a.p051a.C0519j;
import com.p046a.p049b.p050a.p055e.InterfaceC0589b;
import com.p046a.p049b.p050a.p055e.InterfaceC0590c;
import com.p046a.p049b.p050a.p055e.InterfaceC0594g;
import com.p046a.p049b.p066f.p068b.C0856z;
import com.p046a.p049b.p066f.p069c.C0881w;
import com.p046a.p049b.p066f.p069c.C0883y;
import com.p046a.p049b.p066f.p069c.C0884z;
import com.p046a.p049b.p066f.p070d.C0885a;

/* JADX INFO: renamed from: com.a.b.a.b.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0556l implements InterfaceC0594g {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0594g f891a;

    /* JADX INFO: renamed from: b */
    private final C0883y f892b;

    /* JADX INFO: renamed from: c */
    private final boolean f893c;

    /* JADX INFO: renamed from: d */
    private final C0511b f894d;

    /* JADX INFO: renamed from: e */
    private final C0559o f895e;

    /* JADX INFO: renamed from: f */
    private final C0561q f896f;

    /* JADX WARN: Removed duplicated region for block: B:25:0x008e A[PHI: r1
      0x008e: PHI (r1v3 com.a.b.a.b.q) = (r1v2 com.a.b.a.b.q), (r1v4 com.a.b.a.b.q) binds: [B:13:0x004b, B:21:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private C0556l(InterfaceC0594g interfaceC0594g, int i, C0883y c0883y, boolean z, boolean z2) {
        C0559o c0559o;
        C0561q c0561qM896b;
        this.f891a = interfaceC0594g;
        this.f893c = (i & 32) != 0;
        this.f892b = c0883y;
        this.f894d = (C0511b) interfaceC0594g.mo849e().mo1047a("Code");
        InterfaceC0589b interfaceC0589bM711f = this.f894d.m711f();
        C0559o c0559o2 = C0559o.f903a;
        if (z) {
            c0559o = c0559o2;
            C0517h c0517h = (C0517h) interfaceC0589bM711f.mo1047a("LineNumberTable");
            while (c0517h != null) {
                C0559o c0559oM886a = C0559o.m886a(c0559o, c0517h.m717b());
                c0517h = (C0517h) interfaceC0589bM711f.mo1046a(c0517h);
                c0559o = c0559oM886a;
            }
        } else {
            c0559o = c0559o2;
        }
        this.f895e = c0559o;
        C0561q c0561qM893a = C0561q.f906a;
        if (z2) {
            for (C0518i c0518i = (C0518i) interfaceC0589bM711f.mo1047a("LocalVariableTable"); c0518i != null; c0518i = (C0518i) interfaceC0589bM711f.mo1046a(c0518i)) {
                c0561qM893a = C0561q.m893a(c0561qM893a, c0518i.m721b());
            }
            C0561q c0561qM893a2 = C0561q.f906a;
            for (C0519j c0519j = (C0519j) interfaceC0589bM711f.mo1047a("LocalVariableTypeTable"); c0519j != null; c0519j = (C0519j) interfaceC0589bM711f.mo1046a(c0519j)) {
                c0561qM893a2 = C0561q.m893a(c0561qM893a2, c0519j.m721b());
            }
            c0561qM896b = c0561qM893a2.m2239d_() != 0 ? C0561q.m896b(c0561qM893a, c0561qM893a2) : c0561qM893a;
        }
        this.f896f = c0561qM896b;
    }

    public C0556l(InterfaceC0594g interfaceC0594g, InterfaceC0590c interfaceC0590c, boolean z, boolean z2) {
        this(interfaceC0594g, interfaceC0590c.mo1009d(), interfaceC0590c.mo1017l(), z, z2);
    }

    /* JADX INFO: renamed from: a */
    public final C0856z m844a(int i) {
        return new C0856z(this.f892b, i, this.f895e.m889a(i));
    }

    @Override // com.p046a.p049b.p050a.p055e.InterfaceC0593f
    /* JADX INFO: renamed from: a */
    public final C0881w mo845a() {
        return this.f891a.mo845a();
    }

    @Override // com.p046a.p049b.p050a.p055e.InterfaceC0593f
    /* JADX INFO: renamed from: b */
    public final C0883y mo846b() {
        return this.f891a.mo846b();
    }

    @Override // com.p046a.p049b.p050a.p055e.InterfaceC0593f
    /* JADX INFO: renamed from: c */
    public final C0883y mo847c() {
        return this.f891a.mo847c();
    }

    @Override // com.p046a.p049b.p050a.p055e.InterfaceC0593f
    /* JADX INFO: renamed from: d */
    public final int mo848d() {
        return this.f891a.mo848d();
    }

    @Override // com.p046a.p049b.p050a.p055e.InterfaceC0593f
    /* JADX INFO: renamed from: e */
    public final InterfaceC0589b mo849e() {
        return this.f891a.mo849e();
    }

    @Override // com.p046a.p049b.p050a.p055e.InterfaceC0593f
    /* JADX INFO: renamed from: f */
    public final C0884z mo850f() {
        return this.f891a.mo850f();
    }

    @Override // com.p046a.p049b.p050a.p055e.InterfaceC0594g
    /* JADX INFO: renamed from: g */
    public final C0885a mo851g() {
        return this.f891a.mo851g();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m852h() {
        return this.f893c;
    }

    /* JADX INFO: renamed from: i */
    public final int m853i() {
        return this.f894d.m707b();
    }

    /* JADX INFO: renamed from: j */
    public final int m854j() {
        return this.f894d.m708c();
    }

    /* JADX INFO: renamed from: k */
    public final C0552h m855k() {
        return this.f894d.m709d();
    }

    /* JADX INFO: renamed from: l */
    public final C0549e m856l() {
        return this.f894d.m710e();
    }

    /* JADX INFO: renamed from: m */
    public final C0561q m857m() {
        return this.f896f;
    }
}
