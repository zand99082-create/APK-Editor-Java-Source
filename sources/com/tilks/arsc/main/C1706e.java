package com.tilks.arsc.main;

import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.appcompat.C0327R;
import com.android.apksig.apk.ApkUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import p000a.p001a.p009fn.p011b.C0069a;
import p000a.p001a.p009fn.p011b.C0071c;
import p019b.p022fn.p023a.p024a.C0426c;
import p019b.p022fn.p023a.p025b.p033b.C0447a;
import p019b.p022fn.p040c.p041a.C0456b;
import p019b.p022fn.p040c.p041a.C0457c;
import p019b.p022fn.p040c.p041a.p042d.C0460c;
import p019b.p022fn.p040c.p041a.p045f.C0475a;

/* JADX INFO: renamed from: com.tilks.arsc.main.e */
/* JADX INFO: loaded from: classes.dex */
public class C1706e {

    /* JADX INFO: renamed from: a */
    private List<String> f5118a;

    /* JADX INFO: renamed from: b */
    private String f5119b;

    /* JADX INFO: renamed from: c */
    private String f5120c;

    /* JADX INFO: renamed from: d */
    private C0460c f5121d;

    /* JADX INFO: renamed from: e */
    private C0460c f5122e;

    /* JADX INFO: renamed from: f */
    private C1705d f5123f;

    /* JADX INFO: renamed from: g */
    private PendingIntent f5124g;

    /* JADX INFO: renamed from: h */
    private MergeService f5125h;

    /* JADX INFO: renamed from: i */
    private String f5126i;

    /* JADX INFO: renamed from: j */
    private String f5127j;

    public C1706e(String str, List<String> list, PendingIntent pendingIntent, MergeService mergeService, String str2, String str3) {
        this.f5119b = str;
        this.f5118a = list;
        this.f5124g = pendingIntent;
        this.f5125h = mergeService;
        this.f5126i = str2;
        this.f5127j = str3;
    }

    /* JADX INFO: renamed from: a */
    private static void m4120a(File file) throws IOException {
        if (file.delete()) {
            return;
        }
        throw new IOException("Failed to delete " + file.getPath());
    }

    /* JADX INFO: renamed from: a */
    private void m4121a(File file, ZipOutputStream zipOutputStream) throws IOException {
        ZipEntry zipEntry = new ZipEntry(file.getName());
        zipEntry.setMethod(0);
        zipEntry.setSize(file.length());
        zipEntry.setCompressedSize(-1L);
        zipEntry.setTime(0L);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        zipEntry.setCrc(C0475a.m553a(bufferedInputStream).getValue());
        zipOutputStream.putNextEntry(zipEntry);
        bufferedInputStream.close();
        BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
        C0447a.m483a(bufferedInputStream2, zipOutputStream);
        bufferedInputStream2.close();
        zipOutputStream.closeEntry();
    }

    /* JADX INFO: renamed from: a */
    private void m4122a(ZipInputStream zipInputStream, ZipOutputStream zipOutputStream, boolean z) throws PendingIntent.CanceledException, IOException {
        this.f5124g.send(this.f5125h, 200, new Intent().putExtra("result", String.format("[*] Edit base manifest%n", new Object[0])));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C0447a.m483a(zipInputStream, byteArrayOutputStream);
        C0069a.f205d.f191a = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        if (z) {
            C0071c.m187a("application", "false", "extractNativeLibs");
        }
        C0071c.m187a("application", "true", "isSplitRequired");
        C0071c.m186a("meta-data", "com.android.vending.splits.required");
        C0071c.m186a("meta-data", "com.android.vending.splits");
        C0071c.m186a("meta-data", "com.android.vending.derived.apk.id");
        ZipEntry zipEntry = new ZipEntry(ApkUtils.ANDROID_MANIFEST_ZIP_ENTRY_NAME);
        zipEntry.setTime(0L);
        zipOutputStream.putNextEntry(zipEntry);
        zipOutputStream.write(C0069a.f205d.f191a);
        zipOutputStream.closeEntry();
    }

    /* JADX INFO: renamed from: a */
    private void m4123a(ZipInputStream zipInputStream, boolean z, int i) throws IOException {
        File file = new File(this.f5119b, "_resources.arsc");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        C0447a.m483a(zipInputStream, fileOutputStream);
        fileOutputStream.flush();
        fileOutputStream.close();
        C0456b c0456b = new C0456b(file);
        C0460c c0460cM536f = c0456b.m536f();
        if (c0460cM536f == null) {
            c0456b.m509a();
            return;
        }
        if (this.f5123f == null) {
            this.f5123f = new C1705d();
        }
        this.f5123f.m4119a(this.f5121d, c0460cM536f, z, i);
        if (c0460cM536f.f598b.f587a.f593c > 0) {
            this.f5118a.add(String.format("!!! html styles in string !!!%n", new Object[0]));
        }
        c0456b.m509a();
    }

    /* JADX INFO: renamed from: b */
    private static void m4124b(File file) throws IOException {
        if (file == null || !file.exists()) {
            return;
        }
        m4120a(file);
    }

    /* JADX INFO: renamed from: a */
    public C0456b m4125a(InputStream inputStream, ZipOutputStream zipOutputStream, boolean z) {
        ZipInputStream zipInputStream = new ZipInputStream(inputStream);
        C0456b c0456b = null;
        while (true) {
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    zipInputStream.close();
                    return c0456b;
                }
                if (nextEntry.getName().equals("resources.arsc")) {
                    String str = "base_resources.arsc";
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(this.f5119b, z ? "base_resources.arsc" : "_resources.arsc"));
                    C0447a.m483a(zipInputStream, fileOutputStream);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    String str2 = this.f5119b;
                    if (!z) {
                        str = "_resources.arsc";
                    }
                    c0456b = new C0456b(new File(str2, str));
                    if (z) {
                        this.f5121d = c0456b.m536f();
                    } else {
                        this.f5122e = c0456b.m536f();
                    }
                } else if (z) {
                    ZipEntry zipEntry = new ZipEntry(nextEntry);
                    zipEntry.setCompressedSize(-1L);
                    zipOutputStream.putNextEntry(zipEntry);
                    C0447a.m483a(zipInputStream, zipOutputStream);
                    zipOutputStream.closeEntry();
                }
                zipInputStream.closeEntry();
            } finally {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x007c, code lost:
    
        if (r9 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007e, code lost:
    
        java.util.Collections.sort(r8);
        r7.f5120c = (java.lang.String) r8.get(r8.size() - 1);
        r7.f5124g.send(r7.f5125h, 200, new android.content.Intent().putExtra("result", java.lang.String.format("[*] last base dex: -> %s%n", r7.f5120c)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b0, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b3, code lost:
    
        return r2;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0456b m4126a(InputStream inputStream, boolean z) {
        ZipInputStream zipInputStream = new ZipInputStream(inputStream);
        try {
            ArrayList arrayList = new ArrayList();
            C0456b c0456b = null;
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    break;
                }
                String name = nextEntry.getName();
                if (name.equals("resources.arsc")) {
                    String str = "base_resources.arsc";
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(this.f5119b, z ? "base_resources.arsc" : "_module_resources.arsc"));
                    C0447a.m483a(zipInputStream, fileOutputStream);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    String str2 = this.f5119b;
                    if (!z) {
                        str = "_module_resources.arsc";
                    }
                    c0456b = new C0456b(new File(str2, str));
                    if (z) {
                        C0460c c0460cM536f = c0456b.m536f();
                        this.f5121d = c0460cM536f;
                        if (c0460cM536f == null) {
                            zipInputStream.close();
                            return null;
                        }
                    } else {
                        C0460c c0460cM536f2 = c0456b.m536f();
                        this.f5122e = c0460cM536f2;
                        if (c0460cM536f2 == null) {
                            zipInputStream.close();
                            return null;
                        }
                    }
                } else if (name.startsWith("classes") && name.endsWith(".dex") && z) {
                    arrayList.add(name);
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    zipInputStream.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public String m4127a(String str) {
        File file = new File(str);
        Pattern patternCompile = Pattern.compile("((.*)config(.*))|((.*)split(.*))");
        Enumeration<? extends ZipEntry> enumerationEntries = new ZipFile(file).entries();
        String str2 = null;
        boolean z = false;
        while (enumerationEntries.hasMoreElements()) {
            String name = enumerationEntries.nextElement().getName();
            if (name.endsWith(".apk") && !patternCompile.matcher(name).matches()) {
                if (z) {
                    return null;
                }
                this.f5124g.send(this.f5125h, 200, new Intent().putExtra("result", String.format("BaseName: -> %s%n%n", name)));
                str2 = name;
                z = true;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: a */
    public void m4128a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f5119b + File.separator + "base_resources.arsc");
        arrayList.add(this.f5119b + File.separator + "_resources.arsc");
        arrayList.add(this.f5119b + File.separator + "_module_resources.arsc");
        arrayList.add(this.f5119b + File.separator + "resources.arsc");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                m4124b(new File((String) it.next()));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m4129a(int i) {
        C1705d c1705d = new C1705d();
        this.f5123f = c1705d;
        c1705d.m4118a(this.f5121d, this.f5122e, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x011c A[Catch: all -> 0x0138, TRY_LEAVE, TryCatch #1 {all -> 0x0138, blocks: (B:3:0x0015, B:5:0x001b, B:10:0x002c, B:11:0x002f, B:12:0x0033, B:17:0x0040, B:19:0x0048, B:21:0x0050, B:47:0x0115, B:49:0x011c, B:25:0x005d, B:30:0x006e, B:34:0x0094, B:36:0x009a, B:38:0x00a0, B:40:0x00cf, B:42:0x00f9, B:41:0x00f2, B:44:0x0103, B:46:0x010b), top: B:65:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x002f A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m4130a(InputStream inputStream, ZipOutputStream zipOutputStream, ArrayList<String> arrayList, boolean z, boolean z2, int i, boolean z3) {
        String str;
        ZipEntry zipEntry;
        ZipInputStream zipInputStream = new ZipInputStream(inputStream);
        while (true) {
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    zipInputStream.close();
                    return;
                }
                String name = nextEntry.getName();
                if (name.equals(ApkUtils.ANDROID_MANIFEST_ZIP_ENTRY_NAME)) {
                    if (z && !z2) {
                        m4122a(zipInputStream, zipOutputStream, z3);
                    }
                } else if (name.startsWith("META-INF/")) {
                    if ((z || z2) && !name.equalsIgnoreCase("META-INF/CERT.RSA") && !name.equalsIgnoreCase("META-INF/CERT.SF") && !name.equalsIgnoreCase("META-INF/MANIFEST.MF")) {
                        if (arrayList.indexOf(name) != -1) {
                            ZipEntry zipEntry2 = new ZipEntry(nextEntry);
                            zipEntry2.setCompressedSize(-1L);
                            zipOutputStream.putNextEntry(zipEntry2);
                            C0447a.m483a(zipInputStream, zipOutputStream);
                            arrayList.add(name);
                            zipOutputStream.closeEntry();
                        }
                    }
                } else if (!name.equals("resources.arsc")) {
                    if (z && z2) {
                        if (name.startsWith("classes") && name.endsWith(".dex")) {
                            this.f5124g.send(this.f5125h, 200, new Intent().putExtra("result", String.format("   -> %s in split%n", name)));
                            int iLastIndexOf = this.f5120c.lastIndexOf(C0327R.styleable.AppCompatTheme_switchStyle);
                            int iLastIndexOf2 = this.f5120c.lastIndexOf(46);
                            int i2 = iLastIndexOf + 1;
                            if (i2 != iLastIndexOf2) {
                                str = "classes" + (Integer.parseInt(this.f5120c.substring(i2, iLastIndexOf2)) + 1) + ".dex";
                                zipEntry = new ZipEntry(str);
                            } else {
                                str = "classes2.dex";
                                zipEntry = new ZipEntry("classes2.dex");
                            }
                            this.f5120c = str;
                            ZipEntry zipEntry3 = zipEntry;
                            name = str;
                            nextEntry = zipEntry3;
                        }
                    } else if (z3 && name.startsWith("lib/")) {
                        nextEntry = new ZipEntry(name);
                        nextEntry.setMethod(8);
                    }
                    if (arrayList.indexOf(name) != -1) {
                    }
                } else if (!z) {
                    this.f5124g.send(this.f5125h, 200, new Intent().putExtra("result", String.format("[*] Merged arsc %s%n", name)));
                    m4123a(zipInputStream, z2, i);
                }
                zipInputStream.closeEntry();
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m4131a(ZipOutputStream zipOutputStream) {
        File file = new File(this.f5119b, "resources.arsc");
        C0457c c0457c = new C0457c(file);
        c0457c.m549a(this.f5121d);
        c0457c.m509a();
        m4121a(file, zipOutputStream);
    }

    /* JADX INFO: renamed from: a */
    public void m4132a(byte[] bArr) {
        new C1703b(this.f5121d, this.f5122e, this.f5124g, this.f5125h).m4102a(bArr);
    }

    /* JADX INFO: renamed from: a */
    public void m4133a(byte[] bArr, BufferedOutputStream bufferedOutputStream) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        new C0426c(new File(this.f5126i), new File(this.f5127j)).m399a(byteArrayInputStream, bufferedOutputStream);
        byteArrayInputStream.close();
    }
}
