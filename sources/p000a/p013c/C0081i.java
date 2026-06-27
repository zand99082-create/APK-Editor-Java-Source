package p000a.p013c;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: a.c.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0081i extends AbstractC0073a {

    /* JADX INFO: renamed from: c */
    private ZipFile f219c;

    /* JADX INFO: renamed from: d */
    private String f220d;

    public C0081i(File file) {
        this(file, "");
    }

    private C0081i(File file, String str) throws C0077e {
        try {
            this.f219c = new ZipFile(file);
            this.f220d = str;
        } catch (IOException e) {
            throw new C0077e(e);
        }
    }

    private C0081i(ZipFile zipFile, String str) {
        this.f219c = zipFile;
        this.f220d = str;
    }

    /* JADX INFO: renamed from: c */
    private void m209c() {
        String strSubstring;
        this.f212a = new LinkedHashSet();
        this.f213b = new LinkedHashMap();
        int length = this.f220d.length();
        Enumeration<? extends ZipEntry> enumerationEntries = this.f219c.entries();
        while (enumerationEntries.hasMoreElements()) {
            ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
            String name = zipEntryNextElement.getName();
            if (!name.equals(this.f220d) && name.startsWith(this.f220d)) {
                String strSubstring2 = name.substring(length);
                int iIndexOf = strSubstring2.indexOf(47);
                if (iIndexOf != -1) {
                    strSubstring = strSubstring2.substring(0, iIndexOf);
                } else if (zipEntryNextElement.isDirectory()) {
                    strSubstring = strSubstring2;
                } else {
                    this.f212a.add(strSubstring2);
                }
                if (!this.f213b.containsKey(strSubstring)) {
                    this.f213b.put(strSubstring, new C0081i(this.f219c, this.f220d + strSubstring + '/'));
                }
            }
        }
    }

    private ZipEntry getZipFileEntry(String str) {
        return this.f219c.getEntry(str);
    }

    @Override // p000a.p013c.AbstractC0073a
    /* JADX INFO: renamed from: a */
    protected final void mo194a() {
        m209c();
    }

    @Override // p000a.p013c.AbstractC0073a
    /* JADX INFO: renamed from: b */
    protected final void mo199b() {
        m209c();
    }

    @Override // p000a.p013c.AbstractC0073a
    /* JADX INFO: renamed from: f */
    protected final InputStream mo203f(String str) throws C0080h {
        try {
            return this.f219c.getInputStream(new ZipEntry(this.f220d + str));
        } catch (IOException e) {
            throw new C0080h(str, e);
        }
    }

    @Override // p000a.p013c.AbstractC0073a
    /* JADX INFO: renamed from: g */
    protected final OutputStream mo204g(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // p000a.p013c.InterfaceC0076d
    public int getCompressionLevel(String str) {
        return getZipFileEntry(str).getMethod();
    }

    @Override // p000a.p013c.InterfaceC0076d
    public long getSize(String str) {
        return getZipFileEntry(str).getSize();
    }

    @Override // p000a.p013c.AbstractC0073a
    /* JADX INFO: renamed from: h */
    protected final AbstractC0073a mo205h(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // p000a.p013c.AbstractC0073a
    /* JADX INFO: renamed from: i */
    protected final void mo206i(String str) {
        throw new UnsupportedOperationException();
    }
}
