package p000a.p001a.p009fn.p011b;

import android.support.v4.view.MotionEventCompat;
import java.util.ArrayList;

/* JADX INFO: renamed from: a.a.fn.b.b */
/* JADX INFO: loaded from: classes.dex */
public class C0070b {
    /* JADX INFO: renamed from: a */
    public static String m178a(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        byte[] bytes = str.getBytes();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < bytes.length; i++) {
            if (bytes[i] != 0) {
                arrayList.add(Byte.valueOf(bytes[i]));
            }
        }
        int size = arrayList.size();
        byte[] bArr = new byte[size];
        for (int i2 = 0; i2 < size; i2++) {
            bArr[i2] = ((Byte) arrayList.get(i2)).byteValue();
        }
        return new String(bArr);
    }

    /* JADX INFO: renamed from: a */
    public static short m179a(byte[] bArr) {
        return (short) (((short) (((short) (bArr[1] & 255)) << 8)) | ((short) (bArr[0] & 255)));
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m180a(int i) {
        return new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255)};
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m181a(byte[] bArr, int i, int i2) {
        if (bArr == null || i > bArr.length || i + i2 > bArr.length || i < 0 || i2 <= 0) {
            return null;
        }
        byte[] bArr2 = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr2[i3] = bArr[i3 + i];
        }
        return bArr2;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m182a(byte[] bArr, byte[] bArr2, int i) {
        if (bArr == null) {
            return null;
        }
        if (bArr2 == null || i > bArr.length || bArr2.length + i > bArr.length) {
            return bArr;
        }
        byte[] bArr3 = new byte[bArr2.length];
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            int i3 = i2 + i;
            bArr3[i2] = bArr[i3];
            bArr[i3] = bArr2[i2];
        }
        return bArr;
    }

    /* JADX INFO: renamed from: b */
    public static int m183b(byte[] bArr) {
        return (bArr[3] << 24) | (bArr[0] & 255) | ((bArr[1] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) | ((bArr[2] << 24) >>> 8);
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m184b(byte[] bArr, int i, int i2) {
        int i3;
        if (bArr == null || i > bArr.length || (i3 = i + i2) > bArr.length || i < 0 || i2 <= 0) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length - i2];
        int i4 = 0;
        for (int i5 = 0; i5 <= i; i5++) {
            bArr2[i5] = bArr[i5];
        }
        for (i3 = i + i2; i3 < bArr.length; i3++) {
            bArr2[i + i4] = bArr[i3];
            i4++;
        }
        return bArr2;
    }
}
