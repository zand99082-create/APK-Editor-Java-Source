package com.p046a.p049b.p073h;

import java.util.Arrays;

/* JADX INFO: renamed from: com.a.b.h.g */
/* JADX INFO: loaded from: classes.dex */
public class C0959g extends C0968p implements InterfaceC0971s {

    /* JADX INFO: renamed from: a */
    private Object[] f2570a;

    public C0959g(int i) {
        super(i != 0);
        try {
            this.f2570a = new Object[i];
        } catch (NegativeArraySizeException e) {
            throw new IllegalArgumentException("size < 0");
        }
    }

    /* JADX INFO: renamed from: a */
    private static Object m2234a(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("n < 0");
        }
        throw new IndexOutOfBoundsException("n >= size()");
    }

    /* JADX INFO: renamed from: a */
    private String m2235a(String str, String str2, String str3, boolean z) {
        int length = this.f2570a.length;
        StringBuffer stringBuffer = new StringBuffer((length * 10) + 10);
        if (str != null) {
            stringBuffer.append(str);
        }
        for (int i = 0; i < length; i++) {
            if (i != 0 && str2 != null) {
                stringBuffer.append(str2);
            }
            if (z) {
                stringBuffer.append(((InterfaceC0971s) this.f2570a[i]).mo919d());
            } else {
                stringBuffer.append(this.f2570a[i]);
            }
        }
        if (str3 != null) {
            stringBuffer.append(str3);
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: a */
    public final String m2236a(String str, String str2, String str3) {
        return m2235a(str, str2, str3, false);
    }

    /* JADX INFO: renamed from: a */
    protected final void m2237a(int i, Object obj) {
        m2266l();
        try {
            this.f2570a[i] = obj;
        } catch (ArrayIndexOutOfBoundsException e) {
            m2234a(i);
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m2238b(String str, String str2, String str3) {
        return m2235a(str, str2, str3, true);
    }

    /* JADX INFO: renamed from: d */
    public String mo919d() {
        String name = getClass().getName();
        return m2235a(name.substring(name.lastIndexOf(46) + 1) + '{', ", ", "}", true);
    }

    /* JADX INFO: renamed from: d_ */
    public final int m2239d_() {
        return this.f2570a.length;
    }

    /* JADX INFO: renamed from: e */
    protected final Object m2240e(int i) {
        try {
            Object obj = this.f2570a[i];
            if (obj == null) {
                throw new NullPointerException("unset: " + i);
            }
            return obj;
        } catch (ArrayIndexOutOfBoundsException e) {
            return m2234a(i);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f2570a, ((C0959g) obj).f2570a);
    }

    /* JADX INFO: renamed from: f */
    protected final Object m2241f(int i) {
        return this.f2570a[i];
    }

    public int hashCode() {
        return Arrays.hashCode(this.f2570a);
    }

    /* JADX INFO: renamed from: i */
    public void mo2242i() {
        int i = 0;
        int length = this.f2570a.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (this.f2570a[i3] != null) {
                i2++;
            }
        }
        if (length == i2) {
            return;
        }
        m2266l();
        Object[] objArr = new Object[i2];
        for (int i4 = 0; i4 < length; i4++) {
            Object obj = this.f2570a[i4];
            if (obj != null) {
                objArr[i] = obj;
                i++;
            }
        }
        this.f2570a = objArr;
        if (i2 == 0) {
            mo811b_();
        }
    }

    public String toString() {
        String name = getClass().getName();
        return m2235a(name.substring(name.lastIndexOf(46) + 1) + '{', ", ", "}", false);
    }
}
