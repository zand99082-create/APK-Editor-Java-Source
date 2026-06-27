package p000a.p001a.p009fn.p011b;

import p000a.p001a.p009fn.p010a.C0060a;
import p000a.p001a.p009fn.p010a.C0065f;
import p000a.p001a.p009fn.p010a.C0067h;
import p000a.p001a.p009fn.p010a.C0068i;

/* JADX INFO: renamed from: a.a.fn.b.c */
/* JADX INFO: loaded from: classes.dex */
public class C0071c {

    /* JADX INFO: renamed from: a */
    public static int f209a;

    /* JADX INFO: renamed from: b */
    public static int f210b;

    /* JADX INFO: renamed from: c */
    public static int f211c;

    /* JADX INFO: renamed from: a */
    public static void m185a() {
        byte[] bArrM180a = C0070b.m180a(C0069a.f205d.f191a.length);
        C0068i c0068i = C0069a.f205d;
        c0068i.f191a = C0070b.m182a(c0068i.f191a, bArrM180a, 4);
    }

    /* JADX INFO: renamed from: a */
    public static void m186a(String str, String str2) {
        C0069a.m171b();
        for (C0067h c0067h : C0069a.f205d.f201k) {
            if (str.equals(C0069a.f205d.f194d.f188e.get(C0070b.m183b(c0067h.f189a.f180b)))) {
                for (C0060a c0060a : c0067h.f189a.f182d) {
                    if ("name".equals(C0069a.f205d.f194d.f188e.get(c0060a.f173a)) && str2.equals(C0069a.f205d.f194d.f188e.get(c0060a.f174b))) {
                        int iM183b = C0070b.m183b(c0067h.f190b.f176a);
                        int i = c0067h.f189a.f183e;
                        int i2 = (c0067h.f190b.f177b - i) + iM183b;
                        C0068i c0068i = C0069a.f205d;
                        c0068i.f191a = C0070b.m184b(c0068i.f191a, i, i2);
                        m185a();
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m187a(String str, String str2, String str3) {
        C0069a.m171b();
        for (C0065f c0065f : C0069a.f205d.f198h) {
            if (str.equals(C0069a.f205d.f194d.f188e.get(C0070b.m183b(c0065f.f180b)))) {
                if (str.equals("application") || str.equals("manifest")) {
                    for (C0060a c0060a : c0065f.f182d) {
                        if (str3.equals(C0069a.f205d.f194d.f188e.get(c0060a.f173a))) {
                            if (c0065f.f182d.size() == 1) {
                                m186a(str, str2);
                                return;
                            }
                            int i = c0065f.f183e + 28;
                            byte[] bArrM180a = C0070b.m180a(c0065f.f182d.size() - 1);
                            C0068i c0068i = C0069a.f205d;
                            c0068i.f191a = C0070b.m182a(c0068i.f191a, bArrM180a, i);
                            int i2 = c0065f.f183e + 4;
                            byte[] bArrM180a2 = C0070b.m180a(C0070b.m183b(c0065f.f179a) - 20);
                            C0068i c0068i2 = C0069a.f205d;
                            c0068i2.f191a = C0070b.m182a(c0068i2.f191a, bArrM180a2, i2);
                            int i3 = c0060a.f175c;
                            int iM159a = c0060a.m159a();
                            C0068i c0068i3 = C0069a.f205d;
                            c0068i3.f191a = C0070b.m184b(c0068i3.f191a, i3, iM159a);
                            m185a();
                            return;
                        }
                    }
                }
                for (C0060a c0060a2 : c0065f.f182d) {
                    if ("name".equals(C0069a.f205d.f194d.f188e.get(c0060a2.f173a)) && str2.equals(C0069a.f205d.f194d.f188e.get(c0060a2.f174b))) {
                        for (C0060a c0060a3 : c0065f.f182d) {
                            if (str3.equals(C0069a.f205d.f194d.f188e.get(c0060a3.f173a))) {
                                if (c0065f.f182d.size() == 1) {
                                    m186a(str, str2);
                                    return;
                                }
                                int i4 = c0065f.f183e + 28;
                                byte[] bArrM180a3 = C0070b.m180a(c0065f.f182d.size() - 1);
                                C0068i c0068i4 = C0069a.f205d;
                                c0068i4.f191a = C0070b.m182a(c0068i4.f191a, bArrM180a3, i4);
                                int i5 = c0065f.f183e + 4;
                                byte[] bArrM180a4 = C0070b.m180a(C0070b.m183b(c0065f.f179a) - 20);
                                C0068i c0068i5 = C0069a.f205d;
                                c0068i5.f191a = C0070b.m182a(c0068i5.f191a, bArrM180a4, i5);
                                int i6 = c0060a3.f175c;
                                int iM159a2 = c0060a3.m159a();
                                C0068i c0068i6 = C0069a.f205d;
                                c0068i6.f191a = C0070b.m184b(c0068i6.f191a, i6, iM159a2);
                                m185a();
                                return;
                            }
                        }
                    }
                }
            }
        }
    }
}
