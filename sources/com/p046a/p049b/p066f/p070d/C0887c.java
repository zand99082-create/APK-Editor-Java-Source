package com.p046a.p049b.p066f.p070d;

import android.support.v7.appcompat.C0327R;
import com.gmail.heagoo.p084a.p089c.C1067a;
import jadx.core.deobf.Deobfuscator;
import java.util.HashMap;

/* JADX INFO: renamed from: com.a.b.f.d.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0887c implements InterfaceC0888d, Comparable {

    /* JADX INFO: renamed from: A */
    public static final C0887c f2332A;

    /* JADX INFO: renamed from: B */
    public static final C0887c f2333B;

    /* JADX INFO: renamed from: C */
    public static final C0887c f2334C;

    /* JADX INFO: renamed from: D */
    public static final C0887c f2335D;

    /* JADX INFO: renamed from: E */
    public static final C0887c f2336E;

    /* JADX INFO: renamed from: F */
    public static final C0887c f2337F;

    /* JADX INFO: renamed from: G */
    public static final C0887c f2338G;

    /* JADX INFO: renamed from: H */
    public static final C0887c f2339H;

    /* JADX INFO: renamed from: I */
    public static final C0887c f2340I;

    /* JADX INFO: renamed from: J */
    private static final HashMap f2341J = new HashMap(500);

    /* JADX INFO: renamed from: a */
    public static final C0887c f2342a = new C0887c("Z", 1);

    /* JADX INFO: renamed from: b */
    public static final C0887c f2343b = new C0887c("B", 2);

    /* JADX INFO: renamed from: c */
    public static final C0887c f2344c = new C0887c("C", 3);

    /* JADX INFO: renamed from: d */
    public static final C0887c f2345d = new C0887c("D", 4);

    /* JADX INFO: renamed from: e */
    public static final C0887c f2346e = new C0887c("F", 5);

    /* JADX INFO: renamed from: f */
    public static final C0887c f2347f = new C0887c("I", 6);

    /* JADX INFO: renamed from: g */
    public static final C0887c f2348g = new C0887c("J", 7);

    /* JADX INFO: renamed from: h */
    public static final C0887c f2349h = new C0887c("S", 8);

    /* JADX INFO: renamed from: i */
    public static final C0887c f2350i = new C0887c("V", 0);

    /* JADX INFO: renamed from: j */
    public static final C0887c f2351j = new C0887c("<null>", 9);

    /* JADX INFO: renamed from: k */
    public static final C0887c f2352k = new C0887c("<addr>", 10);

    /* JADX INFO: renamed from: l */
    public static final C0887c f2353l;

    /* JADX INFO: renamed from: m */
    public static final C0887c f2354m;

    /* JADX INFO: renamed from: n */
    public static final C0887c f2355n;

    /* JADX INFO: renamed from: o */
    public static final C0887c f2356o;

    /* JADX INFO: renamed from: p */
    public static final C0887c f2357p;

    /* JADX INFO: renamed from: q */
    public static final C0887c f2358q;

    /* JADX INFO: renamed from: r */
    public static final C0887c f2359r;

    /* JADX INFO: renamed from: s */
    public static final C0887c f2360s;

    /* JADX INFO: renamed from: t */
    public static final C0887c f2361t;

    /* JADX INFO: renamed from: u */
    public static final C0887c f2362u;

    /* JADX INFO: renamed from: v */
    public static final C0887c f2363v;

    /* JADX INFO: renamed from: w */
    public static final C0887c f2364w;

    /* JADX INFO: renamed from: x */
    public static final C0887c f2365x;

    /* JADX INFO: renamed from: y */
    public static final C0887c f2366y;

    /* JADX INFO: renamed from: z */
    public static final C0887c f2367z;

    /* JADX INFO: renamed from: K */
    private final String f2368K;

    /* JADX INFO: renamed from: L */
    private final int f2369L;

    /* JADX INFO: renamed from: M */
    private final int f2370M;

    /* JADX INFO: renamed from: N */
    private String f2371N;

    /* JADX INFO: renamed from: O */
    private C0887c f2372O;

    /* JADX INFO: renamed from: P */
    private C0887c f2373P;

    /* JADX INFO: renamed from: Q */
    private C0887c f2374Q;

    static {
        m1942b(f2342a);
        m1942b(f2343b);
        m1942b(f2344c);
        m1942b(f2345d);
        m1942b(f2346e);
        m1942b(f2347f);
        m1942b(f2348g);
        m1942b(f2349h);
        m1941a("Ljava/lang/annotation/Annotation;");
        f2353l = m1941a("Ljava/lang/Class;");
        f2354m = m1941a("Ljava/lang/Cloneable;");
        f2355n = m1941a("Ljava/lang/Object;");
        f2356o = m1941a("Ljava/io/Serializable;");
        f2357p = m1941a("Ljava/lang/String;");
        f2358q = m1941a("Ljava/lang/Throwable;");
        f2359r = m1941a("Ljava/lang/Boolean;");
        f2360s = m1941a("Ljava/lang/Byte;");
        f2361t = m1941a("Ljava/lang/Character;");
        f2362u = m1941a("Ljava/lang/Double;");
        f2363v = m1941a("Ljava/lang/Float;");
        f2364w = m1941a("Ljava/lang/Integer;");
        f2365x = m1941a("Ljava/lang/Long;");
        f2366y = m1941a("Ljava/lang/Short;");
        f2367z = m1941a("Ljava/lang/Void;");
        f2332A = f2342a.m1958r();
        f2333B = f2343b.m1958r();
        f2334C = f2344c.m1958r();
        f2335D = f2345d.m1958r();
        f2336E = f2346e.m1958r();
        f2337F = f2347f.m1958r();
        f2338G = f2348g.m1958r();
        f2339H = f2355n.m1958r();
        f2340I = f2349h.m1958r();
    }

    private C0887c(String str, int i) {
        this(str, i, -1);
    }

    private C0887c(String str, int i, int i2) {
        if (str == null) {
            throw new NullPointerException("descriptor == null");
        }
        if (i < 0 || i >= 11) {
            throw new IllegalArgumentException("bad basicType");
        }
        if (i2 < -1) {
            throw new IllegalArgumentException("newAt < -1");
        }
        this.f2368K = str;
        this.f2369L = i;
        this.f2370M = i2;
        this.f2372O = null;
        this.f2373P = null;
        this.f2374Q = null;
    }

    /* JADX INFO: renamed from: a */
    public static C0887c m1941a(String str) {
        C0887c c0887c;
        synchronized (f2341J) {
            c0887c = (C0887c) f2341J.get(str);
        }
        if (c0887c != null) {
            return c0887c;
        }
        try {
            char cCharAt = str.charAt(0);
            if (cCharAt == '[') {
                return m1941a(str.substring(1)).m1958r();
            }
            int length = str.length();
            if (cCharAt != 'L' || str.charAt(length - 1) != ';') {
                throw new IllegalArgumentException("bad descriptor: " + str);
            }
            int i = length - 1;
            for (int i2 = 1; i2 < i; i2++) {
                switch (str.charAt(i2)) {
                    case '(':
                    case ')':
                    case '.':
                    case C0327R.styleable.AppCompatTheme_activityChooserViewStyle /* 59 */:
                    case C0327R.styleable.AppCompatTheme_colorButtonNormal /* 91 */:
                        throw new IllegalArgumentException("bad descriptor: " + str);
                    case '/':
                        if (i2 == 1 || i2 == i || str.charAt(i2 - 1) == '/') {
                            throw new IllegalArgumentException("bad descriptor: " + str);
                        }
                        break;
                }
            }
            return m1942b(new C0887c(str, 9));
        } catch (IndexOutOfBoundsException e) {
            throw new IllegalArgumentException("descriptor is empty");
        } catch (NullPointerException e2) {
            throw new NullPointerException("descriptor == null");
        }
    }

    /* JADX INFO: renamed from: b */
    private static C0887c m1942b(C0887c c0887c) {
        synchronized (f2341J) {
            String str = c0887c.f2368K;
            C0887c c0887c2 = (C0887c) f2341J.get(str);
            if (c0887c2 != null) {
                return c0887c2;
            }
            f2341J.put(str, c0887c);
            return c0887c;
        }
    }

    /* JADX INFO: renamed from: b */
    public static C0887c m1943b(String str) {
        try {
            return str.equals("V") ? f2350i : m1941a(str);
        } catch (NullPointerException e) {
            throw new NullPointerException("descriptor == null");
        }
    }

    /* JADX INFO: renamed from: c */
    public static C0887c m1944c(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        return str.startsWith("[") ? m1941a(str) : m1941a("L" + str + ';');
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C0887c c0887c) {
        return this.f2368K.compareTo(c0887c.f2368K);
    }

    @Override // com.p046a.p049b.p066f.p070d.InterfaceC0888d
    /* JADX INFO: renamed from: a */
    public final C0887c mo925a() {
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final C0887c m1946a(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("newAt < 0");
        }
        if (!m1954n()) {
            throw new IllegalArgumentException("not a reference type: " + this.f2368K);
        }
        if (m1956p()) {
            throw new IllegalArgumentException("already uninitialized: " + this.f2368K);
        }
        C0887c c0887c = new C0887c("N" + C1067a.m2558v(i) + this.f2368K, 9, i);
        c0887c.f2374Q = this;
        return m1942b(c0887c);
    }

    @Override // com.p046a.p049b.p066f.p070d.InterfaceC0888d
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ InterfaceC0888d mo926b() {
        switch (this.f2369L) {
            case 1:
            case 2:
            case 3:
            case 6:
            case 8:
                return f2347f;
            case 4:
            case 5:
            case 7:
            default:
                return this;
        }
    }

    @Override // com.p046a.p049b.p066f.p070d.InterfaceC0888d
    /* JADX INFO: renamed from: c */
    public final int mo927c() {
        return this.f2369L;
    }

    @Override // com.p046a.p049b.p073h.InterfaceC0971s
    /* JADX INFO: renamed from: d */
    public final String mo919d() {
        switch (this.f2369L) {
            case 0:
                return "void";
            case 1:
                return "boolean";
            case 2:
                return "byte";
            case 3:
                return "char";
            case 4:
                return "double";
            case 5:
                return "float";
            case 6:
                return "int";
            case 7:
                return "long";
            case 8:
                return "short";
            case 9:
                return m1955o() ? m1959s().mo919d() + "[]" : m1948h().replace("/", Deobfuscator.CLASS_NAME_SEPARATOR);
            default:
                return this.f2368K;
        }
    }

    @Override // com.p046a.p049b.p066f.p070d.InterfaceC0888d
    /* JADX INFO: renamed from: e */
    public final int mo928e() {
        switch (this.f2369L) {
            case 1:
            case 2:
            case 3:
            case 6:
            case 8:
                return 6;
            case 4:
            case 5:
            case 7:
            default:
                return this.f2369L;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0887c) {
            return this.f2368K.equals(((C0887c) obj).f2368K);
        }
        return false;
    }

    @Override // com.p046a.p049b.p066f.p070d.InterfaceC0888d
    /* JADX INFO: renamed from: f */
    public final boolean mo929f() {
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final String m1947g() {
        return this.f2368K;
    }

    /* JADX INFO: renamed from: h */
    public final String m1948h() {
        if (this.f2371N == null) {
            if (!m1954n()) {
                throw new IllegalArgumentException("not an object type: " + this.f2368K);
            }
            if (this.f2368K.charAt(0) == '[') {
                this.f2371N = this.f2368K;
            } else {
                this.f2371N = this.f2368K.substring(1, this.f2368K.length() - 1);
            }
        }
        return this.f2371N;
    }

    public final int hashCode() {
        return this.f2368K.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final int m1949i() {
        switch (this.f2369L) {
            case 4:
            case 7:
                return 2;
            case 5:
            case 6:
            default:
                return 1;
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m1950j() {
        switch (this.f2369L) {
            case 4:
            case 7:
                return false;
            case 5:
            case 6:
            default:
                return true;
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m1951k() {
        switch (this.f2369L) {
            case 4:
            case 7:
                return true;
            case 5:
            case 6:
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m1952l() {
        switch (this.f2369L) {
            case 1:
            case 2:
            case 3:
            case 6:
            case 8:
                return true;
            case 4:
            case 5:
            case 7:
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m1953m() {
        switch (this.f2369L) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: n */
    public final boolean m1954n() {
        return this.f2369L == 9;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m1955o() {
        return this.f2368K.charAt(0) == '[';
    }

    /* JADX INFO: renamed from: p */
    public final boolean m1956p() {
        return this.f2370M >= 0;
    }

    /* JADX INFO: renamed from: q */
    public final C0887c m1957q() {
        if (this.f2374Q == null) {
            throw new IllegalArgumentException("initialized type: " + this.f2368K);
        }
        return this.f2374Q;
    }

    /* JADX INFO: renamed from: r */
    public final C0887c m1958r() {
        if (this.f2372O == null) {
            this.f2372O = m1942b(new C0887c("[" + this.f2368K, 9));
        }
        return this.f2372O;
    }

    /* JADX INFO: renamed from: s */
    public final C0887c m1959s() {
        if (this.f2373P == null) {
            if (this.f2368K.charAt(0) != '[') {
                throw new IllegalArgumentException("not an array type: " + this.f2368K);
            }
            this.f2373P = m1941a(this.f2368K.substring(1));
        }
        return this.f2373P;
    }

    public final String toString() {
        return this.f2368K;
    }
}
