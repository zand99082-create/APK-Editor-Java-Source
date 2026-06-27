package p019b.p022fn.p040c.p041a.p045f;

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: b.fn.c.a.f.a */
/* JADX INFO: loaded from: classes.dex */
public class C0475a {
    /* JADX INFO: renamed from: a */
    public static CRC32 m553a(InputStream inputStream) throws IOException {
        CRC32 crc32 = new CRC32();
        byte[] bArr = new byte[8192];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return crc32;
            }
            crc32.update(bArr, 0, i);
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m554a(int i) {
        return (i & 256) != 0;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m555a(int i, int i2) {
        byte b2;
        byte b3;
        int i3;
        byte b4;
        byte b5;
        if (i > 127) {
            b2 = (byte) (i & 255);
            b3 = (byte) (((i >> 8) & 255) | 128);
            i3 = 3;
        } else {
            b2 = (byte) i;
            b3 = 0;
            i3 = 2;
        }
        if (i2 > 127) {
            i3++;
            b4 = (byte) (i2 & 255);
            b5 = (byte) (((i2 >> 8) & 255) | 128);
        } else {
            b4 = (byte) i2;
            b5 = 0;
        }
        byte[] bArr = new byte[i3];
        if (i3 == 2) {
            bArr[0] = b2;
            bArr[1] = b4;
        } else if (i3 == 3) {
            bArr[0] = b2;
            bArr[1] = b5;
            bArr[2] = b4;
        } else if (i3 == 4) {
            bArr[0] = b3;
            bArr[1] = b2;
            bArr[2] = b5;
            bArr[3] = b4;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: a */
    public static int[] m556a(byte[] bArr, int i) {
        int i2 = ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
        return (32768 & i2) != 0 ? new int[]{4, (((i2 & 32767) << 16) + ((bArr[i + 3] & 255) << 8) + (bArr[i + 2] & 255)) * 2} : new int[]{2, i2 * 2};
    }

    /* JADX INFO: renamed from: b */
    public static int[] m557b(byte[] bArr, int i) {
        int i2 = (bArr[i] & 128) != 0 ? i + 2 : i + 1;
        int i3 = bArr[i2];
        int i4 = i2 + 1;
        if ((i3 & 128) != 0) {
            i3 = ((i3 & 127) << 8) + (bArr[i4] & 255);
            i4++;
        }
        return new int[]{i4, i3};
    }
}
