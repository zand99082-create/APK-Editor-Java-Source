package com.p046a.p049b.p066f.p069c;

import com.p046a.p049b.p066f.p070d.C0887c;
import java.util.HashMap;

/* JADX INFO: renamed from: com.a.b.f.c.z */
/* JADX INFO: loaded from: classes.dex */
public final class C0884z extends AbstractC0859ab {

    /* JADX INFO: renamed from: t */
    private final C0887c f2289t;

    /* JADX INFO: renamed from: u */
    private C0883y f2290u;

    /* JADX INFO: renamed from: j */
    private static final HashMap f2279j = new HashMap(100);

    /* JADX INFO: renamed from: a */
    public static final C0884z f2270a = m1916b(C0887c.f2355n);

    /* JADX INFO: renamed from: k */
    private static C0884z f2280k = m1916b(C0887c.f2359r);

    /* JADX INFO: renamed from: l */
    private static C0884z f2281l = m1916b(C0887c.f2360s);

    /* JADX INFO: renamed from: m */
    private static C0884z f2282m = m1916b(C0887c.f2361t);

    /* JADX INFO: renamed from: n */
    private static C0884z f2283n = m1916b(C0887c.f2362u);

    /* JADX INFO: renamed from: o */
    private static C0884z f2284o = m1916b(C0887c.f2363v);

    /* JADX INFO: renamed from: p */
    private static C0884z f2285p = m1916b(C0887c.f2365x);

    /* JADX INFO: renamed from: q */
    private static C0884z f2286q = m1916b(C0887c.f2364w);

    /* JADX INFO: renamed from: r */
    private static C0884z f2287r = m1916b(C0887c.f2366y);

    /* JADX INFO: renamed from: s */
    private static C0884z f2288s = m1916b(C0887c.f2367z);

    /* JADX INFO: renamed from: b */
    public static final C0884z f2271b = m1916b(C0887c.f2332A);

    /* JADX INFO: renamed from: c */
    public static final C0884z f2272c = m1916b(C0887c.f2333B);

    /* JADX INFO: renamed from: d */
    public static final C0884z f2273d = m1916b(C0887c.f2334C);

    /* JADX INFO: renamed from: e */
    public static final C0884z f2274e = m1916b(C0887c.f2335D);

    /* JADX INFO: renamed from: f */
    public static final C0884z f2275f = m1916b(C0887c.f2336E);

    /* JADX INFO: renamed from: g */
    public static final C0884z f2276g = m1916b(C0887c.f2338G);

    /* JADX INFO: renamed from: h */
    public static final C0884z f2277h = m1916b(C0887c.f2337F);

    /* JADX INFO: renamed from: i */
    public static final C0884z f2278i = m1916b(C0887c.f2340I);

    public C0884z(C0887c c0887c) {
        if (c0887c == null) {
            throw new NullPointerException("type == null");
        }
        if (c0887c == C0887c.f2351j) {
            throw new UnsupportedOperationException("KNOWN_NULL is not representable");
        }
        this.f2289t = c0887c;
        this.f2290u = null;
    }

    /* JADX INFO: renamed from: a */
    public static C0884z m1915a(C0887c c0887c) {
        switch (c0887c.mo927c()) {
            case 0:
                return f2288s;
            case 1:
                return f2280k;
            case 2:
                return f2281l;
            case 3:
                return f2282m;
            case 4:
                return f2283n;
            case 5:
                return f2284o;
            case 6:
                return f2286q;
            case 7:
                return f2285p;
            case 8:
                return f2287r;
            default:
                throw new IllegalArgumentException("not primitive: " + c0887c);
        }
    }

    /* JADX INFO: renamed from: b */
    public static C0884z m1916b(C0887c c0887c) {
        C0884z c0884z;
        synchronized (f2279j) {
            c0884z = (C0884z) f2279j.get(c0887c);
            if (c0884z == null) {
                c0884z = new C0884z(c0887c);
                f2279j.put(c0887c, c0884z);
            }
        }
        return c0884z;
    }

    @Override // com.p046a.p049b.p066f.p070d.InterfaceC0888d
    /* JADX INFO: renamed from: a */
    public final C0887c mo925a() {
        return C0887c.f2353l;
    }

    @Override // com.p046a.p049b.p066f.p069c.AbstractC0857a
    /* JADX INFO: renamed from: b */
    protected final int mo1864b(AbstractC0857a abstractC0857a) {
        return this.f2289t.m1947g().compareTo(((C0884z) abstractC0857a).f2289t.m1947g());
    }

    @Override // com.p046a.p049b.p073h.InterfaceC0971s
    /* JADX INFO: renamed from: d */
    public final String mo919d() {
        return this.f2289t.mo919d();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0884z) && this.f2289t == ((C0884z) obj).f2289t;
    }

    @Override // com.p046a.p049b.p066f.p069c.AbstractC0857a
    /* JADX INFO: renamed from: g */
    public final boolean mo1865g() {
        return false;
    }

    @Override // com.p046a.p049b.p066f.p069c.AbstractC0857a
    /* JADX INFO: renamed from: h */
    public final String mo1866h() {
        return "type";
    }

    public final int hashCode() {
        return this.f2289t.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final C0887c m1917i() {
        return this.f2289t;
    }

    /* JADX INFO: renamed from: j */
    public final C0883y m1918j() {
        if (this.f2290u == null) {
            this.f2290u = new C0883y(this.f2289t.m1947g());
        }
        return this.f2290u;
    }

    public final String toString() {
        return "type{" + mo919d() + '}';
    }
}
