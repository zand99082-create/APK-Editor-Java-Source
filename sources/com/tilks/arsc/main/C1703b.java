package com.tilks.arsc.main;

import android.app.PendingIntent;
import android.content.Intent;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import p019b.p022fn.p040c.p041a.p042d.C0458a;
import p019b.p022fn.p040c.p041a.p042d.C0459b;
import p019b.p022fn.p040c.p041a.p042d.C0460c;
import p019b.p022fn.p040c.p041a.p042d.C0461d;
import p019b.p022fn.p040c.p041a.p042d.C0462e;
import p019b.p022fn.p040c.p041a.p042d.C0465h;
import p019b.p022fn.p040c.p041a.p042d.p043k.C0468a;
import p019b.p022fn.p040c.p041a.p042d.p043k.C0469b;
import p019b.p022fn.p040c.p041a.p042d.p043k.C0470c;
import p019b.p022fn.p040c.p041a.p042d.p043k.C0471d;
import p019b.p022fn.p040c.p041a.p042d.p043k.C0472e;
import p019b.p022fn.p040c.p041a.p045f.C0475a;

/* JADX INFO: renamed from: com.tilks.arsc.main.b */
/* JADX INFO: loaded from: classes.dex */
class C1703b {

    /* JADX INFO: renamed from: l */
    private static final Locale f5092l = Locale.US;

    /* JADX INFO: renamed from: a */
    private C0460c f5093a;

    /* JADX INFO: renamed from: b */
    private C0460c f5094b;

    /* JADX INFO: renamed from: j */
    private PendingIntent f5102j;

    /* JADX INFO: renamed from: k */
    private MergeService f5103k;

    /* JADX INFO: renamed from: i */
    private byte[] f5101i = {0, 0};

    /* JADX INFO: renamed from: d */
    private ArrayList<String> f5096d = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    private ArrayList<String> f5095c = new ArrayList<>();

    /* JADX INFO: renamed from: f */
    private ArrayList<String> f5098f = new ArrayList<>();

    /* JADX INFO: renamed from: e */
    private ArrayList<String> f5097e = new ArrayList<>();

    /* JADX INFO: renamed from: h */
    private ArrayList<String> f5100h = new ArrayList<>();

    /* JADX INFO: renamed from: g */
    private ArrayList<String> f5099g = new ArrayList<>();

    C1703b(C0460c c0460c, C0460c c0460c2, PendingIntent pendingIntent, MergeService mergeService) {
        this.f5093a = c0460c;
        this.f5094b = c0460c2;
        this.f5102j = pendingIntent;
        this.f5103k = mergeService;
    }

    /* JADX INFO: renamed from: a */
    private byte m4090a(C0460c c0460c, String str) {
        int length = c0460c.f599c.get(0).f611b.f590d.length;
        boolean zM550a = c0460c.f599c.get(0).f611b.f587a.m550a();
        int i = 0;
        while (i < length) {
            byte[][] bArr = c0460c.f599c.get(0).f611b.f590d;
            String str2 = zM550a ? new String(bArr[i], StandardCharsets.UTF_8) : new String(bArr[i], StandardCharsets.UTF_16LE);
            i++;
            if (str2.equals(str)) {
                return (byte) i;
            }
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: a */
    private int m4091a(String str, C0471d c0471d, List<C0468a> list) {
        int size = c0471d.f642i.size();
        for (int i = 0; i < size; i++) {
            C0468a c0468a = c0471d.f642i.get(i);
            if ((c0468a.f627b & 1) == 1) {
                String str2 = this.f5097e.get(c0468a.f628c);
                if (str2.equals(str)) {
                    c0468a.f628c = this.f5095c.indexOf(str2);
                    List<C0469b> list2 = ((C0470c) c0468a).f634g;
                    for (C0469b c0469b : list2) {
                        byte b2 = c0469b.f631b.f645c;
                        if (b2 == 3 || b2 == 1) {
                            String str3 = this.f5098f.get(c0469b.f631b.f646d);
                            c0469b.f631b.f646d = this.f5096d.indexOf(str3);
                        }
                    }
                    list.add(c0468a);
                    return list2.size();
                }
            } else {
                byte b3 = c0468a.f629d.f645c;
                if (b3 == 3 || b3 == 1) {
                    String str4 = this.f5097e.get(c0468a.f628c);
                    if (str4.equals(str)) {
                        C0468a c0468a2 = new C0468a(c0468a);
                        c0468a2.f628c = this.f5095c.indexOf(str4);
                        C0472e c0472e = c0468a.f629d;
                        if (c0472e.f645c != 1) {
                            String str5 = this.f5098f.get(c0472e.f646d);
                            c0468a2.f629d.f646d = this.f5096d.indexOf(str5);
                        }
                        list.add(c0468a2);
                        return 1;
                    }
                }
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    private C0471d m4092a(C0460c c0460c, byte b2, byte[] bArr) throws PendingIntent.CanceledException {
        for (C0461d c0461d : c0460c.f599c.get(0).f613d) {
            if (c0461d.f600a.f584a == 513) {
                C0471d c0471d = (C0471d) c0461d;
                if (c0471d.f638e != 0 && c0471d.f635b == b2 && Arrays.equals(c0471d.f640g.f602b, bArr) && Arrays.equals(c0471d.f640g.f603c, this.f5101i)) {
                    if (bArr[0] != 0) {
                        this.f5102j.send(this.f5103k, 200, new Intent().putExtra("result", String.format("  --> Lng code %c%c%n", Byte.valueOf(c0471d.f640g.f602b[0]), Byte.valueOf(c0471d.f640g.f602b[1]))));
                    }
                    return c0471d;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private C0471d m4093a(String str, byte[] bArr, byte[] bArr2) throws PendingIntent.CanceledException {
        bArr2[0] = m4090a(this.f5093a, str);
        bArr2[1] = m4090a(this.f5094b, str);
        if (bArr2[0] == 0 || bArr2[1] == 0) {
            return null;
        }
        this.f5102j.send(this.f5103k, 200, new Intent().putExtra("result", String.format("%s check%n", str)));
        C0471d c0471dM4092a = m4092a(this.f5094b, bArr2[1], bArr);
        if (c0471dM4092a != null) {
            m4097a(c0471dM4092a);
            return c0471dM4092a;
        }
        this.f5102j.send(this.f5103k, 200, new Intent().putExtra("result", String.format("%s null%n", str)));
        return c0471dM4092a;
    }

    /* JADX INFO: renamed from: a */
    private C0471d m4094a(byte[] bArr, HashMap<Integer, String> map) throws PendingIntent.CanceledException {
        C0471d c0471dM4092a = m4092a(this.f5093a, bArr[0], new byte[]{0, 0});
        if (c0471dM4092a == null) {
            return null;
        }
        m4099a(c0471dM4092a, map);
        return c0471dM4092a;
    }

    /* JADX INFO: renamed from: a */
    private void m4095a() {
        for (String str : this.f5100h) {
            if (this.f5096d.indexOf(str) == -1) {
                C0459b c0459b = this.f5093a.f598b;
                int i = c0459b.f587a.f600a.f586c;
                int[] iArrM4101a = m4101a(str, c0459b);
                this.f5093a.f597a.f600a.f586c += iArrM4101a[1] - i;
                this.f5096d.add(iArrM4101a[0], str);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m4096a(C0460c c0460c, C0471d c0471d, byte b2, byte[] bArr) throws PendingIntent.CanceledException {
        C0458a c0458a;
        int i;
        int i2;
        C0465h c0465h = c0460c.f599c.get(0);
        List<C0461d> list = c0465h.f613d;
        this.f5102j.send(this.f5103k, 200, new Intent().putExtra("result", String.format("[*] addChunkToBase%n", new Object[0])));
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (C0461d c0461d : list) {
            if (c0461d.f600a.f584a == 513) {
                C0471d c0471d2 = (C0471d) c0461d;
                if (c0471d2.f635b == b2) {
                    if (Arrays.equals(c0471d2.f640g.f602b, bArr) && Arrays.equals(c0471d2.f640g.f603c, this.f5101i)) {
                        this.f5102j.send(this.f5103k, 200, new Intent().putExtra("result", String.format("[*] Language chunk exist in base.apk, replaced it%n", new Object[0])));
                        i5 = c0471d2.f600a.f586c;
                        i3 = i6;
                        i4 = i3;
                    } else {
                        i4 = i6;
                    }
                }
                i6++;
            }
            i6++;
        }
        if (i3 <= 0) {
            if (i4 > 0) {
                int i7 = i4 + 1;
                this.f5102j.send(this.f5103k, 200, new Intent().putExtra("result", String.format(f5092l, "[+] insert chunk index %d%n", Integer.valueOf(i7))));
                list.add(i7, c0471d);
                C0458a c0458a2 = c0465h.f610a.f600a;
                int i8 = c0458a2.f586c;
                C0458a c0458a3 = c0471d.f600a;
                c0458a2.f586c = i8 + c0458a3.f586c;
                c0458a = c0460c.f597a.f600a;
                i = c0458a.f586c;
                i2 = c0458a3.f586c;
            }
            c0460c.f599c.set(0, c0465h);
        }
        this.f5102j.send(this.f5103k, 200, new Intent().putExtra("result", String.format(f5092l, "[+] replace chunk index %d%n", Integer.valueOf(i3))));
        list.set(i3, c0471d);
        C0458a c0458a4 = c0465h.f610a.f600a;
        int i9 = c0458a4.f586c;
        C0458a c0458a5 = c0471d.f600a;
        c0458a4.f586c = i9 + (c0458a5.f586c - i5);
        c0458a = c0460c.f597a.f600a;
        i = c0458a.f586c;
        i2 = c0458a5.f586c - i5;
        c0458a.f586c = i + i2;
        c0460c.f599c.set(0, c0465h);
    }

    /* JADX INFO: renamed from: a */
    private void m4097a(C0471d c0471d) {
        int size = this.f5099g.size();
        int size2 = this.f5100h.size();
        int size3 = c0471d.f642i.size();
        for (int i = 0; i < size3; i++) {
            C0468a c0468a = c0471d.f642i.get(i);
            if ((c0468a.f627b & 1) == 1) {
                C0470c c0470c = (C0470c) c0468a;
                String str = this.f5097e.get(c0468a.f628c);
                if (!this.f5095c.contains(str)) {
                    this.f5099g.add(size, str);
                    size++;
                }
                for (C0469b c0469b : c0470c.f634g) {
                    byte b2 = c0469b.f631b.f645c;
                    if (b2 == 3 || b2 == 1) {
                        String str2 = this.f5098f.get(c0469b.f631b.f646d);
                        if (!this.f5096d.contains(str2)) {
                            this.f5100h.add(size2, str2);
                            size2++;
                        }
                    }
                }
            } else {
                byte b3 = c0468a.f629d.f645c;
                if (b3 == 3 || b3 == 1) {
                    String str3 = this.f5097e.get(c0468a.f628c);
                    if (!this.f5095c.contains(str3)) {
                        this.f5099g.add(size, str3);
                        size++;
                    }
                    C0472e c0472e = c0468a.f629d;
                    if (c0472e.f645c != 1) {
                        String str4 = this.f5098f.get(c0472e.f646d);
                        if (!this.f5096d.contains(str4)) {
                            this.f5100h.add(size2, str4);
                            size2++;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m4098a(C0471d c0471d, C0471d c0471d2, HashMap<Integer, String> map, boolean z, byte b2, byte[] bArr) throws PendingIntent.CanceledException {
        int i;
        int i2 = c0471d.f638e;
        int i3 = c0471d2.f638e;
        int[] iArr = new int[i2];
        if (c0471d2.f640g.f601a != c0471d.f640g.f601a) {
            this.f5102j.send(this.f5103k, 200, new Intent().putExtra("result", String.format(f5092l, "Config size difference! split resTable size --> %d & base resTable size --> %d%n", Integer.valueOf(c0471d2.f640g.f601a), Integer.valueOf(c0471d.f640g.f601a))));
            byte[] bArr2 = new byte[c0471d.f640g.f601a];
            C0462e c0462e = new C0462e();
            C0462e c0462e2 = c0471d2.f640g;
            int i4 = c0462e2.f601a;
            int i5 = c0471d.f640g.f601a;
            byte[] bArr3 = c0462e2.f604d;
            if (i4 < i5) {
                System.arraycopy(bArr3, 0, bArr2, 0, i4);
            } else {
                System.arraycopy(bArr3, 0, bArr2, 0, i5);
            }
            c0462e.f604d = bArr2;
            C0462e c0462e3 = c0471d.f640g;
            int i6 = c0462e3.f601a;
            bArr2[0] = (byte) i6;
            bArr2[1] = (byte) (i6 >>> 8);
            bArr2[2] = (byte) (i6 >>> 16);
            bArr2[3] = (byte) (i6 >>> 24);
            c0462e.f601a = i6;
            i = c0462e3.f601a - c0471d2.f640g.f601a;
            c0471d2.f640g = c0462e;
        } else {
            i = 0;
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i2 > i3 ? i2 - i3 : 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < i2; i11++) {
            int iM4091a = m4091a(map.get(Integer.valueOf(i11)), c0471d2, arrayList);
            if (iM4091a <= 0) {
                iArr[i11] = -1;
            } else if (z) {
                iArr[i11] = i10;
                i10 += (iM4091a * 12) + 16;
            } else {
                iArr[i11] = i9 * 16;
                i9++;
                i8 += 16;
            }
        }
        c0471d2.f635b = b2;
        c0471d2.f641h = iArr;
        c0471d2.f638e = i2;
        C0458a c0458a = c0471d2.f600a;
        c0458a.f585b = (short) (c0458a.f585b + i);
        c0471d2.f642i = arrayList;
        if (z) {
            int i12 = (i7 * 4) + i;
            c0471d2.f639f += i12;
            c0458a.f586c += i12;
        } else {
            int i13 = c0471d2.f640g.f601a + 20 + (i2 * 4);
            c0471d2.f639f = i13;
            c0458a.f586c = i8 + i13;
        }
        m4096a(this.f5093a, c0471d2, b2, bArr);
    }

    /* JADX INFO: renamed from: a */
    private void m4099a(C0471d c0471d, HashMap<Integer, String> map) {
        byte b2;
        int size = c0471d.f642i.size();
        for (int i = 0; i < size; i++) {
            C0468a c0468a = c0471d.f642i.get(i);
            if ((c0468a.f627b & 1) == 1 || (b2 = c0468a.f629d.f645c) == 3 || b2 == 1) {
                map.put(Integer.valueOf(i), this.f5095c.get(c0468a.f628c));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m4100a(List<String> list, C0459b c0459b) {
        C0459b.a aVar = c0459b.f587a;
        int i = aVar.f592b;
        boolean zM550a = aVar.m550a();
        for (int i2 = 0; i2 < i; i2++) {
            byte[][] bArr = c0459b.f590d;
            list.add(i2, zM550a ? new String(bArr[i2], StandardCharsets.UTF_8) : new String(bArr[i2], StandardCharsets.UTF_16LE));
        }
    }

    /* JADX INFO: renamed from: a */
    private int[] m4101a(String str, C0459b c0459b) {
        byte[] bytes;
        byte[] bArr;
        int i;
        byte[][] bArr2;
        int i2;
        int length = str.length();
        C0459b.a aVar = c0459b.f587a;
        int i3 = aVar.f592b;
        int i4 = aVar.f593c;
        boolean zM550a = aVar.m550a();
        if (zM550a) {
            bytes = str.getBytes(StandardCharsets.UTF_8);
            int length2 = bytes.length;
            byte[] bArrM555a = C0475a.m555a(length, length2);
            bArr = new byte[length2 + bArrM555a.length + 1];
            int i5 = 0;
            for (int i6 = 0; i6 < bArrM555a.length; i6++) {
                bArr[i6] = bArrM555a[i6];
                i5++;
            }
            System.arraycopy(bytes, 0, bArr, i5, bytes.length);
        } else {
            bytes = str.getBytes(StandardCharsets.UTF_16LE);
            int i7 = length * 2;
            byte[] bArr3 = new byte[i7 + 4];
            bArr3[0] = (byte) length;
            bArr3[1] = (byte) (length >> 8);
            System.arraycopy(bytes, 0, bArr3, 2, i7);
            bArr = bArr3;
        }
        int i8 = i3 * 4;
        int i9 = i4 * 4;
        int i10 = i8 + i9;
        int i11 = c0459b.f588b[i3 - 1];
        byte[] bArr4 = new byte[4];
        int i12 = i10 + i11;
        System.arraycopy(c0459b.f591e, i12, bArr4, 0, 4);
        int i13 = zM550a ? 1 : 2;
        int[] iArrM557b = zM550a ? C0475a.m557b(bArr4, 0) : C0475a.m556a(bArr4, 0);
        int i14 = iArrM557b[0] + i11 + iArrM557b[1] + i13;
        if (i4 > 0) {
            C0459b.a aVar2 = c0459b.f587a;
            i = aVar2.f600a.f586c - aVar2.f596f;
        } else {
            i = 0;
        }
        int length3 = i12 + (i14 - i11) + i + 4 + bArr.length;
        int i15 = length3 % 4;
        int i16 = i15 != 0 ? 4 - i15 : 0;
        byte[] bArr5 = new byte[length3 + i16];
        System.arraycopy(c0459b.f591e, 0, bArr5, 0, i8);
        int i17 = i8 + 1;
        bArr5[i8] = (byte) i14;
        int i18 = i17 + 1;
        bArr5[i17] = (byte) (i14 >> 8);
        int i19 = i18 + 1;
        bArr5[i18] = (byte) (i14 >> 16);
        int i20 = i19 + 1;
        bArr5[i19] = (byte) (i14 >> 24);
        int[] iArr = c0459b.f588b;
        int[] iArr2 = new int[iArr.length + 1];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        iArr2[c0459b.f588b.length] = i14;
        if (i4 > 0) {
            System.arraycopy(c0459b.f591e, i8, bArr5, i20, i9);
            i20 += i9;
            i8 = i10;
        }
        System.arraycopy(c0459b.f591e, i8, bArr5, i20, i14);
        int i21 = i20 + i14;
        System.arraycopy(bArr, 0, bArr5, i21, bArr.length);
        int length4 = i21 + bArr.length;
        byte[][] bArr6 = new byte[c0459b.f590d.length + 1][];
        int i22 = 0;
        while (true) {
            bArr2 = c0459b.f590d;
            if (i22 >= bArr2.length) {
                break;
            }
            byte[] bArr7 = new byte[bArr2[i22].length];
            System.arraycopy(bArr2[i22], 0, bArr7, 0, bArr2[i22].length);
            bArr6[i22] = bArr7;
            i22++;
            length4 = length4;
        }
        int i23 = length4;
        bArr6[bArr2.length] = bytes;
        if (i4 <= 0 || i16 <= 0) {
            i2 = i23;
        } else {
            i2 = i23;
            int i24 = 0;
            while (i24 < i16) {
                bArr5[i2] = 0;
                i24++;
                i2++;
            }
        }
        if (i4 > 0) {
            byte[] bArr8 = c0459b.f591e;
            System.arraycopy(bArr8, bArr8.length - i, bArr5, i2, i);
            C0459b.a aVar3 = c0459b.f587a;
            aVar3.f596f = aVar3.f600a.f585b + i10 + 4 + i14 + bArr.length + i16;
        }
        C0459b.a aVar4 = c0459b.f587a;
        int i25 = aVar4.f592b;
        aVar4.f592b = i25 + 1;
        aVar4.f595e += 4;
        C0458a c0458a = aVar4.f600a;
        int i26 = c0458a.f585b + length3 + i16;
        c0458a.f586c = i26;
        c0459b.f591e = bArr5;
        c0459b.f588b = iArr2;
        c0459b.f590d = bArr6;
        return new int[]{i25, i26};
    }

    /* JADX INFO: renamed from: a */
    void m4102a(byte[] bArr) throws PendingIntent.CanceledException {
        m4100a(this.f5096d, this.f5093a.f598b);
        m4100a(this.f5095c, this.f5093a.f599c.get(0).f612c);
        m4100a(this.f5098f, this.f5094b.f598b);
        m4100a(this.f5097e, this.f5094b.f599c.get(0).f612c);
        byte[] bArr2 = new byte[2];
        byte[] bArr3 = new byte[2];
        byte[] bArr4 = new byte[2];
        C0471d c0471dM4093a = m4093a("array", bArr, bArr2);
        C0471d c0471dM4093a2 = m4093a("plurals", bArr, bArr3);
        C0471d c0471dM4093a3 = m4093a("string", bArr, bArr4);
        if (c0471dM4093a == null && c0471dM4093a2 == null && c0471dM4093a3 == null) {
            return;
        }
        m4095a();
        if (c0471dM4093a != null) {
            this.f5102j.send(this.f5103k, 200, new Intent().putExtra("result", String.format("%nBase Array Index%n", new Object[0])));
            HashMap<Integer, String> map = new HashMap<>();
            C0471d c0471dM4094a = m4094a(bArr2, map);
            if (c0471dM4094a != null) {
                m4098a(c0471dM4094a, c0471dM4093a, map, true, bArr2[0], bArr);
            }
        }
        if (c0471dM4093a2 != null) {
            this.f5102j.send(this.f5103k, 200, new Intent().putExtra("result", String.format("%nBase Plurals Index%n", new Object[0])));
            HashMap<Integer, String> map2 = new HashMap<>();
            C0471d c0471dM4094a2 = m4094a(bArr3, map2);
            if (c0471dM4094a2 != null) {
                m4098a(c0471dM4094a2, c0471dM4093a2, map2, true, bArr3[0], bArr);
            }
        }
        if (c0471dM4093a3 != null) {
            this.f5102j.send(this.f5103k, 200, new Intent().putExtra("result", String.format("%nBase String Index%n", new Object[0])));
            HashMap<Integer, String> map3 = new HashMap<>();
            C0471d c0471dM4094a3 = m4094a(bArr4, map3);
            if (c0471dM4094a3 != null) {
                m4098a(c0471dM4094a3, c0471dM4093a3, map3, false, bArr4[0], bArr);
            }
        }
    }
}
