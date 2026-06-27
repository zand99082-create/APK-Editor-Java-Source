package com.gmail.heagoo.neweditor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.gmail.heagoo.neweditor.x */
/* JADX INFO: loaded from: classes.dex */
public final class C1613x {

    /* JADX INFO: renamed from: a */
    private static final C1613x[] f4868a = new C1613x[19];

    /* JADX INFO: renamed from: b */
    private String f4869b;

    /* JADX INFO: renamed from: c */
    private boolean f4870c;

    /* JADX INFO: renamed from: d */
    private byte f4871d;

    /* JADX INFO: renamed from: e */
    private Pattern f4872e;

    /* JADX INFO: renamed from: f */
    private C1612w f4873f;

    /* JADX INFO: renamed from: g */
    private boolean f4874g;

    /* JADX INFO: renamed from: j */
    private C1609t f4877j;

    /* JADX INFO: renamed from: k */
    private final String f4878k;

    /* JADX INFO: renamed from: l */
    private String f4879l;

    /* JADX INFO: renamed from: m */
    private int f4880m;

    /* JADX INFO: renamed from: o */
    private final String f4882o;

    /* JADX INFO: renamed from: h */
    private boolean f4875h = true;

    /* JADX INFO: renamed from: p */
    private int f4883p = -1;

    /* JADX INFO: renamed from: n */
    private final Map f4881n = new HashMap();

    /* JADX INFO: renamed from: i */
    private final List f4876i = new ArrayList();

    static {
        for (byte b2 = 0; b2 < 19; b2 = (byte) (b2 + 1)) {
            f4868a[b2] = new C1613x(null, null);
            f4868a[b2].f4871d = b2;
            f4868a[b2].f4870c = true;
        }
    }

    public C1613x(String str, String str2) {
        this.f4878k = str;
        this.f4882o = str2;
    }

    /* JADX INFO: renamed from: a */
    public static C1613x m3932a(byte b2) {
        return f4868a[b2];
    }

    /* JADX INFO: renamed from: a */
    public final String m3933a() {
        return this.f4878k;
    }

    /* JADX INFO: renamed from: a */
    public final List m3934a(Character ch) {
        List list = (List) this.f4881n.get(null);
        boolean z = list == null || list.isEmpty();
        Character chValueOf = ch == null ? null : Character.valueOf(Character.toUpperCase(ch.charValue()));
        List list2 = chValueOf != null ? (List) this.f4881n.get(chValueOf) : null;
        boolean z2 = list2 == null || list2.isEmpty();
        if (z && z2) {
            return Collections.emptyList();
        }
        if (z2) {
            return list;
        }
        if (z) {
            return list2;
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size());
        arrayList.addAll(list2);
        arrayList.addAll(list);
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final void m3935a(int i) {
        if (i < 0) {
            i = -1;
        }
        this.f4883p = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m3936a(C1609t c1609t) {
        this.f4877j = c1609t;
        this.f4869b = null;
    }

    /* JADX INFO: renamed from: a */
    public final void m3937a(C1612w c1612w) {
        Character[] chArr;
        this.f4880m++;
        if (c1612w.f4867l == null) {
            Character[] chArr2 = new Character[1];
            if (c1612w.f4866k == null || c1612w.f4866k.length <= 0) {
                chArr2[0] = null;
                chArr = chArr2;
            } else {
                chArr2[0] = Character.valueOf(c1612w.f4866k[0]);
                chArr = chArr2;
            }
        } else {
            Character[] chArr3 = new Character[c1612w.f4867l.length];
            char[] cArr = c1612w.f4867l;
            int length = cArr.length;
            int i = 0;
            int i2 = 0;
            while (i2 < length) {
                chArr3[i] = Character.valueOf(cArr[i2]);
                i2++;
                i++;
            }
            chArr = chArr3;
        }
        for (Character ch : chArr) {
            List arrayList = (List) this.f4881n.get(ch);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f4881n.put(ch, arrayList);
            }
            arrayList.add(c1612w);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3938a(C1613x c1613x) {
        this.f4876i.add(c1613x);
    }

    /* JADX INFO: renamed from: a */
    public final void m3939a(String str) {
        this.f4879l = str;
        this.f4869b = null;
    }

    /* JADX INFO: renamed from: a */
    public final void m3940a(Hashtable hashtable) {
        this.f4869b = null;
    }

    /* JADX INFO: renamed from: a */
    public final void m3941a(Pattern pattern) {
        this.f4872e = pattern;
    }

    /* JADX INFO: renamed from: a */
    public final void m3942a(boolean z) {
        this.f4875h = z;
    }

    /* JADX INFO: renamed from: b */
    public final String m3943b() {
        return this.f4882o;
    }

    /* JADX INFO: renamed from: b */
    public final void m3944b(byte b2) {
        this.f4871d = b2;
    }

    /* JADX INFO: renamed from: b */
    public final void m3945b(C1612w c1612w) {
        this.f4873f = c1612w;
    }

    /* JADX INFO: renamed from: b */
    public final void m3946b(boolean z) {
        this.f4874g = z;
    }

    /* JADX INFO: renamed from: c */
    public final int m3947c() {
        return this.f4880m;
    }

    /* JADX INFO: renamed from: d */
    public final int m3948d() {
        return this.f4883p;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m3949e() {
        return this.f4875h;
    }

    /* JADX INFO: renamed from: f */
    public final C1609t m3950f() {
        return this.f4877j;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m3951g() {
        return this.f4874g;
    }

    /* JADX INFO: renamed from: h */
    public final Pattern m3952h() {
        return this.f4872e;
    }

    /* JADX INFO: renamed from: i */
    public final C1612w m3953i() {
        return this.f4873f;
    }

    /* JADX INFO: renamed from: j */
    public final byte m3954j() {
        return this.f4871d;
    }

    /* JADX INFO: renamed from: k */
    public final String m3955k() {
        if (this.f4869b == null) {
            this.f4869b = this.f4879l;
            if (this.f4879l == null) {
                this.f4879l = "";
            }
            if (this.f4877j != null) {
                this.f4879l += this.f4877j.m3918a();
            }
        }
        return this.f4879l;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m3956l() {
        return this.f4870c;
    }

    public final String toString() {
        return String.valueOf(getClass().getName()) + '[' + this.f4878k + "::" + this.f4882o + ']';
    }
}
