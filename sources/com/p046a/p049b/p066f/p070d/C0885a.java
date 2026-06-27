package com.p046a.p049b.p066f.p070d;

import android.support.v7.widget.ActivityChooserView;
import java.util.HashMap;

/* JADX INFO: renamed from: com.a.b.f.d.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0885a implements Comparable {

    /* JADX INFO: renamed from: a */
    private static final HashMap f2291a = new HashMap(500);

    /* JADX INFO: renamed from: b */
    private final String f2292b;

    /* JADX INFO: renamed from: c */
    private final C0887c f2293c;

    /* JADX INFO: renamed from: d */
    private final C0886b f2294d;

    /* JADX INFO: renamed from: e */
    private C0886b f2295e;

    private C0885a(String str, C0887c c0887c, C0886b c0886b) {
        if (str == null) {
            throw new NullPointerException("descriptor == null");
        }
        if (c0887c == null) {
            throw new NullPointerException("returnType == null");
        }
        if (c0886b == null) {
            throw new NullPointerException("parameterTypes == null");
        }
        this.f2292b = str;
        this.f2293c = c0887c;
        this.f2294d = c0886b;
        this.f2295e = null;
    }

    /* JADX INFO: renamed from: a */
    public static C0885a m1919a(C0887c c0887c, int i) {
        StringBuffer stringBuffer = new StringBuffer(100);
        stringBuffer.append('(');
        for (int i2 = 0; i2 < i; i2++) {
            stringBuffer.append('I');
        }
        stringBuffer.append(')');
        stringBuffer.append(c0887c.m1947g());
        return m1920a(stringBuffer.toString());
    }

    /* JADX INFO: renamed from: a */
    public static C0885a m1920a(String str) {
        C0885a c0885a;
        int i;
        if (str == null) {
            throw new NullPointerException("descriptor == null");
        }
        synchronized (f2291a) {
            c0885a = (C0885a) f2291a.get(str);
        }
        if (c0885a != null) {
            return c0885a;
        }
        C0887c[] c0887cArrM1923b = m1923b(str);
        int i2 = 1;
        int i3 = 0;
        while (true) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == ')') {
                C0887c c0887cM1943b = C0887c.m1943b(str.substring(i2 + 1));
                C0886b c0886b = new C0886b(i3);
                for (int i4 = 0; i4 < i3; i4++) {
                    c0886b.m1937a(i4, c0887cArrM1923b[i4]);
                }
                return m1922b(new C0885a(str, c0887cM1943b, c0886b));
            }
            int i5 = i2;
            while (cCharAt == '[') {
                i5++;
                cCharAt = str.charAt(i5);
            }
            if (cCharAt == 'L') {
                int iIndexOf = str.indexOf(59, i5);
                if (iIndexOf == -1) {
                    throw new IllegalArgumentException("bad descriptor");
                }
                i = iIndexOf + 1;
            } else {
                i = i5 + 1;
            }
            c0887cArrM1923b[i3] = C0887c.m1941a(str.substring(i2, i));
            i3++;
            i2 = i;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0885a m1921a(String str, C0887c c0887c, boolean z, boolean z2) {
        C0885a c0885aM1920a = m1920a(str);
        if (z) {
            return c0885aM1920a;
        }
        if (z2) {
            c0887c = c0887c.m1946a(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
        }
        return c0885aM1920a.m1925a(c0887c);
    }

    /* JADX INFO: renamed from: b */
    private static C0885a m1922b(C0885a c0885a) {
        synchronized (f2291a) {
            String str = c0885a.f2292b;
            C0885a c0885a2 = (C0885a) f2291a.get(str);
            if (c0885a2 != null) {
                return c0885a2;
            }
            f2291a.put(str, c0885a);
            return c0885a;
        }
    }

    /* JADX INFO: renamed from: b */
    private static C0887c[] m1923b(String str) {
        int length = str.length();
        if (str.charAt(0) != '(') {
            throw new IllegalArgumentException("bad descriptor");
        }
        int i = 1;
        int i2 = 0;
        while (true) {
            if (i >= length) {
                i = 0;
                break;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt == ')') {
                break;
            }
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                i2++;
            }
            i++;
        }
        if (i == 0 || i == length - 1) {
            throw new IllegalArgumentException("bad descriptor");
        }
        if (str.indexOf(41, i + 1) != -1) {
            throw new IllegalArgumentException("bad descriptor");
        }
        return new C0887c[i2];
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C0885a c0885a) {
        if (this == c0885a) {
            return 0;
        }
        int iM1945a = this.f2293c.compareTo(c0885a.f2293c);
        if (iM1945a != 0) {
            return iM1945a;
        }
        int iD_ = this.f2294d.m2239d_();
        int iD_2 = c0885a.f2294d.m2239d_();
        int iMin = Math.min(iD_, iD_2);
        for (int i = 0; i < iMin; i++) {
            int iM1945a2 = this.f2294d.m1938b(i).compareTo(c0885a.f2294d.m1938b(i));
            if (iM1945a2 != 0) {
                return iM1945a2;
            }
        }
        if (iD_ < iD_2) {
            return -1;
        }
        return iD_ > iD_2 ? 1 : 0;
    }

    /* JADX INFO: renamed from: a */
    public final C0885a m1925a(C0887c c0887c) {
        String str = "(" + c0887c.m1947g() + this.f2292b.substring(1);
        C0886b c0886bM1939c = this.f2294d.m1939c(c0887c);
        c0886bM1939c.mo811b_();
        return m1922b(new C0885a(str, this.f2293c, c0886bM1939c));
    }

    /* JADX INFO: renamed from: a */
    public final C0887c m1926a() {
        return this.f2293c;
    }

    /* JADX INFO: renamed from: b */
    public final C0886b m1927b() {
        return this.f2294d;
    }

    /* JADX INFO: renamed from: c */
    public final C0886b m1928c() {
        if (this.f2295e == null) {
            int iD_ = this.f2294d.m2239d_();
            C0886b c0886b = new C0886b(iD_);
            boolean z = false;
            for (int i = 0; i < iD_; i++) {
                C0887c c0887cM1938b = this.f2294d.m1938b(i);
                if (c0887cM1938b.m1952l()) {
                    z = true;
                    c0887cM1938b = C0887c.f2347f;
                }
                c0886b.m1937a(i, c0887cM1938b);
            }
            this.f2295e = z ? c0886b : this.f2294d;
        }
        return this.f2295e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0885a) {
            return this.f2292b.equals(((C0885a) obj).f2292b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2292b.hashCode();
    }

    public final String toString() {
        return this.f2292b;
    }
}
