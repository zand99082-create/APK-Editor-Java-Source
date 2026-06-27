package p019b.p022fn.p023a.p024a;

import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: b.fn.a.a.a */
/* JADX INFO: loaded from: classes.dex */
public class C0424a {

    /* JADX INFO: renamed from: b.fn.a.a.a$a */
    static abstract class a {

        /* JADX INFO: renamed from: a */
        public byte[] f464a;

        /* JADX INFO: renamed from: b */
        public int f465b;

        a() {
        }
    }

    /* JADX INFO: renamed from: b.fn.a.a.a$b */
    static class b extends a {

        /* JADX INFO: renamed from: j */
        private static final byte[] f466j = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* JADX INFO: renamed from: k */
        private static final byte[] f467k = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

        /* JADX INFO: renamed from: c */
        private final byte[] f468c;

        /* JADX INFO: renamed from: d */
        int f469d;

        /* JADX INFO: renamed from: e */
        private int f470e;

        /* JADX INFO: renamed from: f */
        public final boolean f471f;

        /* JADX INFO: renamed from: g */
        public final boolean f472g;

        /* JADX INFO: renamed from: h */
        public final boolean f473h;

        /* JADX INFO: renamed from: i */
        private final byte[] f474i;

        public b(int i, byte[] bArr) {
            this.f464a = bArr;
            this.f471f = (i & 1) == 0;
            this.f472g = (i & 2) == 0;
            this.f473h = (i & 4) != 0;
            this.f474i = (i & 8) == 0 ? f466j : f467k;
            this.f468c = new byte[2];
            this.f469d = 0;
            this.f470e = this.f472g ? 19 : -1;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x00e6 A[SYNTHETIC] */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean m392a(byte[] r18, int r19, int r20, boolean r21) {
            /*
                Method dump skipped, instruction units count: 483
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p019b.p022fn.p023a.p024a.C0424a.b.m392a(byte[], int, int, boolean):boolean");
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m389a(byte[] bArr, int i) {
        return m390a(bArr, 0, bArr.length, i);
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m390a(byte[] bArr, int i, int i2, int i3) {
        b bVar = new b(i3, null);
        int i4 = (i2 / 3) * 4;
        if (!bVar.f471f) {
            int i5 = i2 % 3;
            if (i5 == 1) {
                i4 += 2;
            } else if (i5 == 2) {
                i4 += 3;
            }
        } else if (i2 % 3 > 0) {
            i4 += 4;
        }
        if (bVar.f472g && i2 > 0) {
            i4 += (((i2 - 1) / 57) + 1) * (bVar.f473h ? 2 : 1);
        }
        bVar.f464a = new byte[i4];
        bVar.m392a(bArr, i, i2, true);
        return bVar.f464a;
    }

    /* JADX INFO: renamed from: b */
    public static String m391b(byte[] bArr, int i) {
        try {
            return new String(m389a(bArr, i), "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
