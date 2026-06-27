package com.gmail.heagoo.apkeditor.p090a.p091a;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.a.a.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1096o {

    /* JADX INFO: renamed from: a */
    private static int f3194a = 1048833;

    /* JADX INFO: renamed from: b */
    private static int f3195b = 1048834;

    /* JADX INFO: renamed from: c */
    private static int f3196c = 1048835;

    /* JADX INFO: renamed from: d */
    private static int f3197d = 1048832;

    /* JADX INFO: renamed from: e */
    private static int f3198e = 1048836;

    /* JADX INFO: renamed from: f */
    private C1094m f3199f;

    /* JADX INFO: renamed from: g */
    private C1093l f3200g;

    /* JADX INFO: renamed from: h */
    private int f3201h = 29;

    /* JADX INFO: renamed from: i */
    private List f3202i;

    /* JADX INFO: renamed from: j */
    private C1100s f3203j;

    /* JADX INFO: renamed from: k */
    private int f3204k;

    /* JADX INFO: renamed from: l */
    private int f3205l;

    /* JADX INFO: renamed from: m */
    private int f3206m;

    /* JADX INFO: renamed from: n */
    private byte[] f3207n;

    /* JADX INFO: renamed from: o */
    private int f3208o;

    public C1096o(InputStream inputStream, String str) throws IOException {
        this.f3199f = new C1094m(inputStream);
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "rw");
        randomAccessFile.setLength(0L);
        this.f3200g = new C1093l(randomAccessFile);
        int iM2949a = this.f3199f.m2949a();
        this.f3204k = this.f3199f.m2949a();
        this.f3200g.m2942a(iM2949a);
        this.f3200g.m2942a(this.f3204k);
        this.f3203j = new C1100s();
        this.f3203j.m2976a(this.f3199f);
        this.f3208o = this.f3203j.f3218a;
        new Object[1][0] = Integer.valueOf(this.f3203j.f3218a);
        new Object[1][0] = Integer.valueOf(this.f3203j.f3219b);
        new Object[1][0] = Integer.valueOf(this.f3203j.f3220c);
    }

    /* JADX INFO: renamed from: a */
    private int m2955a(int i, int i2) {
        int i3 = 0;
        List listM2973a = this.f3203j.m2973a();
        int size = listM2973a.size() - 1;
        while (size >= 0) {
            int i4 = i >= ((Integer) listM2973a.get(size)).intValue() ? i3 + 1 : i3;
            size--;
            i3 = i4;
        }
        if (i3 > 0) {
            C1086e.m2935a(this.f3207n, i2, i + i3);
        }
        return i + i3;
    }

    /* JADX INFO: renamed from: c */
    private static boolean m2956c(int i) {
        return i == 3;
    }

    /* JADX INFO: renamed from: a */
    public final void m2957a() {
        int iM2949a;
        boolean z;
        C1099r c1099r = new C1099r();
        c1099r.m2966a(this.f3199f);
        this.f3203j.m2975a(this.f3200g);
        this.f3204k += this.f3203j.f3218a - this.f3208o;
        c1099r.m2965a(this.f3200g);
        int iM2972a = this.f3203j.m2972a("uses-permission");
        byte[] bArr = new byte[56];
        byte[] bArr2 = new byte[24];
        do {
            C1094m c1094m = this.f3199f;
            iM2949a = c1094m.m2949a();
            int iM2949a2 = c1094m.m2949a();
            this.f3207n = new byte[iM2949a2];
            C1086e.m2935a(this.f3207n, 0, iM2949a);
            C1086e.m2935a(this.f3207n, 4, iM2949a2);
            if (iM2949a2 > 8) {
                c1094m.m2951a(this.f3207n, 8, iM2949a2 - 8);
            }
            if (iM2949a == f3195b) {
                m2955a(C1086e.m2929a(this.f3207n, 16), 16);
                int iM2955a = m2955a(C1086e.m2929a(this.f3207n, 20), 20);
                int iM2929a = C1086e.m2929a(this.f3207n, 28);
                if (this.f3203j.m2978b(iM2955a).equals("manifest")) {
                    for (int i = 0; i < iM2929a; i++) {
                        m2955a(C1086e.m2929a(this.f3207n, (i * 20) + 36), (i * 20) + 36);
                        int iM2955a2 = m2955a(C1086e.m2929a(this.f3207n, (i * 20) + 36 + 4), (i * 20) + 36 + 4);
                        int iM2955a3 = m2955a(C1086e.m2929a(this.f3207n, (i * 20) + 36 + 8), (i * 20) + 36 + 8);
                        int iM2929a2 = C1086e.m2929a(this.f3207n, ((i * 20) + 36) + 12) >> 16;
                        int i2 = ((iM2929a2 >> 8) & 255) | ((iM2929a2 & 255) << 8);
                        int iM2929a3 = C1086e.m2929a(this.f3207n, (i * 20) + 36 + 16);
                        if (m2956c(i2)) {
                            iM2929a3 = m2955a(iM2929a3, (i * 20) + 36 + 16);
                        }
                        String strM2978b = this.f3203j.m2978b(iM2955a2);
                        if ("versionCode".equals(strM2978b)) {
                            if (iM2929a3 != -1) {
                                C1086e.m2935a(this.f3207n, (i * 20) + 36 + 16, this.f3205l);
                            } else if (iM2955a3 != -1) {
                                C1086e.m2935a(this.f3207n, (i * 20) + 36 + 8, this.f3205l);
                            }
                        } else if ("installLocation".equals(strM2978b)) {
                            if (iM2929a3 != -1) {
                                C1086e.m2935a(this.f3207n, (i * 20) + 36 + 16, this.f3206m);
                            } else if (iM2955a3 != -1) {
                                C1086e.m2935a(this.f3207n, (i * 20) + 36 + 8, this.f3206m);
                            }
                        }
                    }
                } else {
                    for (int i3 = 0; i3 < iM2929a; i3++) {
                        m2955a(C1086e.m2929a(this.f3207n, (i3 * 20) + 36), (i3 * 20) + 36);
                        m2955a(C1086e.m2929a(this.f3207n, (i3 * 20) + 36 + 4), (i3 * 20) + 36 + 4);
                        m2955a(C1086e.m2929a(this.f3207n, (i3 * 20) + 36 + 8), (i3 * 20) + 36 + 8);
                        int iM2929a4 = C1086e.m2929a(this.f3207n, ((i3 * 20) + 36) + 12) >> 16;
                        int i4 = ((iM2929a4 & 255) << 8) | ((iM2929a4 >> 8) & 255);
                        int iM2929a5 = C1086e.m2929a(this.f3207n, (i3 * 20) + 36 + 16);
                        if (m2956c(i4)) {
                            m2955a(iM2929a5, (i3 * 20) + 36 + 16);
                        }
                    }
                }
            } else if (iM2949a == f3196c || iM2949a == f3194a || iM2949a == f3197d) {
                m2955a(C1086e.m2929a(this.f3207n, 16), 16);
                m2955a(C1086e.m2929a(this.f3207n, 20), 20);
            }
            if (iM2949a == C1083b.f3162b) {
                if (C1086e.m2929a(this.f3207n, 20) == iM2972a) {
                    System.arraycopy(this.f3207n, 0, bArr, 0, 56);
                }
                z = false;
            } else if (iM2949a == C1083b.f3163c && C1086e.m2929a(this.f3207n, 20) == iM2972a) {
                System.arraycopy(this.f3207n, 0, bArr2, 0, 24);
                z = true;
            } else {
                z = false;
            }
            this.f3200g.m2944a(this.f3207n);
            if (z && this.f3202i != null) {
                for (int i5 = 1; i5 < this.f3202i.size(); i5++) {
                    C1086e.m2935a(bArr, 44, this.f3201h + i5);
                    C1086e.m2935a(bArr, 52, this.f3201h + i5);
                    this.f3200g.m2944a(bArr);
                    this.f3204k += 56;
                    this.f3200g.m2944a(bArr2);
                    this.f3204k += 24;
                }
            }
        } while (iM2949a != C1083b.f3161a);
        this.f3200g.m2943a(4, this.f3204k);
        this.f3200g.m2947b();
    }

    /* JADX INFO: renamed from: a */
    public final void m2958a(int i) {
        this.f3206m = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m2959a(String str, String str2) {
        for (int i = 0; i < this.f3203j.f3219b; i++) {
            if (this.f3203j.m2978b(i).equals(str)) {
                this.f3203j.m2974a(i, str2);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2960a(List list) {
        this.f3202i = list;
        this.f3201h = this.f3203j.m2972a("aaaaaa.permission.READ_EXTERNAL_STORAGE");
        Collections.sort(list);
        this.f3203j.m2974a(this.f3201h, (String) list.get(0));
        for (int size = list.size() - 1; size > 0; size--) {
            this.f3203j.m2977a((String) list.get(size), this.f3201h + 1);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2961b(int i) {
        this.f3205l = i;
    }
}
