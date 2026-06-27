package jadx.core.utils.files;

import com.p046a.p047a.C0492i;
import jadx.core.utils.AsmUtils;
import jadx.core.utils.exceptions.DecodeException;
import jadx.core.utils.exceptions.JadxException;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.jar.JarOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.p117d.C1799c;
import org.p117d.InterfaceC1790b;

/* JADX INFO: loaded from: classes.dex */
public class InputFile {
    private static final InterfaceC1790b LOG = C1799c.m4223a(InputFile.class);
    private final C0492i dexBuf;
    private final int dexIndex;
    private final File file;
    public int nextDexIndex;

    public InputFile(File file) {
        this(file, 0);
    }

    public InputFile(File file, int i) throws IOException {
        this.nextDexIndex = -1;
        if (!file.exists()) {
            throw new IOException("File not found: " + file.getAbsolutePath());
        }
        this.dexIndex = i;
        this.file = file;
        this.dexBuf = loadDexBuffer();
    }

    private C0492i loadDexBuffer() throws IOException, DecodeException {
        String name = this.file.getName();
        if (name.endsWith(".dex")) {
            return new C0492i(this.file);
        }
        if (name.endsWith(".class")) {
            return loadFromClassFile(this.file);
        }
        if (name.endsWith(".apk") || name.endsWith(".zip")) {
            C0492i c0492iLoadFromZip = loadFromZip(this, this.file);
            if (c0492iLoadFromZip == null) {
                throw new IOException("File 'classes.dex' not found in file: " + this.file);
            }
            return c0492iLoadFromZip;
        }
        if (!name.endsWith(".jar")) {
            throw new DecodeException("Unsupported input file format: " + this.file);
        }
        C0492i c0492iLoadFromZip2 = loadFromZip(this, this.file);
        return c0492iLoadFromZip2 == null ? loadFromJar(this.file) : c0492iLoadFromZip2;
    }

    private static C0492i loadFromClassFile(File file) throws Throwable {
        JarOutputStream jarOutputStream;
        FileOutputStream fileOutputStream = null;
        File fileCreateTempFile = File.createTempFile("jadx-tmp-", System.nanoTime() + ".jar");
        fileCreateTempFile.deleteOnExit();
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(fileCreateTempFile);
            try {
                jarOutputStream = new JarOutputStream(fileOutputStream2);
                try {
                    String nameFromClassFile = AsmUtils.getNameFromClassFile(file);
                    if (nameFromClassFile == null) {
                        throw new IOException("Can't read class name from file: " + file);
                    }
                    FileUtils.addFileToJar(jarOutputStream, file, nameFromClassFile + ".class");
                    jarOutputStream.close();
                    fileOutputStream2.close();
                    return loadFromJar(fileCreateTempFile);
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (jarOutputStream != null) {
                        jarOutputStream.close();
                    }
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                jarOutputStream = null;
                fileOutputStream = fileOutputStream2;
            }
        } catch (Throwable th3) {
            th = th3;
            jarOutputStream = null;
        }
    }

    private static C0492i loadFromJar(File file) throws DecodeException {
        try {
            LOG.mo4198b("converting to dex: {} ...", file.getName());
            JavaToDex javaToDex = new JavaToDex();
            byte[] bArrConvert = javaToDex.convert(file.getAbsolutePath());
            if (bArrConvert.length == 0) {
                throw new JadxException(javaToDex.isError() ? javaToDex.getDxErrors() : "Empty dx output");
            }
            if (javaToDex.isError()) {
                LOG.mo4203c("dx message: {}", javaToDex.getDxErrors());
            }
            return new C0492i(bArrConvert);
        } catch (Throwable th) {
            throw new DecodeException("java class to dex conversion error:\n " + th.getMessage(), th);
        }
    }

    /* JADX WARN: Finally extract failed */
    private static C0492i loadFromZip(InputFile inputFile, File file) throws IOException {
        InputStream inputStream = null;
        ZipFile zipFile = new ZipFile(file);
        String str = "classes.dex";
        String str2 = "classes2.dex";
        if (inputFile.dexIndex != 0) {
            str = "classes" + inputFile.dexIndex + ".dex";
            str2 = "classes" + (inputFile.dexIndex + 1) + ".dex";
        }
        ZipEntry entry = zipFile.getEntry(str);
        if (entry == null) {
            zipFile.close();
            return null;
        }
        try {
            if (zipFile.getEntry(str2) != null) {
                inputFile.nextDexIndex = inputFile.dexIndex == 0 ? 2 : inputFile.dexIndex + 1;
            }
        } catch (Exception e) {
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            inputStream = zipFile.getInputStream(entry);
            byte[] bArr = new byte[8192];
            while (true) {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
            if (inputStream != null) {
                inputStream.close();
            }
            zipFile.close();
            return new C0492i(byteArrayOutputStream.toByteArray());
        } catch (Throwable th) {
            if (inputStream != null) {
                inputStream.close();
            }
            zipFile.close();
            throw th;
        }
    }

    public C0492i getDexBuffer() {
        return this.dexBuf;
    }

    public File getFile() {
        return this.file;
    }

    public String toString() {
        return this.file.toString();
    }
}
