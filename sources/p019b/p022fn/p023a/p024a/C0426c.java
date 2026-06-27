package p019b.p022fn.p023a.p024a;

import com.github.megatronking.stringfog.xor.StringFogImpl;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPrivateKey;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipInputStream;
import p019b.p022fn.p023a.p024a.C0425b;

/* JADX INFO: renamed from: b.fn.a.a.c */
/* JADX INFO: loaded from: classes.dex */
public class C0426c {

    /* JADX INFO: renamed from: d */
    private static final String[] f480d = {"manifest.mf", ".sf", ".rsa", ".dsa", ".ec"};

    /* JADX INFO: renamed from: a */
    private RSAPrivateKey f481a;

    /* JADX INFO: renamed from: b */
    private File f482b;

    /* JADX INFO: renamed from: c */
    private String f483c = "CERT";

    public C0426c(File file, File file2) {
        this.f482b = file;
        this.f481a = C0428e.m407b(file2);
    }

    /* JADX INFO: renamed from: a */
    public void m399a(InputStream inputStream, OutputStream outputStream) throws NoSuchAlgorithmException, IOException {
        C0425b c0425b = new C0425b();
        C0427d c0427d = new C0427d(c0425b, "SHA1");
        ZipInputStream zipInputStream = new ZipInputStream(inputStream);
        C0429f c0429fM408a = C0429f.m408a(outputStream, 4);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
        while (true) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry == null) {
                c0429fM408a.putNextEntry(new ZipEntry("META-INF/MANIFEST.MF"));
                c0429fM408a.write(c0425b.m394a().getBytes(StringFogImpl.CHARSET_NAME_UTF_8));
                c0429fM408a.closeEntry();
                c0429fM408a.putNextEntry(new ZipEntry(String.format("META-INF/%s.SF", this.f483c)));
                c0429fM408a.write(c0427d.m401a().getBytes(StringFogImpl.CHARSET_NAME_UTF_8));
                c0429fM408a.closeEntry();
                c0429fM408a.putNextEntry(new ZipEntry(String.format("META-INF/%s.RSA", this.f483c)));
                c0429fM408a.write(C0428e.m404a(this.f482b));
                c0429fM408a.write(C0428e.m405a("SHA1", this.f481a, c0427d.m401a().getBytes(StringFogImpl.CHARSET_NAME_UTF_8)));
                c0429fM408a.closeEntry();
                zipInputStream.close();
                c0429fM408a.close();
                return;
            }
            if (!nextEntry.isDirectory()) {
                if (nextEntry.getName().toLowerCase().startsWith("meta-inf/")) {
                    for (String str : f480d) {
                        if (nextEntry.getName().toLowerCase().endsWith(str)) {
                            break;
                        }
                    }
                }
                messageDigest.reset();
                DigestInputStream digestInputStream = new DigestInputStream(zipInputStream, messageDigest);
                ZipEntry zipEntry = new ZipEntry(nextEntry.getName());
                zipEntry.setMethod(nextEntry.getMethod());
                if (nextEntry.getMethod() == 0) {
                    zipEntry.setSize(nextEntry.getSize());
                    zipEntry.setCompressedSize(nextEntry.getSize());
                    zipEntry.setCrc(nextEntry.getCrc());
                }
                c0429fM408a.m409a(zipEntry.getName().endsWith(".so") ? 4096 : 4);
                try {
                    c0429fM408a.putNextEntry(zipEntry);
                    C0428e.m403a(digestInputStream, c0429fM408a);
                    c0429fM408a.closeEntry();
                    zipInputStream.closeEntry();
                    C0425b.a aVar = new C0425b.a();
                    aVar.m398a("Name", nextEntry.getName());
                    aVar.m398a("SHA1-Digest", C0428e.m402a(messageDigest.digest()));
                    c0425b.m395a(aVar);
                } catch (ZipException unused) {
                    c0429fM408a.closeEntry();
                }
            }
        }
    }
}
