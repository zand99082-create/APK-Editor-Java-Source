package com.p046a.p047a;

import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.InputDeviceCompat;
import com.gmail.heagoo.p084a.p089c.C1067a;
import java.util.Arrays;

/* JADX INFO: renamed from: com.a.a.z */
/* JADX INFO: loaded from: classes.dex */
public final class C0509z {

    /* JADX INFO: renamed from: t */
    public int f773t;

    /* JADX INFO: renamed from: v */
    public int f775v;

    /* JADX INFO: renamed from: w */
    public int f776w;

    /* JADX INFO: renamed from: x */
    public int f777x;

    /* JADX INFO: renamed from: y */
    public int f778y;

    /* JADX INFO: renamed from: z */
    public int f779z;

    /* JADX INFO: renamed from: a */
    public final C0483aa f754a = new C0483aa(0);

    /* JADX INFO: renamed from: b */
    public final C0483aa f755b = new C0483aa(1);

    /* JADX INFO: renamed from: c */
    public final C0483aa f756c = new C0483aa(2);

    /* JADX INFO: renamed from: d */
    public final C0483aa f757d = new C0483aa(3);

    /* JADX INFO: renamed from: e */
    public final C0483aa f758e = new C0483aa(4);

    /* JADX INFO: renamed from: f */
    public final C0483aa f759f = new C0483aa(5);

    /* JADX INFO: renamed from: g */
    public final C0483aa f760g = new C0483aa(6);

    /* JADX INFO: renamed from: h */
    public final C0483aa f761h = new C0483aa(4096);

    /* JADX INFO: renamed from: i */
    public final C0483aa f762i = new C0483aa(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);

    /* JADX INFO: renamed from: j */
    public final C0483aa f763j = new C0483aa(InputDeviceCompat.SOURCE_TOUCHSCREEN);

    /* JADX INFO: renamed from: k */
    public final C0483aa f764k = new C0483aa(FragmentTransaction.TRANSIT_FRAGMENT_FADE);

    /* JADX INFO: renamed from: l */
    public final C0483aa f765l = new C0483aa(8192);

    /* JADX INFO: renamed from: m */
    public final C0483aa f766m = new C0483aa(8193);

    /* JADX INFO: renamed from: n */
    public final C0483aa f767n = new C0483aa(8194);

    /* JADX INFO: renamed from: o */
    public final C0483aa f768o = new C0483aa(8195);

    /* JADX INFO: renamed from: p */
    public final C0483aa f769p = new C0483aa(8196);

    /* JADX INFO: renamed from: q */
    public final C0483aa f770q = new C0483aa(8197);

    /* JADX INFO: renamed from: r */
    public final C0483aa f771r = new C0483aa(8198);

    /* JADX INFO: renamed from: s */
    public final C0483aa[] f772s = {this.f754a, this.f755b, this.f756c, this.f757d, this.f758e, this.f759f, this.f760g, this.f761h, this.f762i, this.f763j, this.f764k, this.f765l, this.f766m, this.f767n, this.f768o, this.f769p, this.f770q, this.f771r};

    /* JADX INFO: renamed from: u */
    public byte[] f774u = new byte[20];

    /* JADX INFO: renamed from: a */
    private void m702a(C0498o c0498o) {
        int iM647b = c0498o.m647b();
        int i = 0;
        C0483aa c0483aa = null;
        while (i < iM647b) {
            short sM649c = c0498o.m649c();
            c0498o.m649c();
            C0483aa[] c0483aaArr = this.f772s;
            for (int i2 = 0; i2 < 18; i2++) {
                C0483aa c0483aa2 = c0483aaArr[i2];
                if (c0483aa2.f673a == sM649c) {
                    int iM647b2 = c0498o.m647b();
                    int iM647b3 = c0498o.m647b();
                    if ((c0483aa2.f674b != 0 && c0483aa2.f674b != iM647b2) || (c0483aa2.f675c != -1 && c0483aa2.f675c != iM647b3)) {
                        throw new C0502s("Unexpected map value for 0x" + Integer.toHexString(sM649c));
                    }
                    c0483aa2.f674b = iM647b2;
                    c0483aa2.f675c = iM647b3;
                    if (c0483aa != null && c0483aa.f675c > c0483aa2.f675c) {
                        throw new C0502s("Map is unsorted at " + c0483aa + ", " + c0483aa2);
                    }
                    i++;
                    c0483aa = c0483aa2;
                }
            }
            throw new IllegalArgumentException("No such map item: " + ((int) sM649c));
        }
        Arrays.sort(this.f772s);
    }

    /* JADX INFO: renamed from: a */
    public final void m703a() {
        int i = this.f778y + this.f779z;
        for (int i2 = 17; i2 >= 0; i2--) {
            C0483aa c0483aa = this.f772s[i2];
            if (c0483aa.f675c != -1) {
                if (c0483aa.f675c > i) {
                    throw new C0502s("Map is unsorted at " + c0483aa);
                }
                c0483aa.f676d = i - c0483aa.f675c;
                i = c0483aa.f675c;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m704a(C0492i c0492i) {
        C0498o c0498oM616a = c0492i.m616a(0);
        byte[] bArrM646a = c0498oM616a.m646a(8);
        if (C1067a.m2495b(bArrM646a) != 13) {
            throw new C0502s("Unexpected magic: " + Arrays.toString(bArrM646a));
        }
        this.f773t = c0498oM616a.m647b();
        this.f774u = c0498oM616a.m646a(20);
        this.f775v = c0498oM616a.m647b();
        int iM647b = c0498oM616a.m647b();
        if (iM647b != 112) {
            throw new C0502s("Unexpected header: 0x" + Integer.toHexString(iM647b));
        }
        int iM647b2 = c0498oM616a.m647b();
        if (iM647b2 != 305419896) {
            throw new C0502s("Unexpected endian tag: 0x" + Integer.toHexString(iM647b2));
        }
        this.f776w = c0498oM616a.m647b();
        this.f777x = c0498oM616a.m647b();
        this.f761h.f675c = c0498oM616a.m647b();
        if (this.f761h.f675c == 0) {
            throw new C0502s("Cannot merge dex files that do not contain a map");
        }
        this.f755b.f674b = c0498oM616a.m647b();
        this.f755b.f675c = c0498oM616a.m647b();
        this.f756c.f674b = c0498oM616a.m647b();
        this.f756c.f675c = c0498oM616a.m647b();
        this.f757d.f674b = c0498oM616a.m647b();
        this.f757d.f675c = c0498oM616a.m647b();
        this.f758e.f674b = c0498oM616a.m647b();
        this.f758e.f675c = c0498oM616a.m647b();
        this.f759f.f674b = c0498oM616a.m647b();
        this.f759f.f675c = c0498oM616a.m647b();
        this.f760g.f674b = c0498oM616a.m647b();
        this.f760g.f675c = c0498oM616a.m647b();
        this.f778y = c0498oM616a.m647b();
        this.f779z = c0498oM616a.m647b();
        m702a(c0492i.m616a(this.f761h.f675c));
        m703a();
    }
}
