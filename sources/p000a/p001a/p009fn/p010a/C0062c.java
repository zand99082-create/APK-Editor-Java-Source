package p000a.p001a.p009fn.p010a;

import p000a.p001a.p009fn.p011b.C0070b;

/* JADX INFO: renamed from: a.a.fn.a.c */
/* JADX INFO: loaded from: classes.dex */
public class C0062c {

    /* JADX INFO: renamed from: a */
    public byte[] f176a;

    /* JADX INFO: renamed from: b */
    public int f177b;

    public C0062c() {
        this.f176a = new byte[4];
        C0070b.m180a(1048835);
        this.f176a = C0070b.m180a(24);
        C0070b.m180a(-1);
    }

    /* JADX INFO: renamed from: a */
    public static C0062c m161a(byte[] bArr, int i) {
        C0062c c0062c = new C0062c();
        c0062c.f177b = i;
        C0070b.m181a(bArr, 0, 4);
        c0062c.f176a = C0070b.m181a(bArr, 4, 4);
        C0070b.m181a(bArr, 8, 4);
        C0070b.m181a(bArr, 12, 4);
        C0070b.m181a(bArr, 16, 4);
        C0070b.m181a(bArr, 20, 4);
        return c0062c;
    }
}
