package com.gmail.heagoo.apkeditor;

import android.content.Context;
import android.support.v4.os.EnvironmentCompat;
import androidx.versionedparcelable.InterfaceC0404d;
import com.android.apksig.apk.ApkUtils;
import com.gmail.heagoo.common.C1559h;
import com.gmail.heagoo.p084a.p089c.C1067a;
import jadx.core.deobf.Deobfuscator;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import org.apache.commons.p106io.FilenameUtils;
import org.xmlpull.v1.XmlSerializer;
import p000a.p001a.C0000a;
import p000a.p001a.p003b.p004a.C0031e;
import p000a.p001a.p003b.p004a.C0032f;
import p000a.p001a.p003b.p004a.C0033g;
import p000a.p001a.p003b.p004a.C0036j;
import p000a.p001a.p003b.p006b.C0049g;
import p000a.p001a.p003b.p006b.C0052j;
import p000a.p001a.p003b.p006b.C0054l;
import p000a.p001a.p003b.p007c.C0057a;
import p000a.p001a.p003b.p008d.InterfaceC0059a;
import p000a.p013c.C0077e;
import p000a.p013c.C0078f;
import p000a.p013c.InterfaceC0076d;
import p000a.p014d.C0086f;
import p000a.p014d.C0088h;

/* JADX INFO: loaded from: classes.dex */
public final class ApkDecoderMine implements InterfaceC0404d {

    /* JADX INFO: renamed from: a */
    private C1067a f2880a;

    /* JADX INFO: renamed from: b */
    private C1394ix f2881b;

    /* JADX INFO: renamed from: f */
    private byte[] f2885f;

    /* JADX INFO: renamed from: g */
    private byte[] f2886g;

    /* JADX INFO: renamed from: i */
    private boolean f2888i;

    /* JADX INFO: renamed from: j */
    private static final String[] f2878j = {"classes.dex", ApkUtils.ANDROID_MANIFEST_ZIP_ENTRY_NAME, "resources.arsc"};

    /* JADX INFO: renamed from: k */
    private static final String[] f2879k = {"res", "r", "R", "lib", "libs", "assets", "kotlin"};
    private static final Pattern NO_COMPRESS_PATTERN = Pattern.compile("(jpg|jpeg|png|gif|wav|mp2|mp3|ogg|aac|mpg|mpeg|mid|midi|smf|jet|rtttl|imy|xmf|mp4|m4a|m4v|3gp|3gpp|3g2|3gpp2|amr|awb|wma|wmv|webm|webp|mkv)$");

    /* JADX INFO: renamed from: c */
    private C0054l f2882c = new C0054l();

    /* JADX INFO: renamed from: d */
    private String f2883d = "";

    /* JADX INFO: renamed from: e */
    private boolean f2884e = false;

    /* JADX INFO: renamed from: h */
    private Map f2887h = new HashMap();

    public ApkDecoderMine(C1067a c1067a, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        boolean z = false;
        this.f2880a = c1067a;
        this.f2885f = bArr;
        this.f2886g = bArr2;
        if (bArr2 == null && bArr == null) {
            z = true;
        }
        this.f2888i = z;
        Set setM2566a = this.f2880a.m2566a();
        this.f2881b = new C1394ix(this, (setM2566a == null || setM2566a.isEmpty()) ? null : (C0031e) setM2566a.iterator().next());
        this.f2882c.m143a("xml", this.f2881b);
        this.f2882c.m143a("9path", new C0049g());
        this.f2882c.m143a("raw", new C0052j());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:50:0x0127
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    private void m2624a(p000a.p001a.p003b.p007c.C0057a r17, p000a.p013c.InterfaceC0076d r18) {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gmail.heagoo.apkeditor.ApkDecoderMine.m2624a(a.a.b.c.a, a.c.d):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00bf  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m2625a(InterfaceC0076d interfaceC0076d, String str, InterfaceC0076d interfaceC0076d2, String str2, String str3) throws Throwable {
        OutputStream outputStreamMo200c;
        InputStream inputStreamMo198b = null;
        boolean z = true;
        if ("xml".equals(str3) && !str2.endsWith(".xml")) {
            str2 = str2 + ".xml";
        }
        Closeable closeable = null;
        try {
            try {
                try {
                    if (this.f2888i || !"raw".equals(str3) || "".equals(this.f2883d)) {
                        z = false;
                        outputStreamMo200c = null;
                    } else if (str2.endsWith(".jpg")) {
                        outputStreamMo200c = interfaceC0076d2.mo200c(str2);
                        outputStreamMo200c.write(this.f2886g);
                    } else if (str2.endsWith(".png") && !str2.endsWith(".9.png")) {
                        outputStreamMo200c = interfaceC0076d2.mo200c(str2);
                        outputStreamMo200c.write(this.f2885f);
                    }
                    if (!z) {
                        inputStreamMo198b = interfaceC0076d.mo198b(str);
                        outputStreamMo200c = interfaceC0076d2.mo200c(str2);
                        this.f2882c.m142a(inputStreamMo198b, outputStreamMo200c, str3);
                    }
                    String str4 = "res/" + str2;
                    String str5 = this.f2883d + str;
                    if (!str4.equals(str5)) {
                        this.f2887h.put(str4, str5);
                    }
                    m2626a(inputStreamMo198b);
                    m2626a(outputStreamMo200c);
                } catch (Exception e) {
                    e = e;
                    throw new C0000a(e);
                }
            } catch (Throwable th) {
                th = th;
                m2626a((Closeable) null);
                m2626a(closeable);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
        } catch (Throwable th2) {
            th = th2;
            closeable = null;
            m2626a((Closeable) null);
            m2626a(closeable);
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m2626a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m2627a(File file) throws C0000a {
        for (C0031e c0031e : this.f2880a.m2566a()) {
            if (this.f2884e) {
                return;
            }
            try {
                File file2 = new File(file, "values/public.xml");
                if (!file2.getParentFile().exists()) {
                    file2.getParentFile().mkdirs();
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
                outputStreamWriter.write("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n");
                outputStreamWriter.write("<resources>\n");
                for (C0032f c0032f : c0031e.m44a()) {
                    outputStreamWriter.write(String.format("<public type=\"%s\" name=\"%s\" id=\"0x%08x\" />\n", c0032f.m69h().m80a(), c0032f.m67f(), Integer.valueOf(c0032f.m66e().f64b)));
                }
                outputStreamWriter.write("</resources>");
                outputStreamWriter.close();
                fileOutputStream.close();
            } catch (IOException e) {
                throw new C0000a("Could not generate public.xml file", e);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m2628a(String str) {
        String[] strArr = f2878j;
        for (int i = 0; i < 3; i++) {
            if (strArr[i].equals(str)) {
                return true;
            }
        }
        String[] strArr2 = f2879k;
        for (int i2 = 0; i2 < 7; i2++) {
            if (str.startsWith(strArr2[i2] + "/")) {
                return true;
            }
        }
        return str.endsWith(".dex") && !str.contains("/");
    }

    /* JADX INFO: renamed from: b */
    private void m2629b(C0057a c0057a, File file) throws C0000a {
        File file2 = new File(file, EnvironmentCompat.MEDIA_UNKNOWN);
        try {
            InterfaceC0076d interfaceC0076dM158a = c0057a.m158a();
            Collection collectionValues = this.f2887h.values();
            for (String str : interfaceC0076dM158a.mo193a(true)) {
                if (!m2628a(str) && !collectionValues.contains(str)) {
                    interfaceC0076dM158a.mo196a(file2, str);
                }
            }
        } catch (C0077e e) {
            throw new C0000a(e);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m2630b(File file) throws IOException {
        for (C0031e c0031e : this.f2880a.m2566a()) {
            if (this.f2884e) {
                return;
            }
            for (C0036j c0036j : c0031e.m52c()) {
                if (!this.f2884e) {
                    String strM85a = c0036j.m85a();
                    int iLastIndexOf = strM85a.lastIndexOf(47);
                    if (iLastIndexOf != -1) {
                        File file2 = new File(file, strM85a.substring(0, iLastIndexOf));
                        if (!file2.exists()) {
                            file2.mkdirs();
                        }
                    }
                    XmlSerializer c0088h = new C0088h();
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(file, strM85a));
                    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
                    c0088h.setOutput(outputStreamWriter);
                    outputStreamWriter.write("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n");
                    outputStreamWriter.write("<resources>\n");
                    for (C0033g c0033g : c0036j.m87b()) {
                        if (!c0036j.m86a(c0033g)) {
                            Object objM75d = c0033g.m75d();
                            if (objM75d instanceof InterfaceC0059a) {
                                try {
                                    ((InterfaceC0059a) objM75d).mo1a(c0088h, c0033g);
                                } catch (Throwable th) {
                                    th.printStackTrace();
                                }
                            }
                            c0088h.flush();
                            outputStreamWriter.write("\n");
                        }
                    }
                    outputStreamWriter.write("</resources>\n");
                    outputStreamWriter.close();
                    fileOutputStream.close();
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private static void m2631c(C0057a c0057a, File file) throws C0000a {
        try {
            InterfaceC0076d interfaceC0076dM158a = c0057a.m158a();
            if (interfaceC0076dM158a.mo197a("assets")) {
                interfaceC0076dM158a.mo196a(file, "assets");
            }
            if (interfaceC0076dM158a.mo197a("lib")) {
                interfaceC0076dM158a.mo196a(file, "lib");
            }
            if (interfaceC0076dM158a.mo197a("libs")) {
                interfaceC0076dM158a.mo196a(file, "libs");
            }
            if (interfaceC0076dM158a.mo197a("kotlin")) {
                interfaceC0076dM158a.mo196a(file, "kotlin");
            }
            for (String str : interfaceC0076dM158a.mo193a(false)) {
                if (str.endsWith(".dex")) {
                    interfaceC0076dM158a.mo196a(file, str);
                }
            }
        } catch (C0077e e) {
            throw new C0000a(e);
        }
    }

    /* JADX INFO: renamed from: d */
    private String m2632d(C0057a c0057a, File file) throws Throwable {
        InputStream inputStreamMo198b;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            inputStreamMo198b = c0057a.m158a().mo198b(ApkUtils.ANDROID_MANIFEST_ZIP_ENTRY_NAME);
        } catch (Exception e) {
            e = e;
            fileOutputStream = null;
            inputStreamMo198b = null;
        } catch (Throwable th) {
            th = th;
            inputStreamMo198b = null;
        }
        try {
            fileOutputStream = new FileOutputStream(new File(file, ApkUtils.ANDROID_MANIFEST_ZIP_ENTRY_NAME));
            try {
                try {
                    this.f2881b.m3452b(inputStreamMo198b, fileOutputStream);
                    try {
                        inputStreamMo198b.close();
                    } catch (Exception e2) {
                    }
                    try {
                        fileOutputStream.close();
                    } catch (Exception e3) {
                    }
                } catch (Exception e4) {
                    e = e4;
                    e.printStackTrace();
                    try {
                        inputStreamMo198b.close();
                    } catch (Exception e5) {
                    }
                    try {
                        fileOutputStream.close();
                    } catch (Exception e6) {
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream2 = fileOutputStream;
                try {
                    inputStreamMo198b.close();
                } catch (Exception e7) {
                }
                try {
                    fileOutputStream2.close();
                    throw th;
                } catch (Exception e8) {
                    throw th;
                }
            }
        } catch (Exception e9) {
            e = e9;
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            inputStreamMo198b.close();
            fileOutputStream2.close();
            throw th;
        }
        return null;
    }

    private String extension(String str, InterfaceC0076d interfaceC0076d) {
        int iLastIndexOf = str.lastIndexOf(Deobfuscator.CLASS_NAME_SEPARATOR);
        if (iLastIndexOf != -1 && !this.f2883d.equalsIgnoreCase("r/")) {
            return str.endsWith(".9.png") ? ".9.png" : str.substring(iLastIndexOf).toLowerCase();
        }
        byte[] bArr = new byte[4];
        String lowerCase = iLastIndexOf > 0 ? str.substring(iLastIndexOf).toLowerCase() : "";
        try {
            InputStream inputStreamMo198b = interfaceC0076d.mo198b(str);
            if (inputStreamMo198b.read(bArr) != bArr.length) {
                return lowerCase;
            }
            inputStreamMo198b.close();
            return (bArr[0] == 3 && bArr[1] == 0 && bArr[2] == 8 && bArr[3] == 0) ? ".xml" : ((bArr[0] & 255) == 255 && (bArr[1] & 255) == 216 && (bArr[2] & 255) == 255 && (bArr[3] & 255) == 224) ? ".jpg" : (bArr[0] == 82 && bArr[1] == 73 && bArr[2] == 70 && bArr[3] == 70) ? ".webp" : ((bArr[0] & 255) == 137 && bArr[1] == 80 && bArr[2] == 78 && bArr[3] == 71) ? is9patch(interfaceC0076d, str) ? ".9.png" : ".png" : lowerCase;
        } catch (C0077e | IOException e) {
            e.printStackTrace();
            return lowerCase;
        }
    }

    private boolean find9patchChunk(C0086f c0086f) {
        try {
            c0086f.skipBytes(8);
            while (true) {
                int i = c0086f.readInt();
                if (c0086f.readInt() == 1852855395) {
                    return true;
                }
                c0086f.skipBytes(i + 4);
            }
        } catch (EOFException e) {
            return false;
        }
    }

    private boolean is9patch(InterfaceC0076d interfaceC0076d, String str) {
        try {
            InputStream inputStreamMo198b = interfaceC0076d.mo198b(str);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            C1067a.m2506b(inputStreamMo198b, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            inputStreamMo198b.close();
            if (byteArray.length == 0) {
                return false;
            }
            return find9patchChunk(new C0086f(new ByteArrayInputStream(byteArray)));
        } catch (IOException e) {
            return false;
        }
    }

    private static boolean isRes(String str) {
        String[] strArr = f2879k;
        for (int i = 0; i < 3; i++) {
            if (str.startsWith(strArr[i] + "/")) {
                return true;
            }
        }
        return false;
    }

    private static boolean isStd(String str) {
        String[] strArr = f2878j;
        for (int i = 0; i < 3; i++) {
            if (strArr[i].equals(str)) {
                return true;
            }
        }
        return str.endsWith(".dex");
    }

    /* JADX INFO: renamed from: a */
    public final Map m2633a() {
        return this.f2887h;
    }

    /* JADX INFO: renamed from: a */
    public final void m2634a(C0057a c0057a, File file) {
        if (!c0057a.m158a().mo197a("res")) {
            this.f2881b.m3451a(true);
        }
        if (!this.f2884e) {
            m2632d(c0057a, file);
        }
        try {
            C1559h.m3770a(new File(file.getPath() + "/res"));
        } catch (Exception e) {
        }
        new StringBuilder().append(file.getPath()).append("/res deleted!");
        File file2 = new File(file, "res");
        if (!file2.exists()) {
            file2.mkdirs();
        }
        if (!this.f2884e) {
            m2624a(c0057a, new C0078f(file2));
        }
        if (!this.f2884e) {
            m2630b(file2);
        }
        if (!this.f2884e) {
            m2627a(file2);
            recordUncompressedFiles(c0057a);
        }
        if (this.f2888i) {
            if (!this.f2884e) {
                m2631c(c0057a, file);
            }
            if (this.f2884e) {
                return;
            }
            m2629b(c0057a, file);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2635b() {
        this.f2884e = true;
    }

    public void recordUncompressedFiles(C0057a c0057a) {
        String extension;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f2887h.entrySet()) {
            map.put((String) entry.getValue(), (String) entry.getKey());
        }
        try {
            InterfaceC0076d interfaceC0076dM158a = c0057a.m158a();
            for (String str : interfaceC0076dM158a.mo193a(true)) {
                if (interfaceC0076dM158a.getCompressionLevel(str) == 0 && interfaceC0076dM158a.getSize(str) > 0) {
                    String str2 = (String) map.get(str);
                    if (str2 != null) {
                        extension = FilenameUtils.getExtension(str2);
                        str = str2;
                    } else {
                        extension = FilenameUtils.getExtension(str);
                    }
                    if (!NO_COMPRESS_PATTERN.matcher(extension).find()) {
                        if (extension.isEmpty()) {
                        }
                        if (!isStd(str)) {
                            if (isRes(str)) {
                                hashSet.add(str);
                            } else {
                                hashSet2.add(str);
                            }
                        }
                    }
                }
            }
            if (hashSet.isEmpty() && hashSet2.isEmpty()) {
                return;
            }
            String strM2525d = C1067a.m2525d((Context) null, "tmp");
            if (!hashSet.isEmpty()) {
                C1067a.m2487a(strM2525d + "aaptUncString", hashSet);
            }
            if (hashSet2.isEmpty()) {
                return;
            }
            C1067a.m2487a(strM2525d + "mdUncString", hashSet2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
