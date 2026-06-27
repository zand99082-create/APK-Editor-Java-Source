package p019b.p022fn.p023a.p024a;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;

/* JADX INFO: renamed from: b.fn.a.a.e */
/* JADX INFO: loaded from: classes.dex */
public class C0428e {
    /* JADX INFO: renamed from: a */
    static String m402a(byte[] bArr) {
        return C0424a.m391b(bArr, 0);
    }

    /* JADX INFO: renamed from: a */
    static void m403a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[1048576];
        while (true) {
            int i = inputStream.read(bArr);
            if (i <= 0) {
                return;
            } else {
                outputStream.write(bArr, 0, i);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    static byte[] m404a(File file) throws IOException {
        byte[] bArr = new byte[(int) file.length()];
        FileInputStream fileInputStream = new FileInputStream(file);
        fileInputStream.read(bArr);
        fileInputStream.close();
        return bArr;
    }

    /* JADX INFO: renamed from: a */
    static byte[] m405a(String str, PrivateKey privateKey, byte[] bArr) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        Signature signature = Signature.getInstance(str + "withRSA");
        signature.initSign(privateKey);
        signature.update(bArr);
        return signature.sign();
    }

    /* JADX INFO: renamed from: a */
    static byte[] m406a(byte[] bArr, String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(bArr);
        return messageDigest.digest();
    }

    /* JADX INFO: renamed from: b */
    static RSAPrivateKey m407b(File file) {
        return (RSAPrivateKey) KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(m404a(file)));
    }
}
