package com.tilks.arsc.main;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import p019b.p022fn.p040c.p041a.p042d.C0458a;
import p019b.p022fn.p040c.p041a.p042d.C0459b;
import p019b.p022fn.p040c.p041a.p042d.C0460c;
import p019b.p022fn.p040c.p041a.p042d.C0461d;
import p019b.p022fn.p040c.p041a.p042d.C0463f;
import p019b.p022fn.p040c.p041a.p042d.C0465h;
import p019b.p022fn.p040c.p041a.p042d.C0467j;
import p019b.p022fn.p040c.p041a.p042d.p043k.C0468a;
import p019b.p022fn.p040c.p041a.p042d.p043k.C0469b;
import p019b.p022fn.p040c.p041a.p042d.p043k.C0470c;
import p019b.p022fn.p040c.p041a.p042d.p043k.C0471d;
import p019b.p022fn.p040c.p041a.p042d.p043k.C0472e;

/* JADX INFO: renamed from: com.tilks.arsc.main.d */
/* JADX INFO: loaded from: classes.dex */
class C1705d {

    /* JADX INFO: renamed from: a */
    private ArrayList<String> f5111a = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    private ArrayList<String> f5113c = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    private HashMap<String, Integer> f5112b = new HashMap<>();

    /* JADX INFO: renamed from: d */
    private ArrayList<String> f5114d = new ArrayList<>();

    /* JADX INFO: renamed from: e */
    private ArrayList<ArrayList<String>> f5115e = new ArrayList<>();

    /* JADX INFO: renamed from: f */
    private ArrayList<HashMap<String, Integer>> f5116f = new ArrayList<>();

    /* JADX INFO: renamed from: g */
    private boolean f5117g = false;

    C1705d() {
    }

    /* JADX INFO: renamed from: a */
    private static int m4107a(C0460c c0460c, byte b2, int i) {
        int i2 = 0;
        for (C0461d c0461d : c0460c.f599c.get(i).f613d) {
            if (c0461d.f600a.f584a == 514) {
                C0467j c0467j = (C0467j) c0461d;
                if (c0467j.f621b == b2) {
                    i2 = c0467j.f624e;
                }
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: a */
    private C0471d m4108a(C0471d c0471d, C0471d c0471d2) {
        C0471d c0471d3 = new C0471d();
        c0471d3.f600a = c0471d2.f600a;
        c0471d3.f635b = c0471d2.f635b;
        c0471d3.f636c = c0471d2.f636c;
        c0471d3.f637d = c0471d2.f637d;
        c0471d3.f638e = c0471d2.f638e;
        c0471d3.f639f = c0471d2.f639f;
        c0471d3.f640g = c0471d2.f640g;
        int[] iArr = new int[c0471d2.f638e];
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < c0471d2.f638e; i4++) {
            if (c0471d.f641h[i4] == -1 && c0471d2.f641h[i4] == -1) {
                iArr[i4] = -1;
            } else {
                if (c0471d.f641h[i4] != -1 && c0471d2.f641h[i4] != -1) {
                    arrayList.add(i, c0471d.f642i.get(i2));
                    iArr[i4] = i * 16;
                    i++;
                    i2++;
                } else if (c0471d.f641h[i4] == -1 && c0471d2.f641h[i4] != -1) {
                    arrayList.add(i, c0471d2.f642i.get(i3));
                    iArr[i4] = i * 16;
                    i++;
                } else if (c0471d.f641h[i4] != -1 && c0471d2.f641h[i4] == -1) {
                    arrayList.add(i, c0471d.f642i.get(i2));
                    iArr[i4] = i * 16;
                    i++;
                    i2++;
                }
                i3++;
            }
        }
        c0471d3.f641h = iArr;
        c0471d3.f642i = arrayList;
        c0471d3.f600a.f586c = c0471d3.f640g.f601a + 20 + (c0471d3.f638e * 4) + (arrayList.size() << 4);
        return c0471d3;
    }

    /* JADX INFO: renamed from: a */
    private void m4109a(C0460c c0460c, C0459b c0459b, C0459b c0459b2) {
        C1704c c1704c = new C1704c(c0459b, c0459b2, this.f5111a, this.f5113c, this.f5112b);
        int i = c0459b.f587a.f600a.f586c;
        int[] iArrM4106a = c1704c.m4106a();
        if (iArrM4106a[1] > 0) {
            c0460c.f597a.f600a.f586c += iArrM4106a[1] - i;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m4110a(C0460c c0460c, C0465h c0465h, C0465h c0465h2, int i) {
        C0459b c0459b = c0465h.f612c;
        C0459b c0459b2 = c0465h2.f612c;
        HashMap<String, Integer> map = this.f5116f.get(i);
        ArrayList<String> arrayList = this.f5115e.get(i);
        C1704c c1704c = new C1704c(c0459b, c0459b2, arrayList, this.f5114d, map);
        this.f5116f.set(i, map);
        this.f5115e.set(i, arrayList);
        int i2 = c0459b.f587a.f600a.f586c;
        int[] iArrM4106a = c1704c.m4106a();
        if (iArrM4106a[1] > 0) {
            int i3 = iArrM4106a[1] - i2;
            c0465h.f610a.f600a.f586c += i3;
            c0460c.f597a.f600a.f586c += i3;
        }
        c0460c.f599c.set(i, c0465h);
    }

    /* JADX INFO: renamed from: a */
    private void m4111a(C0460c c0460c, C0471d c0471d, byte b2, int i) {
        C0458a c0458a;
        int i2;
        int i3;
        C0465h c0465h = c0460c.f599c.get(i);
        List<C0461d> list = c0465h.f613d;
        C0471d c0471d2 = null;
        int i4 = 0;
        int i5 = 0;
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        for (C0461d c0461d : list) {
            if (c0461d.f600a.f584a == 513) {
                C0471d c0471d3 = (C0471d) c0461d;
                if (c0471d3.f635b == b2) {
                    if (Arrays.equals(c0471d3.f640g.f604d, c0471d.f640g.f604d)) {
                        if ((c0471d.f642i.get(0).f627b & 1) == 1) {
                            z = true;
                        }
                        i7 = c0471d3.f600a.f586c;
                        i4 = i6;
                        i5 = i4;
                        c0471d2 = c0471d3;
                    } else {
                        i5 = i6;
                    }
                }
            }
            i6++;
        }
        if (i4 <= 0) {
            if (i5 > 0) {
                list.add(i5 + 1, c0471d);
                C0458a c0458a2 = c0465h.f610a.f600a;
                int i8 = c0458a2.f586c;
                C0458a c0458a3 = c0471d.f600a;
                c0458a2.f586c = i8 + c0458a3.f586c;
                c0458a = c0460c.f597a.f600a;
                i2 = c0458a.f586c;
                i3 = c0458a3.f586c;
            }
            c0460c.f599c.set(i, c0465h);
        }
        list.set(i4, z ? m4115b(c0471d2, c0471d) : m4108a(c0471d2, c0471d));
        C0458a c0458a4 = c0465h.f610a.f600a;
        int i9 = c0458a4.f586c;
        C0458a c0458a5 = c0471d.f600a;
        c0458a4.f586c = i9 + (c0458a5.f586c - i7);
        c0458a = c0460c.f597a.f600a;
        i2 = c0458a.f586c;
        i3 = c0458a5.f586c - i7;
        c0458a.f586c = i2 + i3;
        c0460c.f599c.set(i, c0465h);
    }

    /* JADX INFO: renamed from: a */
    private static void m4112a(C0460c c0460c, byte[] bArr, byte b2, int i, int i2) {
        C0458a c0458a;
        int i3;
        int i4;
        C0465h c0465h = c0460c.f599c.get(i2);
        for (C0461d c0461d : c0465h.f613d) {
            short s = c0461d.f600a.f584a;
            int i5 = 0;
            if (s == 513) {
                C0471d c0471d = (C0471d) c0461d;
                if (c0471d.f635b == b2) {
                    int[] iArr = c0471d.f641h;
                    int[] iArr2 = new int[iArr.length + i];
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    while (i5 < i) {
                        iArr2[c0471d.f641h.length + i5] = -1;
                        i5++;
                    }
                    c0471d.f641h = iArr2;
                    c0471d.f638e += i;
                    i4 = i * 4;
                    c0471d.f639f += i4;
                    c0458a = c0471d.f600a;
                    i3 = c0458a.f586c;
                    c0458a.f586c = i3 + i4;
                    c0465h.f610a.f600a.f586c += i4;
                    c0460c.f597a.f600a.f586c += i4;
                    c0460c.f599c.set(i2, c0465h);
                }
            } else if (s == 514) {
                C0467j c0467j = (C0467j) c0461d;
                if (c0467j.f621b == b2) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    byte[] bArr3 = c0467j.f625f;
                    System.arraycopy(bArr3, 0, bArr2, 0, bArr3.length);
                    while (i5 < length) {
                        if (bArr[i5] != 0) {
                            bArr2[i5] = bArr[i5];
                        }
                        i5++;
                    }
                    c0467j.f625f = bArr2;
                    c0467j.f624e += i;
                    c0458a = c0467j.f600a;
                    i3 = c0458a.f586c;
                    i4 = i * 4;
                    c0458a.f586c = i3 + i4;
                    c0465h.f610a.f600a.f586c += i4;
                    c0460c.f597a.f600a.f586c += i4;
                    c0460c.f599c.set(i2, c0465h);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m4113a(List<String> list, C0459b c0459b) {
        int length = c0459b.f590d.length;
        boolean zM550a = c0459b.f587a.m550a();
        for (int i = 0; i < length; i++) {
            byte[][] bArr = c0459b.f590d;
            list.add(i, zM550a ? new String(bArr[i], StandardCharsets.UTF_8) : new String(bArr[i], StandardCharsets.UTF_16LE));
        }
    }

    /* JADX INFO: renamed from: a */
    private void m4114a(List<String> list, C0459b c0459b, HashMap<String, Integer> map) {
        int length = c0459b.f590d.length;
        boolean zM550a = c0459b.f587a.m550a();
        for (int i = 0; i < length; i++) {
            byte[][] bArr = c0459b.f590d;
            String str = zM550a ? new String(bArr[i], StandardCharsets.UTF_8) : new String(bArr[i], StandardCharsets.UTF_16LE);
            list.add(str);
            map.put(str, Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: b */
    private C0471d m4115b(C0471d c0471d, C0471d c0471d2) {
        C0471d c0471d3 = new C0471d();
        c0471d3.f600a = c0471d2.f600a;
        c0471d3.f635b = c0471d2.f635b;
        c0471d3.f636c = c0471d2.f636c;
        c0471d3.f637d = c0471d2.f637d;
        c0471d3.f638e = c0471d2.f638e;
        c0471d3.f639f = c0471d2.f639f;
        c0471d3.f640g = c0471d2.f640g;
        int[] iArr = new int[c0471d2.f638e];
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < c0471d2.f638e; i5++) {
            if (c0471d.f641h[i5] == -1 && c0471d2.f641h[i5] == -1) {
                iArr[i5] = -1;
            } else {
                if (c0471d.f641h[i5] != -1 && c0471d2.f641h[i5] != -1) {
                    C0470c c0470c = (C0470c) c0471d2.f642i.get(i2);
                    arrayList.add(i3, c0470c);
                    iArr[i5] = i;
                    i += (c0470c.f633f * 12) + 16;
                    i3++;
                    i4++;
                } else if (c0471d.f641h[i5] == -1 && c0471d2.f641h[i5] != -1) {
                    C0470c c0470c2 = (C0470c) c0471d2.f642i.get(i2);
                    arrayList.add(i3, c0470c2);
                    iArr[i5] = i;
                    i += (c0470c2.f633f * 12) + 16;
                    i3++;
                } else if (c0471d.f641h[i5] != -1 && c0471d2.f641h[i5] == -1) {
                    C0470c c0470c3 = (C0470c) c0471d.f642i.get(i4);
                    arrayList.add(i3, c0470c3);
                    iArr[i5] = i;
                    i += (c0470c3.f633f * 12) + 16;
                    i3++;
                    i4++;
                }
                i2++;
            }
        }
        c0471d3.f641h = iArr;
        c0471d3.f642i = arrayList;
        c0471d3.f600a.f586c = c0471d3.f640g.f601a + 20 + (c0471d3.f638e * 4) + i;
        return c0471d3;
    }

    /* JADX INFO: renamed from: b */
    private void m4116b(C0460c c0460c, C0460c c0460c2, int i) {
        if (!this.f5117g) {
            m4114a(this.f5111a, c0460c.f598b, this.f5112b);
            this.f5116f.add(i, new HashMap<>());
            HashMap<String, Integer> map = this.f5116f.get(i);
            ArrayList<String> arrayList = new ArrayList<>();
            this.f5115e.add(i, arrayList);
            m4114a(arrayList, c0460c.f599c.get(i).f612c, map);
            this.f5116f.set(i, map);
            this.f5115e.set(i, arrayList);
        }
        this.f5117g = true;
        m4113a(this.f5113c, c0460c2.f598b);
        m4113a(this.f5114d, c0460c2.f599c.get(0).f612c);
    }

    /* JADX INFO: renamed from: c */
    private void m4117c(C0460c c0460c, C0460c c0460c2, int i) {
        int i2 = 0;
        byte b2 = 0;
        for (C0461d c0461d : c0460c2.f599c.get(0).f613d) {
            short s = c0461d.f600a.f584a;
            if (s == 513) {
                C0471d c0471d = (C0471d) c0461d;
                if (c0471d.f638e != 0) {
                    if (i2 > 0) {
                        int[] iArr = c0471d.f641h;
                        int[] iArr2 = new int[iArr.length + i2];
                        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                        for (int i3 = 0; i3 < i2; i3++) {
                            iArr2[c0471d.f641h.length + i3] = -1;
                        }
                        c0471d.f641h = iArr2;
                        c0471d.f638e += i2;
                        int i4 = i2 * 4;
                        c0471d.f639f += i4;
                        c0471d.f600a.f586c += i4;
                    }
                    int size = c0471d.f642i.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        C0468a c0468a = c0471d.f642i.get(i5);
                        if ((c0468a.f627b & 1) == 1) {
                            c0468a.f628c = this.f5116f.get(i).get(this.f5114d.get(c0468a.f628c)).intValue();
                            for (C0469b c0469b : ((C0470c) c0468a).f634g) {
                                C0472e c0472e = c0469b.f631b;
                                if (c0472e.f645c == 3) {
                                    c0469b.f631b.f646d = this.f5112b.get(this.f5113c.get(c0472e.f646d)).intValue();
                                }
                            }
                        } else {
                            byte b3 = c0468a.f629d.f645c;
                            if (b3 == 3 || b3 == 1) {
                                c0468a.f628c = this.f5116f.get(i).get(this.f5114d.get(c0468a.f628c)).intValue();
                                C0472e c0472e2 = c0468a.f629d;
                                if (c0472e2.f645c != 1) {
                                    c0468a.f629d.f646d = this.f5112b.get(this.f5113c.get(c0472e2.f646d)).intValue();
                                }
                            }
                        }
                    }
                    m4111a(c0460c, c0471d, b2, i);
                }
            } else if (s == 514) {
                C0467j c0467j = (C0467j) c0461d;
                byte b4 = c0467j.f621b;
                int i6 = c0467j.f624e;
                int iM4107a = m4107a(c0460c, b4, i);
                if (iM4107a > i6) {
                    int i7 = iM4107a - i6;
                    b2 = b4;
                    i2 = i7;
                } else {
                    if (iM4107a < i6) {
                        m4112a(c0460c, c0467j.f625f, b4, i6 - iM4107a, i);
                    }
                    b2 = b4;
                    i2 = 0;
                }
            }
        }
        this.f5114d.clear();
        this.f5113c.clear();
    }

    /* JADX INFO: renamed from: a */
    void m4118a(C0460c c0460c, C0460c c0460c2, int i) {
        int i2;
        this.f5117g = true;
        if (c0460c.f597a.f605b == i) {
            c0460c.f599c.add(new C0465h());
            c0460c.f597a.f605b++;
        }
        int i3 = c0460c.f597a.f605b;
        c0460c.f599c.add(i3, c0460c2.f599c.get(0));
        C0463f c0463f = c0460c.f597a;
        c0463f.f605b++;
        c0463f.f600a.f586c += c0460c2.f599c.get(0).f610a.f600a.f586c;
        if (this.f5111a.size() == 0) {
            m4114a(this.f5111a, c0460c.f598b, this.f5112b);
        }
        m4113a(this.f5113c, c0460c2.f598b);
        ArrayList<String> arrayList = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        if (this.f5115e.size() == 0) {
            m4114a(arrayList, c0460c.f599c.get(0).f612c, map);
            this.f5115e.add(0, arrayList);
            this.f5116f.add(0, map);
        }
        ArrayList<String> arrayList2 = new ArrayList<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        m4114a(arrayList2, c0460c.f599c.get(i3).f612c, map2);
        while (true) {
            i2 = i + 1;
            if (this.f5115e.size() >= i2) {
                break;
            }
            this.f5115e.add(new ArrayList<>());
            this.f5116f.add(new HashMap<>());
        }
        this.f5115e.add(i2, arrayList2);
        this.f5116f.add(i2, map2);
        C1704c c1704c = new C1704c(c0460c.f598b, c0460c2.f598b, this.f5111a, this.f5113c, this.f5112b);
        int i4 = c0460c.f598b.f587a.f600a.f586c;
        int[] iArrM4106a = c1704c.m4106a();
        if (iArrM4106a[1] > 0) {
            c0460c.f597a.f600a.f586c += iArrM4106a[1] - i4;
        }
        List<C0461d> list = c0460c.f599c.get(i3).f613d;
        for (C0461d c0461d : list) {
            if (c0461d.f600a.f584a == 513) {
                C0471d c0471d = (C0471d) c0461d;
                if (c0471d.f638e != 0) {
                    int size = c0471d.f642i.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        C0468a c0468a = c0471d.f642i.get(i5);
                        if ((c0468a.f627b & 1) == 1) {
                            for (C0469b c0469b : ((C0470c) c0468a).f634g) {
                                C0472e c0472e = c0469b.f631b;
                                byte b2 = c0472e.f645c;
                                if (b2 == 3 || b2 == 1) {
                                    if (c0472e.f645c != 1) {
                                        c0469b.f631b.f646d = this.f5112b.get(this.f5113c.get(c0469b.f631b.f646d)).intValue();
                                    }
                                }
                            }
                        } else {
                            byte b3 = c0468a.f629d.f645c;
                            if (b3 == 3 || b3 == 1) {
                                C0472e c0472e2 = c0468a.f629d;
                                if (c0472e2.f645c != 1) {
                                    c0468a.f629d.f646d = this.f5112b.get(this.f5113c.get(c0472e2.f646d)).intValue();
                                }
                            }
                        }
                    }
                }
            }
        }
        C0465h c0465h = c0460c.f599c.get(i3);
        c0465h.f613d = list;
        c0460c.f599c.set(i3, c0465h);
        this.f5113c.clear();
    }

    /* JADX INFO: renamed from: a */
    void m4119a(C0460c c0460c, C0460c c0460c2, boolean z, int i) {
        int i2 = z ? i + 1 : 0;
        m4116b(c0460c, c0460c2, i2);
        m4110a(c0460c, c0460c.f599c.get(i2), c0460c2.f599c.get(0), i2);
        m4109a(c0460c, c0460c.f598b, c0460c2.f598b);
        m4117c(c0460c, c0460c2, i2);
    }
}
