package p000a.p001a.p009fn.p010a;

import java.util.ArrayList;
import p000a.p001a.p009fn.p011b.C0070b;

/* JADX INFO: renamed from: a.a.fn.a.f */
/* JADX INFO: loaded from: classes.dex */
public class C0065f {

    /* JADX INFO: renamed from: a */
    public byte[] f179a;

    /* JADX INFO: renamed from: b */
    public byte[] f180b;

    /* JADX INFO: renamed from: c */
    public byte[] f181c;

    /* JADX INFO: renamed from: d */
    public ArrayList<C0060a> f182d;

    /* JADX INFO: renamed from: e */
    public int f183e;

    public C0065f() {
        C0070b.m180a(1048834);
        C0070b.m180a(1310740);
    }

    /* JADX INFO: renamed from: a */
    public static C0065f m164a(byte[] bArr, int i) {
        C0065f c0065f = new C0065f();
        c0065f.f183e = i;
        C0070b.m181a(bArr, 0, 4);
        c0065f.f179a = C0070b.m181a(bArr, 4, 4);
        C0070b.m181a(bArr, 8, 4);
        C0070b.m181a(bArr, 12, 4);
        C0070b.m181a(bArr, 16, 4);
        c0065f.f180b = C0070b.m181a(bArr, 20, 4);
        C0070b.m181a(bArr, 24, 4);
        byte[] bArrM181a = C0070b.m181a(bArr, 28, 4);
        c0065f.f181c = bArrM181a;
        int iM183b = C0070b.m183b(bArrM181a);
        C0070b.m181a(bArr, 32, 4);
        C0070b.m181a(bArr, 36, iM183b * 20);
        c0065f.f182d = new ArrayList<>(iM183b);
        for (int i2 = 0; i2 < iM183b; i2++) {
            Integer[] numArr = new Integer[5];
            C0060a c0060a = new C0060a();
            for (int i3 = 0; i3 < 5; i3++) {
                int i4 = i2 * 20;
                int iM183b2 = C0070b.m183b(C0070b.m181a(bArr, i4 + 36 + (i3 * 4), 4));
                c0060a.f175c = i + 36 + i4;
                if (i3 == 1) {
                    c0060a.f173a = iM183b2;
                } else if (i3 == 2) {
                    c0060a.f174b = iM183b2;
                } else if (i3 == 3) {
                    iM183b2 >>= 24;
                }
                numArr[i3] = Integer.valueOf(iM183b2);
            }
            c0065f.f182d.add(c0060a);
        }
        return c0065f;
    }
}
