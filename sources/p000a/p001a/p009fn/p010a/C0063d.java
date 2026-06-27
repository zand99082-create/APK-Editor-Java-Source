package p000a.p001a.p009fn.p010a;

import java.util.ArrayList;
import p000a.p001a.p009fn.p011b.C0070b;

/* JADX INFO: renamed from: a.a.fn.a.d */
/* JADX INFO: loaded from: classes.dex */
public class C0063d {

    /* JADX INFO: renamed from: a */
    public byte[] f178a;

    /* JADX INFO: renamed from: a */
    public static C0063d m162a(byte[] bArr, int i) {
        C0063d c0063d = new C0063d();
        C0070b.m181a(bArr, i + 0, 4);
        byte[] bArrM181a = C0070b.m181a(bArr, i + 4, 4);
        c0063d.f178a = bArrM181a;
        int i2 = i + 8;
        int iM183b = C0070b.m183b(bArrM181a) - 8;
        C0070b.m181a(bArr, i2, iM183b);
        byte[] bArrM181a2 = C0070b.m181a(bArr, i2, iM183b);
        ArrayList arrayList = new ArrayList(bArrM181a2.length / 4);
        for (int i3 = 0; i3 < bArrM181a2.length; i3 += 4) {
            arrayList.add(Integer.valueOf(C0070b.m183b(C0070b.m181a(bArrM181a2, i3, 4))));
        }
        return c0063d;
    }
}
