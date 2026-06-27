package p000a.p001a.p009fn.p011b;

import java.util.ArrayList;
import java.util.List;
import p000a.p001a.p009fn.p010a.C0061b;
import p000a.p001a.p009fn.p010a.C0062c;
import p000a.p001a.p009fn.p010a.C0063d;
import p000a.p001a.p009fn.p010a.C0064e;
import p000a.p001a.p009fn.p010a.C0065f;
import p000a.p001a.p009fn.p010a.C0066g;
import p000a.p001a.p009fn.p010a.C0067h;
import p000a.p001a.p009fn.p010a.C0068i;

/* JADX INFO: renamed from: a.a.fn.b.a */
/* JADX INFO: loaded from: classes.dex */
public class C0069a {

    /* JADX INFO: renamed from: a */
    public static int f202a = 8;

    /* JADX INFO: renamed from: b */
    public static int f203b;

    /* JADX INFO: renamed from: c */
    public static int f204c;

    /* JADX INFO: renamed from: d */
    public static C0068i f205d = new C0068i();

    /* JADX INFO: renamed from: e */
    public static boolean f206e = false;

    /* JADX INFO: renamed from: f */
    public static boolean f207f = false;

    /* JADX INFO: renamed from: g */
    public static List<C0067h> f208g = new ArrayList();

    /* JADX INFO: renamed from: a */
    public static void m167a() {
        f203b = 0;
        f204c = 0;
        f206e = false;
        f207f = false;
        f208g.clear();
        f205d.m166a();
    }

    /* JADX INFO: renamed from: a */
    public static void m168a(byte[] bArr) {
        f205d.f197g = C0061b.m160a(bArr);
    }

    /* JADX INFO: renamed from: a */
    public static void m169a(byte[] bArr, int i) {
        C0062c c0062cM161a = C0062c.m161a(bArr, i);
        C0067h c0067hRemove = f208g.remove(r2.size() - 1);
        c0067hRemove.f190b = c0062cM161a;
        f205d.f199i.add(c0062cM161a);
        f205d.f201k.add(c0067hRemove);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m170a(int i) {
        return f204c >= i;
    }

    /* JADX INFO: renamed from: b */
    public static void m171b() {
        m167a();
        m177f(f205d.f191a);
        m175d(f205d.f191a);
        m172b(f205d.f191a);
        m176e(f205d.f191a);
    }

    /* JADX INFO: renamed from: b */
    public static void m172b(byte[] bArr) {
        f205d.f195e = C0063d.m162a(bArr, f203b);
        int iM183b = f203b + C0070b.m183b(C0070b.m181a(bArr, f203b + 4, 4));
        f204c = iM183b;
        C0071c.f209a = iM183b;
    }

    /* JADX INFO: renamed from: b */
    public static void m173b(byte[] bArr, int i) {
        C0065f c0065fM164a = C0065f.m164a(bArr, i);
        f205d.f198h.add(c0065fM164a);
        C0067h c0067h = new C0067h();
        c0067h.f189a = c0065fM164a;
        f208g.add(c0067h);
        if (f205d.f194d.f188e.get(C0070b.m183b(C0070b.m181a(bArr, 20, 4))).equals("application")) {
            f206e = true;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m174c(byte[] bArr) {
        f205d.f196f = C0064e.m163a(bArr);
    }

    /* JADX INFO: renamed from: d */
    public static void m175d(byte[] bArr) {
        f205d.f194d = C0066g.m165a(bArr, f202a);
        f203b = f202a + C0070b.m183b(C0070b.m181a(bArr, 12, 4));
    }

    /* JADX INFO: renamed from: e */
    public static void m176e(byte[] bArr) {
        while (!m170a(bArr.length)) {
            byte[] bArrM181a = C0070b.m181a(bArr, f204c, 4);
            byte[] bArrM181a2 = C0070b.m181a(bArr, f204c + 4, 4);
            int iM183b = C0070b.m183b(bArrM181a);
            int iM183b2 = C0070b.m183b(bArrM181a2);
            switch (iM183b) {
                case 1048832:
                    m174c(C0070b.m181a(bArr, f204c, iM183b2));
                    f207f = true;
                    break;
                case 1048833:
                    m168a(C0070b.m181a(bArr, f204c, iM183b2));
                    break;
                case 1048834:
                    m173b(C0070b.m181a(bArr, f204c, iM183b2), f204c);
                    if (f206e) {
                        C0071c.f210b = f204c + iM183b2;
                        f206e = false;
                    }
                    if (f207f) {
                        C0071c.f211c = f204c + iM183b2;
                        f207f = false;
                    }
                    break;
                case 1048835:
                    m169a(C0070b.m181a(bArr, f204c, iM183b2), f204c);
                    break;
            }
            f204c += iM183b2;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m177f(byte[] bArr) {
        byte[] bArrM181a = C0070b.m181a(bArr, 0, 4);
        byte[] bArrM181a2 = C0070b.m181a(bArr, 4, 4);
        C0068i c0068i = f205d;
        c0068i.f192b = bArrM181a;
        c0068i.f193c = bArrM181a2;
    }
}
