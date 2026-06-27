package com.gmail.heagoo.apkeditor.p090a.p091a;

import android.R;
import android.util.SparseArray;
import com.gmail.heagoo.apkeditor.p090a.C1111g;
import com.gmail.heagoo.apkeditor.p090a.C1112h;
import jadx.core.deobf.Deobfuscator;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.a.a.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1086e {

    /* JADX INFO: renamed from: a */
    private C1094m f3171a;

    /* JADX INFO: renamed from: b */
    private C1093l f3172b;

    /* JADX INFO: renamed from: c */
    private boolean f3173c;

    /* JADX INFO: renamed from: d */
    private String f3174d;

    /* JADX INFO: renamed from: e */
    private int f3175e;

    /* JADX INFO: renamed from: f */
    private int f3176f;

    /* JADX INFO: renamed from: g */
    private C1100s f3177g;

    /* JADX INFO: renamed from: h */
    private C1099r f3178h;

    /* JADX INFO: renamed from: i */
    private C1082a f3179i;

    /* JADX INFO: renamed from: j */
    private C1111g f3180j;

    /* JADX INFO: renamed from: k */
    private C1111g f3181k;

    /* JADX INFO: renamed from: l */
    private Map f3182l = new HashMap();

    public C1086e(InputStream inputStream, String str, boolean z) throws IOException {
        this.f3173c = z;
        this.f3171a = new C1094m(inputStream);
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "rw");
        randomAccessFile.setLength(0L);
        this.f3172b = new C1093l(randomAccessFile);
        try {
            this.f3175e = this.f3171a.m2949a();
            this.f3176f = this.f3171a.m2949a();
            this.f3177g = new C1100s();
            this.f3177g.m2976a(this.f3171a);
            this.f3178h = new C1099r();
            this.f3178h.m2966a(this.f3171a);
            this.f3179i = new C1082a(this.f3177g, this.f3178h);
            this.f3179i.m2922a(this.f3171a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    protected static int m2929a(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    /* JADX INFO: renamed from: a */
    private static String m2931a(String str, String str2) {
        return str2.startsWith(Deobfuscator.CLASS_NAME_SEPARATOR) ? str + str2 : !str2.contains(Deobfuscator.CLASS_NAME_SEPARATOR) ? str + Deobfuscator.CLASS_NAME_SEPARATOR + str2 : str2;
    }

    /* JADX INFO: renamed from: a */
    private static String m2932a(String str, String str2, String str3) {
        return str3.startsWith(new StringBuilder().append(str).append(Deobfuscator.CLASS_NAME_SEPARATOR).toString()) ? str2 + str3.substring(str.length()) : str3;
    }

    /* JADX INFO: renamed from: a */
    private static void m2933a(C1093l c1093l) {
        if (c1093l != null) {
            try {
                c1093l.m2947b();
            } catch (IOException e) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m2934a(boolean z, boolean z2) {
        if (z) {
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray = new SparseArray();
            for (C1112h c1112h : this.f3180j.f3300s) {
                if (!arrayList.contains(Integer.valueOf(c1112h.f3306c))) {
                    arrayList.add(Integer.valueOf(c1112h.f3306c));
                    sparseArray.put(c1112h.f3306c, c1112h.f3305b);
                }
            }
            Collections.sort(arrayList);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                int iIntValue = ((Integer) arrayList.get(size)).intValue();
                String str = (String) sparseArray.get(iIntValue);
                if (str.startsWith(this.f3180j.f3286e)) {
                    this.f3177g.m2977a(this.f3181k.f3286e + str.substring(this.f3180j.f3286e.length()), iIntValue + 1);
                } else {
                    this.f3177g.m2977a(str + this.f3174d, iIntValue + 1);
                }
            }
        }
        if (z2) {
            this.f3177g.m2977a("installLocation", 0);
        }
    }

    /* JADX INFO: renamed from: a */
    protected static void m2935a(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) i2;
        bArr[i + 1] = (byte) (i2 >> 8);
        bArr[i + 2] = (byte) (i2 >> 16);
        bArr[i + 3] = (byte) (i2 >>> 24);
    }

    /* JADX INFO: renamed from: b */
    protected static void m2937b(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) i2;
        bArr[i + 1] = (byte) (i2 >> 8);
    }

    /* JADX INFO: renamed from: a */
    public final void m2938a() {
        try {
            this.f3172b.m2942a(this.f3175e);
            this.f3172b.m2942a(this.f3176f);
            int i = this.f3177g.f3218a;
            this.f3177g.m2975a(this.f3172b);
            this.f3178h.m2965a(this.f3172b);
            this.f3179i.m2921a(this.f3172b);
            new Object[1][0] = Integer.valueOf(this.f3172b.m2941a());
            this.f3172b.m2943a(4, this.f3172b.m2941a());
        } finally {
            m2933a(this.f3172b);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2939a(C1111g c1111g, C1111g c1111g2) {
        this.f3180j = c1111g;
        this.f3181k = c1111g2;
        boolean z = this.f3180j.f3283b == -1 && this.f3181k.f3283b != -1;
        boolean z2 = (this.f3180j.f3292k == -1 || this.f3181k.f3285d == null || this.f3181k.f3285d.equals(this.f3180j.f3285d)) ? false : true;
        boolean z3 = (this.f3181k.f3286e == null || this.f3181k.f3286e.equals(this.f3180j.f3286e)) ? false : true;
        boolean z4 = (this.f3180j.f3291j < 0 || this.f3181k.f3284c == null || this.f3181k.f3284c.equals(this.f3180j.f3284c)) ? false : true;
        boolean z5 = this.f3173c;
        HashSet hashSet = new HashSet();
        if (z3) {
            Random random = new Random(System.currentTimeMillis());
            this.f3174d = new StringBuilder().append((char) (random.nextInt(26) + 97)).append((char) (random.nextInt(26) + 97)).toString();
        }
        if (z3 && this.f3173c) {
            for (int i = 0; i < this.f3177g.f3221d.length; i++) {
                String strM2978b = this.f3177g.m2978b(i);
                if (strM2978b.startsWith(this.f3180j.f3286e)) {
                    this.f3177g.m2974a(i, this.f3181k.f3286e + strM2978b.substring(this.f3180j.f3286e.length()));
                    hashSet.add(Integer.valueOf(i));
                }
            }
        }
        if (z3) {
            for (Map.Entry entry : this.f3180j.f3299r.entrySet()) {
                int iIntValue = ((Integer) entry.getKey()).intValue();
                if (!hashSet.contains(Integer.valueOf(iIntValue))) {
                    this.f3177g.m2974a(iIntValue, ((String) entry.getValue()) + this.f3174d);
                }
            }
        }
        int i2 = this.f3180j.f3292k;
        if (z2 && i2 != -1) {
            this.f3177g.m2974a(i2, this.f3181k.f3285d);
        }
        int i3 = this.f3180j.f3293l;
        if (z3 && i3 != -1 && !hashSet.contains(Integer.valueOf(i3))) {
            this.f3177g.m2974a(i3, this.f3181k.f3286e);
        }
        if (z3) {
            if (this.f3180j.f3297p != null && !this.f3180j.f3297p.isEmpty()) {
                Collections.sort(this.f3180j.f3297p);
                Iterator it = this.f3180j.f3297p.iterator();
                int i4 = -1;
                while (it.hasNext()) {
                    int iIntValue2 = ((Integer) it.next()).intValue();
                    if (iIntValue2 != i4) {
                        if (!hashSet.contains(Integer.valueOf(iIntValue2))) {
                            String strM2978b2 = this.f3177g.m2978b(iIntValue2);
                            String strM2932a = z5 ? m2932a(this.f3180j.f3286e, this.f3181k.f3286e, strM2978b2) : m2931a(this.f3180j.f3286e, strM2978b2);
                            if (!strM2932a.equals(strM2978b2)) {
                                this.f3177g.m2974a(iIntValue2, strM2932a);
                            }
                        }
                    }
                    i4 = iIntValue2;
                }
            }
            if (!this.f3180j.f3302u.isEmpty()) {
                Iterator it2 = this.f3180j.f3302u.values().iterator();
                while (it2.hasNext()) {
                    int iIntValue3 = ((Integer) it2.next()).intValue();
                    if (!hashSet.contains(Integer.valueOf(iIntValue3))) {
                        String strM2978b3 = this.f3177g.m2978b(iIntValue3);
                        String strM2932a2 = z5 ? m2932a(this.f3180j.f3286e, this.f3181k.f3286e, strM2978b3) : m2931a(this.f3180j.f3286e, strM2978b3);
                        if (!strM2932a2.equals(strM2978b3)) {
                            this.f3177g.m2974a(iIntValue3, strM2932a2);
                        }
                    }
                }
            }
        }
        if (z4) {
            this.f3177g.m2974a(this.f3180j.f3291j, this.f3181k.f3284c);
        }
        m2934a(z3, z);
        if (z) {
            this.f3178h.m2964a(R.attr.installLocation, 0);
        }
        this.f3179i.m2920a();
        if (z) {
            this.f3179i.m2923a("manifest", 0, -1, 268435464, this.f3181k.f3283b);
        } else if (this.f3181k.f3283b != -1) {
            this.f3179i.m2924a("manifest", "installLocation", new C1087f(this));
        }
        if (z3 && !this.f3180j.f3300s.isEmpty()) {
            this.f3179i.m2924a("manifest/application/provider", "authorities", new C1088g(this));
        }
        if (this.f3181k.f3282a != this.f3180j.f3282a) {
            this.f3179i.m2924a("manifest", "versionCode", new C1089h(this));
        }
        if (this.f3180j.f3288g != -1 && this.f3181k.f3288g != this.f3180j.f3288g) {
            this.f3179i.m2924a("manifest/uses-sdk", "minSdkVersion", new C1090i(this));
        }
        if (this.f3180j.f3289h != -1 && this.f3181k.f3289h != this.f3180j.f3289h) {
            this.f3179i.m2924a("manifest/uses-sdk", "targetSdkVersion", new C1091j(this));
        }
        if (this.f3180j.f3290i == -1 || this.f3181k.f3290i == this.f3180j.f3290i) {
            return;
        }
        this.f3179i.m2924a("manifest/uses-sdk", "minSdkVersion", new C1092k(this));
    }

    /* JADX INFO: renamed from: b */
    public final Map m2940b() {
        return this.f3182l;
    }
}
