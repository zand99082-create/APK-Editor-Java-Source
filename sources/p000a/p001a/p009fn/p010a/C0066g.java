package p000a.p001a.p009fn.p010a;

import java.util.ArrayList;
import java.util.Iterator;
import p000a.p001a.p009fn.p011b.C0070b;

/* JADX INFO: renamed from: a.a.fn.a.g */
/* JADX INFO: loaded from: classes.dex */
public class C0066g {

    /* JADX INFO: renamed from: a */
    public byte[] f184a;

    /* JADX INFO: renamed from: b */
    public byte[] f185b;

    /* JADX INFO: renamed from: c */
    public byte[] f186c;

    /* JADX INFO: renamed from: d */
    public byte[] f187d;

    /* JADX INFO: renamed from: e */
    public ArrayList<String> f188e;

    /* JADX INFO: renamed from: a */
    public static C0066g m165a(byte[] bArr, int i) {
        C0066g c0066g = new C0066g();
        C0070b.m181a(bArr, i + 0, 4);
        byte[] bArrM181a = C0070b.m181a(bArr, i + 4, 4);
        c0066g.f184a = bArrM181a;
        int iM183b = C0070b.m183b(bArrM181a);
        byte[] bArrM181a2 = C0070b.m181a(bArr, i + 8, 4);
        c0066g.f185b = bArrM181a2;
        int iM183b2 = C0070b.m183b(bArrM181a2);
        c0066g.f188e = new ArrayList<>(iM183b2);
        byte[] bArrM181a3 = C0070b.m181a(bArr, i + 12, 4);
        c0066g.f186c = bArrM181a3;
        int iM183b3 = C0070b.m183b(bArrM181a3);
        C0070b.m181a(bArr, i + 16, 4);
        c0066g.f187d = C0070b.m181a(bArr, i + 20, 4);
        C0070b.m181a(bArr, i + 24, 4);
        int i2 = i + 28;
        int i3 = iM183b2 * 4;
        C0070b.m181a(bArr, i2, i3);
        C0070b.m181a(bArr, i2 + i3, iM183b3 * 4);
        int iM183b4 = C0070b.m183b(c0066g.f187d) + 8;
        byte[] bArrM181a4 = C0070b.m181a(bArr, iM183b4, iM183b);
        int length = 0;
        int iM179a = (C0070b.m179a(C0070b.m181a(bArrM181a4, 0, 2)) * 2) + 2;
        c0066g.f188e.add(C0070b.m178a(new String(C0070b.m181a(bArrM181a4, 2, iM179a))));
        int i4 = iM179a + 2;
        while (c0066g.f188e.size() < iM183b2) {
            int iM179a2 = (C0070b.m179a(C0070b.m181a(bArrM181a4, i4, 2)) * 2) + 2;
            c0066g.f188e.add(C0070b.m178a(new String(C0070b.m181a(bArrM181a4, i4 + 2, iM179a2))));
            i4 += iM179a2 + 2;
        }
        Iterator<String> it = c0066g.f188e.iterator();
        while (it.hasNext()) {
            length = length + 2 + (it.next().length() * 2) + 2;
        }
        C0070b.m181a(bArr, iM183b4, length);
        int i5 = iM183b4 + length;
        C0070b.m181a(bArr, i5, iM183b - i5);
        return c0066g;
    }
}
