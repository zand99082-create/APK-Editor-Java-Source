package com.p046a.p049b.p050a.p054d;

import com.gmail.heagoo.p084a.p089c.C1067a;
import jadx.core.deobf.Deobfuscator;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: com.a.b.a.d.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0575d {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0580i f951a = new C0576e();

    /* JADX INFO: renamed from: b */
    private final String f952b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC0579h f953c;

    /* JADX INFO: renamed from: d */
    private final boolean f954d = false;

    /* JADX INFO: renamed from: e */
    private InterfaceC0580i f955e;

    public C0575d(String str, boolean z, InterfaceC0580i interfaceC0580i, InterfaceC0579h interfaceC0579h) {
        this.f952b = str;
        this.f953c = interfaceC0579h;
        this.f955e = interfaceC0580i;
    }

    /* JADX INFO: renamed from: a */
    private boolean m989a(File file) throws IOException {
        boolean zMo995a;
        ZipFile zipFile = new ZipFile(file);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(40000);
        byte[] bArr = new byte[20000];
        ArrayList<ZipEntry> list = Collections.list(zipFile.entries());
        if (this.f954d) {
            Collections.sort(list, new C0578g(this));
        }
        this.f953c.mo993a(file);
        boolean z = false;
        for (ZipEntry zipEntry : list) {
            if (!zipEntry.isDirectory()) {
                String name = zipEntry.getName();
                if (this.f955e.mo992a(name)) {
                    InputStream inputStream = zipFile.getInputStream(zipEntry);
                    byteArrayOutputStream.reset();
                    while (true) {
                        int i = inputStream.read(bArr);
                        if (i < 0) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, i);
                    }
                    inputStream.close();
                    zMo995a = this.f953c.mo995a(name, zipEntry.getTime(), byteArrayOutputStream.toByteArray()) | z;
                } else {
                    zMo995a = z;
                }
                z = zMo995a;
            }
        }
        zipFile.close();
        return z;
    }

    /* JADX INFO: renamed from: a */
    private boolean m990a(File file, boolean z) {
        try {
            if (!file.isDirectory()) {
                String path = file.getPath();
                if (path.endsWith(".zip") || path.endsWith(".jar") || path.endsWith(".apk")) {
                    return m989a(file);
                }
                if (!this.f955e.mo992a(path)) {
                    return false;
                }
                return this.f953c.mo995a(path, file.lastModified(), C1067a.m2513b(file));
            }
            if (z) {
                file = new File(file, Deobfuscator.CLASS_NAME_SEPARATOR);
            }
            File[] fileArrListFiles = file.listFiles();
            int length = fileArrListFiles.length;
            if (this.f954d) {
                Arrays.sort(fileArrListFiles, new C0577f(this));
            }
            int i = 0;
            boolean z2 = false;
            while (i < length) {
                boolean zM990a = m990a(fileArrListFiles[i], false) | z2;
                i++;
                z2 = zM990a;
            }
            return z2;
        } catch (Exception e) {
            this.f953c.mo994a(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m991a() {
        return m990a(new File(this.f952b), true);
    }
}
