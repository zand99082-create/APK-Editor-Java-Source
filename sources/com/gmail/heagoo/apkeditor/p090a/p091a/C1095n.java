package com.gmail.heagoo.apkeditor.p090a.p091a;

import android.content.Context;
import com.gmail.heagoo.apkeditor.p090a.InterfaceC1108d;
import com.gmail.heagoo.apkeditor.p090a.InterfaceC1110f;
import com.gmail.heagoo.p084a.p089c.C1067a;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.zip.Adler32;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: com.gmail.heagoo.apkeditor.a.a.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1095n implements InterfaceC1108d, Serializable {

    /* JADX INFO: renamed from: a */
    private String f3193a;

    public C1095n(String str) {
        this.f3193a = str;
    }

    @Override // com.gmail.heagoo.apkeditor.p090a.InterfaceC1108d
    /* JADX INFO: renamed from: a */
    public final void mo2954a(Context context, String str, Map map, InterfaceC1110f interfaceC1110f) throws IOException {
        String str2 = C1067a.m2525d(context, "tmp") + "_dex";
        RandomAccessFile randomAccessFile = new RandomAccessFile(str2, "rw");
        randomAccessFile.setLength(0L);
        ZipFile zipFile = new ZipFile(str);
        InputStream inputStream = zipFile.getInputStream(zipFile.getEntry("classes.dex"));
        byte[] bArr = new byte[559000];
        int i = 0;
        while (true) {
            int i2 = inputStream.read(bArr, i, 559000 - i);
            if (i2 <= 0) {
                System.arraycopy(this.f3193a.getBytes(), 0, bArr, 401438, this.f3193a.length());
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                    messageDigest.update(bArr, 32, i - 32);
                    try {
                        messageDigest.digest(bArr, 12, 20);
                        Adler32 adler32 = new Adler32();
                        adler32.update(bArr, 12, i - 12);
                        int value = (int) adler32.getValue();
                        bArr[8] = (byte) value;
                        bArr[9] = (byte) (value >> 8);
                        bArr[10] = (byte) (value >> 16);
                        bArr[11] = (byte) (value >>> 24);
                        randomAccessFile.write(bArr, 0, i);
                        inputStream.close();
                        zipFile.close();
                        randomAccessFile.close();
                        map.put("classes.dex", str2);
                        return;
                    } catch (DigestException e) {
                        throw new RuntimeException(e);
                    }
                } catch (NoSuchAlgorithmException e2) {
                    throw new RuntimeException(e2);
                }
            }
            i += i2;
        }
    }
}
