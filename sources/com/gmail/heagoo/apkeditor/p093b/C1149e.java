package com.gmail.heagoo.apkeditor.p093b;

import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.InputDeviceCompat;
import android.util.Log;
import com.gmail.heagoo.apkeditor.p090a.p091a.C1100s;
import com.gmail.heagoo.neweditor.Token;
import com.gmail.heagoo.p084a.p089c.C1067a;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.Adler32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.b.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1149e {

    /* JADX INFO: renamed from: a */
    private byte[] f3385a;

    /* JADX INFO: renamed from: b */
    private C1146b f3386b;

    /* JADX INFO: renamed from: c */
    private List f3387c;

    public C1149e(String str) {
        this(str, "classes.dex");
    }

    public C1149e(String str, String str2) throws Throwable {
        ZipFile zipFile;
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2 = null;
        bufferedInputStream2 = null;
        ZipFile zipFile2 = null;
        this.f3387c = new ArrayList();
        try {
            zipFile = new ZipFile(str);
            try {
                ZipEntry entry = zipFile.getEntry(str2);
                int size = (int) entry.getSize();
                this.f3385a = new byte[size];
                bufferedInputStream = new BufferedInputStream(zipFile.getInputStream(entry));
                int i = 0;
                while (i < size) {
                    try {
                        i += bufferedInputStream.read(this.f3385a, i, size - i);
                    } catch (Exception e) {
                        e = e;
                        zipFile2 = zipFile;
                        try {
                            e.printStackTrace();
                            C1067a.m2474a((Closeable) bufferedInputStream);
                            C1067a.m2481a(zipFile2);
                            return;
                        } catch (Throwable th) {
                            th = th;
                            zipFile = zipFile2;
                            bufferedInputStream2 = bufferedInputStream;
                            C1067a.m2474a((Closeable) bufferedInputStream2);
                            C1067a.m2481a(zipFile);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedInputStream2 = bufferedInputStream;
                        C1067a.m2474a((Closeable) bufferedInputStream2);
                        C1067a.m2481a(zipFile);
                        throw th;
                    }
                }
                this.f3386b = new C1146b(this.f3385a);
                C1067a.m2474a((Closeable) bufferedInputStream);
                C1067a.m2481a(zipFile);
            } catch (Exception e2) {
                e = e2;
                bufferedInputStream = null;
                zipFile2 = zipFile;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e3) {
            e = e3;
            bufferedInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            zipFile = null;
        }
    }

    /* JADX INFO: renamed from: a */
    private int m3050a(int i, int i2) {
        int i3 = 0;
        int i4 = i;
        while (i3 < i2) {
            while ((this.f3385a[i4] & 128) != 0) {
                i4++;
            }
            i3++;
            i4++;
        }
        return i4 - i;
    }

    /* JADX INFO: renamed from: a */
    private int m3051a(int i, int[] iArr) {
        int i2 = i;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            int i4 = 0;
            int i5 = i2;
            int i6 = 0;
            while ((this.f3385a[i5] & 128) != 0) {
                i4 |= (this.f3385a[i5] & Token.END) << i6;
                i6 += 7;
                i5++;
            }
            int i7 = i4 | (this.f3385a[i5] << i6);
            i2 = i5 + 1;
            iArr[i3] = i7;
        }
        return i2 - i;
    }

    /* JADX INFO: renamed from: a */
    private static String m3052a(String str) {
        return "L" + str.replace('.', '/');
    }

    /* JADX INFO: renamed from: a */
    private static String m3053a(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            if (str.startsWith(str2)) {
                return ((String) entry.getValue()) + str.substring(str2.length());
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private void m3054a(int i, int i2, int i3) {
        int iM3033a = C1146b.m3033a(this.f3385a, i);
        if (iM3033a >= i2) {
            C1146b.m3034a(iM3033a + i3, this.f3385a, i);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m3055a(List list) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            C1152h c1152h = (C1152h) list.get(0);
            messageDigest.update(c1152h.f3392a, 32, c1152h.f3394c - 32);
            for (int i = 1; i < list.size(); i++) {
                C1152h c1152h2 = (C1152h) list.get(i);
                messageDigest.update(c1152h2.f3392a, c1152h2.f3393b, c1152h2.f3394c);
            }
            byte[] bArrDigest = messageDigest.digest();
            System.arraycopy(bArrDigest, 0, c1152h.f3392a, 12, bArrDigest.length);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m3056a(List list, String str) throws IOException {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1152h c1152h = (C1152h) it.next();
            bufferedOutputStream.write(c1152h.f3392a, c1152h.f3393b, c1152h.f3394c);
        }
        bufferedOutputStream.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x037a  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m3057a(String str, List list) {
        int length;
        int i;
        int i2;
        int i3;
        int i4;
        try {
            List listM3044f = this.f3386b.m3044f();
            Iterator it = listM3044f.iterator();
            while (it.hasNext()) {
                it.next();
            }
            int i5 = 0;
            while (true) {
                if (i5 >= listM3044f.size()) {
                    length = 0;
                    i = 0;
                    break;
                }
                C1145a c1145a = (C1145a) listM3044f.get(i5);
                if (c1145a.f3367a == 8194) {
                    int i6 = c1145a.f3369c;
                    if (i5 + 1 < listM3044f.size()) {
                        length = ((C1145a) listM3044f.get(i5 + 1)).f3369c - c1145a.f3369c;
                        i = i6;
                    } else {
                        length = this.f3385a.length - c1145a.f3369c;
                        i = i6;
                    }
                } else {
                    i5++;
                }
            }
            if (length == 0) {
                int i7 = ((C1151g) list.get(0)).f3389b;
                C1151g c1151g = (C1151g) list.get(list.size() - 1);
                i2 = (c1151g.f3389b + c1151g.f3390c) - ((C1151g) list.get(0)).f3389b;
                i3 = i7;
            } else {
                i2 = length;
                i3 = i;
            }
            int iM3065a = 0;
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                iM3065a += ((C1151g) it2.next()).m3065a();
            }
            if ((iM3065a - i2) % 4 == 0) {
                i4 = iM3065a;
            } else if (((iM3065a - i2) + 1) % 4 == 0) {
                i4 = iM3065a + 1;
            } else if (((iM3065a - i2) + 2) % 4 == 0) {
                i4 = iM3065a + 2;
            } else if (((iM3065a - i2) + 3) % 4 == 0) {
                i4 = iM3065a + 3;
            }
            byte[] bArr = new byte[i4];
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                C1146b.m3034a(i3 + i8, this.f3385a, this.f3386b.m3038a(i9));
                C1151g c1151g2 = (C1151g) list.get(i9);
                System.arraycopy(c1151g2.f3388a, c1151g2.f3389b, bArr, i8, c1151g2.f3390c);
                i8 += c1151g2.f3390c;
            }
            int i10 = i4 - i2;
            int i11 = i3 + i2;
            int iM3041c = this.f3386b.m3041c();
            int iM3042d = this.f3386b.m3042d() + 8;
            for (int i12 = 0; i12 < iM3041c; i12++) {
                m3054a(iM3042d, i11, i10);
                iM3042d += 12;
            }
            int iM3043e = this.f3386b.m3043e();
            int iM3037a = this.f3386b.m3037a();
            for (int i13 = 0; i13 < iM3037a; i13++) {
                int i14 = (i13 << 5) + iM3043e;
                m3054a(i14 + 12, i11, i10);
                m3054a(i14 + 20, i11, i10);
                m3054a(i14 + 28, i11, i10);
                int iM3033a = C1146b.m3033a(this.f3385a, i14 + 24);
                if (iM3033a >= i11) {
                    C1146b.m3034a(iM3033a + i10, this.f3385a, i14 + 24);
                }
                if (iM3033a > 0) {
                    int[] iArr = new int[4];
                    int iM3051a = m3051a(iM3033a, iArr);
                    int i15 = iArr[0] + iArr[1];
                    int i16 = iArr[2] + iArr[3];
                    int[] iArr2 = new int[1];
                    int iM3050a = iM3033a + iM3051a + (i15 > 0 ? m3050a(iM3033a + iM3051a, i15 << 1) : 0);
                    for (int i17 = 0; i17 < i16; i17++) {
                        int iM3050a2 = iM3050a + m3050a(iM3050a, 2);
                        int iM3051a2 = m3051a(iM3050a2, iArr2);
                        iM3050a = iM3050a2 + iM3051a2;
                        if (iArr2[0] >= i11) {
                            byte[] bArrM2968a = C1100s.m2968a(iArr2[0] + i10);
                            if (bArrM2968a.length == iM3051a2) {
                                for (int i18 = 0; i18 < iM3051a2; i18++) {
                                    this.f3385a[(iM3050a - iM3051a2) + i18] = bArrM2968a[i18];
                                }
                            } else {
                                this.f3387c.add(new C1150f(this, iM3050a - iM3051a2, iM3051a2, bArrM2968a));
                            }
                        }
                        m3054a(iArr2[0] + 8, i11, i10);
                    }
                }
            }
            C1145a c1145aM3032a = C1145a.m3032a(listM3044f, 8198);
            if (c1145aM3032a != null) {
                int i19 = c1145aM3032a.f3369c;
                for (int i20 = 0; i20 < c1145aM3032a.f3368b; i20++) {
                    m3054a(i19, i11, i10);
                    int i21 = i19 + 4;
                    int iM3033a2 = C1146b.m3033a(this.f3385a, i21);
                    int i22 = i21 + 4;
                    int iM3033a3 = C1146b.m3033a(this.f3385a, i22);
                    int i23 = i22 + 4;
                    int iM3033a4 = C1146b.m3033a(this.f3385a, i23);
                    i19 = i23 + 4;
                    for (int i24 = 0; i24 < iM3033a2; i24++) {
                        int i25 = i19 + 4;
                        m3054a(i25, i11, i10);
                        i19 = i25 + 4;
                    }
                    for (int i26 = 0; i26 < iM3033a3; i26++) {
                        int i27 = i19 + 4;
                        m3054a(i27, i11, i10);
                        i19 = i27 + 4;
                    }
                    for (int i28 = 0; i28 < iM3033a4; i28++) {
                        int i29 = i19 + 4;
                        m3054a(i29, i11, i10);
                        i19 = i29 + 4;
                    }
                }
            }
            C1145a c1145aM3032a2 = C1145a.m3032a(listM3044f, FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            if (c1145aM3032a2 != null) {
                int i30 = c1145aM3032a2.f3369c;
                for (int i31 = 0; i31 < c1145aM3032a2.f3368b; i31++) {
                    int iM3033a5 = C1146b.m3033a(this.f3385a, i30);
                    i30 += 4;
                    for (int i32 = 0; i32 < iM3033a5; i32++) {
                        m3054a(i30, i11, i10);
                        i30 += 4;
                    }
                }
            }
            C1145a c1145aM3032a3 = C1145a.m3032a(listM3044f, InputDeviceCompat.SOURCE_TOUCHSCREEN);
            if (c1145aM3032a3 != null) {
                int i33 = c1145aM3032a3.f3369c;
                for (int i34 = 0; i34 < c1145aM3032a3.f3368b; i34++) {
                    int iM3033a6 = C1146b.m3033a(this.f3385a, i33);
                    i33 += 4;
                    for (int i35 = 0; i35 < iM3033a6; i35++) {
                        m3054a(i33, i11, i10);
                        i33 += 4;
                    }
                }
            }
            for (int i36 = 0; i36 < listM3044f.size(); i36++) {
                C1145a c1145a2 = (C1145a) listM3044f.get(i36);
                if (c1145a2.f3369c >= i11) {
                    c1145a2.f3369c += i10;
                    int iM3045g = this.f3386b.m3045g() + 4 + (i36 * 12);
                    byte[] bArr2 = this.f3385a;
                    short s = c1145a2.f3367a;
                    bArr2[iM3045g] = (byte) s;
                    bArr2[iM3045g + 1] = (byte) (s >> 8);
                    C1146b.m3034a(c1145a2.f3368b, bArr2, iM3045g + 4);
                    C1146b.m3034a(c1145a2.f3369c, bArr2, iM3045g + 8);
                }
            }
            this.f3386b.m3039a(i11, i10);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C1152h(this.f3385a, 0, i3));
            arrayList.add(new C1152h(bArr, 0, i4));
            if (i3 + i2 < this.f3385a.length) {
                arrayList.add(new C1152h(this.f3385a, i3 + i2, (this.f3385a.length - i3) - i2));
            }
            m3055a(arrayList);
            m3060b(arrayList);
            m3056a(arrayList, str);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m3058a(String str, List list, String str2, String str3) {
        String strM3052a = m3052a(str2);
        String str4 = "[" + strM3052a;
        String strM3052a2 = m3052a(str3);
        String str5 = "[" + strM3052a2;
        String str6 = "content://" + str2;
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        while (true) {
            int i8 = i;
            if (i8 >= list.size()) {
                break;
            }
            C1151g c1151g = (C1151g) list.get(i8);
            if (c1151g.f3391d != null) {
                if (c1151g.f3391d.startsWith(strM3052a)) {
                    c1151g.m3067a(strM3052a2 + c1151g.f3391d.substring(strM3052a.length()));
                    if (i2 == -1) {
                        i2 = i8;
                    }
                    i3 = i8 + 1;
                } else if (c1151g.f3391d.startsWith(str2)) {
                    c1151g.m3067a(str3 + c1151g.f3391d.substring(str2.length()));
                    if (i4 == -1) {
                        i4 = i8;
                    }
                    i5 = i8 + 1;
                } else if (c1151g.f3391d.startsWith(str4)) {
                    c1151g.m3067a(str5 + c1151g.f3391d.substring(str4.length()));
                    if (i2 == -1) {
                        i6 = i8;
                    }
                    i7 = i8 + 1;
                } else if (c1151g.f3391d.startsWith(str6)) {
                    c1151g.m3067a("content://" + str3 + c1151g.f3391d.substring(str6.length()));
                }
            }
            i = i8 + 1;
        }
        if (i2 == -1) {
            return false;
        }
        if (m3059a(list, i2, i3)) {
            Log.e("DEBUG", "The string order is changed! (as the class name change)");
        }
        if (i4 != -1 && m3059a(list, i4, i5)) {
            Log.e("DEBUG", "The string order is changed! (as the pkg name change)");
        }
        if (i6 != -1 && m3059a(list, i6, i7)) {
            Log.e("DEBUG", "The string order is changed! (as the array class name change)");
        }
        return m3057a(str, list);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m3059a(List list, int i, int i2) {
        int size = list.size();
        C1151g c1151g = i > 0 ? (C1151g) list.get(i - 1) : null;
        C1151g c1151g2 = i2 < size ? (C1151g) list.get(i2) : null;
        return (c1151g != null && ((C1151g) list.get(i)).m3066a(c1151g) < 0) || (c1151g2 != null && ((C1151g) list.get(i2 + (-1))).m3066a(c1151g2) > 0);
    }

    /* JADX INFO: renamed from: b */
    private static void m3060b(List list) {
        byte[] bArr = new byte[4];
        Adler32 adler32 = new Adler32();
        C1152h c1152h = (C1152h) list.get(0);
        adler32.update(c1152h.f3392a, 12, c1152h.f3394c - 12);
        for (int i = 1; i < list.size(); i++) {
            C1152h c1152h2 = (C1152h) list.get(i);
            adler32.update(c1152h2.f3392a, c1152h2.f3393b, c1152h2.f3394c);
        }
        long value = adler32.getValue();
        bArr[0] = (byte) (value & 255);
        bArr[1] = (byte) ((value >> 8) & 255);
        bArr[2] = (byte) ((value >> 16) & 255);
        bArr[3] = (byte) ((value >> 24) & 255);
        System.arraycopy(bArr, 0, c1152h.f3392a, 8, 4);
    }

    /* JADX INFO: renamed from: a */
    public final void m3061a(Map map, String str) throws Exception {
        int length = 0;
        byte[] bArr = new byte[256];
        for (int i = 0; i < 256; i++) {
            bArr[i] = 0;
        }
        Iterator it = map.entrySet().iterator();
        while (true) {
            byte[] bArr2 = bArr;
            int i2 = length;
            if (!it.hasNext()) {
                C1146b c1146b = new C1146b(this.f3385a);
                int i3 = 0;
                while (i3 < c1146b.m3040b()) {
                    int iM3038a = c1146b.m3038a(i3);
                    C1148d c1148d = new C1148d(this.f3385a, (this.f3385a[iM3038a + 3] << 24) | (this.f3385a[iM3038a] & 255) | ((this.f3385a[iM3038a + 1] & 255) << 8) | ((this.f3385a[iM3038a + 2] & 255) << 16));
                    c1148d.m3046a();
                    if (this.f3385a[c1148d.m3048b()] == 76) {
                        break;
                    } else {
                        i3++;
                    }
                }
                String strM3053a = "";
                while (true) {
                    int i4 = i3;
                    String str2 = strM3053a;
                    if (i4 >= c1146b.m3040b()) {
                        break;
                    }
                    int iM3038a2 = c1146b.m3038a(i4);
                    C1148d c1148d2 = new C1148d(this.f3385a, (this.f3385a[iM3038a2 + 3] << 24) | (this.f3385a[iM3038a2] & 255) | ((this.f3385a[iM3038a2 + 1] & 255) << 8) | ((this.f3385a[iM3038a2 + 2] & 255) << 16));
                    int iM3046a = c1148d2.m3046a();
                    if (this.f3385a[c1148d2.m3048b()] != 76) {
                        break;
                    }
                    int iM3048b = c1148d2.m3048b();
                    String strM3047a = c1148d2.m3047a(iM3046a);
                    strM3053a = m3053a(strM3047a, map);
                    if (strM3053a != null) {
                        System.arraycopy(strM3053a.getBytes(), 0, this.f3385a, iM3048b, strM3053a.length());
                    }
                    if (strM3053a == null) {
                        strM3053a = strM3047a;
                    }
                    if (strM3053a.compareTo(str2) <= 0) {
                        Log.e("ERROR", "Order break: " + strM3053a + ", " + str2);
                    }
                    i3 = i4 + 1;
                }
                byte[] bArr3 = this.f3385a;
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                    messageDigest.update(bArr3, 32, bArr3.length - 32);
                    byte[] bArrDigest = messageDigest.digest();
                    System.arraycopy(bArrDigest, 0, bArr3, 12, bArrDigest.length);
                } catch (NoSuchAlgorithmException e) {
                    e.printStackTrace();
                }
                byte[] bArr4 = this.f3385a;
                Adler32 adler32 = new Adler32();
                adler32.update(bArr4, 12, bArr4.length - 12);
                long value = adler32.getValue();
                System.arraycopy(new byte[]{(byte) (255 & value), (byte) ((value >> 8) & 255), (byte) ((value >> 16) & 255), (byte) ((value >> 24) & 255)}, 0, bArr4, 8, 4);
                byte[] bArr5 = this.f3385a;
                FileOutputStream fileOutputStream = new FileOutputStream(str);
                fileOutputStream.write(bArr5);
                fileOutputStream.close();
                return;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str3 = (String) entry.getKey();
            if (str3.length() != ((String) entry.getValue()).length()) {
                throw new Exception("Different class name length not supported.");
            }
            if (str3.length() >= bArr2.length) {
                bArr = new byte[str3.length() + 1];
                System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
            } else {
                bArr = bArr2;
            }
            bArr[str3.length()] = 1;
            length = str3.length() > i2 ? str3.length() : i2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m3062a(String str, String str2, String str3) throws C1153i {
        C1151g c1151g;
        int iM3040b = this.f3386b.m3040b();
        int[] iArr = new int[iM3040b];
        ArrayList arrayList = new ArrayList(iM3040b);
        for (int i = 0; i < iM3040b; i++) {
            int iM3038a = this.f3386b.m3038a(i);
            iArr[i] = (this.f3385a[iM3038a + 3] << 24) | (this.f3385a[iM3038a] & 255) | ((this.f3385a[iM3038a + 1] & 255) << 8) | ((this.f3385a[iM3038a + 2] & 255) << 16);
        }
        byte bCharAt = str.charAt(0);
        C1148d c1148d = new C1148d(this.f3385a, iArr[0]);
        for (int i2 = 0; i2 < iM3040b; i2++) {
            c1148d.m3049b(iArr[i2]);
            int iM3046a = c1148d.m3046a();
            int iM3048b = c1148d.m3048b();
            String strM3047a = (this.f3385a[iM3048b] == 76 || this.f3385a[iM3048b] == 91 || this.f3385a[iM3048b] == 99 || this.f3385a[iM3048b] == bCharAt) ? c1148d.m3047a(iM3046a) : null;
            if (i2 + 1 >= iM3040b || iArr[i2 + 1] <= iArr[i2]) {
                if (strM3047a == null) {
                    strM3047a = c1148d.m3047a(iM3046a);
                }
                c1151g = new C1151g(i2, strM3047a, this.f3385a, iArr[i2], new C1151g(i2, strM3047a).m3065a());
            } else {
                c1151g = new C1151g(i2, strM3047a, this.f3385a, iArr[i2], iArr[i2 + 1] - iArr[i2]);
            }
            arrayList.add(c1151g);
        }
        return m3058a(str3, arrayList, str, str2);
    }
}
