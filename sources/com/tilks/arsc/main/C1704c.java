package com.tilks.arsc.main;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p019b.p022fn.p040c.p041a.p042d.C0458a;
import p019b.p022fn.p040c.p041a.p042d.C0459b;
import p019b.p022fn.p040c.p041a.p045f.C0475a;

/* JADX INFO: renamed from: com.tilks.arsc.main.c */
/* JADX INFO: loaded from: classes.dex */
class C1704c {

    /* JADX INFO: renamed from: a */
    private C0459b f5104a;

    /* JADX INFO: renamed from: b */
    private C0459b f5105b;

    /* JADX INFO: renamed from: c */
    private ArrayList<String> f5106c;

    /* JADX INFO: renamed from: d */
    private ArrayList<String> f5107d;

    /* JADX INFO: renamed from: e */
    private ArrayList<String> f5108e;

    /* JADX INFO: renamed from: f */
    private int f5109f;

    /* JADX INFO: renamed from: g */
    private HashMap<String, Integer> f5110g;

    C1704c(C0459b c0459b, C0459b c0459b2, ArrayList<String> arrayList, ArrayList<String> arrayList2, HashMap<String, Integer> map) {
        this.f5104a = c0459b;
        this.f5105b = c0459b2;
        this.f5106c = arrayList;
        this.f5107d = arrayList2;
        this.f5110g = map;
    }

    /* JADX INFO: renamed from: a */
    private int m4103a(boolean[] zArr) {
        this.f5108e = new ArrayList<>();
        int i = 0;
        for (int i2 = 0; i2 < this.f5105b.f587a.f592b; i2++) {
            String str = this.f5107d.get(i2);
            if (this.f5110g.containsKey(str)) {
                zArr[i2] = false;
            } else {
                this.f5108e.add(i, str);
                i++;
                zArr[i2] = true;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    private int[] m4104a(int[] iArr, byte[][] bArr) {
        int i;
        byte[][] bArr2;
        int[] iArr2 = iArr;
        C0459b.a aVar = this.f5104a.f587a;
        int i2 = aVar.f593c;
        int i3 = aVar.f592b;
        boolean zM550a = aVar.m550a();
        int i4 = i3 * 4;
        int i5 = i2 * 4;
        int i6 = i4 + i5;
        C0459b c0459b = this.f5104a;
        int i7 = c0459b.f588b[i3 - 1];
        byte[] bArr3 = new byte[4];
        int i8 = i6 + i7;
        int i9 = 0;
        System.arraycopy(c0459b.f591e, i8, bArr3, 0, 4);
        int i10 = zM550a ? 1 : 2;
        int[] iArrM557b = zM550a ? C0475a.m557b(bArr3, 0) : C0475a.m556a(bArr3, 0);
        int i11 = i7 + iArrM557b[0] + iArrM557b[1] + i10;
        if (i2 > 0) {
            C0459b.a aVar2 = this.f5104a.f587a;
            i = aVar2.f600a.f586c - aVar2.f596f;
        } else {
            i = 0;
        }
        int length = iArr2.length * 4;
        int i12 = i8 + (i11 - i7) + i + length + this.f5109f;
        int i13 = i12 % 4;
        int i14 = i13 != 0 ? 4 - i13 : 0;
        byte[] bArr4 = new byte[i12 + i14];
        System.arraycopy(this.f5104a.f591e, 0, bArr4, 0, i4);
        int length2 = iArr2.length;
        int i15 = i4;
        while (i9 < length2) {
            int i16 = i15 + 1;
            int i17 = length2;
            int i18 = i11 + iArr2[i9];
            int i19 = i12;
            bArr4[i15] = (byte) i18;
            int i20 = i16 + 1;
            bArr4[i16] = (byte) (i18 >> 8);
            int i21 = i20 + 1;
            bArr4[i20] = (byte) (i18 >> 16);
            i15 = i21 + 1;
            bArr4[i21] = (byte) (i18 >> 24);
            i9++;
            iArr2 = iArr;
            i12 = i19;
            length2 = i17;
        }
        int i22 = i12;
        if (i2 > 0) {
            System.arraycopy(this.f5104a.f591e, i4, bArr4, i15, i5);
            i15 += i5;
            i4 = i6;
        }
        System.arraycopy(this.f5104a.f591e, i4, bArr4, i15, i11);
        int length3 = i15 + i11;
        for (byte[] bArr5 : bArr) {
            System.arraycopy(bArr5, 0, bArr4, length3, bArr5.length);
            length3 += bArr5.length;
        }
        if (i2 > 0 && i14 > 0) {
            int i23 = 0;
            while (i23 < i14) {
                bArr4[length3] = 0;
                i23++;
                length3++;
            }
        }
        if (i2 > 0) {
            byte[] bArr6 = this.f5104a.f591e;
            System.arraycopy(bArr6, bArr6.length - i, bArr4, length3, i);
            C0459b.a aVar3 = this.f5104a.f587a;
            aVar3.f596f = aVar3.f600a.f585b + i6 + length + i11 + this.f5109f + i14;
        }
        C0459b c0459b2 = this.f5104a;
        C0459b.a aVar4 = c0459b2.f587a;
        int i24 = aVar4.f592b;
        aVar4.f592b = i24 + iArr.length;
        aVar4.f595e += iArr.length * 4;
        C0458a c0458a = aVar4.f600a;
        int i25 = c0458a.f585b + i22 + i14;
        c0458a.f586c = i25;
        int[] iArr3 = {i24, i25};
        c0459b2.f591e = bArr4;
        int[] iArr4 = c0459b2.f588b;
        int[] iArr5 = new int[iArr4.length + iArr.length];
        System.arraycopy(iArr4, 0, iArr5, 0, iArr4.length);
        int length4 = this.f5104a.f588b.length;
        for (int i26 : iArr) {
            iArr5[length4] = i26 + i11;
            length4++;
        }
        C0459b c0459b3 = this.f5104a;
        c0459b3.f588b = iArr5;
        byte[][] bArr7 = new byte[c0459b3.f590d.length + iArr.length][];
        int i27 = 0;
        while (true) {
            bArr2 = this.f5104a.f590d;
            if (i27 >= bArr2.length) {
                break;
            }
            byte[] bArr8 = new byte[bArr2[i27].length];
            System.arraycopy(bArr2[i27], 0, bArr8, 0, bArr2[i27].length);
            bArr7[i27] = bArr8;
            i27++;
        }
        int length5 = bArr2.length;
        Iterator<String> it = this.f5108e.iterator();
        while (it.hasNext()) {
            bArr7[length5] = it.next().getBytes(zM550a ? StandardCharsets.UTF_8 : StandardCharsets.UTF_16LE);
            length5++;
        }
        this.f5104a.f590d = bArr7;
        return iArr3;
    }

    /* JADX INFO: renamed from: a */
    private byte[][] m4105a(int i, int[] iArr, boolean[] zArr) {
        int i2;
        C0459b.a aVar = this.f5105b.f587a;
        int i3 = aVar.f592b;
        int i4 = aVar.f593c;
        boolean zM550a = aVar.m550a();
        int i5 = (i3 * 4) + (i4 * 4);
        byte[][] bArr = new byte[i][];
        this.f5109f = 0;
        iArr[0] = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < zArr.length; i7++) {
            if (zArr[i7]) {
                C0459b c0459b = this.f5105b;
                int[] iArr2 = c0459b.f588b;
                int i8 = iArr2[i7] + i5;
                int i9 = i7 + 1;
                if (i9 == zArr.length) {
                    byte[] bArr2 = new byte[4];
                    System.arraycopy(c0459b.f591e, i8, bArr2, 0, 4);
                    int i10 = zM550a ? 1 : 2;
                    int[] iArrM557b = zM550a ? C0475a.m557b(bArr2, 0) : C0475a.m556a(bArr2, 0);
                    i2 = (((iArrM557b[0] + i8) + iArrM557b[1]) + i10) - i8;
                } else {
                    i2 = (iArr2[i9] + i5) - i8;
                }
                byte[] bArr3 = new byte[i2];
                System.arraycopy(this.f5105b.f591e, i8, bArr3, 0, i2);
                bArr[i6] = bArr3;
                int i11 = this.f5109f + i2;
                this.f5109f = i11;
                i6++;
                if (i6 < iArr.length) {
                    iArr[i6] = i11;
                }
            }
        }
        return bArr;
    }

    /* JADX INFO: renamed from: a */
    int[] m4106a() {
        boolean[] zArr = new boolean[this.f5105b.f587a.f592b];
        int iM4103a = m4103a(zArr);
        if (iM4103a == 0) {
            return new int[]{0, 0};
        }
        int size = this.f5106c.size();
        for (String str : this.f5108e) {
            this.f5106c.add(size, str);
            this.f5110g.put(str, Integer.valueOf(size));
            size++;
        }
        int[] iArr = new int[iM4103a];
        return m4104a(iArr, m4105a(iM4103a, iArr, zArr));
    }
}
